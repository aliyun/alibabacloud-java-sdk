// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetApplicationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D771A1B6-3D5F-174A-BEE1-98CE1000D337</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationResponseBody self = new GetApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApplicationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApplicationResponseBody setData(GetApplicationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetApplicationResponseBodyData getData() {
        return this.data;
    }

    public GetApplicationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig self = new GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionInteractionConfig extends TeaModel {
        @NameInMap("SilenceDetectionConfig")
        public GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static GetApplicationResponseBodyDataDraftVersionInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionInteractionConfig self = new GetApplicationResponseBodyDataDraftVersionInteractionConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfig setSilenceDetectionConfig(GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6a50b67072d44788951de29758432d94</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        @NameInMap("Description")
        public String description;

        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <strong>example:</strong>
         * <p>SFM_PROMPTS_DEFAULT</p>
         */
        @NameInMap("ScriptProfileTemplateId")
        public String scriptProfileTemplateId;

        public static GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile self = new GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile setAgentProfileId(String agentProfileId) {
            this.agentProfileId = agentProfileId;
            return this;
        }
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile setPromptsJson(String promptsJson) {
            this.promptsJson = promptsJson;
            return this;
        }
        public String getPromptsJson() {
            return this.promptsJson;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile setScriptProfileTemplateId(String scriptProfileTemplateId) {
            this.scriptProfileTemplateId = scriptProfileTemplateId;
            return this;
        }
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionScriptProfile extends TeaModel {
        @NameInMap("AgentProfile")
        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile agentProfile;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Temperature")
        public String temperature;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("TopP")
        public String topP;

        public static GetApplicationResponseBodyDataDraftVersionScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionScriptProfile self = new GetApplicationResponseBodyDataDraftVersionScriptProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setAgentProfile(GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setTemperature(String temperature) {
            this.temperature = temperature;
            return this;
        }
        public String getTemperature() {
            return this.temperature;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setTopP(String topP) {
            this.topP = topP;
            return this;
        }
        public String getTopP() {
            return this.topP;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionSynthesizerConfig extends TeaModel {
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
         * <p>5</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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

        public static GetApplicationResponseBodyDataDraftVersionSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionSynthesizerConfig self = new GetApplicationResponseBodyDataDraftVersionSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionTranscriberConfig extends TeaModel {
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

        public static GetApplicationResponseBodyDataDraftVersionTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionTranscriberConfig self = new GetApplicationResponseBodyDataDraftVersionTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersion extends TeaModel {
        @NameInMap("InteractionConfig")
        public GetApplicationResponseBodyDataDraftVersionInteractionConfig interactionConfig;

        @NameInMap("ScriptProfile")
        public GetApplicationResponseBodyDataDraftVersionScriptProfile scriptProfile;

        @NameInMap("SynthesizerConfig")
        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig synthesizerConfig;

        @NameInMap("TranscriberConfig")
        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig transcriberConfig;

        /**
         * <strong>example:</strong>
         * <p>743219815472857088</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetApplicationResponseBodyDataDraftVersion build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersion self = new GetApplicationResponseBodyDataDraftVersion();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersion setInteractionConfig(GetApplicationResponseBodyDataDraftVersionInteractionConfig interactionConfig) {
            this.interactionConfig = interactionConfig;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionInteractionConfig getInteractionConfig() {
            return this.interactionConfig;
        }

        public GetApplicationResponseBodyDataDraftVersion setScriptProfile(GetApplicationResponseBodyDataDraftVersionScriptProfile scriptProfile) {
            this.scriptProfile = scriptProfile;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionScriptProfile getScriptProfile() {
            return this.scriptProfile;
        }

        public GetApplicationResponseBodyDataDraftVersion setSynthesizerConfig(GetApplicationResponseBodyDataDraftVersionSynthesizerConfig synthesizerConfig) {
            this.synthesizerConfig = synthesizerConfig;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig getSynthesizerConfig() {
            return this.synthesizerConfig;
        }

        public GetApplicationResponseBodyDataDraftVersion setTranscriberConfig(GetApplicationResponseBodyDataDraftVersionTranscriberConfig transcriberConfig) {
            this.transcriberConfig = transcriberConfig;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig getTranscriberConfig() {
            return this.transcriberConfig;
        }

        public GetApplicationResponseBodyDataDraftVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig self = new GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionInteractionConfig extends TeaModel {
        @NameInMap("SilenceDetectionConfig")
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static GetApplicationResponseBodyDataPublishedVersionInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionInteractionConfig self = new GetApplicationResponseBodyDataPublishedVersionInteractionConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfig setSilenceDetectionConfig(GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>b97b6822dd624c32b6c2a54d717db718</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        @NameInMap("Description")
        public String description;

        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <strong>example:</strong>
         * <p>SFM_PROMPTS_DEFAULT</p>
         */
        @NameInMap("ScriptProfileTemplateId")
        public String scriptProfileTemplateId;

        public static GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile self = new GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile setAgentProfileId(String agentProfileId) {
            this.agentProfileId = agentProfileId;
            return this;
        }
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile setPromptsJson(String promptsJson) {
            this.promptsJson = promptsJson;
            return this;
        }
        public String getPromptsJson() {
            return this.promptsJson;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile setScriptProfileTemplateId(String scriptProfileTemplateId) {
            this.scriptProfileTemplateId = scriptProfileTemplateId;
            return this;
        }
        public String getScriptProfileTemplateId() {
            return this.scriptProfileTemplateId;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionScriptProfile extends TeaModel {
        @NameInMap("AgentProfile")
        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile agentProfile;

        /**
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Temperature")
        public String temperature;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("TopP")
        public String topP;

        public static GetApplicationResponseBodyDataPublishedVersionScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionScriptProfile self = new GetApplicationResponseBodyDataPublishedVersionScriptProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setAgentProfile(GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setTemperature(String temperature) {
            this.temperature = temperature;
            return this;
        }
        public String getTemperature() {
            return this.temperature;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setTopP(String topP) {
            this.topP = topP;
            return this;
        }
        public String getTopP() {
            return this.topP;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig extends TeaModel {
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
         * <p>3</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        /**
         * <strong>example:</strong>
         * <p>-20</p>
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

        public static GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig self = new GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setPitchRate(Integer pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Integer getPitchRate() {
            return this.pitchRate;
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionTranscriberConfig extends TeaModel {
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

        public static GetApplicationResponseBodyDataPublishedVersionTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionTranscriberConfig self = new GetApplicationResponseBodyDataPublishedVersionTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setNlsAccessType(String nlsAccessType) {
            this.nlsAccessType = nlsAccessType;
            return this;
        }
        public String getNlsAccessType() {
            return this.nlsAccessType;
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setNlsEngine(String nlsEngine) {
            this.nlsEngine = nlsEngine;
            return this;
        }
        public String getNlsEngine() {
            return this.nlsEngine;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersion extends TeaModel {
        @NameInMap("InteractionConfig")
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfig interactionConfig;

        @NameInMap("ScriptProfile")
        public GetApplicationResponseBodyDataPublishedVersionScriptProfile scriptProfile;

        @NameInMap("SynthesizerConfig")
        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig synthesizerConfig;

        @NameInMap("TranscriberConfig")
        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig transcriberConfig;

        /**
         * <strong>example:</strong>
         * <p>47889c1f-dd3f-4ace-9587-a13a3563e678</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetApplicationResponseBodyDataPublishedVersion build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersion self = new GetApplicationResponseBodyDataPublishedVersion();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersion setInteractionConfig(GetApplicationResponseBodyDataPublishedVersionInteractionConfig interactionConfig) {
            this.interactionConfig = interactionConfig;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfig getInteractionConfig() {
            return this.interactionConfig;
        }

        public GetApplicationResponseBodyDataPublishedVersion setScriptProfile(GetApplicationResponseBodyDataPublishedVersionScriptProfile scriptProfile) {
            this.scriptProfile = scriptProfile;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionScriptProfile getScriptProfile() {
            return this.scriptProfile;
        }

        public GetApplicationResponseBodyDataPublishedVersion setSynthesizerConfig(GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig synthesizerConfig) {
            this.synthesizerConfig = synthesizerConfig;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig getSynthesizerConfig() {
            return this.synthesizerConfig;
        }

        public GetApplicationResponseBodyDataPublishedVersion setTranscriberConfig(GetApplicationResponseBodyDataPublishedVersionTranscriberConfig transcriberConfig) {
            this.transcriberConfig = transcriberConfig;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig getTranscriberConfig() {
            return this.transcriberConfig;
        }

        public GetApplicationResponseBodyDataPublishedVersion setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetApplicationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>a395011f-a247-400f-bc69-28796749fd52</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <strong>example:</strong>
         * <p>1730081561000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("DraftVersion")
        public GetApplicationResponseBodyDataDraftVersion draftVersion;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <strong>example:</strong>
         * <p>PROMPTS</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        @NameInMap("PublishedVersion")
        public GetApplicationResponseBodyDataPublishedVersion publishedVersion;

        /**
         * <strong>example:</strong>
         * <p>1730081561000</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static GetApplicationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyData self = new GetApplicationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyData setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public GetApplicationResponseBodyData setConcurrency(Integer concurrency) {
            this.concurrency = concurrency;
            return this;
        }
        public Integer getConcurrency() {
            return this.concurrency;
        }

        public GetApplicationResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetApplicationResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyData setDraftVersion(GetApplicationResponseBodyDataDraftVersion draftVersion) {
            this.draftVersion = draftVersion;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersion getDraftVersion() {
            return this.draftVersion;
        }

        public GetApplicationResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyData setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public GetApplicationResponseBodyData setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public GetApplicationResponseBodyData setPublishedVersion(GetApplicationResponseBodyDataPublishedVersion publishedVersion) {
            this.publishedVersion = publishedVersion;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersion getPublishedVersion() {
            return this.publishedVersion;
        }

        public GetApplicationResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
