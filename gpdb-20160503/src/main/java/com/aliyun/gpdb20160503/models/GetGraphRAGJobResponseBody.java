// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetGraphRAGJobResponseBody extends TeaModel {
    @NameInMap("Job")
    public GetGraphRAGJobResponseBodyJob job;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Usage")
    public GetGraphRAGJobResponseBodyUsage usage;

    public static GetGraphRAGJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGraphRAGJobResponseBody self = new GetGraphRAGJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGraphRAGJobResponseBody setJob(GetGraphRAGJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetGraphRAGJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetGraphRAGJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGraphRAGJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGraphRAGJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetGraphRAGJobResponseBody setUsage(GetGraphRAGJobResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetGraphRAGJobResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetGraphRAGJobResponseBodyJob extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <strong>example:</strong>
         * <p>2024-01-08 16:52:04.864664</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>Failed to connect database.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <strong>example:</strong>
         * <p>231460f8-75dc-405e-a669-0c5204887e91</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>2024-01-08 16:53:04.864664</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetGraphRAGJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetGraphRAGJobResponseBodyJob self = new GetGraphRAGJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetGraphRAGJobResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetGraphRAGJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetGraphRAGJobResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetGraphRAGJobResponseBodyJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetGraphRAGJobResponseBodyJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetGraphRAGJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetGraphRAGJobResponseBodyJob setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetGraphRAGJobResponseBodyUsage extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>475</p>
         */
        @NameInMap("EmbeddingTokens")
        public Integer embeddingTokens;

        /**
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("LLMInputTokens")
        public Integer LLMInputTokens;

        /**
         * <strong>example:</strong>
         * <p>125</p>
         */
        @NameInMap("LLMOutputTokens")
        public Integer LLMOutputTokens;

        public static GetGraphRAGJobResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetGraphRAGJobResponseBodyUsage self = new GetGraphRAGJobResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetGraphRAGJobResponseBodyUsage setEmbeddingTokens(Integer embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }
        public Integer getEmbeddingTokens() {
            return this.embeddingTokens;
        }

        public GetGraphRAGJobResponseBodyUsage setLLMInputTokens(Integer LLMInputTokens) {
            this.LLMInputTokens = LLMInputTokens;
            return this;
        }
        public Integer getLLMInputTokens() {
            return this.LLMInputTokens;
        }

        public GetGraphRAGJobResponseBodyUsage setLLMOutputTokens(Integer LLMOutputTokens) {
            this.LLMOutputTokens = LLMOutputTokens;
            return this;
        }
        public Integer getLLMOutputTokens() {
            return this.LLMOutputTokens;
        }

    }

}
