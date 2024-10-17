// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentRuntimeConfig extends TeaModel {
    @NameInMap("AvatarChat3D")
    public AIAgentRuntimeConfigAvatarChat3D avatarChat3D;

    @NameInMap("VisionChat")
    public AIAgentRuntimeConfigVisionChat visionChat;

    @NameInMap("VoiceChat")
    public AIAgentRuntimeConfigVoiceChat voiceChat;

    public static AIAgentRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
        AIAgentRuntimeConfig self = new AIAgentRuntimeConfig();
        return TeaModel.build(map, self);
    }

    public AIAgentRuntimeConfig setAvatarChat3D(AIAgentRuntimeConfigAvatarChat3D avatarChat3D) {
        this.avatarChat3D = avatarChat3D;
        return this;
    }
    public AIAgentRuntimeConfigAvatarChat3D getAvatarChat3D() {
        return this.avatarChat3D;
    }

    public AIAgentRuntimeConfig setVisionChat(AIAgentRuntimeConfigVisionChat visionChat) {
        this.visionChat = visionChat;
        return this;
    }
    public AIAgentRuntimeConfigVisionChat getVisionChat() {
        return this.visionChat;
    }

    public AIAgentRuntimeConfig setVoiceChat(AIAgentRuntimeConfigVoiceChat voiceChat) {
        this.voiceChat = voiceChat;
        return this;
    }
    public AIAgentRuntimeConfigVoiceChat getVoiceChat() {
        return this.voiceChat;
    }

    public static class AIAgentRuntimeConfigAvatarChat3D extends TeaModel {
        @NameInMap("AgentUserId")
        public String agentUserId;

        @NameInMap("AuthToken")
        public String authToken;

        @NameInMap("ChannelId")
        public String channelId;

        public static AIAgentRuntimeConfigAvatarChat3D build(java.util.Map<String, ?> map) throws Exception {
            AIAgentRuntimeConfigAvatarChat3D self = new AIAgentRuntimeConfigAvatarChat3D();
            return TeaModel.build(map, self);
        }

        public AIAgentRuntimeConfigAvatarChat3D setAgentUserId(String agentUserId) {
            this.agentUserId = agentUserId;
            return this;
        }
        public String getAgentUserId() {
            return this.agentUserId;
        }

        public AIAgentRuntimeConfigAvatarChat3D setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public AIAgentRuntimeConfigAvatarChat3D setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

    }

    public static class AIAgentRuntimeConfigVisionChat extends TeaModel {
        @NameInMap("AgentUserId")
        public String agentUserId;

        @NameInMap("AuthToken")
        public String authToken;

        @NameInMap("ChannelId")
        public String channelId;

        public static AIAgentRuntimeConfigVisionChat build(java.util.Map<String, ?> map) throws Exception {
            AIAgentRuntimeConfigVisionChat self = new AIAgentRuntimeConfigVisionChat();
            return TeaModel.build(map, self);
        }

        public AIAgentRuntimeConfigVisionChat setAgentUserId(String agentUserId) {
            this.agentUserId = agentUserId;
            return this;
        }
        public String getAgentUserId() {
            return this.agentUserId;
        }

        public AIAgentRuntimeConfigVisionChat setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public AIAgentRuntimeConfigVisionChat setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

    }

    public static class AIAgentRuntimeConfigVoiceChat extends TeaModel {
        @NameInMap("AgentUserId")
        public String agentUserId;

        @NameInMap("AuthToken")
        public String authToken;

        @NameInMap("ChannelId")
        public String channelId;

        public static AIAgentRuntimeConfigVoiceChat build(java.util.Map<String, ?> map) throws Exception {
            AIAgentRuntimeConfigVoiceChat self = new AIAgentRuntimeConfigVoiceChat();
            return TeaModel.build(map, self);
        }

        public AIAgentRuntimeConfigVoiceChat setAgentUserId(String agentUserId) {
            this.agentUserId = agentUserId;
            return this;
        }
        public String getAgentUserId() {
            return this.agentUserId;
        }

        public AIAgentRuntimeConfigVoiceChat setAuthToken(String authToken) {
            this.authToken = authToken;
            return this;
        }
        public String getAuthToken() {
            return this.authToken;
        }

        public AIAgentRuntimeConfigVoiceChat setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

    }

}
