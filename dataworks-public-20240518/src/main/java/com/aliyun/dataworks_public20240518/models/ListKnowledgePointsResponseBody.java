// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgePointsResponseBody extends TeaModel {
    /**
     * <p>The business error code. This field may be omitted if the request succeeds. If the request fails, the common error response protocol applies.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The summaries of the knowledge points on the current page and the cursor for the next page.</p>
     */
    @NameInMap("Data")
    public ListKnowledgePointsResponseBodyData data;

    /**
     * <p>The maximum number of knowledge bases to return per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A human-readable description of the business error. This field may be omitted if the request succeeds. Provide the RequestId when troubleshooting failures.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListKnowledgePointsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgePointsResponseBody self = new ListKnowledgePointsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgePointsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgePointsResponseBody setData(ListKnowledgePointsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgePointsResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgePointsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListKnowledgePointsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgePointsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgePointsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgePointsResponseBodyDataKnowledgePoints extends TeaModel {
        /**
         * <p>The read identifier of the current knowledge point. For GRAPH, it is the ID of the local graph entry node. For WIKI, it is the page ID. For KNOWLEDGE_CONTENT, it is the content ID. Use this value as is in the GetKnowledgePoint operation without parsing or concatenation.</p>
         * 
         * <strong>example:</strong>
         * <p>node-sales</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The ID of the knowledge base to which the knowledge point belongs. This ID is used together with Type and Id to locate the knowledge point.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The readable summary of the knowledge point. The summary is not guaranteed to contain the complete content. To obtain the details, call the GetKnowledgePoint operation.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales metrics and their associated order tables</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The readable title of the knowledge point. For GRAPH, the name of the entry node is used.</p>
         * 
         * <strong>example:</strong>
         * <p>Sales</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The read category of the knowledge point. Valid values:</p>
         * <ul>
         * <li>GRAPH: local graph.</li>
         * <li>WIKI: topic page.</li>
         * <li>KNOWLEDGE_CONTENT: knowledge content.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GRAPH</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListKnowledgePointsResponseBodyDataKnowledgePoints build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgePointsResponseBodyDataKnowledgePoints self = new ListKnowledgePointsResponseBodyDataKnowledgePoints();
            return TeaModel.build(map, self);
        }

        public ListKnowledgePointsResponseBodyDataKnowledgePoints setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListKnowledgePointsResponseBodyDataKnowledgePoints setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgePointsResponseBodyDataKnowledgePoints setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public ListKnowledgePointsResponseBodyDataKnowledgePoints setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListKnowledgePointsResponseBodyDataKnowledgePoints setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListKnowledgePointsResponseBodyData extends TeaModel {
        /**
         * <p>The summaries of the knowledge points that the current caller has permission to read on the current page. The KnowledgeBaseId, Type, and Id of each item can be directly used in the GetKnowledgePoint operation.</p>
         */
        @NameInMap("KnowledgePoints")
        public java.util.List<ListKnowledgePointsResponseBodyDataKnowledgePoints> knowledgePoints;

        /**
         * <p>The pagination cursor. Do not specify this parameter for the first page. For subsequent pages, pass the NextToken value returned in the previous response as is, and keep the knowledge base, type, and page size unchanged. An empty cursor indicates that no more data is available. If the current page is empty but the cursor is not empty, continue querying.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListKnowledgePointsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgePointsResponseBodyData self = new ListKnowledgePointsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgePointsResponseBodyData setKnowledgePoints(java.util.List<ListKnowledgePointsResponseBodyDataKnowledgePoints> knowledgePoints) {
            this.knowledgePoints = knowledgePoints;
            return this;
        }
        public java.util.List<ListKnowledgePointsResponseBodyDataKnowledgePoints> getKnowledgePoints() {
            return this.knowledgePoints;
        }

        public ListKnowledgePointsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
