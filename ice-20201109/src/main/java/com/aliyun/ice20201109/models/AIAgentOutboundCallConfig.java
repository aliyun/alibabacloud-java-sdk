// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentOutboundCallConfig extends TeaModel {
    /**
     * <p>The configurations for ambient sound.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public AIAgentOutboundCallConfigAmbientSoundConfig ambientSoundConfig;

    /**
     * <p>The automatic speech recognition (ASR) configurations.</p>
     */
    @NameInMap("AsrConfig")
    public AIAgentOutboundCallConfigAsrConfig asrConfig;

    /**
     * <p>The configurations for the automatic speech module of the AI agent, which includes prompts during LLM delays and inquiries during prolonged user silence.</p>
     */
    @NameInMap("AutoSpeechConfig")
    public AIAgentOutboundCallConfigAutoSpeechConfig autoSpeechConfig;

    /**
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This parameter is deprecated. Use <code>BackChannelingConfigs</code> instead.</p>
     */
    @NameInMap("BackChannelingConfig")
    @Deprecated
    public AIAgentOutboundCallConfigBackChannelingConfig backChannelingConfig;

    /**
     * <p>The configurations for the back-channeling feature module. If you enable this feature, the system randomly plays short and affirmative phrases at specific trigger points.</p>
     */
    @NameInMap("BackChannelingConfigs")
    public java.util.List<AIAgentOutboundCallConfigBackChannelingConfigs> backChannelingConfigs;

    /**
     * <p>Specifies whether to enable intelligent segmentation. If you enable this feature, short and consecutive speech segments from the user are merged into a complete sentence. Default value: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIntelligentSegment")
    public Boolean enableIntelligentSegment;

    /**
     * <p>The parameters for experimental features. If you have any requirements, contact technical support.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ExperimentalConfig")
    public String experimentalConfig;

    /**
     * <p>The welcome message. This change takes effect in the next call session. If this parameter is not set, no welcome message is played.</p>
     * 
     * <strong>example:</strong>
     * <p>你好</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The delay before the welcome message is played. Unit: ms. Default value: 0. Valid values: 0 to 5000.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GreetingDelay")
    public Integer greetingDelay;

    /**
     * <p>The speech interruption policy configurations.</p>
     */
    @NameInMap("InterruptConfig")
    public AIAgentOutboundCallConfigInterruptConfig interruptConfig;

    /**
     * <p>The configurations of the large language model (LLM).</p>
     */
    @NameInMap("LlmConfig")
    public AIAgentOutboundCallConfigLlmConfig llmConfig;

    /**
     * <p>The maximum wait time for interaction with the AI agent. If the wait time is exceeded, the AI agent goes offline. Unit: seconds. Default value: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Integer maxIdleTime;

    /**
     * <p>The text-to-speech (TTS) configurations.</p>
     */
    @NameInMap("TtsConfig")
    public AIAgentOutboundCallConfigTtsConfig ttsConfig;

    /**
     * <p>The configurations for conversational turn detection.</p>
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
         * <p>The ID of the ambient sound. You can obtain the ID from the advanced configurations of the AI agent on the console.</p>
         * 
         * <strong>example:</strong>
         * <p>f67901c595834************</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The volume of the ambient sound. Valid values: 0 to 100. A value of 0 disables the sound.</p>
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
         * <p>The list of hotwords for ASR. You can specify a maximum of 128 hotwords in the list.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for ASR. Valid values:</p>
         * <ul>
         * <li><p><code>zh_mandarin</code>: Chinese</p>
         * </li>
         * <li><p><code>en</code>: English</p>
         * </li>
         * <li><p><code>zh_en</code>: Chinese and English</p>
         * </li>
         * <li><p><code>es</code>: Spanish</p>
         * </li>
         * <li><p><code>jp</code>: Japanese</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_mandarin</p>
         */
        @NameInMap("AsrLanguageId")
        public String asrLanguageId;

        /**
         * <p>The sentence segmentation threshold. If the duration of a silence exceeds this threshold, the system determines that the sentence is complete. Valid values: 200 to 1200. Unit: ms. Default value: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>The passthrough parameters for proprietary ASR.</p>
         * 
         * <strong>example:</strong>
         * <p>mode=fast&amp;sample=16000&amp;format=wav</p>
         */
        @NameInMap("CustomParams")
        public String customParams;

        /**
         * <p>The minimum duration threshold for VAD. This parameter controls the interruption sensitivity. A value of 0 indicates that this feature is disabled. Valid values: 200 to 2000. Unit: ms. A value from 200 to 500 corresponds to 1 to 4 words. The default value is empty, which indicates that this parameter is not in effect.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("VadDuration")
        public Integer vadDuration;

        /**
         * <p>The interruption threshold for voice activity detection (VAD). Valid values: 0 to 11. Default value: 11.</p>
         * <ul>
         * <li><p>A value of 0 disables the VAD feature.</p>
         * </li>
         * <li><p>A value from 1 to 10 indicates that the higher the value, the less sensitive the interruption.</p>
         * </li>
         * <li><p>A value of 11 provides a significantly different experience from the previous values. It lowers audio distortion during conversations and enhances resistance to interference.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>11</p>
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
        /**
         * <p>The selection probability of the prompt. Valid values: 0 to 1, which corresponds to 0% to 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the inquiry prompt. The text can be up to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>稍等一下</p>
         */
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
        /**
         * <p>The collection of inquiry prompts. You can specify a maximum of 10 prompts. Each prompt can be up to 100 characters in length. The sum of the probabilities of all prompts must be 100%.</p>
         */
        @NameInMap("Messages")
        public java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages> messages;

        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The wait time threshold for LLM responses. This parameter is required. A broadcast prompt is triggered if this threshold is exceeded. Unit: ms. Valid values: 500 to 10000. You need to configure this parameter based on the actual usage of the LLM.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
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
        /**
         * <p>The selection probability of the prompt. Valid values: 0 to 1, which corresponds to 0% to 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the inquiry prompt. The text can be up to 100 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>您还在吗？</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>我挂了，再见</p>
         */
        @NameInMap("HangupEndWord")
        public String hangupEndWord;

        /**
         * <p>The maximum number of inquiries. This parameter is required. Valid values: 0 to 10. After the maximum number of inquiries is reached, no more inquiries are triggered, and the call is disconnected.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>The collection of inquiry prompts. You can specify a maximum of 10 prompts. Each prompt can be up to 100 characters in length. The sum of the probabilities of all prompts must be 100%.</p>
         */
        @NameInMap("Messages")
        public java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages> messages;

        /**
         * <p>The silence duration threshold. This parameter is required. An inquiry is triggered if this threshold is exceeded. Unit: ms. Valid values: 5000 to 600000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
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
        /**
         * <p>The configurations for broadcasts during LLM response delays.</p>
         */
        @NameInMap("LlmPending")
        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPending llmPending;

        /**
         * <p>The configurations for inquiry broadcasts during prolonged user silence.</p>
         */
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
        /**
         * <p>The selection probability of this phrase. This parameter is required. Valid values: 0.0 to 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the phrase. This parameter is required. The text can be up to 20 characters in length and supports multiple languages.</p>
         * 
         * <strong>example:</strong>
         * <p>嗯嗯</p>
         */
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
        /**
         * <p>Specifies whether to enable the back-channeling feature. This parameter is required. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The trigger probability. This parameter is required. Valid values: 0.0 to 1.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The trigger point for back-channeling. Valid value:</p>
         * <ul>
         * <li><code>pause_detected</code>: triggered when a short pause in speech is detected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pause_detected</p>
         */
        @NameInMap("TriggerStage")
        public String triggerStage;

        /**
         * <p>The collection of back-channeling phrases. You can specify a maximum of 10 phrases. Each phrase can be up to 20 characters in length. The sum of the probabilities of all phrases must be 1.0.</p>
         */
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
         * <p>Specifies whether to support speech interruption. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>The specific words or phrases that trigger a conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeepInterruptWordsForLLM")
        public Boolean keepInterruptWordsForLLM;

        /**
         * <p>The ASR processing policy in <code>NoInterruptMode</code>.</p>
         * <ul>
         * <li><p><code>cache</code>: caches the ASR text. The cached ASR text is processed in the next conversational turn.</p>
         * </li>
         * <li><p><code>discard</code>: discards the ASR text.</p>
         * </li>
         * </ul>
         * <p>Default value: cache.</p>
         * 
         * <strong>example:</strong>
         * <p>cache</p>
         */
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
         * <p>The name of the built-in function provided by the AI agent in Alibaba Cloud. The value hangup is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hangup</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The name of the LLM function that corresponds to this function. This parameter is customized and used to call the corresponding function in the LLM. For more information about the protocol for custom LLMs, see <a href="https://help.aliyun.com/document_detail/2839094.html">Standard LLM API</a>.</p>
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
         * <p>The text of the conversation content that records the specific expressions or responses of the role in the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the participant in the conversation. Valid values:</p>
         * <ul>
         * <li><p><code>user</code>: the user</p>
         * </li>
         * <li><p><code>assistant</code>: the AI assistant</p>
         * </li>
         * <li><p><code>system</code>: the system</p>
         * </li>
         * <li><p><code>function</code>: a function</p>
         * </li>
         * <li><p><code>plugin</code>: a plug-in</p>
         * </li>
         * <li><p><code>tool</code>: a tool</p>
         * </li>
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
         * <p>The parameters for Alibaba Cloud Model Studio. For more information about the parameter format, see <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;biz_params\&quot;:{\&quot;user_defined_params\&quot;:{\&quot;your_plugin_id\&quot;:{\&quot;article_index\&quot;:2}}},\&quot;memory_id\&quot;:\&quot;your_memory_id\&quot;,\&quot;image_list\&quot;:[\&quot;<a href="https://your_image_url%5C%5C%22%5D,%5C%5C%22rag_options%5C%5C%22:%7B%5C%5C%22pipeline_ids%5C%5C%22:%5B%5C%5C%22your_id%5C%5C%22%5D,%5C%5C%22file_ids%5C%5C%22:%5B%5C%5C%22%E6%96%87%E6%A1%A3ID1%5C%5C%22,%5C%5C%22%E6%96%87%E6%A1%A3ID2%5C%5C%22%5D,%5C%5C%22metadata_filter%5C%5C%22:%7B%5C%5C%22name%5C%5C%22:%5C%5C%22%E5%BC%A0%E4%B8%89%5C%5C%22%7D,%5C%5C%22structured_filter%5C%5C%22:%7B%5C%5C%22key1%5C%5C%22:%5C%5C%22value1%5C%5C%22,%5C%5C%22key2%5C%5C%22:%5C%5C%22value2%5C%5C%22%7D,%5C%5C%22tags%5C%5C%22:%5B%5C%5C%22%E6%A0%87%E7%AD%BE1%5C%5C%22,%5C%5C%22%E6%A0%87%E7%AD%BE2%5C%5C%22%5D%7D%7D">https://your_image_url\\&quot;],\\&quot;rag_options\\&quot;:{\\&quot;pipeline_ids\\&quot;:[\\&quot;your_id\\&quot;],\\&quot;file_ids\\&quot;:[\\&quot;文档ID1\\&quot;,\\&quot;文档ID2\\&quot;],\\&quot;metadata_filter\\&quot;:{\\&quot;name\\&quot;:\\&quot;张三\\&quot;},\\&quot;structured_filter\\&quot;:{\\&quot;key1\\&quot;:\\&quot;value1\\&quot;,\\&quot;key2\\&quot;:\\&quot;value2\\&quot;},\\&quot;tags\\&quot;:[\\&quot;标签1\\&quot;,\\&quot;标签2\\&quot;]}}</a>&quot;</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        /**
         * <p>The list of function mappings, which is used to map AI agent capabilities to LLM functions. This feature is supported only when function calls are used in custom LLMs that are compatible with the OpenAI protocol.</p>
         */
        @NameInMap("FunctionMap")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigFunctionMap> functionMap;

        /**
         * <p>Specifies whether to keep the LLM message history consistent with the TTS playback content. Default value: false. If you enable this feature, the saved LLM messages are consistent with the TTS playback content.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HistorySyncWithTTS")
        public Boolean historySyncWithTTS;

        /**
         * <p>If you enable this feature, the system sends the complete LLM-generated result to the client after the generation is complete.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LlmCompleteReply")
        public Boolean llmCompleteReply;

        /**
         * <p>The conversation history of the LLM or MLLM.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigLlmHistory> llmHistory;

        /**
         * <p>The maximum number of conversational turns to retain in the history of the LLM or multimodal large language model (MLLM). Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        /**
         * <p>The system prompt for the LLM after the call is initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一位友好且乐于助人的助手，专注于为用户提供准确的信息和建议。</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The additional query parameters for an LLM that is compatible with the OpenAI protocol. The parameters must be in the key=value format. If you specify multiple parameters, separate them with ampersands (<code>&amp;</code>). All values must be of the string type.</p>
         * 
         * <strong>example:</strong>
         * <p>api-version=2024-02-01&amp;api-key=sk-xxx</p>
         */
        @NameInMap("OpenAIExtraQuery")
        public String openAIExtraQuery;

        /**
         * <p>The maximum delay for text output. If this threshold is exceeded, the cached text is forcibly output. Valid values: 1000 to 10000. Unit: ms. A value of 0 or empty indicates that this parameter is not in effect. Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("OutputMaxDelay")
        public String outputMaxDelay;

        /**
         * <p>The minimum length of text output. The unit is characters. Text shorter than this length is cached and waits for concatenation. Valid values: 0 to 100. A value of 0 or empty indicates that this parameter is not in effect. Default value: empty.</p>
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
         * <p>The target pronunciation. The pronunciation must be a Chinese character string of up to 10 characters in length and cannot contain spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>大石烂儿</p>
         */
        @NameInMap("Pronunciation")
        public String pronunciation;

        /**
         * <p>The type of the pronunciation rule. Valid value:</p>
         * <ul>
         * <li><code>replacement</code>: replaces the word with the specified pronunciation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replacement</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The word to be replaced. The word must be a Chinese character string of up to 10 characters in length and cannot contain spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>大栅栏</p>
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
         * <p>Only MiniMax is supported. The following seven emotions are supported:</p>
         * <ul>
         * <li><p><code>happy</code></p>
         * </li>
         * <li><p><code>sad</code></p>
         * </li>
         * <li><p><code>angry</code></p>
         * </li>
         * <li><p><code>fearful</code></p>
         * </li>
         * <li><p><code>disgusted</code></p>
         * </li>
         * <li><p><code>surprised</code></p>
         * </li>
         * <li><p><code>calm</code></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>happy</p>
         */
        @NameInMap("Emotion")
        public String emotion;

        /**
         * <p>Only MiniMax is supported. The default value is empty. This parameter enhances the recognition of specific minority languages and dialects. After you set this parameter, the speech performance in the specified minority language or dialect scenarios is improved. If the minority language type is unknown, you can set this parameter to <code>auto</code> to enable the model to automatically determine the minority language type. Valid values:</p>
         * <details>
         * 
         * <summary>
         * 
         * <p>Supported languages</p>
         * </summary>
         * 
         * <ul>
         * <li><p><code>Chinese</code>: Chinese</p>
         * </li>
         * <li><p><code>Chinese,Yue</code>: Cantonese</p>
         * </li>
         * <li><p><code>English</code>: English</p>
         * </li>
         * <li><p><code>Arabic</code>: Arabic</p>
         * </li>
         * <li><p><code>Russian</code>: Russian</p>
         * </li>
         * <li><p><code>Spanish</code>: Spanish</p>
         * </li>
         * <li><p><code>French</code>: French</p>
         * </li>
         * <li><p><code>Portuguese</code>: Portuguese</p>
         * </li>
         * <li><p><code>German</code>: German</p>
         * </li>
         * <li><p><code>Turkish</code>: Turkish</p>
         * </li>
         * <li><p><code>Dutch</code>: Dutch</p>
         * </li>
         * <li><p><code>Ukrainian</code>: Ukrainian</p>
         * </li>
         * <li><p><code>Vietnamese</code>: Vietnamese</p>
         * </li>
         * <li><p><code>Indonesian</code>: Indonesian</p>
         * </li>
         * <li><p><code>Japanese</code>: Japanese</p>
         * </li>
         * <li><p><code>Italian</code>: Italian</p>
         * </li>
         * <li><p><code>Korean</code>: Korean</p>
         * </li>
         * <li><p><code>Thai</code>: Thai</p>
         * </li>
         * <li><p><code>Polish</code>: Polish</p>
         * </li>
         * <li><p><code>Romanian</code>: Romanian</p>
         * </li>
         * <li><p><code>Greek</code>: Greek</p>
         * </li>
         * <li><p><code>Czech</code>: Czech</p>
         * </li>
         * <li><p><code>Finnish</code>: Finnish</p>
         * </li>
         * <li><p><code>Hindi</code>: Hindi</p>
         * </li>
         * <li><p><code>auto</code>: Automatic detection</p>
         * </li>
         * </ul>
         * </details>
         * 
         * <strong>example:</strong>
         * <p>Chinese</p>
         */
        @NameInMap("LanguageId")
        public String languageId;

        /**
         * <p>Only MiniMax is supported. Valid values: <code>speech-01-turbo</code> and <code>speech-02-turbo</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>speech-01-turbo</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The TTS pronunciation rules. You can specify a maximum of 20 rules in the array. The rules are executed in sequence.</p>
         */
        @NameInMap("PronunciationRules")
        public java.util.List<AIAgentOutboundCallConfigTtsConfigPronunciationRules> pronunciationRules;

        /**
         * <p>This parameter is supported on all platforms. For CosyVoice, the default value is 1.0 and the valid values are 0.5 to 2.0. For MiniMax, the default value is 1.0 and the valid values are 0.5 to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("SpeechRate")
        public Double speechRate;

        /**
         * <p>The voice ID. The change takes effect on the next sentence. If you do not specify this parameter, the voice ID configured in the AI agent template is used. This parameter is valid only for preset TTS voices. The value can be up to 64 characters in length. For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect samples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>longcheng_v2</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>The list of available voices.</p>
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
        /**
         * <strong>example:</strong>
         * <p>Low</p>
         */
        @NameInMap("Eagerness")
        public String eagerness;

        /**
         * <p>The mode for conversational turn detection. Valid values:</p>
         * <ul>
         * <li><p><code>Normal</code>: a basic mode that does not use AI for semantic analysis.</p>
         * </li>
         * <li><p><code>Semantic</code>: an AI-powered mode that determines whether the user has finished speaking based on the conversational context.</p>
         * </li>
         * </ul>
         * <p>Default value: <code>Normal</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Semantic</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The pause duration in AI mode that is used to determine whether a conversational turn has ended. Unit: ms. Default value: -1.</p>
         * <ul>
         * <li><p><code>-1</code>: The AI automatically determines an appropriate wait time.</p>
         * </li>
         * <li><p><code>0-10000</code>: A custom wait time. We recommend that you set this parameter to a value from 0 to 1500.</p>
         * </li>
         * </ul>
         * <p>Note: This parameter is invalid in Normal mode.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("SemanticWaitDuration")
        public Integer semanticWaitDuration;

        /**
         * <p>The list of keywords that are used to determine the end of a user\&quot;s conversational turn.</p>
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
