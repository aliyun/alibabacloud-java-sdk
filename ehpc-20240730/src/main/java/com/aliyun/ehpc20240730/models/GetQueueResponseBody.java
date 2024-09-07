// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class GetQueueResponseBody extends TeaModel {
    @NameInMap("Queue")
    public GetQueueResponseBodyQueue queue;

    /**
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

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
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

        public GetQueueResponseBodyQueue setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

}
