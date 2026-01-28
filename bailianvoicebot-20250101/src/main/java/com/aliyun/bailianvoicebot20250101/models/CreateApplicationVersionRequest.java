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

    public static class CreateApplicationVersionRequestSynthesizerConfig extends TeaModel {
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

    public static class CreateApplicationVersionRequestTranscriberConfig extends TeaModel {
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

        public static CreateApplicationVersionRequestTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestTranscriberConfig self = new CreateApplicationVersionRequestTranscriberConfig();
            return TeaModel.build(map, self);
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

    }

}
