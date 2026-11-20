// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMcpResponseBody extends TeaModel {
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
    public GetMcpResponseBodyData data;

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

    public static GetMcpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMcpResponseBody self = new GetMcpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMcpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMcpResponseBody setData(GetMcpResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMcpResponseBodyData getData() {
        return this.data;
    }

    public GetMcpResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMcpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMcpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMcpResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMcpResponseBodyDataAuthCodePackage extends TeaModel {
        /**
         * <p>The API key used to verify the MCP caller.</p>
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

        public static GetMcpResponseBodyDataAuthCodePackage build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataAuthCodePackage self = new GetMcpResponseBodyDataAuthCodePackage();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataAuthCodePackage setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public GetMcpResponseBodyDataAuthCodePackage setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

    }

    public static class GetMcpResponseBodyDataAuthDirectProxy extends TeaModel {
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

        public static GetMcpResponseBodyDataAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataAuthDirectProxy self = new GetMcpResponseBodyDataAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpResponseBodyDataAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetMcpResponseBodyDataAuthHttpToMcp extends TeaModel {
        /**
         * <p>The authentication credential.</p>
         * 
         * <strong>example:</strong>
         * <p>example-credential</p>
         */
        @NameInMap("credential")
        public String credential;

        /**
         * <p>The ID of the authentication scheme.</p>
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
         * <p>The location of the credential.</p>
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

        public static GetMcpResponseBodyDataAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataAuthHttpToMcp self = new GetMcpResponseBodyDataAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public GetMcpResponseBodyDataAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMcpResponseBodyDataAuth extends TeaModel {
        /**
         * <p>The caller API key authentication configuration for the code deployment MCP.</p>
         */
        @NameInMap("codePackage")
        public GetMcpResponseBodyDataAuthCodePackage codePackage;

        /**
         * <p>The authentication configuration for the direct proxy.</p>
         */
        @NameInMap("directProxy")
        public GetMcpResponseBodyDataAuthDirectProxy directProxy;

        /**
         * <p>Indicates whether the configuration is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of authentication configurations for HTTP_TO_MCP.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<GetMcpResponseBodyDataAuthHttpToMcp> httpToMcp;

        public static GetMcpResponseBodyDataAuth build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataAuth self = new GetMcpResponseBodyDataAuth();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataAuth setCodePackage(GetMcpResponseBodyDataAuthCodePackage codePackage) {
            this.codePackage = codePackage;
            return this;
        }
        public GetMcpResponseBodyDataAuthCodePackage getCodePackage() {
            return this.codePackage;
        }

        public GetMcpResponseBodyDataAuth setDirectProxy(GetMcpResponseBodyDataAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public GetMcpResponseBodyDataAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public GetMcpResponseBodyDataAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetMcpResponseBodyDataAuth setHttpToMcp(java.util.List<GetMcpResponseBodyDataAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<GetMcpResponseBodyDataAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigAccessControl extends TeaModel {
        /**
         * <p>The ID of the AgentCore credential referenced when the mode is set to CREDENTIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-id</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>Specifies whether to enable entry access control.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The access control mode. Valid values: ANONYMOUS indicates anonymous access. CREDENTIAL indicates that AgentCore access credentials are used.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL</p>
         */
        @NameInMap("mode")
        public String mode;

        public static GetMcpResponseBodyDataDeploymentConfigAccessControl build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigAccessControl self = new GetMcpResponseBodyDataDeploymentConfigAccessControl();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigAccessControl setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public GetMcpResponseBodyDataDeploymentConfigAccessControl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetMcpResponseBodyDataDeploymentConfigAccessControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration extends TeaModel {
        /**
         * <p>Specifies whether authorization is enabled.</p>
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
         * <p>Specifies whether agent identity is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration self = new GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration setAuthorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = authorizationEnabled;
            return this;
        }
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        public GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigCodeConfiguration extends TeaModel {
        /**
         * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. It is used to create or update a code deployment after a presigned upload is completed.</p>
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
         * <p>The runtime of the code package. Valid values: python3.13, nodejs22, and java17.</p>
         * 
         * <strong>example:</strong>
         * <p>python3.13</p>
         */
        @NameInMap("language")
        public String language;

        public static GetMcpResponseBodyDataDeploymentConfigCodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigCodeConfiguration self = new GetMcpResponseBodyDataDeploymentConfigCodeConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigCodeConfiguration setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public GetMcpResponseBodyDataDeploymentConfigCodeConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public GetMcpResponseBodyDataDeploymentConfigCodeConfiguration setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigContainerConfiguration extends TeaModel {
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
         * <p>The MCP runtime mode. Custom containers must expose the standard MCP themselves. The value is SELF_HOSTED.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_HOSTED</p>
         */
        @NameInMap("mcpRuntimeMode")
        public String mcpRuntimeMode;

        /**
         * <p>The container source type. This value is currently fixed to CONTAINER_IMAGE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTAINER_IMAGE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static GetMcpResponseBodyDataDeploymentConfigContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigContainerConfiguration self = new GetMcpResponseBodyDataDeploymentConfigContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration setImageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
            return this;
        }
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration setMcpRuntimeMode(String mcpRuntimeMode) {
            this.mcpRuntimeMode = mcpRuntimeMode;
            return this;
        }
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks extends TeaModel {
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
         * <p>The request headers of the hook.</p>
         */
        @NameInMap("headers")
        public java.util.Map<String, String> headers;

        /**
         * <p>The timeout period of the hook, in milliseconds.</p>
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

        public static GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks self = new GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigHookConfiguration extends TeaModel {
        /**
         * <p>The ordered list of hooks. The PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL hooks are executed in the order of the array.</p>
         */
        @NameInMap("hooks")
        public java.util.List<GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks> hooks;

        public static GetMcpResponseBodyDataDeploymentConfigHookConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigHookConfiguration self = new GetMcpResponseBodyDataDeploymentConfigHookConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigHookConfiguration setHooks(java.util.List<GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<GetMcpResponseBodyDataDeploymentConfigHookConfigurationHooks> getHooks() {
            return this.hooks;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigLogConfiguration extends TeaModel {
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
         * <p>The start rule for splitting Function Compute logs.</p>
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

        public static GetMcpResponseBodyDataDeploymentConfigLogConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigLogConfiguration self = new GetMcpResponseBodyDataDeploymentConfigLogConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigLogConfiguration setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public GetMcpResponseBodyDataDeploymentConfigLogConfiguration setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public GetMcpResponseBodyDataDeploymentConfigLogConfiguration setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public GetMcpResponseBodyDataDeploymentConfigLogConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public GetMcpResponseBodyDataDeploymentConfigLogConfiguration setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigMcpConfiguration extends TeaModel {
        /**
         * <p>The MCP endpoint path, such as /mcp or /sse.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("endpointPath")
        public String endpointPath;

        /**
         * <p>The session concurrency per instance. This value is currently fixed to 1.</p>
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

        /**
         * <p>The session mode. This parameter applies only to StreamableHTTP. Default value for creation: STATEFUL. If omitted during an update, the original value is retained. STATELESS disables Function Compute session affinity, and the stdio gateway does not enable stateful mode. Native HTTP services must support stateless MCP themselves.</p>
         * 
         * <strong>example:</strong>
         * <p>STATEFUL</p>
         */
        @NameInMap("sessionMode")
        public String sessionMode;

        public static GetMcpResponseBodyDataDeploymentConfigMcpConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigMcpConfiguration self = new GetMcpResponseBodyDataDeploymentConfigMcpConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigMcpConfiguration setEndpointPath(String endpointPath) {
            this.endpointPath = endpointPath;
            return this;
        }
        public String getEndpointPath() {
            return this.endpointPath;
        }

        public GetMcpResponseBodyDataDeploymentConfigMcpConfiguration setSessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        public GetMcpResponseBodyDataDeploymentConfigMcpConfiguration setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        public GetMcpResponseBodyDataDeploymentConfigMcpConfiguration setSessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
            this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
            return this;
        }
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

        public GetMcpResponseBodyDataDeploymentConfigMcpConfiguration setSessionMode(String sessionMode) {
            this.sessionMode = sessionMode;
            return this;
        }
        public String getSessionMode() {
            return this.sessionMode;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints extends TeaModel {
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
         * <p>The NAS service address.</p>
         * 
         * <strong>example:</strong>
         * <p>example.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("serverAddr")
        public String serverAddr;

        public static GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints self = new GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigNasConfiguration extends TeaModel {
        /**
         * <p>The user group ID.</p>
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
        public java.util.List<GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints> mountPoints;

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userId")
        public Integer userId;

        public static GetMcpResponseBodyDataDeploymentConfigNasConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigNasConfiguration self = new GetMcpResponseBodyDataDeploymentConfigNasConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigNasConfiguration setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public GetMcpResponseBodyDataDeploymentConfigNasConfiguration setMountPoints(java.util.List<GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<GetMcpResponseBodyDataDeploymentConfigNasConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public GetMcpResponseBodyDataDeploymentConfigNasConfiguration setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration extends TeaModel {
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

        public static GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration self = new GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The path of the OSS bucket.</p>
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

        public static GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints self = new GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigOssMountConfiguration extends TeaModel {
        /**
         * <p>The list of OSS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> mountPoints;

        public static GetMcpResponseBodyDataDeploymentConfigOssMountConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigOssMountConfiguration self = new GetMcpResponseBodyDataDeploymentConfigOssMountConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigOssMountConfiguration setMountPoints(java.util.List<GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<GetMcpResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration extends TeaModel {
        /**
         * <p>Specifies whether parameter transformation and result enhancement are enabled.</p>
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

        public static GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration self = new GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration setRuleSetId(String ruleSetId) {
            this.ruleSetId = ruleSetId;
            return this;
        }
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        public GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigProxyConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable the MCP proxy.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetMcpResponseBodyDataDeploymentConfigProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigProxyConfiguration self = new GetMcpResponseBodyDataDeploymentConfigProxyConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigProxyConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration extends TeaModel {
        /**
         * <p>The CPU specifications. Unit: cores. Default value: 0.25.</p>
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
         * <p>The request concurrency per instance. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("instanceConcurrency")
        public Integer instanceConcurrency;

        /**
         * <p>The memory specifications. Unit: MB. Default value: 512.</p>
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

        public static GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration self = new GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class GetMcpResponseBodyDataDeploymentConfig extends TeaModel {
        /**
         * <p>The MCP entry access control configuration.</p>
         */
        @NameInMap("accessControl")
        public GetMcpResponseBodyDataDeploymentConfigAccessControl accessControl;

        /**
         * <p>The agent identity configuration.</p>
         */
        @NameInMap("agentIdentityConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration;

        /**
         * <p>The artifact type. Valid values:</p>
         * <ul>
         * <li>Code: ZIP code package.</li>
         * <li>Container: Custom container.</li>
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
        public GetMcpResponseBodyDataDeploymentConfigCodeConfiguration codeConfiguration;

        /**
         * <p>The custom container configuration.</p>
         */
        @NameInMap("containerConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration containerConfiguration;

        /**
         * <p>The hook configuration.</p>
         */
        @NameInMap("hookConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigHookConfiguration hookConfiguration;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("logConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigLogConfiguration logConfiguration;

        /**
         * <p>The MCP session configuration.</p>
         */
        @NameInMap("mcpConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigMcpConfiguration mcpConfiguration;

        /**
         * <p>The NAS storage configuration.</p>
         */
        @NameInMap("nasConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigNasConfiguration nasConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration networkConfiguration;

        /**
         * <p>The OSS mount configuration.</p>
         */
        @NameInMap("ossMountConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigOssMountConfiguration ossMountConfiguration;

        /**
         * <p>The parameter transformation and result enhancement configuration.</p>
         */
        @NameInMap("parameterTransformConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration;

        /**
         * <p>The MCP proxy configuration.</p>
         */
        @NameInMap("proxyConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigProxyConfiguration proxyConfiguration;

        /**
         * <p>The runtime and resource configuration.</p>
         */
        @NameInMap("runtimeConfiguration")
        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration runtimeConfiguration;

        public static GetMcpResponseBodyDataDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataDeploymentConfig self = new GetMcpResponseBodyDataDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataDeploymentConfig setAccessControl(GetMcpResponseBodyDataDeploymentConfigAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigAccessControl getAccessControl() {
            return this.accessControl;
        }

        public GetMcpResponseBodyDataDeploymentConfig setAgentIdentityConfiguration(GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration) {
            this.agentIdentityConfiguration = agentIdentityConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigAgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public GetMcpResponseBodyDataDeploymentConfig setCodeConfiguration(GetMcpResponseBodyDataDeploymentConfigCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigCodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setContainerConfiguration(GetMcpResponseBodyDataDeploymentConfigContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setHookConfiguration(GetMcpResponseBodyDataDeploymentConfigHookConfiguration hookConfiguration) {
            this.hookConfiguration = hookConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigHookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setLogConfiguration(GetMcpResponseBodyDataDeploymentConfigLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigLogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setMcpConfiguration(GetMcpResponseBodyDataDeploymentConfigMcpConfiguration mcpConfiguration) {
            this.mcpConfiguration = mcpConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigMcpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setNasConfiguration(GetMcpResponseBodyDataDeploymentConfigNasConfiguration nasConfiguration) {
            this.nasConfiguration = nasConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigNasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setNetworkConfiguration(GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setOssMountConfiguration(GetMcpResponseBodyDataDeploymentConfigOssMountConfiguration ossMountConfiguration) {
            this.ossMountConfiguration = ossMountConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigOssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setParameterTransformConfiguration(GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration) {
            this.parameterTransformConfiguration = parameterTransformConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setProxyConfiguration(GetMcpResponseBodyDataDeploymentConfigProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        public GetMcpResponseBodyDataDeploymentConfig setRuntimeConfiguration(GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfigRuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

    }

    public static class GetMcpResponseBodyDataMarketSource extends TeaModel {
        /**
         * <p>The MCP marketplace template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>market-1</p>
         */
        @NameInMap("marketItemId")
        public String marketItemId;

        public static GetMcpResponseBodyDataMarketSource build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataMarketSource self = new GetMcpResponseBodyDataMarketSource();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataMarketSource setMarketItemId(String marketItemId) {
            this.marketItemId = marketItemId;
            return this;
        }
        public String getMarketItemId() {
            return this.marketItemId;
        }

    }

    public static class GetMcpResponseBodyDataOperationError extends TeaModel {
        /**
         * <p>Returns only bounded diagnostic codes and does not return the original error body from the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>PROBE_TIMEOUT</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The necessary diagnostics that are trimmed and desensitized. It does not contain credentials or original responses.</p>
         * 
         * <strong>example:</strong>
         * <p>The probe deadline was exceeded.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Indicates whether the operation is suitable for retry based on a restricted policy. This field does not trigger automatic retries.</p>
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

        public static GetMcpResponseBodyDataOperationError build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataOperationError self = new GetMcpResponseBodyDataOperationError();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataOperationError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMcpResponseBodyDataOperationError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetMcpResponseBodyDataOperationError setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public GetMcpResponseBodyDataOperationError setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetMcpResponseBodyDataOperationError setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

    public static class GetMcpResponseBodyDataOperation extends TeaModel {
        /**
         * <p>The desensitized error of the current release operation. Gateway or formal link failures after the origin server passes verification are represented by this field.</p>
         */
        @NameInMap("error")
        public GetMcpResponseBodyDataOperationError error;

        /**
         * <p>The identifier of the current or most recent release operation.</p>
         * 
         * <strong>example:</strong>
         * <p>3541f1af-87cc-45d1-a28e-94ec5633b931</p>
         */
        @NameInMap("operationId")
        public String operationId;

        /**
         * <p>The release stage, such as compute deployment, origin verification, summary saving, gateway release, entry credential synchronization, formal link verification, or deployment submission. Old tasks retain their original stage semantics.</p>
         * 
         * <strong>example:</strong>
         * <p>VALIDATE_ORIGIN</p>
         */
        @NameInMap("stage")
        public String stage;

        /**
         * <p>The operation status. Valid values: PENDING, RUNNING, SUCCEEDED, and FAILED.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The operation type. Valid value: PUBLISH.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLISH</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the operation was updated, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-19T08:30:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetMcpResponseBodyDataOperation build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataOperation self = new GetMcpResponseBodyDataOperation();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataOperation setError(GetMcpResponseBodyDataOperationError error) {
            this.error = error;
            return this;
        }
        public GetMcpResponseBodyDataOperationError getError() {
            return this.error;
        }

        public GetMcpResponseBodyDataOperation setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public GetMcpResponseBodyDataOperation setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public GetMcpResponseBodyDataOperation setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMcpResponseBodyDataOperation setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMcpResponseBodyDataOperation setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration extends TeaModel {
        /**
         * <p>The verified legacy or modern policy. This field is empty if the policy is not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>modern</p>
         */
        @NameInMap("backendMcpProtocol")
        public String backendMcpProtocol;

        /**
         * <p>The verified SSE or StreamableHTTP transport. This field is empty if the transport is not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The actual negotiated or selected and verified date version. This field is empty if the version is not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26</p>
         */
        @NameInMap("protocolVersion")
        public String protocolVersion;

        /**
         * <p>The actual session mode. Valid values: STATEFUL, STATELESS, and NOT_APPLICABLE. This field is empty if the mode is not confirmed.</p>
         * 
         * <strong>example:</strong>
         * <p>STATELESS</p>
         */
        @NameInMap("sessionMode")
        public String sessionMode;

        public static GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration self = new GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration setBackendMcpProtocol(String backendMcpProtocol) {
            this.backendMcpProtocol = backendMcpProtocol;
            return this;
        }
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        public GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration setProtocolVersion(String protocolVersion) {
            this.protocolVersion = protocolVersion;
            return this;
        }
        public String getProtocolVersion() {
            return this.protocolVersion;
        }

        public GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration setSessionMode(String sessionMode) {
            this.sessionMode = sessionMode;
            return this;
        }
        public String getSessionMode() {
            return this.sessionMode;
        }

    }

    public static class GetMcpResponseBodyDataOriginProbeLastResultError extends TeaModel {
        /**
         * <p>Returns only bounded diagnostic codes and does not return the original error body from the origin server.</p>
         * 
         * <strong>example:</strong>
         * <p>PROBE_TIMEOUT</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The necessary diagnostics that are trimmed and desensitized. It does not contain credentials or original responses.</p>
         * 
         * <strong>example:</strong>
         * <p>The probe deadline was exceeded.</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Indicates whether the operation is suitable for retry based on a restricted policy. This field does not trigger automatic retries.</p>
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

        public static GetMcpResponseBodyDataOriginProbeLastResultError build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataOriginProbeLastResultError self = new GetMcpResponseBodyDataOriginProbeLastResultError();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataOriginProbeLastResultError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMcpResponseBodyDataOriginProbeLastResultError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetMcpResponseBodyDataOriginProbeLastResultError setRetryable(Boolean retryable) {
            this.retryable = retryable;
            return this;
        }
        public Boolean getRetryable() {
            return this.retryable;
        }

        public GetMcpResponseBodyDataOriginProbeLastResultError setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetMcpResponseBodyDataOriginProbeLastResultError setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

    }

    public static class GetMcpResponseBodyDataOriginProbeLastResult extends TeaModel {
        /**
         * <p>The actual configuration confirmed by evidence in the current verification. This field is empty if no confirmed information is available and is not inferred from the expected configuration.</p>
         */
        @NameInMap("actualConfiguration")
        public GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration actualConfiguration;

        /**
         * <p>The verification error. This field is empty if the verification is successful. It saves only the desensitized diagnostics required for the current verification.</p>
         */
        @NameInMap("error")
        public GetMcpResponseBodyDataOriginProbeLastResultError error;

        /**
         * <p>The time of the current origin verification, in ISO 8601 UTC format.</p>
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
         * <p>The verification result. Valid values: SUCCESS and FAILED. The result is SUCCESS if the protocol and applicable session checks pass. Not declaring any capabilities does not affect the passing status.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        public static GetMcpResponseBodyDataOriginProbeLastResult build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataOriginProbeLastResult self = new GetMcpResponseBodyDataOriginProbeLastResult();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataOriginProbeLastResult setActualConfiguration(GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration actualConfiguration) {
            this.actualConfiguration = actualConfiguration;
            return this;
        }
        public GetMcpResponseBodyDataOriginProbeLastResultActualConfiguration getActualConfiguration() {
            return this.actualConfiguration;
        }

        public GetMcpResponseBodyDataOriginProbeLastResult setError(GetMcpResponseBodyDataOriginProbeLastResultError error) {
            this.error = error;
            return this;
        }
        public GetMcpResponseBodyDataOriginProbeLastResultError getError() {
            return this.error;
        }

        public GetMcpResponseBodyDataOriginProbeLastResult setProbedAt(String probedAt) {
            this.probedAt = probedAt;
            return this;
        }
        public String getProbedAt() {
            return this.probedAt;
        }

        public GetMcpResponseBodyDataOriginProbeLastResult setStage(String stage) {
            this.stage = stage;
            return this;
        }
        public String getStage() {
            return this.stage;
        }

        public GetMcpResponseBodyDataOriginProbeLastResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetMcpResponseBodyDataOriginProbe extends TeaModel {
        /**
         * <p>Returned only for CODE_PACKAGE deployments. This field is cleared when a new task starts and is empty if no verification has been performed or if an old task did not perform verification. If a subsequent release fails, the current summary is retained, which does not indicate real-time health or the active version status.</p>
         */
        @NameInMap("lastResult")
        public GetMcpResponseBodyDataOriginProbeLastResult lastResult;

        public static GetMcpResponseBodyDataOriginProbe build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataOriginProbe self = new GetMcpResponseBodyDataOriginProbe();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataOriginProbe setLastResult(GetMcpResponseBodyDataOriginProbeLastResult lastResult) {
            this.lastResult = lastResult;
            return this;
        }
        public GetMcpResponseBodyDataOriginProbeLastResult getLastResult() {
            return this.lastResult;
        }

    }

    public static class GetMcpResponseBodyDataTemplate extends TeaModel {
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
         * <p>The template schema version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("schemaVersion")
        public String schemaVersion;

        /**
         * <p>The template input schema, represented as a JSON Schema string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;addresses&quot;:{&quot;type&quot;:&quot;array&quot;,&quot;items&quot;:{&quot;type&quot;:&quot;string&quot;}}}}</p>
         */
        @NameInMap("templateInputSchema")
        public String templateInputSchema;

        /**
         * <p>Specifies whether an updated template version is available.</p>
         */
        @NameInMap("updateAvailable")
        public Boolean updateAvailable;

        public static GetMcpResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyDataTemplate self = new GetMcpResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyDataTemplate setAppliedTemplateVersion(String appliedTemplateVersion) {
            this.appliedTemplateVersion = appliedTemplateVersion;
            return this;
        }
        public String getAppliedTemplateVersion() {
            return this.appliedTemplateVersion;
        }

        public GetMcpResponseBodyDataTemplate setLatestTemplateVersion(String latestTemplateVersion) {
            this.latestTemplateVersion = latestTemplateVersion;
            return this;
        }
        public String getLatestTemplateVersion() {
            return this.latestTemplateVersion;
        }

        public GetMcpResponseBodyDataTemplate setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public GetMcpResponseBodyDataTemplate setTemplateInputSchema(String templateInputSchema) {
            this.templateInputSchema = templateInputSchema;
            return this;
        }
        public String getTemplateInputSchema() {
            return this.templateInputSchema;
        }

        public GetMcpResponseBodyDataTemplate setUpdateAvailable(Boolean updateAvailable) {
            this.updateAvailable = updateAvailable;
            return this;
        }
        public Boolean getUpdateAvailable() {
            return this.updateAvailable;
        }

    }

    public static class GetMcpResponseBodyData extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. The enabled field indicates whether it is enabled. The directProxy field specifies the custom authentication header for the direct proxy. The httpToMcp field specifies the list of OpenAPI credentials for HTTP_TO_MCP.</p>
         */
        @NameInMap("auth")
        public GetMcpResponseBodyDataAuth auth;

        /**
         * <p>The saved legacy or modern backend policy, which is separate from the transport indicated by the protocol and does not indicate verification. This field is not saved for new CODE_PACKAGE deployments. For historical CODE_PACKAGE deployments, the saved value does not control Function Compute session affinity or the gateway protocol. For the actual protocol, refer to OriginProbe.LastResult.ActualConfiguration.BackendMcpProtocol. Returns null for historical deployments with unspecified values and HTTP_TO_MCP deployments.</p>
         * 
         * <strong>example:</strong>
         * <p>modern</p>
         */
        @NameInMap("backendMcpProtocol")
        public String backendMcpProtocol;

        /**
         * <p>The time when the MCP was created, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-23T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The custom tags. Multiple tags are supported.</p>
         */
        @NameInMap("customTags")
        public java.util.List<String> customTags;

        /**
         * <p>The deployment configuration for code-deployed MCP.</p>
         */
        @NameInMap("deploymentConfig")
        public GetMcpResponseBodyDataDeploymentConfig deploymentConfig;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description to illustrate the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MCP endpoint that can be called by users or agents. This field is empty before the deployment is completed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The Function Compute function name for the CODE_PACKAGE MCP. This field is empty before deployment is complete and for other types.</p>
         * 
         * <strong>example:</strong>
         * <p>agentcore-mcp-example</p>
         */
        @NameInMap("functionName")
        public String functionName;

        /**
         * <p>The MCP source marketplace template.</p>
         */
        @NameInMap("marketSource")
        public GetMcpResponseBodyDataMarketSource marketSource;

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
         * <p>The official usage tag, which is managed by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE_BASE</p>
         */
        @NameInMap("officialTag")
        public String officialTag;

        /**
         * <p>The read-only progress that reuses existing release tasks. It does not change the primary status of the resource. This field is empty if no historical operation information is available.</p>
         */
        @NameInMap("operation")
        public GetMcpResponseBodyDataOperation operation;

        /**
         * <p>Returns the minimal origin verification summary of the most recent task only for code deployments. This field is empty for direct connection and HTTP-to-MCP deployments. Querying this field does not trigger probing.</p>
         */
        @NameInMap("originProbe")
        public GetMcpResponseBodyDataOriginProbe originProbe;

        /**
         * <p>The optional saved metadata for the origin MCP protocol date display, in YYYY-MM-DD format. You can specify this field during creation and modify it during updates. If omitted during an update, the current value is retained. This field is used only for saving and displaying information. It is not a software version, does not restrict the external gateway protocol, does not control backend requests, and does not indicate that real-time verification has passed. Returns null if omitted during creation and not updated, missing in historical data, or used in HTTP_TO_MCP deployments. No default value.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-26</p>
         */
        @NameInMap("originProtocolVersion")
        public String originProtocolVersion;

        /**
         * <p>The access permission mode. Valid values:</p>
         * <ul>
         * <li>PUBLIC: Public access.</li>
         * <li>CONTROLLED: Access controlled based on permission rules.</li>
         * </ul>
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
         * <p>The reason for the status.</p>
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
         * <p>The template schema for the usage-bound MCP version. This field is not returned for regular MCPs.</p>
         */
        @NameInMap("template")
        public GetMcpResponseBodyDataTemplate template;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The time when the MCP was last updated, in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-23T01:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The access address of the MCP service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/artifacts/example.zip">https://example.com/artifacts/example.zip</a></p>
         */
        @NameInMap("url")
        public String url;

        /**
         * <p>Specifies whether the MCP is still subject to the usage constraints of the official template.</p>
         */
        @NameInMap("usageActive")
        public Boolean usageActive;

        public static GetMcpResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMcpResponseBodyData self = new GetMcpResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMcpResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public GetMcpResponseBodyData setAuth(GetMcpResponseBodyDataAuth auth) {
            this.auth = auth;
            return this;
        }
        public GetMcpResponseBodyDataAuth getAuth() {
            return this.auth;
        }

        public GetMcpResponseBodyData setBackendMcpProtocol(String backendMcpProtocol) {
            this.backendMcpProtocol = backendMcpProtocol;
            return this;
        }
        public String getBackendMcpProtocol() {
            return this.backendMcpProtocol;
        }

        public GetMcpResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetMcpResponseBodyData setCustomTags(java.util.List<String> customTags) {
            this.customTags = customTags;
            return this;
        }
        public java.util.List<String> getCustomTags() {
            return this.customTags;
        }

        public GetMcpResponseBodyData setDeploymentConfig(GetMcpResponseBodyDataDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public GetMcpResponseBodyDataDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public GetMcpResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetMcpResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public GetMcpResponseBodyData setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public GetMcpResponseBodyData setMarketSource(GetMcpResponseBodyDataMarketSource marketSource) {
            this.marketSource = marketSource;
            return this;
        }
        public GetMcpResponseBodyDataMarketSource getMarketSource() {
            return this.marketSource;
        }

        public GetMcpResponseBodyData setMcpServerConfig(String mcpServerConfig) {
            this.mcpServerConfig = mcpServerConfig;
            return this;
        }
        public String getMcpServerConfig() {
            return this.mcpServerConfig;
        }

        public GetMcpResponseBodyData setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public GetMcpResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMcpResponseBodyData setOfficialTag(String officialTag) {
            this.officialTag = officialTag;
            return this;
        }
        public String getOfficialTag() {
            return this.officialTag;
        }

        public GetMcpResponseBodyData setOperation(GetMcpResponseBodyDataOperation operation) {
            this.operation = operation;
            return this;
        }
        public GetMcpResponseBodyDataOperation getOperation() {
            return this.operation;
        }

        public GetMcpResponseBodyData setOriginProbe(GetMcpResponseBodyDataOriginProbe originProbe) {
            this.originProbe = originProbe;
            return this;
        }
        public GetMcpResponseBodyDataOriginProbe getOriginProbe() {
            return this.originProbe;
        }

        public GetMcpResponseBodyData setOriginProtocolVersion(String originProtocolVersion) {
            this.originProtocolVersion = originProtocolVersion;
            return this;
        }
        public String getOriginProtocolVersion() {
            return this.originProtocolVersion;
        }

        public GetMcpResponseBodyData setPermissionMode(String permissionMode) {
            this.permissionMode = permissionMode;
            return this;
        }
        public String getPermissionMode() {
            return this.permissionMode;
        }

        public GetMcpResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public GetMcpResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMcpResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public GetMcpResponseBodyData setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public GetMcpResponseBodyData setTemplate(GetMcpResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public GetMcpResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public GetMcpResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMcpResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetMcpResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public GetMcpResponseBodyData setUsageActive(Boolean usageActive) {
            this.usageActive = usageActive;
            return this;
        }
        public Boolean getUsageActive() {
            return this.usageActive;
        }

    }

}
