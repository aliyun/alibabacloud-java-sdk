// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The agent ID configured in the <a href="https://ims.console.aliyun.com/ai/robot/list">IMS console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>The agent template configuration. Values you provide merge with the template configuration set in the console. If you omit this parameter, the agent uses its default configuration from the console.</p>
     * <blockquote>
     * <p>This field is compatible with TemplateConfig. Fields in AgentConfig take precedence. If TemplateConfig contains fields not defined in AgentConfig, those fields are used. Use AgentConfig instead of TemplateConfig.</p>
     * </blockquote>
     */
    @NameInMap("AgentConfig")
    public String agentConfigShrink;

    /**
     * <p>The chat history synchronization configuration.</p>
     */
    @NameInMap("ChatSyncConfig")
    public String chatSyncConfigShrink;

    /**
     * <p>The configuration required for the agent at runtime.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeConfig")
    public String runtimeConfigShrink;

    /**
     * <p>A unique identifier for the chat session. This parameter is optional.</p>
     * 
     * <strong>example:</strong>
     * <p>f213fbc005e4f309379701645f4****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The agent template configuration. Values you provide merge with the template configuration set in the console. If you omit this parameter, the agent uses its default configuration from the console.</p>
     * <blockquote>
     * <p>The agent template configuration. This field is deprecated. See the AgentConfig field.</p>
     * </blockquote>
     */
    @NameInMap("TemplateConfig")
    @Deprecated
    public String templateConfigShrink;

    /**
     * <p>User-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static StartAIAgentInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentInstanceShrinkRequest self = new StartAIAgentInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartAIAgentInstanceShrinkRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public StartAIAgentInstanceShrinkRequest setAgentConfigShrink(String agentConfigShrink) {
        this.agentConfigShrink = agentConfigShrink;
        return this;
    }
    public String getAgentConfigShrink() {
        return this.agentConfigShrink;
    }

    public StartAIAgentInstanceShrinkRequest setChatSyncConfigShrink(String chatSyncConfigShrink) {
        this.chatSyncConfigShrink = chatSyncConfigShrink;
        return this;
    }
    public String getChatSyncConfigShrink() {
        return this.chatSyncConfigShrink;
    }

    public StartAIAgentInstanceShrinkRequest setRuntimeConfigShrink(String runtimeConfigShrink) {
        this.runtimeConfigShrink = runtimeConfigShrink;
        return this;
    }
    public String getRuntimeConfigShrink() {
        return this.runtimeConfigShrink;
    }

    public StartAIAgentInstanceShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    @Deprecated
    public StartAIAgentInstanceShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public StartAIAgentInstanceShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
