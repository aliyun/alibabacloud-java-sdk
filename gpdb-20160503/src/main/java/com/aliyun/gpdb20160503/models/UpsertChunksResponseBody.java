// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpsertChunksResponseBody extends TeaModel {
    /**
     * <p>The number of tokens that are consumed during vectorization.</p>
     * <blockquote>
     * <p>A token is the minimum unit for splitting text. A token can be a word, phrase, punctuation, or character.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EmbeddingTokens")
    public String embeddingTokens;

    /**
     * <p>The job ID. You can use the <code>GetGraphRAGJob</code> to view the job status.</p>
     * <blockquote>
     * <p>This parameter is returned only when the knowledge base is enabled.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>231460f8-75dc-405e-a669-0c5204887e91</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
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

    public static UpsertChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpsertChunksResponseBody self = new UpsertChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public UpsertChunksResponseBody setEmbeddingTokens(String embeddingTokens) {
        this.embeddingTokens = embeddingTokens;
        return this;
    }
    public String getEmbeddingTokens() {
        return this.embeddingTokens;
    }

    public UpsertChunksResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpsertChunksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpsertChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpsertChunksResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
