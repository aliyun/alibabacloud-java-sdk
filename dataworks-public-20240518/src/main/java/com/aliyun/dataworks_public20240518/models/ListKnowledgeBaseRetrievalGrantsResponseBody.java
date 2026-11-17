// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseRetrievalGrantsResponseBody extends TeaModel {
    /**
     * <p>The business error code. You can use this code to determine the error type when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The business data returned when the request is successful.</p>
     */
    @NameInMap("Data")
    public ListKnowledgeBaseRetrievalGrantsResponseBodyData data;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use this ID to troubleshoot issues.</p>
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

    public static ListKnowledgeBaseRetrievalGrantsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseRetrievalGrantsResponseBody self = new ListKnowledgeBaseRetrievalGrantsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseRetrievalGrantsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeBaseRetrievalGrantsResponseBody setData(ListKnowledgeBaseRetrievalGrantsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeBaseRetrievalGrantsResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeBaseRetrievalGrantsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeBaseRetrievalGrantsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBaseRetrievalGrantsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants extends TeaModel {
        /**
         * <p>The knowledge base ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The DataWorks user ID of the principal that receives the share. When a principal is added, the system verifies whether the user is a member of the same tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("PrincipalId")
        public String principalId;

        /**
         * <p>The type of principal that receives the share. Default value: USER. Only USER is supported in the initial release.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("PrincipalType")
        public String principalType;

        public static ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants self = new ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants setPrincipalId(String principalId) {
            this.principalId = principalId;
            return this;
        }
        public String getPrincipalId() {
            return this.principalId;
        }

        public ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants setPrincipalType(String principalType) {
            this.principalType = principalType;
            return this;
        }
        public String getPrincipalType() {
            return this.principalType;
        }

    }

    public static class ListKnowledgeBaseRetrievalGrantsResponseBodyData extends TeaModel {
        /**
         * <p>The user grants on the current page.</p>
         */
        @NameInMap("KnowledgeBaseRetrievalGrants")
        public java.util.List<ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants> knowledgeBaseRetrievalGrants;

        /**
         * <p>The maximum number of entries per page used in the current request. If you do not specify this parameter in the request, the value is 20. This value is not the actual number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxResults")
        public Integer maxResults;

        /**
         * <p>The cursor for the next page. If no subsequent pages exist, null is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwfQ</p>
         */
        @NameInMap("NextToken")
        public String nextToken;

        public static ListKnowledgeBaseRetrievalGrantsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseRetrievalGrantsResponseBodyData self = new ListKnowledgeBaseRetrievalGrantsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseRetrievalGrantsResponseBodyData setKnowledgeBaseRetrievalGrants(java.util.List<ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants> knowledgeBaseRetrievalGrants) {
            this.knowledgeBaseRetrievalGrants = knowledgeBaseRetrievalGrants;
            return this;
        }
        public java.util.List<ListKnowledgeBaseRetrievalGrantsResponseBodyDataKnowledgeBaseRetrievalGrants> getKnowledgeBaseRetrievalGrants() {
            return this.knowledgeBaseRetrievalGrants;
        }

        public ListKnowledgeBaseRetrievalGrantsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListKnowledgeBaseRetrievalGrantsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
