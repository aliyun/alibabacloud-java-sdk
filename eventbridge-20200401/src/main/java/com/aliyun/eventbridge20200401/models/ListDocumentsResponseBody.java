// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListDocumentsResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates a successful operation. If the operation fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The document list query result, which contains document entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListDocumentsResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the operation succeeds, or a specific error description if the operation fails.</p>
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
     * <p>Indicates whether the call is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDocumentsResponseBody self = new ListDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDocumentsResponseBody setData(ListDocumentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListDocumentsResponseBodyData getData() {
        return this.data;
    }

    public ListDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDocumentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDocumentsResponseBodyData extends TeaModel {
        /**
         * <p>The list of document entries in the knowledge base. Each entry contains information such as the document ID, file name, processing status, size, number of chunks, and metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DocumentId&quot;:&quot;doc-bp1xxxxxxxxxxxx&quot;,&quot;FileName&quot;:&quot;manual.pdf&quot;,&quot;Status&quot;:&quot;COMPLETED&quot;,&quot;ChunkCount&quot;:120}]</p>
         */
        @NameInMap("Documents")
        public java.util.List<KnowledgeBaseDocument> documents;

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
         * <p>The total number of documents that match the filter conditions. Use an empty NextToken value as the termination condition for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListDocumentsResponseBodyData self = new ListDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListDocumentsResponseBodyData setDocuments(java.util.List<KnowledgeBaseDocument> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<KnowledgeBaseDocument> getDocuments() {
            return this.documents;
        }

        public ListDocumentsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListDocumentsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListDocumentsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
