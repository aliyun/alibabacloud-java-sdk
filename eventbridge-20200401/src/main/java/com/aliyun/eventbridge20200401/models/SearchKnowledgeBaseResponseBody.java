// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SearchKnowledgeBaseResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The search results, including the list of matched chunks and the time spent.</p>
     */
    @NameInMap("Data")
    public SearchKnowledgeBaseResponseBodyData data;

    /**
     * <p>The response message. A value of Operation success is returned for a successful call. A specific error description is returned for a failed call.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
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

    public static SearchKnowledgeBaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchKnowledgeBaseResponseBody self = new SearchKnowledgeBaseResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchKnowledgeBaseResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchKnowledgeBaseResponseBody setData(SearchKnowledgeBaseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SearchKnowledgeBaseResponseBodyData getData() {
        return this.data;
    }

    public SearchKnowledgeBaseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchKnowledgeBaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchKnowledgeBaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchKnowledgeBaseResponseBodyData extends TeaModel {
        /**
         * <p>The list of matched chunks, sorted by relevance.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DocumentId&quot;:&quot;doc-bp1xxxxxxxxxxxx&quot;,&quot;ChunkSeq&quot;:3,&quot;Content&quot;:&quot;EventBridge supports event routing&quot;}]</p>
         */
        @NameInMap("Chunks")
        public java.util.List<KnowledgeBaseSearchChunk> chunks;

        /**
         * <p>The server-side processing duration of this search. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("TimeSpent")
        public Long timeSpent;

        public static SearchKnowledgeBaseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchKnowledgeBaseResponseBodyData self = new SearchKnowledgeBaseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchKnowledgeBaseResponseBodyData setChunks(java.util.List<KnowledgeBaseSearchChunk> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<KnowledgeBaseSearchChunk> getChunks() {
            return this.chunks;
        }

        public SearchKnowledgeBaseResponseBodyData setTimeSpent(Long timeSpent) {
            this.timeSpent = timeSpent;
            return this;
        }
        public Long getTimeSpent() {
            return this.timeSpent;
        }

    }

}
