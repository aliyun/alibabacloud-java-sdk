// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkakopilot20260414.models;

import com.aliyun.tea.*;

public class KopilotChatStreamResponseBody extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Delta")
    public String delta;

    @NameInMap("Message")
    public String message;

    @NameInMap("MessageId")
    public String messageId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Role")
    public String role;

    @NameInMap("RunId")
    public String runId;

    @NameInMap("ThreadId")
    public String threadId;

    @NameInMap("ToolCallId")
    public String toolCallId;

    @NameInMap("ToolCallName")
    public String toolCallName;

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
