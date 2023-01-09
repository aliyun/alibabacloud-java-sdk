// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosInstanceRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The name of the Nacos instance.
    @NameInMap("ClusterName")
    public String clusterName;

    // Specifies whether to enable the service for the instance.
    @NameInMap("Enabled")
    public Boolean enabled;

    // Specifies whether to mark the instance as a temporary node.
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

    // The name of the group.
    @NameInMap("GroupName")
    public String groupName;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The IP address of the Nacos instance.
    @NameInMap("Ip")
    public String ip;

    // The metadata of the instance.
    @NameInMap("Metadata")
    public String metadata;

    // The ID of the namespace.
    @NameInMap("NamespaceId")
    public String namespaceId;

    // The port of the Nacos instance.
    @NameInMap("Port")
    public Integer port;

    // The name of the service.
    @NameInMap("ServiceName")
    public String serviceName;

    // The weight. Valid values: 0 to 10000. The value must be an integer. A larger value indicates a higher frequency at which the instance is accessed.
    @NameInMap("Weight")
    public String weight;

    public static CreateNacosInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosInstanceRequest self = new CreateNacosInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNacosInstanceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateNacosInstanceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateNacosInstanceRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public CreateNacosInstanceRequest setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }
    public Boolean getEphemeral() {
        return this.ephemeral;
    }

    public CreateNacosInstanceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateNacosInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateNacosInstanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CreateNacosInstanceRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

    public CreateNacosInstanceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateNacosInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateNacosInstanceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public CreateNacosInstanceRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

}
