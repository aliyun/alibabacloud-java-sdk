// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentOutboundCallConfig extends TeaModel {
    @NameInMap("AmbientSoundConfig")
    public AIAgentOutboundCallConfigAmbientSoundConfig ambientSoundConfig;

    @NameInMap("AsrConfig")
    public AIAgentOutboundCallConfigAsrConfig asrConfig;

    @NameInMap("AutoSpeechConfig")
    public AIAgentOutboundCallConfigAutoSpeechConfig autoSpeechConfig;

    @NameInMap("BackChannelingConfig")
    public AIAgentOutboundCallConfigBackChannelingConfig backChannelingConfig;

    @NameInMap("EnableIntelligentSegment")
    public Boolean enableIntelligentSegment;

    @NameInMap("ExperimentalConfig")
    public String experimentalConfig;

    @NameInMap("Greeting")
    public String greeting;

    @NameInMap("GreetingDelay")
    public Integer greetingDelay;

    @NameInMap("InterruptConfig")
    public AIAgentOutboundCallConfigInterruptConfig interruptConfig;

    @NameInMap("LlmConfig")
    public AIAgentOutboundCallConfigLlmConfig llmConfig;

    @NameInMap("MaxIdleTime")
    public Integer maxIdleTime;

    @NameInMap("TtsConfig")
    public AIAgentOutboundCallConfigTtsConfig ttsConfig;

    @NameInMap("TurnDetectionConfig")
    public AIAgentOutboundCallConfigTurnDetectionConfig turnDetectionConfig;

    public static AIAgentOutboundCallConfig build(java.util.Map<String, ?> map) throws Exception {
        AIAgentOutboundCallConfig self = new AIAgentOutboundCallConfig();
        return TeaModel.build(map, self);
    }

    public AIAgentOutboundCallConfig setAmbientSoundConfig(AIAgentOutboundCallConfigAmbientSoundConfig ambientSoundConfig) {
        this.ambientSoundConfig = ambientSoundConfig;
        return this;
    }
    public AIAgentOutboundCallConfigAmbientSoundConfig getAmbientSoundConfig() {
        return this.ambientSoundConfig;
    }

    public AIAgentOutboundCallConfig setAsrConfig(AIAgentOutboundCallConfigAsrConfig asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public AIAgentOutboundCallConfigAsrConfig getAsrConfig() {
        return this.asrConfig;
    }

    public AIAgentOutboundCallConfig setAutoSpeechConfig(AIAgentOutboundCallConfigAutoSpeechConfig autoSpeechConfig) {
        this.autoSpeechConfig = autoSpeechConfig;
        return this;
    }
    public AIAgentOutboundCallConfigAutoSpeechConfig getAutoSpeechConfig() {
        return this.autoSpeechConfig;
    }

    public AIAgentOutboundCallConfig setBackChannelingConfig(AIAgentOutboundCallConfigBackChannelingConfig backChannelingConfig) {
        this.backChannelingConfig = backChannelingConfig;
        return this;
    }
    public AIAgentOutboundCallConfigBackChannelingConfig getBackChannelingConfig() {
        return this.backChannelingConfig;
    }

    public AIAgentOutboundCallConfig setEnableIntelligentSegment(Boolean enableIntelligentSegment) {
        this.enableIntelligentSegment = enableIntelligentSegment;
        return this;
    }
    public Boolean getEnableIntelligentSegment() {
        return this.enableIntelligentSegment;
    }

    public AIAgentOutboundCallConfig setExperimentalConfig(String experimentalConfig) {
        this.experimentalConfig = experimentalConfig;
        return this;
    }
    public String getExperimentalConfig() {
        return this.experimentalConfig;
    }

    public AIAgentOutboundCallConfig setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
    public String getGreeting() {
        return this.greeting;
    }

    public AIAgentOutboundCallConfig setGreetingDelay(Integer greetingDelay) {
        this.greetingDelay = greetingDelay;
        return this;
    }
    public Integer getGreetingDelay() {
        return this.greetingDelay;
    }

    public AIAgentOutboundCallConfig setInterruptConfig(AIAgentOutboundCallConfigInterruptConfig interruptConfig) {
        this.interruptConfig = interruptConfig;
        return this;
    }
    public AIAgentOutboundCallConfigInterruptConfig getInterruptConfig() {
        return this.interruptConfig;
    }

    public AIAgentOutboundCallConfig setLlmConfig(AIAgentOutboundCallConfigLlmConfig llmConfig) {
        this.llmConfig = llmConfig;
        return this;
    }
    public AIAgentOutboundCallConfigLlmConfig getLlmConfig() {
        return this.llmConfig;
    }

    public AIAgentOutboundCallConfig setMaxIdleTime(Integer maxIdleTime) {
        this.maxIdleTime = maxIdleTime;
        return this;
    }
    public Integer getMaxIdleTime() {
        return this.maxIdleTime;
    }

    public AIAgentOutboundCallConfig setTtsConfig(AIAgentOutboundCallConfigTtsConfig ttsConfig) {
        this.ttsConfig = ttsConfig;
        return this;
    }
    public AIAgentOutboundCallConfigTtsConfig getTtsConfig() {
        return this.ttsConfig;
    }

    public AIAgentOutboundCallConfig setTurnDetectionConfig(AIAgentOutboundCallConfigTurnDetectionConfig turnDetectionConfig) {
        this.turnDetectionConfig = turnDetectionConfig;
        return this;
    }
    public AIAgentOutboundCallConfigTurnDetectionConfig getTurnDetectionConfig() {
        return this.turnDetectionConfig;
    }

    public static class AIAgentOutboundCallConfigAmbientSoundConfig extends TeaModel {
        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("Volume")
        public Integer volume;

        public static AIAgentOutboundCallConfigAmbientSoundConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigAmbientSoundConfig self = new AIAgentOutboundCallConfigAmbientSoundConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigAmbientSoundConfig setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public AIAgentOutboundCallConfigAmbientSoundConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class AIAgentOutboundCallConfigAsrConfig extends TeaModel {
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

        public static AIAgentOutboundCallConfigAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigAsrConfig self = new AIAgentOutboundCallConfigAsrConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigAsrConfig setAsrHotWords(java.util.List<String> asrHotWords) {
            this.asrHotWords = asrHotWords;
            return this;
        }
        public java.util.List<String> getAsrHotWords() {
            return this.asrHotWords;
        }

        public AIAgentOutboundCallConfigAsrConfig setAsrLanguageId(String asrLanguageId) {
            this.asrLanguageId = asrLanguageId;
            return this;
        }
        public String getAsrLanguageId() {
            return this.asrLanguageId;
        }

        public AIAgentOutboundCallConfigAsrConfig setAsrMaxSilence(Integer asrMaxSilence) {
            this.asrMaxSilence = asrMaxSilence;
            return this;
        }
        public Integer getAsrMaxSilence() {
            return this.asrMaxSilence;
        }

        public AIAgentOutboundCallConfigAsrConfig setCustomParams(String customParams) {
            this.customParams = customParams;
            return this;
        }
        public String getCustomParams() {
            return this.customParams;
        }

        public AIAgentOutboundCallConfigAsrConfig setVadDuration(Integer vadDuration) {
            this.vadDuration = vadDuration;
            return this;
        }
        public Integer getVadDuration() {
            return this.vadDuration;
        }

        public AIAgentOutboundCallConfigAsrConfig setVadLevel(Integer vadLevel) {
            this.vadLevel = vadLevel;
            return this;
        }
        public Integer getVadLevel() {
            return this.vadLevel;
        }

    }

    public static class AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages extends TeaModel {
        @NameInMap("Probability")
        public Double probability;

        @NameInMap("Text")
        public String text;

        public static AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages self = new AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AIAgentOutboundCallConfigAutoSpeechConfigLlmPending extends TeaModel {
        @NameInMap("Messages")
        public java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages> messages;

        @NameInMap("WaitTime")
        public Integer waitTime;

        public static AIAgentOutboundCallConfigAutoSpeechConfigLlmPending build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigAutoSpeechConfigLlmPending self = new AIAgentOutboundCallConfigAutoSpeechConfigLlmPending();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPending setMessages(java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages> getMessages() {
            return this.messages;
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPending setWaitTime(Integer waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Integer getWaitTime() {
            return this.waitTime;
        }

    }

    public static class AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages extends TeaModel {
        @NameInMap("Probability")
        public Double probability;

        @NameInMap("Text")
        public String text;

        public static AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages self = new AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AIAgentOutboundCallConfigAutoSpeechConfigUserIdle extends TeaModel {
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        @NameInMap("Messages")
        public java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages> messages;

        @NameInMap("WaitTime")
        public Integer waitTime;

        public static AIAgentOutboundCallConfigAutoSpeechConfigUserIdle build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigAutoSpeechConfigUserIdle self = new AIAgentOutboundCallConfigAutoSpeechConfigUserIdle();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigUserIdle setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigUserIdle setMessages(java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages> getMessages() {
            return this.messages;
        }

        public AIAgentOutboundCallConfigAutoSpeechConfigUserIdle setWaitTime(Integer waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Integer getWaitTime() {
            return this.waitTime;
        }

    }

    public static class AIAgentOutboundCallConfigAutoSpeechConfig extends TeaModel {
        @NameInMap("LlmPending")
        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPending llmPending;

        @NameInMap("UserIdle")
        public AIAgentOutboundCallConfigAutoSpeechConfigUserIdle userIdle;

        public static AIAgentOutboundCallConfigAutoSpeechConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigAutoSpeechConfig self = new AIAgentOutboundCallConfigAutoSpeechConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigAutoSpeechConfig setLlmPending(AIAgentOutboundCallConfigAutoSpeechConfigLlmPending llmPending) {
            this.llmPending = llmPending;
            return this;
        }
        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPending getLlmPending() {
            return this.llmPending;
        }

        public AIAgentOutboundCallConfigAutoSpeechConfig setUserIdle(AIAgentOutboundCallConfigAutoSpeechConfigUserIdle userIdle) {
            this.userIdle = userIdle;
            return this;
        }
        public AIAgentOutboundCallConfigAutoSpeechConfigUserIdle getUserIdle() {
            return this.userIdle;
        }

    }

    public static class AIAgentOutboundCallConfigBackChannelingConfigWords extends TeaModel {
        @NameInMap("Probability")
        public Double probability;

        @NameInMap("Text")
        public String text;

        public static AIAgentOutboundCallConfigBackChannelingConfigWords build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigBackChannelingConfigWords self = new AIAgentOutboundCallConfigBackChannelingConfigWords();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigBackChannelingConfigWords setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentOutboundCallConfigBackChannelingConfigWords setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AIAgentOutboundCallConfigBackChannelingConfig extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Probability")
        public Double probability;

        @NameInMap("TriggerStage")
        public String triggerStage;

        @NameInMap("Words")
        public AIAgentOutboundCallConfigBackChannelingConfigWords words;

        public static AIAgentOutboundCallConfigBackChannelingConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigBackChannelingConfig self = new AIAgentOutboundCallConfigBackChannelingConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigBackChannelingConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AIAgentOutboundCallConfigBackChannelingConfig setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentOutboundCallConfigBackChannelingConfig setTriggerStage(String triggerStage) {
            this.triggerStage = triggerStage;
            return this;
        }
        public String getTriggerStage() {
            return this.triggerStage;
        }

        public AIAgentOutboundCallConfigBackChannelingConfig setWords(AIAgentOutboundCallConfigBackChannelingConfigWords words) {
            this.words = words;
            return this;
        }
        public AIAgentOutboundCallConfigBackChannelingConfigWords getWords() {
            return this.words;
        }

    }

    public static class AIAgentOutboundCallConfigInterruptConfig extends TeaModel {
        @NameInMap("Eagerness")
        @Deprecated
        public String eagerness;

        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        @NameInMap("NoInterruptMode")
        public String noInterruptMode;

        public static AIAgentOutboundCallConfigInterruptConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigInterruptConfig self = new AIAgentOutboundCallConfigInterruptConfig();
            return TeaModel.build(map, self);
        }

        @Deprecated
        public AIAgentOutboundCallConfigInterruptConfig setEagerness(String eagerness) {
            this.eagerness = eagerness;
            return this;
        }
        public String getEagerness() {
            return this.eagerness;
        }

        public AIAgentOutboundCallConfigInterruptConfig setEnableVoiceInterrupt(Boolean enableVoiceInterrupt) {
            this.enableVoiceInterrupt = enableVoiceInterrupt;
            return this;
        }
        public Boolean getEnableVoiceInterrupt() {
            return this.enableVoiceInterrupt;
        }

        public AIAgentOutboundCallConfigInterruptConfig setInterruptWords(java.util.List<String> interruptWords) {
            this.interruptWords = interruptWords;
            return this;
        }
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
        }

        public AIAgentOutboundCallConfigInterruptConfig setNoInterruptMode(String noInterruptMode) {
            this.noInterruptMode = noInterruptMode;
            return this;
        }
        public String getNoInterruptMode() {
            return this.noInterruptMode;
        }

    }

    public static class AIAgentOutboundCallConfigLlmConfigFunctionMap extends TeaModel {
        @NameInMap("Function")
        public String function;

        @NameInMap("MatchFunction")
        public String matchFunction;

        public static AIAgentOutboundCallConfigLlmConfigFunctionMap build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigLlmConfigFunctionMap self = new AIAgentOutboundCallConfigLlmConfigFunctionMap();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigLlmConfigFunctionMap setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public AIAgentOutboundCallConfigLlmConfigFunctionMap setMatchFunction(String matchFunction) {
            this.matchFunction = matchFunction;
            return this;
        }
        public String getMatchFunction() {
            return this.matchFunction;
        }

    }

    public static class AIAgentOutboundCallConfigLlmConfigLlmHistory extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Role")
        public String role;

        public static AIAgentOutboundCallConfigLlmConfigLlmHistory build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigLlmConfigLlmHistory self = new AIAgentOutboundCallConfigLlmConfigLlmHistory();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigLlmConfigLlmHistory setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AIAgentOutboundCallConfigLlmConfigLlmHistory setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class AIAgentOutboundCallConfigLlmConfig extends TeaModel {
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("FunctionMap")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigFunctionMap> functionMap;

        @NameInMap("HistorySyncWithTTS")
        public Boolean historySyncWithTTS;

        @NameInMap("LlmCompleteReply")
        public Boolean llmCompleteReply;

        @NameInMap("LlmHistory")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigLlmHistory> llmHistory;

        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        @NameInMap("OpenAIExtraQuery")
        public String openAIExtraQuery;

        @NameInMap("OutputMaxDelay")
        public String outputMaxDelay;

        @NameInMap("OutputMinLength")
        public Integer outputMinLength;

        public static AIAgentOutboundCallConfigLlmConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigLlmConfig self = new AIAgentOutboundCallConfigLlmConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigLlmConfig setBailianAppParams(String bailianAppParams) {
            this.bailianAppParams = bailianAppParams;
            return this;
        }
        public String getBailianAppParams() {
            return this.bailianAppParams;
        }

        public AIAgentOutboundCallConfigLlmConfig setFunctionMap(java.util.List<AIAgentOutboundCallConfigLlmConfigFunctionMap> functionMap) {
            this.functionMap = functionMap;
            return this;
        }
        public java.util.List<AIAgentOutboundCallConfigLlmConfigFunctionMap> getFunctionMap() {
            return this.functionMap;
        }

        public AIAgentOutboundCallConfigLlmConfig setHistorySyncWithTTS(Boolean historySyncWithTTS) {
            this.historySyncWithTTS = historySyncWithTTS;
            return this;
        }
        public Boolean getHistorySyncWithTTS() {
            return this.historySyncWithTTS;
        }

        public AIAgentOutboundCallConfigLlmConfig setLlmCompleteReply(Boolean llmCompleteReply) {
            this.llmCompleteReply = llmCompleteReply;
            return this;
        }
        public Boolean getLlmCompleteReply() {
            return this.llmCompleteReply;
        }

        public AIAgentOutboundCallConfigLlmConfig setLlmHistory(java.util.List<AIAgentOutboundCallConfigLlmConfigLlmHistory> llmHistory) {
            this.llmHistory = llmHistory;
            return this;
        }
        public java.util.List<AIAgentOutboundCallConfigLlmConfigLlmHistory> getLlmHistory() {
            return this.llmHistory;
        }

        public AIAgentOutboundCallConfigLlmConfig setLlmHistoryLimit(Integer llmHistoryLimit) {
            this.llmHistoryLimit = llmHistoryLimit;
            return this;
        }
        public Integer getLlmHistoryLimit() {
            return this.llmHistoryLimit;
        }

        public AIAgentOutboundCallConfigLlmConfig setLlmSystemPrompt(String llmSystemPrompt) {
            this.llmSystemPrompt = llmSystemPrompt;
            return this;
        }
        public String getLlmSystemPrompt() {
            return this.llmSystemPrompt;
        }

        public AIAgentOutboundCallConfigLlmConfig setOpenAIExtraQuery(String openAIExtraQuery) {
            this.openAIExtraQuery = openAIExtraQuery;
            return this;
        }
        public String getOpenAIExtraQuery() {
            return this.openAIExtraQuery;
        }

        public AIAgentOutboundCallConfigLlmConfig setOutputMaxDelay(String outputMaxDelay) {
            this.outputMaxDelay = outputMaxDelay;
            return this;
        }
        public String getOutputMaxDelay() {
            return this.outputMaxDelay;
        }

        public AIAgentOutboundCallConfigLlmConfig setOutputMinLength(Integer outputMinLength) {
            this.outputMinLength = outputMinLength;
            return this;
        }
        public Integer getOutputMinLength() {
            return this.outputMinLength;
        }

    }

    public static class AIAgentOutboundCallConfigTtsConfigPronunciationRules extends TeaModel {
        @NameInMap("Pronunciation")
        public String pronunciation;

        @NameInMap("Type")
        public String type;

        @NameInMap("Word")
        public String word;

        public static AIAgentOutboundCallConfigTtsConfigPronunciationRules build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigTtsConfigPronunciationRules self = new AIAgentOutboundCallConfigTtsConfigPronunciationRules();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigTtsConfigPronunciationRules setPronunciation(String pronunciation) {
            this.pronunciation = pronunciation;
            return this;
        }
        public String getPronunciation() {
            return this.pronunciation;
        }

        public AIAgentOutboundCallConfigTtsConfigPronunciationRules setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public AIAgentOutboundCallConfigTtsConfigPronunciationRules setWord(String word) {
            this.word = word;
            return this;
        }
        public String getWord() {
            return this.word;
        }

    }

    public static class AIAgentOutboundCallConfigTtsConfig extends TeaModel {
        @NameInMap("Emotion")
        public String emotion;

        @NameInMap("LanguageId")
        public String languageId;

        @NameInMap("ModelId")
        public String modelId;

        @NameInMap("PronunciationRules")
        public java.util.List<AIAgentOutboundCallConfigTtsConfigPronunciationRules> pronunciationRules;

        @NameInMap("SpeechRate")
        public Double speechRate;

        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        public static AIAgentOutboundCallConfigTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigTtsConfig self = new AIAgentOutboundCallConfigTtsConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigTtsConfig setEmotion(String emotion) {
            this.emotion = emotion;
            return this;
        }
        public String getEmotion() {
            return this.emotion;
        }

        public AIAgentOutboundCallConfigTtsConfig setLanguageId(String languageId) {
            this.languageId = languageId;
            return this;
        }
        public String getLanguageId() {
            return this.languageId;
        }

        public AIAgentOutboundCallConfigTtsConfig setModelId(String modelId) {
            this.modelId = modelId;
            return this;
        }
        public String getModelId() {
            return this.modelId;
        }

        public AIAgentOutboundCallConfigTtsConfig setPronunciationRules(java.util.List<AIAgentOutboundCallConfigTtsConfigPronunciationRules> pronunciationRules) {
            this.pronunciationRules = pronunciationRules;
            return this;
        }
        public java.util.List<AIAgentOutboundCallConfigTtsConfigPronunciationRules> getPronunciationRules() {
            return this.pronunciationRules;
        }

        public AIAgentOutboundCallConfigTtsConfig setSpeechRate(Double speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Double getSpeechRate() {
            return this.speechRate;
        }

        public AIAgentOutboundCallConfigTtsConfig setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentOutboundCallConfigTtsConfig setVoiceIdList(java.util.List<String> voiceIdList) {
            this.voiceIdList = voiceIdList;
            return this;
        }
        public java.util.List<String> getVoiceIdList() {
            return this.voiceIdList;
        }

    }

    public static class AIAgentOutboundCallConfigTurnDetectionConfig extends TeaModel {
        @NameInMap("Eagerness")
        public String eagerness;

        @NameInMap("Mode")
        public String mode;

        @NameInMap("SemanticWaitDuration")
        public Integer semanticWaitDuration;

        @NameInMap("TurnEndWords")
        public java.util.List<String> turnEndWords;

        public static AIAgentOutboundCallConfigTurnDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigTurnDetectionConfig self = new AIAgentOutboundCallConfigTurnDetectionConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigTurnDetectionConfig setEagerness(String eagerness) {
            this.eagerness = eagerness;
            return this;
        }
        public String getEagerness() {
            return this.eagerness;
        }

        public AIAgentOutboundCallConfigTurnDetectionConfig setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public AIAgentOutboundCallConfigTurnDetectionConfig setSemanticWaitDuration(Integer semanticWaitDuration) {
            this.semanticWaitDuration = semanticWaitDuration;
            return this;
        }
        public Integer getSemanticWaitDuration() {
            return this.semanticWaitDuration;
        }

        public AIAgentOutboundCallConfigTurnDetectionConfig setTurnEndWords(java.util.List<String> turnEndWords) {
            this.turnEndWords = turnEndWords;
            return this;
        }
        public java.util.List<String> getTurnEndWords() {
            return this.turnEndWords;
        }

    }

}
