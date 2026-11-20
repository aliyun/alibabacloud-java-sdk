// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceRolloutResponseBody extends TeaModel {
    /**
     * <p>The request ID. The unique identifier returned for each request, used for troubleshooting and tracking.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The rollout information. Includes the strategy configuration and execution status.</p>
     */
    @NameInMap("Rollout")
    public DescribeServiceRolloutResponseBodyRollout rollout;

    public static DescribeServiceRolloutResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceRolloutResponseBody self = new DescribeServiceRolloutResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeServiceRolloutResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeServiceRolloutResponseBody setRollout(DescribeServiceRolloutResponseBodyRollout rollout) {
        this.rollout = rollout;
        return this;
    }
    public DescribeServiceRolloutResponseBodyRollout getRollout() {
        return this.rollout;
    }

    public static class DescribeServiceRolloutResponseBodyRolloutStatus extends TeaModel {
        /**
         * <p>The current revision. The identifier of the version that is currently running.</p>
         * 
         * <strong>example:</strong>
         * <p>service-abc123-v1</p>
         */
        @NameInMap("CurrentRevision")
        public String currentRevision;

        /**
         * <p>The start time of the next batch update, in the YYYY/MM/DD HH:mm:ss format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026/05/08 16:10:56</p>
         */
        @NameInMap("NextBatchStartTime")
        public String nextBatchStartTime;

        /**
         * <p>The rollout phase. Valid values:</p>
         * <ul>
         * <li>Pending: The rollout is waiting to start.</li>
         * <li>Running: The rollout is in progress.</li>
         * <li>Paused: The rollout is paused.</li>
         * <li>Completed: The rollout is completed.</li>
         * <li>Failed: The rollout failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The total number of replicas. The total number of replicas for the service.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalReplicas")
        public Integer totalReplicas;

        /**
         * <p>The update revision. The identifier of the target version to which the service is being updated.</p>
         * 
         * <strong>example:</strong>
         * <p>service-abc123-v2</p>
         */
        @NameInMap("UpdateRevision")
        public String updateRevision;

        /**
         * <p>The number of updated replicas. The number of replicas that have been updated to the new version.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UpdatedReplicas")
        public Integer updatedReplicas;

        public static DescribeServiceRolloutResponseBodyRolloutStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceRolloutResponseBodyRolloutStatus self = new DescribeServiceRolloutResponseBodyRolloutStatus();
            return TeaModel.build(map, self);
        }

        public DescribeServiceRolloutResponseBodyRolloutStatus setCurrentRevision(String currentRevision) {
            this.currentRevision = currentRevision;
            return this;
        }
        public String getCurrentRevision() {
            return this.currentRevision;
        }

        public DescribeServiceRolloutResponseBodyRolloutStatus setNextBatchStartTime(String nextBatchStartTime) {
            this.nextBatchStartTime = nextBatchStartTime;
            return this;
        }
        public String getNextBatchStartTime() {
            return this.nextBatchStartTime;
        }

        public DescribeServiceRolloutResponseBodyRolloutStatus setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public DescribeServiceRolloutResponseBodyRolloutStatus setTotalReplicas(Integer totalReplicas) {
            this.totalReplicas = totalReplicas;
            return this;
        }
        public Integer getTotalReplicas() {
            return this.totalReplicas;
        }

        public DescribeServiceRolloutResponseBodyRolloutStatus setUpdateRevision(String updateRevision) {
            this.updateRevision = updateRevision;
            return this;
        }
        public String getUpdateRevision() {
            return this.updateRevision;
        }

        public DescribeServiceRolloutResponseBodyRolloutStatus setUpdatedReplicas(Integer updatedReplicas) {
            this.updatedReplicas = updatedReplicas;
            return this;
        }
        public Integer getUpdatedReplicas() {
            return this.updatedReplicas;
        }

    }

    public static class DescribeServiceRolloutResponseBodyRolloutStrategyBatch extends TeaModel {
        /**
         * <p>The batch size. The number or percentage of replicas to update in each batch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchSize")
        public String batchSize;

        /**
         * <p>The batch interval. The waiting time between two rollouts.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("Interval")
        public String interval;

        public static DescribeServiceRolloutResponseBodyRolloutStrategyBatch build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceRolloutResponseBodyRolloutStrategyBatch self = new DescribeServiceRolloutResponseBodyRolloutStrategyBatch();
            return TeaModel.build(map, self);
        }

        public DescribeServiceRolloutResponseBodyRolloutStrategyBatch setBatchSize(String batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public String getBatchSize() {
            return this.batchSize;
        }

        public DescribeServiceRolloutResponseBodyRolloutStrategyBatch setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class DescribeServiceRolloutResponseBodyRolloutStrategyPartition extends TeaModel {
        /**
         * <p>The partition value. Indicates the number or percentage of old replicas to retain. For example, \&quot;50%\&quot; indicates that 50% of the old replicas are retained.</p>
         * 
         * <strong>example:</strong>
         * <p>50%</p>
         */
        @NameInMap("Partition")
        public String partition;

        public static DescribeServiceRolloutResponseBodyRolloutStrategyPartition build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceRolloutResponseBodyRolloutStrategyPartition self = new DescribeServiceRolloutResponseBodyRolloutStrategyPartition();
            return TeaModel.build(map, self);
        }

        public DescribeServiceRolloutResponseBodyRolloutStrategyPartition setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

    }

    public static class DescribeServiceRolloutResponseBodyRolloutStrategy extends TeaModel {
        /**
         * <p>The batch rollout configuration. This parameter is returned if a batch rollout strategy is used. Otherwise, it is not returned.</p>
         */
        @NameInMap("Batch")
        public DescribeServiceRolloutResponseBodyRolloutStrategyBatch batch;

        /**
         * <p>The partition rollout configuration. This parameter is returned if a partition rollout strategy is used. Otherwise, it is not returned.</p>
         */
        @NameInMap("Partition")
        public DescribeServiceRolloutResponseBodyRolloutStrategyPartition partition;

        public static DescribeServiceRolloutResponseBodyRolloutStrategy build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceRolloutResponseBodyRolloutStrategy self = new DescribeServiceRolloutResponseBodyRolloutStrategy();
            return TeaModel.build(map, self);
        }

        public DescribeServiceRolloutResponseBodyRolloutStrategy setBatch(DescribeServiceRolloutResponseBodyRolloutStrategyBatch batch) {
            this.batch = batch;
            return this;
        }
        public DescribeServiceRolloutResponseBodyRolloutStrategyBatch getBatch() {
            return this.batch;
        }

        public DescribeServiceRolloutResponseBodyRolloutStrategy setPartition(DescribeServiceRolloutResponseBodyRolloutStrategyPartition partition) {
            this.partition = partition;
            return this;
        }
        public DescribeServiceRolloutResponseBodyRolloutStrategyPartition getPartition() {
            return this.partition;
        }

    }

    public static class DescribeServiceRolloutResponseBodyRollout extends TeaModel {
        /**
         * <p>The rollout execution status. Includes the current rollout progress and phase information.</p>
         */
        @NameInMap("Status")
        public DescribeServiceRolloutResponseBodyRolloutStatus status;

        /**
         * <p>The rollout strategy configuration. Includes the specific configuration parameters for partition or batch rollouts.</p>
         */
        @NameInMap("Strategy")
        public DescribeServiceRolloutResponseBodyRolloutStrategy strategy;

        public static DescribeServiceRolloutResponseBodyRollout build(java.util.Map<String, ?> map) throws Exception {
            DescribeServiceRolloutResponseBodyRollout self = new DescribeServiceRolloutResponseBodyRollout();
            return TeaModel.build(map, self);
        }

        public DescribeServiceRolloutResponseBodyRollout setStatus(DescribeServiceRolloutResponseBodyRolloutStatus status) {
            this.status = status;
            return this;
        }
        public DescribeServiceRolloutResponseBodyRolloutStatus getStatus() {
            return this.status;
        }

        public DescribeServiceRolloutResponseBodyRollout setStrategy(DescribeServiceRolloutResponseBodyRolloutStrategy strategy) {
            this.strategy = strategy;
            return this;
        }
        public DescribeServiceRolloutResponseBodyRolloutStrategy getStrategy() {
            return this.strategy;
        }

    }

}
