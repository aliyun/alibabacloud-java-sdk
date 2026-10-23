// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class SendChatMessageShrinkRequest extends TeaModel {
    /**
     * <p><strong>[Optimized]</strong> This field is now automatically retrieved in the background. You do not need to specify it.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p><strong>[Optimized]</strong> This field is now automatically retrieved in the background. You do not need to specify it when calling the API.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The data source information. This parameter can be left empty. You can specify only one data source for this parameter. Use the DataSources parameter instead.</p>
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
     * <p>The content of the message sent to the agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>what can you do?</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The message type. Default value: <code>primary</code>.  </p>
     * <ul>
     * <li><p>In normal interactions with the agent, the message type is <code>primary</code>.</p>
     * </li>
     * <li><p>When the message is a response to a human-in-the-loop question from the agent, the type must be <code>additional</code>.</p>
     * </li>
     * <li><p>When the message is intended to trigger report generation, the type must be <code>report</code>.</p>
     * </li>
     * <li><p>When the message is intended to cancel the current session, the type must be <code>cancel</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>primary</p>
     */
    @NameInMap("MessageType")
    public String messageType;

    /**
     * <p>The ID of the parent session.</p>
     * 
     * <strong>example:</strong>
     * <p>20qrliuoo7p2vlsfg*****</p>
     */
    @NameInMap("ParentSessionId")
    public String parentSessionId;

    /**
     * <p>Required when the message type is <code>additional</code>. Specifies the specific question asked by the agent to the user through human-in-the-loop.</p>
     * 
     * <strong>example:</strong>
     * <p>Provide the calculation criteria for GMV</p>
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
     * <p>When this message is a reply to an agent message, such as an agent asking for clarification through ASK_HUMAN, <code>reply_to</code> must exactly match the checkpoint sequence number carried by that agent message. If this message is not a targeted reply, such as requesting the agent to perform further in-depth analysis after the initial analysis is complete, you can leave <code>reply_to</code> empty or set it to &quot;0&quot;.  </p>
     * <p>This field affects how the agent decides to process the message. Passing an incorrect value may lead to suboptimal analysis results.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ReplyTo")
    public String replyTo;

    /**
     * <p>The special configurations for the current session. For the same session, only the configurations specified in the first SendMessage call take effect.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SessionConfig")
    public String sessionConfigShrink;

    /**
     * <p>The session ID. This optional field is used for multi-turn sessions.</p>
     * <ul>
     * <li>You can start a session without specifying this field. The response will include the session ID for the current session.</li>
     * <li>You can also manually create a session ID by calling the CreateDataAgentSession operation and include the ID when initiating a session.</li>
     * <li>If you need multi-turn conversations, such as follow-up questions or confirming execution plans, specify the session ID returned by the previous SendChatMessage operation in this operation.</li>
     * </ul>
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
     * <p>The Object Storage Service (OSS) bucket of the user. If this parameter is left empty, the analysis process is securely stored in the built-in storage.</p>
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
