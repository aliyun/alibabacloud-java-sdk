// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceRolloutRequest extends TeaModel {
    /**
     * <p>The configuration for the Batch strategy.</p>
     */
    @NameInMap("Batch")
    public CreateServiceRolloutRequestBatch batch;

    /**
     * <p>The configuration for the Partition strategy.</p>
     */
    @NameInMap("Partition")
    public CreateServiceRolloutRequestPartition partition;

    /**
     * <p>Specifies whether to pause the rollout.</p>
     * 
     * <strong>example:</strong>
     * <p>False</p>
     */
    @NameInMap("Paused")
    public Boolean paused;

    public static CreateServiceRolloutRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceRolloutRequest self = new CreateServiceRolloutRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceRolloutRequest setBatch(CreateServiceRolloutRequestBatch batch) {
        this.batch = batch;
        return this;
    }
    public CreateServiceRolloutRequestBatch getBatch() {
        return this.batch;
    }

    public CreateServiceRolloutRequest setPartition(CreateServiceRolloutRequestPartition partition) {
        this.partition = partition;
        return this;
    }
    public CreateServiceRolloutRequestPartition getPartition() {
        return this.partition;
    }

    public CreateServiceRolloutRequest setPaused(Boolean paused) {
        this.paused = paused;
        return this;
    }
    public Boolean getPaused() {
        return this.paused;
    }

    public static class CreateServiceRolloutRequestBatch extends TeaModel {
        /**
         * <p>The number of instances to update in each batch.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchSize")
        public String batchSize;

        /**
         * <p>The wait interval after each batch completes.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("Interval")
        public String interval;

        public static CreateServiceRolloutRequestBatch build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRolloutRequestBatch self = new CreateServiceRolloutRequestBatch();
            return TeaModel.build(map, self);
        }

        public CreateServiceRolloutRequestBatch setBatchSize(String batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public String getBatchSize() {
            return this.batchSize;
        }

        public CreateServiceRolloutRequestBatch setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

    }

    public static class CreateServiceRolloutRequestPartition extends TeaModel {
        /**
         * <p>The number of instances to update to the new version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Partition")
        public String partition;

        public static CreateServiceRolloutRequestPartition build(java.util.Map<String, ?> map) throws Exception {
            CreateServiceRolloutRequestPartition self = new CreateServiceRolloutRequestPartition();
            return TeaModel.build(map, self);
        }

        public CreateServiceRolloutRequestPartition setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

    }

}
