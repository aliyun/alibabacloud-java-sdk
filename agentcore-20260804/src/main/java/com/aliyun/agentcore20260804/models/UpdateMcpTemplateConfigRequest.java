// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMcpTemplateConfigRequest extends TeaModel {
    /**
     * <p>The MCP configuration to update by the specified template version. The configuration must conform to the input schema of the template.</p>
     */
    @NameInMap("body")
    public UpdateMcpTemplateConfigRequestBody body;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    /**
     * <p>The template version used for this update.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0.0</p>
     */
    @NameInMap("templateVersion")
    public String templateVersion;

    public static UpdateMcpTemplateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpTemplateConfigRequest self = new UpdateMcpTemplateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMcpTemplateConfigRequest setBody(UpdateMcpTemplateConfigRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcpTemplateConfigRequestBody getBody() {
        return this.body;
    }

    public UpdateMcpTemplateConfigRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateMcpTemplateConfigRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static class UpdateMcpTemplateConfigRequestBodyAuthDirectProxy extends TeaModel {
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

        public static UpdateMcpTemplateConfigRequestBodyAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyAuthDirectProxy self = new UpdateMcpTemplateConfigRequestBodyAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMcpTemplateConfigRequestBodyAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp extends TeaModel {
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
         * <p>The position where the API key is delivered.</p>
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

        public static UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp self = new UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyAuth extends TeaModel {
        /**
         * <p>The backend authentication configuration for direct proxy.</p>
         */
        @NameInMap("directProxy")
        public UpdateMcpTemplateConfigRequestBodyAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether this configuration is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of backend authentication configurations for HTTP-to-MCP conversion.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp> httpToMcp;

        public static UpdateMcpTemplateConfigRequestBodyAuth build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyAuth self = new UpdateMcpTemplateConfigRequestBodyAuth();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyAuth setDirectProxy(UpdateMcpTemplateConfigRequestBodyAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public UpdateMcpTemplateConfigRequestBodyAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpTemplateConfigRequestBodyAuth setHttpToMcp(java.util.List<UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<UpdateMcpTemplateConfigRequestBodyAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl extends TeaModel {
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
         * <li>CREDENTIAL: uses AgentCore access credentials.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL</p>
         */
        @NameInMap("mode")
        public String mode;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration extends TeaModel {
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
         * <p>The credential provider type.</p>
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

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration setAuthorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = authorizationEnabled;
            return this;
        }
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration extends TeaModel {
        /**
         * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. Use this token to create or update a code deployment after completing the pre-signed upload.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-token</p>
         */
        @NameInMap("codePackageToken")
        public String codePackageToken;

        /**
         * <p>The full startup command, with each argument passed in order by parameter boundary. For example, when using supergateway to start a stdio MCP, pass supergateway, --stdio, the full subcommand, and remaining arguments.</p>
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

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration extends TeaModel {
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
         * <p>Custom containers must expose a standard MCP endpoint on their own. Set this parameter to SELF_HOSTED.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_HOSTED</p>
         */
        @NameInMap("mcpRuntimeMode")
        public String mcpRuntimeMode;

        /**
         * <p>Currently fixed to CONTAINER_IMAGE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTAINER_IMAGE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration setImageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
            return this;
        }
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration setMcpRuntimeMode(String mcpRuntimeMode) {
            this.mcpRuntimeMode = mcpRuntimeMode;
            return this;
        }
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks extends TeaModel {
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
         * <p>The timeout period, in milliseconds.</p>
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

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfiguration extends TeaModel {
        /**
         * <p>The PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL hooks are executed in array order.</p>
         */
        @NameInMap("hooks")
        public java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks> hooks;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfiguration setHooks(java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfigurationHooks> getHooks() {
            return this.hooks;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration extends TeaModel {
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
         * <p>The Simple Log Service project name.</p>
         * 
         * <strong>example:</strong>
         * <p>agentcore-mcp-logs</p>
         */
        @NameInMap("project")
        public String project;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration extends TeaModel {
        /**
         * <p>The MCP endpoint path, such as /mcp or /sse.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("endpointPath")
        public String endpointPath;

        /**
         * <p>The number of concurrent sessions per instance. Currently fixed to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sessionConcurrencyPerInstance")
        public Integer sessionConcurrencyPerInstance;

        /**
         * <p>The session idle timeout period. Unit: seconds. Default value: 1800.</p>
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

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration setEndpointPath(String endpointPath) {
            this.endpointPath = endpointPath;
            return this;
        }
        public String getEndpointPath() {
            return this.endpointPath;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration setSessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration setSessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
            this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
            return this;
        }
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints extends TeaModel {
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

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration extends TeaModel {
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
        public java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints> mountPoints;

        /**
         * <p>The runtime user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userId")
        public Integer userId;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration setMountPoints(java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration extends TeaModel {
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

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints extends TeaModel {
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

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfiguration extends TeaModel {
        /**
         * <p>The list of OSS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints> mountPoints;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfiguration setMountPoints(java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable parameter transform and result enhancement.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The reserved reference to the parameter transform and result enhancement rule set.</p>
         * 
         * <strong>example:</strong>
         * <p>rules-1</p>
         */
        @NameInMap("ruleSetId")
        public String ruleSetId;

        /**
         * <p>The transform rule version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("version")
        public String version;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration setRuleSetId(String ruleSetId) {
            this.ruleSetId = ruleSetId;
            return this;
        }
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigProxyConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable the MCP proxy.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigProxyConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigProxyConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigProxyConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration extends TeaModel {
        /**
         * <p>The number of vCPUs. Default value: 0.25.</p>
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
         * <p>The ARN of the RAM role used by user code to access downstream Alibaba Cloud resources.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890123456:role/agentcore-mcp-execution</p>
         */
        @NameInMap("executionRoleArn")
        public String executionRoleArn;

        /**
         * <p>The maximum number of concurrent requests per instance. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("instanceConcurrency")
        public Integer instanceConcurrency;

        /**
         * <p>The memory size. Unit: MB. Default value: 512.</p>
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
         * <p>The function timeout period. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("timeout")
        public Integer timeout;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBodyDeploymentConfig extends TeaModel {
        /**
         * <p>The MCP ingress access control configuration.</p>
         */
        @NameInMap("accessControl")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl accessControl;

        /**
         * <p>The Agent Identity configuration.</p>
         */
        @NameInMap("agentIdentityConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration;

        /**
         * <p>Valid values: Code (ZIP code package) and Container (custom container).</p>
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
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration codeConfiguration;

        /**
         * <p>The custom container configuration.</p>
         */
        @NameInMap("containerConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration containerConfiguration;

        /**
         * <p>The hook configuration.</p>
         */
        @NameInMap("hookConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfiguration hookConfiguration;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("logConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration logConfiguration;

        /**
         * <p>The MCP session configuration.</p>
         */
        @NameInMap("mcpConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration mcpConfiguration;

        /**
         * <p>The NAS storage configuration.</p>
         */
        @NameInMap("nasConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration nasConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration networkConfiguration;

        /**
         * <p>The OSS mount configuration.</p>
         */
        @NameInMap("ossMountConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfiguration ossMountConfiguration;

        /**
         * <p>The parameter transform and result enhancement configuration.</p>
         */
        @NameInMap("parameterTransformConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration;

        /**
         * <p>The MCP proxy configuration.</p>
         */
        @NameInMap("proxyConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigProxyConfiguration proxyConfiguration;

        /**
         * <p>The runtime and resource configuration.</p>
         */
        @NameInMap("runtimeConfiguration")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration runtimeConfiguration;

        public static UpdateMcpTemplateConfigRequestBodyDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBodyDeploymentConfig self = new UpdateMcpTemplateConfigRequestBodyDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setAccessControl(UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAccessControl getAccessControl() {
            return this.accessControl;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setAgentIdentityConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration) {
            this.agentIdentityConfiguration = agentIdentityConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigAgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setCodeConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigCodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setContainerConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setHookConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfiguration hookConfiguration) {
            this.hookConfiguration = hookConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigHookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setLogConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigLogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setMcpConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration mcpConfiguration) {
            this.mcpConfiguration = mcpConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigMcpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setNasConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration nasConfiguration) {
            this.nasConfiguration = nasConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setNetworkConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setOssMountConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfiguration ossMountConfiguration) {
            this.ossMountConfiguration = ossMountConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigOssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setParameterTransformConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration) {
            this.parameterTransformConfiguration = parameterTransformConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setProxyConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig setRuntimeConfiguration(UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfigRuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

    }

    public static class UpdateMcpTemplateConfigRequestBody extends TeaModel {
        /**
         * <p>The list of remote MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The MCP authentication configuration.</p>
         */
        @NameInMap("auth")
        public UpdateMcpTemplateConfigRequestBodyAuth auth;

        /**
         * <p>The deployment configuration for code-deployed MCP.</p>
         */
        @NameInMap("deploymentConfig")
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig deploymentConfig;

        /**
         * <p>The description of the MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p>An MCP service for querying the knowledge base</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The OpenAPI configuration used for HTTP-to-MCP conversion, represented as a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;openapi&quot;:&quot;3.0.3&quot;,&quot;info&quot;:{&quot;title&quot;:&quot;Knowledge API&quot;,&quot;version&quot;:&quot;1.0.0&quot;},&quot;paths&quot;:{}}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        public static UpdateMcpTemplateConfigRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigRequestBody self = new UpdateMcpTemplateConfigRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigRequestBody setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public UpdateMcpTemplateConfigRequestBody setAuth(UpdateMcpTemplateConfigRequestBodyAuth auth) {
            this.auth = auth;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyAuth getAuth() {
            return this.auth;
        }

        public UpdateMcpTemplateConfigRequestBody setDeploymentConfig(UpdateMcpTemplateConfigRequestBodyDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public UpdateMcpTemplateConfigRequestBodyDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public UpdateMcpTemplateConfigRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMcpTemplateConfigRequestBody setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

    }

}
