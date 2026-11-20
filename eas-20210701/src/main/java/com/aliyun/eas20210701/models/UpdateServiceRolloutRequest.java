// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceRolloutRequest extends TeaModel {
    /**
     * <p><strong>Batch</strong>  </p>
     * <ul>
     * <li>Type: object</li>
     * <li>Required: no</li>
     * <li>Description: The batch rollout configuration. Used to adjust batch policy parameters. Mutually exclusive with Partition.</li>
     * </ul>
     */
    @NameInMap("Batch")
    public UpdateServiceRolloutRequestBatch batch;

    /**
     * <p><strong>Partition</strong>  </p>
     * <ul>
     * <li>Type: object</li>
     * <li>Required: no</li>
     * <li>Description: The partition rollout configuration. Used to adjust partition policy parameters. Mutually exclusive with Batch.</li>
     * </ul>
     */
    @NameInMap("Partition")
    public UpdateServiceRolloutRequestPartition partition;

    /**
     * <p>Specifies whether to pause the rollout. A value of true indicates that the rollout is paused. A value of false indicates that the rollout is resumed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Paused")
    public Boolean paused;

    public static UpdateServiceRolloutRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceRolloutRequest self = new UpdateServiceRolloutRequest();
        return TeaModel.build(map, self);
    }

    public UpdateServiceRolloutRequest setBatch(UpdateServiceRolloutRequestBatch batch) {
        this.batch = batch;
        return this;
    }
    public UpdateServiceRolloutRequestBatch getBatch() {
        return this.batch;
    }

    public UpdateServiceRolloutRequest setPartition(UpdateServiceRolloutRequestPartition partition) {
        this.partition = partition;
        return this;
    }
    public UpdateServiceRolloutRequestPartition getPartition() {
        return this.partition;
    }

    public UpdateServiceRolloutRequest setPaused(Boolean paused) {
        this.paused = paused;
        return this;
    }
    public Boolean getPaused() {
        return this.paused;
    }

    public static class UpdateServiceRolloutRequestBatch extends TeaModel {
        /**
         * <p>The batch size. The number of replicas updated per batch. Integer or percentage formats are supported. Default value: &quot;25%&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>25%</p>
         */
        @NameInMap("BatchSize")
        public String batchSize;

        /**
         * <p>The batch interval. The wait time between two rollouts. Supported units: s (seconds), m (minutes), and h (hours).</p>
         * 
         * <strong>example:</strong>
         * <p>60s</p>
         */
        @NameInMap("Interval")
        public String interval;

        public static UpdateServiceRolloutRequestBatch build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRolloutRequestBatch self = new UpdateServiceRolloutRequestBatch();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRolloutRequestBatch setBatchSize(String batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public String getBatchSize() {
            return this.batchSize;
        }

        public UpdateServiceRolloutRequestBatch setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class UpdateServiceRolloutRequestPartition extends TeaModel {
        /**
         * <p><strong>Partition</strong>  </p>
         * <ul>
         * <li>Type: string</li>
         * <li>Required: yes</li>
         * <li>Description: The partition value. Two formats are supported:<ol>
         * <li>Integer format: such as &quot;5&quot;, which means retaining 5 old replicas.</li>
         * <li>Percentage format: such as &quot;50%&quot;, which means retaining 50% of the old replicas.
         * Adjustment policy:</li>
         * </ol>
         * <ul>
         * <li>Increase the value: Roll back to the old version and increase the proportion of old replicas.</li>
         * <li>Decrease the value: Proceed to the new version and decrease the proportion of old replicas.</li>
         * <li>Set to &quot;0%&quot;: Complete the full update and switch all replicas to the new version.</li>
         * </ul>
         * </li>
         * <li>Example: 30%</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30%</p>
         */
        @NameInMap("Partition")
        public String partition;

        public static UpdateServiceRolloutRequestPartition build(java.util.Map<String, ?> map) throws Exception {
            UpdateServiceRolloutRequestPartition self = new UpdateServiceRolloutRequestPartition();
            return TeaModel.build(map, self);
        }

        public UpdateServiceRolloutRequestPartition setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

    }

}
