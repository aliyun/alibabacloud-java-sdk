// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMemorySessionsResponseBody extends TeaModel {
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
     * <p>The list of sessions.</p>
     */
    @NameInMap("items")
    public java.util.List<ListMemorySessionsResponseBodyItems> items;

    /**
     * <p>The maximum number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
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
     * <p>eyJvZmZzZXQiOjEwMH0=</p>
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

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListMemorySessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMemorySessionsResponseBody self = new ListMemorySessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMemorySessionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMemorySessionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMemorySessionsResponseBody setItems(java.util.List<ListMemorySessionsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMemorySessionsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMemorySessionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMemorySessionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMemorySessionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMemorySessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMemorySessionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMemorySessionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMemorySessionsResponseBodyItems extends TeaModel {
        /**
         * <p>The agent ID. This field is not returned if the session is not associated with an agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The creation time in RFC 3339 format with time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The string key-value tags set by the caller. A maximum of 16 tags are supported. A key can be up to 64 Unicode characters in length, and a value can be up to 1,024 Unicode characters in length. Empty strings are allowed. Nested objects or arrays are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business team ID defined by the caller. If specified, the value cannot be empty and can be up to 128 UTF-8 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The session title.</p>
         * 
         * <strong>example:</strong>
         * <p>Travel plan</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The user ID. This field is not returned if the session is not associated with a user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListMemorySessionsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMemorySessionsResponseBodyItems self = new ListMemorySessionsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMemorySessionsResponseBodyItems setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListMemorySessionsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMemorySessionsResponseBodyItems setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public ListMemorySessionsResponseBodyItems setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListMemorySessionsResponseBodyItems setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public ListMemorySessionsResponseBodyItems setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListMemorySessionsResponseBodyItems setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
