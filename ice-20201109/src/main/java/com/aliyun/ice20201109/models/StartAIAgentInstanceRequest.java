// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class StartAIAgentInstanceRequest extends TeaModel {
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
    public AIAgentConfig agentConfig;

    /**
     * <p>The chat history synchronization configuration.</p>
     */
    @NameInMap("ChatSyncConfig")
    public StartAIAgentInstanceRequestChatSyncConfig chatSyncConfig;

    /**
     * <p>The configuration required for the agent at runtime.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuntimeConfig")
    public AIAgentRuntimeConfig runtimeConfig;

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
    public AIAgentTemplateConfig templateConfig;

    /**
     * <p>User-defined data.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static StartAIAgentInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAIAgentInstanceRequest self = new StartAIAgentInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartAIAgentInstanceRequest setAIAgentId(String AIAgentId) {
        this.AIAgentId = AIAgentId;
        return this;
    }
    public String getAIAgentId() {
        return this.AIAgentId;
    }

    public StartAIAgentInstanceRequest setAgentConfig(AIAgentConfig agentConfig) {
        this.agentConfig = agentConfig;
        return this;
    }
    public AIAgentConfig getAgentConfig() {
        return this.agentConfig;
    }

    public StartAIAgentInstanceRequest setChatSyncConfig(StartAIAgentInstanceRequestChatSyncConfig chatSyncConfig) {
        this.chatSyncConfig = chatSyncConfig;
        return this;
    }
    public StartAIAgentInstanceRequestChatSyncConfig getChatSyncConfig() {
        return this.chatSyncConfig;
    }

    public StartAIAgentInstanceRequest setRuntimeConfig(AIAgentRuntimeConfig runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }
    public AIAgentRuntimeConfig getRuntimeConfig() {
        return this.runtimeConfig;
    }

    public StartAIAgentInstanceRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    @Deprecated
    public StartAIAgentInstanceRequest setTemplateConfig(AIAgentTemplateConfig templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public AIAgentTemplateConfig getTemplateConfig() {
        return this.templateConfig;
    }

    public StartAIAgentInstanceRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class StartAIAgentInstanceRequestChatSyncConfig extends TeaModel {
        /**
         * <p>The IM agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>**<strong><strong>005e4f309379701645f4</strong></strong></p>
         */
        @NameInMap("IMAIAgentId")
        public String IMAIAgentId;

        /**
         * <p>The receiver user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4167626d312034b2b1c3b7f2f3e41884</p>
         */
        @NameInMap("ReceiverId")
        public String receiverId;

        public static StartAIAgentInstanceRequestChatSyncConfig build(java.util.Map<String, ?> map) throws Exception {
            StartAIAgentInstanceRequestChatSyncConfig self = new StartAIAgentInstanceRequestChatSyncConfig();
            return TeaModel.build(map, self);
        }

        public StartAIAgentInstanceRequestChatSyncConfig setIMAIAgentId(String IMAIAgentId) {
            this.IMAIAgentId = IMAIAgentId;
            return this;
        }
        public String getIMAIAgentId() {
            return this.IMAIAgentId;
        }

        public StartAIAgentInstanceRequestChatSyncConfig setReceiverId(String receiverId) {
            this.receiverId = receiverId;
            return this;
        }
        public String getReceiverId() {
            return this.receiverId;
        }

    }

}
