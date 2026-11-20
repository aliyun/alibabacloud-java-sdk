// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateMcpResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CreateMcpResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Request processed successfully</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMcpResponseBody self = new CreateMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMcpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMcpResponseBody setData(CreateMcpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMcpResponseBodyData getData() {
        return this.data;
    }

    public CreateMcpResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMcpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMcpResponseBodyDataAuthCodePackage extends TeaModel {
        /**
         * <p>The API key used to verify MCP callers.</p>
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

        public static CreateMcpResponseBodyDataAuthCodePackage build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataAuthCodePackage self = new CreateMcpResponseBodyDataAuthCodePackage();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataAuthCodePackage setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public CreateMcpResponseBodyDataAuthCodePackage setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

    }

    public static class CreateMcpResponseBodyDataAuthDirectProxy extends TeaModel {
        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the authentication parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>example-credential</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateMcpResponseBodyDataAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataAuthDirectProxy self = new CreateMcpResponseBodyDataAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpResponseBodyDataAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateMcpResponseBodyDataAuthHttpToMcp extends TeaModel {
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

        public static CreateMcpResponseBodyDataAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataAuthHttpToMcp self = new CreateMcpResponseBodyDataAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public CreateMcpResponseBodyDataAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateMcpResponseBodyDataAuth extends TeaModel {
        /**
         * <p>The caller API key authentication configuration for code-deployed MCP.</p>
         */
        @NameInMap("codePackage")
        public CreateMcpResponseBodyDataAuthCodePackage codePackage;

        /**
         * <p>The direct proxy authentication configuration.</p>
         */
        @NameInMap("directProxy")
        public CreateMcpResponseBodyDataAuthDirectProxy directProxy;

        /**
         * <p>Specifies whether to enable the configuration.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<CreateMcpResponseBodyDataAuthHttpToMcp> httpToMcp;

        public static CreateMcpResponseBodyDataAuth build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataAuth self = new CreateMcpResponseBodyDataAuth();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataAuth setCodePackage(CreateMcpResponseBodyDataAuthCodePackage codePackage) {
            this.codePackage = codePackage;
            return this;
        }
        public CreateMcpResponseBodyDataAuthCodePackage getCodePackage() {
            return this.codePackage;
        }

        public CreateMcpResponseBodyDataAuth setDirectProxy(CreateMcpResponseBodyDataAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public CreateMcpResponseBodyDataAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public CreateMcpResponseBodyDataAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpResponseBodyDataAuth setHttpToMcp(java.util.List<CreateMcpResponseBodyDataAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<CreateMcpResponseBodyDataAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigAccessControl extends TeaModel {
        /**
         * <p>The ID of the AgentCore credential referenced when the mode is set to CREDENTIAL.</p>
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
         * <p>The access control mode. ANONYMOUS indicates anonymous access, and CREDENTIAL indicates authentication by using AgentCore credentials.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL</p>
         */
        @NameInMap("mode")
        public String mode;

        public static CreateMcpResponseBodyDataDeploymentConfigAccessControl build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigAccessControl self = new CreateMcpResponseBodyDataDeploymentConfigAccessControl();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigAccessControl setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public CreateMcpResponseBodyDataDeploymentConfigAccessControl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpResponseBodyDataDeploymentConfigAccessControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable authorization.</p>
         */
        @NameInMap("authorizationEnabled")
        public Boolean authorizationEnabled;

        /**
         * <p>The credential provider ARN.</p>
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
         * <p>Specifies whether to enable agent identity.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration setAuthorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = authorizationEnabled;
            return this;
        }
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        public CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration extends TeaModel {
        /**
         * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. This token is used to create or update a code deployment after a presigned upload is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-token</p>
         */
        @NameInMap("codePackageToken")
        public String codePackageToken;

        /**
         * <p>The complete startup command, passed sequentially by parameter boundaries. For example, when using supergateway to start a stdio MCP, pass supergateway, --stdio, the complete subcommand, and the remaining parameters.</p>
         */
        @NameInMap("command")
        public java.util.List<String> command;

        /**
         * <p>The code package runtime: python3.13, nodejs22, or java17.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.13</p>
         */
        @NameInMap("language")
        public String language;

        public static CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration extends TeaModel {
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
         * <p>The container entrypoint parameters.</p>
         */
        @NameInMap("entrypoint")
        public java.util.List<String> entrypoint;

        /**
         * <p>The container image URL.</p>
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
         * <p>The MCP runtime mode. Custom containers currently need to expose standard MCP by themselves. Set the value to SELF_HOSTED.</p>
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

        public static CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration setImageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
            return this;
        }
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration setMcpRuntimeMode(String mcpRuntimeMode) {
            this.mcpRuntimeMode = mcpRuntimeMode;
            return this;
        }
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks extends TeaModel {
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
         * <p>Record MCP tool invocation</p>
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
         * <p>The timeout period in milliseconds.</p>
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

        public static CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks self = new CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigHookConfiguration extends TeaModel {
        /**
         * <p>Executes the PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL hooks in the order of the array.</p>
         */
        @NameInMap("hooks")
        public java.util.List<CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks> hooks;

        public static CreateMcpResponseBodyDataDeploymentConfigHookConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigHookConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigHookConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigHookConfiguration setHooks(java.util.List<CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<CreateMcpResponseBodyDataDeploymentConfigHookConfigurationHooks> getHooks() {
            return this.hooks;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigLogConfiguration extends TeaModel {
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
         * <p>The start rule for log segmentation.</p>
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

        public static CreateMcpResponseBodyDataDeploymentConfigLogConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigLogConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigLogConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigLogConfiguration setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public CreateMcpResponseBodyDataDeploymentConfigLogConfiguration setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public CreateMcpResponseBodyDataDeploymentConfigLogConfiguration setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public CreateMcpResponseBodyDataDeploymentConfigLogConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public CreateMcpResponseBodyDataDeploymentConfigLogConfiguration setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration extends TeaModel {
        /**
         * <p>The MCP endpoint path, such as /mcp or /sse.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("endpointPath")
        public String endpointPath;

        /**
         * <p>The session concurrency per instance. Currently fixed to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sessionConcurrencyPerInstance")
        public Integer sessionConcurrencyPerInstance;

        /**
         * <p>The session idle timeout period in seconds. Default value: 1800.</p>
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

        /**
         * <p>The session mode. Only applicable to StreamableHTTP. Default value for creation: STATEFUL. If omitted during an update, the original value is retained. STATELESS disables Function Compute session affinity, and the stdio gateway does not enable stateful mode. Native HTTP services must support stateless MCP by themselves.</p>
         * 
         * <strong>example:</strong>
         * <p>STATEFUL</p>
         */
        @NameInMap("sessionMode")
        public String sessionMode;

        public static CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration setEndpointPath(String endpointPath) {
            this.endpointPath = endpointPath;
            return this;
        }
        public String getEndpointPath() {
            return this.endpointPath;
        }

        public CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration setSessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        public CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        public CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration setSessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
            this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
            return this;
        }
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

        public CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration setSessionMode(String sessionMode) {
            this.sessionMode = sessionMode;
            return this;
        }
        public String getSessionMode() {
            return this.sessionMode;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints extends TeaModel {
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

        public static CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints self = new CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigNasConfiguration extends TeaModel {
        /**
         * <p>The ID of the user group.</p>
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
        public java.util.List<CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints> mountPoints;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userId")
        public Integer userId;

        public static CreateMcpResponseBodyDataDeploymentConfigNasConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigNasConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigNasConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigNasConfiguration setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public CreateMcpResponseBodyDataDeploymentConfigNasConfiguration setMountPoints(java.util.List<CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<CreateMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public CreateMcpResponseBodyDataDeploymentConfigNasConfiguration setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration extends TeaModel {
        /**
         * <p>The network mode.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        @NameInMap("networkMode")
        public String networkMode;

        /**
         * <p>The ID of the security group.</p>
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
         * <p>The ID of the virtual private cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-example</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints extends TeaModel {
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
         * <p>The endpoint of the OSS service.</p>
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

        public static CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints self = new CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigOssMountConfiguration extends TeaModel {
        /**
         * <p>The list of OSS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> mountPoints;

        public static CreateMcpResponseBodyDataDeploymentConfigOssMountConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigOssMountConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigOssMountConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigOssMountConfiguration setMountPoints(java.util.List<CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<CreateMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration extends TeaModel {
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

        public static CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration setRuleSetId(String ruleSetId) {
            this.ruleSetId = ruleSetId;
            return this;
        }
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        public CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigProxyConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable the MCP proxy.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateMcpResponseBodyDataDeploymentConfigProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigProxyConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigProxyConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigProxyConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration extends TeaModel {
        /**
         * <p>The CPU specifications in cores. Default value: 0.25.</p>
         * 
         * <strong>example:</strong>
         * <p>0.25</p>
         */
        @NameInMap("cpu")
        public Double cpu;

        /**
         * <p>The temporary disk size in MB. Valid values: 512 and 10240.</p>
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
         * <p>The request concurrency per instance. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("instanceConcurrency")
        public Integer instanceConcurrency;

        /**
         * <p>The memory specifications in MB. Default value: 512.</p>
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

        public static CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration self = new CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateMcpResponseBodyDataDeploymentConfig extends TeaModel {
        /**
         * <p>The MCP ingress access control configuration.</p>
         */
        @NameInMap("accessControl")
        public CreateMcpResponseBodyDataDeploymentConfigAccessControl accessControl;

        /**
         * <p>The agent identity configuration.</p>
         */
        @NameInMap("agentIdentityConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration;

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
        public CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration codeConfiguration;

        /**
         * <p>The custom container configuration.</p>
         */
        @NameInMap("containerConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration containerConfiguration;

        /**
         * <p>The hook configuration.</p>
         */
        @NameInMap("hookConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigHookConfiguration hookConfiguration;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("logConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigLogConfiguration logConfiguration;

        /**
         * <p>The MCP session configuration.</p>
         */
        @NameInMap("mcpConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration mcpConfiguration;

        /**
         * <p>The NAS storage configuration.</p>
         */
        @NameInMap("nasConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigNasConfiguration nasConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration networkConfiguration;

        /**
         * <p>The OSS mount configuration.</p>
         */
        @NameInMap("ossMountConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigOssMountConfiguration ossMountConfiguration;

        /**
         * <p>The parameter transformation and result enhancement configuration.</p>
         */
        @NameInMap("parameterTransformConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration;

        /**
         * <p>The MCP proxy configuration.</p>
         */
        @NameInMap("proxyConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigProxyConfiguration proxyConfiguration;

        /**
         * <p>The runtime and resource configuration.</p>
         */
        @NameInMap("runtimeConfiguration")
        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration runtimeConfiguration;

        public static CreateMcpResponseBodyDataDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataDeploymentConfig self = new CreateMcpResponseBodyDataDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataDeploymentConfig setAccessControl(CreateMcpResponseBodyDataDeploymentConfigAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigAccessControl getAccessControl() {
            return this.accessControl;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setAgentIdentityConfiguration(CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration) {
            this.agentIdentityConfiguration = agentIdentityConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setCodeConfiguration(CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigCodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setContainerConfiguration(CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setHookConfiguration(CreateMcpResponseBodyDataDeploymentConfigHookConfiguration hookConfiguration) {
            this.hookConfiguration = hookConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigHookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setLogConfiguration(CreateMcpResponseBodyDataDeploymentConfigLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigLogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setMcpConfiguration(CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration mcpConfiguration) {
            this.mcpConfiguration = mcpConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigMcpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setNasConfiguration(CreateMcpResponseBodyDataDeploymentConfigNasConfiguration nasConfiguration) {
            this.nasConfiguration = nasConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigNasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setNetworkConfiguration(CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setOssMountConfiguration(CreateMcpResponseBodyDataDeploymentConfigOssMountConfiguration ossMountConfiguration) {
            this.ossMountConfiguration = ossMountConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigOssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setParameterTransformConfiguration(CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration) {
            this.parameterTransformConfiguration = parameterTransformConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setProxyConfiguration(CreateMcpResponseBodyDataDeploymentConfigProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        public CreateMcpResponseBodyDataDeploymentConfig setRuntimeConfiguration(CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfigRuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

    }

    public static class CreateMcpResponseBodyDataMarketSource extends TeaModel {
        /**
         * <p>The ID of the MCP marketplace template.</p>
         * 
         * <strong>example:</strong>
         * <p>market-1</p>
         */
        @NameInMap("marketItemId")
        public String marketItemId;

        public static CreateMcpResponseBodyDataMarketSource build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataMarketSource self = new CreateMcpResponseBodyDataMarketSource();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataMarketSource setMarketItemId(String marketItemId) {
            this.marketItemId = marketItemId;
            return this;
        }
        public String getMarketItemId() {
            return this.marketItemId;
        }

    }

    public static class CreateMcpResponseBodyDataOperationError extends TeaModel {
        /**
         * <p>Returns only bounded diagnostic codes and does not return the original error body of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>PROBE_TIMEOUT</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The necessary diagnostics that are trimmed and desensitized. This parameter does not contain credentials or original responses.</p>
         * 
         * <strong>example:</strong>
         * <p>The probe deadline was exceeded.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Specifies whether the operation is suitable for retry based on a restricted policy. This parameter does not trigger automatic retries.</p>
         */
        @NameInMap("retryable")
        public Boolean retryable;

        /**
         * <p>The source of the error. Valid values: MAGIC, ROUTER, NETWORK, ORIGIN, and UNKNOWN. The value is determined only based on actual evidence.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The detection or release stage where the error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>INITIALIZE</p>
         */
        @NameInMap("stage")
        public String stage;

        public static CreateMcpResponseBodyDataOperationError build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataOperationError self = new CreateMcpResponseBodyDataOperationError();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataOperationError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateMcpResponseBodyDataOperationError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateMcpResponseBodyDataOperationError setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public CreateMcpResponseBodyDataOperationError setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateMcpResponseBodyDataOperationError setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

    public static class CreateMcpResponseBodyDataOperation extends TeaModel {
        /**
         * <p>The desensitized error of the current release operation. This field indicates the failure of the gateway or formal link after the origin server passes the verification.</p>
         */
        @NameInMap("error")
        public CreateMcpResponseBodyDataOperationError error;

        /**
         * <p>The ID of the current or most recent release operation.</p>
         * 
         * <strong>example:</strong>
         * <p>3541f1af-87cc-45d1-a28e-94ec5633b931</p>
         */
        @NameInMap("operationId")
        public String operationId;

        /**
         * <p>The release stage, such as compute deployment, origin verification, summary saving, gateway release, ingress credential synchronization, formal link verification, or deployment submission. Old tasks retain their original stage semantics.</p>
         * 
         * <strong>example:</strong>
         * <p>VALIDATE_ORIGIN</p>
         */
        @NameInMap("stage")
        public String stage;

        /**
         * <p>The status of the operation. Valid values: PENDING, RUNNING, SUCCEEDED, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the operation. Valid value: PUBLISH.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISH</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the operation was updated in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-19T08:30:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static CreateMcpResponseBodyDataOperation build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataOperation self = new CreateMcpResponseBodyDataOperation();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataOperation setError(CreateMcpResponseBodyDataOperationError error) {
            this.error = error;
            return this;
        }
        public CreateMcpResponseBodyDataOperationError getError() {
            return this.error;
        }

        public CreateMcpResponseBodyDataOperation setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public CreateMcpResponseBodyDataOperation setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public CreateMcpResponseBodyDataOperation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateMcpResponseBodyDataOperation setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateMcpResponseBodyDataOperation setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration extends TeaModel {
        /**
         * <p>The verified backend MCP protocol policy. Valid values: legacy and modern. This parameter is empty if the policy is not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>modern</p>
         */
        @NameInMap("backendMcpProtocol")
        public String backendMcpProtocol;

        /**
         * <p>The verified MCP transport. Valid values: SSE and StreamableHTTP. This parameter is empty if the transport is not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The actual negotiated or selected and verified date version of the MCP protocol. This parameter is empty if the version is not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26</p>
         */
        @NameInMap("protocolVersion")
        public String protocolVersion;

        /**
         * <p>The actual session mode. Valid values: STATEFUL, STATELESS, and NOT_APPLICABLE. This parameter is empty if the mode is not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>STATELESS</p>
         */
        @NameInMap("sessionMode")
        public String sessionMode;

        public static CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration self = new CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration setBackendMcpProtocol(String backendMcpProtocol) {
            this.backendMcpProtocol = backendMcpProtocol;
            return this;
        }
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration setProtocolVersion(String protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }
        public String getProtocolVersion() {
            return this.protocolVersion;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration setSessionMode(String sessionMode) {
            this.sessionMode = sessionMode;
            return this;
        }
        public String getSessionMode() {
            return this.sessionMode;
        }

    }

    public static class CreateMcpResponseBodyDataOriginProbeLastResultError extends TeaModel {
        /**
         * <p>Returns only bounded diagnostic codes and does not return the original error body of the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>PROBE_TIMEOUT</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The necessary diagnostics that are trimmed and desensitized. This parameter does not contain credentials or original responses.</p>
         * 
         * <strong>example:</strong>
         * <p>The probe deadline was exceeded.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Specifies whether the operation is suitable for retry based on a restricted policy. This parameter does not trigger automatic retries.</p>
         */
        @NameInMap("retryable")
        public Boolean retryable;

        /**
         * <p>The source of the error. Valid values: MAGIC, ROUTER, NETWORK, ORIGIN, and UNKNOWN. The value is determined only based on actual evidence.</p>
         * 
         * <strong>example:</strong>
         * <p>UNKNOWN</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The detection or release stage where the error occurred.</p>
         * 
         * <strong>example:</strong>
         * <p>INITIALIZE</p>
         */
        @NameInMap("stage")
        public String stage;

        public static CreateMcpResponseBodyDataOriginProbeLastResultError build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataOriginProbeLastResultError self = new CreateMcpResponseBodyDataOriginProbeLastResultError();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultError setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultError setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResultError setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

    public static class CreateMcpResponseBodyDataOriginProbeLastResult extends TeaModel {
        /**
         * <p>The actual configuration confirmed by evidence in the current verification. This parameter is empty if no confirmed information is available and is not inferred from the expected configuration.</p>
         */
        @NameInMap("actualConfiguration")
        public CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration actualConfiguration;

        /**
         * <p>The verification error. This parameter is empty if the verification is successful. It saves only the desensitized diagnostics required for the current verification.</p>
         */
        @NameInMap("error")
        public CreateMcpResponseBodyDataOriginProbeLastResultError error;

        /**
         * <p>The time of the current origin verification in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-19T08:30:00Z</p>
         */
        @NameInMap("probedAt")
        public String probedAt;

        /**
         * <p>The verification stage. Valid values: CONNECT, DISCOVER, INITIALIZE, SESSION_CHECK, CLEANUP, and COMPLETE.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("stage")
        public String stage;

        /**
         * <p>The verification result. Valid values: SUCCESS and FAILED. The value is SUCCESS if the protocol and applicable session checks pass. Not declaring any capabilities does not affect the result.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        public static CreateMcpResponseBodyDataOriginProbeLastResult build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataOriginProbeLastResult self = new CreateMcpResponseBodyDataOriginProbeLastResult();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataOriginProbeLastResult setActualConfiguration(CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration actualConfiguration) {
            this.actualConfiguration = actualConfiguration;
            return this;
        }
        public CreateMcpResponseBodyDataOriginProbeLastResultActualConfiguration getActualConfiguration() {
            return this.actualConfiguration;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResult setError(CreateMcpResponseBodyDataOriginProbeLastResultError error) {
            this.error = error;
            return this;
        }
        public CreateMcpResponseBodyDataOriginProbeLastResultError getError() {
            return this.error;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResult setProbedAt(String probedAt) {
            this.probedAt = probedAt;
            return this;
        }
        public String getProbedAt() {
            return this.probedAt;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public CreateMcpResponseBodyDataOriginProbeLastResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class CreateMcpResponseBodyDataOriginProbe extends TeaModel {
        /**
         * <p>Returned only for CODE_PACKAGE. This parameter is cleared when a new task starts and is empty if no verification has been performed or if an old task did not perform verification. If a subsequent release fails, the current summary is retained. This parameter does not indicate real-time health or the status of the effective version.</p>
         */
        @NameInMap("lastResult")
        public CreateMcpResponseBodyDataOriginProbeLastResult lastResult;

        public static CreateMcpResponseBodyDataOriginProbe build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataOriginProbe self = new CreateMcpResponseBodyDataOriginProbe();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataOriginProbe setLastResult(CreateMcpResponseBodyDataOriginProbeLastResult lastResult) {
            this.lastResult = lastResult;
            return this;
        }
        public CreateMcpResponseBodyDataOriginProbeLastResult getLastResult() {
            return this.lastResult;
        }

    }

    public static class CreateMcpResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The template version currently applied to the MCP.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("appliedTemplateVersion")
        public String appliedTemplateVersion;

        /**
         * <p>The latest template version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.0</p>
         */
        @NameInMap("latestTemplateVersion")
        public String latestTemplateVersion;

        /**
         * <p>The schema version of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("schemaVersion")
        public String schemaVersion;

        /**
         * <p>The input schema of the template, represented as a JSON Schema string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;addresses&quot;:{&quot;type&quot;:&quot;array&quot;,&quot;items&quot;:{&quot;type&quot;:&quot;string&quot;}}}}</p>
         */
        @NameInMap("templateInputSchema")
        public String templateInputSchema;

        /**
         * <p>Indicates whether a newer template version is available.</p>
         */
        @NameInMap("updateAvailable")
        public Boolean updateAvailable;

        public static CreateMcpResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyDataTemplate self = new CreateMcpResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyDataTemplate setAppliedTemplateVersion(String appliedTemplateVersion) {
            this.appliedTemplateVersion = appliedTemplateVersion;
            return this;
        }
        public String getAppliedTemplateVersion() {
            return this.appliedTemplateVersion;
        }

        public CreateMcpResponseBodyDataTemplate setLatestTemplateVersion(String latestTemplateVersion) {
            this.latestTemplateVersion = latestTemplateVersion;
            return this;
        }
        public String getLatestTemplateVersion() {
            return this.latestTemplateVersion;
        }

        public CreateMcpResponseBodyDataTemplate setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public CreateMcpResponseBodyDataTemplate setTemplateInputSchema(String templateInputSchema) {
            this.templateInputSchema = templateInputSchema;
            return this;
        }
        public String getTemplateInputSchema() {
            return this.templateInputSchema;
        }

        public CreateMcpResponseBodyDataTemplate setUpdateAvailable(Boolean updateAvailable) {
            this.updateAvailable = updateAvailable;
            return this;
        }
        public Boolean getUpdateAvailable() {
            return this.updateAvailable;
        }

    }

    public static class CreateMcpResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP service addresses. Required when Type is DIRECT_PROXY or HTTP_TO_MCP. Do not specify when Type is CODE_PACKAGE.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. enabled indicates whether it is enabled; directProxy specifies the custom authentication headers for direct proxy; httpToMcp specifies the list of OpenAPI credentials for HTTP_TO_MCP.</p>
         */
        @NameInMap("auth")
        public CreateMcpResponseBodyDataAuth auth;

        /**
         * <p>The saved legacy or modern backend policy, which is separate from the transport indicated by protocol and does not indicate verification. This field is not saved for newly created CODE_PACKAGE. For historical CODE_PACKAGE, the existing value does not control Function Compute session affinity or gateway protocol; for the actual protocol, refer to OriginProbe.LastResult.ActualConfiguration.BackendMcpProtocol. This field is returned as empty for historically unspecified values and HTTP_TO_MCP.</p>
         * 
         * <strong>example:</strong>
         * <p>modern</p>
         */
        @NameInMap("backendMcpProtocol")
        public String backendMcpProtocol;

        /**
         * <p>The custom tags. Multiple tags are supported.</p>
         */
        @NameInMap("customTags")
        public java.util.List<String> customTags;

        /**
         * <p>The deployment configuration of the code deployment MCP.</p>
         */
        @NameInMap("deploymentConfig")
        public CreateMcpResponseBodyDataDeploymentConfig deploymentConfig;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description to illustrate the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MCP endpoint that can be called by users or agents. This parameter is empty before the deployment is completed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The name of the Function Compute function corresponding to the CODE_PACKAGE MCP. This parameter is empty before the deployment is completed or for other types.</p>
         * 
         * <strong>example:</strong>
         * <p>agentcore-mcp-example</p>
         */
        @NameInMap("functionName")
        public String functionName;

        /**
         * <p>The MCP marketplace source template.</p>
         */
        @NameInMap("marketSource")
        public CreateMcpResponseBodyDataMarketSource marketSource;

        /**
         * <p>The MCP server configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("mcpServerConfig")
        public String mcpServerConfig;

        /**
         * <p>The MCP service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-1234567890abcdef</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-example</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The official usage tag managed by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE_BASE</p>
         */
        @NameInMap("officialTag")
        public String officialTag;

        /**
         * <p>The read-only progress that reuses an existing release task. This parameter does not change the primary status of the resource and is empty if no historical operation information is available.</p>
         */
        @NameInMap("operation")
        public CreateMcpResponseBodyDataOperation operation;

        /**
         * <p>Returns the minimal origin verification summary of the most recent task only for code deployment. This parameter is empty for direct connection and HTTP-to-MCP scenarios. Querying this parameter does not trigger probing.</p>
         */
        @NameInMap("originProbe")
        public CreateMcpResponseBodyDataOriginProbe originProbe;

        /**
         * <p>The optional saved origin MCP protocol date display metadata in the YYYY-MM-DD format. You can specify this parameter when you create the resource and modify it when you update the resource. If you omit this parameter during an update, the current value is retained. This parameter is used only to save and display information. It does not represent a software version, restrict the external protocol of the gateway, control backend requests, or indicate that real-time verification is passed. If this parameter is omitted during creation and not updated, is missing in history, or is set to HTTP_TO_MCP, null is returned. No default value is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26</p>
         */
        @NameInMap("originProtocolVersion")
        public String originProtocolVersion;

        /**
         * <p>The access permission mode. PUBLIC indicates public access. CONTROLLED indicates that access is controlled based on permission rules.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTROLLED</p>
         */
        @NameInMap("permissionMode")
        public String permissionMode;

        /**
         * <p>The MCP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>SSE</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The status reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Resource processing completed</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The Swagger configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;}</p>
         */
        @NameInMap("swaggerConfig")
        public String swaggerConfig;

        /**
         * <p>The bound template version and input schema of the MCP.</p>
         */
        @NameInMap("template")
        public CreateMcpResponseBodyDataTemplate template;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Indicates whether the MCP is still subject to the usage constraints of the official template.</p>
         */
        @NameInMap("usageActive")
        public Boolean usageActive;

        public static CreateMcpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMcpResponseBodyData self = new CreateMcpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMcpResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public CreateMcpResponseBodyData setAuth(CreateMcpResponseBodyDataAuth auth) {
            this.auth = auth;
            return this;
        }
        public CreateMcpResponseBodyDataAuth getAuth() {
            return this.auth;
        }

        public CreateMcpResponseBodyData setBackendMcpProtocol(String backendMcpProtocol) {
            this.backendMcpProtocol = backendMcpProtocol;
            return this;
        }
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        public CreateMcpResponseBodyData setCustomTags(java.util.List<String> customTags) {
            this.customTags = customTags;
            return this;
        }
        public java.util.List<String> getCustomTags() {
            return this.customTags;
        }

        public CreateMcpResponseBodyData setDeploymentConfig(CreateMcpResponseBodyDataDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public CreateMcpResponseBodyDataDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public CreateMcpResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateMcpResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateMcpResponseBodyData setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public CreateMcpResponseBodyData setMarketSource(CreateMcpResponseBodyDataMarketSource marketSource) {
            this.marketSource = marketSource;
            return this;
        }
        public CreateMcpResponseBodyDataMarketSource getMarketSource() {
            return this.marketSource;
        }

        public CreateMcpResponseBodyData setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public CreateMcpResponseBodyData setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public CreateMcpResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateMcpResponseBodyData setOfficialTag(String officialTag) {
            this.officialTag = officialTag;
            return this;
        }
        public String getOfficialTag() {
            return this.officialTag;
        }

        public CreateMcpResponseBodyData setOperation(CreateMcpResponseBodyDataOperation operation) {
            this.operation = operation;
            return this;
        }
        public CreateMcpResponseBodyDataOperation getOperation() {
            return this.operation;
        }

        public CreateMcpResponseBodyData setOriginProbe(CreateMcpResponseBodyDataOriginProbe originProbe) {
            this.originProbe = originProbe;
            return this;
        }
        public CreateMcpResponseBodyDataOriginProbe getOriginProbe() {
            return this.originProbe;
        }

        public CreateMcpResponseBodyData setOriginProtocolVersion(String originProtocolVersion) {
            this.originProtocolVersion = originProtocolVersion;
            return this;
        }
        public String getOriginProtocolVersion() {
            return this.originProtocolVersion;
        }

        public CreateMcpResponseBodyData setPermissionMode(String permissionMode) {
            this.permissionMode = permissionMode;
            return this;
        }
        public String getPermissionMode() {
            return this.permissionMode;
        }

        public CreateMcpResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateMcpResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateMcpResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public CreateMcpResponseBodyData setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public CreateMcpResponseBodyData setTemplate(CreateMcpResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public CreateMcpResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public CreateMcpResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateMcpResponseBodyData setUsageActive(Boolean usageActive) {
            this.usageActive = usageActive;
            return this;
        }
        public Boolean getUsageActive() {
            return this.usageActive;
        }

    }

}
