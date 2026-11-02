// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentConfig extends TeaModel {
    /**
     * <p>The call ambient sound configuration.</p>
     */
    @NameInMap("AmbientSoundConfig")
    public AIAgentConfigAmbientSoundConfig ambientSoundConfig;

    /**
     * <p>The speech recognition configuration.</p>
     */
    @NameInMap("AsrConfig")
    public AIAgentConfigAsrConfig asrConfig;

    /**
     * <p>The automatic speech configuration module for the agent, which includes prompts for LLM response delays and inquiries during prolonged user silence.</p>
     */
    @NameInMap("AutoSpeechConfig")
    public AIAgentConfigAutoSpeechConfig autoSpeechConfig;

    /**
     * <p>The digital human configuration. This configuration takes effect only when the workflow includes a digital human node.</p>
     */
    @NameInMap("AvatarConfig")
    public AIAgentConfigAvatarConfig avatarConfig;

    /**
     * <p>The URL of the agent avatar for voice calls. Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/a.jpg">http://example.com/a.jpg</a></p>
     */
    @NameInMap("AvatarUrl")
    public String avatarUrl;

    /**
     * <p>The URL type of the agent avatar. Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("AvatarUrlType")
    public String avatarUrlType;

    /**
     * <p><strong>[Deprecated]</strong> Use BackChannelingConfigs instead.</p>
     */
    @NameInMap("BackChannelingConfig")
    @Deprecated
    public java.util.List<AIAgentConfigBackChannelingConfig> backChannelingConfig;

    /**
     * <p>The backchanneling feature configuration module. After this feature is enabled, the system randomly broadcasts short backchanneling phrases at specific trigger stages.</p>
     */
    @NameInMap("BackChannelingConfigs")
    public java.util.List<AIAgentConfigBackChannelingConfigs> backChannelingConfigs;

    /**
     * <p>Specifies whether to enable intelligent segmentation. After intelligent segmentation is enabled, segmented speech from the user is intelligently merged into a single sentence. Default value: true.</p>
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
     * <p>The experimental feature parameters. Contact technical support if you have any requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("ExperimentalConfig")
    public String experimentalConfig;

    /**
     * <p>Specifies whether to enable graceful shutdown. Default value: false.
     * Graceful shutdown: When the agent is stopped, it finishes broadcasting the current speech before shutting down. The maximum broadcast duration is 10 seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("GracefulShutdown")
    public Boolean gracefulShutdown;

    /**
     * <p>The greeting. Modifications take effect the next time the user joins the call. Default value: none.</p>
     * 
     * <strong>example:</strong>
     * <p>hello</p>
     */
    @NameInMap("Greeting")
    public String greeting;

    /**
     * <p>The speech interruption policy configuration.</p>
     */
    @NameInMap("InterruptConfig")
    public AIAgentConfigInterruptConfig interruptConfig;

    /**
     * <p>The large language model (LLM) configuration.</p>
     */
    @NameInMap("LlmConfig")
    public AIAgentConfigLlmConfig llmConfig;

    /**
     * <p>The maximum wait time without interaction with the agent. If this time is exceeded, the agent goes offline. Unit: seconds. Default value: 600.</p>
     * 
     * <strong>example:</strong>
     * <p>600</p>
     */
    @NameInMap("MaxIdleTime")
    public Integer maxIdleTime;

    /**
     * <p>The configuration for Real-Time Communication (RTC) call transfer. When you call ForwardAIAgentCall to transfer an RTC call (CallMode=0) to a regular phone, use this configuration to specify the line and the caller number.
     * Transfer is available only if CallerNumber is configured. If it is not configured, a 400 error is returned when you call the transfer API operation.
     * This configuration is read only once when the instance starts. Modifications during a call do not take effect.
     * This configuration does not apply to inbound and outbound call transfers. Use InboundCallConfig and OutboundCallConfig instead.</p>
     */
    @NameInMap("TransferCallConfig")
    public AIAgentConfigTransferCallConfig transferCallConfig;

    /**
     * <p>The speech synthesis configuration.</p>
     */
    @NameInMap("TtsConfig")
    public AIAgentConfigTtsConfig ttsConfig;

    /**
     * <p>The turn detection configuration.</p>
     */
    @NameInMap("TurnDetectionConfig")
    public AIAgentConfigTurnDetectionConfig turnDetectionConfig;

    /**
     * <p>The timeout period for the agent to close the task after the user leaves the meeting. Unit: seconds. Default value: 5.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("UserOfflineTimeout")
    public Integer userOfflineTimeout;

    /**
     * <p>The timeout period for the agent to close the task if the user does not join the meeting. Unit: seconds. Default value: 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("UserOnlineTimeout")
    public Integer userOnlineTimeout;

    /**
     * <p>The configuration for the video content recognition feature. This feature supports calling back the content recognized by the algorithm in the video to the client.</p>
     */
    @NameInMap("VcrConfig")
    public AIAgentConfigVcrConfig vcrConfig;

    /**
     * <p>The voiceprint configuration.</p>
     */
    @NameInMap("VoiceprintConfig")
    public AIAgentConfigVoiceprintConfig voiceprintConfig;

    /**
     * <p>The volume of the agent\&quot;s voice.</p>
     * <ul>
     * <li>If you do not specify this parameter, the adaptive volume mode recommended by Alibaba Cloud is used by default.</li>
     * <li>If you specify this parameter, the valid values range from 0 to 400. Output volume = Voice output volume in the workflow × volume / 100. Examples:</li>
     * </ul>
     * <ol>
     * <li>If volume is set to 0, the output volume is 0.</li>
     * <li>If volume is set to 100, the output volume is the original volume.</li>
     * <li>If volume is set to 200, the output volume is twice the original volume.</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Volume")
    public Long volume;

    /**
     * <p>The user\&quot;s instruction before the call starts. The agent responds to this sentence immediately after the call starts.</p>
     * 
     * <strong>example:</strong>
     * <p>How’s the weather today?</p>
     */
    @NameInMap("WakeUpQuery")
    public String wakeUpQuery;

    /**
     * <p>The workflow override parameters. Default value: none.</p>
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

    public AIAgentConfig setTransferCallConfig(AIAgentConfigTransferCallConfig transferCallConfig) {
        this.transferCallConfig = transferCallConfig;
        return this;
    }
    public AIAgentConfigTransferCallConfig getTransferCallConfig() {
        return this.transferCallConfig;
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
         * <p>The ID of the call ambient sound. You can obtain the ID from the advanced settings of the agent configuration in the console.</p>
         * 
         * <strong>example:</strong>
         * <p>f67901c595834************</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The volume of the call background sound. Valid values: 0 to 100. A value of 0 indicates that the background sound is disabled.</p>
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
         * <p>The ASR context enhancement.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;input_text&quot;,&quot;text&quot;:&quot;Alibaba Cloud, Qwen, Qwen-Audio&quot;}]},{&quot;role&quot;:&quot;assistant&quot;,&quot;content&quot;:[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Okay, I will incorporate these terms into our conversation.&quot;}]}]</p>
         */
        @NameInMap("AsrContext")
        public String asrContext;

        /**
         * <p>The ASR hotword list. The list supports a maximum of 128 hotwords.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The ASR language ID. Valid values:</p>
         * <ul>
         * <li>zh_mandarin: Chinese.</li>
         * <li>en: English.</li>
         * <li>zh_en: Mixed Chinese and English.</li>
         * <li>es: Spanish.</li>
         * <li>jp: Japanese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_mandarin</p>
         */
        @NameInMap("AsrLanguageId")
        public String asrLanguageId;

        /**
         * <p>The threshold for speech segmentation detection. If the silence duration exceeds this threshold, the speech is considered segmented. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>The instance-level real-time hotwords and their weights for ASR.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Qwen&quot;:4,&quot;Qwen-Audio&quot;:5,&quot;Alibaba Cloud Speech Lab&quot;:50}</p>
         */
        @NameInMap("AsrVocabulary")
        public String asrVocabulary;

        /**
         * <p>The pass-through parameters for custom ASR integration.</p>
         * 
         * <strong>example:</strong>
         * <p>mode=fast&amp;sample=16000&amp;format=wav</p>
         */
        @NameInMap("CustomParams")
        public String customParams;

        /**
         * <p>The minimum duration threshold for voice activity detection (VAD), which is used to control the sensitivity of interruptions. A value of 0 indicates that this feature is disabled. Valid values: 200 to 2000. Unit: milliseconds. Common values range from 200 to 500, which correspond to 1 to 4 words. Default value: null. If this parameter is left empty, this feature does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("VadDuration")
        public Integer vadDuration;

        /**
         * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
         * <ul>
         * <li>0: Disables the VAD feature.</li>
         * <li>1 to 10: A larger value indicates that it is more difficult to trigger an interruption.</li>
         * <li>11: Significantly different from previous values. It causes less damage to the pre-processed conversation audio and provides stronger anti-interference capability.</li>
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

        public AIAgentConfigAsrConfig setAsrContext(String asrContext) {
            this.asrContext = asrContext;
            return this;
        }
        public String getAsrContext() {
            return this.asrContext;
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

        public AIAgentConfigAsrConfig setAsrVocabulary(String asrVocabulary) {
            this.asrVocabulary = asrVocabulary;
            return this;
        }
        public String getAsrVocabulary() {
            return this.asrVocabulary;
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
         * <p>The selection probability of the prompt. Valid values: 0 to 1, which correspond to 0% to 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the inquiry prompt. Maximum length: 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Just a moment</p>
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
         * <p>The collection of inquiry prompts. A maximum of 10 prompts are supported. Each prompt can be up to 100 characters in length. The sum of probabilities must be 100%.</p>
         */
        @NameInMap("Messages")
        public java.util.List<AIAgentConfigAutoSpeechConfigLlmPendingMessages> messages;

        /**
         * <p>The mode for selecting the soothing prompt from LlmPending.Messages to broadcast while waiting for the agent to reply. Valid values:</p>
         * <ul>
         * <li>ai_select: The AI selects the most appropriate prompt from Messages based on the current conversation. This mode does not check whether the sum of Probability values is 1, but WaitTime cannot be less than 800 milliseconds. This is the default value.</li>
         * <li>probability: A prompt is randomly selected based on the Probability weight of each prompt. The sum of all Probability values must be exactly 1.0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ai_select</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The threshold for the waiting time for a response from the large language model (LLM). If the waiting time exceeds this threshold, a broadcast prompt is triggered. This parameter is required. Valid values: 500 to 10000. Unit: milliseconds. Set this parameter based on the actual usage of the LLM.</p>
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
         * <p>The selection probability of the prompt. Valid values: 0 to 1, which correspond to 0% to 100%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the inquiry prompt. Maximum length: 100 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Are you still there?</p>
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
         * <p>The hang-up closing remark. It is broadcast before the call is hung up after a prolonged period of user unresponsiveness. Maximum length: 200 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>I\&quot;m hanging up, bye</p>
         */
        @NameInMap("HangupEndWord")
        public String hangupEndWord;

        /**
         * <p>The maximum number of inquiries. Valid values: 0 to 10. This parameter is required. If the number of inquiries exceeds this value, no more inquiries are triggered and the call is directly closed.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>The collection of inquiry prompts. A maximum of 10 prompts are supported. Each prompt can be up to 100 characters in length. The sum of probabilities must be 100%.</p>
         */
        @NameInMap("Messages")
        public java.util.List<AIAgentConfigAutoSpeechConfigUserIdleMessages> messages;

        /**
         * <p>The silence duration threshold. This parameter is required. If the silence duration exceeds this threshold, an inquiry is triggered. Valid values: 5000 to 600000. Unit: milliseconds.</p>
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
         * <p>The broadcast configuration for LLM response delays.</p>
         */
        @NameInMap("LlmPending")
        public AIAgentConfigAutoSpeechConfigLlmPending llmPending;

        /**
         * <p>The broadcast configuration for inquiries during prolonged user silence.</p>
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
         * <p>The model ID of the digital human.</p>
         * 
         * <strong>example:</strong>
         * <p>5257</p>
         */
        @NameInMap("AvatarId")
        public String avatarId;

        /**
         * <p>The resolution of the digital human video stream. The value must be in strictly lowercase letters and must be specified together with AvatarId. Valid values:</p>
         * <ul>
         * <li>360p</li>
         * <li>480p</li>
         * <li>720p</li>
         * <li>1080p</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1080p</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The ID of the digital human template, which specifies the template used when the digital human is started. The template is provided by the digital human service provider, and the provider also verifies whether the specified value is valid.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-9527</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

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

        public AIAgentConfigAvatarConfig setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public AIAgentConfigAvatarConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class AIAgentConfigBackChannelingConfigWords extends TeaModel {
        /**
         * <p>The trigger probability of the phrase. Valid values: 0.0 to 1.0. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the phrase. Maximum length: 20 characters. Multiple languages are supported. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
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
         * <p>The trigger stage for backchanneling. Valid values:</p>
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
         * <p>The collection of backchanneling phrases. A maximum of 10 phrases are supported. Each phrase can be up to 20 characters in length. The sum of probabilities must be 1.0.</p>
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
         * <p>The trigger probability of the phrase. Valid values: 0.0 to 1.0. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("Probability")
        public Double probability;

        /**
         * <p>The text of the phrase. Maximum length: 20 characters. Multiple languages are supported. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
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
         * <p>The trigger stage for backchanneling. Valid values:</p>
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
         * <p>The collection of backchanneling phrases. A maximum of 10 phrases are supported. Each phrase can be up to 20 characters in length. The sum of probabilities must be 1.0.</p>
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
         * <p>Specifies whether to support speech interruption. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>The list of specific words or phrases that trigger conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>Specifies whether to retain interrupt words when sending messages to the LLM. By default, interrupt words are discarded.
         * For example, if the interrupt word is &quot;wait&quot;, the message &quot;wait how is the weather today&quot; is changed to &quot;how is the weather today&quot; after the interrupt word is discarded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("KeepInterruptWordsForLLM")
        public Boolean keepInterruptWordsForLLM;

        /**
         * <p>The ASR processing policy in No Interrupting mode. Valid values:</p>
         * <ul>
         * <li>cache: Caches the ASR text. After the current turn ends, the cached ASR text is processed together in the next turn.</li>
         * <li>discard: Directly discards the ASR text.
         * Default value: cache.</li>
         * </ul>
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
         * <p>The name of the built-in feature provided by the Alibaba Cloud agent system. Currently, only hangup is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hangup</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The name of the LLM function that corresponds to the feature. This name is customized by the user and is used to call the corresponding feature in the LLM. For more information about the user-defined LLM protocol, see <a href="https://help.aliyun.com/document_detail/2839094.html">Standard LLM API</a>.</p>
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
         * <p>The actual text of the conversation content, which records the specific expression or response of the role in the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the conversation participant. Valid values:</p>
         * <ul>
         * <li>user: User.</li>
         * <li>assistant: Assistant.</li>
         * <li>system: System.</li>
         * <li>function: Function.</li>
         * <li>plugin: Plugin.</li>
         * <li>tool: Tool.</li>
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
         * <p>The parameters for Alibaba Cloud Model Studio. The value must be a JSON string. For more information about the parameter format, see <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;biz_params\&quot;:{\&quot;user_defined_params\&quot;:{\&quot;your_plugin_id\&quot;:{\&quot;article_index\&quot;:2}}},\&quot;memory_id\&quot;:\&quot;your_memory_id\&quot;,\&quot;image_list\&quot;:[\&quot;<a href="https://your_image_url%5C%5C%22%5D,%5C%5C%22rag_options%5C%5C%22:%7B%5C%5C%22pipeline_ids%5C%5C%22:%5B%5C%5C%22your_id%5C%5C%22%5D,%5C%5C%22file_ids%5C%5C%22:%5B%5C%5C%22DocumentID1%5C%5C%22,%5C%5C%22DocumentID2%5C%5C%22%5D,%5C%5C%22metadata_filter%5C%5C%22:%7B%5C%5C%22name%5C%5C%22:%5C%5C%22ZhangSan%5C%5C%22%7D,%5C%5C%22structured_filter%5C%5C%22:%7B%5C%5C%22key1%5C%5C%22:%5C%5C%22value1%5C%5C%22,%5C%5C%22key2%5C%5C%22:%5C%5C%22value2%5C%5C%22%7D,%5C%5C%22tags%5C%5C%22:%5B%5C%5C%22Tag1%5C%5C%22,%5C%5C%22Tag2%5C%5C%22%5D%7D%7D">https://your_image_url\\&quot;],\\&quot;rag_options\\&quot;:{\\&quot;pipeline_ids\\&quot;:[\\&quot;your_id\\&quot;],\\&quot;file_ids\\&quot;:[\\&quot;DocumentID1\\&quot;,\\&quot;DocumentID2\\&quot;],\\&quot;metadata_filter\\&quot;:{\\&quot;name\\&quot;:\\&quot;ZhangSan\\&quot;},\\&quot;structured_filter\\&quot;:{\\&quot;key1\\&quot;:\\&quot;value1\\&quot;,\\&quot;key2\\&quot;:\\&quot;value2\\&quot;},\\&quot;tags\\&quot;:[\\&quot;Tag1\\&quot;,\\&quot;Tag2\\&quot;]}}</a>&quot;</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        /**
         * <p>The function mapping list, which is used to map agent capabilities to LLM functions. Currently, only function calling with user-defined LLMs that use the OpenAI protocol is supported.</p>
         */
        @NameInMap("FunctionMap")
        public java.util.List<AIAgentConfigLlmConfigFunctionMap> functionMap;

        /**
         * <p>Specifies whether to keep the LLM message history consistent with the text-to-speech (TTS) playback content. Default value: false. After this feature is enabled, the saved LLM messages are kept consistent with the TTS playback content.
         * When the user interrupts the agent in the LLM message history, the <code>&lt;ims_agent_interrupted&gt;</code> tag is inserted at the interruption position in the next message sent to the LLM. Example:</p>
         * <pre><code>[
         *   {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;Tell me a story.&quot;},
         *   {&quot;role&quot;: &quot;assistant&quot;, &quot;content&quot;: &quot;Okay, let me tell you a story about Romance of the Three Kingdoms. Do&lt;ims_agent_interrupted&gt; you want to listen?&quot;},
         *   {&quot;role&quot;: &quot;user&quot;, &quot;content&quot;: &quot;Tell me another one.&quot;}
         * ]
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HistorySyncWithTTS")
        public Boolean historySyncWithTTS;

        /**
         * <p>Specifies whether to send the complete LLM result to the client after the LLM generates the complete response. This switch does not affect the streaming generation of subtitles.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LlmCompleteReply")
        public Boolean llmCompleteReply;

        /**
         * <p>The historical conversation context of the LLM or multimodal LLM.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentConfigLlmConfigLlmHistory> llmHistory;

        /**
         * <p>The maximum number of retained turns for the historical conversation context of the LLM or multimodal LLM. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        /**
         * <p>The system prompt for the LLM after the call is started.</p>
         * 
         * <strong>example:</strong>
         * <p>You are the 1 friendly and helpful assistant, focused on providing accurate information and advice to users.</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The extra query parameters for the OpenAI-compatible LLM. Parameters must be in the key=value format. Multiple parameters are connected by an ampersand (&amp;). All values must be of the string type.</p>
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
        public Integer outputMaxDelay;

        /**
         * <p>The minimum length of text output in characters. Text shorter than this length is cached and concatenated. Valid values: 0 to 100. A value of 0 or empty indicates no limit. Default value: empty.</p>
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

    public static class AIAgentConfigTransferCallConfig extends TeaModel {
        /**
         * <p>The default transfer number. This is a backup number. You must still explicitly pass the called number when you initiate a transfer call.</p>
         * 
         * <strong>example:</strong>
         * <p>0571xxxxxxx</p>
         */
        @NameInMap("CalledNumber")
        public String calledNumber;

        /**
         * <p>The caller number used for transfer calls. Configuring this field enables the RTC transfer capability. If this field is not configured, the behavior remains unchanged.</p>
         * 
         * <strong>example:</strong>
         * <p>0571xxxxxxx</p>
         */
        @NameInMap("CallerNumber")
        public String callerNumber;

        /**
         * <p>Specifies whether to perform real-time speech recognition for both parties (the RTC user and the transferred phone party) after the transfer is connected. When enabled, the recognition results are pushed to the client as subtitles through the RTC message channel and written to the call record. Valid values:</p>
         * <ul>
         * <li>true: Enabled. This is the default value.</li>
         * <li>false: Disabled. Subtitles and call records are not generated during the transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ForwardTranscriptionEnabled")
        public Boolean forwardTranscriptionEnabled;

        /**
         * <p>The custom SIP outbound gateway address. This parameter is required only when Type is set to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>sip.example.com:5060</p>
         */
        @NameInMap("SipDomain")
        public String sipDomain;

        /**
         * <p>Valid values:</p>
         * <ul>
         * <li>0: Alibaba Cloud communication line. This is the default value.</li>
         * <li>1: Custom SIP line.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static AIAgentConfigTransferCallConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentConfigTransferCallConfig self = new AIAgentConfigTransferCallConfig();
            return TeaModel.build(map, self);
        }

        public AIAgentConfigTransferCallConfig setCalledNumber(String calledNumber) {
            this.calledNumber = calledNumber;
            return this;
        }
        public String getCalledNumber() {
            return this.calledNumber;
        }

        public AIAgentConfigTransferCallConfig setCallerNumber(String callerNumber) {
            this.callerNumber = callerNumber;
            return this;
        }
        public String getCallerNumber() {
            return this.callerNumber;
        }

        public AIAgentConfigTransferCallConfig setForwardTranscriptionEnabled(Boolean forwardTranscriptionEnabled) {
            this.forwardTranscriptionEnabled = forwardTranscriptionEnabled;
            return this;
        }
        public Boolean getForwardTranscriptionEnabled() {
            return this.forwardTranscriptionEnabled;
        }

        public AIAgentConfigTransferCallConfig setSipDomain(String sipDomain) {
            this.sipDomain = sipDomain;
            return this;
        }
        public String getSipDomain() {
            return this.sipDomain;
        }

        public AIAgentConfigTransferCallConfig setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class AIAgentConfigTtsConfigPronunciationRules extends TeaModel {
        /**
         * <p>The target pronunciation. The length must be less than 10 characters. It must consist of Chinese characters and cannot contain spaces.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        @NameInMap("Pronunciation")
        public String pronunciation;

        /**
         * <p>The specific pronunciation rule type. Valid values:</p>
         * <ul>
         * <li>replacement: A rule that directly replaces Word with Pronunciation.</li>
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
         * <p>110</p>
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
         * <p>The emotion of the voice. Currently, only MiniMax is supported. MiniMax supports the following seven emotions:</p>
         * <ul>
         * <li>happy: Happy</li>
         * <li>sad: Sad</li>
         * <li>angry: Angry</li>
         * <li>fearful: Fearful</li>
         * <li>disgusted: Disgusted</li>
         * <li>surprised: Surprised</li>
         * <li>calm: Calm</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>happy</p>
         */
        @NameInMap("Emotion")
        public String emotion;

        /**
         * <p>The TTS pronunciation correction and text replacement configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;pronunciation&quot;:[{&quot;weather&quot;:&quot;tian1 qi4&quot;}],&quot;replace&quot;:[{&quot;today&quot;:&quot;golden day&quot;}]}</p>
         */
        @NameInMap("HotFix")
        public String hotFix;

        /**
         * <p>The natural language instruction control for TTS.</p>
         * 
         * <strong>example:</strong>
         * <p>Please use a gentle and friendly female voice, and broadcast at a slightly slower speed</p>
         */
        @NameInMap("Instruction")
        public String instruction;

        /**
         * <p>The language ID. Currently, only MiniMax is supported. Default value: empty. This parameter enhances the recognition capability for specified minority languages and dialects. Setting this parameter improves the voice performance in the specified minority language or dialect scenarios. If the minority language type is not specified, you can set this parameter to auto, and the model automatically determines the language type. Valid values:</p>
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
         * <p>The model ID. Currently, only MiniMax is supported. Valid values:
         * speech-01-turbo and speech-02-turbo.</p>
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
        public java.util.List<AIAgentConfigTtsConfigPronunciationRules> pronunciationRules;

        /**
         * <p>The speech rate. This parameter is supported on all platforms.
         * For CosyVoice, the default value is 1.0, and the valid values range from 0.5 to 2.0.
         * For MiniMax, the default value is 1.0, and the valid values range from 0.5 to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("SpeechRate")
        public Double speechRate;

        /**
         * <p>The voice ID. Modifications take effect in the next sentence. If you do not specify this parameter, the voice ID configured in the agent template is used. This parameter takes effect only for preset TTS. The input length cannot exceed 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
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

        public AIAgentConfigTtsConfig setHotFix(String hotFix) {
            this.hotFix = hotFix;
            return this;
        }
        public String getHotFix() {
            return this.hotFix;
        }

        public AIAgentConfigTtsConfig setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
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
         * <p>The eagerness level. This parameter takes effect only in Semantic mode. It controls how quickly the AI starts to respond after detecting a pause:</p>
         * <ul>
         * <li>Low: Patient waiting. The maximum wait time is 6 seconds, which reduces the risk of being interrupted.</li>
         * <li>Medium: Balanced waiting. The maximum wait time is 4 seconds, which is suitable for most scenarios.</li>
         * <li>High: Fast response. The maximum wait time is 2 seconds, which improves speed but may increase the risk of false cut-offs.
         * Default value: empty.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Eagerness")
        public String eagerness;

        /**
         * <p>The turn detection mode. Valid values:</p>
         * <ul>
         * <li>Normal: Normal mode. AI is not used to determine semantics. This is the default value.</li>
         * <li>Semantic: Semantic mode. AI is used to determine whether the user has finished speaking based on the context semantics.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Semantic</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The pause determination time in AI mode. Unit: milliseconds. Default value: -1. Valid values:</p>
         * <ul>
         * <li>-1: The AI automatically determines the appropriate wait time.</li>
         * <li>0 to 10000: A custom wait time. We recommend that you set this value to 0 to 1500 milliseconds.<blockquote>
         * <p>This parameter is invalid in Normal mode.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>Specifies whether to enable the disabled equipment check. Default value: false.</p>
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
         * <p>Specifies whether to enable the head motion recognition check. Default value: false.</p>
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
         * <p>The delay for the invalid frame check notification. After this parameter is set, the notification is triggered after a static frame lasts for a specified period of time. Unit: milliseconds. Default value: empty. If this parameter is empty, the configuration in the console is used during the call. Valid values: 200 to 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("CallbackDelay")
        public Integer callbackDelay;

        /**
         * <p>Specifies whether to enable the invalid frame check.</p>
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
         * <p>Specifies whether to enable the look-away recognition configuration. Default value: false.</p>
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
         * <p>The switch for the people counting feature. Default value: false.</p>
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
         * <p>The delay for the still frame check notification. After this parameter is set, the notification is triggered after a still frame lasts for a specified period of time. Unit: milliseconds. Default value: empty. If this parameter is empty, the configuration in the console is used during the call. Valid values: 200 to 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("CallbackDelay")
        public Integer callbackDelay;

        /**
         * <p>Specifies whether to enable the still frame check. Default value: false.</p>
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
         * <p>The equipment recognition configuration.</p>
         */
        @NameInMap("Equipment")
        public AIAgentConfigVcrConfigEquipment equipment;

        /**
         * <p>The head motion recognition configuration.</p>
         */
        @NameInMap("HeadMotion")
        public AIAgentConfigVcrConfigHeadMotion headMotion;

        /**
         * <p>The parameter settings for the invalid frame check.</p>
         */
        @NameInMap("InvalidFrameMotion")
        public AIAgentConfigVcrConfigInvalidFrameMotion invalidFrameMotion;

        /**
         * <p>The look-away recognition configuration.</p>
         */
        @NameInMap("LookAway")
        public AIAgentConfigVcrConfigLookAway lookAway;

        /**
         * <p>The configuration for the people counting feature.</p>
         */
        @NameInMap("PeopleCount")
        public AIAgentConfigVcrConfigPeopleCount peopleCount;

        /**
         * <p>The configuration for the still frame detection.</p>
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
         * <p>The voiceprint registration mode. Default value: Explicit.</p>
         * <table>
         * <thead>
         * <tr>
         * <th>Value</th>
         * <th>Description</th>
         * </tr>
         * </thead>
         * <tbody><tr>
         * <td>Explicit</td>
         * <td>Explicit registration mode. Users must upload audio through the voiceprint registration API operation in advance to complete the registration.</td>
         * </tr>
         * <tr>
         * <td>Implicit</td>
         * <td>Implicit registration mode. The system automatically collects the user\&quot;s voice and generates voiceprint features during the conversation.</td>
         * </tr>
         * </tbody></table>
         * 
         * <strong>example:</strong>
         * <p>Explicit</p>
         */
        @NameInMap("RegistrationMode")
        public String registrationMode;

        /**
         * <p>Specifies whether to use voiceprint recognition. Default value: false. When voiceprint recognition is enabled, a valid voiceprint ID must be passed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The unique identity ID for voiceprint recognition. Default value: empty. The passed voiceprint ID must be registered through the voiceprint registration API operation. For more information about the API operation, refer to <a href="https://help.aliyun.com/document_detail/2964738.html">Register human voiceprint</a>.</p>
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
