// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class CreateApplicationVersionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    @NameInMap("InteractionConfig")
    public CreateApplicationVersionRequestInteractionConfig interactionConfig;

    @NameInMap("LabelConfig")
    public java.util.List<CreateApplicationVersionRequestLabelConfig> labelConfig;

    @NameInMap("RagConfig")
    public CreateApplicationVersionRequestRagConfig ragConfig;

    @NameInMap("ScriptProfile")
    public CreateApplicationVersionRequestScriptProfile scriptProfile;

    @NameInMap("SourceVersionId")
    public String sourceVersionId;

    @NameInMap("SynthesizerConfig")
    public CreateApplicationVersionRequestSynthesizerConfig synthesizerConfig;

    @NameInMap("ToolConfig")
    public CreateApplicationVersionRequestToolConfig toolConfig;

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

    public CreateApplicationVersionRequest setLabelConfig(java.util.List<CreateApplicationVersionRequestLabelConfig> labelConfig) {
        this.labelConfig = labelConfig;
        return this;
    }
    public java.util.List<CreateApplicationVersionRequestLabelConfig> getLabelConfig() {
        return this.labelConfig;
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

    public CreateApplicationVersionRequest setToolConfig(CreateApplicationVersionRequestToolConfig toolConfig) {
        this.toolConfig = toolConfig;
        return this;
    }
    public CreateApplicationVersionRequestToolConfig getToolConfig() {
        return this.toolConfig;
    }

    public CreateApplicationVersionRequest setTranscriberConfig(CreateApplicationVersionRequestTranscriberConfig transcriberConfig) {
        this.transcriberConfig = transcriberConfig;
        return this;
    }
    public CreateApplicationVersionRequestTranscriberConfig getTranscriberConfig() {
        return this.transcriberConfig;
    }

    public static class CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>感谢您的接听，祝您生活愉快，再见!</p>
         */
        @NameInMap("ClosingStatement")
        public String closingStatement;

        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        @NameInMap("TriggerType")
        public String triggerType;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TurnLimit")
        public Integer turnLimit;

        public static CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers self = new CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers setClosingStatement(String closingStatement) {
            this.closingStatement = closingStatement;
            return this;
        }
        public String getClosingStatement() {
            return this.closingStatement;
        }

        public CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

        public CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers setTurnLimit(Integer turnLimit) {
            this.turnLimit = turnLimit;
            return this;
        }
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

    }

    public static class CreateApplicationVersionRequestInteractionConfigEndConversationConfig extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Triggers")
        public java.util.List<CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers> triggers;

        public static CreateApplicationVersionRequestInteractionConfigEndConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestInteractionConfigEndConversationConfig self = new CreateApplicationVersionRequestInteractionConfigEndConversationConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestInteractionConfigEndConversationConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public CreateApplicationVersionRequestInteractionConfigEndConversationConfig setTriggers(java.util.List<CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<CreateApplicationVersionRequestInteractionConfigEndConversationConfigTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig extends TeaModel {
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        @NameInMap("Timeout")
        public Integer timeout;

        public static CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig self = new CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
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
        @NameInMap("BackgroundMusicId")
        public String backgroundMusicId;

        @NameInMap("EndConversationConfig")
        public CreateApplicationVersionRequestInteractionConfigEndConversationConfig endConversationConfig;

        @NameInMap("InitialGreetingDelayMilliseconds")
        public Integer initialGreetingDelayMilliseconds;

        @NameInMap("SilenceDetectionConfig")
        public CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static CreateApplicationVersionRequestInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestInteractionConfig self = new CreateApplicationVersionRequestInteractionConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestInteractionConfig setBackgroundMusicId(String backgroundMusicId) {
            this.backgroundMusicId = backgroundMusicId;
            return this;
        }
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        public CreateApplicationVersionRequestInteractionConfig setEndConversationConfig(CreateApplicationVersionRequestInteractionConfigEndConversationConfig endConversationConfig) {
            this.endConversationConfig = endConversationConfig;
            return this;
        }
        public CreateApplicationVersionRequestInteractionConfigEndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        public CreateApplicationVersionRequestInteractionConfig setInitialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
            this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
            return this;
        }
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        public CreateApplicationVersionRequestInteractionConfig setSilenceDetectionConfig(CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public CreateApplicationVersionRequestInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class CreateApplicationVersionRequestLabelConfig extends TeaModel {
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static CreateApplicationVersionRequestLabelConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestLabelConfig self = new CreateApplicationVersionRequestLabelConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestLabelConfig setCandidateValues(java.util.List<String> candidateValues) {
            this.candidateValues = candidateValues;
            return this;
        }
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public CreateApplicationVersionRequestLabelConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateApplicationVersionRequestLabelConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    public static class CreateApplicationVersionRequestScriptProfileFunctionMeta extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>9b752bbb-805a-4d3e-9013-eab5555c3fef</p>
         */
        @NameInMap("FunctionId")
        public String functionId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("HttpTriggerName")
        public String httpTriggerName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run">http://chat-xxxxx-v-yewiundukb.cn-hangzhou-xxx.run</a></p>
         */
        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static CreateApplicationVersionRequestScriptProfileFunctionMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestScriptProfileFunctionMeta self = new CreateApplicationVersionRequestScriptProfileFunctionMeta();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestScriptProfileFunctionMeta setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public CreateApplicationVersionRequestScriptProfileFunctionMeta setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public CreateApplicationVersionRequestScriptProfileFunctionMeta setHttpTriggerName(String httpTriggerName) {
            this.httpTriggerName = httpTriggerName;
            return this;
        }
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        public CreateApplicationVersionRequestScriptProfileFunctionMeta setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = httpTriggerUrl;
            return this;
        }
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        public CreateApplicationVersionRequestScriptProfileFunctionMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class CreateApplicationVersionRequestScriptProfileNluAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static CreateApplicationVersionRequestScriptProfileNluAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestScriptProfileNluAccessProfile self = new CreateApplicationVersionRequestScriptProfileNluAccessProfile();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestScriptProfileNluAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class CreateApplicationVersionRequestScriptProfile extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6f444ecf21d94238b516735916c98666</p>
         */
        @NameInMap("AgentKey")
        public String agentKey;

        @NameInMap("AgentProfile")
        public CreateApplicationVersionRequestScriptProfileAgentProfile agentProfile;

        /**
         * <strong>example:</strong>
         * <p>chatbot-cn-MQuyjjb666</p>
         */
        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("FunctionMeta")
        public CreateApplicationVersionRequestScriptProfileFunctionMeta functionMeta;

        @NameInMap("Model")
        public String model;

        @NameInMap("NluAccessProfile")
        public CreateApplicationVersionRequestScriptProfileNluAccessProfile nluAccessProfile;

        @NameInMap("NluAccessType")
        public String nluAccessType;

        @NameInMap("OmniModel")
        public Boolean omniModel;

        public static CreateApplicationVersionRequestScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestScriptProfile self = new CreateApplicationVersionRequestScriptProfile();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestScriptProfile setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public CreateApplicationVersionRequestScriptProfile setAgentProfile(CreateApplicationVersionRequestScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public CreateApplicationVersionRequestScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public CreateApplicationVersionRequestScriptProfile setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public CreateApplicationVersionRequestScriptProfile setFunctionMeta(CreateApplicationVersionRequestScriptProfileFunctionMeta functionMeta) {
            this.functionMeta = functionMeta;
            return this;
        }
        public CreateApplicationVersionRequestScriptProfileFunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        public CreateApplicationVersionRequestScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateApplicationVersionRequestScriptProfile setNluAccessProfile(CreateApplicationVersionRequestScriptProfileNluAccessProfile nluAccessProfile) {
            this.nluAccessProfile = nluAccessProfile;
            return this;
        }
        public CreateApplicationVersionRequestScriptProfileNluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
        }

        public CreateApplicationVersionRequestScriptProfile setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public CreateApplicationVersionRequestScriptProfile setOmniModel(Boolean omniModel) {
            this.omniModel = omniModel;
            return this;
        }
        public Boolean getOmniModel() {
            return this.omniModel;
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

        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        @NameInMap("NlsEngine")
        public String nlsEngine;

        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("PronRules")
        public java.util.List<CreateApplicationVersionRequestSynthesizerConfigPronRules> pronRules;

        @NameInMap("SpeechRate")
        public Integer speechRate;

        @NameInMap("Voice")
        public String voice;

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

    public static class CreateApplicationVersionRequestToolConfigMcpServers extends TeaModel {
        @NameInMap("BaseUrl")
        public String baseUrl;

        @NameInMap("Name")
        public String name;

        @NameInMap("SseEndpoint")
        public String sseEndpoint;

        public static CreateApplicationVersionRequestToolConfigMcpServers build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestToolConfigMcpServers self = new CreateApplicationVersionRequestToolConfigMcpServers();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestToolConfigMcpServers setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public CreateApplicationVersionRequestToolConfigMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateApplicationVersionRequestToolConfigMcpServers setSseEndpoint(String sseEndpoint) {
            this.sseEndpoint = sseEndpoint;
            return this;
        }
        public String getSseEndpoint() {
            return this.sseEndpoint;
        }

    }

    public static class CreateApplicationVersionRequestToolConfig extends TeaModel {
        @NameInMap("McpServers")
        public java.util.List<CreateApplicationVersionRequestToolConfigMcpServers> mcpServers;

        public static CreateApplicationVersionRequestToolConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateApplicationVersionRequestToolConfig self = new CreateApplicationVersionRequestToolConfig();
            return TeaModel.build(map, self);
        }

        public CreateApplicationVersionRequestToolConfig setMcpServers(java.util.List<CreateApplicationVersionRequestToolConfigMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<CreateApplicationVersionRequestToolConfigMcpServers> getMcpServers() {
            return this.mcpServers;
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

        @NameInMap("NlsAccessType")
        public String nlsAccessType;

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
