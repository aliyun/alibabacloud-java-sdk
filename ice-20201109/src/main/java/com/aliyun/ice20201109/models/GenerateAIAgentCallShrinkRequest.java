// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateAIAgentCallShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    @NameInMap("AgentConfig")
    public String agentConfigShrink;

    @NameInMap("ChatSyncConfig")
    public String chatSyncConfigShrink;

    /**
     * <p>The time when the token expires. Unit: seconds. Default value: 3600. Valid values: 0 to 604800.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Expire")
    public Long expire;

    /**
     * <strong>example:</strong>
     * <p>fw1gr0bc005e4f309379701645f4****</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The template configurations of the AI agent. The specified configurations are merged with the template configurations that are specified in the console. If you do not specify this parameter, the system uses the default configurations for an AI agent created in the console.</p>
     */
    @NameInMap("TemplateConfig")
    @Deprecated
    public String templateConfigShrink;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    /**
     * <p>The username of the AI agent in the channel. If you do not specify this parameter, the system automatically generates a username. The value can be up to 64 characters in length.</p>
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
