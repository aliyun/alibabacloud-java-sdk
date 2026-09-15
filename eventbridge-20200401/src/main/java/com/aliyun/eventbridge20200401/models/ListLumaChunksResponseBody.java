// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaChunksResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates that the call succeeded. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The chunk list result, which contains chunk entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListLumaChunksResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. Use this ID for troubleshooting and when submitting a ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLumaChunksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaChunksResponseBody self = new ListLumaChunksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaChunksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaChunksResponseBody setData(ListLumaChunksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaChunksResponseBodyData getData() {
        return this.data;
    }

    public ListLumaChunksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaChunksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaChunksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaChunksResponseBodyData extends TeaModel {
        /**
         * <p>The list of chunk entries.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DocumentId&quot;:&quot;doc-bp1xxxxxxxxxxxx&quot;,&quot;ChunkSeq&quot;:1}]</p>
         */
        @NameInMap("Chunks")
        public java.util.List<KnowledgeBaseChunk> chunks;

        /**
         * <p>The pagination token for the next page (an opaque string). Pass this value as the NextToken parameter in the next request to retrieve the next page. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>ca1eb85f5d99c7d6a97e6****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of chunks in the document.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLumaChunksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaChunksResponseBodyData self = new ListLumaChunksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaChunksResponseBodyData setChunks(java.util.List<KnowledgeBaseChunk> chunks) {
            this.chunks = chunks;
            return this;
        }
        public java.util.List<KnowledgeBaseChunk> getChunks() {
            return this.chunks;
        }

        public ListLumaChunksResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLumaChunksResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
