// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentTemplateConfig extends TeaModel {
    /**
     * <p>The 3D digital human parameters.</p>
     */
    @NameInMap("AvatarChat3D")
    public AIAgentTemplateConfigAvatarChat3D avatarChat3D;

    /**
     * <p>The visual agent parameters.</p>
     */
    @NameInMap("VisionChat")
    public AIAgentTemplateConfigVisionChat visionChat;

    /**
     * <p>The voice call parameters.</p>
     */
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
         * <li><p>user: User</p>
         * </li>
         * <li><p>assistant: Assistant</p>
         * </li>
         * <li><p>system: System</p>
         * </li>
         * <li><p>function: Function</p>
         * </li>
         * <li><p>plugin: Plug-in</p>
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
        /**
         * <p>The list of hotwords for ASR. The hotword list supports a maximum of 128 words.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for automatic speech recognition (ASR). Valid values:</p>
         * <ul>
         * <li>zh_mandarin: Chinese</li>
         * <li>en: English</li>
         * <li>zh_en: Chinese and English mixed</li>
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
         * <p>The threshold for speech segmentation detection. Silence exceeding this threshold is treated as a sentence break. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>The ID of the digital human model.</p>
         * 
         * <strong>example:</strong>
         * <p>1231</p>
         */
        @NameInMap("AvatarId")
        public String avatarId;

        /**
         * <p>The parameters for Alibaba Cloud Model Studio Application Center. For the parameter format, refer to <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Application Center parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("CharBreak")
        public Boolean charBreak;

        /**
         * <p>Specifies whether to enable intelligent segmentation. After this feature is enabled, sentence breaks in user speech are intelligently merged into a single sentence. Default value: true.</p>
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
         * <p>Specifies whether to support voice interruption. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>Specifies whether to enable graceful shutdown. Default value: false.</p>
         * <ul>
         * <li>Graceful shutdown: When the agent is stopped, it finishes broadcasting the current speech before stopping, with a maximum broadcast duration of 10 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        /**
         * <p>The greeting message, which takes effect when joining the session. If not specified, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Good morning, my friend!</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <p>The list of specific words or phrases that trigger conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigAvatarChat3DLlmHistory> llmHistory;

        /**
         * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
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
         * <p>You are a friendly and helpful assistant, focused on providing users with accurate information and advice.</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The maximum waiting time without interaction with the agent. The agent goes offline upon timeout. Unit: seconds. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        /**
         * <p>Specifies whether to enable voiceprint recognition. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The timeout period for the agent to close the task after the user leaves the session. Unit: seconds. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        /**
         * <p>The timeout period for the agent to close the task if the user does not join the session. Unit: seconds. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        /**
         * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
         * <ul>
         * <li>0: Disables the voice activity detection (VAD) feature.</li>
         * <li>1 to 10: A higher value indicates that it is more difficult to interrupt.</li>
         * <li>11: Significantly different from previous values, with lower pre-processing speech damage and stronger anti-interference.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VadLevel")
        public Integer vadLevel;

        /**
         * <p>The ID of the voice, which takes effect in the next sentence. If not specified, the voice ID configured in the agent template is used. This parameter applies only to preset text-to-speech (TTS). Maximum length: 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>The list of available voices.</p>
         */
        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        /**
         * <p>The unique identity ID for voiceprint recognition. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>uniqueId</p>
         */
        @NameInMap("VoiceprintId")
        public String voiceprintId;

        /**
         * <p>The volume of the agent\&quot;s speech.</p>
         * <ul>
         * <li><p>If not specified: The adaptive volume mode recommended by Alibaba Cloud is used by default.</p>
         * </li>
         * <li><p>If specified: Valid values are 0 to 400. Output volume = Speech output volume in the workflow × volume / 100. Examples:</p>
         * </li>
         * </ul>
         * <ol>
         * <li><p>If volume is set to 0, the output volume is 0.</p>
         * </li>
         * <li><p>If volume is set to 100, the volume is the original volume.</p>
         * </li>
         * <li><p>If volume is set to 200, the volume is twice the original volume.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public Long volume;

        /**
         * <p>The user\&quot;s instruction before the call starts, which is used for the agent to respond immediately after the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>How’s the weather today?</p>
         */
        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        /**
         * <p>The override parameters for the workflow. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("WorkflowOverrideParams")
        public String workflowOverrideParams;

        public static AIAgentTemplateConfigAvatarChat3D build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigAvatarChat3D self = new AIAgentTemplateConfigAvatarChat3D();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigAvatarChat3D setAsrHotWords(java.util.List<String> asrHotWords) {
            this.asrHotWords = asrHotWords;
            return this;
        }
        public java.util.List<String> getAsrHotWords() {
            return this.asrHotWords;
        }

        public AIAgentTemplateConfigAvatarChat3D setAsrLanguageId(String asrLanguageId) {
            this.asrLanguageId = asrLanguageId;
            return this;
        }
        public String getAsrLanguageId() {
            return this.asrLanguageId;
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

        public AIAgentTemplateConfigAvatarChat3D setCharBreak(Boolean charBreak) {
            this.charBreak = charBreak;
            return this;
        }
        public Boolean getCharBreak() {
            return this.charBreak;
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

        public AIAgentTemplateConfigAvatarChat3D setInterruptWords(java.util.List<String> interruptWords) {
            this.interruptWords = interruptWords;
            return this;
        }
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
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

        public AIAgentTemplateConfigAvatarChat3D setLlmSystemPrompt(String llmSystemPrompt) {
            this.llmSystemPrompt = llmSystemPrompt;
            return this;
        }
        public String getLlmSystemPrompt() {
            return this.llmSystemPrompt;
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

        public AIAgentTemplateConfigAvatarChat3D setVadLevel(Integer vadLevel) {
            this.vadLevel = vadLevel;
            return this;
        }
        public Integer getVadLevel() {
            return this.vadLevel;
        }

        public AIAgentTemplateConfigAvatarChat3D setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigAvatarChat3D setVoiceIdList(java.util.List<String> voiceIdList) {
            this.voiceIdList = voiceIdList;
            return this;
        }
        public java.util.List<String> getVoiceIdList() {
            return this.voiceIdList;
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
         * <li><p>user: User</p>
         * </li>
         * <li><p>assistant: Assistant</p>
         * </li>
         * <li><p>system: System</p>
         * </li>
         * <li><p>function: Function</p>
         * </li>
         * <li><p>plugin: Plug-in</p>
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
        /**
         * <p>The list of hotwords for ASR. The hotword list supports a maximum of 128 words.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for automatic speech recognition (ASR). Valid values:</p>
         * <ul>
         * <li>zh_mandarin: Chinese</li>
         * <li>en: English</li>
         * <li>zh_en: Chinese and English mixed</li>
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
         * <p>The threshold for speech segmentation detection. Silence exceeding this threshold is treated as a sentence break. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>The parameters for Alibaba Cloud Model Studio Application Center. For the parameter format, refer to <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Application Center parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("CharBreak")
        public Boolean charBreak;

        /**
         * <p>Specifies whether to enable intelligent segmentation. After this feature is enabled, sentence breaks in user speech are intelligently merged into a single sentence. Default value: true.</p>
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
         * <p>Specifies whether to support voice interruption. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>Specifies whether to enable graceful shutdown. Default value: false.</p>
         * <p>Graceful shutdown: When the agent is stopped, it finishes broadcasting the current speech before stopping, with a maximum broadcast duration of 10 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        /**
         * <p>The greeting message, which takes effect when joining the session. If not specified, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Good morning, my friend!</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <p>The list of specific words or phrases that trigger conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigVisionChatLlmHistory> llmHistory;

        /**
         * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
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
         * <p>You are a friendly and helpful assistant, focused on providing users with accurate information and advice.</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The maximum waiting time without interaction with the agent. The agent goes offline upon timeout. Unit: seconds. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        /**
         * <p>Specifies whether to enable voiceprint recognition. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The timeout period for the agent to close the task after the user leaves the session. Unit: seconds. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        /**
         * <p>The timeout period for the agent to close the task if the user does not join the session. Unit: seconds. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        /**
         * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
         * <ul>
         * <li>0: Disables the voice activity detection (VAD) feature.</li>
         * <li>1 to 10: A higher value indicates that it is more difficult to interrupt.</li>
         * <li>11: Significantly different from previous values, with lower pre-processing speech damage and stronger anti-interference.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VadLevel")
        public Integer vadLevel;

        /**
         * <p>The ID of the voice, which takes effect in the next sentence. If not specified, the voice ID configured in the agent template is used. This parameter applies only to preset text-to-speech (TTS). Maximum length: 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>The list of available voices.</p>
         */
        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        /**
         * <p>The unique identity ID for voiceprint recognition. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>uniqueId</p>
         */
        @NameInMap("VoiceprintId")
        public String voiceprintId;

        /**
         * <p>The volume of the agent\&quot;s speech.</p>
         * <p>If not specified: The adaptive volume mode recommended by Alibaba Cloud is used by default.</p>
         * <p>If specified: Valid values are 0 to 400. Output volume = Speech output volume in the workflow × volume / 100. Examples:</p>
         * <p>If volume is set to 0, the output volume is 0.</p>
         * <p>If volume is set to 100, the volume is the original volume.</p>
         * <p>If volume is set to 200, the volume is twice the original volume.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public Long volume;

        /**
         * <p>The user\&quot;s instruction before the call starts, which is used for the agent to respond immediately after the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>How’s the weather today?</p>
         */
        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        /**
         * <p>The override parameters for the workflow. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("WorkflowOverrideParams")
        public String workflowOverrideParams;

        public static AIAgentTemplateConfigVisionChat build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigVisionChat self = new AIAgentTemplateConfigVisionChat();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigVisionChat setAsrHotWords(java.util.List<String> asrHotWords) {
            this.asrHotWords = asrHotWords;
            return this;
        }
        public java.util.List<String> getAsrHotWords() {
            return this.asrHotWords;
        }

        public AIAgentTemplateConfigVisionChat setAsrLanguageId(String asrLanguageId) {
            this.asrLanguageId = asrLanguageId;
            return this;
        }
        public String getAsrLanguageId() {
            return this.asrLanguageId;
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

        public AIAgentTemplateConfigVisionChat setCharBreak(Boolean charBreak) {
            this.charBreak = charBreak;
            return this;
        }
        public Boolean getCharBreak() {
            return this.charBreak;
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

        public AIAgentTemplateConfigVisionChat setInterruptWords(java.util.List<String> interruptWords) {
            this.interruptWords = interruptWords;
            return this;
        }
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
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

        public AIAgentTemplateConfigVisionChat setLlmSystemPrompt(String llmSystemPrompt) {
            this.llmSystemPrompt = llmSystemPrompt;
            return this;
        }
        public String getLlmSystemPrompt() {
            return this.llmSystemPrompt;
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

        public AIAgentTemplateConfigVisionChat setVadLevel(Integer vadLevel) {
            this.vadLevel = vadLevel;
            return this;
        }
        public Integer getVadLevel() {
            return this.vadLevel;
        }

        public AIAgentTemplateConfigVisionChat setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigVisionChat setVoiceIdList(java.util.List<String> voiceIdList) {
            this.voiceIdList = voiceIdList;
            return this;
        }
        public java.util.List<String> getVoiceIdList() {
            return this.voiceIdList;
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
         * <li><p>user: user</p>
         * </li>
         * <li><p>assistant: assistant</p>
         * </li>
         * <li><p>system: system</p>
         * </li>
         * <li><p>function: function</p>
         * </li>
         * <li><p>plugin: plug-in</p>
         * </li>
         * <li><p>tool: tool</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
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
        /**
         * <p>The list of hotwords for ASR. The hotword list supports a maximum of 128 words.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for automatic speech recognition (ASR). Valid values:</p>
         * <ul>
         * <li>zh_mandarin: Chinese</li>
         * <li>en: English</li>
         * <li>zh_en: Chinese and English mixed</li>
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
         * <p>The threshold for speech segmentation detection. Silence exceeding this threshold is treated as a sentence break. Valid values: 200 to 1200. Unit: milliseconds. Default value: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>The URL of the agent avatar for voice calls. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/a.jpg">http://example.com/a.jpg</a></p>
         */
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        /**
         * <p>The type of the agent avatar URL. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("AvatarUrlType")
        public String avatarUrlType;

        /**
         * <p>The parameters for Alibaba Cloud Model Studio Application Center. For the parameter format, refer to <a href="https://help.aliyun.com/document_detail/2858132.html">Alibaba Cloud Model Studio Application Center parameters</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("CharBreak")
        public Boolean charBreak;

        /**
         * <p>Specifies whether to enable intelligent segmentation. After this feature is enabled, sentence breaks in user speech are intelligently merged into a single sentence. Default value: true.</p>
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
         * <p>Specifies whether to support voice interruption. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>Specifies whether to enable graceful shutdown. Default value: false.</p>
         * <ul>
         * <li>Graceful shutdown: When the agent is stopped, it finishes broadcasting the current speech before stopping, with a maximum broadcast duration of 10 seconds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        /**
         * <p>The greeting message, which takes effect when joining the session. If not specified, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Good morning, my friend</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <p>The list of specific words or phrases that trigger conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>The historical conversation context of the LLM or MLLM.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigVoiceChatLlmHistory> llmHistory;

        /**
         * <p>The maximum number of retained turns for the LLM or MLLM historical conversation context. Default value: 10.</p>
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
         * <p>You are a friendly and helpful assistant, focused on providing users with accurate information and advice.</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The maximum waiting time without interaction with the agent. The agent goes offline upon timeout. Unit: seconds. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        /**
         * <p>Specifies whether to enable voiceprint recognition. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The timeout period for the agent to close the task after the user leaves the session. Unit: seconds. Default value: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        /**
         * <p>The timeout period for the agent to close the task if the user does not join the session. Unit: seconds. Default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        /**
         * <p>The interruption threshold parameter. Valid values: 0 to 11. Default value: 11.</p>
         * <ul>
         * <li>0: Disables the voice activity detection (VAD) feature.</li>
         * <li>1 to 10: A higher value indicates that it is more difficult to interrupt.</li>
         * <li>11: Significantly different from previous values, with lower pre-processing speech damage and stronger anti-interference.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("VadLevel")
        public Integer vadLevel;

        /**
         * <p>The ID of the voice, which takes effect in the next sentence. If not specified, the voice ID configured in the agent template is used. This parameter applies only to preset text-to-speech (TTS). Maximum length: 64 characters. For valid values, refer to <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent speech effect examples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>The list of available voices.</p>
         */
        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        /**
         * <p>The unique identity ID for voiceprint recognition. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>uniqueId</p>
         */
        @NameInMap("VoiceprintId")
        public String voiceprintId;

        /**
         * <p>The volume of the agent\&quot;s speech.</p>
         * <ul>
         * <li><p>If not specified: The adaptive volume mode recommended by Alibaba Cloud is used by default.</p>
         * </li>
         * <li><p>If specified: Valid values are 0 to 400. Output volume = Speech output volume in the workflow × volume / 100. Examples:</p>
         * </li>
         * </ul>
         * <ol>
         * <li><p>If volume is set to 0, the output volume is 0.</p>
         * </li>
         * <li><p>If volume is set to 100, the volume is the original volume.</p>
         * </li>
         * <li><p>If volume is set to 200, the volume is twice the original volume.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public Long volume;

        /**
         * <p>The user\&quot;s instruction before the call starts, which is used for the agent to respond immediately after the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>How’s the weather today?</p>
         */
        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        /**
         * <p>The override parameters for the workflow. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("WorkflowOverrideParams")
        public String workflowOverrideParams;

        public static AIAgentTemplateConfigVoiceChat build(java.util.Map<String, ?> map) throws Exception {
            AIAgentTemplateConfigVoiceChat self = new AIAgentTemplateConfigVoiceChat();
            return TeaModel.build(map, self);
        }

        public AIAgentTemplateConfigVoiceChat setAsrHotWords(java.util.List<String> asrHotWords) {
            this.asrHotWords = asrHotWords;
            return this;
        }
        public java.util.List<String> getAsrHotWords() {
            return this.asrHotWords;
        }

        public AIAgentTemplateConfigVoiceChat setAsrLanguageId(String asrLanguageId) {
            this.asrLanguageId = asrLanguageId;
            return this;
        }
        public String getAsrLanguageId() {
            return this.asrLanguageId;
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

        public AIAgentTemplateConfigVoiceChat setCharBreak(Boolean charBreak) {
            this.charBreak = charBreak;
            return this;
        }
        public Boolean getCharBreak() {
            return this.charBreak;
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

        public AIAgentTemplateConfigVoiceChat setInterruptWords(java.util.List<String> interruptWords) {
            this.interruptWords = interruptWords;
            return this;
        }
        public java.util.List<String> getInterruptWords() {
            return this.interruptWords;
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

        public AIAgentTemplateConfigVoiceChat setLlmSystemPrompt(String llmSystemPrompt) {
            this.llmSystemPrompt = llmSystemPrompt;
            return this;
        }
        public String getLlmSystemPrompt() {
            return this.llmSystemPrompt;
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

        public AIAgentTemplateConfigVoiceChat setVadLevel(Integer vadLevel) {
            this.vadLevel = vadLevel;
            return this;
        }
        public Integer getVadLevel() {
            return this.vadLevel;
        }

        public AIAgentTemplateConfigVoiceChat setVoiceId(String voiceId) {
            this.voiceId = voiceId;
            return this;
        }
        public String getVoiceId() {
            return this.voiceId;
        }

        public AIAgentTemplateConfigVoiceChat setVoiceIdList(java.util.List<String> voiceIdList) {
            this.voiceIdList = voiceIdList;
            return this;
        }
        public java.util.List<String> getVoiceIdList() {
            return this.voiceIdList;
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
