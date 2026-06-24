// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageShrinkRequest extends TeaModel {
    /**
     * <p>The agent ID. This is a required field. You can obtain the current AgentId from the response of the CreateAgentSession operation. Agent resources have a lifecycle, so the AgentId you need to specify may change with each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The Data Management unit you are currently in. If you choose to analyze a database, this information is used to correctly connect to your Data Management instance. You can check your current Data Management unit in the Data Management console. If you are a user of Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>), set this parameter to ap-southeast-1.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The data source information. This parameter can be left empty. This parameter supports only a single data source. Use the DataSources parameter instead.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DataSource")
    public String dataSourceShrink;

    /**
     * <p>The detailed data source information. This parameter can be left empty.</p>
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
     * <p>The message type. Default value: <code>[primary]</code>.  </p>
     * <ul>
     * <li><p>For regular interactions with the Agent, set the message type to <code>[primary]</code>.</p>
     * </li>
     * <li><p>When the message is a response to the Agent\&quot;s Human-in-Loop question, set the type to <code>[additional]</code>.</p>
     * </li>
     * <li><p>When the message is intended to trigger report generation, set the type to <code>[report]</code>.</p>
     * </li>
     * <li><p>When the message is intended to cancel the current session, set the type to <code>[cancel]</code>.</p>
     * </li>
     * </ul>
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
     * <p>This field is required when the message type is <code>additional</code>. Specify the specific question that the Agent asks the user through Human-in-Loop.</p>
     * 
     * <strong>example:</strong>
     * <p>请提供计算GMV的口径。</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <p>The quoted content to pass in. This is typically used during interactions with the Agent.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;v0&quot;}</p>
     */
    @NameInMap("QuotedMessage")
    public String quotedMessage;

    /**
     * <p><strong>Important</strong></p>
     * <p>When this message is a reply to an Agent message (for example, the Agent asks a clarifying question through ASK_HUMAN), set reply_to to the exact Checkpoint sequence number carried by that Agent message. If this message is not a targeted reply, such as requesting further in-depth analysis after analysis is complete, leave reply_to empty or set it to &quot;0&quot;.  </p>
     * <p>This field affects how the Agent decides to process the message. Passing an incorrect value may lead to analysis results that do not meet expectations.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplyTo")
    public String replyTo;

    /**
     * <p>The special configuration for this session. For the same session, only the configuration passed with the first SendMessage call takes effect.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionConfig")
    public String sessionConfigShrink;

    /**
     * <p>The session ID. This is a required field. You can obtain the SessionId by calling the CreateAgentSession operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sess_***</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The configuration items that affect only the current task.</p>
     */
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
