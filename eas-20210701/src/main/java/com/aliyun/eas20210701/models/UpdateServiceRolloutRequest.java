// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateServiceRolloutRequest extends TeaModel {
    @NameInMap("Batch")
    public UpdateServiceRolloutRequestBatch batch;

    @NameInMap("Partition")
    public UpdateServiceRolloutRequestPartition partition;

    /**
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
         * <strong>example:</strong>
         * <p>25%</p>
         */
        @NameInMap("BatchSize")
        public String batchSize;

        /**
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
