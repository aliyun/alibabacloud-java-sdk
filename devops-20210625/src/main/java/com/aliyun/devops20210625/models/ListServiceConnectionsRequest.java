// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListServiceConnectionsRequest extends TeaModel {
    // aliyun_code  阿里云代码 Codeup       Codeup  Gitee        码云 github       Github ack       容器服务Kubernetes(ACK) docker_register_aliyun    容器镜像服务(ACR) ecs          对象存储(OSS) edas          企业级分布式应用(EDAS) emas         移动研发平台(EMAS) fc            阿里云函数计算(FC) kubernetes     自建k8s集群 oss            对象存储(OSS) PACKAGES       制品仓库 ros   资源编排服务(ROS) sae       Serverless应用引擎(SAE)
    @NameInMap("sericeConnectionType")
    public String sericeConnectionType;

    public static ListServiceConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceConnectionsRequest self = new ListServiceConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceConnectionsRequest setSericeConnectionType(String sericeConnectionType) {
        this.sericeConnectionType = sericeConnectionType;
        return this;
    }
    public String getSericeConnectionType() {
        return this.sericeConnectionType;
    }

}
