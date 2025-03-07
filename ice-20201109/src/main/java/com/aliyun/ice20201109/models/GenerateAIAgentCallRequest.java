// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GenerateAIAgentCallRequest extends TeaModel {
    /**
     * <p>The ID of the AI agent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("AIAgentId")
    public String AIAgentId;

    @NameInMap("ChatSyncConfig")
    public GenerateAIAgentCallRequestChatSyncConfig chatSyncConfig;

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
    public AIAgentTemplateConfig templateConfig;

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
         * <strong>example:</strong>
         * <p>**<strong><strong>005e4f309379701645f4</strong></strong></p>
         */
        @NameInMap("IMAIAgentId")
        public String IMAIAgentId;

        /**
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
