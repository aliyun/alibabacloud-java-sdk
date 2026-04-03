// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentOutboundCallConfig extends TeaModel {
    /**
     * <p>Configuration for the ambient sound played during the call.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public AIAgentOutboundCallConfigAmbientSoundConfig ambientSoundConfig;

    /**
     * <p>The configuration for Automatic Speech Recognition (ASR).</p>
     */
    @NameInMap("AsrConfig")
    public AIAgentOutboundCallConfigAsrConfig asrConfig;

    @NameInMap("AutoSpeechConfig")
    public AIAgentOutboundCallConfigAutoSpeechConfig autoSpeechConfig;

    @NameInMap("BackChannelingConfig")
    @Deprecated
    public AIAgentOutboundCallConfigBackChannelingConfig backChannelingConfig;

    @NameInMap("BackChannelingConfigs")
    public java.util.List<AIAgentOutboundCallConfigBackChannelingConfigs> backChannelingConfigs;

    /**
     * <p>If enabled, the system intelligently merges short, interim segments into a single sentence. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIntelligentSegment")
    public Boolean enableIntelligentSegment;

    @NameInMap("ExperimentalConfig")
    public String experimentalConfig;

    /**
     * <p>The welcome message that the agent says upon joining. Changes take effect in the next session. Default value: None.</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The delay before playing the welcome message. Unit: milliseconds. Valid values: 0 to 5000. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GreetingDelay")
    public Integer greetingDelay;

    /**
     * <p>The configuration for the speech interruption strategy.</p>
     */
    @NameInMap("InterruptConfig")
    public AIAgentOutboundCallConfigInterruptConfig interruptConfig;

    /**
     * <p>The configuration for the large language model (LLM).</p>
     */
    @NameInMap("LlmConfig")
    public AIAgentOutboundCallConfigLlmConfig llmConfig;

    @NameInMap("MaxIdleTime")
    public Integer maxIdleTime;

    /**
     * <p>The configuration for Text-to-Speech (TTS).</p>
     */
    @NameInMap("TtsConfig")
    public AIAgentOutboundCallConfigTtsConfig ttsConfig;

    /**
     * <p>The configuration for detecting the end of a user\&quot;s conversational turn.</p>
     */
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

    @Deprecated
    public AIAgentOutboundCallConfig setBackChannelingConfig(AIAgentOutboundCallConfigBackChannelingConfig backChannelingConfig) {
        this.backChannelingConfig = backChannelingConfig;
        return this;
    }
    public AIAgentOutboundCallConfigBackChannelingConfig getBackChannelingConfig() {
        return this.backChannelingConfig;
    }

    public AIAgentOutboundCallConfig setBackChannelingConfigs(java.util.List<AIAgentOutboundCallConfigBackChannelingConfigs> backChannelingConfigs) {
        this.backChannelingConfigs = backChannelingConfigs;
        return this;
    }
    public java.util.List<AIAgentOutboundCallConfigBackChannelingConfigs> getBackChannelingConfigs() {
        return this.backChannelingConfigs;
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
        /**
         * <p>The ID of the ambient sound. This ID can be obtained from the advanced settings section of the agent configuration in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>f67901c595834************</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The volume of the ambient sound. Valid values: [0, 100]. A value of 0 disables the ambient sound.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
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
        /**
         * <p>Hotwords for ASR to improve recognition accuracy. Maximum of 128 hotwords.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for ASR. Valid values:</p>
         * <ul>
         * <li>zh_mandarin: Chinese</li>
         * <li>en: English</li>
         * <li>zh_en: Chinese and English</li>
         * <li>es: Spanish</li>
         * <li>jp: Japanese</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_mandarin</p>
         */
        @NameInMap("AsrLanguageId")
        public String asrLanguageId;

        /**
         * <p>The silence threshold for sentence segmentation. A pause longer than this value is considered a sentence break. Unit: milliseconds. Default value: 400. Valid values: 200 to 1200.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>Passthrough parameters for ASR.</p>
         * 
         * <strong>example:</strong>
         * <p>mode=fast&amp;sample=16000&amp;format=wav</p>
         */
        @NameInMap("CustomParams")
        public String customParams;

        /**
         * <p>The minimum duration for voice activity detection, in milliseconds. This parameter controls the sensitivity of interruptions, preventing the agent from cutting off user speech too early during short pauses. 0: Disables this feature. Valid values: 200 to 2000. Recommended: 200 to 500 ms, which typically corresponds to the length of 1 to 4 words. By default, this parameter is left empty, which indicates the feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("VadDuration")
        public Integer vadDuration;

        /**
         * <p>The VAD threshold for interruption. A higher value makes it harder to trigger interruptions. Valid values: 0 to 10. Default value: 1. The value of 0 specifies to disable the VAD feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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

        @NameInMap("Mode")
        public String mode;

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

        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPending setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
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
        @NameInMap("HangupEndWord")
        public String hangupEndWord;

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

        public AIAgentOutboundCallConfigAutoSpeechConfigUserIdle setHangupEndWord(String hangupEndWord) {
            this.hangupEndWord = hangupEndWord;
            return this;
        }
        public String getHangupEndWord() {
            return this.hangupEndWord;
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

    public static class AIAgentOutboundCallConfigBackChannelingConfigsWords extends TeaModel {
        @NameInMap("Probability")
        public Double probability;

        @NameInMap("Text")
        public String text;

        public static AIAgentOutboundCallConfigBackChannelingConfigsWords build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigBackChannelingConfigsWords self = new AIAgentOutboundCallConfigBackChannelingConfigsWords();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigBackChannelingConfigsWords setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentOutboundCallConfigBackChannelingConfigsWords setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class AIAgentOutboundCallConfigBackChannelingConfigs extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Probability")
        public Double probability;

        @NameInMap("TriggerStage")
        public String triggerStage;

        @NameInMap("Words")
        public java.util.List<AIAgentOutboundCallConfigBackChannelingConfigsWords> words;

        public static AIAgentOutboundCallConfigBackChannelingConfigs build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigBackChannelingConfigs self = new AIAgentOutboundCallConfigBackChannelingConfigs();
            return TeaModel.build(map, self);
        }

        public AIAgentOutboundCallConfigBackChannelingConfigs setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public AIAgentOutboundCallConfigBackChannelingConfigs setProbability(Double probability) {
            this.probability = probability;
            return this;
        }
        public Double getProbability() {
            return this.probability;
        }

        public AIAgentOutboundCallConfigBackChannelingConfigs setTriggerStage(String triggerStage) {
            this.triggerStage = triggerStage;
            return this;
        }
        public String getTriggerStage() {
            return this.triggerStage;
        }

        public AIAgentOutboundCallConfigBackChannelingConfigs setWords(java.util.List<AIAgentOutboundCallConfigBackChannelingConfigsWords> words) {
            this.words = words;
            return this;
        }
        public java.util.List<AIAgentOutboundCallConfigBackChannelingConfigsWords> getWords() {
            return this.words;
        }

    }

    public static class AIAgentOutboundCallConfigInterruptConfig extends TeaModel {
        @NameInMap("Eagerness")
        @Deprecated
        public String eagerness;

        /**
         * <p>Specifies whether to allow the user to interrupt the agent by speaking. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>Words or phrases that will trigger an interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        @NameInMap("KeepInterruptWordsForLLM")
        public Boolean keepInterruptWordsForLLM;

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

        public AIAgentOutboundCallConfigInterruptConfig setKeepInterruptWordsForLLM(Boolean keepInterruptWordsForLLM) {
            this.keepInterruptWordsForLLM = keepInterruptWordsForLLM;
            return this;
        }
        public Boolean getKeepInterruptWordsForLLM() {
            return this.keepInterruptWordsForLLM;
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
        /**
         * <p>The name of the built-in agent capability. Only hangup is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hangup</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The corresponding user-defined function name in your LLM. When the LLM calls this function, it will trigger the mapped agent capability.<a href="~~2839094~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>hangup</p>
         */
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
        /**
         * <p>The actual text content of the message for that role.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the participant in the conversation. Valid values:</p>
         * <ul>
         * <li>user</li>
         * <li>assistant</li>
         * <li>system</li>
         * <li>function</li>
         * <li>plugin</li>
         * <li>tool</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
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
        /**
         * <p>Alibaba Cloud Model Studio Application Center parameters. Reference: <a href="https://help.aliyun.com/document_detail/2858132.html">Model Studio Application Center Parameter</a></p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        /**
         * <p>Maps agent capabilities to LLM functions. Only supports function calling with custom LLMs that adhere to the OpenAI protocol.</p>
         */
        @NameInMap("FunctionMap")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigFunctionMap> functionMap;

        @NameInMap("HistorySyncWithTTS")
        public Boolean historySyncWithTTS;

        /**
         * <p>If true, the service sends the complete result from the LLM to the client in a single response after the generation process is finished.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LlmCompleteReply")
        public Boolean llmCompleteReply;

        /**
         * <p>The LLM/MLLM conversation history context.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigLlmHistory> llmHistory;

        /**
         * <p>The maximum number of conversational turns to retain in the history. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        /**
         * <p>The system prompt for the LLM.</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>Additional query parameters to be sent to the OpenAI-protocol LLM, formatted as a URL query string (key=value pairs separated by &amp;). All values must be strings.</p>
         * 
         * <strong>example:</strong>
         * <p>api-version=2024-02-01&amp;api-key=sk-xxx</p>
         */
        @NameInMap("OpenAIExtraQuery")
        public String openAIExtraQuery;

        /**
         * <p>The maximum time (in milliseconds) to buffer text before it is forcibly sent to the client. Valid values: [1000,10000]. A value of 0 or an empty string (default) disables this limit.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("OutputMaxDelay")
        public String outputMaxDelay;

        /**
         * <p>The minimum number of characters that must be buffered before a text chunk is sent. Valid values: [0, 100]. A value of 0 or an empty string (default) disables this limit.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
        /**
         * <p>The target pronunciation. The value supports up to 10 Chinese characters. Other characters, including spaces, are not supported.</p>
         */
        @NameInMap("Pronunciation")
        public String pronunciation;

        /**
         * <p>The type of rule. Valid value:</p>
         * <ul>
         * <li>replacement: replaces every occurrence of Word value with Pronunciation value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replacement</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The word to be replaced. The value supports up to 10 Chinese characters. Other characters, including spaces, are not supported.</p>
         */
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
        /**
         * <p>Applies only to MiniMax models. Seven types of emotions are supported:</p>
         * <ul>
         * <li>happy</li>
         * <li>sad</li>
         * <li>angry</li>
         * <li>fearful</li>
         * <li>disgusted</li>
         * <li>surprised</li>
         * <li>calm</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>happy</p>
         */
        @NameInMap("Emotion")
        public String emotion;

        /**
         * <p>Applies only to MiniMax models. By default, this parameter is left empty. This enhances speech recognition accuracy for specific languages and dialects. If the language type is unknown, set it to auto to have the model automatically detect it. Valid values:</p>
         * <p><strong>Supported languages</strong></p>
         * <ul>
         * <li>Chinese</li>
         * <li>Chinese,Yue</li>
         * <li>English</li>
         * <li>Arabic</li>
         * <li>Russian</li>
         * <li>Spanish</li>
         * <li>French</li>
         * <li>Portuguese</li>
         * <li>German</li>
         * <li>Turkish</li>
         * <li>Dutch</li>
         * <li>Ukrainian</li>
         * <li>Vietnamese</li>
         * <li>Indonesian</li>
         * <li>Japanese</li>
         * <li>Italian</li>
         * <li>Korean</li>
         * <li>Thai</li>
         * <li>Polish</li>
         * <li>Romanian</li>
         * <li>Greek</li>
         * <li>Czech</li>
         * <li>Finnish</li>
         * <li>Hindi</li>
         * <li>auto</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Chinese</p>
         */
        @NameInMap("LanguageId")
        public String languageId;

        /**
         * <p>Applies only to MiniMax models. Valid values: speech-01-turbo and speech-02-turbo.</p>
         * 
         * <strong>example:</strong>
         * <p>speech-01-turbo</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The pronunciation rules, executed in order. Maximum of 20 rules.</p>
         */
        @NameInMap("PronunciationRules")
        public java.util.List<AIAgentOutboundCallConfigTtsConfigPronunciationRules> pronunciationRules;

        /**
         * <p>Supports all models. For CosyVoice, the default value is 1.0. Valid values: 0.5 to 2.0. For MiniMax, the default value is 1.0. Valid values: 0.5 to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("SpeechRate")
        public Double speechRate;

        /**
         * <p>The voice ID. Changes take effect on the next sentence. If not set, the system uses the default voice ID specified in the agent template. This parameter takes effect only for the preset TTS model. Max length: 64 characters. Refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent voice samples</a> for options.</p>
         * 
         * <strong>example:</strong>
         * <p>longcheng_v2</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>Available voices.</p>
         */
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

        /**
         * <p>The mode of turn detection.</p>
         * <ul>
         * <li>Normal: uses simple pause detection.</li>
         * <li>Semantic: uses AI to analyze context.</li>
         * </ul>
         * <p>Default value: Normal.</p>
         * 
         * <strong>example:</strong>
         * <p>Semantic</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>Specifies how long to wait after a user stops speaking for the agent to decide if the turn is over. Unit: milliseconds. Default value: -1.</p>
         * <ul>
         * <li>\-1: AI decides an appropriate wait time automatically.</li>
         * <li>0 to 10000: A custom wait time. Recommended: 0 to 1500 ms.</li>
         * </ul>
         * <p>Note: In Normal mode, this field is ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("SemanticWaitDuration")
        public Integer semanticWaitDuration;

        /**
         * <p>Keywords that signify the end of the user\&quot;s turn.</p>
         */
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
