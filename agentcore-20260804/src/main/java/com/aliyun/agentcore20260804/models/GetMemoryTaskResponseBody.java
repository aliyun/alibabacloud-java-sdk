// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMemoryTaskResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("data")
    public GetMemoryTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

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

    public static GetMemoryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryTaskResponseBody self = new GetMemoryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemoryTaskResponseBody setData(GetMemoryTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMemoryTaskResponseBodyData getData() {
        return this.data;
    }

    public GetMemoryTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMemoryTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMemoryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMemoryTaskResponseBodyDataChanges extends TeaModel {
        /**
         * <p>The unique identifier of the memory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        /**
         * <p>The memory change type. Valid values:</p>
         * <ul>
         * <li>ADD: Adds a memory.</li>
         * <li>UPDATE: Updates a memory.</li>
         * <li>DELETE: Deletes a memory.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD</p>
         */
        @NameInMap("operation")
        public String operation;

        public static GetMemoryTaskResponseBodyDataChanges build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataChanges self = new GetMemoryTaskResponseBodyDataChanges();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataChanges setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

        public GetMemoryTaskResponseBodyDataChanges setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

    public static class GetMemoryTaskResponseBodyDataError extends TeaModel {
        /**
         * <p>The task error code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The task error message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Memory extraction failed.</p>
         */
        @NameInMap("message")
        public String message;

        public static GetMemoryTaskResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataError self = new GetMemoryTaskResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMemoryTaskResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetMemoryTaskResponseBodyDataInputEventsDataContent extends TeaModel {
        /**
         * <p>The tool invocation parameters. This field is required for tool_call content blocks and supports JSON values.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
         */
        @NameInMap("arguments")
        public Object arguments;

        /**
         * <p>The tool invocation ID. This field is required for tool_call content blocks and is used to associate subsequent tool messages.</p>
         * 
         * <strong>example:</strong>
         * <p>call-001</p>
         */
        @NameInMap("callId")
        public String callId;

        /**
         * <p>The data format identifier for the opaque content block. A non-empty string is required.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>The tool name. This field is required for the tool_call type.</p>
         * 
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The text of the text or reasoning content block. This field is required and can be an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>The user likes hiking</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>The type of the message content block. Valid values: text, reasoning, tool_call, json, and opaque.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The data carried by the content block. This field is required for json and opaque content blocks and supports JSON values.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;preference&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("value")
        public Object value;

        public static GetMemoryTaskResponseBodyDataInputEventsDataContent build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataInputEventsDataContent self = new GetMemoryTaskResponseBodyDataInputEventsDataContent();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataContent setArguments(Object arguments) {
            this.arguments = arguments;
            return this;
        }
        public Object getArguments() {
            return this.arguments;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataContent setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataContent setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataContent setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class GetMemoryTaskResponseBodyDataInputEventsDataParentScope extends TeaModel {
        /**
         * <p>The agent ID defined by the caller. If provided, it cannot be empty and can contain up to 128 UTF-8 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-001</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The session ID defined by the caller. If provided, it cannot be empty and can contain up to 128 UTF-8 bytes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session-001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The business team ID defined by the caller. If provided, it cannot be empty and can contain up to 128 UTF-8 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>team-001</p>
         */
        @NameInMap("teamId")
        public String teamId;

        /**
         * <p>The business user ID defined by the caller. If provided, it cannot be empty and can contain up to 128 UTF-8 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        @NameInMap("userId")
        public String userId;

        public static GetMemoryTaskResponseBodyDataInputEventsDataParentScope build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataInputEventsDataParentScope self = new GetMemoryTaskResponseBodyDataInputEventsDataParentScope();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataParentScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataParentScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataParentScope setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public GetMemoryTaskResponseBodyDataInputEventsDataParentScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class GetMemoryTaskResponseBodyDataInputEventsData extends TeaModel {
        /**
         * <p>The tool invocation ID. It is used to associate a tool invocation with its response message.</p>
         * 
         * <strong>example:</strong>
         * <p>call-001</p>
         */
        @NameInMap("callId")
        public String callId;

        /**
         * <p>The list of message content blocks. This field is required and can be an empty array.</p>
         */
        @NameInMap("content")
        public java.util.List<GetMemoryTaskResponseBodyDataInputEventsDataContent> content;

        /**
         * <p>The list of visible event IDs referenced by the summary. This field cannot be empty.</p>
         */
        @NameInMap("eventIds")
        public java.util.List<String> eventIds;

        /**
         * <p>The event ID that serves as the cutoff position for historical references in the parent session.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("parentEventId")
        public String parentEventId;

        /**
         * <p>The full association scope of the parent session. Each dimension must be consistent with those specified when the parent session was created.</p>
         */
        @NameInMap("parentScope")
        public GetMemoryTaskResponseBodyDataInputEventsDataParentScope parentScope;

        /**
         * <p>The message role. Valid values: system, developer, user, assistant, and tool. The tool role also requires a callId.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The summary content for the referenced events. This field cannot be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>The user plans a weekend hiking trip</p>
         */
        @NameInMap("summary")
        public String summary;

        public static GetMemoryTaskResponseBodyDataInputEventsData build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataInputEventsData self = new GetMemoryTaskResponseBodyDataInputEventsData();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataInputEventsData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public GetMemoryTaskResponseBodyDataInputEventsData setContent(java.util.List<GetMemoryTaskResponseBodyDataInputEventsDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<GetMemoryTaskResponseBodyDataInputEventsDataContent> getContent() {
            return this.content;
        }

        public GetMemoryTaskResponseBodyDataInputEventsData setEventIds(java.util.List<String> eventIds) {
            this.eventIds = eventIds;
            return this;
        }
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        public GetMemoryTaskResponseBodyDataInputEventsData setParentEventId(String parentEventId) {
            this.parentEventId = parentEventId;
            return this;
        }
        public String getParentEventId() {
            return this.parentEventId;
        }

        public GetMemoryTaskResponseBodyDataInputEventsData setParentScope(GetMemoryTaskResponseBodyDataInputEventsDataParentScope parentScope) {
            this.parentScope = parentScope;
            return this;
        }
        public GetMemoryTaskResponseBodyDataInputEventsDataParentScope getParentScope() {
            return this.parentScope;
        }

        public GetMemoryTaskResponseBodyDataInputEventsData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetMemoryTaskResponseBodyDataInputEventsData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class GetMemoryTaskResponseBodyDataInputEvents extends TeaModel {
        /**
         * <p>The event content. Select fields based on the event type. For message events, use role, content, and an optional callId. For compaction events, use eventIds and summary. For fork events, use parentScope and parentEventId. Do not mix fields from different event types.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("data")
        public GetMemoryTaskResponseBodyDataInputEventsData data;

        /**
         * <p>The unique identifier of the event.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("eventId")
        public String eventId;

        /**
         * <p>The actual occurrence time of the event in Unix milliseconds, provided by the caller.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1758614400000</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li>message: message</li>
         * <li>compaction: summary</li>
         * <li>fork: session branch</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMemoryTaskResponseBodyDataInputEvents build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataInputEvents self = new GetMemoryTaskResponseBodyDataInputEvents();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataInputEvents setData(GetMemoryTaskResponseBodyDataInputEventsData data) {
            this.data = data;
            return this;
        }
        public GetMemoryTaskResponseBodyDataInputEventsData getData() {
            return this.data;
        }

        public GetMemoryTaskResponseBodyDataInputEvents setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public GetMemoryTaskResponseBodyDataInputEvents setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetMemoryTaskResponseBodyDataInputEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMemoryTaskResponseBodyDataInputMessages extends TeaModel {
        /**
         * <p>The body content of the memory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>The user likes hiking</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>The reference time of this message in RFC 3339 format with time zone. If omitted, the request-level referenceTime is used. If both are omitted, the current request time is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-08T13:56:00+08:00</p>
         */
        @NameInMap("referenceTime")
        public String referenceTime;

        /**
         * <p>The message role. For example, user indicates the user, and assistant indicates the assistant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        public static GetMemoryTaskResponseBodyDataInputMessages build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataInputMessages self = new GetMemoryTaskResponseBodyDataInputMessages();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataInputMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetMemoryTaskResponseBodyDataInputMessages setReferenceTime(String referenceTime) {
            this.referenceTime = referenceTime;
            return this;
        }
        public String getReferenceTime() {
            return this.referenceTime;
        }

        public GetMemoryTaskResponseBodyDataInputMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class GetMemoryTaskResponseBodyDataInput extends TeaModel {
        /**
         * <p>The list of session events to be processed.</p>
         */
        @NameInMap("events")
        public java.util.List<GetMemoryTaskResponseBodyDataInputEvents> events;

        /**
         * <p>The list of messages to be processed.</p>
         */
        @NameInMap("messages")
        public java.util.List<GetMemoryTaskResponseBodyDataInputMessages> messages;

        /**
         * <p>The string key-value tags set by the caller. A maximum of 16 tags are supported. A key can contain up to 64 Unicode characters, and a value can contain up to 1024 Unicode characters. Empty strings are allowed. Nested objects or arrays are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The reference time for interpreting relative times in the content, in RFC 3339 format with a time zone. If not provided, the time of the current request is used.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-08T13:56:00+08:00</p>
         */
        @NameInMap("referenceTime")
        public String referenceTime;

        /**
         * <p>The raw text to be extracted for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>The user likes hiking</p>
         */
        @NameInMap("text")
        public String text;

        /**
         * <p>The input content format. Valid values:</p>
         * <ul>
         * <li>text: text</li>
         * <li>messages: message list</li>
         * <li>events: event list</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>events</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMemoryTaskResponseBodyDataInput build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataInput self = new GetMemoryTaskResponseBodyDataInput();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataInput setEvents(java.util.List<GetMemoryTaskResponseBodyDataInputEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<GetMemoryTaskResponseBodyDataInputEvents> getEvents() {
            return this.events;
        }

        public GetMemoryTaskResponseBodyDataInput setMessages(java.util.List<GetMemoryTaskResponseBodyDataInputMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<GetMemoryTaskResponseBodyDataInputMessages> getMessages() {
            return this.messages;
        }

        public GetMemoryTaskResponseBodyDataInput setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public GetMemoryTaskResponseBodyDataInput setReferenceTime(String referenceTime) {
            this.referenceTime = referenceTime;
            return this;
        }
        public String getReferenceTime() {
            return this.referenceTime;
        }

        public GetMemoryTaskResponseBodyDataInput setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetMemoryTaskResponseBodyDataInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMemoryTaskResponseBodyDataMemories extends TeaModel {
        /**
         * <p>The long-term memory ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        public static GetMemoryTaskResponseBodyDataMemories build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataMemories self = new GetMemoryTaskResponseBodyDataMemories();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataMemories setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

    }

    public static class GetMemoryTaskResponseBodyDataStrategyConfig extends TeaModel {
        /**
         * <p>The custom extraction instructions used to restrict the content to be retained. If a conflict occurs with the memory base extraction instructions, this rule prevails. The auto type does not support non-empty instructions.</p>
         * 
         * <strong>example:</strong>
         * <p>Retain only long-term preferences explicitly expressed by the user</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The memory extraction strategy type. Valid values:</p>
         * <ul>
         * <li>auto: automatic extraction that currently generates semantic memories</li>
         * <li>semantic: semantic memory</li>
         * <li>skill: skill</li>
         * <li>user_profile: user preference</li>
         * <li>session_summary: session summary</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMemoryTaskResponseBodyDataStrategyConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataStrategyConfig self = new GetMemoryTaskResponseBodyDataStrategyConfig();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataStrategyConfig setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public GetMemoryTaskResponseBodyDataStrategyConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMemoryTaskResponseBodyData extends TeaModel {
        /**
         * <p>The list of memory changes generated by the task, excluding memories that are not modified.</p>
         */
        @NameInMap("changes")
        public java.util.List<GetMemoryTaskResponseBodyDataChanges> changes;

        /**
         * <p>The creation time in RFC 3339 format with time zone.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The task error returned only when the status is FAILED or UNKNOWN. This does not indicate that the current query failed.</p>
         */
        @NameInMap("error")
        public GetMemoryTaskResponseBodyDataError error;

        /**
         * <p>The task completion time in RFC 3339 format with time zone. This field is not returned if the task has not finished.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:01Z</p>
         */
        @NameInMap("finishedAt")
        public String finishedAt;

        /**
         * <p>The input content processed by this task.</p>
         */
        @NameInMap("input")
        public GetMemoryTaskResponseBodyDataInput input;

        /**
         * <p>The number of messages, events, or text entries input for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("inputMessageCount")
        public Long inputMessageCount;

        /**
         * <p>The number of tokens in the input content for this task.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("inputTokenCount")
        public Long inputTokenCount;

        /**
         * <p>Returned only when the task succeeds. An empty array is allowed.</p>
         */
        @NameInMap("memories")
        public java.util.List<GetMemoryTaskResponseBodyDataMemories> memories;

        /**
         * <p>The task start time in RFC 3339 format with time zone. This field is not returned if the task has not started.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-23T10:00:00Z</p>
         */
        @NameInMap("startedAt")
        public String startedAt;

        /**
         * <p>The extraction task status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The extraction strategy used for this task.</p>
         */
        @NameInMap("strategyConfig")
        public GetMemoryTaskResponseBodyDataStrategyConfig strategyConfig;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>task-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("taskId")
        public String taskId;

        /**
         * <p>The task trigger type. Valid values:</p>
         * <ul>
         * <li>AUTO: Automatically triggered by session events.</li>
         * <li>MANUAL: Triggered when writing to memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AUTO</p>
         */
        @NameInMap("triggerType")
        public String triggerType;

        public static GetMemoryTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyData self = new GetMemoryTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyData setChanges(java.util.List<GetMemoryTaskResponseBodyDataChanges> changes) {
            this.changes = changes;
            return this;
        }
        public java.util.List<GetMemoryTaskResponseBodyDataChanges> getChanges() {
            return this.changes;
        }

        public GetMemoryTaskResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetMemoryTaskResponseBodyData setError(GetMemoryTaskResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public GetMemoryTaskResponseBodyDataError getError() {
            return this.error;
        }

        public GetMemoryTaskResponseBodyData setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetMemoryTaskResponseBodyData setInput(GetMemoryTaskResponseBodyDataInput input) {
            this.input = input;
            return this;
        }
        public GetMemoryTaskResponseBodyDataInput getInput() {
            return this.input;
        }

        public GetMemoryTaskResponseBodyData setInputMessageCount(Long inputMessageCount) {
            this.inputMessageCount = inputMessageCount;
            return this;
        }
        public Long getInputMessageCount() {
            return this.inputMessageCount;
        }

        public GetMemoryTaskResponseBodyData setInputTokenCount(Long inputTokenCount) {
            this.inputTokenCount = inputTokenCount;
            return this;
        }
        public Long getInputTokenCount() {
            return this.inputTokenCount;
        }

        public GetMemoryTaskResponseBodyData setMemories(java.util.List<GetMemoryTaskResponseBodyDataMemories> memories) {
            this.memories = memories;
            return this;
        }
        public java.util.List<GetMemoryTaskResponseBodyDataMemories> getMemories() {
            return this.memories;
        }

        public GetMemoryTaskResponseBodyData setStartedAt(String startedAt) {
            this.startedAt = startedAt;
            return this;
        }
        public String getStartedAt() {
            return this.startedAt;
        }

        public GetMemoryTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMemoryTaskResponseBodyData setStrategyConfig(GetMemoryTaskResponseBodyDataStrategyConfig strategyConfig) {
            this.strategyConfig = strategyConfig;
            return this;
        }
        public GetMemoryTaskResponseBodyDataStrategyConfig getStrategyConfig() {
            return this.strategyConfig;
        }

        public GetMemoryTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMemoryTaskResponseBodyData setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

    }

}
