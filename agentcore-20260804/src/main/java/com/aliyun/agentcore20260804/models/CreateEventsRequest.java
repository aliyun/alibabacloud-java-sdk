// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateEventsRequest extends TeaModel {
    /**
     * <p>The JSON request body.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("body")
    public CreateEventsRequestBody body;

    public static CreateEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEventsRequest self = new CreateEventsRequest();
        return TeaModel.build(map, self);
    }

    public CreateEventsRequest setBody(CreateEventsRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateEventsRequestBody getBody() {
        return this.body;
    }

    public static class CreateEventsRequestBodyEventsDataContent extends TeaModel {
        /**
         * <p>The JSON parameter values. This field is required for tool_call blocks. Unparsed raw strings can be retained.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
         */
        @NameInMap("arguments")
        public Object arguments;

        /**
         * <p>The logical call ID. This field is required for tool_call blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>call-001</p>
         */
        @NameInMap("callId")
        public String callId;

        /**
         * <p>The access format identifier. This field is required for opaque blocks. Saving the format does not mean that its content can be interpreted or used across platforms.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        @NameInMap("format")
        public String format;

        /**
         * <p>The tool name. This field is required for tool_call blocks. This content block only expresses the call intent.</p>
         * 
         * <strong>example:</strong>
         * <p>get_weather</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The actual text. This field is required for text and reasoning blocks.</p>
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
         * <p>The JSON value. This field is required for json and opaque blocks. The data field is not used for opaque blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;preference&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("value")
        public Object value;

        public static CreateEventsRequestBodyEventsDataContent build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsRequestBodyEventsDataContent self = new CreateEventsRequestBodyEventsDataContent();
            return TeaModel.build(map, self);
        }

        public CreateEventsRequestBodyEventsDataContent setArguments(Object arguments) {
            this.arguments = arguments;
            return this;
        }
        public Object getArguments() {
            return this.arguments;
        }

        public CreateEventsRequestBodyEventsDataContent setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CreateEventsRequestBodyEventsDataContent setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public CreateEventsRequestBodyEventsDataContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateEventsRequestBodyEventsDataContent setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateEventsRequestBodyEventsDataContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateEventsRequestBodyEventsDataContent setValue(Object value) {
            this.value = value;
            return this;
        }
        public Object getValue() {
            return this.value;
        }

    }

    public static class CreateEventsRequestBodyEventsDataParentScope extends TeaModel {
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

        public static CreateEventsRequestBodyEventsDataParentScope build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsRequestBodyEventsDataParentScope self = new CreateEventsRequestBodyEventsDataParentScope();
            return TeaModel.build(map, self);
        }

        public CreateEventsRequestBodyEventsDataParentScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateEventsRequestBodyEventsDataParentScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateEventsRequestBodyEventsDataParentScope setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public CreateEventsRequestBodyEventsDataParentScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateEventsRequestBodyEventsData extends TeaModel {
        /**
         * <p>The call ID. This field is required for tool_call and tool_result events, or message events with the role set to tool. It associates the call intent, actual execution, and feedback.</p>
         * 
         * <strong>example:</strong>
         * <p>call-001</p>
         */
        @NameInMap("callId")
        public String callId;

        /**
         * <p>The ordered content blocks. This field is required for message and tool_result events. Use a text block for plain text. This can be an empty array if the tool has no output.</p>
         */
        @NameInMap("content")
        public java.util.List<CreateEventsRequestBodyEventsDataContent> content;

        /**
         * <p>The list of visible event IDs referenced by the summary. This list cannot be empty.</p>
         */
        @NameInMap("eventIds")
        public java.util.List<String> eventIds;

        /**
         * <p>The anchor event ID of the parent session. This field is required for session_fork events. The child session continues from the valid context at this anchor and does not inherit interactions after the anchor.</p>
         * 
         * <strong>example:</strong>
         * <p>evt-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("parentEventId")
        public String parentEventId;

        /**
         * <p>The business scope of the parent session. This field is required for session_fork events. The event is written to the child session, and the requested scope is the child session.</p>
         */
        @NameInMap("parentScope")
        public CreateEventsRequestBodyEventsDataParentScope parentScope;

        /**
         * <p>The message role. This field is required for message events.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The human-readable summary. This field is optional for context_update events.</p>
         * 
         * <strong>example:</strong>
         * <p>The user plans to go hiking on the weekend</p>
         */
        @NameInMap("summary")
        public String summary;

        public static CreateEventsRequestBodyEventsData build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsRequestBodyEventsData self = new CreateEventsRequestBodyEventsData();
            return TeaModel.build(map, self);
        }

        public CreateEventsRequestBodyEventsData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public CreateEventsRequestBodyEventsData setContent(java.util.List<CreateEventsRequestBodyEventsDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<CreateEventsRequestBodyEventsDataContent> getContent() {
            return this.content;
        }

        public CreateEventsRequestBodyEventsData setEventIds(java.util.List<String> eventIds) {
            this.eventIds = eventIds;
            return this;
        }
        public java.util.List<String> getEventIds() {
            return this.eventIds;
        }

        public CreateEventsRequestBodyEventsData setParentEventId(String parentEventId) {
            this.parentEventId = parentEventId;
            return this;
        }
        public String getParentEventId() {
            return this.parentEventId;
        }

        public CreateEventsRequestBodyEventsData setParentScope(CreateEventsRequestBodyEventsDataParentScope parentScope) {
            this.parentScope = parentScope;
            return this;
        }
        public CreateEventsRequestBodyEventsDataParentScope getParentScope() {
            return this.parentScope;
        }

        public CreateEventsRequestBodyEventsData setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public CreateEventsRequestBodyEventsData setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

    }

    public static class CreateEventsRequestBodyEvents extends TeaModel {
        /**
         * <p>The event-specific data. Use the corresponding fields based on the type. For conditional requirements, refer to the description of each field.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("data")
        public CreateEventsRequestBodyEventsData data;

        /**
         * <p>The actual occurrence time provided by the client as a Unix timestamp in milliseconds. This is the only source for business sorting. Identical values do not indicate a known sequence, and the array position does not imply a business order.</p>
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

        public static CreateEventsRequestBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsRequestBodyEvents self = new CreateEventsRequestBodyEvents();
            return TeaModel.build(map, self);
        }

        public CreateEventsRequestBodyEvents setData(CreateEventsRequestBodyEventsData data) {
            this.data = data;
            return this;
        }
        public CreateEventsRequestBodyEventsData getData() {
            return this.data;
        }

        public CreateEventsRequestBodyEvents setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public CreateEventsRequestBodyEvents setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateEventsRequestBodyScope extends TeaModel {
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

        public static CreateEventsRequestBodyScope build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsRequestBodyScope self = new CreateEventsRequestBodyScope();
            return TeaModel.build(map, self);
        }

        public CreateEventsRequestBodyScope setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateEventsRequestBodyScope setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public CreateEventsRequestBodyScope setTeamId(String teamId) {
            this.teamId = teamId;
            return this;
        }
        public String getTeamId() {
            return this.teamId;
        }

        public CreateEventsRequestBodyScope setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class CreateEventsRequestBodySession extends TeaModel {
        /**
         * <p>The JSON metadata of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;topic&quot;:&quot;hiking&quot;}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, String> metadata;

        /**
         * <p>The session title. It can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Travel plan</p>
         */
        @NameInMap("title")
        public String title;

        public static CreateEventsRequestBodySession build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsRequestBodySession self = new CreateEventsRequestBodySession();
            return TeaModel.build(map, self);
        }

        public CreateEventsRequestBodySession setMetadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, String> getMetadata() {
            return this.metadata;
        }

        public CreateEventsRequestBodySession setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class CreateEventsRequestBody extends TeaModel {
        /**
         * <p>A list of 1 to 100 events. The request body cannot exceed 1 MiB.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("events")
        public java.util.List<CreateEventsRequestBodyEvents> events;

        /**
         * <p>The exact session to which all events belong.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("scope")
        public CreateEventsRequestBodyScope scope;

        /**
         * <p>The information saved when the first event is successfully written. It is not overwritten by subsequent writes.</p>
         */
        @NameInMap("session")
        public CreateEventsRequestBodySession session;

        public static CreateEventsRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateEventsRequestBody self = new CreateEventsRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateEventsRequestBody setEvents(java.util.List<CreateEventsRequestBodyEvents> events) {
            this.events = events;
            return this;
        }
        public java.util.List<CreateEventsRequestBodyEvents> getEvents() {
            return this.events;
        }

        public CreateEventsRequestBody setScope(CreateEventsRequestBodyScope scope) {
            this.scope = scope;
            return this;
        }
        public CreateEventsRequestBodyScope getScope() {
            return this.scope;
        }

        public CreateEventsRequestBody setSession(CreateEventsRequestBodySession session) {
            this.session = session;
            return this;
        }
        public CreateEventsRequestBodySession getSession() {
            return this.session;
        }

    }

}
