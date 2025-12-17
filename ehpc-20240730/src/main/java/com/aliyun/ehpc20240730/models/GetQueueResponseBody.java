// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetQueueResponseBody extends TeaModel {
    /**
     * <p>The queue configurations.</p>
     */
    @NameInMap("Queue")
    public GetQueueResponseBodyQueue queue;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueueResponseBody self = new GetQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueueResponseBody setQueue(GetQueueResponseBodyQueue queue) {
        this.queue = queue;
        return this;
    }
    public GetQueueResponseBodyQueue getQueue() {
        return this.queue;
    }

    public GetQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetQueueResponseBodyQueue extends TeaModel {
        /**
         * <p>The auto scale-out policy of the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>PriorityInstanceType</p>
         */
        @NameInMap("AllocationStrategy")
        public String allocationStrategy;

        /**
         * <p>The hardware configurations of the compute nodes in the queue.</p>
         */
        @NameInMap("ComputeNodes")
        public java.util.List<NodeTemplate> computeNodes;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01T12:05:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether auto scale-in is enabled for the queue. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableScaleIn")
        public Boolean enableScaleIn;

        /**
         * <p>Indicates whether auto scale-out is enabled for the queue. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableScaleOut")
        public Boolean enableScaleOut;

        /**
         * <p>The hostname prefix of the compute nodes in the queue.</p>
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
         * <p>The initial number of nodes in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InitialCount")
        public Integer initialCount;

        /**
         * <p>The type of the network between compute nodes in the queue. Valid values:</p>
         * <ul>
         * <li>vpc</li>
         * <li>eRDMA</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>erdma</p>
         */
        @NameInMap("InterConnect")
        public String interConnect;

        /**
         * <p>The nodes for which deletion protection is enabled in the queue.</p>
         */
        @NameInMap("KeepAliveNodes")
        public java.util.List<String> keepAliveNodes;

        /**
         * <p>The maximum number of compute nodes that the queue can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxCount")
        public Integer maxCount;

        /**
         * <p>The minimum number of nodes that are delivered to the queue in each scale-out cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("MaxCountPerCycle")
        public Long maxCountPerCycle;

        /**
         * <p>The minimum number of compute nodes that the queue must contain.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinCount")
        public Integer minCount;

        /**
         * <p>The queue name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>comp</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The Resource Access Management (RAM) role that is assumed by compute nodes in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunECSInstanceForEHPCRole</p>
         */
        @NameInMap("RamRole")
        public String ramRole;

        /**
         * <p>Preset node pool ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rnp-756vlp7a</p>
         */
        @NameInMap("ReservedNodePoolId")
        public String reservedNodePoolId;

        /**
         * <strong>example:</strong>
         * <p>2025-01-01T12:05:00Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The available vSwitches for compute nodes in the queue. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static GetQueueResponseBodyQueue build(java.util.Map<String, ?> map) throws Exception {
            GetQueueResponseBodyQueue self = new GetQueueResponseBodyQueue();
            return TeaModel.build(map, self);
        }

        public GetQueueResponseBodyQueue setAllocationStrategy(String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        public GetQueueResponseBodyQueue setComputeNodes(java.util.List<NodeTemplate> computeNodes) {
            this.computeNodes = computeNodes;
            return this;
        }
        public java.util.List<NodeTemplate> getComputeNodes() {
            return this.computeNodes;
        }

        public GetQueueResponseBodyQueue setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQueueResponseBodyQueue setEnableScaleIn(Boolean enableScaleIn) {
            this.enableScaleIn = enableScaleIn;
            return this;
        }
        public Boolean getEnableScaleIn() {
            return this.enableScaleIn;
        }

        public GetQueueResponseBodyQueue setEnableScaleOut(Boolean enableScaleOut) {
            this.enableScaleOut = enableScaleOut;
            return this;
        }
        public Boolean getEnableScaleOut() {
            return this.enableScaleOut;
        }

        public GetQueueResponseBodyQueue setHostnamePrefix(String hostnamePrefix) {
            this.hostnamePrefix = hostnamePrefix;
            return this;
        }
        public String getHostnamePrefix() {
            return this.hostnamePrefix;
        }

        public GetQueueResponseBodyQueue setHostnameSuffix(String hostnameSuffix) {
            this.hostnameSuffix = hostnameSuffix;
            return this;
        }
        public String getHostnameSuffix() {
            return this.hostnameSuffix;
        }

        public GetQueueResponseBodyQueue setInitialCount(Integer initialCount) {
            this.initialCount = initialCount;
            return this;
        }
        public Integer getInitialCount() {
            return this.initialCount;
        }

        public GetQueueResponseBodyQueue setInterConnect(String interConnect) {
            this.interConnect = interConnect;
            return this;
        }
        public String getInterConnect() {
            return this.interConnect;
        }

        public GetQueueResponseBodyQueue setKeepAliveNodes(java.util.List<String> keepAliveNodes) {
            this.keepAliveNodes = keepAliveNodes;
            return this;
        }
        public java.util.List<String> getKeepAliveNodes() {
            return this.keepAliveNodes;
        }

        public GetQueueResponseBodyQueue setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

        public GetQueueResponseBodyQueue setMaxCountPerCycle(Long maxCountPerCycle) {
            this.maxCountPerCycle = maxCountPerCycle;
            return this;
        }
        public Long getMaxCountPerCycle() {
            return this.maxCountPerCycle;
        }

        public GetQueueResponseBodyQueue setMinCount(Integer minCount) {
            this.minCount = minCount;
            return this;
        }
        public Integer getMinCount() {
            return this.minCount;
        }

        public GetQueueResponseBodyQueue setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public GetQueueResponseBodyQueue setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetQueueResponseBodyQueue setReservedNodePoolId(String reservedNodePoolId) {
            this.reservedNodePoolId = reservedNodePoolId;
            return this;
        }
        public String getReservedNodePoolId() {
            return this.reservedNodePoolId;
        }

        public GetQueueResponseBodyQueue setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetQueueResponseBodyQueue setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

}
