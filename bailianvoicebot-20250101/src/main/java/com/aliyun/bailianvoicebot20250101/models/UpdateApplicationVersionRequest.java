// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class UpdateApplicationVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a395011f-a247-400f-bc69-28796749fd52</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("InteractionConfig")
    public UpdateApplicationVersionRequestInteractionConfig interactionConfig;

    @NameInMap("RagConfig")
    public UpdateApplicationVersionRequestRagConfig ragConfig;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScriptProfile")
    public UpdateApplicationVersionRequestScriptProfile scriptProfile;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("SynthesizerConfig")
    public UpdateApplicationVersionRequestSynthesizerConfig synthesizerConfig;

    @NameInMap("ToolConfig")
    public UpdateApplicationVersionRequestToolConfig toolConfig;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TranscriberConfig")
    public UpdateApplicationVersionRequestTranscriberConfig transcriberConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20904943-f711-494f-9f1f-e7f340f37707</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static UpdateApplicationVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationVersionRequest self = new UpdateApplicationVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationVersionRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdateApplicationVersionRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public UpdateApplicationVersionRequest setInteractionConfig(UpdateApplicationVersionRequestInteractionConfig interactionConfig) {
        this.interactionConfig = interactionConfig;
        return this;
    }
    public UpdateApplicationVersionRequestInteractionConfig getInteractionConfig() {
        return this.interactionConfig;
    }

    public UpdateApplicationVersionRequest setRagConfig(UpdateApplicationVersionRequestRagConfig ragConfig) {
        this.ragConfig = ragConfig;
        return this;
    }
    public UpdateApplicationVersionRequestRagConfig getRagConfig() {
        return this.ragConfig;
    }

    public UpdateApplicationVersionRequest setScriptProfile(UpdateApplicationVersionRequestScriptProfile scriptProfile) {
        this.scriptProfile = scriptProfile;
        return this;
    }
    public UpdateApplicationVersionRequestScriptProfile getScriptProfile() {
        return this.scriptProfile;
    }

    public UpdateApplicationVersionRequest setSynthesizerConfig(UpdateApplicationVersionRequestSynthesizerConfig synthesizerConfig) {
        this.synthesizerConfig = synthesizerConfig;
        return this;
    }
    public UpdateApplicationVersionRequestSynthesizerConfig getSynthesizerConfig() {
        return this.synthesizerConfig;
    }

    public UpdateApplicationVersionRequest setToolConfig(UpdateApplicationVersionRequestToolConfig toolConfig) {
        this.toolConfig = toolConfig;
        return this;
    }
    public UpdateApplicationVersionRequestToolConfig getToolConfig() {
        return this.toolConfig;
    }

    public UpdateApplicationVersionRequest setTranscriberConfig(UpdateApplicationVersionRequestTranscriberConfig transcriberConfig) {
        this.transcriberConfig = transcriberConfig;
        return this;
    }
    public UpdateApplicationVersionRequestTranscriberConfig getTranscriberConfig() {
        return this.transcriberConfig;
    }

    public UpdateApplicationVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

    public static class UpdateApplicationVersionRequestInteractionConfigSilenceDetectionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static UpdateApplicationVersionRequestInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestInteractionConfigSilenceDetectionConfig self = new UpdateApplicationVersionRequestInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateApplicationVersionRequestInteractionConfig extends TeaModel {
        @NameInMap("SilenceDetectionConfig")
        public UpdateApplicationVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static UpdateApplicationVersionRequestInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestInteractionConfig self = new UpdateApplicationVersionRequestInteractionConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestInteractionConfig setSilenceDetectionConfig(UpdateApplicationVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public UpdateApplicationVersionRequestInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class UpdateApplicationVersionRequestRagConfig extends TeaModel {
        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("KnowledgeBaseIds")
        public java.util.List<String> knowledgeBaseIds;

        @NameInMap("MaxContentLength")
        public Integer maxContentLength;

        @NameInMap("RagEngine")
        public String ragEngine;

        @NameInMap("TopN")
        public Integer topN;

        public static UpdateApplicationVersionRequestRagConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestRagConfig self = new UpdateApplicationVersionRequestRagConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestRagConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateApplicationVersionRequestRagConfig setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
            this.knowledgeBaseIds = knowledgeBaseIds;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseIds() {
            return this.knowledgeBaseIds;
        }

        public UpdateApplicationVersionRequestRagConfig setMaxContentLength(Integer maxContentLength) {
            this.maxContentLength = maxContentLength;
            return this;
        }
        public Integer getMaxContentLength() {
            return this.maxContentLength;
        }

        public UpdateApplicationVersionRequestRagConfig setRagEngine(String ragEngine) {
            this.ragEngine = ragEngine;
            return this;
        }
        public String getRagEngine() {
            return this.ragEngine;
        }

        public UpdateApplicationVersionRequestRagConfig setTopN(Integer topN) {
            this.topN = topN;
            return this;
        }
        public Integer getTopN() {
            return this.topN;
        }

    }

    public static class UpdateApplicationVersionRequestScriptProfileAgentProfile extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <strong>example:</strong>
         * <p>SFM_PROMPTS_DEFAULT</p>
         */
        @NameInMap("ScriptProfileTemplateId")
        public String scriptProfileTemplateId;

        public static UpdateApplicationVersionRequestScriptProfileAgentProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestScriptProfileAgentProfile self = new UpdateApplicationVersionRequestScriptProfileAgentProfile();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestScriptProfileAgentProfile setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateApplicationVersionRequestScriptProfileAgentProfile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationVersionRequestScriptProfileAgentProfile setPromptsJson(String promptsJson) {
            this.promptsJson = promptsJson;
            return this;
        }
        public String getPromptsJson() {
            return this.promptsJson;
        }

        public UpdateApplicationVersionRequestScriptProfileAgentProfile setScriptProfileTemplateId(String scriptProfileTemplateId) {
            this.scriptProfileTemplateId = scriptProfileTemplateId;
            return this;
        }
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

    }

    public static class UpdateApplicationVersionRequestScriptProfile extends TeaModel {
        @NameInMap("AgentProfile")
        public UpdateApplicationVersionRequestScriptProfileAgentProfile agentProfile;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        public static UpdateApplicationVersionRequestScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestScriptProfile self = new UpdateApplicationVersionRequestScriptProfile();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestScriptProfile setAgentProfile(UpdateApplicationVersionRequestScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public UpdateApplicationVersionRequestScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public UpdateApplicationVersionRequestScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

    public static class UpdateApplicationVersionRequestSynthesizerConfigNlsAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static UpdateApplicationVersionRequestSynthesizerConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestSynthesizerConfigNlsAccessProfile self = new UpdateApplicationVersionRequestSynthesizerConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestSynthesizerConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class UpdateApplicationVersionRequestSynthesizerConfigPronRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static UpdateApplicationVersionRequestSynthesizerConfigPronRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestSynthesizerConfigPronRules self = new UpdateApplicationVersionRequestSynthesizerConfigPronRules();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestSynthesizerConfigPronRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public UpdateApplicationVersionRequestSynthesizerConfigPronRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class UpdateApplicationVersionRequestSynthesizerConfig extends TeaModel {
        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public UpdateApplicationVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("PronRules")
        public java.util.List<UpdateApplicationVersionRequestSynthesizerConfigPronRules> pronRules;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <strong>example:</strong>
         * <p>aixia</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static UpdateApplicationVersionRequestSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestSynthesizerConfig self = new UpdateApplicationVersionRequestSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setNlsAccessProfile(UpdateApplicationVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public UpdateApplicationVersionRequestSynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setPronRules(java.util.List<UpdateApplicationVersionRequestSynthesizerConfigPronRules> pronRules) {
            this.pronRules = pronRules;
            return this;
        }
        public java.util.List<UpdateApplicationVersionRequestSynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public UpdateApplicationVersionRequestSynthesizerConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class UpdateApplicationVersionRequestToolConfigMcpServers extends TeaModel {
        @NameInMap("BaseUrl")
        public String baseUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("SseEndpoint")
        public String sseEndpoint;

        public static UpdateApplicationVersionRequestToolConfigMcpServers build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestToolConfigMcpServers self = new UpdateApplicationVersionRequestToolConfigMcpServers();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestToolConfigMcpServers setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public UpdateApplicationVersionRequestToolConfigMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateApplicationVersionRequestToolConfigMcpServers setSseEndpoint(String sseEndpoint) {
            this.sseEndpoint = sseEndpoint;
            return this;
        }
        public String getSseEndpoint() {
            return this.sseEndpoint;
        }

    }

    public static class UpdateApplicationVersionRequestToolConfig extends TeaModel {
        @NameInMap("McpServers")
        public java.util.List<UpdateApplicationVersionRequestToolConfigMcpServers> mcpServers;

        public static UpdateApplicationVersionRequestToolConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestToolConfig self = new UpdateApplicationVersionRequestToolConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestToolConfig setMcpServers(java.util.List<UpdateApplicationVersionRequestToolConfigMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<UpdateApplicationVersionRequestToolConfigMcpServers> getMcpServers() {
            return this.mcpServers;
        }

    }

    public static class UpdateApplicationVersionRequestTranscriberConfigCorrectionRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static UpdateApplicationVersionRequestTranscriberConfigCorrectionRules build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestTranscriberConfigCorrectionRules self = new UpdateApplicationVersionRequestTranscriberConfigCorrectionRules();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestTranscriberConfigCorrectionRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public UpdateApplicationVersionRequestTranscriberConfigCorrectionRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class UpdateApplicationVersionRequestTranscriberConfigNlsAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static UpdateApplicationVersionRequestTranscriberConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestTranscriberConfigNlsAccessProfile self = new UpdateApplicationVersionRequestTranscriberConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestTranscriberConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class UpdateApplicationVersionRequestTranscriberConfig extends TeaModel {
        @NameInMap("CorrectionRules")
        public java.util.List<UpdateApplicationVersionRequestTranscriberConfigCorrectionRules> correctionRules;

        @NameInMap("CustomizationId")
        public String customizationId;

        @NameInMap("EndSilenceTimeout")
        public Integer endSilenceTimeout;

        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public UpdateApplicationVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        @NameInMap("SpeechNoiseThreshold")
        public Integer speechNoiseThreshold;

        @NameInMap("VocabularyId")
        public String vocabularyId;

        public static UpdateApplicationVersionRequestTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateApplicationVersionRequestTranscriberConfig self = new UpdateApplicationVersionRequestTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public UpdateApplicationVersionRequestTranscriberConfig setCorrectionRules(java.util.List<UpdateApplicationVersionRequestTranscriberConfigCorrectionRules> correctionRules) {
            this.correctionRules = correctionRules;
            return this;
        }
        public java.util.List<UpdateApplicationVersionRequestTranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        public UpdateApplicationVersionRequestTranscriberConfig setCustomizationId(String customizationId) {
            this.customizationId = customizationId;
            return this;
        }
        public String getCustomizationId() {
            return this.customizationId;
        }

        public UpdateApplicationVersionRequestTranscriberConfig setEndSilenceTimeout(Integer endSilenceTimeout) {
            this.endSilenceTimeout = endSilenceTimeout;
            return this;
        }
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        public UpdateApplicationVersionRequestTranscriberConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateApplicationVersionRequestTranscriberConfig setNlsAccessProfile(UpdateApplicationVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public UpdateApplicationVersionRequestTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public UpdateApplicationVersionRequestTranscriberConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public UpdateApplicationVersionRequestTranscriberConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public UpdateApplicationVersionRequestTranscriberConfig setSpeechNoiseThreshold(Integer speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }
        public Integer getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        public UpdateApplicationVersionRequestTranscriberConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

}
