// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetUploadDocumentJobResponseBody extends TeaModel {
    @NameInMap("ChunkResult")
    public GetUploadDocumentJobResponseBodyChunkResult chunkResult;

    @NameInMap("Job")
    public GetUploadDocumentJobResponseBodyJob job;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Usage")
    public GetUploadDocumentJobResponseBodyUsage usage;

    public static GetUploadDocumentJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUploadDocumentJobResponseBody self = new GetUploadDocumentJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUploadDocumentJobResponseBody setChunkResult(GetUploadDocumentJobResponseBodyChunkResult chunkResult) {
        this.chunkResult = chunkResult;
        return this;
    }
    public GetUploadDocumentJobResponseBodyChunkResult getChunkResult() {
        return this.chunkResult;
    }

    public GetUploadDocumentJobResponseBody setJob(GetUploadDocumentJobResponseBodyJob job) {
        this.job = job;
        return this;
    }
    public GetUploadDocumentJobResponseBodyJob getJob() {
        return this.job;
    }

    public GetUploadDocumentJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUploadDocumentJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUploadDocumentJobResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetUploadDocumentJobResponseBody setUsage(GetUploadDocumentJobResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public GetUploadDocumentJobResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class GetUploadDocumentJobResponseBodyChunkResult extends TeaModel {
        @NameInMap("ChunkFileUrl")
        public String chunkFileUrl;

        @NameInMap("PlainChunkFileUrl")
        public String plainChunkFileUrl;

        public static GetUploadDocumentJobResponseBodyChunkResult build(java.util.Map<String, ?> map) throws Exception {
            GetUploadDocumentJobResponseBodyChunkResult self = new GetUploadDocumentJobResponseBodyChunkResult();
            return TeaModel.build(map, self);
        }

        public GetUploadDocumentJobResponseBodyChunkResult setChunkFileUrl(String chunkFileUrl) {
            this.chunkFileUrl = chunkFileUrl;
            return this;
        }
        public String getChunkFileUrl() {
            return this.chunkFileUrl;
        }

        public GetUploadDocumentJobResponseBodyChunkResult setPlainChunkFileUrl(String plainChunkFileUrl) {
            this.plainChunkFileUrl = plainChunkFileUrl;
            return this;
        }
        public String getPlainChunkFileUrl() {
            return this.plainChunkFileUrl;
        }

    }

    public static class GetUploadDocumentJobResponseBodyJob extends TeaModel {
        @NameInMap("Completed")
        public Boolean completed;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Error")
        public String error;

        /**
         * <p>Job ID。</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Status")
        public String status;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetUploadDocumentJobResponseBodyJob build(java.util.Map<String, ?> map) throws Exception {
            GetUploadDocumentJobResponseBodyJob self = new GetUploadDocumentJobResponseBodyJob();
            return TeaModel.build(map, self);
        }

        public GetUploadDocumentJobResponseBodyJob setCompleted(Boolean completed) {
            this.completed = completed;
            return this;
        }
        public Boolean getCompleted() {
            return this.completed;
        }

        public GetUploadDocumentJobResponseBodyJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetUploadDocumentJobResponseBodyJob setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public GetUploadDocumentJobResponseBodyJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUploadDocumentJobResponseBodyJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetUploadDocumentJobResponseBodyJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetUploadDocumentJobResponseBodyJob setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class GetUploadDocumentJobResponseBodyUsage extends TeaModel {
        @NameInMap("EmbeddingTokens")
        public Integer embeddingTokens;

        public static GetUploadDocumentJobResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetUploadDocumentJobResponseBodyUsage self = new GetUploadDocumentJobResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetUploadDocumentJobResponseBodyUsage setEmbeddingTokens(Integer embeddingTokens) {
            this.embeddingTokens = embeddingTokens;
            return this;
        }
        public Integer getEmbeddingTokens() {
            return this.embeddingTokens;
        }

    }

}
