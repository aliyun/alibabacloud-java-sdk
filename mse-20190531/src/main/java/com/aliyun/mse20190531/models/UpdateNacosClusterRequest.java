// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateNacosClusterRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("CheckPort")
    public Integer checkPort;

    @NameInMap("ClusterName")
    public String clusterName;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("HealthChecker")
    public String healthChecker;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("UseInstancePortForCheck")
    public Boolean useInstancePortForCheck;

    public static UpdateNacosClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNacosClusterRequest self = new UpdateNacosClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNacosClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
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
