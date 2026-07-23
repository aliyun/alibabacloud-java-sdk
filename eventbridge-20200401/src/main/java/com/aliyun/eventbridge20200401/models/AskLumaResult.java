// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AskLumaResult extends TeaModel {
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
     * <p>您指的是哪个数据库中的员工表？</p>
     */
    @NameInMap("ClarificationQuestion")
    public String clarificationQuestion;

    /**
     * <p>Query constraints</p>
     */
    @NameInMap("Constraints")
    public Constraints constraints;

    /**
     * <p>Structured result body</p>
     */
    @NameInMap("Content")
    public Content content;

    /**
     * <p>Conversation identifier, used for multi-turn follow-up questions</p>
     * 
     * <strong>example:</strong>
     * <p>conv_xxx</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>Error code</p>
     * 
     * <strong>example:</strong>
     * <p>ExecutionFailed, Timeout, RateLimited, InternalError, ConversationExpired</p>
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
     * <p>Whether it is an error. false = query succeeded or clarification (including empty result set); true = execution failed / timeout / rate limited / internal error</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsError")
    public Boolean isError;

    /**
     * <p>Message identifier, used for PollAskResult polling</p>
     * 
     * <strong>example:</strong>
     * <p>msg_xxx</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>Execution status</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING, SUCCEEDED, FAILED, TIMEOUT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Whether the result was truncated due to exceeding the storage limit. Only appears in large result set scenarios</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StorageTruncated")
    public Boolean storageTruncated;

    public static AskLumaResult build(java.util.Map<String, ?> map) throws Exception {
        AskLumaResult self = new AskLumaResult();
        return TeaModel.build(map, self);
    }

    public AskLumaResult setClarificationNeeded(Boolean clarificationNeeded) {
        this.clarificationNeeded = clarificationNeeded;
        return this;
    }
    public Boolean getClarificationNeeded() {
        return this.clarificationNeeded;
    }

    public AskLumaResult setClarificationQuestion(String clarificationQuestion) {
        this.clarificationQuestion = clarificationQuestion;
        return this;
    }
    public String getClarificationQuestion() {
        return this.clarificationQuestion;
    }

    public AskLumaResult setConstraints(Constraints constraints) {
        this.constraints = constraints;
        return this;
    }
    public Constraints getConstraints() {
        return this.constraints;
    }

    public AskLumaResult setContent(Content content) {
        this.content = content;
        return this;
    }
    public Content getContent() {
        return this.content;
    }

    public AskLumaResult setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public AskLumaResult setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AskLumaResult setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AskLumaResult setIsError(Boolean isError) {
        this.isError = isError;
        return this;
    }
    public Boolean getIsError() {
        return this.isError;
    }

    public AskLumaResult setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public AskLumaResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AskLumaResult setStorageTruncated(Boolean storageTruncated) {
        this.storageTruncated = storageTruncated;
        return this;
    }
    public Boolean getStorageTruncated() {
        return this.storageTruncated;
    }

}
