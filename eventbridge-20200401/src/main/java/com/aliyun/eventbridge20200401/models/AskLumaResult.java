// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AskLumaResult extends TeaModel {
    /**
     * <p>Indicates whether clarification is needed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ClarificationNeeded")
    public Boolean clarificationNeeded;

    /**
     * <p>The clarification question text.</p>
     * 
     * <strong>example:</strong>
     * <p>Which database does the employee table you are referring to belong to?</p>
     */
    @NameInMap("ClarificationQuestion")
    public String clarificationQuestion;

    /**
     * <p>The query constraints.</p>
     */
    @NameInMap("Constraints")
    public Constraints constraints;

    /**
     * <p>The structured result body.</p>
     */
    @NameInMap("Content")
    public Content content;

    /**
     * <p>The conversation ID, used for multi-turn follow-up questions.</p>
     * 
     * <strong>example:</strong>
     * <p>conv_xxx</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>ExecutionFailed, Timeout, RateLimited, InternalError, ConversationExpired</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error details.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent with name \&quot;xxx\&quot; not found for account 1186xxx</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>Indicates whether an error occurred. A value of false indicates that the query succeeded or a clarification is needed (including empty result sets). A value of true indicates that the execution failed due to a timeout, throttling, or internal error.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsError")
    public Boolean isError;

    /**
     * <p>The message ID, used for polling with PollAskResult.</p>
     * 
     * <strong>example:</strong>
     * <p>msg_xxx</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The submit status.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING, SUCCEEDED, FAILED, TIMEOUT</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the result was truncated because it exceeded the storage limit. This field is returned only for large result sets.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StorageTruncated")
    public Boolean storageTruncated;

    /**
     * <p>The business Wiki version that was actually used for this response. This field is not returned if the agent does not have a Wiki configured.</p>
     * 
     * <strong>example:</strong>
     * <p>eventhouse-multisource-demo-v1</p>
     */
    @NameInMap("WikiVersion")
    public String wikiVersion;

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

    public AskLumaResult setWikiVersion(String wikiVersion) {
        this.wikiVersion = wikiVersion;
        return this;
    }
    public String getWikiVersion() {
        return this.wikiVersion;
    }

}
