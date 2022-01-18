// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosClusterRequest extends TeaModel {
    // 健康检查端口
    @NameInMap("CheckPort")
    public Integer checkPort;

    // Nacos集群名
    @NameInMap("ClusterName")
    public String clusterName;

    // 分组名
    @NameInMap("GroupName")
    public String groupName;

    // 健康检查类型
    @NameInMap("HealthChecker")
    public String healthChecker;

    // 实例id
    @NameInMap("InstanceId")
    public String instanceId;

    // 命名空间id
    @NameInMap("NamespaceId")
    public String namespaceId;

    // 服务名
    @NameInMap("ServiceName")
    public String serviceName;

    // 是否使用实例端口进行健康检查
    @NameInMap("UseInstancePortForCheck")
    public Boolean useInstancePortForCheck;

    public static UpdateNacosClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosClusterRequest self = new UpdateNacosClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacosClusterRequest setCheckPort(Integer checkPort) {
        this.checkPort = checkPort;
        return this;
    }
    public Integer getCheckPort() {
        return this.checkPort;
    }

    public UpdateNacosClusterRequest setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public UpdateNacosClusterRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateNacosClusterRequest setHealthChecker(String healthChecker) {
        this.healthChecker = healthChecker;
        return this;
    }
    public String getHealthChecker() {
        return this.healthChecker;
    }

    public UpdateNacosClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateNacosClusterRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNacosClusterRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateNacosClusterRequest setUseInstancePortForCheck(Boolean useInstancePortForCheck) {
        this.useInstancePortForCheck = useInstancePortForCheck;
        return this;
    }
    public Boolean getUseInstancePortForCheck() {
        return this.useInstancePortForCheck;
    }

}
