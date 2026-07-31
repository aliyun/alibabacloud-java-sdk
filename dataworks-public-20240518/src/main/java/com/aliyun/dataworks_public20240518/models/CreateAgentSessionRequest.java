// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateAgentSessionRequest extends TeaModel {
    /**
     * <p>The request ID passed by the caller. The value is returned as-is.</p>
     * 
     * <strong>example:</strong>
     * <p>4758330557805415712</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The JSON-RPC version. Fixed value: 2.0.</p>
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
         * <p>The name of the agent bound to the session. This parameter is required.</p>
         * <ul>
         * <li>dataworks_data_agent: DataWorks built-in agent — Data Agent, which provides intelligent data development AI capabilities covering the entire workflow of data integration, development, O&amp;M, governance, and analytics.</li>
         * <li>dataworks_chatbi_agent: DataWorks built-in agent — ChatBI, which uses natural language processing and intelligent analytics technologies to automate the entire analysis workflow from requirement parsing, data extraction, and automatic code generation to visualization report output through conversational interaction.</li>
         * <li>dataworks_ai_assistant_agent: DataWorks built-in agent — AI Assistant Service, which is a DataWorks enterprise-grade dedicated AI assistant built on open source frameworks such as OpenClaw and Hermes Agent.</li>
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
         * <p>The session tag. You can filter sessions based on session tags. For example, if you use a fixed RAM user to call OpenAPI operations but your calling system has its own account system, you can pass the account ID of your calling system as this tag to filter the session list by account ID. The value can be up to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
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
         * <p>The session source identifier for retrieval by source. For example, if an agent is used on both page A and page B, and you want page A to display only sessions created from page A, you can filter based on this parameter. The value can be up to 128 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>openapi_sdk</p>
         */
        @NameInMap("SessionSource")
        public String sessionSource;

        /**
         * <p>The list of session tags. You can use session tags for search and filtering.</p>
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
         * <p>The exec mode. Valid values:</p>
         * <ul>
         * <li>chat: conversation mode only. Suitable for simple Q&amp;A scenarios. Advantages: fast response and low token consumption. Disadvantages: cannot handle complex problems.</li>
         * <li>cli: sandbox mode. Suitable for complex data analytics, data processing, and code writing scenarios. Advantages: can handle complex problems with the model autonomously performing analysis and problem resolution. Disadvantages: slower processing speed and higher token consumption compared to chat mode.</li>
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
         * <li>yolo: automatic authorization. No human intervention is required, and the model can process tasks automatically.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yolo</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <p>The ID of the resource group used for initialization.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_123123123_564657857</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The names of custom skills to load. Separate multiple names with commas (,).</p>
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
         * <p>The session parameter settings, such as filtering parameter settings based on session source and session tags.</p>
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
         * <p>The extended metadata that carries agent binding, session source, tags, and other information.</p>
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
