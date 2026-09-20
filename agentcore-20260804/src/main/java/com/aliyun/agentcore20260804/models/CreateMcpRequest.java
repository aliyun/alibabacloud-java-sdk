// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMcpRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public CreateMcpRequestBody body;

    /**
     * <p>The client token that is used to ensure the idempotency of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static CreateMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpRequest self = new CreateMcpRequest();
        return TeaModel.build(map, self);
    }

    public CreateMcpRequest setBody(CreateMcpRequestBody body) {
        this.body = body;
        return this;
    }
    public CreateMcpRequestBody getBody() {
        return this.body;
    }

    public CreateMcpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateMcpRequestBodyAuthCodePackage extends TeaModel {
        /**
         * <p>The API key for authenticating MCP callers.</p>
         * 
         * <strong>example:</strong>
         * <p>example-api-key</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The name of the request header that carries the API key.</p>
         * 
         * <strong>example:</strong>
         * <p>X-API-Key</p>
         */
        @NameInMap("headerName")
        public String headerName;

        public static CreateMcpRequestBodyAuthCodePackage build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyAuthCodePackage self = new CreateMcpRequestBodyAuthCodePackage();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyAuthCodePackage setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateMcpRequestBodyAuthCodePackage setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

    }

    public static class CreateMcpRequestBodyAuthDirectProxy extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The authentication parameter value.</p>
         * 
         * <strong>example:</strong>
         * <p>example-credential</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateMcpRequestBodyAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyAuthDirectProxy self = new CreateMcpRequestBodyAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpRequestBodyAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMcpRequestBodyAuthHttpToMcp extends TeaModel {
        /**
         * <p>The authentication credential.</p>
         * 
         * <strong>example:</strong>
         * <p>example-credential</p>
         */
        @NameInMap("credential")
        public String credential;

        /**
         * <p>The authentication scheme ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-1234567890abcdef</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The position of the credential.</p>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("position")
        public String position;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMcpRequestBodyAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyAuthHttpToMcp self = new CreateMcpRequestBodyAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public CreateMcpRequestBodyAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMcpRequestBodyAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpRequestBodyAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public CreateMcpRequestBodyAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMcpRequestBodyAuth extends TeaModel {
        /**
         * <p>The API key authentication configuration for code-deployed MCP callers.</p>
         */
        @NameInMap("codePackage")
        public CreateMcpRequestBodyAuthCodePackage codePackage;

        /**
         * <p>The authentication configuration for direct proxy.</p>
         */
        @NameInMap("directProxy")
        public CreateMcpRequestBodyAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether to enable this configuration.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<CreateMcpRequestBodyAuthHttpToMcp> httpToMcp;

        public static CreateMcpRequestBodyAuth build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyAuth self = new CreateMcpRequestBodyAuth();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyAuth setCodePackage(CreateMcpRequestBodyAuthCodePackage codePackage) {
            this.codePackage = codePackage;
            return this;
        }
        public CreateMcpRequestBodyAuthCodePackage getCodePackage() {
            return this.codePackage;
        }

        public CreateMcpRequestBodyAuth setDirectProxy(CreateMcpRequestBodyAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public CreateMcpRequestBodyAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public CreateMcpRequestBodyAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpRequestBodyAuth setHttpToMcp(java.util.List<CreateMcpRequestBodyAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<CreateMcpRequestBodyAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigAccessControl extends TeaModel {
        /**
         * <p>The AgentCore Credential referenced when mode is set to CREDENTIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-id</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>Specifies whether to enable ingress access control.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The access control mode. Valid values:</p>
         * <ul>
         * <li>ANONYMOUS: anonymous access.</li>
         * <li>CREDENTIAL: access using an AgentCore credential.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL</p>
         */
        @NameInMap("mode")
        public String mode;

        public static CreateMcpRequestBodyDeploymentConfigAccessControl build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigAccessControl self = new CreateMcpRequestBodyDeploymentConfigAccessControl();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigAccessControl setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public CreateMcpRequestBodyDeploymentConfigAccessControl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpRequestBodyDeploymentConfigAccessControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable authorization.</p>
         */
        @NameInMap("authorizationEnabled")
        public Boolean authorizationEnabled;

        /**
         * <p>The ARN of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:agentidentity:cn-hangzhou:1234567890123456:provider/example</p>
         */
        @NameInMap("credentialProviderArn")
        public String credentialProviderArn;

        /**
         * <p>The type of the credential provider.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth2</p>
         */
        @NameInMap("credentialProviderType")
        public String credentialProviderType;

        /**
         * <p>Specifies whether to enable Agent Identity.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration self = new CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration setAuthorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = authorizationEnabled;
            return this;
        }
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        public CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigCodeConfiguration extends TeaModel {
        /**
         * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. Use this token to create a code deployment after completing the pre-signed upload. Specify either this parameter or CodePackageUrl.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-token</p>
         */
        @NameInMap("codePackageToken")
        public String codePackageToken;

        /**
         * <p>The public Alibaba Cloud OSS HTTP(S) address that you can directly pass in when creating a code deployment. Specify either this parameter or CodePackageToken. Only CreateMcp supports this parameter. Update and query operations do not support this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip</a></p>
         */
        @NameInMap("codePackageUrl")
        public String codePackageUrl;

        /**
         * <p>The full startup command, with arguments passed in order by parameter boundary. For example, when using supergateway to start a stdio MCP, pass in supergateway, --stdio, the full subcommand, and remaining arguments.</p>
         */
        @NameInMap("command")
        public java.util.List<String> command;

        /**
         * <p>The code package runtime. Valid values: python3.13, nodejs22, and java17.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.13</p>
         */
        @NameInMap("language")
        public String language;

        public static CreateMcpRequestBodyDeploymentConfigCodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigCodeConfiguration self = new CreateMcpRequestBodyDeploymentConfigCodeConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigCodeConfiguration setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public CreateMcpRequestBodyDeploymentConfigCodeConfiguration setCodePackageUrl(String codePackageUrl) {
            this.codePackageUrl = codePackageUrl;
            return this;
        }
        public String getCodePackageUrl() {
            return this.codePackageUrl;
        }

        public CreateMcpRequestBodyDeploymentConfigCodeConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateMcpRequestBodyDeploymentConfigCodeConfiguration setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigContainerConfiguration extends TeaModel {
        /**
         * <p>The ACR instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cri-example</p>
         */
        @NameInMap("acrInstanceId")
        public String acrInstanceId;

        /**
         * <p>The startup command.</p>
         */
        @NameInMap("command")
        public java.util.List<String> command;

        /**
         * <p>The container entrypoint arguments.</p>
         */
        @NameInMap("entrypoint")
        public java.util.List<String> entrypoint;

        /**
         * <p>The container image address.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/example/mcp:1.0.0</p>
         */
        @NameInMap("image")
        public String image;

        /**
         * <p>The image registry type.</p>
         * 
         * <strong>example:</strong>
         * <p>ACR</p>
         */
        @NameInMap("imageRegistryType")
        public String imageRegistryType;

        /**
         * <p>The MCP Runtime mode. Custom containers must expose a standard MCP on their own. Set this parameter to SELF_HOSTED.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_HOSTED</p>
         */
        @NameInMap("mcpRuntimeMode")
        public String mcpRuntimeMode;

        /**
         * <p>The container source type. Currently fixed to CONTAINER_IMAGE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTAINER_IMAGE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static CreateMcpRequestBodyDeploymentConfigContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigContainerConfiguration self = new CreateMcpRequestBodyDeploymentConfigContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration setImageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
            return this;
        }
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration setMcpRuntimeMode(String mcpRuntimeMode) {
            this.mcpRuntimeMode = mcpRuntimeMode;
            return this;
        }
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks extends TeaModel {
        /**
         * <p>The hook API version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>The hook description.</p>
         * 
         * <strong>example:</strong>
         * <p>Log MCP tool invocations</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Specifies whether to enable the hook.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The hook event.</p>
         * 
         * <strong>example:</strong>
         * <p>PRE_CALL_TOOL</p>
         */
        @NameInMap("event")
        public String event;

        /**
         * <p>The hook request headers.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The timeout period. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>The hook callback URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp-hook">https://example.com/mcp-hook</a></p>
         */
        @NameInMap("url")
        public String url;

        public static CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks self = new CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigHookConfiguration extends TeaModel {
        /**
         * <p>The hooks executed in array order: PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL.</p>
         */
        @NameInMap("hooks")
        public java.util.List<CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks> hooks;

        public static CreateMcpRequestBodyDeploymentConfigHookConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigHookConfiguration self = new CreateMcpRequestBodyDeploymentConfigHookConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigHookConfiguration setHooks(java.util.List<CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<CreateMcpRequestBodyDeploymentConfigHookConfigurationHooks> getHooks() {
            return this.hooks;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigLogConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to collect instance metrics.</p>
         */
        @NameInMap("enableInstanceMetrics")
        public Boolean enableInstanceMetrics;

        /**
         * <p>Specifies whether to collect request metrics.</p>
         */
        @NameInMap("enableRequestMetrics")
        public Boolean enableRequestMetrics;

        /**
         * <p>The log splitting begin rule for Function Compute (FC).</p>
         * 
         * <strong>example:</strong>
         * <p>DefaultRegex</p>
         */
        @NameInMap("logBeginRule")
        public String logBeginRule;

        /**
         * <p>The Logstore name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-logs</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentcore-mcp-logs</p>
         */
        @NameInMap("project")
        public String project;

        public static CreateMcpRequestBodyDeploymentConfigLogConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigLogConfiguration self = new CreateMcpRequestBodyDeploymentConfigLogConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigLogConfiguration setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public CreateMcpRequestBodyDeploymentConfigLogConfiguration setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public CreateMcpRequestBodyDeploymentConfigLogConfiguration setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public CreateMcpRequestBodyDeploymentConfigLogConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateMcpRequestBodyDeploymentConfigLogConfiguration setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigMcpConfiguration extends TeaModel {
        /**
         * <p>For example, /mcp or /sse.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("endpointPath")
        public String endpointPath;

        /**
         * <p>Currently fixed to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sessionConcurrencyPerInstance")
        public Integer sessionConcurrencyPerInstance;

        /**
         * <p>Unit: seconds. Default value: 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("sessionIdleTimeoutSeconds")
        public Integer sessionIdleTimeoutSeconds;

        /**
         * <p>Unit: seconds. Default value: 21600.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        @NameInMap("sessionMaxLifetimeSeconds")
        public Integer sessionMaxLifetimeSeconds;

        public static CreateMcpRequestBodyDeploymentConfigMcpConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigMcpConfiguration self = new CreateMcpRequestBodyDeploymentConfigMcpConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigMcpConfiguration setEndpointPath(String endpointPath) {
            this.endpointPath = endpointPath;
            return this;
        }
        public String getEndpointPath() {
            return this.endpointPath;
        }

        public CreateMcpRequestBodyDeploymentConfigMcpConfiguration setSessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        public CreateMcpRequestBodyDeploymentConfigMcpConfiguration setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        public CreateMcpRequestBodyDeploymentConfigMcpConfiguration setSessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
            this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
            return this;
        }
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints extends TeaModel {
        /**
         * <p>Specifies whether to enable TLS.</p>
         */
        @NameInMap("enableTls")
        public Boolean enableTls;

        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("mountDir")
        public String mountDir;

        /**
         * <p>The NAS server address.</p>
         * 
         * <strong>example:</strong>
         * <p>example.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("serverAddr")
        public String serverAddr;

        public static CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints self = new CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigNasConfiguration extends TeaModel {
        /**
         * <p>The runtime user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("groupId")
        public Integer groupId;

        /**
         * <p>The list of NAS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints> mountPoints;

        /**
         * <p>The runtime user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userId")
        public Integer userId;

        public static CreateMcpRequestBodyDeploymentConfigNasConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigNasConfiguration self = new CreateMcpRequestBodyDeploymentConfigNasConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigNasConfiguration setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public CreateMcpRequestBodyDeploymentConfigNasConfiguration setMountPoints(java.util.List<CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<CreateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public CreateMcpRequestBodyDeploymentConfigNasConfiguration setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigNetworkConfiguration extends TeaModel {
        /**
         * <p>The network mode.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("networkMode")
        public String networkMode;

        /**
         * <p>The security group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-example</p>
         */
        @NameInMap("securityGroupId")
        public String securityGroupId;

        /**
         * <p>The list of vSwitch IDs.</p>
         */
        @NameInMap("vSwitchIds")
        public java.util.List<String> vSwitchIds;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-example</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateMcpRequestBodyDeploymentConfigNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigNetworkConfiguration self = new CreateMcpRequestBodyDeploymentConfigNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigNetworkConfiguration setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public CreateMcpRequestBodyDeploymentConfigNetworkConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateMcpRequestBodyDeploymentConfigNetworkConfiguration setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateMcpRequestBodyDeploymentConfigNetworkConfiguration setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints extends TeaModel {
        /**
         * <p>The OSS bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The OSS bucket path.</p>
         * 
         * <strong>example:</strong>
         * <p>/data</p>
         */
        @NameInMap("bucketPath")
        public String bucketPath;

        /**
         * <p>The OSS service endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oss-cn-hangzhou.aliyuncs.com">https://oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The local mount directory.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
         */
        @NameInMap("mountDir")
        public String mountDir;

        /**
         * <p>Specifies whether the mount point is read-only.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints self = new CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigOssMountConfiguration extends TeaModel {
        /**
         * <p>The list of OSS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints> mountPoints;

        public static CreateMcpRequestBodyDeploymentConfigOssMountConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigOssMountConfiguration self = new CreateMcpRequestBodyDeploymentConfigOssMountConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigOssMountConfiguration setMountPoints(java.util.List<CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<CreateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable parameter transformation and result enhancement.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The reserved reference to the parameter transformation and result enhancement rule set.</p>
         * 
         * <strong>example:</strong>
         * <p>rules-1</p>
         */
        @NameInMap("ruleSetId")
        public String ruleSetId;

        /**
         * <p>The transformation rule version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("version")
        public String version;

        public static CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration self = new CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration setRuleSetId(String ruleSetId) {
            this.ruleSetId = ruleSetId;
            return this;
        }
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        public CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigProxyConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable the MCP proxy.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateMcpRequestBodyDeploymentConfigProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigProxyConfiguration self = new CreateMcpRequestBodyDeploymentConfigProxyConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigProxyConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration extends TeaModel {
        /**
         * <p>Unit: cores. Default value: 0.25.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("cpu")
        public Double cpu;

        /**
         * <p>Unit: MB. Valid values: 512 and 10240.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("diskSize")
        public Integer diskSize;

        /**
         * <p>The environment variables.</p>
         */
        @NameInMap("environmentVariables")
        public java.util.Map<String, String> environmentVariables;

        /**
         * <p>The ARN of the RAM role used by user code to access downstream Alibaba Cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/agentcore-mcp-execution</p>
         */
        @NameInMap("executionRoleArn")
        public String executionRoleArn;

        /**
         * <p>Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("instanceConcurrency")
        public Integer instanceConcurrency;

        /**
         * <p>Unit: MB. Default value: 512.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("memory")
        public Integer memory;

        /**
         * <p>Default value: 9000.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        public static CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration self = new CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateMcpRequestBodyDeploymentConfig extends TeaModel {
        /**
         * <p>The MCP ingress access control configuration.</p>
         */
        @NameInMap("accessControl")
        public CreateMcpRequestBodyDeploymentConfigAccessControl accessControl;

        /**
         * <p>The Agent Identity configuration.</p>
         */
        @NameInMap("agentIdentityConfiguration")
        public CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration;

        /**
         * <p>The artifact type. Valid values:</p>
         * <ul>
         * <li>Code: a ZIP code package.</li>
         * <li>Container: a custom container.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Code</p>
         */
        @NameInMap("artifactType")
        public String artifactType;

        /**
         * <p>The code package configuration.</p>
         */
        @NameInMap("codeConfiguration")
        public CreateMcpRequestBodyDeploymentConfigCodeConfiguration codeConfiguration;

        /**
         * <p>The custom container configuration.</p>
         */
        @NameInMap("containerConfiguration")
        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration containerConfiguration;

        /**
         * <p>The hook configuration.</p>
         */
        @NameInMap("hookConfiguration")
        public CreateMcpRequestBodyDeploymentConfigHookConfiguration hookConfiguration;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("logConfiguration")
        public CreateMcpRequestBodyDeploymentConfigLogConfiguration logConfiguration;

        /**
         * <p>The MCP session configuration.</p>
         */
        @NameInMap("mcpConfiguration")
        public CreateMcpRequestBodyDeploymentConfigMcpConfiguration mcpConfiguration;

        /**
         * <p>The NAS storage configuration.</p>
         */
        @NameInMap("nasConfiguration")
        public CreateMcpRequestBodyDeploymentConfigNasConfiguration nasConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public CreateMcpRequestBodyDeploymentConfigNetworkConfiguration networkConfiguration;

        /**
         * <p>The OSS mount configuration.</p>
         */
        @NameInMap("ossMountConfiguration")
        public CreateMcpRequestBodyDeploymentConfigOssMountConfiguration ossMountConfiguration;

        /**
         * <p>The parameter transformation and result enhancement configuration.</p>
         */
        @NameInMap("parameterTransformConfiguration")
        public CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration;

        /**
         * <p>The MCP proxy configuration.</p>
         */
        @NameInMap("proxyConfiguration")
        public CreateMcpRequestBodyDeploymentConfigProxyConfiguration proxyConfiguration;

        /**
         * <p>The runtime and resource configuration.</p>
         */
        @NameInMap("runtimeConfiguration")
        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration runtimeConfiguration;

        public static CreateMcpRequestBodyDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBodyDeploymentConfig self = new CreateMcpRequestBodyDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBodyDeploymentConfig setAccessControl(CreateMcpRequestBodyDeploymentConfigAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigAccessControl getAccessControl() {
            return this.accessControl;
        }

        public CreateMcpRequestBodyDeploymentConfig setAgentIdentityConfiguration(CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration) {
            this.agentIdentityConfiguration = agentIdentityConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public CreateMcpRequestBodyDeploymentConfig setCodeConfiguration(CreateMcpRequestBodyDeploymentConfigCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigCodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setContainerConfiguration(CreateMcpRequestBodyDeploymentConfigContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setHookConfiguration(CreateMcpRequestBodyDeploymentConfigHookConfiguration hookConfiguration) {
            this.hookConfiguration = hookConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigHookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setLogConfiguration(CreateMcpRequestBodyDeploymentConfigLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigLogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setMcpConfiguration(CreateMcpRequestBodyDeploymentConfigMcpConfiguration mcpConfiguration) {
            this.mcpConfiguration = mcpConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigMcpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setNasConfiguration(CreateMcpRequestBodyDeploymentConfigNasConfiguration nasConfiguration) {
            this.nasConfiguration = nasConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigNasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setNetworkConfiguration(CreateMcpRequestBodyDeploymentConfigNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setOssMountConfiguration(CreateMcpRequestBodyDeploymentConfigOssMountConfiguration ossMountConfiguration) {
            this.ossMountConfiguration = ossMountConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigOssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setParameterTransformConfiguration(CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration) {
            this.parameterTransformConfiguration = parameterTransformConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setProxyConfiguration(CreateMcpRequestBodyDeploymentConfigProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        public CreateMcpRequestBodyDeploymentConfig setRuntimeConfiguration(CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfigRuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

    }

    public static class CreateMcpRequestBody extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. When enabled is set to true: for DIRECT_PROXY, specify directProxy (name/value). For HTTP_TO_MCP, specify the httpToMcp array (each item contains id/type/credential. For apiKey, position/name are also required). Multiple authentication objects are supported, and the first one is used as the default upstream credential. HTTP_TO_MCP credentials are merged into the securitySchemes of the Swagger specification.</p>
         */
        @NameInMap("auth")
        public CreateMcpRequestBodyAuth auth;

        /**
         * <p>The custom tags. Multiple tags are supported.</p>
         */
        @NameInMap("customTags")
        public java.util.List<String> customTags;

        /**
         * <p>The code deployment configuration. Required when Type is set to CODE_PACKAGE. When creating a Code artifact, you must specify either CodeConfiguration.CodePackageToken or CodePackageUrl, but not both. CodePackageUrl supports only public Alibaba Cloud OSS HTTP(S) addresses.</p>
         */
        @NameInMap("deploymentConfig")
        public CreateMcpRequestBodyDeploymentConfig deploymentConfig;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MCP name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The MCP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>Required if Type is set to HTTP_TO_MCP.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        /**
         * <p>The type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DIRECT_PROXY</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateMcpRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpRequestBody self = new CreateMcpRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateMcpRequestBody setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public CreateMcpRequestBody setAuth(CreateMcpRequestBodyAuth auth) {
            this.auth = auth;
            return this;
        }
        public CreateMcpRequestBodyAuth getAuth() {
            return this.auth;
        }

        public CreateMcpRequestBody setCustomTags(java.util.List<String> customTags) {
            this.customTags = customTags;
            return this;
        }
        public java.util.List<String> getCustomTags() {
            return this.customTags;
        }

        public CreateMcpRequestBody setDeploymentConfig(CreateMcpRequestBodyDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public CreateMcpRequestBodyDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public CreateMcpRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMcpRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpRequestBody setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateMcpRequestBody setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public CreateMcpRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
