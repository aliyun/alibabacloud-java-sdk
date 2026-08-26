// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateManagedAgentRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateManagedAgentRequestBody body;

    /**
     * <p>The reserved idempotency token. The backend does not provide idempotency guarantees in the current phase.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateManagedAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateManagedAgentRequest self = new CreateManagedAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateManagedAgentRequest setBody(CreateManagedAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateManagedAgentRequestBody getBody() {
        return this.body;
    }

    public CreateManagedAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateManagedAgentRequestBodyEnvironmentCredentialReferences extends TeaModel {
        /**
         * <p>The credential ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-1</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        public static CreateManagedAgentRequestBodyEnvironmentCredentialReferences build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyEnvironmentCredentialReferences self = new CreateManagedAgentRequestBodyEnvironmentCredentialReferences();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyEnvironmentCredentialReferences setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

    }

    public static class CreateManagedAgentRequestBodyEnvironmentVariables extends TeaModel {
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

        public static CreateManagedAgentRequestBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyEnvironmentVariables self = new CreateManagedAgentRequestBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentRequestBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateManagedAgentRequestBodyEnvironment extends TeaModel {
        /**
         * <p>The list of credential references.</p>
         */
        @NameInMap("credentialReferences")
        public java.util.List<CreateManagedAgentRequestBodyEnvironmentCredentialReferences> credentialReferences;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<CreateManagedAgentRequestBodyEnvironmentVariables> variables;

        public static CreateManagedAgentRequestBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyEnvironment self = new CreateManagedAgentRequestBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyEnvironment setCredentialReferences(java.util.List<CreateManagedAgentRequestBodyEnvironmentCredentialReferences> credentialReferences) {
            this.credentialReferences = credentialReferences;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodyEnvironmentCredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        public CreateManagedAgentRequestBodyEnvironment setVariables(java.util.List<CreateManagedAgentRequestBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class CreateManagedAgentRequestBodyModel extends TeaModel {
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

        public static CreateManagedAgentRequestBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyModel self = new CreateManagedAgentRequestBodyModel();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public CreateManagedAgentRequestBodyModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class CreateManagedAgentRequestBodyNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow access to the Internet.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateManagedAgentRequestBodyNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyNetworkAccessInternet self = new CreateManagedAgentRequestBodyNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateManagedAgentRequestBodyNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether to allow access to the VPC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateManagedAgentRequestBodyNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyNetworkAccessVpc self = new CreateManagedAgentRequestBodyNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateManagedAgentRequestBodyNetwork extends TeaModel {
        /**
         * <p>The public network access configuration.</p>
         */
        @NameInMap("accessInternet")
        public CreateManagedAgentRequestBodyNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configuration.</p>
         */
        @NameInMap("accessVpc")
        public CreateManagedAgentRequestBodyNetworkAccessVpc accessVpc;

        public static CreateManagedAgentRequestBodyNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyNetwork self = new CreateManagedAgentRequestBodyNetwork();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyNetwork setAccessInternet(CreateManagedAgentRequestBodyNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public CreateManagedAgentRequestBodyNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public CreateManagedAgentRequestBodyNetwork setAccessVpc(CreateManagedAgentRequestBodyNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public CreateManagedAgentRequestBodyNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class CreateManagedAgentRequestBodyRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static CreateManagedAgentRequestBodyRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyRuntimeCompute self = new CreateManagedAgentRequestBodyRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class CreateManagedAgentRequestBodyRuntimeSessionPolicy extends TeaModel {
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

        public static CreateManagedAgentRequestBodyRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyRuntimeSessionPolicy self = new CreateManagedAgentRequestBodyRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public CreateManagedAgentRequestBodyRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateManagedAgentRequestBodyRuntime extends TeaModel {
        /**
         * <p>The compute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public CreateManagedAgentRequestBodyRuntimeCompute compute;

        /**
         * <p>The session policy configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public CreateManagedAgentRequestBodyRuntimeSessionPolicy sessionPolicy;

        public static CreateManagedAgentRequestBodyRuntime build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyRuntime self = new CreateManagedAgentRequestBodyRuntime();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyRuntime setCompute(CreateManagedAgentRequestBodyRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public CreateManagedAgentRequestBodyRuntimeCompute getCompute() {
            return this.compute;
        }

        public CreateManagedAgentRequestBodyRuntime setSessionPolicy(CreateManagedAgentRequestBodyRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public CreateManagedAgentRequestBodyRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class CreateManagedAgentRequestBodySkills extends TeaModel {
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

        public static CreateManagedAgentRequestBodySkills build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodySkills self = new CreateManagedAgentRequestBodySkills();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentRequestBodySkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateManagedAgentRequestBodySubAgents extends TeaModel {
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

        public static CreateManagedAgentRequestBodySubAgents build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodySubAgents self = new CreateManagedAgentRequestBodySubAgents();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodySubAgents setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateManagedAgentRequestBodySubAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateManagedAgentRequestBodyTemplateAiRegistry extends TeaModel {
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

        public static CreateManagedAgentRequestBodyTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyTemplateAiRegistry self = new CreateManagedAgentRequestBodyTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentRequestBodyTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateManagedAgentRequestBodyTemplate extends TeaModel {
        /**
         * <p>The AI registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public CreateManagedAgentRequestBodyTemplateAiRegistry aiRegistry;

        public static CreateManagedAgentRequestBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyTemplate self = new CreateManagedAgentRequestBodyTemplate();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyTemplate setAiRegistry(CreateManagedAgentRequestBodyTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public CreateManagedAgentRequestBodyTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class CreateManagedAgentRequestBodyTools extends TeaModel {
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

        public static CreateManagedAgentRequestBodyTools build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyTools self = new CreateManagedAgentRequestBodyTools();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentRequestBodyTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateManagedAgentRequestBody extends TeaModel {
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
        public CreateManagedAgentRequestBodyEnvironment environment;

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
         * <p>This parameter is required.</p>
         */
        @NameInMap("model")
        public CreateManagedAgentRequestBodyModel model;

        /**
         * <p>The name of the managed agent.</p>
         * <p>This parameter is required.</p>
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
        public CreateManagedAgentRequestBodyNetwork network;

        /**
         * <p>The runtime configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("runtime")
        public CreateManagedAgentRequestBodyRuntime runtime;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<CreateManagedAgentRequestBodySkills> skills;

        /**
         * <p>The list of sub-agent configurations.</p>
         */
        @NameInMap("subAgents")
        public java.util.List<CreateManagedAgentRequestBodySubAgents> subAgents;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public CreateManagedAgentRequestBodyTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<CreateManagedAgentRequestBodyTools> tools;

        public static CreateManagedAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBody self = new CreateManagedAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateManagedAgentRequestBody setEnvironment(CreateManagedAgentRequestBodyEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public CreateManagedAgentRequestBodyEnvironment getEnvironment() {
            return this.environment;
        }

        public CreateManagedAgentRequestBody setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateManagedAgentRequestBody setModel(CreateManagedAgentRequestBodyModel model) {
            this.model = model;
            return this;
        }
        public CreateManagedAgentRequestBodyModel getModel() {
            return this.model;
        }

        public CreateManagedAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentRequestBody setNetwork(CreateManagedAgentRequestBodyNetwork network) {
            this.network = network;
            return this;
        }
        public CreateManagedAgentRequestBodyNetwork getNetwork() {
            return this.network;
        }

        public CreateManagedAgentRequestBody setRuntime(CreateManagedAgentRequestBodyRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public CreateManagedAgentRequestBodyRuntime getRuntime() {
            return this.runtime;
        }

        public CreateManagedAgentRequestBody setSkills(java.util.List<CreateManagedAgentRequestBodySkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodySkills> getSkills() {
            return this.skills;
        }

        public CreateManagedAgentRequestBody setSubAgents(java.util.List<CreateManagedAgentRequestBodySubAgents> subAgents) {
            this.subAgents = subAgents;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodySubAgents> getSubAgents() {
            return this.subAgents;
        }

        public CreateManagedAgentRequestBody setTemplate(CreateManagedAgentRequestBodyTemplate template) {
            this.template = template;
            return this;
        }
        public CreateManagedAgentRequestBodyTemplate getTemplate() {
            return this.template;
        }

        public CreateManagedAgentRequestBody setTools(java.util.List<CreateManagedAgentRequestBodyTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodyTools> getTools() {
            return this.tools;
        }

    }

}
