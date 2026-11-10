// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InvokeAgentResponseBody extends TeaModel {
    /**
     * <p>The error code for the RUN_ERROR event.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The tool output text for the TOOL_CALL_RESULT event. The text may be truncated.</p>
     * 
     * <strong>example:</strong>
     * <p>done</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <p>The incremental fragment of text, reasoning, or tool parameters. Fragments with the same ID are concatenated in order.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello</p>
     */
    @NameInMap("delta")
    public String delta;

    /**
     * <p>The error description for the RUN_ERROR event.</p>
     * 
     * <strong>example:</strong>
     * <p>Request failed</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the message to which the text, reasoning, or tool result belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>m-1</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <p>The name of the CUSTOM extension event, such as analysis_result.</p>
     * 
     * <strong>example:</strong>
     * <p>analysis_result</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The completion reason for the RUN_FINISHED event. A value of success indicates normal completion, and interrupt indicates waiting for a response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;success&quot;}</p>
     */
    @NameInMap("outcome")
    public InvokeAgentResponseBodyOutcome outcome;

    /**
     * <p>The optional parent message ID for the TOOL_CALL_START event.</p>
     * 
     * <strong>example:</strong>
     * <p>m-1</p>
     */
    @NameInMap("parentMessageId")
    public String parentMessageId;

    /**
     * <p>The role of the message. The role is assistant for text messages and tool for tool results.</p>
     * 
     * <strong>example:</strong>
     * <p>assistant</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <p>The run ID of the current run for RUN_STARTED and RUN_FINISHED events.</p>
     * 
     * <strong>example:</strong>
     * <p>r-1</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <p>The thread snapshot for the STATE_SNAPSHOT event, including sessionId and requestId.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;abcdef0123456789abcdef0123456789&quot;,&quot;requestId&quot;:&quot;req-1&quot;}</p>
     */
    @NameInMap("snapshot")
    public Object snapshot;

    /**
     * <p>The thread ID for RUN_STARTED and RUN_FINISHED events. It is consistent with the request and the thread snapshot.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdef0123456789abcdef0123456789</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <p>The tool invoke ID. It associates TOOL_CALL_START/ARGS/END/RESULT events with approval interrupts.</p>
     * 
     * <strong>example:</strong>
     * <p>call-1</p>
     */
    @NameInMap("toolCallId")
    public String toolCallId;

    /**
     * <p>The name of the tool for the TOOL_CALL_START event.</p>
     * 
     * <strong>example:</strong>
     * <p>example_tool</p>
     */
    @NameInMap("toolCallName")
    public String toolCallName;

    /**
     * <p>The event type of the SSE data object. For the required fields of each event type, see the response description.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RUN_STARTED</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The extension value of the CUSTOM event. It can be any JSON object or null.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;reference&quot;:null,&quot;actions&quot;:[],&quot;messageId&quot;:null}</p>
     */
    @NameInMap("value")
    public Object value;

    public static InvokeAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InvokeAgentResponseBody self = new InvokeAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public InvokeAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InvokeAgentResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public InvokeAgentResponseBody setDelta(String delta) {
        this.delta = delta;
        return this;
    }
    public String getDelta() {
        return this.delta;
    }

    public InvokeAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InvokeAgentResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public InvokeAgentResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public InvokeAgentResponseBody setOutcome(InvokeAgentResponseBodyOutcome outcome) {
        this.outcome = outcome;
        return this;
    }
    public InvokeAgentResponseBodyOutcome getOutcome() {
        return this.outcome;
    }

    public InvokeAgentResponseBody setParentMessageId(String parentMessageId) {
        this.parentMessageId = parentMessageId;
        return this;
    }
    public String getParentMessageId() {
        return this.parentMessageId;
    }

    public InvokeAgentResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public InvokeAgentResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public InvokeAgentResponseBody setSnapshot(Object snapshot) {
        this.snapshot = snapshot;
        return this;
    }
    public Object getSnapshot() {
        return this.snapshot;
    }

    public InvokeAgentResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public InvokeAgentResponseBody setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }
    public String getToolCallId() {
        return this.toolCallId;
    }

    public InvokeAgentResponseBody setToolCallName(String toolCallName) {
        this.toolCallName = toolCallName;
        return this;
    }
    public String getToolCallName() {
        return this.toolCallName;
    }

    public InvokeAgentResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public InvokeAgentResponseBody setValue(Object value) {
        this.value = value;
        return this;
    }
    public Object getValue() {
        return this.value;
    }

    public static class InvokeAgentResponseBodyOutcomeInterrupts extends TeaModel {
        /**
         * <p>The optional expiration time string of the interrupt. This field is not output for current tool approvals.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-04T00:00:00Z</p>
         */
        @NameInMap("expiresAt")
        public String expiresAt;

        /**
         * <p>The ID of the interrupt. It is used as resume[].interruptId when resuming the run.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The approval description or follow-up question text displayed to the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Proceed with execution?</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The optional extension information of the interrupt. It cannot replace tool events.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The reason for the interrupt. The value is tool_call_approve for tool approval and ask_human for follow-up questions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tool_call_approve</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>The JSON Schema for the response. Tool approval requires decision=yes/no, and follow-up questions use strings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;decision&quot;:{&quot;type&quot;:&quot;string&quot;,&quot;enum&quot;:[&quot;yes&quot;,&quot;no&quot;]}},&quot;required&quot;:[&quot;decision&quot;]}</p>
         */
        @NameInMap("responseSchema")
        public java.util.Map<String, ?> responseSchema;

        /**
         * <p>The optional associated tool invoke ID. It is the same as the toolCallId of the preceding TOOL_CALL_START event.</p>
         * 
         * <strong>example:</strong>
         * <p>call-1</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        public static InvokeAgentResponseBodyOutcomeInterrupts build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentResponseBodyOutcomeInterrupts self = new InvokeAgentResponseBodyOutcomeInterrupts();
            return TeaModel.build(map, self);
        }

        public InvokeAgentResponseBodyOutcomeInterrupts setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public InvokeAgentResponseBodyOutcomeInterrupts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InvokeAgentResponseBodyOutcomeInterrupts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InvokeAgentResponseBodyOutcomeInterrupts setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public InvokeAgentResponseBodyOutcomeInterrupts setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public InvokeAgentResponseBodyOutcomeInterrupts setResponseSchema(java.util.Map<String, ?> responseSchema) {
            this.responseSchema = responseSchema;
            return this;
        }
        public java.util.Map<String, ?> getResponseSchema() {
            return this.responseSchema;
        }

        public InvokeAgentResponseBodyOutcomeInterrupts setToolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        public String getToolCallId() {
            return this.toolCallId;
        }

    }

    public static class InvokeAgentResponseBodyOutcome extends TeaModel {
        /**
         * <p>The list of interrupts waiting for a response. This field appears only when outcome.type is interrupt and contains at least one item.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;i-1&quot;,&quot;reason&quot;:&quot;tool_call_approve&quot;,&quot;toolCallId&quot;:&quot;call-1&quot;}]</p>
         */
        @NameInMap("interrupts")
        public java.util.List<InvokeAgentResponseBodyOutcomeInterrupts> interrupts;

        /**
         * <p>The outcome type. A value of success indicates normal completion. A value of interrupt indicates waiting for a response, in which case the interrupts array contains at least one item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>interrupt</p>
         */
        @NameInMap("type")
        public String type;

        public static InvokeAgentResponseBodyOutcome build(java.util.Map<String, ?> map) throws Exception {
            InvokeAgentResponseBodyOutcome self = new InvokeAgentResponseBodyOutcome();
            return TeaModel.build(map, self);
        }

        public InvokeAgentResponseBodyOutcome setInterrupts(java.util.List<InvokeAgentResponseBodyOutcomeInterrupts> interrupts) {
            this.interrupts = interrupts;
            return this;
        }
        public java.util.List<InvokeAgentResponseBodyOutcomeInterrupts> getInterrupts() {
            return this.interrupts;
        }

        public InvokeAgentResponseBodyOutcome setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
