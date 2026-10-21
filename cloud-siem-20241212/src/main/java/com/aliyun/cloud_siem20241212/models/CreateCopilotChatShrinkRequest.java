// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateCopilotChatShrinkRequest extends TeaModel {
    /**
     * <p>The client conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
     */
    @NameInMap("ClientConversationId")
    public String clientConversationId;

    /**
     * <p>The client message ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>366932fb-9a83-4a2d-94dd-c925b35f****</p>
     */
    @NameInMap("ClientMessageId")
    public String clientMessageId;

    /**
     * <p>The conversation ID.</p>
     * 
     * <strong>example:</strong>
     * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
     */
    @NameInMap("ConversationId")
    public String conversationId;

    /**
     * <p>The conversation creation configuration.</p>
     */
    @NameInMap("CreateConversation")
    public String createConversationShrink;

    /**
     * <p>The language of the returned messages. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The list of messages.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Messages")
    public String messagesShrink;

    /**
     * <p>The model identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen3.7-max</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The planning configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("PlanMode")
    public String planMode;

    /**
     * <p>The security project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>project-incident-****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>The region of the data management center for threat analysis. Specify the management center based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside in regions outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the conversation turn to replace.</p>
     * 
     * <strong>example:</strong>
     * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
     */
    @NameInMap("ReplaceTurnId")
    public String replaceTurnId;

    /**
     * <p>The route target identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>security-agent-route-****</p>
     */
    @NameInMap("RouteTarget")
    public String routeTarget;

    /**
     * <p>The request source.</p>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>Specifies whether to enable streaming responses.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Stream")
    public Boolean stream;

    /**
     * <p>The deep thinking configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("ThinkingMode")
    public String thinkingMode;

    /**
     * <p>The trace ID, which is used to query specific call information.</p>
     * 
     * <strong>example:</strong>
     * <p>550e8400e29b41d4a71644665544****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static CreateCopilotChatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCopilotChatShrinkRequest self = new CreateCopilotChatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCopilotChatShrinkRequest setClientConversationId(String clientConversationId) {
        this.clientConversationId = clientConversationId;
        return this;
    }
    public String getClientConversationId() {
        return this.clientConversationId;
    }

    public CreateCopilotChatShrinkRequest setClientMessageId(String clientMessageId) {
        this.clientMessageId = clientMessageId;
        return this;
    }
    public String getClientMessageId() {
        return this.clientMessageId;
    }

    public CreateCopilotChatShrinkRequest setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateCopilotChatShrinkRequest setCreateConversationShrink(String createConversationShrink) {
        this.createConversationShrink = createConversationShrink;
        return this;
    }
    public String getCreateConversationShrink() {
        return this.createConversationShrink;
    }

    public CreateCopilotChatShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateCopilotChatShrinkRequest setMessagesShrink(String messagesShrink) {
        this.messagesShrink = messagesShrink;
        return this;
    }
    public String getMessagesShrink() {
        return this.messagesShrink;
    }

    public CreateCopilotChatShrinkRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public CreateCopilotChatShrinkRequest setPlanMode(String planMode) {
        this.planMode = planMode;
        return this;
    }
    public String getPlanMode() {
        return this.planMode;
    }

    public CreateCopilotChatShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CreateCopilotChatShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCopilotChatShrinkRequest setReplaceTurnId(String replaceTurnId) {
        this.replaceTurnId = replaceTurnId;
        return this;
    }
    public String getReplaceTurnId() {
        return this.replaceTurnId;
    }

    public CreateCopilotChatShrinkRequest setRouteTarget(String routeTarget) {
        this.routeTarget = routeTarget;
        return this;
    }
    public String getRouteTarget() {
        return this.routeTarget;
    }

    public CreateCopilotChatShrinkRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateCopilotChatShrinkRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public CreateCopilotChatShrinkRequest setThinkingMode(String thinkingMode) {
        this.thinkingMode = thinkingMode;
        return this;
    }
    public String getThinkingMode() {
        return this.thinkingMode;
    }

    public CreateCopilotChatShrinkRequest setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
