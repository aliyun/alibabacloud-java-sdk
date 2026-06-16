// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageShrinkRequest extends TeaModel {
    /**
     * <p>The agent ID. This parameter is required. You can obtain the current AgentId from the response of the CreateAgentSession operation. Agent resources have a lifecycle, so the AgentId you need to specify may change with each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The Data Management unit you are currently in. If you choose to analyze a database, this information is used to correctly connect to your Data Management instance. You can go to the Data Management console to view your current Data Management unit. If you are a user of Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>), set this parameter to ap-southeast-1.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The data source information. This parameter is optional.</p>
     */
    @NameInMap("DataSource")
    public String dataSourceShrink;

    /**
     * <p>The detailed data source information. This parameter is optional.</p>
     */
    @NameInMap("DataSources")
    public String dataSourcesShrink;

    /**
     * <p>The message content to send to the Agent in this request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>what can you do?</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The message type. Default value: <code>[primary]</code>. When the message is a response to the Agent\&quot;s human-in-the-loop question, set this parameter to <code>[additional]</code>. When the message is intended to cancel the current session, set this parameter to <code>[cancel]</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The parent session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20qrliuoo7p2vlsfg*****</p>
     */
    @NameInMap("ParentSessionId")
    public String parentSessionId;

    /**
     * <p>The specific question that the Agent asks the user through human-in-the-loop. This parameter is required when the message type is <code>additional</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>请提供计算GMV的口径。</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <p>The quoted content, typically used during interaction with the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;v0&quot;}</p>
     */
    @NameInMap("QuotedMessage")
    public String quotedMessage;

    /**
     * <p>Indicates which Agent message this message responds to. Set this parameter to the largest Checkpoint sequence number currently received. Set it to 0 for the first message. This field is used for message deduplication in case of occasional network issues or duplicate message delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplyTo")
    public String replyTo;

    /**
     * <p>The special configuration for this session. For the same session, only the configuration included in the first SendMessage call takes effect.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionConfig")
    public String sessionConfigShrink;

    /**
     * <p>The session ID. This parameter is required. You can obtain the SessionId by calling the CreateAgentSession operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sess_***</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("TaskConfig")
    public String taskConfigShrink;

    public static SendChatMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatMessageShrinkRequest self = new SendChatMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendChatMessageShrinkRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public SendChatMessageShrinkRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public SendChatMessageShrinkRequest setDataSourceShrink(String dataSourceShrink) {
        this.dataSourceShrink = dataSourceShrink;
        return this;
    }
    public String getDataSourceShrink() {
        return this.dataSourceShrink;
    }

    public SendChatMessageShrinkRequest setDataSourcesShrink(String dataSourcesShrink) {
        this.dataSourcesShrink = dataSourcesShrink;
        return this;
    }
    public String getDataSourcesShrink() {
        return this.dataSourcesShrink;
    }

    public SendChatMessageShrinkRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendChatMessageShrinkRequest setMessageType(String messageType) {
        this.messageType = messageType;
        return this;
    }
    public String getMessageType() {
        return this.messageType;
    }

    public SendChatMessageShrinkRequest setParentSessionId(String parentSessionId) {
        this.parentSessionId = parentSessionId;
        return this;
    }
    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public SendChatMessageShrinkRequest setQuestion(String question) {
        this.question = question;
        return this;
    }
    public String getQuestion() {
        return this.question;
    }

    public SendChatMessageShrinkRequest setQuotedMessage(String quotedMessage) {
        this.quotedMessage = quotedMessage;
        return this;
    }
    public String getQuotedMessage() {
        return this.quotedMessage;
    }

    public SendChatMessageShrinkRequest setReplyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }
    public String getReplyTo() {
        return this.replyTo;
    }

    public SendChatMessageShrinkRequest setSessionConfigShrink(String sessionConfigShrink) {
        this.sessionConfigShrink = sessionConfigShrink;
        return this;
    }
    public String getSessionConfigShrink() {
        return this.sessionConfigShrink;
    }

    public SendChatMessageShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public SendChatMessageShrinkRequest setTaskConfigShrink(String taskConfigShrink) {
        this.taskConfigShrink = taskConfigShrink;
        return this;
    }
    public String getTaskConfigShrink() {
        return this.taskConfigShrink;
    }

}
