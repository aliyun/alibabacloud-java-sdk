// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotChatStreamResponseBody extends TeaModel {
    /**
     * <p>The actual content.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The streaming incremental content.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Delta")
    public String delta;

    /**
     * <p>The message body.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4b209618fd066c4354037b4b0634ffc9</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>76E1F1AA-6046-5074-96E2-79A37AFBD2FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The role identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>assistant</p>
     */
    @NameInMap("Role")
    public String role;

    /**
     * <p>The run task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5737d000********</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <p>The session thread ID.</p>
     * 
     * <strong>example:</strong>
     * <p>thread_abc123xyz</p>
     */
    @NameInMap("ThreadId")
    public String threadId;

    /**
     * <p>The unique tool calling invoke ID.</p>
     * 
     * <strong>example:</strong>
     * <p>call_xyz789012</p>
     */
    @NameInMap("ToolCallId")
    public String toolCallId;

    /**
     * <p>The tool or function name.</p>
     * 
     * <strong>example:</strong>
     * <p>search_knowledge_base</p>
     */
    @NameInMap("ToolCallName")
    public String toolCallName;

    /**
     * <p>The event or message type.</p>
     * 
     * <strong>example:</strong>
     * <p>delta</p>
     */
    @NameInMap("Type")
    public String type;

    public static KopilotChatStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KopilotChatStreamResponseBody self = new KopilotChatStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public KopilotChatStreamResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public KopilotChatStreamResponseBody setDelta(String delta) {
        this.delta = delta;
        return this;
    }
    public String getDelta() {
        return this.delta;
    }

    public KopilotChatStreamResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public KopilotChatStreamResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public KopilotChatStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KopilotChatStreamResponseBody setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public KopilotChatStreamResponseBody setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public KopilotChatStreamResponseBody setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }
    public String getThreadId() {
        return this.threadId;
    }

    public KopilotChatStreamResponseBody setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }
    public String getToolCallId() {
        return this.toolCallId;
    }

    public KopilotChatStreamResponseBody setToolCallName(String toolCallName) {
        this.toolCallName = toolCallName;
        return this;
    }
    public String getToolCallName() {
        return this.toolCallName;
    }

    public KopilotChatStreamResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
