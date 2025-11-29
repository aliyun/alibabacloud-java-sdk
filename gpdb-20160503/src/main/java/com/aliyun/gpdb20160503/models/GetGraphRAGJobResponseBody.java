// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetGraphRAGJobResponseBody extends TeaModel {
    /**
     * <p>The details of the task for building a knowledge graph.</p>
     */
    @NameInMap("Job")
    public GetGraphRAGJobResponseBodyJob job;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong></li>
     * <li><strong>fail</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of tokens that are consumed by document understanding or embedding.</p>
     */
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
         * <p>Indicates whether the operation is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <p>The job creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 16:52:04.864664</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message that is returned when the current operation is abnormal or fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to connect database.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231460f8-75dc-405e-a669-0c5204887e91</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The progress of the document upload job. Unit: %. A value of 100 indicates that the job is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The state of the job. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong></li>
         * <li><strong>Failed</strong> (See the Error parameter for failure reasons.)</li>
         * <li><strong>Running</strong></li>
         * <li><strong>Pending</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The job last updated time.</p>
         * 
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
         * <p>The number of tokens that are consumed during vectorization.</p>
         * <blockquote>
         * <p>A token is the minimum unit for splitting text. A token can be a word, phrase, punctuation, or character.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>475</p>
         */
        @NameInMap("EmbeddingTokens")
        public Integer embeddingTokens;

        /**
         * <p>The number of tokens used by the large model input.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("LLMInputTokens")
        public Integer LLMInputTokens;

        /**
         * <p>The number of tokens used for large model output.</p>
         * 
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
