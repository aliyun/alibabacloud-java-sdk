// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListKnowledgeBasesResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates that the call was successful. If the call failed, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result of the knowledge base list, including knowledge base entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListKnowledgeBasesResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value Operation success is returned if the call was successful. A specific error description is returned if the call failed.</p>
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

    public static ListKnowledgeBasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBasesResponseBody self = new ListKnowledgeBasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeBasesResponseBody setData(ListKnowledgeBasesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeBasesResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeBasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeBasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgeBasesResponseBodyData extends TeaModel {
        /**
         * <p>The list of knowledge base entries.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;KnowledgeBaseName&quot;:&quot;my-knowledge-base&quot;,&quot;Status&quot;:&quot;ACTIVE&quot;}]</p>
         */
        @NameInMap("KnowledgeBases")
        public java.util.List<KnowledgeBase> knowledgeBases;

        /**
         * <p>The maximum number of results per page that was applied to this request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The pagination token (an opaque string) for the next page. Pass this value as the NextToken parameter in the next request to retrieve the next page. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>ca1eb85f5d99c7d6a97e6****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of knowledge bases that match the filter conditions. Use an empty NextToken value as the termination condition for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListKnowledgeBasesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBasesResponseBodyData self = new ListKnowledgeBasesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBasesResponseBodyData setKnowledgeBases(java.util.List<KnowledgeBase> knowledgeBases) {
            this.knowledgeBases = knowledgeBases;
            return this;
        }
        public java.util.List<KnowledgeBase> getKnowledgeBases() {
            return this.knowledgeBases;
        }

        public ListKnowledgeBasesResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListKnowledgeBasesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListKnowledgeBasesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
