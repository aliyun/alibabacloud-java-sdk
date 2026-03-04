// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentRuntimeConfig extends TeaModel {
    /**
     * <p>The name of the agent in the ARTC channel.</p>
     * 
     * <strong>example:</strong>
     * <p>877ae632caae49b1afc81c2e8194ffb4</p>
     */
    @NameInMap("AgentUserId")
    public String agentUserId;

    /**
     * <p>The authentication token for the agent to join the channel. This must be generated using your AppKey.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
     */
    @NameInMap("AuthToken")
    public String authToken;

    /**
     * <p>The runtime parameters of the avatar call.</p>
     */
    @NameInMap("AvatarChat3D")
    @Deprecated
    public AIAgentRuntimeConfigAvatarChat3D avatarChat3D;

    /**
     * <p>The ID of the ARTC channel.</p>
     * 
     * <strong>example:</strong>
     * <p>70f22d5784194938a7e387052f2b3208</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The runtime parameters of the vision call.</p>
     */
    @NameInMap("VisionChat")
    @Deprecated
    public AIAgentRuntimeConfigVisionChat visionChat;

    /**
     * <p>The runtime parameters of the voice call.</p>
     */
    @NameInMap("VoiceChat")
    @Deprecated
    public AIAgentRuntimeConfigVoiceChat voiceChat;

    public static AIAgentRuntimeConfig build(java.util.Map<String, ?> map) throws Exception {
        AIAgentRuntimeConfig self = new AIAgentRuntimeConfig();
        return TeaModel.build(map, self);
    }

    public AIAgentRuntimeConfig setAgentUserId(String agentUserId) {
        this.agentUserId = agentUserId;
        return this;
    }
    public String getAgentUserId() {
        return this.agentUserId;
    }

    public AIAgentRuntimeConfig setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    @Deprecated
    public AIAgentRuntimeConfig setAvatarChat3D(AIAgentRuntimeConfigAvatarChat3D avatarChat3D) {
        this.avatarChat3D = avatarChat3D;
        return this;
    }
    public AIAgentRuntimeConfigAvatarChat3D getAvatarChat3D() {
        return this.avatarChat3D;
    }

    public AIAgentRuntimeConfig setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    @Deprecated
    public AIAgentRuntimeConfig setVisionChat(AIAgentRuntimeConfigVisionChat visionChat) {
        this.visionChat = visionChat;
        return this;
    }
    public AIAgentRuntimeConfigVisionChat getVisionChat() {
        return this.visionChat;
    }

    @Deprecated
    public AIAgentRuntimeConfig setVoiceChat(AIAgentRuntimeConfigVoiceChat voiceChat) {
        this.voiceChat = voiceChat;
        return this;
    }
    public AIAgentRuntimeConfigVoiceChat getVoiceChat() {
        return this.voiceChat;
    }

    public static class AIAgentRuntimeConfigAvatarChat3D extends TeaModel {
        /**
         * <p>Required. The name of the agent in the ARTC channel.</p>
         * 
         * <strong>example:</strong>
         * <p>877ae632caae49b1afc81c2e8194ffb4</p>
         */
        @NameInMap("AgentUserId")
        public String agentUserId;

        /**
         * <p>Required. The authentication token for the agent to join the channel. This must be generated using your AppKey.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>Required. The ID of the ARTC channel.</p>
         * 
         * <strong>example:</strong>
         * <p>70f22d5784194938a7e387052f2b3208</p>
         */
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
        /**
         * <p>Required. The name of the agent in the ARTC channel.</p>
         * 
         * <strong>example:</strong>
         * <p>877ae632caae49b1afc81c2e8194ffb4</p>
         */
        @NameInMap("AgentUserId")
        public String agentUserId;

        /**
         * <p>Required. The authentication token for the agent to join the channel. This must be generated using your AppKey.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>Required. The ID of the ARTC channel.</p>
         * 
         * <strong>example:</strong>
         * <p>70f22d5784194938a7e387052f2b3208</p>
         */
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
        /**
         * <p>Required. The name of the agent in the ARTC channel.</p>
         * 
         * <strong>example:</strong>
         * <p>877ae632caae49b1afc81c2e8194ffb4</p>
         */
        @NameInMap("AgentUserId")
        public String agentUserId;

        /**
         * <p>Required. The authentication token for the agent to join the channel. This must be generated using your AppKey.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
         */
        @NameInMap("AuthToken")
        public String authToken;

        /**
         * <p>Required. The ID of the ARTC channel.</p>
         * 
         * <strong>example:</strong>
         * <p>70f22d5784194938a7e387052f2b3208</p>
         */
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
