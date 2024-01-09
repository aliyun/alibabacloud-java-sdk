// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeServerResponseBody extends TeaModel {
    @NameInMap("AgentPort")
    public Integer agentPort;

    @NameInMap("AgentVersion")
    public String agentVersion;

    @NameInMap("Alias")
    public String alias;

    @NameInMap("Code")
    public String code;

    @NameInMap("ConnectionStatus")
    public String connectionStatus;

    @NameInMap("Consistent")
    public Boolean consistent;

    @NameInMap("Cpu")
    public Integer cpu;

    @NameInMap("CrashConsistentPointPolicy")
    public String crashConsistentPointPolicy;

    @NameInMap("Disks")
    public String disks;

    @NameInMap("Errno")
    public String errno;

    @NameInMap("FullSyncCurrentSize")
    public Long fullSyncCurrentSize;

    @NameInMap("FullSyncProgress")
    public Integer fullSyncProgress;

    @NameInMap("FullSyncStartTime")
    public Long fullSyncStartTime;

    @NameInMap("FullSyncTotalSize")
    public Long fullSyncTotalSize;

    @NameInMap("Hostname")
    public String hostname;

    @NameInMap("IncrementalSyncStartTime")
    public Long incrementalSyncStartTime;

    @NameInMap("IpAddress")
    public String ipAddress;

    @NameInMap("LatestRecoveryPointTime")
    public String latestRecoveryPointTime;

    @NameInMap("Memory")
    public Long memory;

    @NameInMap("Message")
    public String message;

    @NameInMap("Operations")
    public String operations;

    @NameInMap("OriginalInstanceId")
    public String originalInstanceId;

    @NameInMap("OsDetail")
    public String osDetail;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("PrimarySiteId")
    public String primarySiteId;

    @NameInMap("RecoveredInstanceId")
    public String recoveredInstanceId;

    @NameInMap("RecoveredIpAddress")
    public String recoveredIpAddress;

    @NameInMap("RecoveryCpu")
    public Integer recoveryCpu;

    @NameInMap("RecoveryEssdPerformanceLevel")
    public String recoveryEssdPerformanceLevel;

    @NameInMap("RecoveryInstanceName")
    public String recoveryInstanceName;

    @NameInMap("RecoveryInstanceType")
    public String recoveryInstanceType;

    @NameInMap("RecoveryIpAddress")
    public String recoveryIpAddress;

    @NameInMap("RecoveryMemory")
    public Long recoveryMemory;

    @NameInMap("RecoveryNetwork")
    public String recoveryNetwork;

    @NameInMap("RecoveryPostScriptContent")
    public String recoveryPostScriptContent;

    @NameInMap("RecoveryPostScriptType")
    public String recoveryPostScriptType;

    @NameInMap("RecoveryReserveIp")
    public Boolean recoveryReserveIp;

    @NameInMap("RecoveryUseDhcp")
    public Boolean recoveryUseDhcp;

    @NameInMap("RecoveryUseEssd")
    public Boolean recoveryUseEssd;

    @NameInMap("RecoveryUseSsd")
    public Boolean recoveryUseSsd;

    @NameInMap("ReplicationInfrastructureId")
    public String replicationInfrastructureId;

    @NameInMap("ReplicationInfrastructureType")
    public String replicationInfrastructureType;

    @NameInMap("ReplicationNetwork")
    public String replicationNetwork;

    /**
     * <p>-</p>
     */
    @NameInMap("ReplicationUseDhcp")
    public Boolean replicationUseDhcp;

    @NameInMap("ReplicationUseEssd")
    public Boolean replicationUseEssd;

    @NameInMap("ReplicationUseOriginalInstance")
    public Boolean replicationUseOriginalInstance;

    @NameInMap("ReplicationUseSsd")
    public Boolean replicationUseSsd;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Rpo")
    public Integer rpo;

    @NameInMap("SecondarySiteId")
    public String secondarySiteId;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("SourceGatewayVersion")
    public String sourceGatewayVersion;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TargetGatewayVersion")
    public String targetGatewayVersion;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TestFailoverStatus")
    public String testFailoverStatus;

    @NameInMap("TestRecoveredInstanceId")
    public String testRecoveredInstanceId;

    @NameInMap("TestRecoveredInstanceName")
    public String testRecoveredInstanceName;

    @NameInMap("TestRecoveredIpAddress")
    public String testRecoveredIpAddress;

    public static DescribeServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServerResponseBody self = new DescribeServerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServerResponseBody setAgentPort(Integer agentPort) {
        this.agentPort = agentPort;
        return this;
    }
    public Integer getAgentPort() {
        return this.agentPort;
    }

    public DescribeServerResponseBody setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }
    public String getAgentVersion() {
        return this.agentVersion;
    }

    public DescribeServerResponseBody setAlias(String alias) {
        this.alias = alias;
        return this;
    }
    public String getAlias() {
        return this.alias;
    }

    public DescribeServerResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeServerResponseBody setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }
    public String getConnectionStatus() {
        return this.connectionStatus;
    }

    public DescribeServerResponseBody setConsistent(Boolean consistent) {
        this.consistent = consistent;
        return this;
    }
    public Boolean getConsistent() {
        return this.consistent;
    }

    public DescribeServerResponseBody setCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }
    public Integer getCpu() {
        return this.cpu;
    }

    public DescribeServerResponseBody setCrashConsistentPointPolicy(String crashConsistentPointPolicy) {
        this.crashConsistentPointPolicy = crashConsistentPointPolicy;
        return this;
    }
    public String getCrashConsistentPointPolicy() {
        return this.crashConsistentPointPolicy;
    }

    public DescribeServerResponseBody setDisks(String disks) {
        this.disks = disks;
        return this;
    }
    public String getDisks() {
        return this.disks;
    }

    public DescribeServerResponseBody setErrno(String errno) {
        this.errno = errno;
        return this;
    }
    public String getErrno() {
        return this.errno;
    }

    public DescribeServerResponseBody setFullSyncCurrentSize(Long fullSyncCurrentSize) {
        this.fullSyncCurrentSize = fullSyncCurrentSize;
        return this;
    }
    public Long getFullSyncCurrentSize() {
        return this.fullSyncCurrentSize;
    }

    public DescribeServerResponseBody setFullSyncProgress(Integer fullSyncProgress) {
        this.fullSyncProgress = fullSyncProgress;
        return this;
    }
    public Integer getFullSyncProgress() {
        return this.fullSyncProgress;
    }

    public DescribeServerResponseBody setFullSyncStartTime(Long fullSyncStartTime) {
        this.fullSyncStartTime = fullSyncStartTime;
        return this;
    }
    public Long getFullSyncStartTime() {
        return this.fullSyncStartTime;
    }

    public DescribeServerResponseBody setFullSyncTotalSize(Long fullSyncTotalSize) {
        this.fullSyncTotalSize = fullSyncTotalSize;
        return this;
    }
    public Long getFullSyncTotalSize() {
        return this.fullSyncTotalSize;
    }

    public DescribeServerResponseBody setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public DescribeServerResponseBody setIncrementalSyncStartTime(Long incrementalSyncStartTime) {
        this.incrementalSyncStartTime = incrementalSyncStartTime;
        return this;
    }
    public Long getIncrementalSyncStartTime() {
        return this.incrementalSyncStartTime;
    }

    public DescribeServerResponseBody setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }
    public String getIpAddress() {
        return this.ipAddress;
    }

    public DescribeServerResponseBody setLatestRecoveryPointTime(String latestRecoveryPointTime) {
        this.latestRecoveryPointTime = latestRecoveryPointTime;
        return this;
    }
    public String getLatestRecoveryPointTime() {
        return this.latestRecoveryPointTime;
    }

    public DescribeServerResponseBody setMemory(Long memory) {
        this.memory = memory;
        return this;
    }
    public Long getMemory() {
        return this.memory;
    }

    public DescribeServerResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeServerResponseBody setOperations(String operations) {
        this.operations = operations;
        return this;
    }
    public String getOperations() {
        return this.operations;
    }

    public DescribeServerResponseBody setOriginalInstanceId(String originalInstanceId) {
        this.originalInstanceId = originalInstanceId;
        return this;
    }
    public String getOriginalInstanceId() {
        return this.originalInstanceId;
    }

    public DescribeServerResponseBody setOsDetail(String osDetail) {
        this.osDetail = osDetail;
        return this;
    }
    public String getOsDetail() {
        return this.osDetail;
    }

    public DescribeServerResponseBody setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public DescribeServerResponseBody setPrimarySiteId(String primarySiteId) {
        this.primarySiteId = primarySiteId;
        return this;
    }
    public String getPrimarySiteId() {
        return this.primarySiteId;
    }

    public DescribeServerResponseBody setRecoveredInstanceId(String recoveredInstanceId) {
        this.recoveredInstanceId = recoveredInstanceId;
        return this;
    }
    public String getRecoveredInstanceId() {
        return this.recoveredInstanceId;
    }

    public DescribeServerResponseBody setRecoveredIpAddress(String recoveredIpAddress) {
        this.recoveredIpAddress = recoveredIpAddress;
        return this;
    }
    public String getRecoveredIpAddress() {
        return this.recoveredIpAddress;
    }

    public DescribeServerResponseBody setRecoveryCpu(Integer recoveryCpu) {
        this.recoveryCpu = recoveryCpu;
        return this;
    }
    public Integer getRecoveryCpu() {
        return this.recoveryCpu;
    }

    public DescribeServerResponseBody setRecoveryEssdPerformanceLevel(String recoveryEssdPerformanceLevel) {
        this.recoveryEssdPerformanceLevel = recoveryEssdPerformanceLevel;
        return this;
    }
    public String getRecoveryEssdPerformanceLevel() {
        return this.recoveryEssdPerformanceLevel;
    }

    public DescribeServerResponseBody setRecoveryInstanceName(String recoveryInstanceName) {
        this.recoveryInstanceName = recoveryInstanceName;
        return this;
    }
    public String getRecoveryInstanceName() {
        return this.recoveryInstanceName;
    }

    public DescribeServerResponseBody setRecoveryInstanceType(String recoveryInstanceType) {
        this.recoveryInstanceType = recoveryInstanceType;
        return this;
    }
    public String getRecoveryInstanceType() {
        return this.recoveryInstanceType;
    }

    public DescribeServerResponseBody setRecoveryIpAddress(String recoveryIpAddress) {
        this.recoveryIpAddress = recoveryIpAddress;
        return this;
    }
    public String getRecoveryIpAddress() {
        return this.recoveryIpAddress;
    }

    public DescribeServerResponseBody setRecoveryMemory(Long recoveryMemory) {
        this.recoveryMemory = recoveryMemory;
        return this;
    }
    public Long getRecoveryMemory() {
        return this.recoveryMemory;
    }

    public DescribeServerResponseBody setRecoveryNetwork(String recoveryNetwork) {
        this.recoveryNetwork = recoveryNetwork;
        return this;
    }
    public String getRecoveryNetwork() {
        return this.recoveryNetwork;
    }

    public DescribeServerResponseBody setRecoveryPostScriptContent(String recoveryPostScriptContent) {
        this.recoveryPostScriptContent = recoveryPostScriptContent;
        return this;
    }
    public String getRecoveryPostScriptContent() {
        return this.recoveryPostScriptContent;
    }

    public DescribeServerResponseBody setRecoveryPostScriptType(String recoveryPostScriptType) {
        this.recoveryPostScriptType = recoveryPostScriptType;
        return this;
    }
    public String getRecoveryPostScriptType() {
        return this.recoveryPostScriptType;
    }

    public DescribeServerResponseBody setRecoveryReserveIp(Boolean recoveryReserveIp) {
        this.recoveryReserveIp = recoveryReserveIp;
        return this;
    }
    public Boolean getRecoveryReserveIp() {
        return this.recoveryReserveIp;
    }

    public DescribeServerResponseBody setRecoveryUseDhcp(Boolean recoveryUseDhcp) {
        this.recoveryUseDhcp = recoveryUseDhcp;
        return this;
    }
    public Boolean getRecoveryUseDhcp() {
        return this.recoveryUseDhcp;
    }

    public DescribeServerResponseBody setRecoveryUseEssd(Boolean recoveryUseEssd) {
        this.recoveryUseEssd = recoveryUseEssd;
        return this;
    }
    public Boolean getRecoveryUseEssd() {
        return this.recoveryUseEssd;
    }

    public DescribeServerResponseBody setRecoveryUseSsd(Boolean recoveryUseSsd) {
        this.recoveryUseSsd = recoveryUseSsd;
        return this;
    }
    public Boolean getRecoveryUseSsd() {
        return this.recoveryUseSsd;
    }

    public DescribeServerResponseBody setReplicationInfrastructureId(String replicationInfrastructureId) {
        this.replicationInfrastructureId = replicationInfrastructureId;
        return this;
    }
    public String getReplicationInfrastructureId() {
        return this.replicationInfrastructureId;
    }

    public DescribeServerResponseBody setReplicationInfrastructureType(String replicationInfrastructureType) {
        this.replicationInfrastructureType = replicationInfrastructureType;
        return this;
    }
    public String getReplicationInfrastructureType() {
        return this.replicationInfrastructureType;
    }

    public DescribeServerResponseBody setReplicationNetwork(String replicationNetwork) {
        this.replicationNetwork = replicationNetwork;
        return this;
    }
    public String getReplicationNetwork() {
        return this.replicationNetwork;
    }

    public DescribeServerResponseBody setReplicationUseDhcp(Boolean replicationUseDhcp) {
        this.replicationUseDhcp = replicationUseDhcp;
        return this;
    }
    public Boolean getReplicationUseDhcp() {
        return this.replicationUseDhcp;
    }

    public DescribeServerResponseBody setReplicationUseEssd(Boolean replicationUseEssd) {
        this.replicationUseEssd = replicationUseEssd;
        return this;
    }
    public Boolean getReplicationUseEssd() {
        return this.replicationUseEssd;
    }

    public DescribeServerResponseBody setReplicationUseOriginalInstance(Boolean replicationUseOriginalInstance) {
        this.replicationUseOriginalInstance = replicationUseOriginalInstance;
        return this;
    }
    public Boolean getReplicationUseOriginalInstance() {
        return this.replicationUseOriginalInstance;
    }

    public DescribeServerResponseBody setReplicationUseSsd(Boolean replicationUseSsd) {
        this.replicationUseSsd = replicationUseSsd;
        return this;
    }
    public Boolean getReplicationUseSsd() {
        return this.replicationUseSsd;
    }

    public DescribeServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServerResponseBody setRpo(Integer rpo) {
        this.rpo = rpo;
        return this;
    }
    public Integer getRpo() {
        return this.rpo;
    }

    public DescribeServerResponseBody setSecondarySiteId(String secondarySiteId) {
        this.secondarySiteId = secondarySiteId;
        return this;
    }
    public String getSecondarySiteId() {
        return this.secondarySiteId;
    }

    public DescribeServerResponseBody setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DescribeServerResponseBody setSourceGatewayVersion(String sourceGatewayVersion) {
        this.sourceGatewayVersion = sourceGatewayVersion;
        return this;
    }
    public String getSourceGatewayVersion() {
        return this.sourceGatewayVersion;
    }

    public DescribeServerResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeServerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeServerResponseBody setTargetGatewayVersion(String targetGatewayVersion) {
        this.targetGatewayVersion = targetGatewayVersion;
        return this;
    }
    public String getTargetGatewayVersion() {
        return this.targetGatewayVersion;
    }

    public DescribeServerResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeServerResponseBody setTestFailoverStatus(String testFailoverStatus) {
        this.testFailoverStatus = testFailoverStatus;
        return this;
    }
    public String getTestFailoverStatus() {
        return this.testFailoverStatus;
    }

    public DescribeServerResponseBody setTestRecoveredInstanceId(String testRecoveredInstanceId) {
        this.testRecoveredInstanceId = testRecoveredInstanceId;
        return this;
    }
    public String getTestRecoveredInstanceId() {
        return this.testRecoveredInstanceId;
    }

    public DescribeServerResponseBody setTestRecoveredInstanceName(String testRecoveredInstanceName) {
        this.testRecoveredInstanceName = testRecoveredInstanceName;
        return this;
    }
    public String getTestRecoveredInstanceName() {
        return this.testRecoveredInstanceName;
    }

    public DescribeServerResponseBody setTestRecoveredIpAddress(String testRecoveredIpAddress) {
        this.testRecoveredIpAddress = testRecoveredIpAddress;
        return this;
    }
    public String getTestRecoveredIpAddress() {
        return this.testRecoveredIpAddress;
    }

}
