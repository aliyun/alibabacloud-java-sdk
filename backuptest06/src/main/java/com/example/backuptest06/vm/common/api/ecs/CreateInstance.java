package com.example.backuptest06.vm.common.api.ecs;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.CreateInstanceRequest;
import com.aliyuncs.ecs.model.v20140526.CreateInstanceResponse;
import com.aliyuncs.profile.DefaultProfile;
import com.example.backuptest06.vm.common.config.AliyunEcsClientConfig;
import com.google.gson.Gson;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
/*
pom.xml
<dependency>
  <groupId>com.aliyun</groupId>
  <artifactId>aliyun-java-sdk-core</artifactId>
  <version>4.6.0</version>
</dependency>
*/

/**
 * @author
 * @Description
 * @time 2022101811:06
 */
public class CreateInstance {

    //    public static void main(String[] args) {
        public String startCreateInstance(){
            IAcsClient client;
            try {
                client = AliyunEcsClientConfig.createClient();
            } catch (Exception e) {
                throw new RuntimeException("无法创建阿里云客户端", e);
            }
            CreateInstanceRequest request = new CreateInstanceRequest();
            request.setInstanceType("ecs.g6.large");
            request.setImageId("ubuntu_20_04_x64_20G_alibase_20220824.vhd");
            try {
                CreateInstanceResponse response = client.getAcsResponse(request);
                System.out.println(new Gson().toJson(response));
                return response.getInstanceId();
            } catch (ServerException e) {
                e.printStackTrace();
                return null;
            } catch (ClientException e) {
                System.out.println("ErrCode:" + e.getErrCode());
                System.out.println("ErrMsg:" + e.getErrMsg());
                System.out.println("RequestId:" + e.getRequestId());
                return null;
            }

        }
    }
