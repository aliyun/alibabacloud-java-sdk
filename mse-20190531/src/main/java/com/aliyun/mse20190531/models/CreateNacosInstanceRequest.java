// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateNacosInstanceRequest extends TeaModel {
    // Nacos集群名
    @NameInMap("ClusterName")
    public String clusterName;

    // 服务禁用标志
    @NameInMap("Enabled")
    public Boolean enabled;

    // 临时节点标志
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

    // 分组名
    @NameInMap("GroupName")
    public String groupName;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // Nacos实例ip
    @NameInMap("Ip")
    public String ip;

    // 节点元数据
    @NameInMap("Metadata")
    public String metadata;

    // 命名空间id
    @NameInMap("NamespaceId")
    public String namespaceId;

    // Nacos实例端口
    @NameInMap("Port")
    public Integer port;

    // 服务名
    @NameInMap("ServiceName")
    public String serviceName;

    // 权重
    @NameInMap("Weight")
    public String weight;

    public static CreateNacosInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNacosInstanceRequest self = new CreateNacosInstanceRequest();
        return TeaModel.build(map, self);
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
