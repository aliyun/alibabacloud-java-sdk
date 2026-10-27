// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemoriesResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list of memory records.</p>
     */
    @NameInMap("items")
    public java.util.List<ListMemoriesResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjEwfQ==</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemoriesResponseBody self = new ListMemoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemoriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMemoriesResponseBody setItems(java.util.List<ListMemoriesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMemoriesResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMemoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMemoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMemoriesResponseBodyItemsContent extends TeaModel {
        /**
         * <p>The memory text.</p>
         * 
         * <strong>example:</strong>
         * <p>The user likes hiking</p>
         */
        @NameInMap("text")
        public String text;

        public static ListMemoriesResponseBodyItemsContent build(java.util.Map<String, ?> map) throws Exception {
            ListMemoriesResponseBodyItemsContent self = new ListMemoriesResponseBodyItemsContent();
            return TeaModel.build(map, self);
        }

        public ListMemoriesResponseBodyItemsContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ListMemoriesResponseBodyItemsScope extends TeaModel {
        /**
         * <p>The agent ID. The value must be 1 to 128 bytes in length and encoded in UTF-8. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with an agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The session ID. The value must be 1 to 128 bytes in length and encoded in UTF-8. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The user ID. The value must be 1 to 128 bytes in length and encoded in UTF-8. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListMemoriesResponseBodyItemsScope build(java.util.Map<String, ?> map) throws Exception {
            ListMemoriesResponseBodyItemsScope self = new ListMemoriesResponseBodyItemsScope();
            return TeaModel.build(map, self);
        }

        public ListMemoriesResponseBodyItemsScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListMemoriesResponseBodyItemsScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListMemoriesResponseBodyItemsScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListMemoriesResponseBodyItems extends TeaModel {
        /**
         * <p>The memory content.</p>
         */
        @NameInMap("content")
        public ListMemoriesResponseBodyItemsContent content;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The long-term memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        /**
         * <p>The memory metadata.</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The memory scope.</p>
         */
        @NameInMap("scope")
        public ListMemoriesResponseBodyItemsScope scope;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static ListMemoriesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMemoriesResponseBodyItems self = new ListMemoriesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMemoriesResponseBodyItems setContent(ListMemoriesResponseBodyItemsContent content) {
            this.content = content;
            return this;
        }
        public ListMemoriesResponseBodyItemsContent getContent() {
            return this.content;
        }

        public ListMemoriesResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMemoriesResponseBodyItems setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public ListMemoriesResponseBodyItems setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public ListMemoriesResponseBodyItems setScope(ListMemoriesResponseBodyItemsScope scope) {
            this.scope = scope;
            return this;
        }
        public ListMemoriesResponseBodyItemsScope getScope() {
            return this.scope;
        }

        public ListMemoriesResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
