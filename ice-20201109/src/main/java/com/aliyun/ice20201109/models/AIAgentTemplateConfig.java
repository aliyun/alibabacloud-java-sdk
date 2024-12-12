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

    public static class AIAgentTemplateConfigAvatarChat3DLlmHistory extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Role")
        public String role;

        public static AIAgentTemplateConfigAvatarChat3DLlmHistory build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigAvatarChat3DLlmHistory self = new AIAgentTemplateConfigAvatarChat3DLlmHistory();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigAvatarChat3DLlmHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AIAgentTemplateConfigAvatarChat3DLlmHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class AIAgentTemplateConfigAvatarChat3D extends TeaModel {
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        @NameInMap("AvatarId")
        public String avatarId;

        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("EnableIntelligentSegment")
        public Boolean enableIntelligentSegment;

        @NameInMap("EnablePushToTalk")
        public Boolean enablePushToTalk;

        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        @NameInMap("Greeting")
        public String greeting;

        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigAvatarChat3DLlmHistory> llmHistory;

        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceprintId")
        public String voiceprintId;

        @NameInMap("Volume")
        public Long volume;

        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        @NameInMap("WorkflowOverrideParams")
        public String workflowOverrideParams;

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

        public AIAgentTemplateConfigAvatarChat3D setBailianAppParams(String bailianAppParams) {
            this.bailianAppParams = bailianAppParams;
            return this;
        }
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        public AIAgentTemplateConfigAvatarChat3D setEnableIntelligentSegment(Boolean enableIntelligentSegment) {
            this.enableIntelligentSegment = enableIntelligentSegment;
            return this;
        }
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        public AIAgentTemplateConfigAvatarChat3D setEnablePushToTalk(Boolean enablePushToTalk) {
            this.enablePushToTalk = enablePushToTalk;
            return this;
        }
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
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

        public AIAgentTemplateConfigAvatarChat3D setLlmHistory(java.util.List<AIAgentTemplateConfigAvatarChat3DLlmHistory> llmHistory) {
            this.llmHistory = llmHistory;
            return this;
        }
        public java.util.List<AIAgentTemplateConfigAvatarChat3DLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        public AIAgentTemplateConfigAvatarChat3D setLlmHistoryLimit(Integer llmHistoryLimit) {
            this.llmHistoryLimit = llmHistoryLimit;
            return this;
        }
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        public AIAgentTemplateConfigAvatarChat3D setMaxIdleTime(Integer maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
            return this;
        }
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        public AIAgentTemplateConfigAvatarChat3D setUseVoiceprint(Boolean useVoiceprint) {
            this.useVoiceprint = useVoiceprint;
            return this;
        }
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        public AIAgentTemplateConfigAvatarChat3D setUserOfflineTimeout(Integer userOfflineTimeout) {
            this.userOfflineTimeout = userOfflineTimeout;
            return this;
        }
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        public AIAgentTemplateConfigAvatarChat3D setUserOnlineTimeout(Integer userOnlineTimeout) {
            this.userOnlineTimeout = userOnlineTimeout;
            return this;
        }
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        public AIAgentTemplateConfigAvatarChat3D setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigAvatarChat3D setVoiceprintId(String voiceprintId) {
            this.voiceprintId = voiceprintId;
            return this;
        }
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        public AIAgentTemplateConfigAvatarChat3D setVolume(Long volume) {
            this.volume = volume;
            return this;
        }
        public Long getVolume() {
            return this.volume;
        }

        public AIAgentTemplateConfigAvatarChat3D setWakeUpQuery(String wakeUpQuery) {
            this.wakeUpQuery = wakeUpQuery;
            return this;
        }
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        public AIAgentTemplateConfigAvatarChat3D setWorkflowOverrideParams(String workflowOverrideParams) {
            this.workflowOverrideParams = workflowOverrideParams;
            return this;
        }
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

    }

    public static class AIAgentTemplateConfigVisionChatLlmHistory extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Role")
        public String role;

        public static AIAgentTemplateConfigVisionChatLlmHistory build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigVisionChatLlmHistory self = new AIAgentTemplateConfigVisionChatLlmHistory();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigVisionChatLlmHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AIAgentTemplateConfigVisionChatLlmHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class AIAgentTemplateConfigVisionChat extends TeaModel {
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("EnableIntelligentSegment")
        public Boolean enableIntelligentSegment;

        @NameInMap("EnablePushToTalk")
        public Boolean enablePushToTalk;

        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        @NameInMap("Greeting")
        public String greeting;

        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigVisionChatLlmHistory> llmHistory;

        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceprintId")
        public String voiceprintId;

        @NameInMap("Volume")
        public Long volume;

        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        @NameInMap("WorkflowOverrideParams")
        public String workflowOverrideParams;

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

        public AIAgentTemplateConfigVisionChat setBailianAppParams(String bailianAppParams) {
            this.bailianAppParams = bailianAppParams;
            return this;
        }
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        public AIAgentTemplateConfigVisionChat setEnableIntelligentSegment(Boolean enableIntelligentSegment) {
            this.enableIntelligentSegment = enableIntelligentSegment;
            return this;
        }
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        public AIAgentTemplateConfigVisionChat setEnablePushToTalk(Boolean enablePushToTalk) {
            this.enablePushToTalk = enablePushToTalk;
            return this;
        }
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
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

        public AIAgentTemplateConfigVisionChat setLlmHistory(java.util.List<AIAgentTemplateConfigVisionChatLlmHistory> llmHistory) {
            this.llmHistory = llmHistory;
            return this;
        }
        public java.util.List<AIAgentTemplateConfigVisionChatLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        public AIAgentTemplateConfigVisionChat setLlmHistoryLimit(Integer llmHistoryLimit) {
            this.llmHistoryLimit = llmHistoryLimit;
            return this;
        }
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        public AIAgentTemplateConfigVisionChat setMaxIdleTime(Integer maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
            return this;
        }
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        public AIAgentTemplateConfigVisionChat setUseVoiceprint(Boolean useVoiceprint) {
            this.useVoiceprint = useVoiceprint;
            return this;
        }
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        public AIAgentTemplateConfigVisionChat setUserOfflineTimeout(Integer userOfflineTimeout) {
            this.userOfflineTimeout = userOfflineTimeout;
            return this;
        }
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        public AIAgentTemplateConfigVisionChat setUserOnlineTimeout(Integer userOnlineTimeout) {
            this.userOnlineTimeout = userOnlineTimeout;
            return this;
        }
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        public AIAgentTemplateConfigVisionChat setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigVisionChat setVoiceprintId(String voiceprintId) {
            this.voiceprintId = voiceprintId;
            return this;
        }
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        public AIAgentTemplateConfigVisionChat setVolume(Long volume) {
            this.volume = volume;
            return this;
        }
        public Long getVolume() {
            return this.volume;
        }

        public AIAgentTemplateConfigVisionChat setWakeUpQuery(String wakeUpQuery) {
            this.wakeUpQuery = wakeUpQuery;
            return this;
        }
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        public AIAgentTemplateConfigVisionChat setWorkflowOverrideParams(String workflowOverrideParams) {
            this.workflowOverrideParams = workflowOverrideParams;
            return this;
        }
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

    }

    public static class AIAgentTemplateConfigVoiceChatLlmHistory extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Role")
        public String role;

        public static AIAgentTemplateConfigVoiceChatLlmHistory build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigVoiceChatLlmHistory self = new AIAgentTemplateConfigVoiceChatLlmHistory();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigVoiceChatLlmHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AIAgentTemplateConfigVoiceChatLlmHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class AIAgentTemplateConfigVoiceChat extends TeaModel {
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        @NameInMap("AvatarUrl")
        public String avatarUrl;

        @NameInMap("AvatarUrlType")
        public String avatarUrlType;

        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("EnableIntelligentSegment")
        public Boolean enableIntelligentSegment;

        @NameInMap("EnablePushToTalk")
        public Boolean enablePushToTalk;

        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        @NameInMap("Greeting")
        public String greeting;

        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigVoiceChatLlmHistory> llmHistory;

        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceprintId")
        public String voiceprintId;

        @NameInMap("Volume")
        public Long volume;

        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        @NameInMap("WorkflowOverrideParams")
        public String workflowOverrideParams;

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

        public AIAgentTemplateConfigVoiceChat setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
            return this;
        }
        public String getAvatarUrl() {
            return this.avatarUrl;
        }

        public AIAgentTemplateConfigVoiceChat setAvatarUrlType(String avatarUrlType) {
            this.avatarUrlType = avatarUrlType;
            return this;
        }
        public String getAvatarUrlType() {
            return this.avatarUrlType;
        }

        public AIAgentTemplateConfigVoiceChat setBailianAppParams(String bailianAppParams) {
            this.bailianAppParams = bailianAppParams;
            return this;
        }
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        public AIAgentTemplateConfigVoiceChat setEnableIntelligentSegment(Boolean enableIntelligentSegment) {
            this.enableIntelligentSegment = enableIntelligentSegment;
            return this;
        }
        public Boolean getEnableIntelligentSegment() {
            return this.enableIntelligentSegment;
        }

        public AIAgentTemplateConfigVoiceChat setEnablePushToTalk(Boolean enablePushToTalk) {
            this.enablePushToTalk = enablePushToTalk;
            return this;
        }
        public Boolean getEnablePushToTalk() {
            return this.enablePushToTalk;
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

        public AIAgentTemplateConfigVoiceChat setLlmHistory(java.util.List<AIAgentTemplateConfigVoiceChatLlmHistory> llmHistory) {
            this.llmHistory = llmHistory;
            return this;
        }
        public java.util.List<AIAgentTemplateConfigVoiceChatLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        public AIAgentTemplateConfigVoiceChat setLlmHistoryLimit(Integer llmHistoryLimit) {
            this.llmHistoryLimit = llmHistoryLimit;
            return this;
        }
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        public AIAgentTemplateConfigVoiceChat setMaxIdleTime(Integer maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
            return this;
        }
        public Integer getMaxIdleTime() {
            return this.maxIdleTime;
        }

        public AIAgentTemplateConfigVoiceChat setUseVoiceprint(Boolean useVoiceprint) {
            this.useVoiceprint = useVoiceprint;
            return this;
        }
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        public AIAgentTemplateConfigVoiceChat setUserOfflineTimeout(Integer userOfflineTimeout) {
            this.userOfflineTimeout = userOfflineTimeout;
            return this;
        }
        public Integer getUserOfflineTimeout() {
            return this.userOfflineTimeout;
        }

        public AIAgentTemplateConfigVoiceChat setUserOnlineTimeout(Integer userOnlineTimeout) {
            this.userOnlineTimeout = userOnlineTimeout;
            return this;
        }
        public Integer getUserOnlineTimeout() {
            return this.userOnlineTimeout;
        }

        public AIAgentTemplateConfigVoiceChat setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigVoiceChat setVoiceprintId(String voiceprintId) {
            this.voiceprintId = voiceprintId;
            return this;
        }
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

        public AIAgentTemplateConfigVoiceChat setVolume(Long volume) {
            this.volume = volume;
            return this;
        }
        public Long getVolume() {
            return this.volume;
        }

        public AIAgentTemplateConfigVoiceChat setWakeUpQuery(String wakeUpQuery) {
            this.wakeUpQuery = wakeUpQuery;
            return this;
        }
        public String getWakeUpQuery() {
            return this.wakeUpQuery;
        }

        public AIAgentTemplateConfigVoiceChat setWorkflowOverrideParams(String workflowOverrideParams) {
            this.workflowOverrideParams = workflowOverrideParams;
            return this;
        }
        public String getWorkflowOverrideParams() {
            return this.workflowOverrideParams;
        }

    }

}
