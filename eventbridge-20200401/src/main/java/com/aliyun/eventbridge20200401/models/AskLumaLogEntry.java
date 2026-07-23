// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AskLumaLogEntry extends TeaModel {
    /**
     * <p>Agent name</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>Whether clarification is needed</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ClarificationNeeded")
    public Boolean clarificationNeeded;

    /**
     * <p>Clarification question text</p>
     * 
     * <strong>example:</strong>
     * <p>您指的是哪张表？</p>
     */
    @NameInMap("ClarificationQuestion")
    public String clarificationQuestion;

    /**
     * <p>Structured result body</p>
     */
    @NameInMap("Content")
    public Content content;

    /**
     * <p>Conversation ID</p>
     * 
     * <strong>example:</strong>
     * <p>conv_xxx</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>Creation time (milliseconds)</p>
     * 
     * <strong>example:</strong>
     * <p>1717200000000</p>
     */
    @NameInMap("CreatedAt")
    public String createdAt;

    /**
     * <p>Invocation duration (milliseconds)</p>
     * 
     * <strong>example:</strong>
     * <p>3200</p>
     */
    @NameInMap("DurationMs")
    public Long durationMs;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>ExecutionFailed</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Error details</p>
     * 
     * <strong>example:</strong>
     * <p>Agent with name \&quot;xxx\&quot; not found for account 1186xxx</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Whether it is an error</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsError")
    public Boolean isError;

    /**
     * <p>Message ID</p>
     * 
     * <strong>example:</strong>
     * <p>msg_xxx</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>Input question</p>
     * 
     * <strong>example:</strong>
     * <p>帮我统计一下最近的订单数据。</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <p>Log source</p>
     * 
     * <strong>example:</strong>
     * <p>MCP, CHAT</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Execution status</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING, SUCCEEDED, FAILED, TIMEOUT</p>
     */
    @NameInMap("Status")
    public String status;

    public static AskLumaLogEntry build(java.util.Map<String, ?> map) throws Exception {
        AskLumaLogEntry self = new AskLumaLogEntry();
        return TeaModel.build(map, self);
    }

    public AskLumaLogEntry setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AskLumaLogEntry setClarificationNeeded(Boolean clarificationNeeded) {
        this.clarificationNeeded = clarificationNeeded;
        return this;
    }
    public Boolean getClarificationNeeded() {
        return this.clarificationNeeded;
    }

    public AskLumaLogEntry setClarificationQuestion(String clarificationQuestion) {
        this.clarificationQuestion = clarificationQuestion;
        return this;
    }
    public String getClarificationQuestion() {
        return this.clarificationQuestion;
    }

    public AskLumaLogEntry setContent(Content content) {
        this.content = content;
        return this;
    }
    public Content getContent() {
        return this.content;
    }

    public AskLumaLogEntry setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public AskLumaLogEntry setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public AskLumaLogEntry setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }
    public Long getDurationMs() {
        return this.durationMs;
    }

    public AskLumaLogEntry setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AskLumaLogEntry setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AskLumaLogEntry setIsError(Boolean isError) {
        this.isError = isError;
        return this;
    }
    public Boolean getIsError() {
        return this.isError;
    }

    public AskLumaLogEntry setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public AskLumaLogEntry setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public AskLumaLogEntry setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public AskLumaLogEntry setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
