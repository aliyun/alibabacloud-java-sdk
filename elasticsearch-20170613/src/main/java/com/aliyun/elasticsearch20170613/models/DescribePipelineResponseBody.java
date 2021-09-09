// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribePipelineResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribePipelineResponseBodyResult result;

    public static DescribePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineResponseBody self = new DescribePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePipelineResponseBody setResult(DescribePipelineResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribePipelineResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribePipelineResponseBodyResult extends TeaModel {
        @NameInMap("pipelineId")
        public String pipelineId;

        @NameInMap("gmtUpdateTime")
        public String gmtUpdateTime;

        @NameInMap("queueType")
        public String queueType;

        @NameInMap("queueCheckPointWrites")
        public Integer queueCheckPointWrites;

        @NameInMap("queueMaxBytes")
        public Integer queueMaxBytes;

        @NameInMap("config")
        public String config;

        @NameInMap("batchDelay")
        public Integer batchDelay;

        @NameInMap("workers")
        public Integer workers;

        @NameInMap("description")
        public String description;

        @NameInMap("gmtCreatedTime")
        public String gmtCreatedTime;

        @NameInMap("batchSize")
        public Integer batchSize;

        @NameInMap("pipelineStatus")
        public String pipelineStatus;

        public static DescribePipelineResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineResponseBodyResult self = new DescribePipelineResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribePipelineResponseBodyResult setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public DescribePipelineResponseBodyResult setGmtUpdateTime(String gmtUpdateTime) {
            this.gmtUpdateTime = gmtUpdateTime;
            return this;
        }
        public String getGmtUpdateTime() {
            return this.gmtUpdateTime;
        }

        public DescribePipelineResponseBodyResult setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public DescribePipelineResponseBodyResult setQueueCheckPointWrites(Integer queueCheckPointWrites) {
            this.queueCheckPointWrites = queueCheckPointWrites;
            return this;
        }
        public Integer getQueueCheckPointWrites() {
            return this.queueCheckPointWrites;
        }

        public DescribePipelineResponseBodyResult setQueueMaxBytes(Integer queueMaxBytes) {
            this.queueMaxBytes = queueMaxBytes;
            return this;
        }
        public Integer getQueueMaxBytes() {
            return this.queueMaxBytes;
        }

        public DescribePipelineResponseBodyResult setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public DescribePipelineResponseBodyResult setBatchDelay(Integer batchDelay) {
            this.batchDelay = batchDelay;
            return this;
        }
        public Integer getBatchDelay() {
            return this.batchDelay;
        }

        public DescribePipelineResponseBodyResult setWorkers(Integer workers) {
            this.workers = workers;
            return this;
        }
        public Integer getWorkers() {
            return this.workers;
        }

        public DescribePipelineResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePipelineResponseBodyResult setGmtCreatedTime(String gmtCreatedTime) {
            this.gmtCreatedTime = gmtCreatedTime;
            return this;
        }
        public String getGmtCreatedTime() {
            return this.gmtCreatedTime;
        }

        public DescribePipelineResponseBodyResult setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public DescribePipelineResponseBodyResult setPipelineStatus(String pipelineStatus) {
            this.pipelineStatus = pipelineStatus;
            return this;
        }
        public String getPipelineStatus() {
            return this.pipelineStatus;
        }

    }

}
