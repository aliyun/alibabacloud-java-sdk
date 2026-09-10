// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GetApplicationResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetApplicationResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
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

    public GetApplicationResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers extends TeaModel {
        @NameInMap("ClosingStatement")
        public String closingStatement;

        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("TurnLimit")
        public Integer turnLimit;

        public static GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers self = new GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers setClosingStatement(String closingStatement) {
            this.closingStatement = closingStatement;
            return this;
        }
        public String getClosingStatement() {
            return this.closingStatement;
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers setTurnLimit(Integer turnLimit) {
            this.turnLimit = turnLimit;
            return this;
        }
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Triggers")
        public java.util.List<GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers> triggers;

        public static GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig self = new GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig setTriggers(java.util.List<GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfigTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig extends TeaModel {
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>The task execution timeout period, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig self = new GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
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
        @NameInMap("BackgroundMusicId")
        public String backgroundMusicId;

        @NameInMap("EndConversationConfig")
        public GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig endConversationConfig;

        @NameInMap("InitialGreetingDelayMilliseconds")
        public Integer initialGreetingDelayMilliseconds;

        /**
         * <p>The silence detection configuration.</p>
         */
        @NameInMap("SilenceDetectionConfig")
        public GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static GetApplicationResponseBodyDataDraftVersionInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionInteractionConfig self = new GetApplicationResponseBodyDataDraftVersionInteractionConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfig setBackgroundMusicId(String backgroundMusicId) {
            this.backgroundMusicId = backgroundMusicId;
            return this;
        }
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfig setEndConversationConfig(GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig endConversationConfig) {
            this.endConversationConfig = endConversationConfig;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionInteractionConfigEndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfig setInitialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
            this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
            return this;
        }
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        public GetApplicationResponseBodyDataDraftVersionInteractionConfig setSilenceDetectionConfig(GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionLabelConfig extends TeaModel {
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static GetApplicationResponseBodyDataDraftVersionLabelConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionLabelConfig self = new GetApplicationResponseBodyDataDraftVersionLabelConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionLabelConfig setCandidateValues(java.util.List<String> candidateValues) {
            this.candidateValues = candidateValues;
            return this;
        }
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public GetApplicationResponseBodyDataDraftVersionLabelConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyDataDraftVersionLabelConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionRagConfig extends TeaModel {
        /**
         * <p>Specifies whether RAG is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of knowledge base IDs.</p>
         */
        @NameInMap("KnowledgeBaseIds")
        public java.util.List<String> knowledgeBaseIds;

        /**
         * <p>The maximum concatenation length of RAG content.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxContentLength")
        public Integer maxContentLength;

        /**
         * <p>The RAG engine.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("RagEngine")
        public String ragEngine;

        /**
         * <p>The maximum number of data entries to retrieve.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TopN")
        public Integer topN;

        public static GetApplicationResponseBodyDataDraftVersionRagConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionRagConfig self = new GetApplicationResponseBodyDataDraftVersionRagConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionRagConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetApplicationResponseBodyDataDraftVersionRagConfig setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
            this.knowledgeBaseIds = knowledgeBaseIds;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseIds() {
            return this.knowledgeBaseIds;
        }

        public GetApplicationResponseBodyDataDraftVersionRagConfig setMaxContentLength(Integer maxContentLength) {
            this.maxContentLength = maxContentLength;
            return this;
        }
        public Integer getMaxContentLength() {
            return this.maxContentLength;
        }

        public GetApplicationResponseBodyDataDraftVersionRagConfig setRagEngine(String ragEngine) {
            this.ragEngine = ragEngine;
            return this;
        }
        public String getRagEngine() {
            return this.ragEngine;
        }

        public GetApplicationResponseBodyDataDraftVersionRagConfig setTopN(Integer topN) {
            this.topN = topN;
            return this;
        }
        public Integer getTopN() {
            return this.topN;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile extends TeaModel {
        /**
         * <p>The agent configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6a50b67072d44788951de29758432d94</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        /**
         * <p>The agent description.</p>
         * 
         * <strong>example:</strong>
         * <p>Chatbot</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        /**
         * <p>The prompt in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;prompts&quot;:&quot;I am a chatbot.&quot;}</p>
         */
        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <p>The application template ID.</p>
         * 
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

        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    public static class GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta extends TeaModel {
        @NameInMap("FunctionId")
        public String functionId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("HttpTriggerName")
        public String httpTriggerName;

        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        @NameInMap("RegionId")
        public String regionId;

        public static GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta self = new GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta setHttpTriggerName(String httpTriggerName) {
            this.httpTriggerName = httpTriggerName;
            return this;
        }
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = httpTriggerUrl;
            return this;
        }
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionScriptProfileNluAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetApplicationResponseBodyDataDraftVersionScriptProfileNluAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionScriptProfileNluAccessProfile self = new GetApplicationResponseBodyDataDraftVersionScriptProfileNluAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfileNluAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionScriptProfile extends TeaModel {
        @NameInMap("AgentKey")
        public String agentKey;

        /**
         * <p>The agent configuration information.</p>
         */
        @NameInMap("AgentProfile")
        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile agentProfile;

        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("FunctionMeta")
        public GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta functionMeta;

        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("NluAccessProfile")
        public GetApplicationResponseBodyDataDraftVersionScriptProfileNluAccessProfile nluAccessProfile;

        @NameInMap("NluAccessType")
        public String nluAccessType;

        @NameInMap("NluEngine")
        public String nluEngine;

        @NameInMap("OmniModel")
        public Boolean omniModel;

        /**
         * <p>The probability threshold for nucleus sampling during generation.</p>
         * <blockquote>
         * <ul>
         * <li>For example, when the value is set to 0.8, only the smallest set of most likely tokens whose cumulative probability is greater than or equal to 0.8 is retained as the candidate set.<ul>
         * <li>Valid values: (0, 1.0). A higher value increases randomness in generation. A lower value increases determinism in generation.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Temperature")
        public String temperature;

        /**
         * <p>Controls the randomness and diversity of model responses.</p>
         * <blockquote>
         * <ul>
         * <li>Specifically, the temperature value controls the degree of smoothing applied to the probability distribution of each candidate token during text generation. A higher temperature value flattens the probability distribution, allowing more low-probability tokens to be selected, which produces more diverse results. A lower temperature value sharpens the probability distribution, making high-probability tokens more likely to be selected, which produces more deterministic results.</li>
         * <li>Valid values: [0, 2). Setting the value to 0 is not recommended because it is meaningless.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("TopP")
        public String topP;

        public static GetApplicationResponseBodyDataDraftVersionScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionScriptProfile self = new GetApplicationResponseBodyDataDraftVersionScriptProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setAgentProfile(GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setFunctionMeta(GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta functionMeta) {
            this.functionMeta = functionMeta;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionScriptProfileFunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setNluAccessProfile(GetApplicationResponseBodyDataDraftVersionScriptProfileNluAccessProfile nluAccessProfile) {
            this.nluAccessProfile = nluAccessProfile;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionScriptProfileNluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public GetApplicationResponseBodyDataDraftVersionScriptProfile setOmniModel(Boolean omniModel) {
            this.omniModel = omniModel;
            return this;
        }
        public Boolean getOmniModel() {
            return this.omniModel;
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

    public static class GetApplicationResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetApplicationResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile self = new GetApplicationResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules self = new GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionSynthesizerConfig extends TeaModel {
        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p>The TTS invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p>The TTS engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>The pitch rate.</p>
         * <blockquote>
         * <p>Valid values: -500 to 500.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("PronRules")
        public java.util.List<GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules> pronRules;

        /**
         * <p>The speech rate.</p>
         * <blockquote>
         * <p>Valid values: -500 to 500.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>The voice.</p>
         * 
         * <strong>example:</strong>
         * <p>aixia</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The volume.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static GetApplicationResponseBodyDataDraftVersionSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionSynthesizerConfig self = new GetApplicationResponseBodyDataDraftVersionSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setNlsAccessProfile(GetApplicationResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
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

        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig setPronRules(java.util.List<GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules> pronRules) {
            this.pronRules = pronRules;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataDraftVersionSynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
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

    public static class GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers extends TeaModel {
        /**
         * <p>The base URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>phone-ai-call</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The SSE endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>/phone-ai-call/mcp/sse?key=value</p>
         */
        @NameInMap("SseEndpoint")
        public String sseEndpoint;

        public static GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers self = new GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers setSseEndpoint(String sseEndpoint) {
            this.sseEndpoint = sseEndpoint;
            return this;
        }
        public String getSseEndpoint() {
            return this.sseEndpoint;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionToolConfig extends TeaModel {
        /**
         * <p>The list of MCP server configurations.</p>
         */
        @NameInMap("McpServers")
        public java.util.List<GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers> mcpServers;

        public static GetApplicationResponseBodyDataDraftVersionToolConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionToolConfig self = new GetApplicationResponseBodyDataDraftVersionToolConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionToolConfig setMcpServers(java.util.List<GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataDraftVersionToolConfigMcpServers> getMcpServers() {
            return this.mcpServers;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules self = new GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetApplicationResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile self = new GetApplicationResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersionTranscriberConfig extends TeaModel {
        @NameInMap("CorrectionRules")
        public java.util.List<GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules> correctionRules;

        @NameInMap("CustomizationId")
        public String customizationId;

        @NameInMap("EndSilenceTimeout")
        public Integer endSilenceTimeout;

        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public GetApplicationResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p>The ASR invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p>The ASR engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        @NameInMap("SpeechNoiseThreshold")
        public Integer speechNoiseThreshold;

        @NameInMap("VocabularyId")
        public String vocabularyId;

        public static GetApplicationResponseBodyDataDraftVersionTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataDraftVersionTranscriberConfig self = new GetApplicationResponseBodyDataDraftVersionTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setCorrectionRules(java.util.List<GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules> correctionRules) {
            this.correctionRules = correctionRules;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataDraftVersionTranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setCustomizationId(String customizationId) {
            this.customizationId = customizationId;
            return this;
        }
        public String getCustomizationId() {
            return this.customizationId;
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setEndSilenceTimeout(Integer endSilenceTimeout) {
            this.endSilenceTimeout = endSilenceTimeout;
            return this;
        }
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setNlsAccessProfile(GetApplicationResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
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

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setSpeechNoiseThreshold(Integer speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }
        public Integer getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

    public static class GetApplicationResponseBodyDataDraftVersion extends TeaModel {
        /**
         * <p>The interaction configuration.</p>
         */
        @NameInMap("InteractionConfig")
        public GetApplicationResponseBodyDataDraftVersionInteractionConfig interactionConfig;

        @NameInMap("LabelConfig")
        public java.util.List<GetApplicationResponseBodyDataDraftVersionLabelConfig> labelConfig;

        /**
         * <p>The RAG configuration.</p>
         */
        @NameInMap("RagConfig")
        public GetApplicationResponseBodyDataDraftVersionRagConfig ragConfig;

        /**
         * <p>The application model configuration.</p>
         */
        @NameInMap("ScriptProfile")
        public GetApplicationResponseBodyDataDraftVersionScriptProfile scriptProfile;

        /**
         * <p>The text-to-speech (TTS) configuration.</p>
         */
        @NameInMap("SynthesizerConfig")
        public GetApplicationResponseBodyDataDraftVersionSynthesizerConfig synthesizerConfig;

        /**
         * <p>The tool configuration.</p>
         */
        @NameInMap("ToolConfig")
        public GetApplicationResponseBodyDataDraftVersionToolConfig toolConfig;

        /**
         * <p>The automatic speech recognition (ASR) configuration.</p>
         */
        @NameInMap("TranscriberConfig")
        public GetApplicationResponseBodyDataDraftVersionTranscriberConfig transcriberConfig;

        /**
         * <p>The version ID.</p>
         * 
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

        public GetApplicationResponseBodyDataDraftVersion setLabelConfig(java.util.List<GetApplicationResponseBodyDataDraftVersionLabelConfig> labelConfig) {
            this.labelConfig = labelConfig;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataDraftVersionLabelConfig> getLabelConfig() {
            return this.labelConfig;
        }

        public GetApplicationResponseBodyDataDraftVersion setRagConfig(GetApplicationResponseBodyDataDraftVersionRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionRagConfig getRagConfig() {
            return this.ragConfig;
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

        public GetApplicationResponseBodyDataDraftVersion setToolConfig(GetApplicationResponseBodyDataDraftVersionToolConfig toolConfig) {
            this.toolConfig = toolConfig;
            return this;
        }
        public GetApplicationResponseBodyDataDraftVersionToolConfig getToolConfig() {
            return this.toolConfig;
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

    public static class GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers extends TeaModel {
        @NameInMap("ClosingStatement")
        public String closingStatement;

        @NameInMap("KeyWords")
        public java.util.List<String> keyWords;

        @NameInMap("TriggerType")
        public String triggerType;

        @NameInMap("TurnLimit")
        public Integer turnLimit;

        public static GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers self = new GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers setClosingStatement(String closingStatement) {
            this.closingStatement = closingStatement;
            return this;
        }
        public String getClosingStatement() {
            return this.closingStatement;
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers setKeyWords(java.util.List<String> keyWords) {
            this.keyWords = keyWords;
            return this;
        }
        public java.util.List<String> getKeyWords() {
            return this.keyWords;
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers setTriggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }
        public String getTriggerType() {
            return this.triggerType;
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers setTurnLimit(Integer turnLimit) {
            this.turnLimit = turnLimit;
            return this;
        }
        public Integer getTurnLimit() {
            return this.turnLimit;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig extends TeaModel {
        @NameInMap("Delay")
        public Integer delay;

        @NameInMap("Triggers")
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers> triggers;

        public static GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig self = new GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig setDelay(Integer delay) {
            this.delay = delay;
            return this;
        }
        public Integer getDelay() {
            return this.delay;
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig setTriggers(java.util.List<GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers> triggers) {
            this.triggers = triggers;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfigTriggers> getTriggers() {
            return this.triggers;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig extends TeaModel {
        @NameInMap("MaxRepeats")
        public Integer maxRepeats;

        /**
         * <p>The timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Timeout")
        public Integer timeout;

        public static GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig self = new GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig setMaxRepeats(Integer maxRepeats) {
            this.maxRepeats = maxRepeats;
            return this;
        }
        public Integer getMaxRepeats() {
            return this.maxRepeats;
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
        @NameInMap("BackgroundMusicId")
        public String backgroundMusicId;

        @NameInMap("EndConversationConfig")
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig endConversationConfig;

        @NameInMap("InitialGreetingDelayMilliseconds")
        public Integer initialGreetingDelayMilliseconds;

        /**
         * <p>The silence detection configuration.</p>
         */
        @NameInMap("SilenceDetectionConfig")
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig;

        public static GetApplicationResponseBodyDataPublishedVersionInteractionConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionInteractionConfig self = new GetApplicationResponseBodyDataPublishedVersionInteractionConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfig setBackgroundMusicId(String backgroundMusicId) {
            this.backgroundMusicId = backgroundMusicId;
            return this;
        }
        public String getBackgroundMusicId() {
            return this.backgroundMusicId;
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfig setEndConversationConfig(GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig endConversationConfig) {
            this.endConversationConfig = endConversationConfig;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigEndConversationConfig getEndConversationConfig() {
            return this.endConversationConfig;
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfig setInitialGreetingDelayMilliseconds(Integer initialGreetingDelayMilliseconds) {
            this.initialGreetingDelayMilliseconds = initialGreetingDelayMilliseconds;
            return this;
        }
        public Integer getInitialGreetingDelayMilliseconds() {
            return this.initialGreetingDelayMilliseconds;
        }

        public GetApplicationResponseBodyDataPublishedVersionInteractionConfig setSilenceDetectionConfig(GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig silenceDetectionConfig) {
            this.silenceDetectionConfig = silenceDetectionConfig;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfigSilenceDetectionConfig getSilenceDetectionConfig() {
            return this.silenceDetectionConfig;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionLabelConfig extends TeaModel {
        @NameInMap("CandidateValues")
        public java.util.List<String> candidateValues;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static GetApplicationResponseBodyDataPublishedVersionLabelConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionLabelConfig self = new GetApplicationResponseBodyDataPublishedVersionLabelConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionLabelConfig setCandidateValues(java.util.List<String> candidateValues) {
            this.candidateValues = candidateValues;
            return this;
        }
        public java.util.List<String> getCandidateValues() {
            return this.candidateValues;
        }

        public GetApplicationResponseBodyDataPublishedVersionLabelConfig setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetApplicationResponseBodyDataPublishedVersionLabelConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionRagConfig extends TeaModel {
        /**
         * <p>Specifies whether RAG is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The list of knowledge base IDs.</p>
         */
        @NameInMap("KnowledgeBaseIds")
        public java.util.List<String> knowledgeBaseIds;

        /**
         * <p>The maximum concatenation length of RAG content.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("MaxContentLength")
        public Integer maxContentLength;

        /**
         * <p>The RAG engine.</p>
         * 
         * <strong>example:</strong>
         * <p>BAILIAN</p>
         */
        @NameInMap("RagEngine")
        public String ragEngine;

        /**
         * <p>The maximum number of data entries to retrieve.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TopN")
        public Integer topN;

        public static GetApplicationResponseBodyDataPublishedVersionRagConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionRagConfig self = new GetApplicationResponseBodyDataPublishedVersionRagConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionRagConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetApplicationResponseBodyDataPublishedVersionRagConfig setKnowledgeBaseIds(java.util.List<String> knowledgeBaseIds) {
            this.knowledgeBaseIds = knowledgeBaseIds;
            return this;
        }
        public java.util.List<String> getKnowledgeBaseIds() {
            return this.knowledgeBaseIds;
        }

        public GetApplicationResponseBodyDataPublishedVersionRagConfig setMaxContentLength(Integer maxContentLength) {
            this.maxContentLength = maxContentLength;
            return this;
        }
        public Integer getMaxContentLength() {
            return this.maxContentLength;
        }

        public GetApplicationResponseBodyDataPublishedVersionRagConfig setRagEngine(String ragEngine) {
            this.ragEngine = ragEngine;
            return this;
        }
        public String getRagEngine() {
            return this.ragEngine;
        }

        public GetApplicationResponseBodyDataPublishedVersionRagConfig setTopN(Integer topN) {
            this.topN = topN;
            return this;
        }
        public Integer getTopN() {
            return this.topN;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile extends TeaModel {
        /**
         * <p>The agent configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>b97b6822dd624c32b6c2a54d717db718</p>
         */
        @NameInMap("AgentProfileId")
        public String agentProfileId;

        /**
         * <p>The agent description.</p>
         * 
         * <strong>example:</strong>
         * <p>I am a chatbot</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        /**
         * <p>The prompt in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;prompts&quot;:&quot;I am a chatbot.&quot;}</p>
         */
        @NameInMap("PromptsJson")
        public String promptsJson;

        /**
         * <p>The agent configuration template ID.</p>
         * 
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

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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

    public static class GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta extends TeaModel {
        @NameInMap("FunctionId")
        public String functionId;

        @NameInMap("FunctionName")
        public String functionName;

        @NameInMap("HttpTriggerName")
        public String httpTriggerName;

        @NameInMap("HttpTriggerUrl")
        public String httpTriggerUrl;

        @NameInMap("RegionId")
        public String regionId;

        public static GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta self = new GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta setFunctionId(String functionId) {
            this.functionId = functionId;
            return this;
        }
        public String getFunctionId() {
            return this.functionId;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta setHttpTriggerName(String httpTriggerName) {
            this.httpTriggerName = httpTriggerName;
            return this;
        }
        public String getHttpTriggerName() {
            return this.httpTriggerName;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta setHttpTriggerUrl(String httpTriggerUrl) {
            this.httpTriggerUrl = httpTriggerUrl;
            return this;
        }
        public String getHttpTriggerUrl() {
            return this.httpTriggerUrl;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionScriptProfileNluAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetApplicationResponseBodyDataPublishedVersionScriptProfileNluAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionScriptProfileNluAccessProfile self = new GetApplicationResponseBodyDataPublishedVersionScriptProfileNluAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfileNluAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionScriptProfile extends TeaModel {
        @NameInMap("AgentKey")
        public String agentKey;

        /**
         * <p>The agent configuration information.</p>
         */
        @NameInMap("AgentProfile")
        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile agentProfile;

        @NameInMap("ChatbotId")
        public String chatbotId;

        @NameInMap("FunctionMeta")
        public GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta functionMeta;

        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        @NameInMap("Model")
        public String model;

        @NameInMap("NluAccessProfile")
        public GetApplicationResponseBodyDataPublishedVersionScriptProfileNluAccessProfile nluAccessProfile;

        @NameInMap("NluAccessType")
        public String nluAccessType;

        @NameInMap("NluEngine")
        public String nluEngine;

        @NameInMap("OmniModel")
        public Boolean omniModel;

        /**
         * <p>The probability threshold for nucleus sampling during generation.</p>
         * <blockquote>
         * <ul>
         * <li>For example, when the value is set to 0.8, only the smallest set of most likely tokens whose cumulative probability is greater than or equal to 0.8 is retained as the candidate set.<ul>
         * <li>Valid values: (0, 1.0). A higher value increases randomness in generation. A lower value increases determinism in generation.</li>
         * </ul>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("Temperature")
        public String temperature;

        /**
         * <p>Controls the randomness and diversity of model responses.</p>
         * <blockquote>
         * <ul>
         * <li>Specifically, the temperature value controls the degree of smoothing applied to the probability distribution of each candidate token during text generation. A higher temperature value flattens the probability distribution, allowing more low-probability tokens to be selected, which produces more diverse results. A lower temperature value sharpens the probability distribution, making high-probability tokens more likely to be selected, which produces more deterministic results.</li>
         * <li>Valid values: [0, 2). Setting the value to 0 is not recommended because it is meaningless.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("TopP")
        public String topP;

        public static GetApplicationResponseBodyDataPublishedVersionScriptProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionScriptProfile self = new GetApplicationResponseBodyDataPublishedVersionScriptProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setAgentKey(String agentKey) {
            this.agentKey = agentKey;
            return this;
        }
        public String getAgentKey() {
            return this.agentKey;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setAgentProfile(GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile agentProfile) {
            this.agentProfile = agentProfile;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionScriptProfileAgentProfile getAgentProfile() {
            return this.agentProfile;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setChatbotId(String chatbotId) {
            this.chatbotId = chatbotId;
            return this;
        }
        public String getChatbotId() {
            return this.chatbotId;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setFunctionMeta(GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta functionMeta) {
            this.functionMeta = functionMeta;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionScriptProfileFunctionMeta getFunctionMeta() {
            return this.functionMeta;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setNluAccessProfile(GetApplicationResponseBodyDataPublishedVersionScriptProfileNluAccessProfile nluAccessProfile) {
            this.nluAccessProfile = nluAccessProfile;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionScriptProfileNluAccessProfile getNluAccessProfile() {
            return this.nluAccessProfile;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setNluAccessType(String nluAccessType) {
            this.nluAccessType = nluAccessType;
            return this;
        }
        public String getNluAccessType() {
            return this.nluAccessType;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setNluEngine(String nluEngine) {
            this.nluEngine = nluEngine;
            return this;
        }
        public String getNluEngine() {
            return this.nluEngine;
        }

        public GetApplicationResponseBodyDataPublishedVersionScriptProfile setOmniModel(Boolean omniModel) {
            this.omniModel = omniModel;
            return this;
        }
        public Boolean getOmniModel() {
            return this.omniModel;
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

    public static class GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile self = new GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules self = new GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig extends TeaModel {
        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p>The TTS invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p>The TTS engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        /**
         * <p>The pitch rate.</p>
         * <blockquote>
         * <p>Valid values: -500 to 500.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("PitchRate")
        public Integer pitchRate;

        @NameInMap("PronRules")
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules> pronRules;

        /**
         * <p>The speech rate.</p>
         * <blockquote>
         * <p>Valid values: -500 to 500.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-20</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>The voice.</p>
         * 
         * <strong>example:</strong>
         * <p>aixia</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The volume.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig self = new GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setNlsAccessProfile(GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
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

        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig setPronRules(java.util.List<GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules> pronRules) {
            this.pronRules = pronRules;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionSynthesizerConfigPronRules> getPronRules() {
            return this.pronRules;
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

    public static class GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers extends TeaModel {
        /**
         * <p>The base URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com">https://example.com</a></p>
         */
        @NameInMap("BaseUrl")
        public String baseUrl;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>phone-ai-call</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The SSE endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>/phone-ai-call/mcp/sse?key=value</p>
         */
        @NameInMap("SseEndpoint")
        public String sseEndpoint;

        public static GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers self = new GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        public String getBaseUrl() {
            return this.baseUrl;
        }

        public GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers setSseEndpoint(String sseEndpoint) {
            this.sseEndpoint = sseEndpoint;
            return this;
        }
        public String getSseEndpoint() {
            return this.sseEndpoint;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionToolConfig extends TeaModel {
        /**
         * <p>The list of MCP server configurations.</p>
         */
        @NameInMap("McpServers")
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers> mcpServers;

        public static GetApplicationResponseBodyDataPublishedVersionToolConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionToolConfig self = new GetApplicationResponseBodyDataPublishedVersionToolConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionToolConfig setMcpServers(java.util.List<GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers> mcpServers) {
            this.mcpServers = mcpServers;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionToolConfigMcpServers> getMcpServers() {
            return this.mcpServers;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules extends TeaModel {
        @NameInMap("Pattern")
        public String pattern;

        @NameInMap("Replacement")
        public String replacement;

        public static GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules self = new GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules setReplacement(String replacement) {
            this.replacement = replacement;
            return this;
        }
        public String getReplacement() {
            return this.replacement;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile extends TeaModel {
        @NameInMap("AccessProfileId")
        public String accessProfileId;

        public static GetApplicationResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile self = new GetApplicationResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile setAccessProfileId(String accessProfileId) {
            this.accessProfileId = accessProfileId;
            return this;
        }
        public String getAccessProfileId() {
            return this.accessProfileId;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersionTranscriberConfig extends TeaModel {
        @NameInMap("CorrectionRules")
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules> correctionRules;

        @NameInMap("CustomizationId")
        public String customizationId;

        @NameInMap("EndSilenceTimeout")
        public Integer endSilenceTimeout;

        @NameInMap("Model")
        public String model;

        @NameInMap("NlsAccessProfile")
        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile nlsAccessProfile;

        /**
         * <p>The ASR invocation method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NlsAccessType")
        public String nlsAccessType;

        /**
         * <p>The ASR engine.</p>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("NlsEngine")
        public String nlsEngine;

        @NameInMap("SpeechNoiseThreshold")
        public Integer speechNoiseThreshold;

        @NameInMap("VocabularyId")
        public String vocabularyId;

        public static GetApplicationResponseBodyDataPublishedVersionTranscriberConfig build(java.util.Map<String, ?> map) throws Exception {
            GetApplicationResponseBodyDataPublishedVersionTranscriberConfig self = new GetApplicationResponseBodyDataPublishedVersionTranscriberConfig();
            return TeaModel.build(map, self);
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setCorrectionRules(java.util.List<GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules> correctionRules) {
            this.correctionRules = correctionRules;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionTranscriberConfigCorrectionRules> getCorrectionRules() {
            return this.correctionRules;
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setCustomizationId(String customizationId) {
            this.customizationId = customizationId;
            return this;
        }
        public String getCustomizationId() {
            return this.customizationId;
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setEndSilenceTimeout(Integer endSilenceTimeout) {
            this.endSilenceTimeout = endSilenceTimeout;
            return this;
        }
        public Integer getEndSilenceTimeout() {
            return this.endSilenceTimeout;
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setNlsAccessProfile(GetApplicationResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile nlsAccessProfile) {
            this.nlsAccessProfile = nlsAccessProfile;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfigNlsAccessProfile getNlsAccessProfile() {
            return this.nlsAccessProfile;
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

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setSpeechNoiseThreshold(Integer speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }
        public Integer getSpeechNoiseThreshold() {
            return this.speechNoiseThreshold;
        }

        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

    }

    public static class GetApplicationResponseBodyDataPublishedVersion extends TeaModel {
        /**
         * <p>The interaction configuration.</p>
         */
        @NameInMap("InteractionConfig")
        public GetApplicationResponseBodyDataPublishedVersionInteractionConfig interactionConfig;

        @NameInMap("LabelConfig")
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionLabelConfig> labelConfig;

        /**
         * <p>The RAG configuration.</p>
         */
        @NameInMap("RagConfig")
        public GetApplicationResponseBodyDataPublishedVersionRagConfig ragConfig;

        /**
         * <p>The application model configuration.</p>
         */
        @NameInMap("ScriptProfile")
        public GetApplicationResponseBodyDataPublishedVersionScriptProfile scriptProfile;

        /**
         * <p>The text-to-speech (TTS) configuration.</p>
         */
        @NameInMap("SynthesizerConfig")
        public GetApplicationResponseBodyDataPublishedVersionSynthesizerConfig synthesizerConfig;

        /**
         * <p>The tool configuration.</p>
         */
        @NameInMap("ToolConfig")
        public GetApplicationResponseBodyDataPublishedVersionToolConfig toolConfig;

        /**
         * <p>The automatic speech recognition (ASR) configuration.</p>
         */
        @NameInMap("TranscriberConfig")
        public GetApplicationResponseBodyDataPublishedVersionTranscriberConfig transcriberConfig;

        /**
         * <p>The version ID.</p>
         * 
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

        public GetApplicationResponseBodyDataPublishedVersion setLabelConfig(java.util.List<GetApplicationResponseBodyDataPublishedVersionLabelConfig> labelConfig) {
            this.labelConfig = labelConfig;
            return this;
        }
        public java.util.List<GetApplicationResponseBodyDataPublishedVersionLabelConfig> getLabelConfig() {
            return this.labelConfig;
        }

        public GetApplicationResponseBodyDataPublishedVersion setRagConfig(GetApplicationResponseBodyDataPublishedVersionRagConfig ragConfig) {
            this.ragConfig = ragConfig;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionRagConfig getRagConfig() {
            return this.ragConfig;
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

        public GetApplicationResponseBodyDataPublishedVersion setToolConfig(GetApplicationResponseBodyDataPublishedVersionToolConfig toolConfig) {
            this.toolConfig = toolConfig;
            return this;
        }
        public GetApplicationResponseBodyDataPublishedVersionToolConfig getToolConfig() {
            return this.toolConfig;
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
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a395011f-a247-400f-bc69-28796749fd52</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The call concurrency, which is the number of calls being made simultaneously.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Concurrency")
        public Integer concurrency;

        /**
         * <p>The time when the application was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1730081561000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The application description.</p>
         * 
         * <strong>example:</strong>
         * <p>Describe this application</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The draft version configuration content.</p>
         */
        @NameInMap("DraftVersion")
        public GetApplicationResponseBodyDataDraftVersion draftVersion;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test001</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The NLU access method.</p>
         * 
         * <strong>example:</strong>
         * <p>MANAGED</p>
         */
        @NameInMap("NluAccessType")
        public String nluAccessType;

        /**
         * <p>The NLU engine.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMPTS</p>
         */
        @NameInMap("NluEngine")
        public String nluEngine;

        /**
         * <p>The published application version.</p>
         */
        @NameInMap("PublishedVersion")
        public GetApplicationResponseBodyDataPublishedVersion publishedVersion;

        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the application was last modified.</p>
         * 
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

        public GetApplicationResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
