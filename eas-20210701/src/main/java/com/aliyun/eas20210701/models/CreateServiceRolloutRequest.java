// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateServiceRolloutRequest extends TeaModel {
    @NameInMap("Batch")
    public CreateServiceRolloutRequestBatch batch;

    @NameInMap("Partition")
    public CreateServiceRolloutRequestPartition partition;

    /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BatchSize")
        public String batchSize;

        /**
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
