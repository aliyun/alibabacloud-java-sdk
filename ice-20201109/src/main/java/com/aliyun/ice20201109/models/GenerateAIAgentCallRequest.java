// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateAIAgentCallRequest extends TeaModel {
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
    public AIAgentConfig agentConfig;

    /**
     * <p>The chat synchronization configuration.</p>
     */
    @NameInMap("ChatSyncConfig")
    public GenerateAIAgentCallRequestChatSyncConfig chatSyncConfig;

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
    public AIAgentTemplateConfig templateConfig;

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

    public static GenerateAIAgentCallRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAIAgentCallRequest self = new GenerateAIAgentCallRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAIAgentCallRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public GenerateAIAgentCallRequest setAgentConfig(AIAgentConfig agentConfig) {
        this.agentConfig = agentConfig;
        return this;
    }
    public AIAgentConfig getAgentConfig() {
        return this.agentConfig;
    }

    public GenerateAIAgentCallRequest setChatSyncConfig(GenerateAIAgentCallRequestChatSyncConfig chatSyncConfig) {
        this.chatSyncConfig = chatSyncConfig;
        return this;
    }
    public GenerateAIAgentCallRequestChatSyncConfig getChatSyncConfig() {
        return this.chatSyncConfig;
    }

    public GenerateAIAgentCallRequest setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public GenerateAIAgentCallRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    @Deprecated
    public GenerateAIAgentCallRequest setTemplateConfig(AIAgentTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public AIAgentTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public GenerateAIAgentCallRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public GenerateAIAgentCallRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public static class GenerateAIAgentCallRequestChatSyncConfig extends TeaModel {
        /**
         * <p>The ID of the Instant Messaging (IM) agent.</p>
         * 
         * <strong>example:</strong>
         * <p>**<strong><strong>005e4f309379701645f4</strong></strong></p>
         */
        @NameInMap("IMAIAgentId")
        public String IMAIAgentId;

        /**
         * <p>The user ID of the recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>4167626d312034b2b1c3b7f2f3e41884</p>
         */
        @NameInMap("ReceiverId")
        public String receiverId;

        public static GenerateAIAgentCallRequestChatSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            GenerateAIAgentCallRequestChatSyncConfig self = new GenerateAIAgentCallRequestChatSyncConfig();
            return TeaModel.build(map, self);
        }

        public GenerateAIAgentCallRequestChatSyncConfig setIMAIAgentId(String IMAIAgentId) {
            this.IMAIAgentId = IMAIAgentId;
            return this;
        }
        public String getIMAIAgentId() {
            return this.IMAIAgentId;
        }

        public GenerateAIAgentCallRequestChatSyncConfig setReceiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }
        public String getReceiverId() {
            return this.receiverId;
        }

    }

}
