// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentConfig extends TeaModel {
    /**
     * <p>Configuration for the ambient sound played during the call.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public AIAgentConfigAmbientSoundConfig ambientSoundConfig;

    /**
     * <p>The configuration for Automatic Speech Recognition (ASR).</p>
     */
    @NameInMap("AsrConfig")
    public AIAgentConfigAsrConfig asrConfig;

    @NameInMap("AutoSpeechConfig")
    public AIAgentConfigAutoSpeechConfig autoSpeechConfig;

    /**
     * <p>The avatar configuration. Only effective if the workflow includes an avatar node.</p>
     */
    @NameInMap("AvatarConfig")
    public AIAgentConfigAvatarConfig avatarConfig;

    /**
     * <p>The URL for the agent\&quot;s profile image in audio-only calls. Default value: None.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/a.jpg">http://example.com/a.jpg</a></p>
     */
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    /**
     * <p>The type of the avatar URL. Default value: None.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("AvatarUrlType")
    public String avatarUrlType;

    @NameInMap("BackChannelingConfig")
    @Deprecated
    public java.util.List<AIAgentConfigBackChannelingConfig> backChannelingConfig;

    @NameInMap("BackChannelingConfigs")
    public java.util.List<AIAgentConfigBackChannelingConfigs> backChannelingConfigs;

    /**
     * <p>If enabled, the system intelligently merges short, interim segments into a single sentence. Default value: true.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIntelligentSegment")
    public Boolean enableIntelligentSegment;

    /**
     * <p>Specifies whether to enable the push-to-talk mode. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePushToTalk")
    public Boolean enablePushToTalk;

    /**
     * <p>The parameters for experimental features. Contact support for details.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ExperimentalConfig")
    public String experimentalConfig;

    /**
     * <p>Specifies whether to enable graceful shutdown. Default value: false.</p>
     * <p>If enabled, when the agent is stopped, it will finish its current sentence before disconnecting (up to 10 seconds).</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    /**
     * <p>The welcome message that the agent says upon joining. Changes take effect in the next session. Default value: None.</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The configuration for the speech interruption strategy.</p>
     */
    @NameInMap("InterruptConfig")
    public AIAgentConfigInterruptConfig interruptConfig;

    /**
     * <p>The configuration for the large language model (LLM).</p>
     */
    @NameInMap("LlmConfig")
    public AIAgentConfigLlmConfig llmConfig;

    /**
     * <p>The maximum time the agent will wait for interaction before it hangs up. Unit: seconds. Default value: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Integer maxIdleTime;

    /**
     * <p>The configuration for Text-to-Speech (TTS).</p>
     */
    @NameInMap("TtsConfig")
    public AIAgentConfigTtsConfig ttsConfig;

    /**
     * <p>The configuration for detecting the end of a user\&quot;s conversational turn.</p>
     */
    @NameInMap("TurnDetectionConfig")
    public AIAgentConfigTurnDetectionConfig turnDetectionConfig;

    /**
     * <p>The timeout period for the agent to close the task after the user has left the channel. Unit: seconds. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UserOfflineTimeout")
    public Integer userOfflineTimeout;

    /**
     * <p>The timeout period for the agent to close the task if no user joins the channel. Unit: seconds. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("UserOnlineTimeout")
    public Integer userOnlineTimeout;

    /**
     * <p>Configuration for video content recognition. When enabled, the system sends callbacks to the client with details about content identified.</p>
     */
    @NameInMap("VcrConfig")
    public AIAgentConfigVcrConfig vcrConfig;

    /**
     * <p>The configuration for voiceprint recognition.</p>
     */
    @NameInMap("VoiceprintConfig")
    public AIAgentConfigVoiceprintConfig voiceprintConfig;

    /**
     * <p>The agent\&quot;s speaking volume.</p>
     * <ul>
     * <li>If this parameter is not specified, the adaptive volume mode is used by default.</li>
     * <li>To specify this parameter, enter a value between 0 and 400. Output volume = Workflow output volume × Volume/100. Example:</li>
     * </ul>
     * <ol>
     * <li>If Volume is set to 0, the output is muted.</li>
     * <li>If Volume is set to 100, the output volume is the original volume.</li>
     * <li>If Volume is set to 200, the output volume is 2 times the original volume.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Volume")
    public Long volume;

    /**
     * <p>A command given to the agent before the call starts. The agent will respond to this query immediately after the call begins.</p>
     */
    @NameInMap("WakeUpQuery")
    public String wakeUpQuery;

    /**
     * <p>The parameters to override the workflow configuration. Default value: None.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
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
         * <p>The voice activity detection (VAD) threshold for interruption. A higher value makes it harder to trigger interruptions. Valid values: 0 to 10. Default value: 1. The value of 0 specifies to disable the VAD feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The model ID of the avatar.</p>
         * 
         * <strong>example:</strong>
         * <p>5257</p>
         */
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
        /**
         * <p>Alibaba Cloud Model Studio Application Center parameters in a JSON format. Reference: <a href="https://help.aliyun.com/document_detail/2858132.html">Model Studio Application Center Parameter</a></p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        /**
         * <p>Maps agent capabilities to LLM functions. Only supports function calling with custom LLMs that adhere to the OpenAI protocol.</p>
         */
        @NameInMap("FunctionMap")
        public java.util.List<AIAgentConfigLlmConfigFunctionMap> functionMap;

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
        public java.util.List<AIAgentConfigLlmConfigLlmHistory> llmHistory;

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
        public Integer outputMaxDelay;

        /**
         * <p>The minimum number of characters that must be buffered before a text chunk is sent. Valid values: [0, 100]. A value of 0 or an empty string (default) disables this limit.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
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
         * <p>Applies only to MiniMax models. Valid values: speech-01-turbo and speech-02-turbo</p>
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
        public java.util.List<AIAgentConfigTtsConfigPronunciationRules> pronunciationRules;

        /**
         * <p>Supports all platforms. For CosyVoice, the default value is 1.0. Valid values: 0.5 to 2.0. For MiniMax, the default value is 1.0. Valid values: 0.5 to 2.0.</p>
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

        /**
         * <p>The mode of turn detection.</p>
         * <ul>
         * <li>Normal: uses simple pause detection.</li>
         * <li>Semantic: uses AI to analyze context.</li>
         * </ul>
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
         * <blockquote>
         * <p> In Normal mode, this field is ignored.</p>
         * </blockquote>
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
        /**
         * <p>Enables or disables device identification. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>Enables or disables head motion detection. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>The delay in milliseconds before an invalid frame detection event is triggered. The callback is sent only after the frame has been considered invalid for this duration. If not set, the value from the console configuration is used. Valid values: [200, 5000].</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("CallbackDelay")
        public Integer callbackDelay;

        /**
         * <p>Enables or disables invalid frame detection.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>Enables or disables this feature. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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
        /**
         * <p>Enables or disables the feature. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>The delay in milliseconds before a still frame detection event is triggered. The callback is sent only after the video has been static for this duration. If not set, the value from the console configuration is used. Valid values: [200,5000].</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("CallbackDelay")
        public Integer callbackDelay;

        /**
         * <p>Enables or disables still frame detection. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
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
        /**
         * <p>Configuration for device identification.</p>
         */
        @NameInMap("Equipment")
        public AIAgentConfigVcrConfigEquipment equipment;

        /**
         * <p>Configuration for head motion detection.</p>
         */
        @NameInMap("HeadMotion")
        public AIAgentConfigVcrConfigHeadMotion headMotion;

        /**
         * <p>Configuration for detecting invalid frames.</p>
         */
        @NameInMap("InvalidFrameMotion")
        public AIAgentConfigVcrConfigInvalidFrameMotion invalidFrameMotion;

        /**
         * <p>Configuration for detecting if the user is looking away from the screen.</p>
         */
        @NameInMap("LookAway")
        public AIAgentConfigVcrConfigLookAway lookAway;

        /**
         * <p>Configuration for the people counting feature.</p>
         */
        @NameInMap("PeopleCount")
        public AIAgentConfigVcrConfigPeopleCount peopleCount;

        /**
         * <p>Configuration for detecting still frames.</p>
         */
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

        /**
         * <p>Specifies whether to enable voiceprint recognition. Default value: false. You must specify a valid voiceprint ID when you enable voiceprint recognition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The unique ID of the voiceprint. Default value: None.<a href="~~2964738~~"></a></p>
         * 
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
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
