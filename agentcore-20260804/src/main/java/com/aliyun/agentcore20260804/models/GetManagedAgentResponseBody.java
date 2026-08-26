// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetManagedAgentResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of SUCCESS indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the managed agent.</p>
     */
    @NameInMap("data")
    public GetManagedAgentResponseBodyData data;

    /**
     * <p>The HTTP status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The result message of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetManagedAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagedAgentResponseBody self = new GetManagedAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagedAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetManagedAgentResponseBody setData(GetManagedAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetManagedAgentResponseBodyData getData() {
        return this.data;
    }

    public GetManagedAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetManagedAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetManagedAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetManagedAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetManagedAgentResponseBodyDataEnvironmentCredentialReferences extends TeaModel {
        /**
         * <p>The credential ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-1</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        public static GetManagedAgentResponseBodyDataEnvironmentCredentialReferences build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataEnvironmentCredentialReferences self = new GetManagedAgentResponseBodyDataEnvironmentCredentialReferences();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataEnvironmentCredentialReferences setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

    }

    public static class GetManagedAgentResponseBodyDataEnvironmentVariables extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataEnvironmentVariables self = new GetManagedAgentResponseBodyDataEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetManagedAgentResponseBodyDataEnvironment extends TeaModel {
        /**
         * <p>The list of credential references.</p>
         */
        @NameInMap("credentialReferences")
        public java.util.List<GetManagedAgentResponseBodyDataEnvironmentCredentialReferences> credentialReferences;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<GetManagedAgentResponseBodyDataEnvironmentVariables> variables;

        public static GetManagedAgentResponseBodyDataEnvironment build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataEnvironment self = new GetManagedAgentResponseBodyDataEnvironment();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataEnvironment setCredentialReferences(java.util.List<GetManagedAgentResponseBodyDataEnvironmentCredentialReferences> credentialReferences) {
            this.credentialReferences = credentialReferences;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataEnvironmentCredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        public GetManagedAgentResponseBodyDataEnvironment setVariables(java.util.List<GetManagedAgentResponseBodyDataEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetManagedAgentResponseBodyDataModel extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataModel self = new GetManagedAgentResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public GetManagedAgentResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

    }

    public static class GetManagedAgentResponseBodyDataNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether public network access is allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetManagedAgentResponseBodyDataNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataNetworkAccessInternet self = new GetManagedAgentResponseBodyDataNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetManagedAgentResponseBodyDataNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether VPC access is allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetManagedAgentResponseBodyDataNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataNetworkAccessVpc self = new GetManagedAgentResponseBodyDataNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetManagedAgentResponseBodyDataNetwork extends TeaModel {
        /**
         * <p>The public network access configuration.</p>
         */
        @NameInMap("accessInternet")
        public GetManagedAgentResponseBodyDataNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configuration.</p>
         */
        @NameInMap("accessVpc")
        public GetManagedAgentResponseBodyDataNetworkAccessVpc accessVpc;

        public static GetManagedAgentResponseBodyDataNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataNetwork self = new GetManagedAgentResponseBodyDataNetwork();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataNetwork setAccessInternet(GetManagedAgentResponseBodyDataNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public GetManagedAgentResponseBodyDataNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public GetManagedAgentResponseBodyDataNetwork setAccessVpc(GetManagedAgentResponseBodyDataNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public GetManagedAgentResponseBodyDataNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class GetManagedAgentResponseBodyDataRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static GetManagedAgentResponseBodyDataRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataRuntimeCompute self = new GetManagedAgentResponseBodyDataRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class GetManagedAgentResponseBodyDataRuntimeSessionPolicy extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataRuntimeSessionPolicy self = new GetManagedAgentResponseBodyDataRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public GetManagedAgentResponseBodyDataRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetManagedAgentResponseBodyDataRuntime extends TeaModel {
        /**
         * <p>The compute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public GetManagedAgentResponseBodyDataRuntimeCompute compute;

        /**
         * <p>The session policy configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public GetManagedAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy;

        public static GetManagedAgentResponseBodyDataRuntime build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataRuntime self = new GetManagedAgentResponseBodyDataRuntime();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataRuntime setCompute(GetManagedAgentResponseBodyDataRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public GetManagedAgentResponseBodyDataRuntimeCompute getCompute() {
            return this.compute;
        }

        public GetManagedAgentResponseBodyDataRuntime setSessionPolicy(GetManagedAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public GetManagedAgentResponseBodyDataRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class GetManagedAgentResponseBodyDataSkills extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataSkills self = new GetManagedAgentResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetManagedAgentResponseBodyDataSubAgents extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataSubAgents build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataSubAgents self = new GetManagedAgentResponseBodyDataSubAgents();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataSubAgents setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public GetManagedAgentResponseBodyDataSubAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetManagedAgentResponseBodyDataTemplateAiRegistry extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataTemplateAiRegistry self = new GetManagedAgentResponseBodyDataTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetManagedAgentResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The AI registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public GetManagedAgentResponseBodyDataTemplateAiRegistry aiRegistry;

        public static GetManagedAgentResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataTemplate self = new GetManagedAgentResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataTemplate setAiRegistry(GetManagedAgentResponseBodyDataTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public GetManagedAgentResponseBodyDataTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class GetManagedAgentResponseBodyDataTools extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataTools self = new GetManagedAgentResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetManagedAgentResponseBodyData extends TeaModel {
        /**
         * <p>The managed agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The creation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <p>The creation time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("deployType")
        public String deployType;

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
        public GetManagedAgentResponseBodyDataEnvironment environment;

        /**
         * <p>The agent instruction that guides the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The latest specification version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The latest version status.</p>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        @NameInMap("latestVersionStatus")
        public String latestVersionStatus;

        /**
         * <p>The model configuration.</p>
         */
        @NameInMap("model")
        public GetManagedAgentResponseBodyDataModel model;

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
        public GetManagedAgentResponseBodyDataNetwork network;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The runtime configuration.</p>
         */
        @NameInMap("runtime")
        public GetManagedAgentResponseBodyDataRuntime runtime;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<GetManagedAgentResponseBodyDataSkills> skills;

        /**
         * <p>The status of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of sub-agent configurations.</p>
         */
        @NameInMap("subAgents")
        public java.util.List<GetManagedAgentResponseBodyDataSubAgents> subAgents;

        /**
         * <p>The template configuration.</p>
         */
        @NameInMap("template")
        public GetManagedAgentResponseBodyDataTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<GetManagedAgentResponseBodyDataTools> tools;

        /**
         * <p>The update time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static GetManagedAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyData self = new GetManagedAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetManagedAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public GetManagedAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetManagedAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetManagedAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetManagedAgentResponseBodyData setEnvironment(GetManagedAgentResponseBodyDataEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public GetManagedAgentResponseBodyDataEnvironment getEnvironment() {
            return this.environment;
        }

        public GetManagedAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public GetManagedAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public GetManagedAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public GetManagedAgentResponseBodyData setModel(GetManagedAgentResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public GetManagedAgentResponseBodyDataModel getModel() {
            return this.model;
        }

        public GetManagedAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyData setNetwork(GetManagedAgentResponseBodyDataNetwork network) {
            this.network = network;
            return this;
        }
        public GetManagedAgentResponseBodyDataNetwork getNetwork() {
            return this.network;
        }

        public GetManagedAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetManagedAgentResponseBodyData setRuntime(GetManagedAgentResponseBodyDataRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public GetManagedAgentResponseBodyDataRuntime getRuntime() {
            return this.runtime;
        }

        public GetManagedAgentResponseBodyData setSkills(java.util.List<GetManagedAgentResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public GetManagedAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetManagedAgentResponseBodyData setSubAgents(java.util.List<GetManagedAgentResponseBodyDataSubAgents> subAgents) {
            this.subAgents = subAgents;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataSubAgents> getSubAgents() {
            return this.subAgents;
        }

        public GetManagedAgentResponseBodyData setTemplate(GetManagedAgentResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public GetManagedAgentResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public GetManagedAgentResponseBodyData setTools(java.util.List<GetManagedAgentResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataTools> getTools() {
            return this.tools;
        }

        public GetManagedAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetManagedAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
