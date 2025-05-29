// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AIAgentOutboundCallConfig extends TeaModel {
    @NameInMap("AsrConfig")
    public AIAgentOutboundCallConfigAsrConfig asrConfig;

    @NameInMap("EnableIntelligentSegment")
    public Boolean enableIntelligentSegment;

    @NameInMap("Greeting")
    public String greeting;

    @NameInMap("InterruptConfig")
    public AIAgentOutboundCallConfigInterruptConfig interruptConfig;

    @NameInMap("LlmConfig")
    public AIAgentOutboundCallConfigLlmConfig llmConfig;

    @NameInMap("TtsConfig")
    public AIAgentOutboundCallConfigTtsConfig ttsConfig;

    @NameInMap("TurnDetectionConfig")
    public AIAgentOutboundCallConfigTurnDetectionConfig turnDetectionConfig;

    public static AIAgentOutboundCallConfig build(java.util.Map<String, ?> map) throws Exception {
        AIAgentOutboundCallConfig self = new AIAgentOutboundCallConfig();
        return TeaModel.build(map, self);
    }

    public AIAgentOutboundCallConfig setAsrConfig(AIAgentOutboundCallConfigAsrConfig asrConfig) {
        this.asrConfig = asrConfig;
        return this;
    }
    public AIAgentOutboundCallConfigAsrConfig getAsrConfig() {
        return this.asrConfig;
    }

    public AIAgentOutboundCallConfig setEnableIntelligentSegment(Boolean enableIntelligentSegment) {
        this.enableIntelligentSegment = enableIntelligentSegment;
        return this;
    }
    public Boolean getEnableIntelligentSegment() {
        return this.enableIntelligentSegment;
    }

    public AIAgentOutboundCallConfig setGreeting(String greeting) {
        this.greeting = greeting;
        return this;
    }
    public String getGreeting() {
        return this.greeting;
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

    public static class AIAgentOutboundCallConfigAsrConfig extends TeaModel {
        @NameInMap("AsrHotWords")
        public java.util.List<String> asrHotWords;

        @NameInMap("AsrLanguageId")
        public String asrLanguageId;

        @NameInMap("AsrMaxSilence")
        public Integer asrMaxSilence;

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

        public AIAgentOutboundCallConfigAsrConfig setVadLevel(Integer vadLevel) {
            this.vadLevel = vadLevel;
            return this;
        }
        public Integer getVadLevel() {
            return this.vadLevel;
        }

    }

    public static class AIAgentOutboundCallConfigInterruptConfig extends TeaModel {
        @NameInMap("EnableVoiceInterrupt")
        public Boolean enableVoiceInterrupt;

        @NameInMap("InterruptWords")
        public java.util.List<String> interruptWords;

        public static AIAgentOutboundCallConfigInterruptConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigInterruptConfig self = new AIAgentOutboundCallConfigInterruptConfig();
            return TeaModel.build(map, self);
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

        @NameInMap("LlmHistory")
        public java.util.List<AIAgentOutboundCallConfigLlmConfigLlmHistory> llmHistory;

        @NameInMap("LlmHistoryLimit")
        public Integer llmHistoryLimit;

        @NameInMap("LlmSystemPrompt")
        public String llmSystemPrompt;

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

    }

    public static class AIAgentOutboundCallConfigTtsConfig extends TeaModel {
        @NameInMap("VoiceId")
        public String voiceId;

        @NameInMap("VoiceIdList")
        public java.util.List<String> voiceIdList;

        public static AIAgentOutboundCallConfigTtsConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigTtsConfig self = new AIAgentOutboundCallConfigTtsConfig();
            return TeaModel.build(map, self);
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
        @NameInMap("TurnEndWords")
        public java.util.List<String> turnEndWords;

        public static AIAgentOutboundCallConfigTurnDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            AIAgentOutboundCallConfigTurnDetectionConfig self = new AIAgentOutboundCallConfigTurnDetectionConfig();
            return TeaModel.build(map, self);
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
