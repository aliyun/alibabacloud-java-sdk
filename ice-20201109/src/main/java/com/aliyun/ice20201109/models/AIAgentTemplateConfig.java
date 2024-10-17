// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentTemplateConfig extends TeaModel {
    @NameInMap("AvatarChat3D")
    public AIAgentTemplateConfigAvatarChat3D avatarChat3D;

    @NameInMap("VisionChat")
    public AIAgentTemplateConfigVisionChat visionChat;

    @NameInMap("VoiceChat")
    public AIAgentTemplateConfigVoiceChat voiceChat;

    public static AIAgentTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
        AIAgentTemplateConfig self = new AIAgentTemplateConfig();
        return TeaModel.build(map, self);
    }

    public AIAgentTemplateConfig setAvatarChat3D(AIAgentTemplateConfigAvatarChat3D avatarChat3D) {
        this.avatarChat3D = avatarChat3D;
        return this;
    }
    public AIAgentTemplateConfigAvatarChat3D getAvatarChat3D() {
        return this.avatarChat3D;
    }

    public AIAgentTemplateConfig setVisionChat(AIAgentTemplateConfigVisionChat visionChat) {
        this.visionChat = visionChat;
        return this;
    }
    public AIAgentTemplateConfigVisionChat getVisionChat() {
        return this.visionChat;
    }

    public AIAgentTemplateConfig setVoiceChat(AIAgentTemplateConfigVoiceChat voiceChat) {
        this.voiceChat = voiceChat;
        return this;
    }
    public AIAgentTemplateConfigVoiceChat getVoiceChat() {
        return this.voiceChat;
    }

    public static class AIAgentTemplateConfigAvatarChat3D extends TeaModel {
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        @NameInMap("AvatarId")
        public String avatarId;

        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        @NameInMap("Greeting")
        public String greeting;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("Volume")
        public Long volume;

        public static AIAgentTemplateConfigAvatarChat3D build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigAvatarChat3D self = new AIAgentTemplateConfigAvatarChat3D();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigAvatarChat3D setAsrMaxSilence(Integer asrMaxSilence) {
            this.asrMaxSilence = asrMaxSilence;
            return this;
        }
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        public AIAgentTemplateConfigAvatarChat3D setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

        public AIAgentTemplateConfigAvatarChat3D setEnableVoiceInterrupt(Boolean enableVoiceInterrupt) {
            this.enableVoiceInterrupt = enableVoiceInterrupt;
            return this;
        }
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        public AIAgentTemplateConfigAvatarChat3D setGracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        public AIAgentTemplateConfigAvatarChat3D setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
        }

        public AIAgentTemplateConfigAvatarChat3D setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigAvatarChat3D setVolume(Long volume) {
            this.volume = volume;
            return this;
        }
        public Long getVolume() {
            return this.volume;
        }

    }

    public static class AIAgentTemplateConfigVisionChat extends TeaModel {
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        @NameInMap("EnableIntelligentSegment")
        public Boolean enableIntelligentSegment;

        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        @NameInMap("Greeting")
        public String greeting;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("Volume")
        public Long volume;

        public static AIAgentTemplateConfigVisionChat build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigVisionChat self = new AIAgentTemplateConfigVisionChat();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigVisionChat setAsrMaxSilence(Integer asrMaxSilence) {
            this.asrMaxSilence = asrMaxSilence;
            return this;
        }
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        public AIAgentTemplateConfigVisionChat setEnableIntelligentSegment(Boolean enableIntelligentSegment) {
            this.enableIntelligentSegment = enableIntelligentSegment;
            return this;
        }
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        public AIAgentTemplateConfigVisionChat setEnableVoiceInterrupt(Boolean enableVoiceInterrupt) {
            this.enableVoiceInterrupt = enableVoiceInterrupt;
            return this;
        }
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        public AIAgentTemplateConfigVisionChat setGracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        public AIAgentTemplateConfigVisionChat setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
        }

        public AIAgentTemplateConfigVisionChat setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigVisionChat setVolume(Long volume) {
            this.volume = volume;
            return this;
        }
        public Long getVolume() {
            return this.volume;
        }

    }

    public static class AIAgentTemplateConfigVoiceChat extends TeaModel {
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        @NameInMap("Greeting")
        public String greeting;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("Volume")
        public Long volume;

        public static AIAgentTemplateConfigVoiceChat build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigVoiceChat self = new AIAgentTemplateConfigVoiceChat();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigVoiceChat setAsrMaxSilence(Integer asrMaxSilence) {
            this.asrMaxSilence = asrMaxSilence;
            return this;
        }
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        public AIAgentTemplateConfigVoiceChat setEnableVoiceInterrupt(Boolean enableVoiceInterrupt) {
            this.enableVoiceInterrupt = enableVoiceInterrupt;
            return this;
        }
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        public AIAgentTemplateConfigVoiceChat setGracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }
        public Boolean getGracefulShutdown() {
            return this.gracefulShutdown;
        }

        public AIAgentTemplateConfigVoiceChat setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }
        public String getGreeting() {
            return this.greeting;
        }

        public AIAgentTemplateConfigVoiceChat setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigVoiceChat setVolume(Long volume) {
            this.volume = volume;
            return this;
        }
        public Long getVolume() {
            return this.volume;
        }

    }

}
