// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateManagedAgentRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateManagedAgentRequestBody body;

    /**
     * <p>The reserved idempotency token. The backend does not provide idempotency guarantees in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateManagedAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateManagedAgentRequest self = new UpdateManagedAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateManagedAgentRequest setBody(UpdateManagedAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateManagedAgentRequestBody getBody() {
        return this.body;
    }

    public UpdateManagedAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateManagedAgentRequestBodyEnvironmentCredentialReferences extends TeaModel {
        /**
         * <p>The credential ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-1</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        public static UpdateManagedAgentRequestBodyEnvironmentCredentialReferences build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyEnvironmentCredentialReferences self = new UpdateManagedAgentRequestBodyEnvironmentCredentialReferences();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyEnvironmentCredentialReferences setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

    }

    public static class UpdateManagedAgentRequestBodyEnvironmentVariables extends TeaModel {
        /**
         * <p>The environment variable name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The environment variable value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxxx</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateManagedAgentRequestBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyEnvironmentVariables self = new UpdateManagedAgentRequestBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateManagedAgentRequestBodyEnvironment extends TeaModel {
        /**
         * <p>The list of credential references.</p>
         */
        @NameInMap("credentialReferences")
        public java.util.List<UpdateManagedAgentRequestBodyEnvironmentCredentialReferences> credentialReferences;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<UpdateManagedAgentRequestBodyEnvironmentVariables> variables;

        public static UpdateManagedAgentRequestBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyEnvironment self = new UpdateManagedAgentRequestBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyEnvironment setCredentialReferences(java.util.List<UpdateManagedAgentRequestBodyEnvironmentCredentialReferences> credentialReferences) {
            this.credentialReferences = credentialReferences;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyEnvironmentCredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        public UpdateManagedAgentRequestBodyEnvironment setVariables(java.util.List<UpdateManagedAgentRequestBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateManagedAgentRequestBodyModel extends TeaModel {
        /**
         * <p>The model connection ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("modelConnectionId")
        public String modelConnectionId;

        /**
         * <p>The upstream model name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        public static UpdateManagedAgentRequestBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyModel self = new UpdateManagedAgentRequestBodyModel();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public UpdateManagedAgentRequestBodyModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class UpdateManagedAgentRequestBodyNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow access to the Internet.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateManagedAgentRequestBodyNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyNetworkAccessInternet self = new UpdateManagedAgentRequestBodyNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateManagedAgentRequestBodyNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether to allow access to the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateManagedAgentRequestBodyNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyNetworkAccessVpc self = new UpdateManagedAgentRequestBodyNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateManagedAgentRequestBodyNetwork extends TeaModel {
        /**
         * <p>The public network access configuration.</p>
         */
        @NameInMap("accessInternet")
        public UpdateManagedAgentRequestBodyNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configuration.</p>
         */
        @NameInMap("accessVpc")
        public UpdateManagedAgentRequestBodyNetworkAccessVpc accessVpc;

        public static UpdateManagedAgentRequestBodyNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyNetwork self = new UpdateManagedAgentRequestBodyNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyNetwork setAccessInternet(UpdateManagedAgentRequestBodyNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public UpdateManagedAgentRequestBodyNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public UpdateManagedAgentRequestBodyNetwork setAccessVpc(UpdateManagedAgentRequestBodyNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public UpdateManagedAgentRequestBodyNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class UpdateManagedAgentRequestBodyRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static UpdateManagedAgentRequestBodyRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyRuntimeCompute self = new UpdateManagedAgentRequestBodyRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class UpdateManagedAgentRequestBodyRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The HTTP header name used for session affinity. This parameter takes effect only when sessionPolicy.type is set to ISOLATED_HEADER_FIELD.</p>
         * 
         * <strong>example:</strong>
         * <p>X-Session-Id</p>
         */
        @NameInMap("headerName")
        public String headerName;

        /**
         * <p>The session policy type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DISABLED</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateManagedAgentRequestBodyRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyRuntimeSessionPolicy self = new UpdateManagedAgentRequestBodyRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public UpdateManagedAgentRequestBodyRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateManagedAgentRequestBodyRuntime extends TeaModel {
        /**
         * <p>The compute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public UpdateManagedAgentRequestBodyRuntimeCompute compute;

        /**
         * <p>The session policy configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public UpdateManagedAgentRequestBodyRuntimeSessionPolicy sessionPolicy;

        public static UpdateManagedAgentRequestBodyRuntime build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyRuntime self = new UpdateManagedAgentRequestBodyRuntime();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyRuntime setCompute(UpdateManagedAgentRequestBodyRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public UpdateManagedAgentRequestBodyRuntimeCompute getCompute() {
            return this.compute;
        }

        public UpdateManagedAgentRequestBodyRuntime setSessionPolicy(UpdateManagedAgentRequestBodyRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public UpdateManagedAgentRequestBodyRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class UpdateManagedAgentRequestBodySkills extends TeaModel {
        /**
         * <p>The skill name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-analysis</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static UpdateManagedAgentRequestBodySkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodySkills self = new UpdateManagedAgentRequestBodySkills();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodySkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateManagedAgentRequestBodySubAgents extends TeaModel {
        /**
         * <p>The sub-agent instruction.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Please review the code</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The sub-agent name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reviewer-agent</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateManagedAgentRequestBodySubAgents build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodySubAgents self = new UpdateManagedAgentRequestBodySubAgents();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodySubAgents setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateManagedAgentRequestBodySubAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateManagedAgentRequestBodyTemplateAiRegistry extends TeaModel {
        /**
         * <p>The name of the template in the AI registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-template</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the template in the AI registry.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static UpdateManagedAgentRequestBodyTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyTemplateAiRegistry self = new UpdateManagedAgentRequestBodyTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodyTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateManagedAgentRequestBodyTemplate extends TeaModel {
        /**
         * <p>The AI registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public UpdateManagedAgentRequestBodyTemplateAiRegistry aiRegistry;

        public static UpdateManagedAgentRequestBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyTemplate self = new UpdateManagedAgentRequestBodyTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyTemplate setAiRegistry(UpdateManagedAgentRequestBodyTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public UpdateManagedAgentRequestBodyTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class UpdateManagedAgentRequestBodyTools extends TeaModel {
        /**
         * <p>The tool name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-reviewer</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The tool type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateManagedAgentRequestBodyTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyTools self = new UpdateManagedAgentRequestBodyTools();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodyTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateManagedAgentRequestBody extends TeaModel {
        /**
         * <p>The description of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>An agent for code review</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment configuration.</p>
         */
        @NameInMap("environment")
        public UpdateManagedAgentRequestBodyEnvironment environment;

        /**
         * <p>The agent instruction that guides the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The model configuration.</p>
         */
        @NameInMap("model")
        public UpdateManagedAgentRequestBodyModel model;

        /**
         * <p>The name of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("network")
        public UpdateManagedAgentRequestBodyNetwork network;

        /**
         * <p>The runtime configuration.</p>
         */
        @NameInMap("runtime")
        public UpdateManagedAgentRequestBodyRuntime runtime;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<UpdateManagedAgentRequestBodySkills> skills;

        /**
         * <p>The list of sub-agent configurations.</p>
         */
        @NameInMap("subAgents")
        public java.util.List<UpdateManagedAgentRequestBodySubAgents> subAgents;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public UpdateManagedAgentRequestBodyTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<UpdateManagedAgentRequestBodyTools> tools;

        public static UpdateManagedAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBody self = new UpdateManagedAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateManagedAgentRequestBody setEnvironment(UpdateManagedAgentRequestBodyEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public UpdateManagedAgentRequestBodyEnvironment getEnvironment() {
            return this.environment;
        }

        public UpdateManagedAgentRequestBody setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateManagedAgentRequestBody setModel(UpdateManagedAgentRequestBodyModel model) {
            this.model = model;
            return this;
        }
        public UpdateManagedAgentRequestBodyModel getModel() {
            return this.model;
        }

        public UpdateManagedAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBody setNetwork(UpdateManagedAgentRequestBodyNetwork network) {
            this.network = network;
            return this;
        }
        public UpdateManagedAgentRequestBodyNetwork getNetwork() {
            return this.network;
        }

        public UpdateManagedAgentRequestBody setRuntime(UpdateManagedAgentRequestBodyRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public UpdateManagedAgentRequestBodyRuntime getRuntime() {
            return this.runtime;
        }

        public UpdateManagedAgentRequestBody setSkills(java.util.List<UpdateManagedAgentRequestBodySkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodySkills> getSkills() {
            return this.skills;
        }

        public UpdateManagedAgentRequestBody setSubAgents(java.util.List<UpdateManagedAgentRequestBodySubAgents> subAgents) {
            this.subAgents = subAgents;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodySubAgents> getSubAgents() {
            return this.subAgents;
        }

        public UpdateManagedAgentRequestBody setTemplate(UpdateManagedAgentRequestBodyTemplate template) {
            this.template = template;
            return this;
        }
        public UpdateManagedAgentRequestBodyTemplate getTemplate() {
            return this.template;
        }

        public UpdateManagedAgentRequestBody setTools(java.util.List<UpdateManagedAgentRequestBodyTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyTools> getTools() {
            return this.tools;
        }

    }

}
