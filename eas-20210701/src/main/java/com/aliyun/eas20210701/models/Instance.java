// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Instance extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0.444</p>
     */
    @NameInMap("CurrentAmount")
    public Float currentAmount;

    /**
     * <strong>example:</strong>
     * <p>192.168.1.100</p>
     */
    @NameInMap("ExternalIP")
    public String externalIP;

    /**
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("ExternalInstancePort")
    public Integer externalInstancePort;

    @NameInMap("HostIP")
    public String hostIP;

    @NameInMap("HostName")
    public String hostName;

    @NameInMap("InnerIP")
    public String innerIP;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("InstancePort")
    public Integer instancePort;

    /**
     * <strong>example:</strong>
     * <p>ecs.c7.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSpot")
    public Boolean isSpot;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Isolated")
    public Boolean isolated;

    @NameInMap("LastState")
    public java.util.List<java.util.Map<String, ?>> lastState;

    @NameInMap("Namespace")
    public String namespace;

    /**
     * <strong>example:</strong>
     * <p>2.2</p>
     */
    @NameInMap("OriginalAmount")
    public Float originalAmount;

    @NameInMap("ReadyProcesses")
    public Integer readyProcesses;

    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>PublicResource</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RestartCount")
    public Integer restartCount;

    /**
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Role")
    public String role;

    @NameInMap("StartAt")
    @Deprecated
    public String startAt;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>192.168.0.39</p>
     */
    @NameInMap("TenantHostIP")
    public String tenantHostIP;

    /**
     * <strong>example:</strong>
     * <p>192.168.0.39</p>
     */
    @NameInMap("TenantInstanceIP")
    public String tenantInstanceIP;

    @NameInMap("TotalProcesses")
    public Integer totalProcesses;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai-a</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static Instance build(java.util.Map<String, ?> map) throws Exception {
        Instance self = new Instance();
        return TeaModel.build(map, self);
    }

    public Instance setCurrentAmount(Float currentAmount) {
        this.currentAmount = currentAmount;
        return this;
    }
    public Float getCurrentAmount() {
        return this.currentAmount;
    }

    public Instance setExternalIP(String externalIP) {
        this.externalIP = externalIP;
        return this;
    }
    public String getExternalIP() {
        return this.externalIP;
    }

    public Instance setExternalInstancePort(Integer externalInstancePort) {
        this.externalInstancePort = externalInstancePort;
        return this;
    }
    public Integer getExternalInstancePort() {
        return this.externalInstancePort;
    }

    public Instance setHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }
    public String getHostIP() {
        return this.hostIP;
    }

    public Instance setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public Instance setInnerIP(String innerIP) {
        this.innerIP = innerIP;
        return this;
    }
    public String getInnerIP() {
        return this.innerIP;
    }

    public Instance setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public Instance setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    public Integer getInstancePort() {
        return this.instancePort;
    }

    public Instance setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public Instance setIsSpot(Boolean isSpot) {
        this.isSpot = isSpot;
        return this;
    }
    public Boolean getIsSpot() {
        return this.isSpot;
    }

    public Instance setIsolated(Boolean isolated) {
        this.isolated = isolated;
        return this;
    }
    public Boolean getIsolated() {
        return this.isolated;
    }

    public Instance setLastState(java.util.List<java.util.Map<String, ?>> lastState) {
        this.lastState = lastState;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getLastState() {
        return this.lastState;
    }

    public Instance setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public Instance setOriginalAmount(Float originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    public Float getOriginalAmount() {
        return this.originalAmount;
    }

    public Instance setReadyProcesses(Integer readyProcesses) {
        this.readyProcesses = readyProcesses;
        return this;
    }
    public Integer getReadyProcesses() {
        return this.readyProcesses;
    }

    public Instance setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public Instance setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public Instance setRestartCount(Integer restartCount) {
        this.restartCount = restartCount;
        return this;
    }
    public Integer getRestartCount() {
        return this.restartCount;
    }

    public Instance setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public Instance setStartAt(String startAt) {
        this.startAt = startAt;
        return this;
    }
    public String getStartAt() {
        return this.startAt;
    }

    public Instance setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public Instance setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Instance setTenantHostIP(String tenantHostIP) {
        this.tenantHostIP = tenantHostIP;
        return this;
    }
    public String getTenantHostIP() {
        return this.tenantHostIP;
    }

    public Instance setTenantInstanceIP(String tenantInstanceIP) {
        this.tenantInstanceIP = tenantInstanceIP;
        return this;
    }
    public String getTenantInstanceIP() {
        return this.tenantInstanceIP;
    }

    public Instance setTotalProcesses(Integer totalProcesses) {
        this.totalProcesses = totalProcesses;
        return this;
    }
    public Integer getTotalProcesses() {
        return this.totalProcesses;
    }

    public Instance setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
