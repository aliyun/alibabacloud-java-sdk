// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosInstanceRequest extends TeaModel {
    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 服务名
    @NameInMap("ServiceName")
    public String serviceName;

    // 分组名
    @NameInMap("GroupName")
    public String groupName;

    // 命名空间id
    @NameInMap("NamespaceId")
    public String namespaceId;

    // Nacos集群名
    @NameInMap("ClusterName")
    public String clusterName;

    // Nacos实例ip
    @NameInMap("Ip")
    public String ip;

    // Nacos实例端口
    @NameInMap("Port")
    public Integer port;

    // 临时节点标志
    @NameInMap("Ephemeral")
    public Boolean ephemeral;

    // 权重
    @NameInMap("Weight")
    public String weight;

    // 服务禁用标志
    @NameInMap("Enabled")
    public Boolean enabled;

    // 节点元数据
    @NameInMap("Metadata")
    public String metadata;

    public static UpdateNacosInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosInstanceRequest self = new UpdateNacosInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacosInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNacosInstanceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateNacosInstanceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateNacosInstanceRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNacosInstanceRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateNacosInstanceRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public UpdateNacosInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public UpdateNacosInstanceRequest setEphemeral(Boolean ephemeral) {
        this.ephemeral = ephemeral;
        return this;
    }
    public Boolean getEphemeral() {
        return this.ephemeral;
    }

    public UpdateNacosInstanceRequest setWeight(String weight) {
        this.weight = weight;
        return this;
    }
    public String getWeight() {
        return this.weight;
    }

    public UpdateNacosInstanceRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateNacosInstanceRequest setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }
    public String getMetadata() {
        return this.metadata;
    }

}
