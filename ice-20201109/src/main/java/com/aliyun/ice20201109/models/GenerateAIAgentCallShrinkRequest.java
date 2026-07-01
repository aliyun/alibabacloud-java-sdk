// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateAIAgentCallShrinkRequest extends TeaModel {
    /**
     * <p>The AI agent ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    /**
     * <p>The agent template configuration. The configuration you provide merges with the agent template configuration in the console. If you omit this parameter, the agent uses the default configuration from the console.</p>
     * <blockquote>
     * <p>Compatibility with <code>TemplateConfig</code>: Fields in <code>AgentConfig</code> take precedence. If a field is specified in <code>TemplateConfig</code> but not in <code>AgentConfig</code>, the system uses the value from <code>TemplateConfig</code>. We recommend using <code>AgentConfig</code> instead of <code>TemplateConfig</code>.</p>
     * </blockquote>
     */
    @NameInMap("AgentConfig")
    public String agentConfigShrink;

    /**
     * <p>The chat synchronization configuration.</p>
     */
    @NameInMap("ChatSyncConfig")
    public String chatSyncConfigShrink;

    /**
     * <p>Optional. The expiration time of the token in seconds. Default value: 3600. Value range: 0 to 604800.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <p>A unique identifier for the session. If not provided, a new session is created.</p>
     * 
     * <strong>example:</strong>
     * <p>fw1gr0bc005e4f309379701645f4****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <ul>
     * <li><p>This configuration merges with the agent template configuration in the console.</p>
     * </li>
     * <li><p>If you omit this parameter, the agent uses the default configuration from the console.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The agent template configuration. This parameter is deprecated. Use the AgentConfig parameter instead.</p>
     * </blockquote>
     */
    @NameInMap("TemplateConfig")
    @Deprecated
    public String templateConfigShrink;

    /**
     * <p>User data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The username in the channel. If you do not specify a username, one is automatically generated. The username can be up to 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>877ae632caae49b1afc81c2e8194ffb4</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GenerateAIAgentCallShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAIAgentCallShrinkRequest self = new GenerateAIAgentCallShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAIAgentCallShrinkRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public GenerateAIAgentCallShrinkRequest setAgentConfigShrink(String agentConfigShrink) {
        this.agentConfigShrink = agentConfigShrink;
        return this;
    }
    public String getAgentConfigShrink() {
        return this.agentConfigShrink;
    }

    public GenerateAIAgentCallShrinkRequest setChatSyncConfigShrink(String chatSyncConfigShrink) {
        this.chatSyncConfigShrink = chatSyncConfigShrink;
        return this;
    }
    public String getChatSyncConfigShrink() {
        return this.chatSyncConfigShrink;
    }

    public GenerateAIAgentCallShrinkRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public GenerateAIAgentCallShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    @Deprecated
    public GenerateAIAgentCallShrinkRequest setTemplateConfigShrink(String templateConfigShrink) {
        this.templateConfigShrink = templateConfigShrink;
        return this;
    }
    public String getTemplateConfigShrink() {
        return this.templateConfigShrink;
    }

    public GenerateAIAgentCallShrinkRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GenerateAIAgentCallShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
