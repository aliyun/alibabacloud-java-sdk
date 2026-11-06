// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PromptAgentSessionResponseBody extends TeaModel {
    /**
     * <p>The error message in the SSE frame. The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com/protocol/prompt-turn">https://agentclientprotocol.com/protocol/prompt-turn</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;code&quot;: 400, &quot;errorCode&quot;: &quot;0x50000000001&quot;, &quot;message&quot;: &quot;not exist session&quot;, &quot;data&quot;: null}</p>
     */
    @NameInMap("Error")
    public Object error;

    /**
     * <p>The ID passed by the requester, which is echoed back as is.</p>
     * 
     * <strong>example:</strong>
     * <p>631478864897630XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The event continuation metadata.</p>
     */
    @NameInMap("Meta")
    public PromptAgentSessionResponseBodyMeta meta;

    /**
     * <p>The SSE method. The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com/protocol/prompt-turn">https://agentclientprotocol.com/protocol/prompt-turn</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>session/update</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The SSE parameters. The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com/protocol/prompt-turn">https://agentclientprotocol.com/protocol/prompt-turn</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;af4f5ef8-e8f5-481c-ad1f-94886c6c0aed&quot;,&quot;update&quot;:{&quot;sessionUpdate&quot;:&quot;agent_message_chunk&quot;,&quot;content&quot;:{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;hello world&quot;}}}</p>
     */
    @NameInMap("Params")
    public Object params;

    /**
     * <p>The request ID of this API invocation, which is used to troubleshoot invocation issues.</p>
     * 
     * <strong>example:</strong>
     * <p>D5D70885-7CC7-594A-80C7-2EF1B00FFB4B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result set of the SSE frame. The returned content complies with the open-source Agent Client Protocol (ACP) specification. For more information, see <a href="https://agentclientprotocol.com/protocol/prompt-turn">https://agentclientprotocol.com/protocol/prompt-turn</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;stopReason&quot;:&quot;end_turn&quot;}</p>
     */
    @NameInMap("Result")
    public Object result;

    /**
     * <p>The timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1747447032</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static PromptAgentSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PromptAgentSessionResponseBody self = new PromptAgentSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public PromptAgentSessionResponseBody setError(Object error) {
        this.error = error;
        return this;
    }
    public Object getError() {
        return this.error;
    }

    public PromptAgentSessionResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public PromptAgentSessionResponseBody setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public PromptAgentSessionResponseBody setMeta(PromptAgentSessionResponseBodyMeta meta) {
        this.meta = meta;
        return this;
    }
    public PromptAgentSessionResponseBodyMeta getMeta() {
        return this.meta;
    }

    public PromptAgentSessionResponseBody setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public PromptAgentSessionResponseBody setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

    public PromptAgentSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PromptAgentSessionResponseBody setResult(Object result) {
        this.result = result;
        return this;
    }
    public Object getResult() {
        return this.result;
    }

    public PromptAgentSessionResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class PromptAgentSessionResponseBodyMetaEventCursor extends TeaModel {
        /**
         * <p>The event stream epoch.</p>
         * 
         * <strong>example:</strong>
         * <p>f7c6a27a-09f6-4bc9-b924-0c360351373c</p>
         */
        @NameInMap("EventEpoch")
        public String eventEpoch;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("EventId")
        public String eventId;

        /**
         * <p>The event type.</p>
         * 
         * <strong>example:</strong>
         * <p>session_update</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The prompt execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p1</p>
         */
        @NameInMap("PromptId")
        public String promptId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79fea58a-45f5-45c6-9169-c59beac0d5b6</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        public static PromptAgentSessionResponseBodyMetaEventCursor build(java.util.Map<String, ?> map) throws Exception {
            PromptAgentSessionResponseBodyMetaEventCursor self = new PromptAgentSessionResponseBodyMetaEventCursor();
            return TeaModel.build(map, self);
        }

        public PromptAgentSessionResponseBodyMetaEventCursor setEventEpoch(String eventEpoch) {
            this.eventEpoch = eventEpoch;
            return this;
        }
        public String getEventEpoch() {
            return this.eventEpoch;
        }

        public PromptAgentSessionResponseBodyMetaEventCursor setEventId(String eventId) {
            this.eventId = eventId;
            return this;
        }
        public String getEventId() {
            return this.eventId;
        }

        public PromptAgentSessionResponseBodyMetaEventCursor setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public PromptAgentSessionResponseBodyMetaEventCursor setPromptId(String promptId) {
            this.promptId = promptId;
            return this;
        }
        public String getPromptId() {
            return this.promptId;
        }

        public PromptAgentSessionResponseBodyMetaEventCursor setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

    public static class PromptAgentSessionResponseBodyMeta extends TeaModel {
        /**
         * <p>The event continuation cursor.</p>
         */
        @NameInMap("EventCursor")
        public PromptAgentSessionResponseBodyMetaEventCursor eventCursor;

        public static PromptAgentSessionResponseBodyMeta build(java.util.Map<String, ?> map) throws Exception {
            PromptAgentSessionResponseBodyMeta self = new PromptAgentSessionResponseBodyMeta();
            return TeaModel.build(map, self);
        }

        public PromptAgentSessionResponseBodyMeta setEventCursor(PromptAgentSessionResponseBodyMetaEventCursor eventCursor) {
            this.eventCursor = eventCursor;
            return this;
        }
        public PromptAgentSessionResponseBodyMetaEventCursor getEventCursor() {
            return this.eventCursor;
        }

    }

}
