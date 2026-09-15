// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMcpRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateMcpRequestBody body;

    /**
     * <p>The client token that is used to ensure the idempotency of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpRequest self = new UpdateMcpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpRequest setBody(UpdateMcpRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcpRequestBody getBody() {
        return this.body;
    }

    public UpdateMcpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateMcpRequestBodyAuthCodePackage extends TeaModel {
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

        public static UpdateMcpRequestBodyAuthCodePackage build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyAuthCodePackage self = new UpdateMcpRequestBodyAuthCodePackage();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyAuthCodePackage setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public UpdateMcpRequestBodyAuthCodePackage setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

    }

    public static class UpdateMcpRequestBodyAuthDirectProxy extends TeaModel {
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

        public static UpdateMcpRequestBodyAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyAuthDirectProxy self = new UpdateMcpRequestBodyAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMcpRequestBodyAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateMcpRequestBodyAuthHttpToMcp extends TeaModel {
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

        public static UpdateMcpRequestBodyAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyAuthHttpToMcp self = new UpdateMcpRequestBodyAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public UpdateMcpRequestBodyAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMcpRequestBodyAuth extends TeaModel {
        /**
         * <p>The API key authentication configuration for code-deployed MCP callers.</p>
         */
        @NameInMap("codePackage")
        public UpdateMcpRequestBodyAuthCodePackage codePackage;

        /**
         * <p>The direct proxy authentication configuration.</p>
         */
        @NameInMap("directProxy")
        public UpdateMcpRequestBodyAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether to enable the configuration.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<UpdateMcpRequestBodyAuthHttpToMcp> httpToMcp;

        public static UpdateMcpRequestBodyAuth build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyAuth self = new UpdateMcpRequestBodyAuth();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyAuth setCodePackage(UpdateMcpRequestBodyAuthCodePackage codePackage) {
            this.codePackage = codePackage;
            return this;
        }
        public UpdateMcpRequestBodyAuthCodePackage getCodePackage() {
            return this.codePackage;
        }

        public UpdateMcpRequestBodyAuth setDirectProxy(UpdateMcpRequestBodyAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public UpdateMcpRequestBodyAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public UpdateMcpRequestBodyAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpRequestBodyAuth setHttpToMcp(java.util.List<UpdateMcpRequestBodyAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<UpdateMcpRequestBodyAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigAccessControl extends TeaModel {
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
         * <li>CREDENTIAL: access with an AgentCore credential.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL</p>
         */
        @NameInMap("mode")
        public String mode;

        public static UpdateMcpRequestBodyDeploymentConfigAccessControl build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigAccessControl self = new UpdateMcpRequestBodyDeploymentConfigAccessControl();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigAccessControl setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public UpdateMcpRequestBodyDeploymentConfigAccessControl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpRequestBodyDeploymentConfigAccessControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable authorization.</p>
         */
        @NameInMap("authorizationEnabled")
        public Boolean authorizationEnabled;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the credential provider.</p>
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

        public static UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration self = new UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration setAuthorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = authorizationEnabled;
            return this;
        }
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        public UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigCodeConfiguration extends TeaModel {
        /**
         * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. After the pre-signed upload is complete, use this token to create or update a code deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-token</p>
         */
        @NameInMap("codePackageToken")
        public String codePackageToken;

        /**
         * <p>The full startup command. Pass each argument as a separate element in order. For example, when using supergateway to start a stdio MCP, pass supergateway, --stdio, the full subcommand, and the remaining arguments.</p>
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

        public static UpdateMcpRequestBodyDeploymentConfigCodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigCodeConfiguration self = new UpdateMcpRequestBodyDeploymentConfigCodeConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigCodeConfiguration setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public UpdateMcpRequestBodyDeploymentConfigCodeConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateMcpRequestBodyDeploymentConfigCodeConfiguration setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigContainerConfiguration extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud Container Registry (ACR) instance.</p>
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
         * <p>The URL of the container image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-hangzhou.aliyuncs.com/example/mcp:1.0.0</p>
         */
        @NameInMap("image")
        public String image;

        /**
         * <p>The type of the image registry.</p>
         * 
         * <strong>example:</strong>
         * <p>ACR</p>
         */
        @NameInMap("imageRegistryType")
        public String imageRegistryType;

        /**
         * <p>The MCP runtime mode for the custom container. The custom container must expose a standard MCP endpoint. Set this parameter to SELF_HOSTED.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_HOSTED</p>
         */
        @NameInMap("mcpRuntimeMode")
        public String mcpRuntimeMode;

        /**
         * <p>The source type of the container. Currently fixed to CONTAINER_IMAGE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTAINER_IMAGE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static UpdateMcpRequestBodyDeploymentConfigContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigContainerConfiguration self = new UpdateMcpRequestBodyDeploymentConfigContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration setImageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
            return this;
        }
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration setMcpRuntimeMode(String mcpRuntimeMode) {
            this.mcpRuntimeMode = mcpRuntimeMode;
            return this;
        }
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks extends TeaModel {
        /**
         * <p>The API version of the hook.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("apiVersion")
        public String apiVersion;

        /**
         * <p>The description of the hook.</p>
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
         * <p>The HTTP request headers for the hook.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The timeout period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        /**
         * <p>The callback URL of the hook.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp-hook">https://example.com/mcp-hook</a></p>
         */
        @NameInMap("url")
        public String url;

        public static UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks self = new UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigHookConfiguration extends TeaModel {
        /**
         * <p>The list of hooks executed in array order. Supported hook events: PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL.</p>
         */
        @NameInMap("hooks")
        public java.util.List<UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks> hooks;

        public static UpdateMcpRequestBodyDeploymentConfigHookConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigHookConfiguration self = new UpdateMcpRequestBodyDeploymentConfigHookConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigHookConfiguration setHooks(java.util.List<UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<UpdateMcpRequestBodyDeploymentConfigHookConfigurationHooks> getHooks() {
            return this.hooks;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigLogConfiguration extends TeaModel {
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
         * <p>The log segmentation start rule for Function Compute.</p>
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

        public static UpdateMcpRequestBodyDeploymentConfigLogConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigLogConfiguration self = new UpdateMcpRequestBodyDeploymentConfigLogConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigLogConfiguration setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public UpdateMcpRequestBodyDeploymentConfigLogConfiguration setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public UpdateMcpRequestBodyDeploymentConfigLogConfiguration setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public UpdateMcpRequestBodyDeploymentConfigLogConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateMcpRequestBodyDeploymentConfigLogConfiguration setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigMcpConfiguration extends TeaModel {
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
         * <p>The session idle timeout. Unit: seconds. Default value: 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("sessionIdleTimeoutSeconds")
        public Integer sessionIdleTimeoutSeconds;

        /**
         * <p>The maximum session lifetime. Unit: seconds. Default value: 21600.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        @NameInMap("sessionMaxLifetimeSeconds")
        public Integer sessionMaxLifetimeSeconds;

        public static UpdateMcpRequestBodyDeploymentConfigMcpConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigMcpConfiguration self = new UpdateMcpRequestBodyDeploymentConfigMcpConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigMcpConfiguration setEndpointPath(String endpointPath) {
            this.endpointPath = endpointPath;
            return this;
        }
        public String getEndpointPath() {
            return this.endpointPath;
        }

        public UpdateMcpRequestBodyDeploymentConfigMcpConfiguration setSessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        public UpdateMcpRequestBodyDeploymentConfigMcpConfiguration setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        public UpdateMcpRequestBodyDeploymentConfigMcpConfiguration setSessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
            this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
            return this;
        }
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints extends TeaModel {
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

        public static UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints self = new UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigNasConfiguration extends TeaModel {
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
        public java.util.List<UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints> mountPoints;

        /**
         * <p>The runtime user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userId")
        public Integer userId;

        public static UpdateMcpRequestBodyDeploymentConfigNasConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigNasConfiguration self = new UpdateMcpRequestBodyDeploymentConfigNasConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigNasConfiguration setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public UpdateMcpRequestBodyDeploymentConfigNasConfiguration setMountPoints(java.util.List<UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<UpdateMcpRequestBodyDeploymentConfigNasConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public UpdateMcpRequestBodyDeploymentConfigNasConfiguration setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration extends TeaModel {
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

        public static UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration self = new UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints extends TeaModel {
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

        public static UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints self = new UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigOssMountConfiguration extends TeaModel {
        /**
         * <p>The list of OSS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints> mountPoints;

        public static UpdateMcpRequestBodyDeploymentConfigOssMountConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigOssMountConfiguration self = new UpdateMcpRequestBodyDeploymentConfigOssMountConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigOssMountConfiguration setMountPoints(java.util.List<UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<UpdateMcpRequestBodyDeploymentConfigOssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration extends TeaModel {
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

        public static UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration self = new UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration setRuleSetId(String ruleSetId) {
            this.ruleSetId = ruleSetId;
            return this;
        }
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        public UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigProxyConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable the MCP proxy.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateMcpRequestBodyDeploymentConfigProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigProxyConfiguration self = new UpdateMcpRequestBodyDeploymentConfigProxyConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigProxyConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration extends TeaModel {
        /**
         * <p>The CPU specification. Unit: cores. Default value: 0.25.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("cpu")
        public Double cpu;

        /**
         * <p>The ephemeral disk size. Unit: MB. Valid values: 512 and 10240.</p>
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
         * <p>The ARN of the RAM role used when user code accesses downstream Alibaba Cloud resources.</p>
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

        public static UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration self = new UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateMcpRequestBodyDeploymentConfig extends TeaModel {
        /**
         * <p>The MCP ingress access control configuration.</p>
         */
        @NameInMap("accessControl")
        public UpdateMcpRequestBodyDeploymentConfigAccessControl accessControl;

        /**
         * <p>The Agent Identity configuration.</p>
         */
        @NameInMap("agentIdentityConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration;

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
        public UpdateMcpRequestBodyDeploymentConfigCodeConfiguration codeConfiguration;

        /**
         * <p>The custom container configuration.</p>
         */
        @NameInMap("containerConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration containerConfiguration;

        /**
         * <p>The hook configuration.</p>
         */
        @NameInMap("hookConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigHookConfiguration hookConfiguration;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("logConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigLogConfiguration logConfiguration;

        /**
         * <p>The MCP session configuration.</p>
         */
        @NameInMap("mcpConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigMcpConfiguration mcpConfiguration;

        /**
         * <p>The NAS storage configuration.</p>
         */
        @NameInMap("nasConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigNasConfiguration nasConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration networkConfiguration;

        /**
         * <p>The OSS mount configuration.</p>
         */
        @NameInMap("ossMountConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigOssMountConfiguration ossMountConfiguration;

        /**
         * <p>The parameter transformation and result enhancement configuration.</p>
         */
        @NameInMap("parameterTransformConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration;

        /**
         * <p>The MCP proxy configuration.</p>
         */
        @NameInMap("proxyConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigProxyConfiguration proxyConfiguration;

        /**
         * <p>The runtime and resource configuration.</p>
         */
        @NameInMap("runtimeConfiguration")
        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration runtimeConfiguration;

        public static UpdateMcpRequestBodyDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBodyDeploymentConfig self = new UpdateMcpRequestBodyDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBodyDeploymentConfig setAccessControl(UpdateMcpRequestBodyDeploymentConfigAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigAccessControl getAccessControl() {
            return this.accessControl;
        }

        public UpdateMcpRequestBodyDeploymentConfig setAgentIdentityConfiguration(UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration) {
            this.agentIdentityConfiguration = agentIdentityConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigAgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public UpdateMcpRequestBodyDeploymentConfig setCodeConfiguration(UpdateMcpRequestBodyDeploymentConfigCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigCodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setContainerConfiguration(UpdateMcpRequestBodyDeploymentConfigContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setHookConfiguration(UpdateMcpRequestBodyDeploymentConfigHookConfiguration hookConfiguration) {
            this.hookConfiguration = hookConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigHookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setLogConfiguration(UpdateMcpRequestBodyDeploymentConfigLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigLogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setMcpConfiguration(UpdateMcpRequestBodyDeploymentConfigMcpConfiguration mcpConfiguration) {
            this.mcpConfiguration = mcpConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigMcpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setNasConfiguration(UpdateMcpRequestBodyDeploymentConfigNasConfiguration nasConfiguration) {
            this.nasConfiguration = nasConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigNasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setNetworkConfiguration(UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setOssMountConfiguration(UpdateMcpRequestBodyDeploymentConfigOssMountConfiguration ossMountConfiguration) {
            this.ossMountConfiguration = ossMountConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigOssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setParameterTransformConfiguration(UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration) {
            this.parameterTransformConfiguration = parameterTransformConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setProxyConfiguration(UpdateMcpRequestBodyDeploymentConfigProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        public UpdateMcpRequestBodyDeploymentConfig setRuntimeConfiguration(UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfigRuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

    }

    public static class UpdateMcpRequestBody extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. When enabled is set to true: for DIRECT_PROXY, specify directProxy (name/value). For HTTP_TO_MCP, specify the httpToMcp array (each item contains id/type/credential, and apiKey also requires position/name). Multiple authentication objects are supported, and the first one is used as the default upstream credential. HTTP_TO_MCP credentials are merged into the securitySchemes of the Swagger specification.</p>
         */
        @NameInMap("auth")
        public UpdateMcpRequestBodyAuth auth;

        /**
         * <p>Custom tags. Multiple tags are supported. Pass an empty list to clear all tags.</p>
         */
        @NameInMap("customTags")
        public java.util.List<String> customTags;

        /**
         * <p>Deployment configuration patch for a CODE_PACKAGE MCP. Object fields are merged hierarchically. To keep the current deployed code package, omit CodeConfiguration.CodePackageToken so the server reuses the existing package. To replace the code package, pass a new non-empty Token. CodePackageUrl is supported only for CreateMcp and is not supported during updates.</p>
         */
        @NameInMap("deploymentConfig")
        public UpdateMcpRequestBodyDeploymentConfig deploymentConfig;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Required if Type is set to HTTP_TO_MCP.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        public static UpdateMcpRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpRequestBody self = new UpdateMcpRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateMcpRequestBody setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public UpdateMcpRequestBody setAuth(UpdateMcpRequestBodyAuth auth) {
            this.auth = auth;
            return this;
        }
        public UpdateMcpRequestBodyAuth getAuth() {
            return this.auth;
        }

        public UpdateMcpRequestBody setCustomTags(java.util.List<String> customTags) {
            this.customTags = customTags;
            return this;
        }
        public java.util.List<String> getCustomTags() {
            return this.customTags;
        }

        public UpdateMcpRequestBody setDeploymentConfig(UpdateMcpRequestBodyDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public UpdateMcpRequestBodyDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public UpdateMcpRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMcpRequestBody setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

    }

}
