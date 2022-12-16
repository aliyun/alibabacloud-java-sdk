// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosInstanceRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The name of the instance.
    @NameInMap("ClusterName")
    public String clusterName;

    // Specifies whether the instance is a temporary node. Valid values:
    // 
    // *   `true`: yes
    // *   `false`: no
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

    // The name of the group.
    @NameInMap("GroupName")
    public String groupName;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The IP address of the instance.
    @NameInMap("Ip")
    public String ip;

    // The ID of the namespace.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The port number of the instance.
    @NameInMap("Port")
    public Integer port;

    // The name of the service.
    @NameInMap("ServiceName")
    public String serviceName;

    public static DeleteNacosInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosInstanceRequest self = new DeleteNacosInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNacosInstanceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DeleteNacosInstanceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public DeleteNacosInstanceRequest setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }
    public Boolean getEphemeral() {
        return this.ephemeral;
    }

    public DeleteNacosInstanceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteNacosInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteNacosInstanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DeleteNacosInstanceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public DeleteNacosInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DeleteNacosInstanceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
