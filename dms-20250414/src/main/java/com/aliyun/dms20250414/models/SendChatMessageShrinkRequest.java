// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageShrinkRequest extends TeaModel {
    /**
     * <p>The agent ID. This is a required field. You can obtain the current AgentId from the response of the CreateAgentSession operation. Agent resources have a lifecycle, so the AgentId you need to specify may change with each request.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The Data Management unit you are currently in. If you select an analytics database, this information is used to correctly connect to your Data Management instance. You can go to the DAS console to view your current Data Management unit. If you are a user on the Alibaba Cloud China Website (<a href="http://www.aliyun.com">www.aliyun.com</a>), you can directly enter cn-hangzhou.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The data source information. This parameter can be left empty. This parameter supports only one data source. Use the DataSources parameter instead.</p>
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
     * <p>The message content to send to the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>what can you do?</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The message type. Default value: <code>[primary]</code>.</p>
     * <ul>
     * <li><p>Under normal circumstances, when interacting with the Agent, the message type is <code>[primary]</code>.</p>
     * </li>
     * <li><p>When the message is a response to the Agent\&quot;s Human-in-Loop question, the type should be <code>[additional]</code>.</p>
     * </li>
     * <li><p>When the message is intended to trigger a report generation, the type should be <code>[report]</code>.</p>
     * </li>
     * <li><p>When the message is intended to cancel the current session, the type should be <code>[cancel]</code>.</p>
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
     * <p>This is a required field when the message type is <code>additional</code>. Specify the specific question that the agent asks the user through Human-in-Loop.</p>
     * 
     * <strong>example:</strong>
     * <p>Please provide the criteria for calculating GMV</p>
     */
    @NameInMap("Question")
    public String question;

    /**
     * <p>The quoted content. This is typically used when interacting with the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;version&quot;:&quot;v0&quot;}</p>
     */
    @NameInMap("QuotedMessage")
    public String quotedMessage;

    /**
     * <p><strong>Important</strong></p>
     * <p>When this message is a reply to an Agent message (for example, the Agent asks a clarifying question through ASK_HUMAN), set reply_to to the exact Checkpoint number carried in that Agent message. If this message is not a targeted reply, such as requesting the Agent to perform further in-depth analysis after the analysis is complete, leave reply_to empty or set it to &quot;0&quot;.</p>
     * <p>This field affects how the Agent decides to process the message. Passing an incorrect value may cause the analysis results to fall short of expectations.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplyTo")
    public String replyTo;

    /**
     * <p>The special configuration for the current session. For the same session, only the configuration passed with the first SendMessage call takes effect.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionConfig")
    public String sessionConfigShrink;

    /**
     * <p>The session ID. This is a required field. You can obtain the SessionId by calling CreateAgentSession.</p>
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

    /**
     * <p>The user OSS bucket. If this parameter is not specified, analysis data is securely stored in the built-in storage.</p>
     * 
     * <strong>example:</strong>
     * <p>my-bucket</p>
     */
    @NameInMap("UserOssBucket")
    public String userOssBucket;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>c1p71ne***baexrt3o</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

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

    public SendChatMessageShrinkRequest setUserOssBucket(String userOssBucket) {
        this.userOssBucket = userOssBucket;
        return this;
    }
    public String getUserOssBucket() {
        return this.userOssBucket;
    }

    public SendChatMessageShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
