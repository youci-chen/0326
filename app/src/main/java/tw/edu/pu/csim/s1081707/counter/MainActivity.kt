package tw.edu.pu.csim.s1081707.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var counter:Int = 0
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)

        btnHappy.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                counter = (1..100).random()  //亂數
                txv.text = counter.toString()
            }
        })
    }
    fun Add(v: View){
        //if(v.id==R.id.button1)
        if(v==button1) {
            counter++
        }else{
            counter+=2
        }
        txv.text = counter.toString()
    }

    override fun onClick(v: View?) {
        if(v==button4 || v==txv){
            counter++
        }else if(v==button5){
            counter+=2
        }else{
            counter = 0
        }
        txv.text = counter.toString()
    }
}