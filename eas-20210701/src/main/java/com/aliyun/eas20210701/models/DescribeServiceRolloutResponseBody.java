// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceRolloutResponseBody extends TeaModel {
    /**
     * <p>The request ID. This ID is unique to each request and is used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Details of the service rollout, including the rollout strategy (<code>Strategy</code>) and execution status (<code>Status</code>).</p>
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
         * <p>The identifier for the currently running revision.</p>
         * 
         * <strong>example:</strong>
         * <p>service-abc123-v1</p>
         */
        @NameInMap("CurrentRevision")
        public String currentRevision;

        /**
         * <p>The scheduled start time for the next batch.</p>
         * 
         * <strong>example:</strong>
         * <p>2026/05/08 16:10:56</p>
         */
        @NameInMap("NextBatchStartTime")
        public String nextBatchStartTime;

        /**
         * <p>The current release phase. Valid values:</p>
         * <ul>
         * <li><p><code>Pending</code>: The rollout is waiting to start.</p>
         * </li>
         * <li><p><code>Running</code>: The rollout is in progress.</p>
         * </li>
         * <li><p><code>Paused</code>: The rollout is paused.</p>
         * </li>
         * <li><p><code>Completed</code>: The rollout is complete.</p>
         * </li>
         * <li><p><code>Failed</code>: The rollout has failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Phase")
        public String phase;

        /**
         * <p>The total number of desired replicas for the service.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalReplicas")
        public Integer totalReplicas;

        /**
         * <p>The identifier for the target revision.</p>
         * 
         * <strong>example:</strong>
         * <p>service-abc123-v2</p>
         */
        @NameInMap("UpdateRevision")
        public String updateRevision;

        /**
         * <p>The number of replicas updated to the new revision.</p>
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
         * <p>The number or percentage of replicas to update in each batch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchSize")
        public String batchSize;

        /**
         * <p>The time to wait between batches.</p>
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
         * <p>Specifies the number or percentage of old replicas to keep. For example, a value of <code>50%</code> indicates that 50% of the old replicas are retained.</p>
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
         * <p>The configuration for a batch release. This object is returned only when the batch release strategy is used.</p>
         */
        @NameInMap("Batch")
        public DescribeServiceRolloutResponseBodyRolloutStrategyBatch batch;

        /**
         * <p>The configuration for a canary release. This object is returned only when the canary release strategy is used.</p>
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
         * <p>The current progress and phase of the rollout.</p>
         */
        @NameInMap("Status")
        public DescribeServiceRolloutResponseBodyRolloutStatus status;

        /**
         * <p>The rollout strategy configuration. This object contains the parameters for a canary release or batch release.</p>
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
