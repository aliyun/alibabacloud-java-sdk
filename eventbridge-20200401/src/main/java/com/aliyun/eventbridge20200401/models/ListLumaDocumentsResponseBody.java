// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListLumaDocumentsResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of Success indicates that the call succeeds. If the call fails, a specific error code is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The document list result, which contains document entries and pagination information.</p>
     */
    @NameInMap("Data")
    public ListLumaDocumentsResponseBodyData data;

    /**
     * <p>The message returned by the operation. The value is Operation success if the call succeeds, or a specific error description if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>Operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request. You can use this ID for troubleshooting and when you submit a ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>34AD682D-5B91-5773-8132-AA38C130****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates that the call succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListLumaDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLumaDocumentsResponseBody self = new ListLumaDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLumaDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListLumaDocumentsResponseBody setData(ListLumaDocumentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListLumaDocumentsResponseBodyData getData() {
        return this.data;
    }

    public ListLumaDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLumaDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLumaDocumentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListLumaDocumentsResponseBodyData extends TeaModel {
        /**
         * <p>The list of document entries.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;DocumentId&quot;:&quot;doc-bp1xxxxxxxxxxxx&quot;,&quot;FileName&quot;:&quot;manual.pdf&quot;,&quot;Status&quot;:&quot;COMPLETED&quot;}]</p>
         */
        @NameInMap("Documents")
        public java.util.List<KnowledgeBaseDocument> documents;

        /**
         * <p>The pagination token for the next page. This is an opaque string. Pass this value as the NextToken parameter in the next request to retrieve the next page. An empty value indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>ca1eb85f5d99c7d6a97e6****</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        /**
         * <p>The total number of documents that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListLumaDocumentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListLumaDocumentsResponseBodyData self = new ListLumaDocumentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListLumaDocumentsResponseBodyData setDocuments(java.util.List<KnowledgeBaseDocument> documents) {
            this.documents = documents;
            return this;
        }
        public java.util.List<KnowledgeBaseDocument> getDocuments() {
            return this.documents;
        }

        public ListLumaDocumentsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListLumaDocumentsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
