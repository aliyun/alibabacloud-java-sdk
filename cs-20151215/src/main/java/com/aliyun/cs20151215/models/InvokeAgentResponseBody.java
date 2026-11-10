// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InvokeAgentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>done</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>你好</p>
     */
    @NameInMap("delta")
    public String delta;

    /**
     * <strong>example:</strong>
     * <p>请求失败</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>m-1</p>
     */
    @NameInMap("messageId")
    public String messageId;

    /**
     * <strong>example:</strong>
     * <p>analysis_result</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;success&quot;}</p>
     */
    @NameInMap("outcome")
    public InvokeAgentResponseBodyOutcome outcome;

    /**
     * <strong>example:</strong>
     * <p>m-1</p>
     */
    @NameInMap("parentMessageId")
    public String parentMessageId;

    /**
     * <strong>example:</strong>
     * <p>assistant</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>r-1</p>
     */
    @NameInMap("runId")
    public String runId;

    /**
     * <strong>example:</strong>
     * <p>{&quot;sessionId&quot;:&quot;abcdef0123456789abcdef0123456789&quot;,&quot;requestId&quot;:&quot;req-1&quot;}</p>
     */
    @NameInMap("snapshot")
    public Object snapshot;

    /**
     * <strong>example:</strong>
     * <p>abcdef0123456789abcdef0123456789</p>
     */
    @NameInMap("threadId")
    public String threadId;

    /**
     * <strong>example:</strong>
     * <p>call-1</p>
     */
    @NameInMap("toolCallId")
    public String toolCallId;

    /**
     * <strong>example:</strong>
     * <p>example_tool</p>
     */
    @NameInMap("toolCallName")
    public String toolCallName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RUN_STARTED</p>
     */
    @NameInMap("type")
    public String type;

    /**
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
         * <strong>example:</strong>
         * <p>2026-11-04T00:00:00Z</p>
         */
        @NameInMap("expiresAt")
        public String expiresAt;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-1</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>是否执行？</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tool_call_approve</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;decision&quot;:{&quot;type&quot;:&quot;string&quot;,&quot;enum&quot;:[&quot;yes&quot;,&quot;no&quot;]}},&quot;required&quot;:[&quot;decision&quot;]}</p>
         */
        @NameInMap("responseSchema")
        public java.util.Map<String, ?> responseSchema;

        /**
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
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;i-1&quot;,&quot;reason&quot;:&quot;tool_call_approve&quot;,&quot;toolCallId&quot;:&quot;call-1&quot;}]</p>
         */
        @NameInMap("interrupts")
        public java.util.List<InvokeAgentResponseBodyOutcomeInterrupts> interrupts;

        /**
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
