package com.example.backuptest06.vm.common.entity;

import java.util.LinkedList;

/**
 * @author
 * @Description
 * @time 2022102817:02
 */
public class Node {
        char content; //装node中的内容
        boolean isEnd; //是否是单词的结尾
        int count;  //这个单词的这个字母下面分支的个数
        LinkedList<Node> childList; //子list
        /**
         * 构造函数
         * @param c 单词的字母
         */
        public Node(char c){
            childList = new LinkedList<Node>();
            isEnd = false;
            content = c;
            count = 0;
        }
        /**
         * 遍历一下这个node中LinkedList中是否有这个字母，有就意味着可以继续查找下去，没有就没有。
         * @param c 单词的字母
         * @return 如果有的话就返回下一个node，没有的话就返回null
         */
        public Node subNode(char c){
            if(childList != null){
                for(Node eachChild : childList){
                    if(eachChild.content == c){
                        return eachChild;
                    }
                }
            }
            return null;
        }
    }