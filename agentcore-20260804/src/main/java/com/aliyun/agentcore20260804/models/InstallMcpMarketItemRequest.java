// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class InstallMcpMarketItemRequest extends TeaModel {
    /**
     * <p>The MCP configuration submitted when installing the template. The configuration must comply with the input schema of the template.</p>
     */
    @NameInMap("body")
    public InstallMcpMarketItemRequestBody body;

    /**
     * <p>The reserved query request identifier. The console backend does not read this parameter and does not provide idempotency guarantees, such as deduplication or recovery of the original processing result, based on this identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The template version to install. You can query available versions by calling GetMcpMarketItem.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("templateVersion")
    public String templateVersion;

    public static InstallMcpMarketItemRequest build(java.util.Map<String, ?> map) throws Exception {
        InstallMcpMarketItemRequest self = new InstallMcpMarketItemRequest();
        return TeaModel.build(map, self);
    }

    public InstallMcpMarketItemRequest setBody(InstallMcpMarketItemRequestBody body) {
        this.body = body;
        return this;
    }
    public InstallMcpMarketItemRequestBody getBody() {
        return this.body;
    }

    public InstallMcpMarketItemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public InstallMcpMarketItemRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class InstallMcpMarketItemRequestBodyAuthDirectProxy extends TeaModel {
        /**
         * <p>The name of the backend authentication request header.</p>
         * 
         * <strong>example:</strong>
         * <p>Authorization</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the backend authentication request header.</p>
         * 
         * <strong>example:</strong>
         * <p>example-api-key</p>
         */
        @NameInMap("value")
        public String value;

        public static InstallMcpMarketItemRequestBodyAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyAuthDirectProxy self = new InstallMcpMarketItemRequestBodyAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallMcpMarketItemRequestBodyAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class InstallMcpMarketItemRequestBodyAuthHttpToMcp extends TeaModel {
        /**
         * <p>The backend authentication credential.</p>
         * 
         * <strong>example:</strong>
         * <p>example-api-key</p>
         */
        @NameInMap("credential")
        public String credential;

        /**
         * <p>The ID of the backend authentication configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>api-key-auth</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The name of the API key parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>X-API-Key</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The position where the API key is passed.</p>
         * 
         * <strong>example:</strong>
         * <p>header</p>
         */
        @NameInMap("position")
        public String position;

        /**
         * <p>The backend authentication type.</p>
         * 
         * <strong>example:</strong>
         * <p>apiKey</p>
         */
        @NameInMap("type")
        public String type;

        public static InstallMcpMarketItemRequestBodyAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyAuthHttpToMcp self = new InstallMcpMarketItemRequestBodyAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public InstallMcpMarketItemRequestBodyAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InstallMcpMarketItemRequestBodyAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallMcpMarketItemRequestBodyAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public InstallMcpMarketItemRequestBodyAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class InstallMcpMarketItemRequestBodyAuth extends TeaModel {
        /**
         * <p>The backend authentication configuration for the direct proxy.</p>
         */
        @NameInMap("directProxy")
        public InstallMcpMarketItemRequestBodyAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether to enable the configuration.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of backend authentication configurations for HTTP-to-MCP.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<InstallMcpMarketItemRequestBodyAuthHttpToMcp> httpToMcp;

        public static InstallMcpMarketItemRequestBodyAuth build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyAuth self = new InstallMcpMarketItemRequestBodyAuth();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyAuth setDirectProxy(InstallMcpMarketItemRequestBodyAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public InstallMcpMarketItemRequestBodyAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public InstallMcpMarketItemRequestBodyAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public InstallMcpMarketItemRequestBodyAuth setHttpToMcp(java.util.List<InstallMcpMarketItemRequestBodyAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<InstallMcpMarketItemRequestBodyAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl extends TeaModel {
        /**
         * <p>The AgentCore credential referenced when the mode is set to CREDENTIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-id</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>Specifies whether entry point access control is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The access control mode. ANONYMOUS indicates anonymous access, and CREDENTIAL indicates the use of AgentCore access credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL</p>
         */
        @NameInMap("mode")
        public String mode;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl self = new InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration extends TeaModel {
        /**
         * <p>Specifies whether authorization is enabled.</p>
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
         * <p>Specifies whether Agent Identity is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration setAuthorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = authorizationEnabled;
            return this;
        }
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration extends TeaModel {
        /**
         * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. It is used to create a code deployment after a presigned upload is completed. This parameter and CodePackageUrl are mutually exclusive.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-token</p>
         */
        @NameInMap("codePackageToken")
        public String codePackageToken;

        /**
         * <p>The public Alibaba Cloud OSS HTTP or HTTPS URL that can be directly passed when creating a code deployment. This parameter and CodePackageToken are mutually exclusive. This parameter is supported only by CreateMcp, and is not supported for update and query operations.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip">https://example-bucket.oss-cn-hangzhou.aliyuncs.com/server.zip</a></p>
         */
        @NameInMap("codePackageUrl")
        public String codePackageUrl;

        /**
         * <p>The complete startup command, passed sequentially by parameter boundaries. For example, when using supergateway to start a stdio MCP, pass supergateway, --stdio, the complete subcommand, and the remaining parameters.</p>
         */
        @NameInMap("command")
        public java.util.List<String> command;

        /**
         * <p>The runtime environment for the code package: python3.13, nodejs22, or java17.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.13</p>
         */
        @NameInMap("language")
        public String language;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration setCodePackageUrl(String codePackageUrl) {
            this.codePackageUrl = codePackageUrl;
            return this;
        }
        public String getCodePackageUrl() {
            return this.codePackageUrl;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration extends TeaModel {
        /**
         * <p>The ID of the ACR instance.</p>
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
         * <p>The container entrypoint parameters.</p>
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
         * <p>The MCP runtime mode. Custom containers must currently expose the standard MCP themselves. Valid value: SELF_HOSTED.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_HOSTED</p>
         */
        @NameInMap("mcpRuntimeMode")
        public String mcpRuntimeMode;

        /**
         * <p>The source type of the container. The value is fixed to CONTAINER_IMAGE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTAINER_IMAGE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration setImageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
            return this;
        }
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration setMcpRuntimeMode(String mcpRuntimeMode) {
            this.mcpRuntimeMode = mcpRuntimeMode;
            return this;
        }
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks extends TeaModel {
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
         * <p>Log MCP tool calling</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Specifies whether the hook is enabled.</p>
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
         * <p>The timeout period in milliseconds.</p>
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

        public static InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks self = new InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigHookConfiguration extends TeaModel {
        /**
         * <p>Executes PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL hooks in the order of the array.</p>
         */
        @NameInMap("hooks")
        public java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks> hooks;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigHookConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigHookConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigHookConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfiguration setHooks(java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigHookConfigurationHooks> getHooks() {
            return this.hooks;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration extends TeaModel {
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
         * <p>The start rule for Function Compute log splitting.</p>
         * 
         * <strong>example:</strong>
         * <p>DefaultRegex</p>
         */
        @NameInMap("logBeginRule")
        public String logBeginRule;

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-logs</p>
         */
        @NameInMap("logstore")
        public String logstore;

        /**
         * <p>The name of the Simple Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>agentcore-mcp-logs</p>
         */
        @NameInMap("project")
        public String project;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration extends TeaModel {
        /**
         * <p>The path of the MCP endpoint, such as /mcp or /sse.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("endpointPath")
        public String endpointPath;

        /**
         * <p>The number of concurrent sessions per instance. The value is fixed to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sessionConcurrencyPerInstance")
        public Integer sessionConcurrencyPerInstance;

        /**
         * <p>The session idle timeout in seconds. Default value: 1800.</p>
         * 
         * <strong>example:</strong>
         * <p>1800</p>
         */
        @NameInMap("sessionIdleTimeoutSeconds")
        public Integer sessionIdleTimeoutSeconds;

        /**
         * <p>The maximum session lifetime in seconds. Default value: 21600.</p>
         * 
         * <strong>example:</strong>
         * <p>21600</p>
         */
        @NameInMap("sessionMaxLifetimeSeconds")
        public Integer sessionMaxLifetimeSeconds;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration setEndpointPath(String endpointPath) {
            this.endpointPath = endpointPath;
            return this;
        }
        public String getEndpointPath() {
            return this.endpointPath;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration setSessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration setSessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
            this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
            return this;
        }
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints extends TeaModel {
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

        public static InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints self = new InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration extends TeaModel {
        /**
         * <p>The ID of the execution user group.</p>
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
        public java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints> mountPoints;

        /**
         * <p>The ID of the execution user.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userId")
        public Integer userId;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration setMountPoints(java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigNasConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration extends TeaModel {
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

        public static InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The path in the OSS bucket.</p>
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

        public static InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints self = new InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfiguration extends TeaModel {
        /**
         * <p>The list of OSS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints> mountPoints;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfiguration setMountPoints(java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration extends TeaModel {
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

        public static InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration setRuleSetId(String ruleSetId) {
            this.ruleSetId = ruleSetId;
            return this;
        }
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigProxyConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable the MCP proxy.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigProxyConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigProxyConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigProxyConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration extends TeaModel {
        /**
         * <p>The CPU specification in cores. Default value: 0.25.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("cpu")
        public Double cpu;

        /**
         * <p>The ephemeral disk size in MB. Valid values: 512 and 10240.</p>
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
         * <p>The number of concurrent requests per instance. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("instanceConcurrency")
        public Integer instanceConcurrency;

        /**
         * <p>The memory specification in MB. Default value: 512.</p>
         * 
         * <strong>example:</strong>
         * <p>512</p>
         */
        @NameInMap("memory")
        public Integer memory;

        /**
         * <p>The service port. Default value: 9000.</p>
         * 
         * <strong>example:</strong>
         * <p>9000</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The function timeout period in seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        public static InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration self = new InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class InstallMcpMarketItemRequestBodyDeploymentConfig extends TeaModel {
        /**
         * <p>The access control for the MCP entry point.</p>
         */
        @NameInMap("accessControl")
        public InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl accessControl;

        /**
         * <p>The Agent Identity configuration.</p>
         */
        @NameInMap("agentIdentityConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration;

        /**
         * <p>The artifact type. Code indicates a ZIP code package, and Container indicates a custom container.</p>
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
        public InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration codeConfiguration;

        /**
         * <p>The custom container configuration.</p>
         */
        @NameInMap("containerConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration containerConfiguration;

        /**
         * <p>The hook configuration.</p>
         */
        @NameInMap("hookConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfiguration hookConfiguration;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("logConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration logConfiguration;

        /**
         * <p>The MCP session configuration.</p>
         */
        @NameInMap("mcpConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration mcpConfiguration;

        /**
         * <p>The NAS storage configuration.</p>
         */
        @NameInMap("nasConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration nasConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration networkConfiguration;

        /**
         * <p>The OSS mount configuration.</p>
         */
        @NameInMap("ossMountConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfiguration ossMountConfiguration;

        /**
         * <p>The parameter transformation and result enhancement configuration.</p>
         */
        @NameInMap("parameterTransformConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration;

        /**
         * <p>The MCP proxy configuration.</p>
         */
        @NameInMap("proxyConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigProxyConfiguration proxyConfiguration;

        /**
         * <p>The runtime and resource configuration.</p>
         */
        @NameInMap("runtimeConfiguration")
        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration runtimeConfiguration;

        public static InstallMcpMarketItemRequestBodyDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBodyDeploymentConfig self = new InstallMcpMarketItemRequestBodyDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setAccessControl(InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigAccessControl getAccessControl() {
            return this.accessControl;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setAgentIdentityConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration) {
            this.agentIdentityConfiguration = agentIdentityConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigAgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setCodeConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigCodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setContainerConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setHookConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigHookConfiguration hookConfiguration) {
            this.hookConfiguration = hookConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigHookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setLogConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigLogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setMcpConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration mcpConfiguration) {
            this.mcpConfiguration = mcpConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigMcpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setNasConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration nasConfiguration) {
            this.nasConfiguration = nasConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigNasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setNetworkConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setOssMountConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfiguration ossMountConfiguration) {
            this.ossMountConfiguration = ossMountConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigOssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setParameterTransformConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration) {
            this.parameterTransformConfiguration = parameterTransformConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setProxyConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        public InstallMcpMarketItemRequestBodyDeploymentConfig setRuntimeConfiguration(InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfigRuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

    }

    public static class InstallMcpMarketItemRequestBody extends TeaModel {
        /**
         * <p>The list of remote MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The MCP authentication configuration.</p>
         */
        @NameInMap("auth")
        public InstallMcpMarketItemRequestBodyAuth auth;

        /**
         * <p>The custom tags. Multiple tags are supported. Custom tags are merged and deduplicated with the fixed tags of the template.</p>
         */
        @NameInMap("customTags")
        public java.util.List<String> customTags;

        /**
         * <p>The deployment configuration for a code-deployed MCP.</p>
         */
        @NameInMap("deploymentConfig")
        public InstallMcpMarketItemRequestBodyDeploymentConfig deploymentConfig;

        /**
         * <p>The description of the MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP service for querying the knowledge base</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MCP service name.</p>
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
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The OpenAPI configuration used for HTTP-to-MCP conversion, represented as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;openapi&quot;:&quot;3.0.3&quot;,&quot;info&quot;:{&quot;title&quot;:&quot;Knowledge API&quot;,&quot;version&quot;:&quot;1.0.0&quot;},&quot;paths&quot;:{}}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        /**
         * <p>The MCP type. Valid values: DIRECT_PROXY (direct proxy), HTTP_TO_MCP (HTTP-to-MCP), and CODE_PACKAGE (code deployment).</p>
         * 
         * <strong>example:</strong>
         * <p>CODE_PACKAGE</p>
         */
        @NameInMap("type")
        public String type;

        public static InstallMcpMarketItemRequestBody build(java.util.Map<String, ?> map) throws Exception {
            InstallMcpMarketItemRequestBody self = new InstallMcpMarketItemRequestBody();
            return TeaModel.build(map, self);
        }

        public InstallMcpMarketItemRequestBody setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public InstallMcpMarketItemRequestBody setAuth(InstallMcpMarketItemRequestBodyAuth auth) {
            this.auth = auth;
            return this;
        }
        public InstallMcpMarketItemRequestBodyAuth getAuth() {
            return this.auth;
        }

        public InstallMcpMarketItemRequestBody setCustomTags(java.util.List<String> customTags) {
            this.customTags = customTags;
            return this;
        }
        public java.util.List<String> getCustomTags() {
            return this.customTags;
        }

        public InstallMcpMarketItemRequestBody setDeploymentConfig(InstallMcpMarketItemRequestBodyDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public InstallMcpMarketItemRequestBodyDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public InstallMcpMarketItemRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public InstallMcpMarketItemRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public InstallMcpMarketItemRequestBody setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public InstallMcpMarketItemRequestBody setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public InstallMcpMarketItemRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
