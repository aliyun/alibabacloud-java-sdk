// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentSessionRequest extends TeaModel {
    /**
     * <p>The ID passed by the requester. The value is returned as is.</p>
     * 
     * <strong>example:</strong>
     * <p>4758330557805415712</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed to 2.0.</p>
     * 
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

    /**
     * <p>The business parameters.</p>
     */
    @NameInMap("Params")
    public CreateAgentSessionRequestParams params;

    public static CreateAgentSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentSessionRequest self = new CreateAgentSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentSessionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateAgentSessionRequest setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
        return this;
    }
    public String getJsonrpc() {
        return this.jsonrpc;
    }

    public CreateAgentSessionRequest setParams(CreateAgentSessionRequestParams params) {
        this.params = params;
        return this;
    }
    public CreateAgentSessionRequestParams getParams() {
        return this.params;
    }

    public static class CreateAgentSessionRequestParamsMetaAgent extends TeaModel {
        /**
         * <p>The name of the agent bound to the session. This parameter is required. Valid values:</p>
         * <ul>
         * <li>dataworks_data_agent: DataWorks built-in agent - Data Agent. It provides AI capabilities for the entire data development lifecycle, including data integration, development, O&amp;M, governance, and analysis.</li>
         * <li>dataworks_chatbi_agent: DataWorks built-in agent - ChatBI. Based on natural language processing and intelligent analysis technologies, it automates the entire analysis process from requirement parsing, data extraction, and automatic code generation to visual report output through conversational interaction.</li>
         * <li>dataworks_ai_assistant_agent: DataWorks built-in agent - AI Assistant. An enterprise-grade AI assistant for DataWorks built on open-source frameworks such as OpenClaw and Hermes Agent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dataworks_data_agent</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        public static CreateAgentSessionRequestParamsMetaAgent build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionRequestParamsMetaAgent self = new CreateAgentSessionRequestParamsMetaAgent();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionRequestParamsMetaAgent setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

    }

    public static class CreateAgentSessionRequestParamsMetaConfigSessionTags extends TeaModel {
        /**
         * <p>The session tag. You can filter sessions based on session tags. For example, if you use a fixed RAM user to call an API operation but the calling system has its own account system, and you need to filter the session list based on the account ID, you can pass the account ID of the calling system as this tag. The value can be up to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>chatbi</p>
         */
        @NameInMap("SessionTagCode")
        public String sessionTagCode;

        public static CreateAgentSessionRequestParamsMetaConfigSessionTags build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionRequestParamsMetaConfigSessionTags self = new CreateAgentSessionRequestParamsMetaConfigSessionTags();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionRequestParamsMetaConfigSessionTags setSessionTagCode(String sessionTagCode) {
            this.sessionTagCode = sessionTagCode;
            return this;
        }
        public String getSessionTagCode() {
            return this.sessionTagCode;
        }

    }

    public static class CreateAgentSessionRequestParamsMetaConfig extends TeaModel {
        /**
         * <p>The session source identifier, which facilitates retrieval by source. For example, if an agent is used on both Page A and Page B, and you want to display only sessions created on Page A when you are on Page A, you can filter sessions based on this parameter. The value can be up to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>openapi_sdk</p>
         */
        @NameInMap("SessionSource")
        public String sessionSource;

        /**
         * <p>The list of session tags. You can search and filter sessions based on session tags later.</p>
         */
        @NameInMap("SessionTags")
        public java.util.List<CreateAgentSessionRequestParamsMetaConfigSessionTags> sessionTags;

        public static CreateAgentSessionRequestParamsMetaConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionRequestParamsMetaConfig self = new CreateAgentSessionRequestParamsMetaConfig();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionRequestParamsMetaConfig setSessionSource(String sessionSource) {
            this.sessionSource = sessionSource;
            return this;
        }
        public String getSessionSource() {
            return this.sessionSource;
        }

        public CreateAgentSessionRequestParamsMetaConfig setSessionTags(java.util.List<CreateAgentSessionRequestParamsMetaConfigSessionTags> sessionTags) {
            this.sessionTags = sessionTags;
            return this;
        }
        public java.util.List<CreateAgentSessionRequestParamsMetaConfigSessionTags> getSessionTags() {
            return this.sessionTags;
        }

    }

    public static class CreateAgentSessionRequestParamsMetaInitialConfigOptions extends TeaModel {
        /**
         * <p>The compute unit (CU) specifications of the session instance. Only 2, 4, 8, and 12 are supported. If this parameter is omitted, the instance CU is not specified, and reuse in shared mode is not constrained by the CU. If this parameter is specified, shared mode reuses only instances with the same CU. If the CU does not match, a new instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public String cu;

        /**
         * <p>Execution mode:</p>
         * <ul>
         * <li>chat: conversation-only mode, suitable for simple data querying and Q&amp;A scenarios. The advantage is that it is fast and consumes fewer tokens, but the disadvantage is that it cannot handle complex problems.</li>
         * <li>cli: sandbox mode, suitable for complex data analytics, data processing, and code writing scenarios. The advantage is that it can handle complex problems, and the model independently analyzes and handles problems. The disadvantage is that the processing speed is slower and token consumption is higher compared to the chat mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>chat，cli</p>
         */
        @NameInMap("ExecutionLane")
        public String executionLane;

        /**
         * <p>The authorization mode for script execution. OpenAPI currently supports only the yolo mode. Valid values:</p>
         * <ul>
         * <li>yolo: automatic authorization. No manual intervention is required, and the model can process automatically.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yolo</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The model ID. Use the full model identifier supported by the target environment. If this parameter is omitted, the default model is used. If this parameter is passed, the server verifies its availability and applies it before the session is created.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen3.7-max(openai)</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The DataWorks workspace ID. It is used to initialize the session project context. If this parameter is omitted, it is processed as having no project. The project context can be corrected or switched later by the project context of PromptAgentSession.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The reasoning configuration. The value must be supported by the target model. A value of none disables reasoning, and default uses the model\&quot;s default configuration. If an unsupported value is used or the configuration fails to apply, session creation fails. If this parameter is omitted, the existing reasoning configuration is not modified. A successful configuration updates the default value of the daemon workspace, which affects not only the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("ReasoningEffort")
        public String reasoningEffort;

        /**
         * <p>The ID of the resource group used for initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_123123123_564657857</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The names of the loaded custom skills. Separate multiple names with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>skill-name-1,skill-name2,skill-name-3</p>
         */
        @NameInMap("Skills")
        public String skills;

        public static CreateAgentSessionRequestParamsMetaInitialConfigOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionRequestParamsMetaInitialConfigOptions self = new CreateAgentSessionRequestParamsMetaInitialConfigOptions();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionRequestParamsMetaInitialConfigOptions setCu(String cu) {
            this.cu = cu;
            return this;
        }
        public String getCu() {
            return this.cu;
        }

        public CreateAgentSessionRequestParamsMetaInitialConfigOptions setExecutionLane(String executionLane) {
            this.executionLane = executionLane;
            return this;
        }
        public String getExecutionLane() {
            return this.executionLane;
        }

        public CreateAgentSessionRequestParamsMetaInitialConfigOptions setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

        public CreateAgentSessionRequestParamsMetaInitialConfigOptions setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public CreateAgentSessionRequestParamsMetaInitialConfigOptions setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateAgentSessionRequestParamsMetaInitialConfigOptions setReasoningEffort(String reasoningEffort) {
            this.reasoningEffort = reasoningEffort;
            return this;
        }
        public String getReasoningEffort() {
            return this.reasoningEffort;
        }

        public CreateAgentSessionRequestParamsMetaInitialConfigOptions setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public CreateAgentSessionRequestParamsMetaInitialConfigOptions setSkills(String skills) {
            this.skills = skills;
            return this;
        }
        public String getSkills() {
            return this.skills;
        }

    }

    public static class CreateAgentSessionRequestParamsMeta extends TeaModel {
        /**
         * <p>The agent configuration for the session. Valid values are the results returned by the ListAgents operation.</p>
         */
        @NameInMap("Agent")
        public CreateAgentSessionRequestParamsMetaAgent agent;

        /**
         * <p>The session parameter settings, such as filter parameter settings based on the session source and session tags.</p>
         */
        @NameInMap("Config")
        public CreateAgentSessionRequestParamsMetaConfig config;

        /**
         * <p>The advanced parameter settings for the agent execution environment.</p>
         */
        @NameInMap("InitialConfigOptions")
        public CreateAgentSessionRequestParamsMetaInitialConfigOptions initialConfigOptions;

        public static CreateAgentSessionRequestParamsMeta build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionRequestParamsMeta self = new CreateAgentSessionRequestParamsMeta();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionRequestParamsMeta setAgent(CreateAgentSessionRequestParamsMetaAgent agent) {
            this.agent = agent;
            return this;
        }
        public CreateAgentSessionRequestParamsMetaAgent getAgent() {
            return this.agent;
        }

        public CreateAgentSessionRequestParamsMeta setConfig(CreateAgentSessionRequestParamsMetaConfig config) {
            this.config = config;
            return this;
        }
        public CreateAgentSessionRequestParamsMetaConfig getConfig() {
            return this.config;
        }

        public CreateAgentSessionRequestParamsMeta setInitialConfigOptions(CreateAgentSessionRequestParamsMetaInitialConfigOptions initialConfigOptions) {
            this.initialConfigOptions = initialConfigOptions;
            return this;
        }
        public CreateAgentSessionRequestParamsMetaInitialConfigOptions getInitialConfigOptions() {
            return this.initialConfigOptions;
        }

    }

    public static class CreateAgentSessionRequestParams extends TeaModel {
        /**
         * <p>The extended metadata that carries agent binding, session source, and tags.</p>
         */
        @NameInMap("Meta")
        public CreateAgentSessionRequestParamsMeta meta;

        public static CreateAgentSessionRequestParams build(java.util.Map<String, ?> map) throws Exception {
            CreateAgentSessionRequestParams self = new CreateAgentSessionRequestParams();
            return TeaModel.build(map, self);
        }

        public CreateAgentSessionRequestParams setMeta(CreateAgentSessionRequestParamsMeta meta) {
            this.meta = meta;
            return this;
        }
        public CreateAgentSessionRequestParamsMeta getMeta() {
            return this.meta;
        }

    }

}
