// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseAdministratorsResponseBody extends TeaModel {
    /**
     * <p>The business error code, which is used to determine the error type when the request fails.</p>
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
    public ListKnowledgeBaseAdministratorsResponseBodyData data;

    /**
     * <p>The security error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request parameters are invalid</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request, which can be used to troubleshoot issues.</p>
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

    public static ListKnowledgeBaseAdministratorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseAdministratorsResponseBody self = new ListKnowledgeBaseAdministratorsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseAdministratorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListKnowledgeBaseAdministratorsResponseBody setData(ListKnowledgeBaseAdministratorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListKnowledgeBaseAdministratorsResponseBodyData getData() {
        return this.data;
    }

    public ListKnowledgeBaseAdministratorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListKnowledgeBaseAdministratorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListKnowledgeBaseAdministratorsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators extends TeaModel {
        /**
         * <p>The creation time of the record, represented as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1790200400000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The display name of the user. This field is optional and is not used to verify the user’s identity.</p>
         * 
         * <strong>example:</strong>
         * <p>User A</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The ID of the knowledge base.</p>
         * 
         * <strong>example:</strong>
         * <p>12345678-1234-4234-8234-123456789abc</p>
         */
        @NameInMap("KnowledgeBaseId")
        public String knowledgeBaseId;

        /**
         * <p>The DataWorks user ID of the administrator.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000000000</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators self = new ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators setKnowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        public ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListKnowledgeBaseAdministratorsResponseBodyData extends TeaModel {
        /**
         * <p>The administrators on the current page, excluding the owner.</p>
         */
        @NameInMap("KnowledgeBaseAdministrators")
        public java.util.List<ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators> knowledgeBaseAdministrators;

        /**
         * <p>The maximum number of entries per page used for the current request. If the input parameter is omitted, the value is 20. This is not the actual number of entries returned on the current page.</p>
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

        public static ListKnowledgeBaseAdministratorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListKnowledgeBaseAdministratorsResponseBodyData self = new ListKnowledgeBaseAdministratorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListKnowledgeBaseAdministratorsResponseBodyData setKnowledgeBaseAdministrators(java.util.List<ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators> knowledgeBaseAdministrators) {
            this.knowledgeBaseAdministrators = knowledgeBaseAdministrators;
            return this;
        }
        public java.util.List<ListKnowledgeBaseAdministratorsResponseBodyDataKnowledgeBaseAdministrators> getKnowledgeBaseAdministrators() {
            return this.knowledgeBaseAdministrators;
        }

        public ListKnowledgeBaseAdministratorsResponseBodyData setMaxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }
        public Integer getMaxResults() {
            return this.maxResults;
        }

        public ListKnowledgeBaseAdministratorsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
