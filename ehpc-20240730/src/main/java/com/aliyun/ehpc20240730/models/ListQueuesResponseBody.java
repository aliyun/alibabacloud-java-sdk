// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class ListQueuesResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The information about the queues.</p>
     */
    @NameInMap("Queues")
    public java.util.List<ListQueuesResponseBodyQueues> queues;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C6E5005C-00B0-4F27-98BB-95AB88016C22</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListQueuesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQueuesResponseBody self = new ListQueuesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQueuesResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ListQueuesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQueuesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQueuesResponseBody setQueues(java.util.List<ListQueuesResponseBodyQueues> queues) {
        this.queues = queues;
        return this;
    }
    public java.util.List<ListQueuesResponseBodyQueues> getQueues() {
        return this.queues;
    }

    public ListQueuesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQueuesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListQueuesResponseBodyQueuesNodes extends TeaModel {
        /**
         * <p>The number of compute nodes that are not ready.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CreatingCounts")
        public Integer creatingCounts;

        /**
         * <p>The number of malfunctioning compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExceptionCounts")
        public Integer exceptionCounts;

        /**
         * <p>The number of running compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RunningCounts")
        public Integer runningCounts;

        public static ListQueuesResponseBodyQueuesNodes build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueuesNodes self = new ListQueuesResponseBodyQueuesNodes();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueuesNodes setCreatingCounts(Integer creatingCounts) {
            this.creatingCounts = creatingCounts;
            return this;
        }
        public Integer getCreatingCounts() {
            return this.creatingCounts;
        }

        public ListQueuesResponseBodyQueuesNodes setExceptionCounts(Integer exceptionCounts) {
            this.exceptionCounts = exceptionCounts;
            return this;
        }
        public Integer getExceptionCounts() {
            return this.exceptionCounts;
        }

        public ListQueuesResponseBodyQueuesNodes setRunningCounts(Integer runningCounts) {
            this.runningCounts = runningCounts;
            return this;
        }
        public Integer getRunningCounts() {
            return this.runningCounts;
        }

    }

    public static class ListQueuesResponseBodyQueues extends TeaModel {
        /**
         * <p>The hardware configurations of the compute nodes that are added in auto scale-outs. Up to five nodes are displayed.</p>
         */
        @NameInMap("ComputeNodes")
        public java.util.List<NodeTemplate> computeNodes;

        /**
         * <p>The time when the queue was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-10T02:04:00Z</p>
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
         * <p>The maximum number of compute nodes that the queue can contain.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("MaxCount")
        public Integer maxCount;

        /**
         * <p>The minimum number of compute nodes that are added to the queue in each auto scale-out.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxCountPerCycle")
        public Integer maxCountPerCycle;

        /**
         * <p>The minimum number of compute nodes that the queue must contain.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MinCount")
        public Integer minCount;

        /**
         * <p>The statistics about the compute nodes in the queue.</p>
         */
        @NameInMap("Nodes")
        public ListQueuesResponseBodyQueuesNodes nodes;

        /**
         * <p>The queue name.</p>
         * 
         * <strong>example:</strong>
         * <p>comp</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>The total number of vCPUs that are used by all compute nodes in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("TotalCores")
        public Integer totalCores;

        /**
         * <p>The time when the queue was updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mmZ format. The time is displayed in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-25T02:02:32</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The vSwitches that can be used for added nodes during auto scale-outs. Up to three vSwitches are displayed.</p>
         */
        @NameInMap("VSwitchIds")
        public java.util.List<String> vSwitchIds;

        public static ListQueuesResponseBodyQueues build(java.util.Map<String, ?> map) throws Exception {
            ListQueuesResponseBodyQueues self = new ListQueuesResponseBodyQueues();
            return TeaModel.build(map, self);
        }

        public ListQueuesResponseBodyQueues setComputeNodes(java.util.List<NodeTemplate> computeNodes) {
            this.computeNodes = computeNodes;
            return this;
        }
        public java.util.List<NodeTemplate> getComputeNodes() {
            return this.computeNodes;
        }

        public ListQueuesResponseBodyQueues setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQueuesResponseBodyQueues setEnableScaleIn(Boolean enableScaleIn) {
            this.enableScaleIn = enableScaleIn;
            return this;
        }
        public Boolean getEnableScaleIn() {
            return this.enableScaleIn;
        }

        public ListQueuesResponseBodyQueues setEnableScaleOut(Boolean enableScaleOut) {
            this.enableScaleOut = enableScaleOut;
            return this;
        }
        public Boolean getEnableScaleOut() {
            return this.enableScaleOut;
        }

        public ListQueuesResponseBodyQueues setMaxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Integer getMaxCount() {
            return this.maxCount;
        }

        public ListQueuesResponseBodyQueues setMaxCountPerCycle(Integer maxCountPerCycle) {
            this.maxCountPerCycle = maxCountPerCycle;
            return this;
        }
        public Integer getMaxCountPerCycle() {
            return this.maxCountPerCycle;
        }

        public ListQueuesResponseBodyQueues setMinCount(Integer minCount) {
            this.minCount = minCount;
            return this;
        }
        public Integer getMinCount() {
            return this.minCount;
        }

        public ListQueuesResponseBodyQueues setNodes(ListQueuesResponseBodyQueuesNodes nodes) {
            this.nodes = nodes;
            return this;
        }
        public ListQueuesResponseBodyQueuesNodes getNodes() {
            return this.nodes;
        }

        public ListQueuesResponseBodyQueues setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public ListQueuesResponseBodyQueues setTotalCores(Integer totalCores) {
            this.totalCores = totalCores;
            return this;
        }
        public Integer getTotalCores() {
            return this.totalCores;
        }

        public ListQueuesResponseBodyQueues setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListQueuesResponseBodyQueues setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

    }

}
