package com.example.backuptest06.vm.common.controller;
import com.example.backuptest06.vm.common.utils.TrieTree;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author  Bluple
 * @Description
 * @time 2022102813:58
 */
@RestController
public class readLine2Hash {
    private static final int BYTE_SIZE = 2048 * 10;
    private static final int POOL_NUM = 5;
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {

//        String path = "D:\\Graduate's\\HuaWei_balabala\\m-2ze6tciolfdoydrr6ze3_data_xvdb.raw.tar.gz";
//        String destFilePath="D:\\Graduate's\\HuaWei_balabala\\testHash.txt";
//        File file = new File(path);
//        try{
//        // 判断文件是否存在
//        if (file.isFile() && file.exists()){
//            System.out.println("fileExist");
//            InputStreamReader read = new InputStreamReader(new FileInputStream(file), "8859_1");
//            BufferedReader bufferedReader = new BufferedReader(read);
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(destFilePath), "8859_1");
//            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
//            String lineText = null;
//
//            // 按行读取文件并打印,如果需要对内容进行操作可以在这里进行
//            while((lineText = bufferedReader.readLine())!=null){
//                bufferedWriter.write(lineText);
//                bufferedWriter.newLine(); //换行
//            }
//            System.out.println("拷贝完毕");
//        }else{
//            System.out.println("file doesn't exist");
//        }
//    } catch(IOException e){
//        e.printStackTrace();
//    }
        String algorithm="MD5";
        File rFile = new File("D:\\Graduate's\\HuaWei_balabala\\m-2ze6tciolfdoydrr6ze3_data_xvdb.raw.tar.gz");
        String path = "D:\\Graduate's\\HuaWei_balabala\\m-2ze6tciolfdoydrr6ze3_data_xvdb.raw.tar.gz";
//        File rFile = new File("D:\\Graduate's\\HuaWei_balabala\\ttt.txt");
//        String path = "D:\\Graduate's\\HuaWei_balabala\\ttt.txt";
        String newPath="D:\\Graduate's\\HuaWei_balabala\\test.txt";
        long size = rFile.length();
//        long blockSize = size / POOL_NUM;
//        long remainingSize = size % POOL_NUM;
        FileInputStream in =new FileInputStream(path);
        int byteread = 0;
        byte[] digested=null;

        MessageDigest digest = MessageDigest.getInstance(algorithm);
        RandomAccessFile randRFile = new RandomAccessFile(rFile, "r");
        byte[] bytes = new byte[BYTE_SIZE];
        System.out.println(size/BYTE_SIZE);

        TrieTree Tree1 = new TrieTree();
        TrieTree Tree2 = new TrieTree();


        // 读入多个字节到字节数组中，byteread为一次读入的字节数
        FileOutputStream fos = new FileOutputStream(newPath);
        int i;
        for(i=0;i<=size/BYTE_SIZE;i++){
            randRFile.seek(i*BYTE_SIZE);
            if((int)size-i*BYTE_SIZE>=BYTE_SIZE)
                randRFile.read(bytes,0,BYTE_SIZE);
            else
                randRFile.read(bytes,0,(int)size-i*BYTE_SIZE);
            digest.update(bytes);
            //完成哈希摘要计算并返回特征值
            digested = digest.digest();
            String cacheKey;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < digested.length; j++) {
                String hex = Integer.toHexString(0xFF & digested[j]);//进制转化
                if (hex.length() == 1) {
                    sb.append('0');
                }
                sb.append(hex);
            }
            cacheKey=sb.toString();
            fos.write(cacheKey.getBytes());
            fos.write("\n".getBytes());
            System.out.println(cacheKey);
            Tree1.insertKeyword(cacheKey,bytes.toString());
        }
        fos.flush();
        fos.close();
    }


}

