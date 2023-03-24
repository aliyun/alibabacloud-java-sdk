package com.example.backuptest06.vm.common.api.ecs;

import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.CreateImageRequest;
import com.aliyuncs.ecs.model.v20140526.CreateImageResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.example.backuptest06.vm.common.config.AliyunEcsClientConfig ;
import com.google.gson.Gson;
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
 * @Description  创建ECS镜像
 * @time 202209280:34
 */
public class CreateImage {
    public static void main(String[] args) {

        IAcsClient client;
        try {
            client = AliyunEcsClientConfig.createClient();
        } catch (Exception e) {
            throw new RuntimeException("无法创建阿里云客户端", e);
        }
        CreateImageRequest request = new CreateImageRequest();

        try {
            CreateImageResponse response = client.getAcsResponse(request);
            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
}
