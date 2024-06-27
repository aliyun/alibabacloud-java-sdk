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
     * <p>The information about the document upload job.</p>
     */
    @NameInMap("Job")
    public GetUploadDocumentJobResponseBodyJob job;

    /**
     * <p>The returned message.</p>
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
     * <p>The number of tokens that are used for document understanding or embedding.</p>
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
         * <p>The URL of the file after chunking. The validity period of the URL is 2 hours. The file is in the JSONL format. Each line is in the <code>{&quot;page_content&quot;:&quot;*****&quot;, &quot;metadata&quot;: {&quot;**&quot;:&quot;***&quot;,&quot;**&quot;:&quot;***&quot;}</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/test.jsonl">http://xxx/test.jsonl</a></p>
         */
        @NameInMap("ChunkFileUrl")
        public String chunkFileUrl;

        /**
         * <p>The URL of the file that does not contain metadata after chunking. The validity period of the URL is 2 hours. The file is in the TXT format. Each line is a chunk. The file can be easily used for embedding.</p>
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
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-08 16:52:04.864664</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message.</p>
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
         * <p>The status of the job. Valid values: Valid values:</p>
         * <ul>
         * <li>Success</li>
         * <li>Failed (See the Error parameter for failure reasons.)</li>
         * <li>Cancelling</li>
         * <li>Cancelled</li>
         * <li>Start</li>
         * <li>Running</li>
         * <li>Pending</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the job was updated.</p>
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
        @NameInMap("EmbeddingEntries")
        public Integer embeddingEntries;

        /**
         * <p>The number of tokens that are used for vectorization.</p>
         * <blockquote>
         * <p> A token is the minimum unit for splitting text. A token can be a word, phrase, punctuation, or character.</p>
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
