// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListChunksResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful call. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The chunk list query result, which contains chunk entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListChunksResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
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

    public static ListChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChunksResponseBody self = new ListChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChunksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChunksResponseBody setData(ListChunksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListChunksResponseBodyData getData() {
        return this.data;
    }

    public ListChunksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChunksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChunksResponseBodyData extends TeaModel {
        /**
         * <p>The list of chunk entries.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DocumentId&quot;:&quot;doc-bp1xxxxxxxxxxxx&quot;,&quot;ChunkSeq&quot;:1,&quot;Content&quot;:&quot;EventBridge supports event routing&quot;}]</p>
         */
        @NameInMap("Chunks")
        public java.util.List<KnowledgeBaseChunk> chunks;

        /**
         * <p>The maximum number of results per page that took effect for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token for the next page (an opaque string). Pass this value as the NextToken parameter in the next request to retrieve the next page. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>ca1eb85f5d99c7d6a97e6****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of chunks in the specified document when DocumentId is specified. In full knowledge base mode (when DocumentId is not specified), this field is not returned. Pagination ends when NextToken is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListChunksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChunksResponseBodyData self = new ListChunksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChunksResponseBodyData setChunks(java.util.List<KnowledgeBaseChunk> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<KnowledgeBaseChunk> getChunks() {
            return this.chunks;
        }

        public ListChunksResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListChunksResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListChunksResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
