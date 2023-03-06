// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreatePipelinesRequest extends TeaModel {
    /**
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF\*\*\*\*</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public java.util.List<CreatePipelinesRequestBody> body;

    /**
     * <p>false</p>
     */
    @NameInMap("trigger")
    public Boolean trigger;

    public static CreatePipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelinesRequest self = new CreatePipelinesRequest();
        return TeaModel.build(map, self);
    }

    public CreatePipelinesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePipelinesRequest setBody(java.util.List<CreatePipelinesRequestBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<CreatePipelinesRequestBody> getBody() {
        return this.body;
    }

    public CreatePipelinesRequest setTrigger(Boolean trigger) {
        this.trigger = trigger;
        return this;
    }
    public Boolean getTrigger() {
        return this.trigger;
    }

    public static class CreatePipelinesRequestBody extends TeaModel {
        @NameInMap("batchDelay")
        public Integer batchDelay;

        @NameInMap("batchSize")
        public Integer batchSize;

        @NameInMap("config")
        public String config;

        @NameInMap("description")
        public String description;

        @NameInMap("pipelineId")
        public String pipelineId;

        @NameInMap("queueCheckPointWrites")
        public Integer queueCheckPointWrites;

        @NameInMap("queueMaxBytes")
        public Integer queueMaxBytes;

        @NameInMap("queueType")
        public String queueType;

        @NameInMap("workers")
        public Integer workers;

        public static CreatePipelinesRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreatePipelinesRequestBody self = new CreatePipelinesRequestBody();
            return TeaModel.build(map, self);
        }

        public CreatePipelinesRequestBody setBatchDelay(Integer batchDelay) {
            this.batchDelay = batchDelay;
            return this;
        }
        public Integer getBatchDelay() {
            return this.batchDelay;
        }

        public CreatePipelinesRequestBody setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public CreatePipelinesRequestBody setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public CreatePipelinesRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreatePipelinesRequestBody setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public CreatePipelinesRequestBody setQueueCheckPointWrites(Integer queueCheckPointWrites) {
            this.queueCheckPointWrites = queueCheckPointWrites;
            return this;
        }
        public Integer getQueueCheckPointWrites() {
            return this.queueCheckPointWrites;
        }

        public CreatePipelinesRequestBody setQueueMaxBytes(Integer queueMaxBytes) {
            this.queueMaxBytes = queueMaxBytes;
            return this;
        }
        public Integer getQueueMaxBytes() {
            return this.queueMaxBytes;
        }

        public CreatePipelinesRequestBody setQueueType(String queueType) {
            this.queueType = queueType;
            return this;
        }
        public String getQueueType() {
            return this.queueType;
        }

        public CreatePipelinesRequestBody setWorkers(Integer workers) {
            this.workers = workers;
            return this;
        }
        public Integer getWorkers() {
            return this.workers;
        }

    }

}
