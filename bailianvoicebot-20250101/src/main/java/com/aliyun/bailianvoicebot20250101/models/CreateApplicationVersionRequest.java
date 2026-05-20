// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateApplicationVersionRequest extends TeaModel {
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
    public CreateApplicationVersionRequestInteractionConfig interactionConfig;

    @NameInMap("RagConfig")
    public CreateApplicationVersionRequestRagConfig ragConfig;

    @NameInMap("ScriptProfile")
    public CreateApplicationVersionRequestScriptProfile scriptProfile;

    /**
     * <strong>example:</strong>
     * <p>20904943-f711-494f-9f1f-e7f340f37707</p>
     */
    @NameInMap("SourceVersionId")
    public String sourceVersionId;

    @NameInMap("SynthesizerConfig")
    public CreateApplicationVersionRequestSynthesizerConfig synthesizerConfig;

    @NameInMap("TranscriberConfig")
    public CreateApplicationVersionRequestTranscriberConfig transcriberConfig;

    public static CreateApplicationVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationVersionRequest self = new CreateApplicationVersionRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationVersionRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateApplicationVersionRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public CreateApplicationVersionRequest setInteractionConfig(CreateApplicationVersionRequestInteractionConfig interactionConfig) {
        this.interactionConfig = interactionConfig;
        return this;
    }
    public CreateApplicationVersionRequestInteractionConfig getInteractionConfig() {
        return this.interactionConfig;
    }

    public CreateApplicationVersionRequest setRagConfig(CreateApplicationVersionRequestRagConfig ragConfig) {
        this.ragConfig = ragConfig;
        return this;
    }
    public CreateApplicationVersionRequestRagConfig getRagConfig() {
        return this.ragConfig;
    }

    public CreateApplicationVersionRequest setScriptProfile(CreateApplicationVersionRequestScriptProfile scriptProfile) {
        this.scriptProfile = scriptProfile;
        return this;
    }
    public CreateApplicationVersionRequestScriptProfile getScriptProfile() {
        return this.scriptProfile;
    }

    public CreateApplicationVersionRequest setSourceVersionId(String sourceVersionId) {
        this.sourceVersionId = sourceVersionId;
        return this;
    }
    public String getSourceVersionId() {
        return this.sourceVersionId;
    }

    public CreateApplicationVersionRequest setSynthesizerConfig(CreateApplicationVersionRequestSynthesizerConfig synthesizerConfig) {
        this.synthesizerConfig = synthesizerConfig;
        return this;
    }
    public CreateApplicationVersionRequestSynthesizerConfig getSynthesizerConfig() {
        return this.synthesizerConfig;
    }

    public CreateApplicationVersionRequest setTranscriberConfig(CreateApplicationVersionRequestTranscriberConfig transcriberConfig) {
        this.transcriberConfig = transcriberConfig;
        return this;
    }
    public CreateApplicationVersionRequestTranscriberConfig getTranscriberConfig() {
        return this.transcriberConfig;
    }

    public static class CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig self = new CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateApplicationVersionRequestInteractionConfig extends TeaModel {
        @NameInMap("SilenceDetectionConfig")
        public CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static CreateApplicationVersionRequestInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestInteractionConfig self = new CreateApplicationVersionRequestInteractionConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestInteractionConfig setSilenceDetectionConfig(CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class CreateApplicationVersionRequestRagConfig extends TeaModel {
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

        public static CreateApplicationVersionRequestRagConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestRagConfig self = new CreateApplicationVersionRequestRagConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestRagConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateApplicationVersionRequestRagConfig setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
            this.knowledgeBaseIds = knowledgeBaseIds;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseIds() {
            return this.knowledgeBaseIds;
        }

        public CreateApplicationVersionRequestRagConfig setMaxContentLength(Integer maxContentLength) {
            this.maxContentLength = maxContentLength;
            return this;
        }
        public Integer getMaxContentLength() {
            return this.maxContentLength;
        }

        public CreateApplicationVersionRequestRagConfig setRagEngine(String ragEngine) {
            this.ragEngine = ragEngine;
            return this;
        }
        public String getRagEngine() {
            return this.ragEngine;
        }

        public CreateApplicationVersionRequestRagConfig setTopN(Integer topN) {
            this.topN = topN;
            return this;
        }
        public Integer getTopN() {
            return this.topN;
        }

    }

    public static class CreateApplicationVersionRequestScriptProfileAgentProfile extends TeaModel {
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

        public static CreateApplicationVersionRequestScriptProfileAgentProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestScriptProfileAgentProfile self = new CreateApplicationVersionRequestScriptProfileAgentProfile();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestScriptProfileAgentProfile setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationVersionRequestScriptProfileAgentProfile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApplicationVersionRequestScriptProfileAgentProfile setPromptsJson(String promptsJson) {
            this.promptsJson = promptsJson;
            return this;
        }
        public String getPromptsJson() {
            return this.promptsJson;
        }

        public CreateApplicationVersionRequestScriptProfileAgentProfile setScriptProfileTemplateId(String scriptProfileTemplateId) {
            this.scriptProfileTemplateId = scriptProfileTemplateId;
            return this;
        }
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

    }

    public static class CreateApplicationVersionRequestScriptProfile extends TeaModel {
        @NameInMap("AgentProfile")
        public CreateApplicationVersionRequestScriptProfileAgentProfile agentProfile;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        public static CreateApplicationVersionRequestScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestScriptProfile self = new CreateApplicationVersionRequestScriptProfile();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestScriptProfile setAgentProfile(CreateApplicationVersionRequestScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public CreateApplicationVersionRequestScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public CreateApplicationVersionRequestScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

    }

    public static class CreateApplicationVersionRequestSynthesizerConfigNlsAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static CreateApplicationVersionRequestSynthesizerConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestSynthesizerConfigNlsAccessProfile self = new CreateApplicationVersionRequestSynthesizerConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestSynthesizerConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class CreateApplicationVersionRequestSynthesizerConfigPronRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static CreateApplicationVersionRequestSynthesizerConfigPronRules build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestSynthesizerConfigPronRules self = new CreateApplicationVersionRequestSynthesizerConfigPronRules();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestSynthesizerConfigPronRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public CreateApplicationVersionRequestSynthesizerConfigPronRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class CreateApplicationVersionRequestSynthesizerConfig extends TeaModel {
        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public CreateApplicationVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile;

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
         * <p>50</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("PronRules")
        public java.util.List<CreateApplicationVersionRequestSynthesizerConfigPronRules> pronRules;

        /**
         * <strong>example:</strong>
         * <p>-156</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <strong>example:</strong>
         * <p>aiqi</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static CreateApplicationVersionRequestSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestSynthesizerConfig self = new CreateApplicationVersionRequestSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestSynthesizerConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateApplicationVersionRequestSynthesizerConfig setNlsAccessProfile(CreateApplicationVersionRequestSynthesizerConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public CreateApplicationVersionRequestSynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public CreateApplicationVersionRequestSynthesizerConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public CreateApplicationVersionRequestSynthesizerConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public CreateApplicationVersionRequestSynthesizerConfig setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public CreateApplicationVersionRequestSynthesizerConfig setPronRules(java.util.List<CreateApplicationVersionRequestSynthesizerConfigPronRules> pronRules) {
            this.pronRules = pronRules;
            return this;
        }
        public java.util.List<CreateApplicationVersionRequestSynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
        }

        public CreateApplicationVersionRequestSynthesizerConfig setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public CreateApplicationVersionRequestSynthesizerConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public CreateApplicationVersionRequestSynthesizerConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class CreateApplicationVersionRequestTranscriberConfigCorrectionRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static CreateApplicationVersionRequestTranscriberConfigCorrectionRules build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestTranscriberConfigCorrectionRules self = new CreateApplicationVersionRequestTranscriberConfigCorrectionRules();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestTranscriberConfigCorrectionRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public CreateApplicationVersionRequestTranscriberConfigCorrectionRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class CreateApplicationVersionRequestTranscriberConfigNlsAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static CreateApplicationVersionRequestTranscriberConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestTranscriberConfigNlsAccessProfile self = new CreateApplicationVersionRequestTranscriberConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestTranscriberConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class CreateApplicationVersionRequestTranscriberConfig extends TeaModel {
        @NameInMap("CorrectionRules")
        public java.util.List<CreateApplicationVersionRequestTranscriberConfigCorrectionRules> correctionRules;

        @NameInMap("CustomizationId")
        public String customizationId;

        @NameInMap("EndSilenceTimeout")
        public Integer endSilenceTimeout;

        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public CreateApplicationVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile;

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

        public static CreateApplicationVersionRequestTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestTranscriberConfig self = new CreateApplicationVersionRequestTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestTranscriberConfig setCorrectionRules(java.util.List<CreateApplicationVersionRequestTranscriberConfigCorrectionRules> correctionRules) {
            this.correctionRules = correctionRules;
            return this;
        }
        public java.util.List<CreateApplicationVersionRequestTranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        public CreateApplicationVersionRequestTranscriberConfig setCustomizationId(String customizationId) {
            this.customizationId = customizationId;
            return this;
        }
        public String getCustomizationId() {
            return this.customizationId;
        }

        public CreateApplicationVersionRequestTranscriberConfig setEndSilenceTimeout(Integer endSilenceTimeout) {
            this.endSilenceTimeout = endSilenceTimeout;
            return this;
        }
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        public CreateApplicationVersionRequestTranscriberConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateApplicationVersionRequestTranscriberConfig setNlsAccessProfile(CreateApplicationVersionRequestTranscriberConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public CreateApplicationVersionRequestTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
        }

        public CreateApplicationVersionRequestTranscriberConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public CreateApplicationVersionRequestTranscriberConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public CreateApplicationVersionRequestTranscriberConfig setSpeechNoiseThreshold(Integer speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }
        public Integer getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        public CreateApplicationVersionRequestTranscriberConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

}
