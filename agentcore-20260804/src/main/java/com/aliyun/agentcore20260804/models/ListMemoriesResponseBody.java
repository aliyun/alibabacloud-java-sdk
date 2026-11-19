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
     * <p>The list of memories.</p>
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

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

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

    public ListMemoriesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMemoriesResponseBodyItemsContent extends TeaModel {
        /**
         * <p>The memory text.</p>
         * <p>This parameter is required.</p>
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
         * <p>The agent ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with an agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The session ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business team ID defined by the caller. This field cannot be empty when provided and can be up to 128 UTF-8 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The user ID. The length is limited to 1 to 128 UTF-8 bytes. The value cannot contain a forward slash (/) or an asterisk (*). This field is not returned if the memory is not associated with a user ID.</p>
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

        public ListMemoriesResponseBodyItemsScope setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
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
         * <p>The creation time. The time is in RFC 3339 format. The Z at the end of the example indicates the UTC time zone.</p>
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
         * 
         * <strong>example:</strong>
         * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The memory scope.</p>
         */
        @NameInMap("scope")
        public ListMemoriesResponseBodyItemsScope scope;

        /**
         * <p>The source of the memory. Valid values:</p>
         * <ul>
         * <li>session_extraction: Extracted from session events.</li>
         * <li>content_extraction: Extracted from text or messages.</li>
         * <li>direct: Written directly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>session_extraction</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The memory content type. Valid values:</p>
         * <ul>
         * <li>semantic: Semantic memory.</li>
         * <li>skill: Skill.</li>
         * <li>user_profile: User preference.</li>
         * <li>session_summary: Session summary.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>semantic</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The last update time. The time is in RFC 3339 format. The Z at the end of the example indicates the UTC time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:05:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>Indicates whether the memory is valid. A value of false indicates that the memory is revoked and is not included in valid memory retrieval.</p>
         */
        @NameInMap("valid")
        public Boolean valid;

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

        public ListMemoriesResponseBodyItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListMemoriesResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMemoriesResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListMemoriesResponseBodyItems setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
