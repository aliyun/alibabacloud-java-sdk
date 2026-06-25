// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceRolloutRequest extends TeaModel {
    /**
     * <p>The batch rollout configuration. This parameter is mutually exclusive with <code>Partition</code>.</p>
     * <ul>
     * <li><p>Type: object</p>
     * </li>
     * <li><p>Required: No</p>
     * </li>
     * <li><p>Description: The batch rollout configuration for adjusting batch policy parameters. This parameter is mutually exclusive with Partition.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Batch")
    public UpdateServiceRolloutRequestBatch batch;

    /**
     * <p>The partition rollout configuration. This parameter is mutually exclusive with <code>Batch</code>.</p>
     * <ul>
     * <li><p>Type: object</p>
     * </li>
     * <li><p>Required: No</p>
     * </li>
     * <li><p>Description: The partition rollout configuration. This parameter adjusts the parameters for the partition strategy. It is mutually exclusive with <code>Batch</code>.</p>
     * </li>
     * </ul>
     */
    @NameInMap("Partition")
    public UpdateServiceRolloutRequestPartition partition;

    /**
     * <p>Set to <code>true</code> to pause the rollout or <code>false</code> to resume it.</p>
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
         * <p>The number of replicas to update in each batch. This can be an integer or a percentage. The default is <code>&quot;25%&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>25%</p>
         */
        @NameInMap("BatchSize")
        public String batchSize;

        /**
         * <p>The interval to wait between batches. Supported units include <code>s</code> (seconds), <code>m</code> (minutes), and <code>h</code> (hours).</p>
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
         * <p><strong>Partition value</strong></p>
         * <ul>
         * <li><p>Type: string</p>
         * </li>
         * <li><p>Required: Yes</p>
         * </li>
         * <li><p>Description: The partition value. This parameter specifies the number or percentage of old-version replicas to retain. It supports two formats:</p>
         * <ol>
         * <li><p>An integer, such as &quot;5&quot;, for the number of replicas.</p>
         * </li>
         * <li><p>A percentage, such as &quot;50%&quot;, for the proportion of replicas.</p>
         * </li>
         * </ol>
         * <p>Adjustment strategy:</p>
         * <ul>
         * <li><p>Increasing the value rolls back to the previous version by increasing the number of old-version replicas.</p>
         * </li>
         * <li><p>Decreasing the value continues the rollout by reducing the number of old-version replicas.</p>
         * </li>
         * <li><p>Setting the value to &quot;0&quot; or &quot;0%&quot; completes the rollout, replacing all old-version replicas.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>Example: 30%</p>
         * </li>
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
