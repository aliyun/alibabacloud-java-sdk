// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220602.models;

import com.aliyun.tea.*;

public class CreateAgentSessionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2072736942627512345</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2.0</p>
     */
    @NameInMap("Jsonrpc")
    public String jsonrpc;

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
         * <strong>example:</strong>
         * <p>hologres</p>
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
         * <strong>example:</strong>
         * <p>holo</p>
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
         * <strong>example:</strong>
         * <p>CHAT_HOLOGRES</p>
         */
        @NameInMap("SessionSource")
        public String sessionSource;

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
         * <strong>example:</strong>
         * <p>cli</p>
         */
        @NameInMap("ExecutionLane")
        public String executionLane;

        /**
         * <strong>example:</strong>
         * <p>yolo</p>
         */
        @NameInMap("Mode")
        public String mode;

        /**
         * <strong>example:</strong>
         * <p>rg-acfmvqsnvkfr2sa</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
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
        @NameInMap("Agent")
        public CreateAgentSessionRequestParamsMetaAgent agent;

        @NameInMap("Config")
        public CreateAgentSessionRequestParamsMetaConfig config;

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
