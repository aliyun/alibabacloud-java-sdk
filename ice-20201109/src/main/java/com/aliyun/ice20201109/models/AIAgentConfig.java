// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentConfig extends TeaModel {
    /**
     * <p>Configuration for ambient sound during the call.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public AIAgentConfigAmbientSoundConfig ambientSoundConfig;

    /**
     * <p>Configuration for automatic speech recognition (ASR).</p>
     */
    @NameInMap("AsrConfig")
    public AIAgentConfigAsrConfig asrConfig;

    /**
     * <p>Configuration for the agent\&quot;s automatic speech, including prompts for LLM latency and long periods of user silence.</p>
     */
    @NameInMap("AutoSpeechConfig")
    public AIAgentConfigAutoSpeechConfig autoSpeechConfig;

    /**
     * <p>Configuration for the avatar. This takes effect only if the workflow includes an avatar node.</p>
     */
    @NameInMap("AvatarConfig")
    public AIAgentConfigAvatarConfig avatarConfig;

    /**
     * <p>The URL of the avatar to display during voice calls. If omitted, no avatar is displayed.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/a.jpg">http://example.com/a.jpg</a></p>
     */
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    /**
     * <p>The type of the avatar URL. By default, this parameter is not set.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("AvatarUrlType")
    public String avatarUrlType;

    /**
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>已废弃，请使用 BackChannelingConfigs</p>
     */
    @NameInMap("BackChannelingConfig")
    @Deprecated
    public java.util.List<AIAgentConfigBackChannelingConfig> backChannelingConfig;

    /**
     * <p>Configuration for back-channeling. When enabled, the system plays short, responsive phrases at specific trigger points.</p>
     */
    @NameInMap("BackChannelingConfigs")
    public java.util.List<AIAgentConfigBackChannelingConfigs> backChannelingConfigs;

    /**
     * <p>Specifies whether to enable intelligent segmentation. When enabled, short user utterances are merged into a single sentence. Default: <code>true</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableIntelligentSegment")
    public Boolean enableIntelligentSegment;

    /**
     * <p>Specifies whether to enable push-to-talk mode. Default: <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePushToTalk")
    public Boolean enablePushToTalk;

    /**
     * <p>Parameters for experimental features. Contact support for assistance.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ExperimentalConfig")
    public String experimentalConfig;

    /**
     * <p>Specifies whether to enable graceful shutdown. Default: <code>false</code>.</p>
     * <p>If enabled, the AI agent completes its current utterance before disconnecting when the task is stopped. The agent will not speak for more than 10 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    /**
     * <p>The welcome message the AI agent plays when joining the session. Changes apply to subsequent sessions. If omitted, no welcome message is played.</p>
     * 
     * <strong>example:</strong>
     * <p>你好</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>Configuration for the speech interruption policy.</p>
     */
    @NameInMap("InterruptConfig")
    public AIAgentConfigInterruptConfig interruptConfig;

    /**
     * <p>Configuration for the large language model (LLM).</p>
     */
    @NameInMap("LlmConfig")
    public AIAgentConfigLlmConfig llmConfig;

    /**
     * <p>The maximum idle duration in seconds before the AI agent disconnects. If the agent receives no user interaction within this period, it ends the task. Default: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Integer maxIdleTime;

    /**
     * <p>Configuration for text-to-speech (TTS).</p>
     */
    @NameInMap("TtsConfig")
    public AIAgentConfigTtsConfig ttsConfig;

    /**
     * <p>Configuration for conversational turn detection.</p>
     */
    @NameInMap("TurnDetectionConfig")
    public AIAgentConfigTurnDetectionConfig turnDetectionConfig;

    /**
     * <p>The duration in seconds the AI agent waits before terminating the task after a user leaves the session. Default: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UserOfflineTimeout")
    public Integer userOfflineTimeout;

    /**
     * <p>The duration in seconds the AI agent waits for a user to join. If the user does not join within this time, the agent terminates the task. Default: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("UserOnlineTimeout")
    public Integer userOnlineTimeout;

    /**
     * <p>Configuration for video content recognition. This enables the system to send callbacks to the client about events detected in the video stream.</p>
     */
    @NameInMap("VcrConfig")
    public AIAgentConfigVcrConfig vcrConfig;

    /**
     * <p>Configuration for voiceprint recognition.</p>
     */
    @NameInMap("VoiceprintConfig")
    public AIAgentConfigVoiceprintConfig voiceprintConfig;

    /**
     * <p>The speaking volume of the AI agent.</p>
     * <ul>
     * <li><p>If not set, the adaptive volume mode recommended by Alibaba Cloud is used by default.</p>
     * </li>
     * <li><p>If set, the value must be in the range of 0 to 400. The final output volume is calculated as: <code>(Workflow volume) * (volume / 100)</code>. For example:</p>
     * </li>
     * </ul>
     * <ol>
     * <li><p>If <code>volume</code> is 0, the output volume is 0.</p>
     * </li>
     * <li><p>If <code>volume</code> is 100, the output volume is the same as the original volume.</p>
     * </li>
     * <li><p>If <code>volume</code> is 200, the output volume is twice the original volume.</p>
     * </li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Volume")
    public Long volume;

    /**
     * <p>A user-provided command that the AI agent responds to immediately after the call starts.</p>
     * 
     * <strong>example:</strong>
     * <p>今天天气怎么样？</p>
     */
    @NameInMap("WakeUpQuery")
    public String wakeUpQuery;

    /**
     * <p>A JSON string containing parameters to override the default workflow configuration.</p>
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
         * <p>The ID of the ambient sound resource. You can obtain this ID from the advanced settings of the agent configuration in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>f67901c595834************</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The volume of the ambient sound. Range: 0–100. A value of 0 disables the sound.</p>
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
         * <p>A list of hotwords to improve ASR accuracy. You can specify a maximum of 128 hotwords.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language for ASR. Valid values:</p>
         * <ul>
         * <li><p><code>zh_mandarin</code>: Chinese (Mandarin)</p>
         * </li>
         * <li><p><code>en</code>: English</p>
         * </li>
         * <li><p><code>zh_en</code>: Chinese-English mixed</p>
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
         * <p>The maximum duration of silence in milliseconds before the ASR engine finalizes an utterance. A pause longer than this value signals a sentence break. Range: 200–1200. Default: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>Passthrough parameters for proprietary ASR integrations.</p>
         * 
         * <strong>example:</strong>
         * <p>mode=fast&amp;sample=16000&amp;format=wav</p>
         */
        @NameInMap("CustomParams")
        public String customParams;

        /**
         * <p>The minimum duration in milliseconds of continuous user speech required to trigger an interruption. This controls interruption sensitivity. A value of 0 disables this feature. Range: 200–2000. A common range is 200–500 ms, which typically corresponds to 1 to 4 Chinese characters. If omitted, this feature is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("VadDuration")
        public Integer vadDuration;

        /**
         * <p>The Voice Activity Detection (VAD) threshold for interruptions. Range: 0–11. Default: 11.</p>
         * <ul>
         * <li><p><code>0</code>: Disables VAD.</p>
         * </li>
         * <li><p><code>1</code>–<code>10</code>: Sets the interruption sensitivity. A higher value makes the agent harder to interrupt.</p>
         * </li>
         * <li><p><code>11</code>: An enhanced mode with lower audio distortion and stronger noise resistance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>11</p>
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
        /**
         * <p>The probability of this message being selected. Range: 0–1, corresponding to 0%–100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the prompt message, up to 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>稍等一下</p>
         */
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
        /**
         * <p>A collection of prompt messages. A maximum of 10 messages are supported, each up to 100 characters. The sum of all probabilities must be 100%.</p>
         */
        @NameInMap("Messages")
        public java.util.List<AIAgentConfigAutoSpeechConfigLlmPendingMessages> messages;

        /**
         * <p>The mode for handling LLM latency prompts. <code>random</code>: Plays a random message from the list. <code>sequence</code>: Plays messages in order. This is a required field.</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The wait time threshold for LLM responses. If the threshold is exceeded, a prompt is played. This is a required field. Unit: ms. Range: 500–10000. Set this value based on the actual performance of your LLM.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
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

        public AIAgentConfigAutoSpeechConfigLlmPending setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
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
        /**
         * <p>The probability of this message being selected. Range: 0–1, corresponding to 0%–100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the prompt message, up to 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>您还在吗？</p>
         */
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
        /**
         * <p>A farewell message played before hanging up due to user inactivity.</p>
         * 
         * <strong>example:</strong>
         * <p>我挂了，再见</p>
         */
        @NameInMap("HangupEndWord")
        public String hangupEndWord;

        /**
         * <p>The maximum number of times the prompt can be repeated. Range: 0–10. This is a required field. If the limit is exceeded, the call is terminated.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>A collection of prompt messages. A maximum of 10 messages are supported, each up to 100 characters. The sum of all probabilities must be 100%.</p>
         */
        @NameInMap("Messages")
        public java.util.List<AIAgentConfigAutoSpeechConfigUserIdleMessages> messages;

        /**
         * <p>The silence duration threshold in milliseconds. If the user is silent for longer than this period, a prompt is triggered. Range: 5000–600000. This is a required field.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("WaitTime")
        public Integer waitTime;

        public static AIAgentConfigAutoSpeechConfigUserIdle build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigAutoSpeechConfigUserIdle self = new AIAgentConfigAutoSpeechConfigUserIdle();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigAutoSpeechConfigUserIdle setHangupEndWord(String hangupEndWord) {
            this.hangupEndWord = hangupEndWord;
            return this;
        }
        public String getHangupEndWord() {
            return this.hangupEndWord;
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
        /**
         * <p>Configuration for prompts to play during LLM response latency.</p>
         */
        @NameInMap("LlmPending")
        public AIAgentConfigAutoSpeechConfigLlmPending llmPending;

        /**
         * <p>Configuration for prompts to play when the user is silent for an extended period.</p>
         */
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
        /**
         * <p>本短语的触发概率，范围 0.0–1.0，必填。</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>短语文本，长度 ≤ 20 字符，支持多语言。必填。</p>
         * 
         * <strong>example:</strong>
         * <p>嗯嗯</p>
         */
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
        /**
         * <p>是否启用附和功能。必填，取值 true/false。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>功能触发概率。范围 0.0–1.0。必填。</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>附和触发的时机。可选值：</p>
         * <ul>
         * <li>pause_detected（检测到说话短暂停顿）</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pause_detected</p>
         */
        @NameInMap("TriggerStage")
        public String triggerStage;

        /**
         * <p>附和短语集合。最大 10 条，每条短语长度 ≤ 20 字符，概率总和为 1.0。</p>
         */
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
        /**
         * <p>本短语的触发概率，范围 0.0–1.0，必填。</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>短语文本，长度 ≤ 20 字符，支持多语言。必填。</p>
         * 
         * <strong>example:</strong>
         * <p>嗯嗯</p>
         */
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
        /**
         * <p>Specifies whether to enable this back-channeling rule. This is a required field.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The trigger probability. Range: 0.0–1.0. This is a required field.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The trigger for the back-channeling. Valid value:</p>
         * <ul>
         * <li><code>pause_detected</code>: Triggered when a short pause in speech is detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pause_detected</p>
         */
        @NameInMap("TriggerStage")
        public String triggerStage;

        /**
         * <p>A collection of acknowledgment phrases. You can specify a maximum of 10 phrases. Each phrase must be 20 characters or less, and the sum of their probabilities must be 1.0.</p>
         */
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
         * <p>Specifies whether to enable speech interruption. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>A list of specific words or phrases that trigger an interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>Specifies whether to include the interrupt words in the text sent to the LLM. Default: <code>false</code> (words are discarded).</p>
         * <blockquote>
         * <p>For example, if &quot;hold on&quot; is an interrupt word and the user says &quot;hold on, what is the weather like today?&quot;, setting this to <code>false</code> results in only &quot;what is the weather like today?&quot; being sent to the LLM.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeepInterruptWordsForLLM")
        public Boolean keepInterruptWordsForLLM;

        /**
         * <p>Specifies how to handle user speech that occurs during a non-interruptible section of the agent\&quot;s utterance.</p>
         * <ul>
         * <li><p><code>cache</code>: Caches the user\&quot;s speech and processes it in the next conversational turn.</p>
         * </li>
         * <li><p><code>discard</code>: Discards the user\&quot;s speech.</p>
         * </li>
         * </ul>
         * <p>Default: <code>cache</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>cache</p>
         */
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

        public AIAgentConfigInterruptConfig setKeepInterruptWordsForLLM(Boolean keepInterruptWordsForLLM) {
            this.keepInterruptWordsForLLM = keepInterruptWordsForLLM;
            return this;
        }
        public Boolean getKeepInterruptWordsForLLM() {
            return this.keepInterruptWordsForLLM;
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
         * <p>The name of a built-in function provided by the AI agent system. Currently, only <code>hangup</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hangup</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The name of the custom LLM function that maps to the agent\&quot;s built-in function. For details on the custom LLM protocol, see <a href="https://help.aliyun.com/document_detail/2839094.html">LLM Standard Interface</a>.</p>
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
         * <p>The text content of the message from this role.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the participant in the conversation. Valid values:</p>
         * <ul>
         * <li><p><code>user</code></p>
         * </li>
         * <li><p><code>assistant</code></p>
         * </li>
         * <li><p><code>system</code></p>
         * </li>
         * <li><p><code>function</code></p>
         * </li>
         * <li><p><code>plugin</code></p>
         * </li>
         * <li><p><code>tool</code></p>
         * </li>
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
         * <p>Parameters for Alibaba Cloud Model Studio, provided as a JSON string. For the parameter format, see
         * <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Parameters</a></p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;biz_params\&quot;:{\&quot;user_defined_params\&quot;:{\&quot;your_plugin_id\&quot;:{\&quot;article_index\&quot;:2}}},\&quot;memory_id\&quot;:\&quot;your_memory_id\&quot;,\&quot;image_list\&quot;:[\&quot;<a href="https://your_image_url%5C%5C%22%5D,%5C%5C%22rag_options%5C%5C%22:%7B%5C%5C%22pipeline_ids%5C%5C%22:%5B%5C%5C%22your_id%5C%5C%22%5D,%5C%5C%22file_ids%5C%5C%22:%5B%5C%5C%22%E6%96%87%E6%A1%A3ID1%5C%5C%22,%5C%5C%22%E6%96%87%E6%A1%A3ID2%5C%5C%22%5D,%5C%5C%22metadata_filter%5C%5C%22:%7B%5C%5C%22name%5C%5C%22:%5C%5C%22%E5%BC%A0%E4%B8%89%5C%5C%22%7D,%5C%5C%22structured_filter%5C%5C%22:%7B%5C%5C%22key1%5C%5C%22:%5C%5C%22value1%5C%5C%22,%5C%5C%22key2%5C%5C%22:%5C%5C%22value2%5C%5C%22%7D,%5C%5C%22tags%5C%5C%22:%5B%5C%5C%22%E6%A0%87%E7%AD%BE1%5C%5C%22,%5C%5C%22%E6%A0%87%E7%AD%BE2%5C%5C%22%5D%7D%7D">https://your_image_url\\&quot;],\\&quot;rag_options\\&quot;:{\\&quot;pipeline_ids\\&quot;:[\\&quot;your_id\\&quot;],\\&quot;file_ids\\&quot;:[\\&quot;文档ID1\\&quot;,\\&quot;文档ID2\\&quot;],\\&quot;metadata_filter\\&quot;:{\\&quot;name\\&quot;:\\&quot;张三\\&quot;},\\&quot;structured_filter\\&quot;:{\\&quot;key1\\&quot;:\\&quot;value1\\&quot;,\\&quot;key2\\&quot;:\\&quot;value2\\&quot;},\\&quot;tags\\&quot;:[\\&quot;标签1\\&quot;,\\&quot;标签2\\&quot;]}}</a>&quot;</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        /**
         * <p>Maps built-in agent functions to custom LLM functions. Currently, this only supports function calling for custom, OpenAI-compatible LLMs.</p>
         */
        @NameInMap("FunctionMap")
        public java.util.List<AIAgentConfigLlmConfigFunctionMap> functionMap;

        /**
         * <p>Specifies whether the LLM message history is synchronized with the content played by the TTS. Default: <code>false</code>. When enabled, the saved LLM messages match the content actually played by the TTS.</p>
         * <blockquote>
         * <p>When a user interrupts the agent, the <code>&lt;ims_agent_interrupted&gt;</code> tag is inserted into the message history at the point of interruption. This affects the next message sent to the LLM. For example:</p>
         * </blockquote>
         * <pre><code>[
         *   {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;Tell me a story.&quot;},
         *   {&quot;role&quot;: &quot;assistant&quot;, &quot;content&quot;: &quot;Okay, I can tell you a story about the Three Kingdoms. Would you&lt;ims_agent_interrupted&gt; like that?&quot;},
         *   {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;Tell me a different one.&quot;}
         * ]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HistorySyncWithTTS")
        public Boolean historySyncWithTTS;

        /**
         * <p>When set to <code>true</code>, the agent sends the entire LLM response in a single message after it is fully generated, rather than streaming it. This setting does not affect the streaming of subtitles.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LlmCompleteReply")
        public Boolean llmCompleteReply;

        /**
         * <p>The conversation history context for the LLM/MLLM.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentConfigLlmConfigLlmHistory> llmHistory;

        /**
         * <p>The maximum number of recent conversational turns to include in the LLM/MLLM context. Default: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        /**
         * <p>The system prompt for the LLM after the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一位友好且乐于助人的助手，专注于为用户提供准确的信息和建议。</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>Additional query parameters for an OpenAI-compatible LLM. Parameters must be provided as a URL query string (e.g., <code>key1=value1&amp;key2=value2</code>). All values must be strings.</p>
         * 
         * <strong>example:</strong>
         * <p>api-version=2024-02-01&amp;api-key=sk-xxx</p>
         */
        @NameInMap("OpenAIExtraQuery")
        public String openAIExtraQuery;

        /**
         * <p>The maximum delay in milliseconds before buffered text is sent to the TTS engine, even if <code>OutputMinLength</code> is not met. Range: 1000–10000. A value of <code>0</code> or omitting this parameter disables the delay limit. Default: Not set.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("OutputMaxDelay")
        public Integer outputMaxDelay;

        /**
         * <p>The minimum number of characters in a text chunk before it is sent to the TTS engine. Shorter chunks are buffered. Range: 0–100. A value of <code>0</code> or omitting this parameter disables buffering. Default: Not set.</p>
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
         * <p>The replacement pronunciation. It must be 1 to 9 Chinese characters long and cannot contain spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>幺幺零</p>
         */
        @NameInMap("Pronunciation")
        public String pronunciation;

        /**
         * <p>The type of pronunciation rule.
         * Valid value:</p>
         * <ul>
         * <li><code>replacement</code>: Replaces the specified <code>Word</code> with the <code>Pronunciation</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>replacement</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The word to be replaced. It must be 1 to 9 Chinese characters long and cannot contain spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>一一零</p>
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
         * <p>This parameter applies only to the Minimax provider. Supported emotions include:</p>
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
         * <p>This parameter is for the minimax provider only. It enhances recognition for specific low-resource languages and dialects. If the language is unknown, set this to <code>auto</code> for automatic detection. By default, this parameter is not set. Supported values include:</p>
         * <details>
         * 
         * <summary>
         * 
         * <p>Supported languages</p>
         * </summary>
         * 
         * <ul>
         * <li><p>Chinese</p>
         * </li>
         * <li><p>Chinese,Yue: Cantonese</p>
         * </li>
         * <li><p>English</p>
         * </li>
         * <li><p>Arabic</p>
         * </li>
         * <li><p>Russian</p>
         * </li>
         * <li><p>Spanish</p>
         * </li>
         * <li><p>French</p>
         * </li>
         * <li><p>Portuguese</p>
         * </li>
         * <li><p>German</p>
         * </li>
         * <li><p>Turkish</p>
         * </li>
         * <li><p>Dutch</p>
         * </li>
         * <li><p>Ukrainian</p>
         * </li>
         * <li><p>Vietnamese</p>
         * </li>
         * <li><p>Indonesian</p>
         * </li>
         * <li><p>Japanese</p>
         * </li>
         * <li><p>Italian</p>
         * </li>
         * <li><p>Korean</p>
         * </li>
         * <li><p>Thai</p>
         * </li>
         * <li><p>Polish</p>
         * </li>
         * <li><p>Romanian</p>
         * </li>
         * <li><p>Greek</p>
         * </li>
         * <li><p>Czech</p>
         * </li>
         * <li><p>Finnish</p>
         * </li>
         * <li><p>Hindi</p>
         * </li>
         * <li><p>auto</p>
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
         * <p>This parameter applies only to the Minimax provider. Valid values:
         * <code>speech-01-turbo</code>, <code>speech-02-turbo</code></p>
         * 
         * <strong>example:</strong>
         * <p>speech-01-turbo</p>
         */
        @NameInMap("ModelId")
        public String modelId;

        /**
         * <p>A list of TTS pronunciation rules, executed in order. You can specify a maximum of 20 rules.</p>
         */
        @NameInMap("PronunciationRules")
        public java.util.List<AIAgentConfigTtsConfigPronunciationRules> pronunciationRules;

        /**
         * <p>The speech rate, where a value of 1.0 is normal speed. The supported range can vary by provider. For CosyVoice, the range is 0.5 to 2.0 (default: 1.0). For Minimax, the range is 0.5 to 2.0 (default: 1.0).</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("SpeechRate")
        public Double speechRate;

        /**
         * <p>The ID of the preset TTS voice. Changes apply to the next utterance. If omitted, the voice from the AI agent template is used. The ID can be a maximum of 64 characters. For available voices, see <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent Voice Samples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>longcheng_v2</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>A list of available voices.</p>
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
        /**
         * <p>Controls the agent\&quot;s response speed after detecting a user pause. This parameter applies only in <code>Semantic</code> mode. A higher setting results in a faster response but increases the risk of interrupting the user:</p>
         * <ul>
         * <li><p><code>Low</code>: Waits patiently with a maximum wait time of 6 seconds, reducing the risk of interruption.</p>
         * </li>
         * <li><p><code>Medium</code>: A balanced wait time (up to 4 seconds), suitable for most scenarios.</p>
         * </li>
         * <li><p><code>High</code>: Responds quickly (up to 2 seconds), which improves speed but may increase the risk of incorrect turn-taking.</p>
         * </li>
         * </ul>
         * <p>This field is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Eagerness")
        public String eagerness;

        /**
         * <p>The conversational turn detection mode.</p>
         * <ul>
         * <li><p><code>Normal</code> (Default): The agent relies on pauses to detect the end of a user\&quot;s turn.</p>
         * </li>
         * <li><p><code>Semantic</code>: The agent uses AI to analyze conversational context to determine if the user has finished speaking.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Semantic</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The pause detection time in AI mode, in milliseconds. Default: -1.</p>
         * <ul>
         * <li><p>-1: The AI automatically determines a suitable wait time.</p>
         * </li>
         * <li><p>0–10000: A custom wait time. A range of 0–1500 ms is recommended.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter has no effect in <code>Normal</code> mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("SemanticWaitDuration")
        public Integer semanticWaitDuration;

        /**
         * <p>A list of keywords used to determine the end of a user\&quot;s conversational turn.</p>
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
         * <p>Specifies whether to enable device identification. Default: <code>false</code>.</p>
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
         * <p>Specifies whether to enable head motion detection. Default: <code>false</code>.</p>
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
         * <p>The duration in milliseconds that an invalid frame must persist before a notification is sent. If not specified, the setting from the console is used. Range: 200–5000.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("CallbackDelay")
        public Integer callbackDelay;

        /**
         * <p>Specifies whether to enable invalid frame detection.</p>
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
         * <p>Specifies whether to enable look-away detection. Default: <code>false</code>.</p>
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
         * <p>Specifies whether to enable people counting. Default: <code>false</code>.</p>
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
         * <p>The duration in milliseconds that a frame must remain still before a notification is sent. If not specified, the setting from the console is used. Range: 200–5000.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("CallbackDelay")
        public Integer callbackDelay;

        /**
         * <p>Specifies whether to enable still frame detection. Default: <code>false</code>.</p>
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
         * <p>Configuration for invalid frame detection.</p>
         */
        @NameInMap("InvalidFrameMotion")
        public AIAgentConfigVcrConfigInvalidFrameMotion invalidFrameMotion;

        /**
         * <p>Configuration for look-away detection.</p>
         */
        @NameInMap("LookAway")
        public AIAgentConfigVcrConfigLookAway lookAway;

        /**
         * <p>Configuration for the people counting feature.</p>
         */
        @NameInMap("PeopleCount")
        public AIAgentConfigVcrConfigPeopleCount peopleCount;

        /**
         * <p>Configuration for still frame detection.</p>
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
        /**
         * <p>The voiceprint registration mode. Default: <code>Explicit</code>.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Value</th>
         * <th>Description</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td><code>Explicit</code></td>
         * <td>In <code>Explicit</code> mode, the user must register their voiceprint in advance by using the voiceprint registration API.</td>
         * </tr>
         * <tr>
         * <td><code>Implicit</code></td>
         * <td>In <code>Implicit</code> mode, the system automatically collects user speech during the conversation to register a voiceprint.</td>
         * </tr>
         * </tbody></table>
         * 
         * <strong>example:</strong>
         * <p>Explicit</p>
         */
        @NameInMap("RegistrationMode")
        public String registrationMode;

        /**
         * <p>Specifies whether to enable voiceprint recognition. Default: <code>false</code>. If set to <code>true</code>, you must also provide a valid <code>VoiceprintId</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The unique identifier for the voiceprint. This is not set by default. The ID must correspond to a voiceprint registered using the voiceprint registration API. For more information, see <a href="https://help.aliyun.com/document_detail/2964738.html">Register a voiceprint</a>.</p>
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
