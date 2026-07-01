// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentTemplateConfig extends TeaModel {
    /**
     * <p>3D avatar parameters.</p>
     */
    @NameInMap("AvatarChat3D")
    public AIAgentTemplateConfigAvatarChat3D avatarChat3D;

    /**
     * <p>Vision agent parameters.</p>
     */
    @NameInMap("VisionChat")
    public AIAgentTemplateConfigVisionChat visionChat;

    /**
     * <p>Voice chat parameters.</p>
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
         * <p>The text content of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the conversation participant. Valid values:</p>
         * <ul>
         * <li><p><code>user</code>: The user.</p>
         * </li>
         * <li><p><code>assistant</code>: The AI assistant.</p>
         * </li>
         * <li><p><code>system</code>: The system.</p>
         * </li>
         * <li><p><code>function</code>: A function call.</p>
         * </li>
         * <li><p><code>plugin</code>: A plugin.</p>
         * </li>
         * <li><p><code>tool</code>: A tool.</p>
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
         * <p>A list of hot words to improve ASR accuracy. A maximum of 128 words is supported.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for Automatic Speech Recognition (ASR). Possible values:</p>
         * <ul>
         * <li><p><code>zh_mandarin</code>: Chinese</p>
         * </li>
         * <li><p><code>en</code>: English</p>
         * </li>
         * <li><p><code>zh_en</code>: Chinese-English</p>
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
         * <p>The maximum duration of silence in milliseconds before a sentence break is detected. Range: 200 to 1,200. Default: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>The ID of the avatar model.</p>
         * 
         * <strong>example:</strong>
         * <p>1231</p>
         */
        @NameInMap("AvatarId")
        public String avatarId;

        /**
         * <p>Parameters for Alibaba Cloud Bailian. For details, see <a href="https://help.aliyun.com/document_detail/2858132.html">Bailian App Params</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("CharBreak")
        public Boolean charBreak;

        /**
         * <p>Specifies whether to enable intelligent segmentation. If enabled, this feature intelligently merges pauses in a user\&quot;s speech into a single, complete sentence. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIntelligentSegment")
        public Boolean enableIntelligentSegment;

        /**
         * <p>Specifies whether to enable Push-to-Talk mode. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnablePushToTalk")
        public Boolean enablePushToTalk;

        /**
         * <p>Specifies whether to enable voice interruption. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>Specifies whether to enable graceful shutdown. Default: <code>false</code>.</p>
         * <ul>
         * <li>If enabled, the agent finishes its current speech (up to 10 seconds) before stopping.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        /**
         * <p>The greeting message delivered when a user joins the session. If this parameter is omitted, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>早上好，我的朋友！</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <p>A list of specific words or phrases that trigger a conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>The LLM/MLLM conversation history.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigAvatarChat3DLlmHistory> llmHistory;

        /**
         * <p>The maximum number of conversation turns to retain in the LLM/MLLM history. Default: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        /**
         * <p>The system prompt for the LLM, applied when the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一位友好且乐于助人的助手，专注于为用户提供准确的信息和建议。</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The maximum idle time in seconds with no interaction before the agent goes offline. Default: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        /**
         * <p>Specifies whether to use voiceprint recognition. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The time in seconds that the agent waits after a user leaves before closing the task. Default: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        /**
         * <p>The time in seconds that the agent waits for a user to join before closing the task. Default: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        /**
         * <p>The interruption sensitivity threshold. A higher value makes it more difficult to interrupt the agent. Range: 0 to 11. Default: 11.</p>
         * <ul>
         * <li><p><code>0</code>: Disables VAD.</p>
         * </li>
         * <li><p><code>1</code> to <code>10</code>: A higher value makes it more difficult to interrupt the agent.</p>
         * </li>
         * <li><p><code>11</code>: Offers lower audio distortion and stronger resistance to interference.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VadLevel")
        public Integer vadLevel;

        /**
         * <p>The ID of the Text-to-Speech (TTS) voice. Changes take effect on the next utterance. If omitted, the default voice from the agent template is used. This parameter applies only to preset TTS voices. Maximum length: 64 characters. For available values, see <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent voice effect samples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>A list of available voices.</p>
         */
        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        /**
         * <p>The unique ID for voiceprint recognition. Default: not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>uniqueId</p>
         */
        @NameInMap("VoiceprintId")
        public String voiceprintId;

        /**
         * <p>The speaking volume of the agent.</p>
         * <ul>
         * <li><p>If omitted, the system uses adaptive volume mode.</p>
         * </li>
         * <li><p>If specified, the valid range is 0 to 400. The output volume is calculated as: <code>Output Volume in Workflow</code> \* (<code>volume</code>/100). For example:</p>
         * </li>
         * </ul>
         * <ol>
         * <li><p>If <code>volume</code> is <code>0</code>, the output is silent.</p>
         * </li>
         * <li><p>If <code>volume</code> is <code>100</code>, the output volume is the original volume.</p>
         * </li>
         * <li><p>If <code>volume</code> is <code>200</code>, the output volume is twice the original volume.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public Long volume;

        /**
         * <p>An initial user query that the agent addresses immediately when the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>今天天气怎么样？</p>
         */
        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        /**
         * <p>Workflow override parameters. Default: empty.</p>
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
         * <p>The text content of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the conversation participant. Valid values:</p>
         * <ul>
         * <li><p><code>user</code>: The user.</p>
         * </li>
         * <li><p><code>assistant</code>: The AI assistant.</p>
         * </li>
         * <li><p><code>system</code>: The system.</p>
         * </li>
         * <li><p><code>function</code>: A function call.</p>
         * </li>
         * <li><p><code>plugin</code>: A plugin.</p>
         * </li>
         * <li><p><code>tool</code>: A tool.</p>
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
         * <p>A list of hot words to improve ASR accuracy. A maximum of 128 words is supported.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for Automatic Speech Recognition (ASR). Possible values:</p>
         * <ul>
         * <li><p><code>zh_mandarin</code>: Chinese</p>
         * </li>
         * <li><p><code>en</code>: English</p>
         * </li>
         * <li><p><code>zh_en</code>: Chinese-English</p>
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
         * <p>The maximum duration of silence in milliseconds before a sentence break is detected. Range: 200 to 1,200. Default: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>Parameters for Alibaba Cloud Bailian. For details, see <a href="https://help.aliyun.com/document_detail/2858132.html">Bailian App Params</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("CharBreak")
        public Boolean charBreak;

        /**
         * <p>Specifies whether to enable intelligent segmentation. If enabled, this feature intelligently merges pauses in a user\&quot;s speech into a single, complete sentence. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIntelligentSegment")
        public Boolean enableIntelligentSegment;

        /**
         * <p>Specifies whether to enable Push-to-Talk mode. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnablePushToTalk")
        public Boolean enablePushToTalk;

        /**
         * <p>Specifies whether to enable voice interruption. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>Specifies whether to enable graceful shutdown. Default: <code>false</code>.</p>
         * <ul>
         * <li>If enabled, the agent finishes its current speech (up to 10 seconds) before stopping.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        /**
         * <p>The greeting message delivered when a user joins the session. If this parameter is omitted, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>早上好，我的朋友！</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <p>A list of specific words or phrases that trigger a conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>The LLM/MLLM conversation history.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigVisionChatLlmHistory> llmHistory;

        /**
         * <p>The maximum number of conversation turns to retain in the LLM/MLLM history. Default: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        /**
         * <p>The system prompt for the LLM, applied when the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一位友好且乐于助人的助手，专注于为用户提供准确的信息和建议。</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The maximum idle time in seconds with no interaction before the agent goes offline. Default: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        /**
         * <p>Specifies whether to use voiceprint recognition. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The time in seconds that the agent waits after a user leaves before closing the task. Default: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        /**
         * <p>The time in seconds that the agent waits for a user to join before closing the task. Default: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        /**
         * <p>The interruption sensitivity threshold. A higher value makes it more difficult to interrupt the agent. Range: 0 to 11. Default: 11.</p>
         * <ul>
         * <li><p><code>0</code>: Disables VAD.</p>
         * </li>
         * <li><p><code>1</code> to <code>10</code>: A higher value makes it more difficult to interrupt the agent.</p>
         * </li>
         * <li><p><code>11</code>: Offers lower audio distortion and stronger resistance to interference.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VadLevel")
        public Integer vadLevel;

        /**
         * <p>The ID of the Text-to-Speech (TTS) voice. Changes take effect on the next utterance. If omitted, the default voice from the agent template is used. This parameter applies only to preset TTS voices. Maximum length: 64 characters. For available values, see <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent voice effect samples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>A list of available voices.</p>
         */
        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        /**
         * <p>The unique ID for voiceprint recognition. Default: not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>uniqueId</p>
         */
        @NameInMap("VoiceprintId")
        public String voiceprintId;

        /**
         * <p>The speaking volume of the agent.</p>
         * <ul>
         * <li><p>If omitted, the system uses adaptive volume mode.</p>
         * </li>
         * <li><p>If specified, the valid range is 0 to 400. The output volume is calculated as: <code>Output Volume in Workflow</code> \* (<code>volume</code>/100). For example:</p>
         * </li>
         * </ul>
         * <ol>
         * <li><p>If <code>volume</code> is <code>0</code>, the output is silent.</p>
         * </li>
         * <li><p>If <code>volume</code> is <code>100</code>, the output volume is the original volume.</p>
         * </li>
         * <li><p>If <code>volume</code> is <code>200</code>, the output volume is twice the original volume.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public Long volume;

        /**
         * <p>An initial user query that the agent addresses immediately when the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>今天天气怎么样？</p>
         */
        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        /**
         * <p>Workflow override parameters. Default: empty.</p>
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
         * <p>The text content of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>你好</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The role of the conversation participant. Valid values:</p>
         * <ul>
         * <li><p><code>user</code>: The user.</p>
         * </li>
         * <li><p><code>assistant</code>: The AI assistant.</p>
         * </li>
         * <li><p><code>system</code>: The system.</p>
         * </li>
         * <li><p><code>function</code>: A function call.</p>
         * </li>
         * <li><p><code>plugin</code>: A plugin.</p>
         * </li>
         * <li><p><code>tool</code>: A tool.</p>
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
         * <p>A list of hot words to improve ASR accuracy. A maximum of 128 words is supported.</p>
         */
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        /**
         * <p>The language ID for Automatic Speech Recognition (ASR).
         * Possible values:</p>
         * <ul>
         * <li><p><code>zh_mandarin</code>: Chinese</p>
         * </li>
         * <li><p><code>en</code>: English</p>
         * </li>
         * <li><p><code>zh_en</code>: Chinese-English</p>
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
         * <p>The maximum duration of silence in milliseconds before a sentence break is detected. Range: 200 to 1,200. Default: 400.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

        /**
         * <p>The URL of the agent\&quot;s avatar for voice chat. Default: none.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/a.jpg">http://example.com/a.jpg</a></p>
         */
        @NameInMap("AvatarUrl")
        public String avatarUrl;

        /**
         * <p>The type of the agent\&quot;s avatar URL. Default: none.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("AvatarUrlType")
        public String avatarUrlType;

        /**
         * <p>Parameters for Alibaba Cloud Bailian. For details, see <a href="https://help.aliyun.com/document_detail/2858132.html">Bailian App Params</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BailianAppParams")
        public String bailianAppParams;

        @NameInMap("CharBreak")
        public Boolean charBreak;

        /**
         * <p>Specifies whether to enable intelligent segmentation. If enabled, this feature intelligently merges pauses in a user\&quot;s speech into a single, complete sentence. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIntelligentSegment")
        public Boolean enableIntelligentSegment;

        /**
         * <p>Specifies whether to enable Push-to-Talk mode. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnablePushToTalk")
        public Boolean enablePushToTalk;

        /**
         * <p>Specifies whether to enable voice interruption. Default: <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        /**
         * <p>Specifies whether to enable graceful shutdown. Default: <code>false</code>.</p>
         * <ul>
         * <li>If enabled, the agent finishes its current speech (up to 10 seconds) before stopping.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("GracefulShutdown")
        public Boolean gracefulShutdown;

        /**
         * <p>The greeting message delivered when a user joins the session. If this parameter is omitted, the greeting configured in the agent template is used. Maximum length: 128 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>早上好，我的朋友</p>
         */
        @NameInMap("Greeting")
        public String greeting;

        /**
         * <p>A list of specific words or phrases that trigger a conversation interruption.</p>
         */
        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        /**
         * <p>The LLM/MLLM conversation history.</p>
         */
        @NameInMap("LlmHistory")
        public java.util.List<AIAgentTemplateConfigVoiceChatLlmHistory> llmHistory;

        /**
         * <p>The maximum number of conversation turns to retain in the LLM/MLLM history. Default: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        /**
         * <p>The system prompt for the LLM, applied when the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>你是一位友好且乐于助人的助手，专注于为用户提供准确的信息和建议。</p>
         */
        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

        /**
         * <p>The maximum idle time in seconds with no interaction before the agent goes offline. Default: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("MaxIdleTime")
        public Integer maxIdleTime;

        /**
         * <p>Specifies whether to use voiceprint recognition. Default: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("UseVoiceprint")
        public Boolean useVoiceprint;

        /**
         * <p>The time in seconds that the agent waits after a user leaves before closing the task. Default: 5.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UserOfflineTimeout")
        public Integer userOfflineTimeout;

        /**
         * <p>The time in seconds that the agent waits for a user to join before closing the task. Default: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("UserOnlineTimeout")
        public Integer userOnlineTimeout;

        /**
         * <p>The interruption sensitivity threshold. A higher value makes it more difficult to interrupt the agent. Range: 0 to 11. Default: 11.</p>
         * <ul>
         * <li><p><code>0</code>: Disables Voice Activity Detection (VAD).</p>
         * </li>
         * <li><p><code>1</code> to <code>10</code>: A higher value makes it more difficult to interrupt the agent.</p>
         * </li>
         * <li><p><code>11</code>: Offers lower audio distortion and stronger resistance to interference.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("VadLevel")
        public Integer vadLevel;

        /**
         * <p>The ID of the Text-to-Speech (TTS) voice. Changes take effect on the next utterance. If omitted, the default voice from the agent template is used. This parameter applies only to preset TTS voices. Maximum length: 64 characters. For available values, see <a href="https://help.aliyun.com/document_detail/449563.html">Intelligent voice effect samples</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>zhixiaoxia</p>
         */
        @NameInMap("VoiceId")
        public String voiceId;

        /**
         * <p>A list of available voices.</p>
         */
        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        /**
         * <p>The unique ID for voiceprint recognition. Default: not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>uniqueId</p>
         */
        @NameInMap("VoiceprintId")
        public String voiceprintId;

        /**
         * <p>The speaking volume of the agent.</p>
         * <ul>
         * <li><p>If omitted, the system uses adaptive volume mode.</p>
         * </li>
         * <li><p>If specified, the valid range is 0 to 400. The output volume is calculated as: <code>Output Volume in Workflow</code> \* (<code>volume</code>/100). For example:</p>
         * </li>
         * </ul>
         * <ol>
         * <li><p>If <code>volume</code> is <code>0</code>, the output is silent.</p>
         * </li>
         * <li><p>If <code>volume</code> is <code>100</code>, the output volume is the original volume.</p>
         * </li>
         * <li><p>If <code>volume</code> is <code>200</code>, the output volume is twice the original volume.</p>
         * </li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Volume")
        public Long volume;

        /**
         * <p>An initial user query that the agent addresses immediately when the call starts.</p>
         * 
         * <strong>example:</strong>
         * <p>今天天气怎么样？</p>
         */
        @NameInMap("WakeUpQuery")
        public String wakeUpQuery;

        /**
         * <p>Workflow override parameters. Default: empty.</p>
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
