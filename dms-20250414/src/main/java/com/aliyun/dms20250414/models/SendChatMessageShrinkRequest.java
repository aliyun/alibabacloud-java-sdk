// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageShrinkRequest extends TeaModel {
    /**
     * <p>The agent ID. This parameter is required. You can obtain this ID from the response of the <code>CreateAgentSession</code> operation. An agent has a lifecycle, so its ID may change with each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The DMS unit where your DMS instance is located. This information is used to connect to your DMS instance for database analysis. You can find this value in the DMS console. For users on the Alibaba Cloud China site, you can enter <code>cn-hangzhou</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The data source information. Optional.</p>
     */
    @NameInMap("DataSource")
    public String dataSourceShrink;

    /**
     * <p>A list of data sources. Optional.</p>
     */
    @NameInMap("DataSources")
    public String dataSourcesShrink;

    /**
     * <p>The content of the message to send to the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>what can you do?</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The message type. The default value is <code>primary</code>. Set this parameter to <code>additional</code> when responding to a human-in-the-loop question from the agent. Set it to <code>cancel</code> to cancel the current session.</p>
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
     * <p>This parameter is required if the <code>MessageType</code> is <code>additional</code>. It contains the specific question asked by the agent during the human-in-the-loop process.</p>
     * 
     * <strong>example:</strong>
     * <p>请提供计算GMV的口径。</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <p>The quoted content. This parameter is typically used when interacting with the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;v0&quot;}</p>
     */
    @NameInMap("QuotedMessage")
    public String quotedMessage;

    /**
     * <p>This parameter specifies the agent message to which this message is a response, enabling message deduplication. Set this to the highest checkpoint sequence number you have received. For the first message, use 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplyTo")
    public String replyTo;

    /**
     * <p>Session-specific configurations. These apply only if provided in the first <code>SendMessage</code> request of the session.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionConfig")
    public String sessionConfigShrink;

    /**
     * <p>The session ID. This parameter is required. You can obtain the session ID by calling the <code>CreateAgentSession</code> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sess_***</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

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

}
