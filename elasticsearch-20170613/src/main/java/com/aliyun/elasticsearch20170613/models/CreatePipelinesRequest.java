// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreatePipelinesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("body")
    public java.util.List<CreatePipelinesRequestBody> body;

    /**
     * <strong>example:</strong>
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
        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("batchDelay")
        public Integer batchDelay;

        /**
         * <strong>example:</strong>
         * <p>125</p>
         */
        @NameInMap("batchSize")
        public Integer batchSize;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>input { } filter { } output { }</p>
         */
        @NameInMap("config")
        public String config;

        /**
         * <strong>example:</strong>
         * <p>this is a test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline-test</p>
         */
        @NameInMap("pipelineId")
        public String pipelineId;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("queueCheckPointWrites")
        public Integer queueCheckPointWrites;

        /**
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("queueMaxBytes")
        public Integer queueMaxBytes;

        /**
         * <strong>example:</strong>
         * <p>MEMORY</p>
         */
        @NameInMap("queueType")
        public String queueType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
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
