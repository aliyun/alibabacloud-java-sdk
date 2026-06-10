// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class QueueTemplate extends TeaModel {
    /**
     * <p>The auto scale-out policy for the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>PriorityInstanceType</p>
     */
    @NameInMap("AllocationStrategy")
    public String allocationStrategy;

    /**
     * <p>The list of hardware configurations for the compute nodes in the queue. You can specify 0 to 10 configurations.</p>
     */
    @NameInMap("ComputeNodes")
    public java.util.List<NodeTemplate> computeNodes;

    /**
     * <p>Indicates whether to enable auto scale-in for the queue. Valid values:</p>
     * <ul>
     * <li><p>true: enabled</p>
     * </li>
     * <li><p>false: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleIn")
    public Boolean enableScaleIn;

    /**
     * <p>Indicates whether to enable auto scale-out for the queue. Valid values:</p>
     * <ul>
     * <li><p>true: enabled</p>
     * </li>
     * <li><p>false: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableScaleOut")
    public Boolean enableScaleOut;

    /**
     * <p>The hostname prefix of the compute nodes in the queue.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>The prefix can be up to 8 characters in length for Windows operating systems and up to 32 characters in length for Linux operating systems. The prefix can contain only lowercase letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("HostnamePrefix")
    public String hostnamePrefix;

    /**
     * <p>The hostname suffix of the compute nodes in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("HostnameSuffix")
    public String hostnameSuffix;

    /**
     * <p>The initial number of compute nodes in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("InitialCount")
    public Integer initialCount;

    /**
     * <p>The network type of the compute nodes in the queue. Valid values:</p>
     * <ul>
     * <li><p>vpc</p>
     * </li>
     * <li><p>eRDMA</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>erdma</p>
     */
    @NameInMap("InterConnect")
    public String interConnect;

    /**
     * <p>The list of nodes in the queue that have deletion protection enabled.</p>
     */
    @NameInMap("KeepAliveNodes")
    public java.util.List<String> keepAliveNodes;

    /**
     * <p>The maximum number of compute nodes in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxCount")
    public Integer maxCount;

    /**
     * <p>The maximum number of compute nodes that can be scaled out in each cycle.</p>
     * 
     * <strong>example:</strong>
     * <p>99</p>
     */
    @NameInMap("MaxCountPerCycle")
    public Long maxCountPerCycle;

    /**
     * <p>The minimum number of compute nodes in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MinCount")
    public Integer minCount;

    /**
     * <p>The queue name. The name must be 1 to 15 characters long. It can contain letters from the Unicode letter category, such as English letters and digits, and periods (.).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>comp</p>
     */
    @NameInMap("QueueName")
    public String queueName;

    /**
     * <p>The name of the instance role attached to the compute nodes in the queue.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunECSInstanceForEHPCRole</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <p>The ID of the reserved node pool that the queue uses.</p>
     * <blockquote>
     * <p>If this parameter is specified, allocatable nodes from the reserved node pool are used to create compute nodes. The <code>VSwitchIds</code>, <code>HostnamePrefix</code>, and <code>HostnameSuffix</code> parameters are ignored.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rnp-756vlp7a</p>
     */
    @NameInMap("ReservedNodePoolId")
    public String reservedNodePoolId;

    /**
     * <p>A list of virtual switches available to the compute nodes in the queue. You can specify 1 to 5 virtual switches.</p>
     */
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
