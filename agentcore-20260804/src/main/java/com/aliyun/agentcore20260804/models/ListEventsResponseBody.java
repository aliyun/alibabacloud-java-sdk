// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListEventsResponseBody extends TeaModel {
    /**
     * <p>The business result code.</p>
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
     * <p>The results on the current page.</p>
     */
    @NameInMap("items")
    public java.util.List<ListEventsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries per page used in the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The request processing message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The next page token. An empty value indicates that all data has been read.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwMH0=</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. For batch operations, you must still check the result of each item.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records. This field is empty if the exact total count is not provided.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEventsResponseBody self = new ListEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListEventsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListEventsResponseBody setItems(java.util.List<ListEventsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListEventsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListEventsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListEventsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListEventsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListEventsResponseBodyItemsDataContent extends TeaModel {
        /**
         * <p>The JSON parameter values, which are required for tool_call blocks. Unparsed raw strings can be retained.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
         */
        @NameInMap("arguments")
        public Object arguments;

        /**
         * <p>The logical call ID, which is required for tool_call blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>call-001</p>
         */
        @NameInMap("callId")
        public String callId;

        /**
         * <p>The access format identifier, which is required for opaque blocks. Saving the format does not mean its content can be interpreted or used across platforms.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>The tool name, which is required for tool_call blocks. This content block only expresses the call intent.</p>
         * 
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The actual text, which is required for text and reasoning blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>The user likes hiking</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>The content block type. This field determines the required fields.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The JSON value, which is required for json and opaque blocks. The data field is not used for opaque blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;preference&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("value")
        public Object value;

        public static ListEventsResponseBodyItemsDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyItemsDataContent self = new ListEventsResponseBodyItemsDataContent();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyItemsDataContent setArguments(Object arguments) {
            this.arguments = arguments;
            return this;
        }
        public Object getArguments() {
            return this.arguments;
        }

        public ListEventsResponseBodyItemsDataContent setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListEventsResponseBodyItemsDataContent setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public ListEventsResponseBodyItemsDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListEventsResponseBodyItemsDataContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListEventsResponseBodyItemsDataContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListEventsResponseBodyItemsDataContent setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class ListEventsResponseBodyItemsDataParentScope extends TeaModel {
        /**
         * <p>The business agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The exact session ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The business user ID. This is not the platform tenant identity.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListEventsResponseBodyItemsDataParentScope build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyItemsDataParentScope self = new ListEventsResponseBodyItemsDataParentScope();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyItemsDataParentScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListEventsResponseBodyItemsDataParentScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListEventsResponseBodyItemsDataParentScope setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public ListEventsResponseBodyItemsDataParentScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListEventsResponseBodyItemsData extends TeaModel {
        /**
         * <p>The call ID, which is required for tool_call, tool_result, or messages with role=tool. It associates the call intent, actual execution, and feedback.</p>
         * 
         * <strong>example:</strong>
         * <p>call-001</p>
         */
        @NameInMap("callId")
        public String callId;

        /**
         * <p>The ordered content blocks, which are required for message and tool_result events. Use a text block for plain text. This can be an empty array if the tool has no output.</p>
         */
        @NameInMap("content")
        public java.util.List<ListEventsResponseBodyItemsDataContent> content;

        /**
         * <p>The list of visible event IDs referenced by the summary. This list cannot be empty.</p>
         */
        @NameInMap("eventIds")
        public java.util.List<String> eventIds;

        /**
         * <p>The parent session anchor, which is required for session_fork events. The child session continues from the valid context at this anchor and does not inherit interactions after the anchor.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("parentEventId")
        public String parentEventId;

        /**
         * <p>The business positioning of the parent session, which is required for session_fork events. The event is written to the child session, and the requested scope is the child session.</p>
         */
        @NameInMap("parentScope")
        public ListEventsResponseBodyItemsDataParentScope parentScope;

        /**
         * <p>The message role, which is required for message events.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The readable summary, which is optional for context_update events.</p>
         * 
         * <strong>example:</strong>
         * <p>The user plans to go hiking on the weekend</p>
         */
        @NameInMap("summary")
        public String summary;

        public static ListEventsResponseBodyItemsData build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyItemsData self = new ListEventsResponseBodyItemsData();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyItemsData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ListEventsResponseBodyItemsData setContent(java.util.List<ListEventsResponseBodyItemsDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListEventsResponseBodyItemsDataContent> getContent() {
            return this.content;
        }

        public ListEventsResponseBodyItemsData setEventIds(java.util.List<String> eventIds) {
            this.eventIds = eventIds;
            return this;
        }
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        public ListEventsResponseBodyItemsData setParentEventId(String parentEventId) {
            this.parentEventId = parentEventId;
            return this;
        }
        public String getParentEventId() {
            return this.parentEventId;
        }

        public ListEventsResponseBodyItemsData setParentScope(ListEventsResponseBodyItemsDataParentScope parentScope) {
            this.parentScope = parentScope;
            return this;
        }
        public ListEventsResponseBodyItemsDataParentScope getParentScope() {
            return this.parentScope;
        }

        public ListEventsResponseBodyItemsData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListEventsResponseBodyItemsData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class ListEventsResponseBodyItemsScope extends TeaModel {
        /**
         * <p>The business agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The exact session ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business team ID.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The business user ID. This is not the platform tenant identity.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static ListEventsResponseBodyItemsScope build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyItemsScope self = new ListEventsResponseBodyItemsScope();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyItemsScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListEventsResponseBodyItemsScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListEventsResponseBodyItemsScope setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public ListEventsResponseBodyItemsScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListEventsResponseBodyItems extends TeaModel {
        /**
         * <p>The event-specific data. Use the corresponding fields based on the type. For conditional requirements, refer to the description of each field.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("data")
        public ListEventsResponseBodyItemsData data;

        /**
         * <p>The stable event ID generated by the server. It is used for referencing, locating, and deleting events. It does not represent the business sequence, and no separate messageId is provided.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <p>The time when the event reaches the server, in Unix milliseconds. It is used for asynchronous processing and not for historical business sorting.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1758614401000</p>
         */
        @NameInMap("receivedAt")
        public Long receivedAt;

        /**
         * <p>The session to which the event belongs.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("scope")
        public ListEventsResponseBodyItemsScope scope;

        /**
         * <p>The actual occurrence time provided by the client, in Unix milliseconds. This is the only source for business sorting. Identical values do not indicate a known sequence, and the array position does not imply a business sequence.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1758614400000</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The event type. This determines the applicable fields and conditional requirements for the data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        @NameInMap("type")
        public String type;

        public static ListEventsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListEventsResponseBodyItems self = new ListEventsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListEventsResponseBodyItems setData(ListEventsResponseBodyItemsData data) {
            this.data = data;
            return this;
        }
        public ListEventsResponseBodyItemsData getData() {
            return this.data;
        }

        public ListEventsResponseBodyItems setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public ListEventsResponseBodyItems setReceivedAt(Long receivedAt) {
            this.receivedAt = receivedAt;
            return this;
        }
        public Long getReceivedAt() {
            return this.receivedAt;
        }

        public ListEventsResponseBodyItems setScope(ListEventsResponseBodyItemsScope scope) {
            this.scope = scope;
            return this;
        }
        public ListEventsResponseBodyItemsScope getScope() {
            return this.scope;
        }

        public ListEventsResponseBodyItems setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListEventsResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
