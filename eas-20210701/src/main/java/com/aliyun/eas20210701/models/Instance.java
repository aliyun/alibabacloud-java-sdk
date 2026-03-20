// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class Instance extends TeaModel {
    /**
     * <p>The current hourly price of the spot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>0.444</p>
     */
    @NameInMap("CurrentAmount")
    public Float currentAmount;

    @NameInMap("Detached")
    public Boolean detached;

    /**
     * <p>The IP address of the instance in the user-created VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.1.100</p>
     */
    @NameInMap("ExternalIP")
    public String externalIP;

    /**
     * <p>The port number of the instance in the user-created VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("ExternalInstancePort")
    public Integer externalInstancePort;

    /**
     * <p>The IP address of the host where the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>11.0.XX.XX</p>
     */
    @NameInMap("HostIP")
    public String hostIP;

    /**
     * <p>The name of the host where the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>smart-scene-cls-854dbdc99d-****</p>
     */
    @NameInMap("HostName")
    public String hostName;

    /**
     * <p>The internal IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>172.17.0.17</p>
     */
    @NameInMap("InnerIP")
    public String innerIP;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>foo-5fc8946767-v****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The network port of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>8080</p>
     */
    @NameInMap("InstancePort")
    public Integer instancePort;

    /**
     * <p>The instance specification.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c7.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("IsLatest")
    public Boolean isLatest;

    @NameInMap("IsReplica")
    public Boolean isReplica;

    /**
     * <p>Indicates whether the instance is a spot instance.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSpot")
    public Boolean isSpot;

    /**
     * <p>Indicates whether the instance is isolated.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Isolated")
    public Boolean isolated;

    /**
     * <p>The last state of the instance.</p>
     */
    @NameInMap("LastState")
    public java.util.List<java.util.Map<String, ?>> lastState;

    /**
     * <p>The namespace of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The original hourly price of the spot instance before a discount is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2.2</p>
     */
    @NameInMap("OriginalAmount")
    public Float originalAmount;

    /**
     * <p>The number of processes that have started for the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ReadyProcesses")
    public Integer readyProcesses;

    /**
     * <p>The reason for which the instance is in the current state.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("Reason")
    public String reason;

    @NameInMap("ReplicaName")
    public String replicaName;

    /**
     * <p>The type of the resource group to which the instance belongs. Valid values: PublicResource and PrivateResource.</p>
     * 
     * <strong>example:</strong>
     * <p>PublicResource</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The number of times for which the instance is restarted.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RestartCount")
    public Integer restartCount;

    /**
     * <p>The service role of the instance. Valid values: Queue, DataLoader, and Standard.</p>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The time when the instance was started. This parameter is deprecated. StartTime is used instead.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-27T09:46:05Z</p>
     */
    @NameInMap("StartAt")
    @Deprecated
    public String startAt;

    /**
     * <p>The time when the instance was started.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-27T09:46:05Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The current state of the instance.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Terminating</li>
     * <li>Succeeded</li>
     * <li>Unknown</li>
     * <li>Failed</li>
     * <li>Running</li>
     * <li>Pending</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IP address of the host in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.xx</p>
     */
    @NameInMap("TenantHostIP")
    public String tenantHostIP;

    /**
     * <p>The IP address of the instance in the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.xx</p>
     */
    @NameInMap("TenantInstanceIP")
    public String tenantInstanceIP;

    /**
     * <p>The total number of processes that the instance contains.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalProcesses")
    public Integer totalProcesses;

    /**
     * <p>The zone to which the instance belongs.</p>
     * 
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

    public Instance setDetached(Boolean detached) {
        this.detached = detached;
        return this;
    }
    public Boolean getDetached() {
        return this.detached;
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

    public Instance setIsLatest(Boolean isLatest) {
        this.isLatest = isLatest;
        return this;
    }
    public Boolean getIsLatest() {
        return this.isLatest;
    }

    public Instance setIsReplica(Boolean isReplica) {
        this.isReplica = isReplica;
        return this;
    }
    public Boolean getIsReplica() {
        return this.isReplica;
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

    public Instance setReplicaName(String replicaName) {
        this.replicaName = replicaName;
        return this;
    }
    public String getReplicaName() {
        return this.replicaName;
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

    @Deprecated
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
