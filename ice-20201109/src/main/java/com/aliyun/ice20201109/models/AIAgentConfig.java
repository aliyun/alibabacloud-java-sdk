// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentConfig extends TeaModel {
    @NameInMap("AmbientSoundConfig")
    public AIAgentConfigAmbientSoundConfig ambientSoundConfig;

    @NameInMap("AsrConfig")
    public AIAgentConfigAsrConfig asrConfig;

    @NameInMap("AutoSpeechConfig")
    public AIAgentConfigAutoSpeechConfig autoSpeechConfig;

    @NameInMap("AvatarConfig")
    public AIAgentConfigAvatarConfig avatarConfig;

    @NameInMap("AvatarUrl")
    public String avatarUrl;

    @NameInMap("AvatarUrlType")
    public String avatarUrlType;

    @NameInMap("BackChannelingConfig")
    @Deprecated
    public java.util.List<AIAgentConfigBackChannelingConfig> backChannelingConfig;

    @NameInMap("BackChannelingConfigs")
    public java.util.List<AIAgentConfigBackChannelingConfigs> backChannelingConfigs;

    @NameInMap("EnableIntelligentSegment")
    public Boolean enableIntelligentSegment;

    @NameInMap("EnablePushToTalk")
    public Boolean enablePushToTalk;

    @NameInMap("ExperimentalConfig")
    public String experimentalConfig;

    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    @NameInMap("Greeting")
    public String greeting;

    @NameInMap("InterruptConfig")
    public AIAgentConfigInterruptConfig interruptConfig;

    @NameInMap("LlmConfig")
    public AIAgentConfigLlmConfig llmConfig;

    @NameInMap("MaxIdleTime")
    public Integer maxIdleTime;

    @NameInMap("TtsConfig")
    public AIAgentConfigTtsConfig ttsConfig;

    @NameInMap("TurnDetectionConfig")
    public AIAgentConfigTurnDetectionConfig turnDetectionConfig;

    @NameInMap("UserOfflineTimeout")
    public Integer userOfflineTimeout;

    @NameInMap("UserOnlineTimeout")
    public Integer userOnlineTimeout;

    @NameInMap("VcrConfig")
    public AIAgentConfigVcrConfig vcrConfig;

    @NameInMap("VoiceprintConfig")
    public AIAgentConfigVoiceprintConfig voiceprintConfig;

    @NameInMap("Volume")
    public Long volume;

    @NameInMap("WakeUpQuery")
    public String wakeUpQuery;

    @NameInMap("WorkflowOverrideParams")
    public String workflowOverrideParams;

    public static AIAgentConfig build(java.util.Map<String, ?> map) throws Exception {
        AIAgentConfig self = new AIAgentConfig();
        return TeaModel.build(map, self);
    }

    public AIAgentConfig setAmbientSoundConfig(AIAgentConfigAmbientSoundConfig ambientSoundConfig) {
        this.ambientSoundConfig = ambientSoundConfig;
        return this;
    }
    public AIAgentConfigAmbientSoundConfig getAmbientSoundConfig() {
        return this.ambientSoundConfig;
    }

    public AIAgentConfig setAsrConfig(AIAgentConfigAsrConfig asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public AIAgentConfigAsrConfig getAsrConfig() {
        return this.asrConfig;
    }

    public AIAgentConfig setAutoSpeechConfig(AIAgentConfigAutoSpeechConfig autoSpeechConfig) {
        this.autoSpeechConfig = autoSpeechConfig;
        return this;
    }
    public AIAgentConfigAutoSpeechConfig getAutoSpeechConfig() {
        return this.autoSpeechConfig;
    }

    public AIAgentConfig setAvatarConfig(AIAgentConfigAvatarConfig avatarConfig) {
        this.avatarConfig = avatarConfig;
        return this;
    }
    public AIAgentConfigAvatarConfig getAvatarConfig() {
        return this.avatarConfig;
    }

    public AIAgentConfig setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }
    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public AIAgentConfig setAvatarUrlType(String avatarUrlType) {
        this.avatarUrlType = avatarUrlType;
        return this;
    }
    public String getAvatarUrlType() {
        return this.avatarUrlType;
    }

    @Deprecated
    public AIAgentConfig setBackChannelingConfig(java.util.List<AIAgentConfigBackChannelingConfig> backChannelingConfig) {
        this.backChannelingConfig = backChannelingConfig;
        return this;
    }
    public java.util.List<AIAgentConfigBackChannelingConfig> getBackChannelingConfig() {
        return this.backChannelingConfig;
    }

    public AIAgentConfig setBackChannelingConfigs(java.util.List<AIAgentConfigBackChannelingConfigs> backChannelingConfigs) {
        this.backChannelingConfigs = backChannelingConfigs;
        return this;
    }
    public java.util.List<AIAgentConfigBackChannelingConfigs> getBackChannelingConfigs() {
        return this.backChannelingConfigs;
    }

    public AIAgentConfig setEnableIntelligentSegment(Boolean enableIntelligentSegment) {
        this.enableIntelligentSegment = enableIntelligentSegment;
        return this;
    }
    public Boolean getEnableIntelligentSegment() {
        return this.enableIntelligentSegment;
    }

    public AIAgentConfig setEnablePushToTalk(Boolean enablePushToTalk) {
        this.enablePushToTalk = enablePushToTalk;
        return this;
    }
    public Boolean getEnablePushToTalk() {
        return this.enablePushToTalk;
    }

    public AIAgentConfig setExperimentalConfig(String experimentalConfig) {
        this.experimentalConfig = experimentalConfig;
        return this;
    }
    public String getExperimentalConfig() {
        return this.experimentalConfig;
    }

    public AIAgentConfig setGracefulShutdown(Boolean gracefulShutdown) {
        this.gracefulShutdown = gracefulShutdown;
        return this;
    }
    public Boolean getGracefulShutdown() {
        return this.gracefulShutdown;
    }

    public AIAgentConfig setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
    public String getGreeting() {
        return this.greeting;
    }

    public AIAgentConfig setInterruptConfig(AIAgentConfigInterruptConfig interruptConfig) {
        this.interruptConfig = interruptConfig;
        return this;
    }
    public AIAgentConfigInterruptConfig getInterruptConfig() {
        return this.interruptConfig;
    }

    public AIAgentConfig setLlmConfig(AIAgentConfigLlmConfig llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }
    public AIAgentConfigLlmConfig getLlmConfig() {
        return this.llmConfig;
    }

    public AIAgentConfig setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }
    public Integer getMaxIdleTime() {
        return this.maxIdleTime;
    }

    public AIAgentConfig setTtsConfig(AIAgentConfigTtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public AIAgentConfigTtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    public AIAgentConfig setTurnDetectionConfig(AIAgentConfigTurnDetectionConfig turnDetectionConfig) {
        this.turnDetectionConfig = turnDetectionConfig;
        return this;
    }
    public AIAgentConfigTurnDetectionConfig getTurnDetectionConfig() {
        return this.turnDetectionConfig;
    }

    public AIAgentConfig setUserOfflineTimeout(Integer userOfflineTimeout) {
        this.userOfflineTimeout = userOfflineTimeout;
        return this;
    }
    public Integer getUserOfflineTimeout() {
        return this.userOfflineTimeout;
    }

    public AIAgentConfig setUserOnlineTimeout(Integer userOnlineTimeout) {
        this.userOnlineTimeout = userOnlineTimeout;
        return this;
    }
    public Integer getUserOnlineTimeout() {
        return this.userOnlineTimeout;
    }

    public AIAgentConfig setVcrConfig(AIAgentConfigVcrConfig vcrConfig) {
        this.vcrConfig = vcrConfig;
        return this;
    }
    public AIAgentConfigVcrConfig getVcrConfig() {
        return this.vcrConfig;
    }

    public AIAgentConfig setVoiceprintConfig(AIAgentConfigVoiceprintConfig voiceprintConfig) {
        this.voiceprintConfig = voiceprintConfig;
        return this;
    }
    public AIAgentConfigVoiceprintConfig getVoiceprintConfig() {
        return this.voiceprintConfig;
    }

    public AIAgentConfig setVolume(Long volume) {
        this.volume = volume;
        return this;
    }
    public Long getVolume() {
        return this.volume;
    }

    public AIAgentConfig setWakeUpQuery(String wakeUpQuery) {
        this.wakeUpQuery = wakeUpQuery;
        return this;
    }
    public String getWakeUpQuery() {
        return this.wakeUpQuery;
    }

    public AIAgentConfig setWorkflowOverrideParams(String workflowOverrideParams) {
        this.workflowOverrideParams = workflowOverrideParams;
        return this;
    }
    public String getWorkflowOverrideParams() {
        return this.workflowOverrideParams;
    }

    public static class AIAgentConfigAmbientSoundConfig extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Volume")
        public Integer volume;

        public static AIAgentConfigAmbientSoundConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAmbientSoundConfig self = new AIAgentConfigAmbientSoundConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAmbientSoundConfig setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AIAgentConfigAmbientSoundConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class AIAgentConfigAsrConfig extends TeaModel {
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        @NameInMap("AsrLanguageId")
        public String asrLanguageId;

        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        @NameInMap("CustomParams")
        public String customParams;

        @NameInMap("VadDuration")
        public Integer vadDuration;

        @NameInMap("VadLevel")
        public Integer vadLevel;

        public static AIAgentConfigAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAsrConfig self = new AIAgentConfigAsrConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAsrConfig setAsrHotWords(java.util.List<String> asrHotWords) {
            this.asrHotWords = asrHotWords;
            return this;
        }
        public java.util.List<String> getAsrHotWords() {
            return this.asrHotWords;
        }

        public AIAgentConfigAsrConfig setAsrLanguageId(String asrLanguageId) {
            this.asrLanguageId = asrLanguageId;
            return this;
        }
        public String getAsrLanguageId() {
            return this.asrLanguageId;
        }

        public AIAgentConfigAsrConfig setAsrMaxSilence(Integer asrMaxSilence) {
            this.asrMaxSilence = asrMaxSilence;
            return this;
        }
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        public AIAgentConfigAsrConfig setCustomParams(String customParams) {
            this.customParams = customParams;
            return this;
        }
        public String getCustomParams() {
            return this.customParams;
        }

        public AIAgentConfigAsrConfig setVadDuration(Integer vadDuration) {
            this.vadDuration = vadDuration;
            return this;
        }
        public Integer getVadDuration() {
            return this.vadDuration;
        }

        public AIAgentConfigAsrConfig setVadLevel(Integer vadLevel) {
            this.vadLevel = vadLevel;
            return this;
        }
        public Integer getVadLevel() {
            return this.vadLevel;
        }

    }

    public static class AIAgentConfigAutoSpeechConfigLlmPendingMessages extends TeaModel {
        @NameInMap("Probability")
        public Double probability;

        @NameInMap("Text")
        public String text;

        public static AIAgentConfigAutoSpeechConfigLlmPendingMessages build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAutoSpeechConfigLlmPendingMessages self = new AIAgentConfigAutoSpeechConfigLlmPendingMessages();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAutoSpeechConfigLlmPendingMessages setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentConfigAutoSpeechConfigLlmPendingMessages setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AIAgentConfigAutoSpeechConfigLlmPending extends TeaModel {
        @NameInMap("Messages")
        public java.util.List<AIAgentConfigAutoSpeechConfigLlmPendingMessages> messages;

        @NameInMap("WaitTime")
        public Integer waitTime;

        public static AIAgentConfigAutoSpeechConfigLlmPending build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAutoSpeechConfigLlmPending self = new AIAgentConfigAutoSpeechConfigLlmPending();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAutoSpeechConfigLlmPending setMessages(java.util.List<AIAgentConfigAutoSpeechConfigLlmPendingMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<AIAgentConfigAutoSpeechConfigLlmPendingMessages> getMessages() {
            return this.messages;
        }

        public AIAgentConfigAutoSpeechConfigLlmPending setWaitTime(Integer waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Integer getWaitTime() {
            return this.waitTime;
        }

    }

    public static class AIAgentConfigAutoSpeechConfigUserIdleMessages extends TeaModel {
        @NameInMap("Probability")
        public Double probability;

        @NameInMap("Text")
        public String text;

        public static AIAgentConfigAutoSpeechConfigUserIdleMessages build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAutoSpeechConfigUserIdleMessages self = new AIAgentConfigAutoSpeechConfigUserIdleMessages();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAutoSpeechConfigUserIdleMessages setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentConfigAutoSpeechConfigUserIdleMessages setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AIAgentConfigAutoSpeechConfigUserIdle extends TeaModel {
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        @NameInMap("Messages")
        public java.util.List<AIAgentConfigAutoSpeechConfigUserIdleMessages> messages;

        @NameInMap("WaitTime")
        public Integer waitTime;

        public static AIAgentConfigAutoSpeechConfigUserIdle build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAutoSpeechConfigUserIdle self = new AIAgentConfigAutoSpeechConfigUserIdle();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAutoSpeechConfigUserIdle setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        public AIAgentConfigAutoSpeechConfigUserIdle setMessages(java.util.List<AIAgentConfigAutoSpeechConfigUserIdleMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<AIAgentConfigAutoSpeechConfigUserIdleMessages> getMessages() {
            return this.messages;
        }

        public AIAgentConfigAutoSpeechConfigUserIdle setWaitTime(Integer waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Integer getWaitTime() {
            return this.waitTime;
        }

    }

    public static class AIAgentConfigAutoSpeechConfig extends TeaModel {
        @NameInMap("LlmPending")
        public AIAgentConfigAutoSpeechConfigLlmPending llmPending;

        @NameInMap("UserIdle")
        public AIAgentConfigAutoSpeechConfigUserIdle userIdle;

        public static AIAgentConfigAutoSpeechConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAutoSpeechConfig self = new AIAgentConfigAutoSpeechConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAutoSpeechConfig setLlmPending(AIAgentConfigAutoSpeechConfigLlmPending llmPending) {
            this.llmPending = llmPending;
            return this;
        }
        public AIAgentConfigAutoSpeechConfigLlmPending getLlmPending() {
            return this.llmPending;
        }

        public AIAgentConfigAutoSpeechConfig setUserIdle(AIAgentConfigAutoSpeechConfigUserIdle userIdle) {
            this.userIdle = userIdle;
            return this;
        }
        public AIAgentConfigAutoSpeechConfigUserIdle getUserIdle() {
            return this.userIdle;
        }

    }

    public static class AIAgentConfigAvatarConfig extends TeaModel {
        @NameInMap("AvatarId")
        public String avatarId;

        public static AIAgentConfigAvatarConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAvatarConfig self = new AIAgentConfigAvatarConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAvatarConfig setAvatarId(String avatarId) {
            this.avatarId = avatarId;
            return this;
        }
        public String getAvatarId() {
            return this.avatarId;
        }

    }

    public static class AIAgentConfigBackChannelingConfigWords extends TeaModel {
        @NameInMap("Probability")
        public Double probability;

        @NameInMap("Text")
        public String text;

        public static AIAgentConfigBackChannelingConfigWords build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigBackChannelingConfigWords self = new AIAgentConfigBackChannelingConfigWords();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigBackChannelingConfigWords setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentConfigBackChannelingConfigWords setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AIAgentConfigBackChannelingConfig extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Probability")
        public Double probability;

        @NameInMap("TriggerStage")
        public String triggerStage;

        @NameInMap("Words")
        public java.util.List<AIAgentConfigBackChannelingConfigWords> words;

        public static AIAgentConfigBackChannelingConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigBackChannelingConfig self = new AIAgentConfigBackChannelingConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigBackChannelingConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AIAgentConfigBackChannelingConfig setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentConfigBackChannelingConfig setTriggerStage(String triggerStage) {
            this.triggerStage = triggerStage;
            return this;
        }
        public String getTriggerStage() {
            return this.triggerStage;
        }

        public AIAgentConfigBackChannelingConfig setWords(java.util.List<AIAgentConfigBackChannelingConfigWords> words) {
            this.words = words;
            return this;
        }
        public java.util.List<AIAgentConfigBackChannelingConfigWords> getWords() {
            return this.words;
        }

    }

    public static class AIAgentConfigBackChannelingConfigsWords extends TeaModel {
        @NameInMap("Probability")
        public Double probability;

        @NameInMap("Text")
        public String text;

        public static AIAgentConfigBackChannelingConfigsWords build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigBackChannelingConfigsWords self = new AIAgentConfigBackChannelingConfigsWords();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigBackChannelingConfigsWords setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentConfigBackChannelingConfigsWords setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AIAgentConfigBackChannelingConfigs extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Probability")
        public Double probability;

        @NameInMap("TriggerStage")
        public String triggerStage;

        @NameInMap("Words")
        public java.util.List<AIAgentConfigBackChannelingConfigsWords> words;

        public static AIAgentConfigBackChannelingConfigs build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigBackChannelingConfigs self = new AIAgentConfigBackChannelingConfigs();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigBackChannelingConfigs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AIAgentConfigBackChannelingConfigs setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentConfigBackChannelingConfigs setTriggerStage(String triggerStage) {
            this.triggerStage = triggerStage;
            return this;
        }
        public String getTriggerStage() {
            return this.triggerStage;
        }

        public AIAgentConfigBackChannelingConfigs setWords(java.util.List<AIAgentConfigBackChannelingConfigsWords> words) {
            this.words = words;
            return this;
        }
        public java.util.List<AIAgentConfigBackChannelingConfigsWords> getWords() {
            return this.words;
        }

    }

    public static class AIAgentConfigInterruptConfig extends TeaModel {
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        @NameInMap("NoInterruptMode")
        public String noInterruptMode;

        public static AIAgentConfigInterruptConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigInterruptConfig self = new AIAgentConfigInterruptConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigInterruptConfig setEnableVoiceInterrupt(Boolean enableVoiceInterrupt) {
            this.enableVoiceInterrupt = enableVoiceInterrupt;
            return this;
        }
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        public AIAgentConfigInterruptConfig setInterruptWords(java.util.List<String> interruptWords) {
            this.interruptWords = interruptWords;
            return this;
        }
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
        }

        public AIAgentConfigInterruptConfig setNoInterruptMode(String noInterruptMode) {
            this.noInterruptMode = noInterruptMode;
            return this;
        }
        public String getNoInterruptMode() {
            return this.noInterruptMode;
        }

    }

    public static class AIAgentConfigLlmConfigFunctionMap extends TeaModel {
        @NameInMap("Function")
        public String function;

        @NameInMap("MatchFunction")
        public String matchFunction;

        public static AIAgentConfigLlmConfigFunctionMap build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigLlmConfigFunctionMap self = new AIAgentConfigLlmConfigFunctionMap();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigLlmConfigFunctionMap setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public AIAgentConfigLlmConfigFunctionMap setMatchFunction(String matchFunction) {
            this.matchFunction = matchFunction;
            return this;
        }
        public String getMatchFunction() {
            return this.matchFunction;
        }

    }

    public static class AIAgentConfigLlmConfigLlmHistory extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Role")
        public String role;

        public static AIAgentConfigLlmConfigLlmHistory build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigLlmConfigLlmHistory self = new AIAgentConfigLlmConfigLlmHistory();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigLlmConfigLlmHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AIAgentConfigLlmConfigLlmHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class AIAgentConfigLlmConfig extends TeaModel {
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("FunctionMap")
        public java.util.List<AIAgentConfigLlmConfigFunctionMap> functionMap;

        @NameInMap("HistorySyncWithTTS")
        public Boolean historySyncWithTTS;

        @NameInMap("LlmCompleteReply")
        public Boolean llmCompleteReply;

        @NameInMap("LlmHistory")
        public java.util.List<AIAgentConfigLlmConfigLlmHistory> llmHistory;

        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        @NameInMap("OpenAIExtraQuery")
        public String openAIExtraQuery;

        @NameInMap("OutputMaxDelay")
        public Integer outputMaxDelay;

        @NameInMap("OutputMinLength")
        public Integer outputMinLength;

        public static AIAgentConfigLlmConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigLlmConfig self = new AIAgentConfigLlmConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigLlmConfig setBailianAppParams(String bailianAppParams) {
            this.bailianAppParams = bailianAppParams;
            return this;
        }
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        public AIAgentConfigLlmConfig setFunctionMap(java.util.List<AIAgentConfigLlmConfigFunctionMap> functionMap) {
            this.functionMap = functionMap;
            return this;
        }
        public java.util.List<AIAgentConfigLlmConfigFunctionMap> getFunctionMap() {
            return this.functionMap;
        }

        public AIAgentConfigLlmConfig setHistorySyncWithTTS(Boolean historySyncWithTTS) {
            this.historySyncWithTTS = historySyncWithTTS;
            return this;
        }
        public Boolean getHistorySyncWithTTS() {
            return this.historySyncWithTTS;
        }

        public AIAgentConfigLlmConfig setLlmCompleteReply(Boolean llmCompleteReply) {
            this.llmCompleteReply = llmCompleteReply;
            return this;
        }
        public Boolean getLlmCompleteReply() {
            return this.llmCompleteReply;
        }

        public AIAgentConfigLlmConfig setLlmHistory(java.util.List<AIAgentConfigLlmConfigLlmHistory> llmHistory) {
            this.llmHistory = llmHistory;
            return this;
        }
        public java.util.List<AIAgentConfigLlmConfigLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        public AIAgentConfigLlmConfig setLlmHistoryLimit(Integer llmHistoryLimit) {
            this.llmHistoryLimit = llmHistoryLimit;
            return this;
        }
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        public AIAgentConfigLlmConfig setLlmSystemPrompt(String llmSystemPrompt) {
            this.llmSystemPrompt = llmSystemPrompt;
            return this;
        }
        public String getLlmSystemPrompt() {
            return this.llmSystemPrompt;
        }

        public AIAgentConfigLlmConfig setOpenAIExtraQuery(String openAIExtraQuery) {
            this.openAIExtraQuery = openAIExtraQuery;
            return this;
        }
        public String getOpenAIExtraQuery() {
            return this.openAIExtraQuery;
        }

        public AIAgentConfigLlmConfig setOutputMaxDelay(Integer outputMaxDelay) {
            this.outputMaxDelay = outputMaxDelay;
            return this;
        }
        public Integer getOutputMaxDelay() {
            return this.outputMaxDelay;
        }

        public AIAgentConfigLlmConfig setOutputMinLength(Integer outputMinLength) {
            this.outputMinLength = outputMinLength;
            return this;
        }
        public Integer getOutputMinLength() {
            return this.outputMinLength;
        }

    }

    public static class AIAgentConfigTtsConfigPronunciationRules extends TeaModel {
        @NameInMap("Pronunciation")
        public String pronunciation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Word")
        public String word;

        public static AIAgentConfigTtsConfigPronunciationRules build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigTtsConfigPronunciationRules self = new AIAgentConfigTtsConfigPronunciationRules();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigTtsConfigPronunciationRules setPronunciation(String pronunciation) {
            this.pronunciation = pronunciation;
            return this;
        }
        public String getPronunciation() {
            return this.pronunciation;
        }

        public AIAgentConfigTtsConfigPronunciationRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AIAgentConfigTtsConfigPronunciationRules setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class AIAgentConfigTtsConfig extends TeaModel {
        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("LanguageId")
        public String languageId;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("PronunciationRules")
        public java.util.List<AIAgentConfigTtsConfigPronunciationRules> pronunciationRules;

        @NameInMap("SpeechRate")
        public Double speechRate;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        public static AIAgentConfigTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigTtsConfig self = new AIAgentConfigTtsConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigTtsConfig setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public AIAgentConfigTtsConfig setLanguageId(String languageId) {
            this.languageId = languageId;
            return this;
        }
        public String getLanguageId() {
            return this.languageId;
        }

        public AIAgentConfigTtsConfig setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public AIAgentConfigTtsConfig setPronunciationRules(java.util.List<AIAgentConfigTtsConfigPronunciationRules> pronunciationRules) {
            this.pronunciationRules = pronunciationRules;
            return this;
        }
        public java.util.List<AIAgentConfigTtsConfigPronunciationRules> getPronunciationRules() {
            return this.pronunciationRules;
        }

        public AIAgentConfigTtsConfig setSpeechRate(Double speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Double getSpeechRate() {
            return this.speechRate;
        }

        public AIAgentConfigTtsConfig setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentConfigTtsConfig setVoiceIdList(java.util.List<String> voiceIdList) {
            this.voiceIdList = voiceIdList;
            return this;
        }
        public java.util.List<String> getVoiceIdList() {
            return this.voiceIdList;
        }

    }

    public static class AIAgentConfigTurnDetectionConfig extends TeaModel {
        @NameInMap("Eagerness")
        public String eagerness;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("SemanticWaitDuration")
        public Integer semanticWaitDuration;

        @NameInMap("TurnEndWords")
        public java.util.List<String> turnEndWords;

        public static AIAgentConfigTurnDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigTurnDetectionConfig self = new AIAgentConfigTurnDetectionConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigTurnDetectionConfig setEagerness(String eagerness) {
            this.eagerness = eagerness;
            return this;
        }
        public String getEagerness() {
            return this.eagerness;
        }

        public AIAgentConfigTurnDetectionConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public AIAgentConfigTurnDetectionConfig setSemanticWaitDuration(Integer semanticWaitDuration) {
            this.semanticWaitDuration = semanticWaitDuration;
            return this;
        }
        public Integer getSemanticWaitDuration() {
            return this.semanticWaitDuration;
        }

        public AIAgentConfigTurnDetectionConfig setTurnEndWords(java.util.List<String> turnEndWords) {
            this.turnEndWords = turnEndWords;
            return this;
        }
        public java.util.List<String> getTurnEndWords() {
            return this.turnEndWords;
        }

    }

    public static class AIAgentConfigVcrConfigEquipment extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        public static AIAgentConfigVcrConfigEquipment build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigVcrConfigEquipment self = new AIAgentConfigVcrConfigEquipment();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigVcrConfigEquipment setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class AIAgentConfigVcrConfigHeadMotion extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        public static AIAgentConfigVcrConfigHeadMotion build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigVcrConfigHeadMotion self = new AIAgentConfigVcrConfigHeadMotion();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigVcrConfigHeadMotion setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class AIAgentConfigVcrConfigInvalidFrameMotion extends TeaModel {
        @NameInMap("CallbackDelay")
        public Integer callbackDelay;

        @NameInMap("Enabled")
        public Boolean enabled;

        public static AIAgentConfigVcrConfigInvalidFrameMotion build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigVcrConfigInvalidFrameMotion self = new AIAgentConfigVcrConfigInvalidFrameMotion();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigVcrConfigInvalidFrameMotion setCallbackDelay(Integer callbackDelay) {
            this.callbackDelay = callbackDelay;
            return this;
        }
        public Integer getCallbackDelay() {
            return this.callbackDelay;
        }

        public AIAgentConfigVcrConfigInvalidFrameMotion setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class AIAgentConfigVcrConfigLookAway extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        public static AIAgentConfigVcrConfigLookAway build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigVcrConfigLookAway self = new AIAgentConfigVcrConfigLookAway();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigVcrConfigLookAway setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class AIAgentConfigVcrConfigPeopleCount extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        public static AIAgentConfigVcrConfigPeopleCount build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigVcrConfigPeopleCount self = new AIAgentConfigVcrConfigPeopleCount();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigVcrConfigPeopleCount setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class AIAgentConfigVcrConfigStillFrameMotion extends TeaModel {
        @NameInMap("CallbackDelay")
        public Integer callbackDelay;

        @NameInMap("Enabled")
        public Boolean enabled;

        public static AIAgentConfigVcrConfigStillFrameMotion build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigVcrConfigStillFrameMotion self = new AIAgentConfigVcrConfigStillFrameMotion();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigVcrConfigStillFrameMotion setCallbackDelay(Integer callbackDelay) {
            this.callbackDelay = callbackDelay;
            return this;
        }
        public Integer getCallbackDelay() {
            return this.callbackDelay;
        }

        public AIAgentConfigVcrConfigStillFrameMotion setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class AIAgentConfigVcrConfig extends TeaModel {
        @NameInMap("Equipment")
        public AIAgentConfigVcrConfigEquipment equipment;

        @NameInMap("HeadMotion")
        public AIAgentConfigVcrConfigHeadMotion headMotion;

        @NameInMap("InvalidFrameMotion")
        public AIAgentConfigVcrConfigInvalidFrameMotion invalidFrameMotion;

        @NameInMap("LookAway")
        public AIAgentConfigVcrConfigLookAway lookAway;

        @NameInMap("PeopleCount")
        public AIAgentConfigVcrConfigPeopleCount peopleCount;

        @NameInMap("StillFrameMotion")
        public AIAgentConfigVcrConfigStillFrameMotion stillFrameMotion;

        public static AIAgentConfigVcrConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigVcrConfig self = new AIAgentConfigVcrConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigVcrConfig setEquipment(AIAgentConfigVcrConfigEquipment equipment) {
            this.equipment = equipment;
            return this;
        }
        public AIAgentConfigVcrConfigEquipment getEquipment() {
            return this.equipment;
        }

        public AIAgentConfigVcrConfig setHeadMotion(AIAgentConfigVcrConfigHeadMotion headMotion) {
            this.headMotion = headMotion;
            return this;
        }
        public AIAgentConfigVcrConfigHeadMotion getHeadMotion() {
            return this.headMotion;
        }

        public AIAgentConfigVcrConfig setInvalidFrameMotion(AIAgentConfigVcrConfigInvalidFrameMotion invalidFrameMotion) {
            this.invalidFrameMotion = invalidFrameMotion;
            return this;
        }
        public AIAgentConfigVcrConfigInvalidFrameMotion getInvalidFrameMotion() {
            return this.invalidFrameMotion;
        }

        public AIAgentConfigVcrConfig setLookAway(AIAgentConfigVcrConfigLookAway lookAway) {
            this.lookAway = lookAway;
            return this;
        }
        public AIAgentConfigVcrConfigLookAway getLookAway() {
            return this.lookAway;
        }

        public AIAgentConfigVcrConfig setPeopleCount(AIAgentConfigVcrConfigPeopleCount peopleCount) {
            this.peopleCount = peopleCount;
            return this;
        }
        public AIAgentConfigVcrConfigPeopleCount getPeopleCount() {
            return this.peopleCount;
        }

        public AIAgentConfigVcrConfig setStillFrameMotion(AIAgentConfigVcrConfigStillFrameMotion stillFrameMotion) {
            this.stillFrameMotion = stillFrameMotion;
            return this;
        }
        public AIAgentConfigVcrConfigStillFrameMotion getStillFrameMotion() {
            return this.stillFrameMotion;
        }

    }

    public static class AIAgentConfigVoiceprintConfig extends TeaModel {
        @NameInMap("RegistrationMode")
        public String registrationMode;

        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        @NameInMap("VoiceprintId")
        public String voiceprintId;

        public static AIAgentConfigVoiceprintConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigVoiceprintConfig self = new AIAgentConfigVoiceprintConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigVoiceprintConfig setRegistrationMode(String registrationMode) {
            this.registrationMode = registrationMode;
            return this;
        }
        public String getRegistrationMode() {
            return this.registrationMode;
        }

        public AIAgentConfigVoiceprintConfig setUseVoiceprint(Boolean useVoiceprint) {
            this.useVoiceprint = useVoiceprint;
            return this;
        }
        public Boolean getUseVoiceprint() {
            return this.useVoiceprint;
        }

        public AIAgentConfigVoiceprintConfig setVoiceprintId(String voiceprintId) {
            this.voiceprintId = voiceprintId;
            return this;
        }
        public String getVoiceprintId() {
            return this.voiceprintId;
        }

    }

}
