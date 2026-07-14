// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetUploadDocumentJobResponseBody extends TeaModel {
    /**
     * <p>The chunking result.</p>
     */
    @NameInMap("ChunkResult")
    public GetUploadDocumentJobResponseBodyChunkResult chunkResult;

    /**
     * <p>The details of the document upload task.</p>
     */
    @NameInMap("Job")
    public GetUploadDocumentJobResponseBodyJob job;

    /**
     * <p>The detailed information returned by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of this operation. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The operation is successful.</li>
     * <li><strong>fail</strong>: The operation failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of tokens or entries consumed by document understanding or embedding.</p>
     */
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
        /**
         * <p>The URL of the chunked file. The URL is valid for 2 hours. The file is in JSONL format, and each line is in the format <code>{&quot;page_content&quot;:&quot;*****&quot;, &quot;metadata&quot;: {&quot;**&quot;:&quot;***&quot;,&quot;**&quot;:&quot;***&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/test.jsonl">http://xxx/test.jsonl</a></p>
         */
        @NameInMap("ChunkFileUrl")
        public String chunkFileUrl;

        /**
         * <p>The markdown result file parsed by ADBPGLoader. The URL is valid for 2 hours.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss.xxx/adbpg_loader_result.md">http://oss.xxx/adbpg_loader_result.md</a></p>
         */
        @NameInMap("DocumentLoaderResultFileUrl")
        public String documentLoaderResultFileUrl;

        /**
         * <p>The URL of the chunked file without metadata. The URL is valid for 2 hours. The file is in plain text format, and each line represents a chunk. This file can be conveniently used for embedding.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/test.txt">http://xxx/test.txt</a></p>
         */
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

        public GetUploadDocumentJobResponseBodyChunkResult setDocumentLoaderResultFileUrl(String documentLoaderResultFileUrl) {
            this.documentLoaderResultFileUrl = documentLoaderResultFileUrl;
            return this;
        }
        public String getDocumentLoaderResultFileUrl() {
            return this.documentLoaderResultFileUrl;
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
        /**
         * <p>Indicates whether the operation is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Completed")
        public Boolean completed;

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 16:52:04.864664</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message returned when the operation encounters an exception or fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to connect database.</p>
         */
        @NameInMap("Error")
        public String error;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Job ID。</p>
         * 
         * <strong>example:</strong>
         * <p>231460f8-75dc-405e-a669-0c5204887e91</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The upload progress. This value is a percentage. A value of 100 indicates that the upload is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Success: The task is successful.</li>
         * <li>Failed: The task failed. You can view the Error field for the failure reason.</li>
         * <li>Cancelling: The task is being canceled.</li>
         * <li>Cancelled: The task is canceled.</li>
         * <li>Start: The task has started.</li>
         * <li>Running: The task is running.</li>
         * <li>Pending: The task is pending.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 16:53:04.864664</p>
         */
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

        public GetUploadDocumentJobResponseBodyJob setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
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
        /**
         * <p>The number of entries used during embedding.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("EmbeddingEntries")
        public Integer embeddingEntries;

        /**
         * <p>The number of tokens used during embedding.</p>
         * <blockquote>
         * <p>A token is the smallest unit into which the input text is split. A token can be a word, a phrase, a punctuation mark, or a character.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>475</p>
         */
        @NameInMap("EmbeddingTokens")
        public Integer embeddingTokens;

        public static GetUploadDocumentJobResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetUploadDocumentJobResponseBodyUsage self = new GetUploadDocumentJobResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetUploadDocumentJobResponseBodyUsage setEmbeddingEntries(Integer embeddingEntries) {
            this.embeddingEntries = embeddingEntries;
            return this;
        }
        public Integer getEmbeddingEntries() {
            return this.embeddingEntries;
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
