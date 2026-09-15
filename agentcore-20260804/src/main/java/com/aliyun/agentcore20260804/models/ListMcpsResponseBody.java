// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListMcpsResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The list data.</p>
     */
    @NameInMap("items")
    public java.util.List<ListMcpsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Request processing succeeded</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>next-page-token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-47A8-90AB-CDEF12345678</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("totalCount")
    public Long totalCount;

    public static ListMcpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMcpsResponseBody self = new ListMcpsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMcpsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListMcpsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListMcpsResponseBody setItems(java.util.List<ListMcpsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListMcpsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListMcpsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMcpsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMcpsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMcpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMcpsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMcpsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMcpsResponseBodyItemsAuthCodePackage extends TeaModel {
        /**
         * <p>The API Key used to verify MCP callers.</p>
         * 
         * <strong>example:</strong>
         * <p>example-api-key</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <p>The name of the request header that carries the API Key.</p>
         * 
         * <strong>example:</strong>
         * <p>X-API-Key</p>
         */
        @NameInMap("headerName")
        public String headerName;

        public static ListMcpsResponseBodyItemsAuthCodePackage build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsAuthCodePackage self = new ListMcpsResponseBodyItemsAuthCodePackage();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsAuthCodePackage setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public ListMcpsResponseBodyItemsAuthCodePackage setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

    }

    public static class ListMcpsResponseBodyItemsAuthDirectProxy extends TeaModel {
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

        public static ListMcpsResponseBodyItemsAuthDirectProxy build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsAuthDirectProxy self = new ListMcpsResponseBodyItemsAuthDirectProxy();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsAuthDirectProxy setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpsResponseBodyItemsAuthDirectProxy setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMcpsResponseBodyItemsAuthHttpToMcp extends TeaModel {
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

        public static ListMcpsResponseBodyItemsAuthHttpToMcp build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsAuthHttpToMcp self = new ListMcpsResponseBodyItemsAuthHttpToMcp();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setCredential(String credential) {
            this.credential = credential;
            return this;
        }
        public String getCredential() {
            return this.credential;
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public ListMcpsResponseBodyItemsAuthHttpToMcp setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMcpsResponseBodyItemsAuth extends TeaModel {
        /**
         * <p>The caller API Key authentication configuration for code-deployed MCP.</p>
         */
        @NameInMap("codePackage")
        public ListMcpsResponseBodyItemsAuthCodePackage codePackage;

        /**
         * <p>The authentication configuration for direct proxy.</p>
         */
        @NameInMap("directProxy")
        public ListMcpsResponseBodyItemsAuthDirectProxy directProxy;

        /**
         * <p>Indicates whether the configuration is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The list of HTTP_TO_MCP authentication configurations.</p>
         */
        @NameInMap("httpToMcp")
        public java.util.List<ListMcpsResponseBodyItemsAuthHttpToMcp> httpToMcp;

        public static ListMcpsResponseBodyItemsAuth build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsAuth self = new ListMcpsResponseBodyItemsAuth();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsAuth setCodePackage(ListMcpsResponseBodyItemsAuthCodePackage codePackage) {
            this.codePackage = codePackage;
            return this;
        }
        public ListMcpsResponseBodyItemsAuthCodePackage getCodePackage() {
            return this.codePackage;
        }

        public ListMcpsResponseBodyItemsAuth setDirectProxy(ListMcpsResponseBodyItemsAuthDirectProxy directProxy) {
            this.directProxy = directProxy;
            return this;
        }
        public ListMcpsResponseBodyItemsAuthDirectProxy getDirectProxy() {
            return this.directProxy;
        }

        public ListMcpsResponseBodyItemsAuth setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListMcpsResponseBodyItemsAuth setHttpToMcp(java.util.List<ListMcpsResponseBodyItemsAuthHttpToMcp> httpToMcp) {
            this.httpToMcp = httpToMcp;
            return this;
        }
        public java.util.List<ListMcpsResponseBodyItemsAuthHttpToMcp> getHttpToMcp() {
            return this.httpToMcp;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigAccessControl extends TeaModel {
        /**
         * <p>References an AgentCore Credential when mode is set to CREDENTIAL.</p>
         * 
         * <strong>example:</strong>
         * <p>credential-id</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        /**
         * <p>Indicates whether ingress access control is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>ANONYMOUS indicates anonymous access. CREDENTIAL indicates using an AgentCore access credential.</p>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL</p>
         */
        @NameInMap("mode")
        public String mode;

        public static ListMcpsResponseBodyItemsDeploymentConfigAccessControl build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigAccessControl self = new ListMcpsResponseBodyItemsDeploymentConfigAccessControl();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigAccessControl setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigAccessControl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigAccessControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration extends TeaModel {
        /**
         * <p>Indicates whether authorization is enabled.</p>
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
         * <p>Indicates whether Agent Identity is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration setAuthorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = authorizationEnabled;
            return this;
        }
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration extends TeaModel {
        /**
         * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. Use this token to create or update a code deployment after completing the pre-signed upload.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-token</p>
         */
        @NameInMap("codePackageToken")
        public String codePackageToken;

        /**
         * <p>The full startup command, with arguments passed in order by parameter boundary. For example, when using supergateway to start a stdio MCP, pass supergateway, --stdio, the full subcommand, and remaining arguments.</p>
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

        public static ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration extends TeaModel {
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
         * <p>The custom container must expose a standard MCP endpoint on its own. The value is SELF_HOSTED.</p>
         * 
         * <strong>example:</strong>
         * <p>SELF_HOSTED</p>
         */
        @NameInMap("mcpRuntimeMode")
        public String mcpRuntimeMode;

        /**
         * <p>The value is fixed to CONTAINER_IMAGE.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTAINER_IMAGE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        public static ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration setImageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
            return this;
        }
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration setMcpRuntimeMode(String mcpRuntimeMode) {
            this.mcpRuntimeMode = mcpRuntimeMode;
            return this;
        }
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks extends TeaModel {
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
         * <p>Record MCP tool invocations</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the hook is enabled.</p>
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

        public static ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks self = new ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigHookConfiguration extends TeaModel {
        /**
         * <p>The PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL hooks are executed in array order.</p>
         */
        @NameInMap("hooks")
        public java.util.List<ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks> hooks;

        public static ListMcpsResponseBodyItemsDeploymentConfigHookConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigHookConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigHookConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigHookConfiguration setHooks(java.util.List<ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<ListMcpsResponseBodyItemsDeploymentConfigHookConfigurationHooks> getHooks() {
            return this.hooks;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration extends TeaModel {
        /**
         * <p>Indicates whether instance metrics collection is enabled.</p>
         */
        @NameInMap("enableInstanceMetrics")
        public Boolean enableInstanceMetrics;

        /**
         * <p>Indicates whether request metrics collection is enabled.</p>
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

        public static ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration extends TeaModel {
        /**
         * <p>The MCP endpoint path. For example, /mcp or /sse.</p>
         * 
         * <strong>example:</strong>
         * <p>/mcp</p>
         */
        @NameInMap("endpointPath")
        public String endpointPath;

        /**
         * <p>The value is fixed to 1.</p>
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

        public static ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration setEndpointPath(String endpointPath) {
            this.endpointPath = endpointPath;
            return this;
        }
        public String getEndpointPath() {
            return this.endpointPath;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration setSessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration setSessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
            this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
            return this;
        }
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints extends TeaModel {
        /**
         * <p>Indicates whether TLS is enabled.</p>
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

        public static ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints self = new ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration extends TeaModel {
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
        public java.util.List<ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints> mountPoints;

        /**
         * <p>The runtime user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userId")
        public Integer userId;

        public static ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration setMountPoints(java.util.List<ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<ListMcpsResponseBodyItemsDeploymentConfigNasConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration extends TeaModel {
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
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-example</p>
         */
        @NameInMap("vpcId")
        public String vpcId;

        public static ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints extends TeaModel {
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
         * <p>Indicates whether the mount point is read-only.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints self = new ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigOssMountConfiguration extends TeaModel {
        /**
         * <p>The list of OSS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints> mountPoints;

        public static ListMcpsResponseBodyItemsDeploymentConfigOssMountConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigOssMountConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigOssMountConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigOssMountConfiguration setMountPoints(java.util.List<ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<ListMcpsResponseBodyItemsDeploymentConfigOssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration extends TeaModel {
        /**
         * <p>Indicates whether parameter transformation and result enhancement is enabled.</p>
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

        public static ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration setRuleSetId(String ruleSetId) {
            this.ruleSetId = ruleSetId;
            return this;
        }
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigProxyConfiguration extends TeaModel {
        /**
         * <p>Indicates whether the MCP proxy is enabled.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static ListMcpsResponseBodyItemsDeploymentConfigProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigProxyConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigProxyConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigProxyConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration extends TeaModel {
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role used by user code to access downstream Alibaba Cloud resources.</p>
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

        public static ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration self = new ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class ListMcpsResponseBodyItemsDeploymentConfig extends TeaModel {
        /**
         * <p>The MCP ingress access control.</p>
         */
        @NameInMap("accessControl")
        public ListMcpsResponseBodyItemsDeploymentConfigAccessControl accessControl;

        /**
         * <p>The Agent Identity configuration.</p>
         */
        @NameInMap("agentIdentityConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration;

        /**
         * <p>Code indicates a ZIP code package. Container indicates a custom container.</p>
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
        public ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration codeConfiguration;

        /**
         * <p>The custom container configuration.</p>
         */
        @NameInMap("containerConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration containerConfiguration;

        /**
         * <p>The hook configuration.</p>
         */
        @NameInMap("hookConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigHookConfiguration hookConfiguration;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("logConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration logConfiguration;

        /**
         * <p>The MCP session configuration.</p>
         */
        @NameInMap("mcpConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration mcpConfiguration;

        /**
         * <p>The NAS storage configuration.</p>
         */
        @NameInMap("nasConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration nasConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration networkConfiguration;

        /**
         * <p>The OSS mount configuration.</p>
         */
        @NameInMap("ossMountConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigOssMountConfiguration ossMountConfiguration;

        /**
         * <p>The parameter transformation and result enhancement configuration.</p>
         */
        @NameInMap("parameterTransformConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration;

        /**
         * <p>The MCP proxy configuration.</p>
         */
        @NameInMap("proxyConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigProxyConfiguration proxyConfiguration;

        /**
         * <p>The runtime and resource configuration.</p>
         */
        @NameInMap("runtimeConfiguration")
        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration runtimeConfiguration;

        public static ListMcpsResponseBodyItemsDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsDeploymentConfig self = new ListMcpsResponseBodyItemsDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setAccessControl(ListMcpsResponseBodyItemsDeploymentConfigAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigAccessControl getAccessControl() {
            return this.accessControl;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setAgentIdentityConfiguration(ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration) {
            this.agentIdentityConfiguration = agentIdentityConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigAgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setCodeConfiguration(ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigCodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setContainerConfiguration(ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setHookConfiguration(ListMcpsResponseBodyItemsDeploymentConfigHookConfiguration hookConfiguration) {
            this.hookConfiguration = hookConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigHookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setLogConfiguration(ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigLogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setMcpConfiguration(ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration mcpConfiguration) {
            this.mcpConfiguration = mcpConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigMcpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setNasConfiguration(ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration nasConfiguration) {
            this.nasConfiguration = nasConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigNasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setNetworkConfiguration(ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setOssMountConfiguration(ListMcpsResponseBodyItemsDeploymentConfigOssMountConfiguration ossMountConfiguration) {
            this.ossMountConfiguration = ossMountConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigOssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setParameterTransformConfiguration(ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration) {
            this.parameterTransformConfiguration = parameterTransformConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setProxyConfiguration(ListMcpsResponseBodyItemsDeploymentConfigProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        public ListMcpsResponseBodyItemsDeploymentConfig setRuntimeConfiguration(ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfigRuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

    }

    public static class ListMcpsResponseBodyItemsMarketSource extends TeaModel {
        /**
         * <p>The MCP marketplace template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>market-1</p>
         */
        @NameInMap("marketItemId")
        public String marketItemId;

        public static ListMcpsResponseBodyItemsMarketSource build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItemsMarketSource self = new ListMcpsResponseBodyItemsMarketSource();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItemsMarketSource setMarketItemId(String marketItemId) {
            this.marketItemId = marketItemId;
            return this;
        }
        public String getMarketItemId() {
            return this.marketItemId;
        }

    }

    public static class ListMcpsResponseBodyItems extends TeaModel {
        /**
         * <p>The list of MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The backend authentication configuration. enabled indicates whether it is enabled. directProxy specifies custom authentication headers for direct proxy. httpToMcp specifies the OpenAPI credential list for HTTP_TO_MCP.</p>
         */
        @NameInMap("auth")
        public ListMcpsResponseBodyItemsAuth auth;

        /**
         * <p>The MCP creation time in ISO 8601 UTC format.</p>
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
        public ListMcpsResponseBodyItemsDeploymentConfig deploymentConfig;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>A sample description that explains the purpose of the resource</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MCP endpoint available for users or agents to call. This value is empty before deployment is complete.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The Function Compute function name corresponding to the CODE_PACKAGE MCP. This value is empty before deployment is complete or for other types.</p>
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
        public ListMcpsResponseBodyItemsMarketSource marketSource;

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
         * <p>The official tag managed by the server.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE_BASE</p>
         */
        @NameInMap("officialTag")
        public String officialTag;

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
         * <p>Indicates whether the MCP is still subject to the usage constraints of the official template.</p>
         */
        @NameInMap("usageActive")
        public Boolean usageActive;

        public static ListMcpsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListMcpsResponseBodyItems self = new ListMcpsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListMcpsResponseBodyItems setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public ListMcpsResponseBodyItems setAuth(ListMcpsResponseBodyItemsAuth auth) {
            this.auth = auth;
            return this;
        }
        public ListMcpsResponseBodyItemsAuth getAuth() {
            return this.auth;
        }

        public ListMcpsResponseBodyItems setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListMcpsResponseBodyItems setCustomTags(java.util.List<String> customTags) {
            this.customTags = customTags;
            return this;
        }
        public java.util.List<String> getCustomTags() {
            return this.customTags;
        }

        public ListMcpsResponseBodyItems setDeploymentConfig(ListMcpsResponseBodyItemsDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public ListMcpsResponseBodyItemsDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public ListMcpsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListMcpsResponseBodyItems setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public ListMcpsResponseBodyItems setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public ListMcpsResponseBodyItems setMarketSource(ListMcpsResponseBodyItemsMarketSource marketSource) {
            this.marketSource = marketSource;
            return this;
        }
        public ListMcpsResponseBodyItemsMarketSource getMarketSource() {
            return this.marketSource;
        }

        public ListMcpsResponseBodyItems setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public ListMcpsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMcpsResponseBodyItems setOfficialTag(String officialTag) {
            this.officialTag = officialTag;
            return this;
        }
        public String getOfficialTag() {
            return this.officialTag;
        }

        public ListMcpsResponseBodyItems setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListMcpsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMcpsResponseBodyItems setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public ListMcpsResponseBodyItems setSwaggerConfig(String swaggerConfig) {
            this.swaggerConfig = swaggerConfig;
            return this;
        }
        public String getSwaggerConfig() {
            return this.swaggerConfig;
        }

        public ListMcpsResponseBodyItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListMcpsResponseBodyItems setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public ListMcpsResponseBodyItems setUsageActive(Boolean usageActive) {
            this.usageActive = usageActive;
            return this;
        }
        public Boolean getUsageActive() {
            return this.usageActive;
        }

    }

}
