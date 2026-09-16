// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates that the call was successful. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of knowledge bases bound to the agent, including entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListLumaKnowledgeBasesResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value Operation success is returned if the call was successful. A specific error description is returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. Use this ID for troubleshooting and when you submit a ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLumaKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaKnowledgeBasesResponseBody self = new ListLumaKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaKnowledgeBasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaKnowledgeBasesResponseBody setData(ListLumaKnowledgeBasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaKnowledgeBasesResponseBodyData getData() {
        return this.data;
    }

    public ListLumaKnowledgeBasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaKnowledgeBasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaKnowledgeBasesResponseBodyData extends TeaModel {
        /**
         * <p>The list of knowledge bases bound to the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;KnowledgeBaseName&quot;:&quot;my-knowledge-base&quot;}]</p>
         */
        @NameInMap("KnowledgeBases")
        public java.util.List<KnowledgeBase> knowledgeBases;

        /**
         * <p>The maximum number of results per page that takes effect for this request. If MaxResults is not specified, this value is the server default. If the specified value exceeds the upper limit, this value is the adjusted value.</p>
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
         * <p>The total number of knowledge bases bound to the agent, regardless of the number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLumaKnowledgeBasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaKnowledgeBasesResponseBodyData self = new ListLumaKnowledgeBasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaKnowledgeBasesResponseBodyData setKnowledgeBases(java.util.List<KnowledgeBase> knowledgeBases) {
            this.knowledgeBases = knowledgeBases;
            return this;
        }
        public java.util.List<KnowledgeBase> getKnowledgeBases() {
            return this.knowledgeBases;
        }

        public ListLumaKnowledgeBasesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListLumaKnowledgeBasesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLumaKnowledgeBasesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
