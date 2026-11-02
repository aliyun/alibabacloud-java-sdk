// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentOutboundCallConfig extends TeaModel {
    /**
     * <p>The ambient sound configuration for calls.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public AIAgentOutboundCallConfigAmbientSoundConfig ambientSoundConfig;

    /**
     * <p>The speech recognition configuration.</p>
     */
    @NameInMap("AsrConfig")
    public AIAgentOutboundCallConfigAsrConfig asrConfig;

    /**
     * <p>The automatic speech configuration module for the agent, including LLM waiting prompts and user long-time silence inquiries.</p>
     */
    @NameInMap("AutoSpeechConfig")
    public AIAgentOutboundCallConfigAutoSpeechConfig autoSpeechConfig;

    /**
     * <p><strong>[Deprecated]</strong> Use BackChannelingConfigs instead.</p>
     */
    @NameInMap("BackChannelingConfig")
    @Deprecated
    public AIAgentOutboundCallConfigBackChannelingConfig backChannelingConfig;

    /**
     * <p>The backchanneling feature configuration module. After this feature is enabled, the system randomly broadcasts short backchanneling words at specific trigger timings.</p>
     */
    @NameInMap("BackChannelingConfigs")
    public java.util.List<AIAgentOutboundCallConfigBackChannelingConfigs> backChannelingConfigs;

    /**
     * <p>Specifies whether to enable intelligent segmentation. After this feature is enabled, fragmented sentences spoken by the user are intelligently merged into a single sentence. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIntelligentSegment")
    public Boolean enableIntelligentSegment;

    /**
     * <p>The parameters for experimental features. Contact technical support if you have any requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ExperimentalConfig")
    public String experimentalConfig;

    /**
     * <p>The greeting message. Changes take effect in the next session. Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The delay time for the greeting message. Unit: milliseconds. Default value: 0. Valid values: 0 to 5000.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("GreetingDelay")
    public Integer greetingDelay;

    /**
     * <p>The speech interruption policy configuration.</p>
     */
    @NameInMap("InterruptConfig")
    public AIAgentOutboundCallConfigInterruptConfig interruptConfig;

    /**
     * <p>The large language model (LLM) configuration.</p>
     */
    @NameInMap("LlmConfig")
    public AIAgentOutboundCallConfigLlmConfig llmConfig;

    /**
     * <p>The maximum waiting time without interaction with the agent. If this time is exceeded, the agent goes offline. Unit: seconds. Default value: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Integer maxIdleTime;

    /**
     * <p>The speech synthesis configuration.</p>
     */
    @NameInMap("TtsConfig")
    public AIAgentOutboundCallConfigTtsConfig ttsConfig;

    /**
     * <p>The conversation turn detection configuration.</p>
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
         * <p>The ID of the ambient sound for calls. You can obtain this ID in the advanced configurations of the agent configuration in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>f67901c595834************</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The volume of the background sound for calls. Valid values: 0 to 100. A value of 0 indicates that the background sound is disabled.</p>
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
         * <p>The list of ASR hotwords. The list supports a maximum of 128 hotwords.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for automatic speech recognition (ASR). Valid values:</p>
         * <ul>
         * <li><p>zh_mandarin: Chinese</p>
         * </li>
         * <li><p>en: English</p>
         * </li>
         * <li><p>zh_en: Chinese and English mixed</p>
         * </li>
         * <li><p>es: Spanish</p>
         * </li>
         * <li><p>jp: Japanese</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_mandarin</p>
         */
        @NameInMap("AsrLanguageId")
        public String asrLanguageId;

        /**
         * <p>The silence duration threshold for speech segmentation. If the silence duration exceeds this threshold, the speech is considered segmented. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>The pass-through parameters for the proprietary ASR integration.</p>
         * 
         * <strong>example:</strong>
         * <p>mode=fast&amp;sample=16000&amp;format=wav</p>
         */
        @NameInMap("CustomParams")
        public String customParams;

        /**
         * <p>The minimum duration threshold for voice activity detection, which is used to control the sensitivity of interruptions. A value of 0 disables this feature. Valid values: 200 to 2000. Unit: milliseconds. Common values: 200 to 500, which correspond to 1 to 4 characters. Default value: empty. This parameter does not take effect when left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("VadDuration")
        public Integer vadDuration;

        /**
         * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
         * <ul>
         * <li>0: Disables the voice activity detection (VAD) feature.</li>
         * <li>1 to 10: A higher value indicates that it is more difficult to interrupt the speech.</li>
         * <li>11: Significantly different from previous values. It causes less damage to the conversation voice during pre-processing and provides stronger anti-interference capability.</li>
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
         * <p>The selection probability of the prompt. Valid values: 0 to 1, which correspond to 0% to 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the inquiry prompt. The maximum length is 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Just a moment</p>
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
         * <p>The collection of inquiry prompts. A maximum of 10 prompts are supported. The length of each prompt cannot exceed 100 characters. The sum of probabilities must be 100%.</p>
         */
        @NameInMap("Messages")
        public java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigLlmPendingMessages> messages;

        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The waiting time threshold for the LLM response. If this time is exceeded, a broadcast prompt is triggered. This parameter is required. Unit: milliseconds. Valid values: 500 to 10000. Set this parameter based on the actual usage of the LLM.</p>
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
         * <p>The selection probability of the prompt. Valid values: 0 to 1, which correspond to 0% to 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the inquiry prompt. The maximum length is 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Are you still there?</p>
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
         * <p>The hang-up closing word. It is broadcast before the call is hung up after the user does not respond for a long time. The maximum length is 200 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>I’m hanging up, goodbye.</p>
         */
        @NameInMap("HangupEndWord")
        public String hangupEndWord;

        /**
         * <p>The maximum number of inquiries. Valid values: 0 to 10. This parameter is required. If this number is exceeded, no more inquiries are triggered, and the call is directly closed.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>The collection of inquiry prompts. A maximum of 10 prompts are supported. The length of each prompt cannot exceed 100 characters. The sum of probabilities must be 100%.</p>
         */
        @NameInMap("Messages")
        public java.util.List<AIAgentOutboundCallConfigAutoSpeechConfigUserIdleMessages> messages;

        /**
         * <p>The silence duration threshold. Unit: milliseconds. This parameter is required. An inquiry is triggered when the silence duration exceeds this threshold. Valid values: 5000 to 600000.</p>
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
         * <p>The broadcast configuration when the LLM response is delayed.</p>
         */
        @NameInMap("LlmPending")
        public AIAgentOutboundCallConfigAutoSpeechConfigLlmPending llmPending;

        /**
         * <p>The inquiry broadcast configuration when the user is silent for a long time.</p>
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
         * <p>The trigger probability of the phrase. Valid values: 0.0 to 1.0. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the phrase. The maximum length is 20 characters. Multiple languages are supported. Required.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
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
         * <p>Specifies whether to enable the backchanneling feature. This parameter is required. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The trigger probability of the feature. Valid values: 0.0 to 1.0. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The trigger timing for backchanneling. Valid values:</p>
         * <ul>
         * <li>pause_detected: A short pause in speech is detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pause_detected</p>
         */
        @NameInMap("TriggerStage")
        public String triggerStage;

        /**
         * <p>The collection of backchanneling phrases. A maximum of 10 phrases are supported. The length of each phrase cannot exceed 20 characters. The sum of probabilities must be 1.0.</p>
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
         * <p>The specific words or phrases that trigger conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>Specifies whether to retain the interrupt words and send them to the LLM. Default value: discard.</p>
         * <blockquote>
         * <p>Example: If the interrupt word is &quot;wait&quot;, the phrase &quot;wait how is the weather today&quot; becomes &quot;how is the weather today&quot; after the interrupt word is discarded and sent to the LLM.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeepInterruptWordsForLLM")
        public Boolean keepInterruptWordsForLLM;

        /**
         * <p>The ASR processing policy in the No Interrupting mode. Valid values:</p>
         * <ul>
         * <li><p>cache: Caches the ASR text. After the current turn ends, the cached ASR text is processed together in the next turn.</p>
         * </li>
         * <li><p>discard: Directly discards the ASR text.</p>
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
         * <p>The name of the built-in feature provided by the Alibaba Cloud agent system. Currently, only hangup is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hangup</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The name of the LLM function that corresponds to the feature. This name is customized by the user and used to call the corresponding feature in the LLM. For the user-defined LLM protocol, refer to <a href="https://help.aliyun.com/document_detail/2839094.html">Standard LLM API</a>.</p>
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
         * <p>The actual text content of the conversation, which records the specific expression or response of the role in the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the conversation participant. Valid values:</p>
         * <ul>
         * <li><p>user: User</p>
         * </li>
         * <li><p>assistant: Assistant</p>
         * </li>
         * <li><p>system: System</p>
         * </li>
         * <li><p>function: Function</p>
         * </li>
         * <li><p>plugin: Plugin</p>
         * </li>
         * <li><p>tool: Tool</p>
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
         * <p>The parameters for Alibaba Cloud Model Studio Application Center. For the parameter format, refer to <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Application Center parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;biz_params\&quot;:{\&quot;user_defined_params\&quot;:{\&quot;your_plugin_id\&quot;:{\&quot;article_index\&quot;:2}}},\&quot;memory_id\&quot;:\&quot;your_memory_id\&quot;,\&quot;image_list\&quot;:[\&quot;<a href="https://your_image_url%5C%5C%22%5D,%5C%5C%22rag_options%5C%5C%22:%7B%5C%5C%22pipeline_ids%5C%5C%22:%5B%5C%5C%22your_id%5C%5C%22%5D,%5C%5C%22file_ids%5C%5C%22:%5B%5C%5C%22DocumentID1%5C%5C%22,%5C%5C%22DocumentID2%5C%5C%22%5D,%5C%5C%22metadata_filter%5C%5C%22:%7B%5C%5C%22name%5C%5C%22:%5C%5C%22ZhangSan%5C%5C%22%7D,%5C%5C%22structured_filter%5C%5C%22:%7B%5C%5C%22key1%5C%5C%22:%5C%5C%22value1%5C%5C%22,%5C%5C%22key2%5C%5C%22:%5C%5C%22value2%5C%5C%22%7D,%5C%5C%22tags%5C%5C%22:%5B%5C%5C%22Tag1%5C%5C%22,%5C%5C%22Tag2%5C%5C%22%5D%7D%7D">https://your_image_url\\&quot;],\\&quot;rag_options\\&quot;:{\\&quot;pipeline_ids\\&quot;:[\\&quot;your_id\\&quot;],\\&quot;file_ids\\&quot;:[\\&quot;DocumentID1\\&quot;,\\&quot;DocumentID2\\&quot;],\\&quot;metadata_filter\\&quot;:{\\&quot;name\\&quot;:\\&quot;ZhangSan\\&quot;},\\&quot;structured_filter\\&quot;:{\\&quot;key1\\&quot;:\\&quot;value1\\&quot;,\\&quot;key2\\&quot;:\\&quot;value2\\&quot;},\\&quot;tags\\&quot;:[\\&quot;Tag1\\&quot;,\\&quot;Tag2\\&quot;]}}</a>&quot;</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        /**
         * <p>The list of function mappings, which is used to map agent capabilities to LLM functions. Currently, only function calling with user-defined OpenAI-compatible LLMs is supported.</p>
         */
        @NameInMap("FunctionMap")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigFunctionMap> functionMap;

        /**
         * <p>Specifies whether the LLM message history is consistent with the text-to-speech (TTS) playback content. Default value: false. After this feature is enabled, the saved LLM messages are consistent with the TTS playback content.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HistorySyncWithTTS")
        public Boolean historySyncWithTTS;

        /**
         * <p>After this feature is enabled, the complete LLM result is sent to the client after the LLM generates the result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LlmCompleteReply")
        public Boolean llmCompleteReply;

        /**
         * <p>The LLM or MLLM conversation history context.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigLlmHistory> llmHistory;

        /**
         * <p>The maximum number of retained turns for the LLM or multimodal LLM (MLLM) conversation history context. Default value: 10.</p>
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
         * <p>You are a friendly and helpful assistant, focused on providing users with accurate information and advice.</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The additional query parameters for the OpenAI-compatible LLM. Parameters must be in the key=value format. Multiple parameters are connected by an ampersand (&amp;). All values must be of the string type.</p>
         * 
         * <strong>example:</strong>
         * <p>api-version=2024-02-01&amp;api-key=sk-xxx</p>
         */
        @NameInMap("OpenAIExtraQuery")
        public String openAIExtraQuery;

        /**
         * <p>The maximum delay time for text output in milliseconds. If this time is exceeded, the cached text is forcibly output. Valid values: 1000 to 10000. A value of 0 or empty indicates no limit. Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("OutputMaxDelay")
        public String outputMaxDelay;

        /**
         * <p>The minimum length of text output in characters. Text shorter than this length is cached and waiting to be concatenated. Valid values: 0 to 100. A value of 0 or empty indicates no limit. Default value: empty.</p>
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
         * <p>The target pronunciation. The length must be less than 10 characters. It must consist of Chinese characters and cannot contain spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>Dashi Lane</p>
         */
        @NameInMap("Pronunciation")
        public String pronunciation;

        /**
         * <p>The specific pronunciation rule type. Valid values:</p>
         * <ul>
         * <li>replacement: The rule that directly replaces the word with the pronunciation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replacement</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The word to be replaced. The length must be less than 10 characters. It must consist of Chinese characters and cannot contain spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>Dashi Lane</p>
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
         * <p>The emotion. Currently, only MiniMax is supported. MiniMax supports the following seven emotions:</p>
         * <ul>
         * <li>happy: Happy</li>
         * <li>sad: Sad</li>
         * <li>angry: Angry</li>
         * <li>fearful: Fearful</li>
         * <li>disgusted: Disgusted</li>
         * <li>surprised: Surprised</li>
         * <li>calm: Neutral</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>happy</p>
         */
        @NameInMap("Emotion")
        public String emotion;

        /**
         * <p>The language ID. Currently, only MiniMax is supported. Default value: empty. This parameter enhances the recognition capability for specified minority languages and dialects. After this parameter is set, the speech performance in the specified minority language or dialect scenarios is improved. If the minority language type is not clear, you can set this parameter to auto, and the model automatically determines the minority language type. Valid values:</p>
         * <details>
         * <summary>Supported languages</summary>
         * 
         * <ul>
         * <li>Chinese: Chinese</li>
         * <li>Chinese,Yue: Cantonese</li>
         * <li>English: English</li>
         * <li>Arabic: Arabic</li>
         * <li>Russian: Russian</li>
         * <li>Spanish: Spanish</li>
         * <li>French: French</li>
         * <li>Portuguese: Portuguese</li>
         * <li>German: German</li>
         * <li>Turkish: Turkish</li>
         * <li>Dutch: Dutch</li>
         * <li>Ukrainian: Ukrainian</li>
         * <li>Vietnamese: Vietnamese</li>
         * <li>Indonesian: Indonesian</li>
         * <li>Japanese: Japanese</li>
         * <li>Italian: Italian</li>
         * <li>Korean: Korean</li>
         * <li>Thai: Thai</li>
         * <li>Polish: Polish</li>
         * <li>Romanian: Romanian</li>
         * <li>Greek: Greek</li>
         * <li>Czech: Czech</li>
         * <li>Finnish: Finnish</li>
         * <li>Hindi: Hindi</li>
         * <li>auto: Automatic detection</details></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Chinese</p>
         */
        @NameInMap("LanguageId")
        public String languageId;

        /**
         * <p>The model ID. Currently, only MiniMax is supported. Valid values: speech-01-turbo and speech-02-turbo.</p>
         * 
         * <strong>example:</strong>
         * <p>speech-01-turbo</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>The TTS pronunciation rules. The array length cannot exceed 20. The rules are executed in sequence.</p>
         */
        @NameInMap("PronunciationRules")
        public java.util.List<AIAgentOutboundCallConfigTtsConfigPronunciationRules> pronunciationRules;

        /**
         * <p>The speech rate. This parameter is supported on all platforms. For CosyVoice, the default value is 1.0, and the valid values are 0.5 to 2.0. For MiniMax, the default value is 1.0, and the valid values are 0.5 to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("SpeechRate")
        public Double speechRate;

        /**
         * <p>The voice ID. Changes take effect in the next sentence. If this parameter is not specified, the voice ID configured in the agent template is used. This parameter takes effect only for preset TTS. The input length cannot exceed 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
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
         * <p>The eagerness level. This parameter takes effect only in Semantic mode. It controls the speed at which the AI initiates a response after detecting a pause. Valid values:</p>
         * <ul>
         * <li>Low: Waits patiently with a maximum waiting time of 6 seconds to reduce the risk of being interrupted.</li>
         * <li>Medium: Balances waiting with a maximum waiting time of 4 seconds. This value is suitable for most scenarios.</li>
         * <li>High: Responds quickly with a maximum waiting time of 2 seconds. This value improves speed but may increase the risk of false cuts.</li>
         * </ul>
         * <p>Default value: empty.</p>
         * 
         * <strong>example:</strong>
         * <p>Low</p>
         */
        @NameInMap("Eagerness")
        public String eagerness;

        /**
         * <p>The turn detection mode. Valid values:</p>
         * <ul>
         * <li><p>Normal: The normal mode, which does not use AI to determine semantics.</p>
         * </li>
         * <li><p>Semantic: Uses AI to determine whether the user has finished speaking based on the context semantics.</p>
         * </li>
         * </ul>
         * <p>Default value: Normal.</p>
         * 
         * <strong>example:</strong>
         * <p>Semantic</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The pause determination time in AI mode. Unit: milliseconds. Default value: -1.</p>
         * <ul>
         * <li><p>-1: AI automatically determines the appropriate waiting time.</p>
         * </li>
         * <li><p>0 to 10000: Custom waiting time. We recommend that you set this value to 0 to 1500.</p>
         * </li>
         * </ul>
         * <p>Note: This parameter is invalid in normal mode.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("SemanticWaitDuration")
        public Integer semanticWaitDuration;

        /**
         * <p>The list of keywords used to determine the end of a user turn.</p>
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
