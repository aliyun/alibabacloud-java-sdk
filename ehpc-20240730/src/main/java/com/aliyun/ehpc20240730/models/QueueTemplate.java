// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class QueueTemplate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PriorityInstanceType</p>
     */
    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    @NameInMap("ComputeNodes")
    public java.util.List<NodeTemplate> computeNodes;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleIn")
    public Boolean enableScaleIn;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleOut")
    public Boolean enableScaleOut;

    /**
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("HostnamePrefix")
    public String hostnamePrefix;

    @NameInMap("HostnameSuffix")
    public String hostnameSuffix;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InitialCount")
    public Integer initialCount;

    /**
     * <strong>example:</strong>
     * <p>erdma</p>
     */
    @NameInMap("InterConnect")
    public String interConnect;

    @NameInMap("KeepAliveNodes")
    public java.util.List<String> keepAliveNodes;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxCount")
    public Integer maxCount;

    /**
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("MaxCountPerCycle")
    public Long maxCountPerCycle;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinCount")
    public Integer minCount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>comp</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <strong>example:</strong>
     * <p>AliyunECSInstanceForEHPCRole</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <strong>example:</strong>
     * <p>rnp-756vlp7a</p>
     */
    @NameInMap("ReservedNodePoolId")
    public String reservedNodePoolId;

    @NameInMap("VSwitchIds")
    public java.util.List<String> vSwitchIds;

    public static QueueTemplate build(java.util.Map<String, ?> map) throws Exception {
        QueueTemplate self = new QueueTemplate();
        return TeaModel.build(map, self);
    }

    public QueueTemplate setAllocationStrategy(String allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }
    public String getAllocationStrategy() {
        return this.allocationStrategy;
    }

    public QueueTemplate setComputeNodes(java.util.List<NodeTemplate> computeNodes) {
        this.computeNodes = computeNodes;
        return this;
    }
    public java.util.List<NodeTemplate> getComputeNodes() {
        return this.computeNodes;
    }

    public QueueTemplate setEnableScaleIn(Boolean enableScaleIn) {
        this.enableScaleIn = enableScaleIn;
        return this;
    }
    public Boolean getEnableScaleIn() {
        return this.enableScaleIn;
    }

    public QueueTemplate setEnableScaleOut(Boolean enableScaleOut) {
        this.enableScaleOut = enableScaleOut;
        return this;
    }
    public Boolean getEnableScaleOut() {
        return this.enableScaleOut;
    }

    public QueueTemplate setHostnamePrefix(String hostnamePrefix) {
        this.hostnamePrefix = hostnamePrefix;
        return this;
    }
    public String getHostnamePrefix() {
        return this.hostnamePrefix;
    }

    public QueueTemplate setHostnameSuffix(String hostnameSuffix) {
        this.hostnameSuffix = hostnameSuffix;
        return this;
    }
    public String getHostnameSuffix() {
        return this.hostnameSuffix;
    }

    public QueueTemplate setInitialCount(Integer initialCount) {
        this.initialCount = initialCount;
        return this;
    }
    public Integer getInitialCount() {
        return this.initialCount;
    }

    public QueueTemplate setInterConnect(String interConnect) {
        this.interConnect = interConnect;
        return this;
    }
    public String getInterConnect() {
        return this.interConnect;
    }

    public QueueTemplate setKeepAliveNodes(java.util.List<String> keepAliveNodes) {
        this.keepAliveNodes = keepAliveNodes;
        return this;
    }
    public java.util.List<String> getKeepAliveNodes() {
        return this.keepAliveNodes;
    }

    public QueueTemplate setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public Integer getMaxCount() {
        return this.maxCount;
    }

    public QueueTemplate setMaxCountPerCycle(Long maxCountPerCycle) {
        this.maxCountPerCycle = maxCountPerCycle;
        return this;
    }
    public Long getMaxCountPerCycle() {
        return this.maxCountPerCycle;
    }

    public QueueTemplate setMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }
    public Integer getMinCount() {
        return this.minCount;
    }

    public QueueTemplate setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public QueueTemplate setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public QueueTemplate setReservedNodePoolId(String reservedNodePoolId) {
        this.reservedNodePoolId = reservedNodePoolId;
        return this;
    }
    public String getReservedNodePoolId() {
        return this.reservedNodePoolId;
    }

    public QueueTemplate setVSwitchIds(java.util.List<String> vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public java.util.List<String> getVSwitchIds() {
        return this.vSwitchIds;
    }

}
