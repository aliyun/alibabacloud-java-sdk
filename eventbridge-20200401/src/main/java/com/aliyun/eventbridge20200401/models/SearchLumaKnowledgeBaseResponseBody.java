// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SearchLumaKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The retrieval result from the knowledge base bound to the Agent.</p>
     */
    @NameInMap("Data")
    public SearchLumaKnowledgeBaseResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, used for troubleshooting and ticket feedback.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SearchLumaKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchLumaKnowledgeBaseResponseBody self = new SearchLumaKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchLumaKnowledgeBaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchLumaKnowledgeBaseResponseBody setData(SearchLumaKnowledgeBaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchLumaKnowledgeBaseResponseBodyData getData() {
        return this.data;
    }

    public SearchLumaKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchLumaKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchLumaKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchLumaKnowledgeBaseResponseBodyData extends TeaModel {
        /**
         * <p>The list of matched text chunks, sorted by relevance.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DocumentId&quot;:&quot;doc-bp1xxxxxxxxxxxx&quot;,&quot;ChunkSeq&quot;:3,&quot;Content&quot;:&quot;EventBridge supports event routing&quot;}]</p>
         */
        @NameInMap("Chunks")
        public java.util.List<KnowledgeBaseSearchChunk> chunks;

        /**
         * <p>The time spent on the retrieval, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("TimeSpent")
        public Long timeSpent;

        public static SearchLumaKnowledgeBaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchLumaKnowledgeBaseResponseBodyData self = new SearchLumaKnowledgeBaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchLumaKnowledgeBaseResponseBodyData setChunks(java.util.List<KnowledgeBaseSearchChunk> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<KnowledgeBaseSearchChunk> getChunks() {
            return this.chunks;
        }

        public SearchLumaKnowledgeBaseResponseBodyData setTimeSpent(Long timeSpent) {
            this.timeSpent = timeSpent;
            return this;
        }
        public Long getTimeSpent() {
            return this.timeSpent;
        }

    }

}
