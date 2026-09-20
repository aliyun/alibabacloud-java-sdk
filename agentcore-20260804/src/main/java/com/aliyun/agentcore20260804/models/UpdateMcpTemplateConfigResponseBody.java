// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateMcpTemplateConfigResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public UpdateMcpTemplateConfigResponseBodyData data;

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
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>request-123456</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateMcpTemplateConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcpTemplateConfigResponseBody self = new UpdateMcpTemplateConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMcpTemplateConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateMcpTemplateConfigResponseBody setData(UpdateMcpTemplateConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMcpTemplateConfigResponseBodyData getData() {
        return this.data;
    }

    public UpdateMcpTemplateConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateMcpTemplateConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMcpTemplateConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMcpTemplateConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl extends TeaModel {
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
         * <li>CREDENTIAL: AgentCore credential-based access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREDENTIAL</p>
         */
        @NameInMap("mode")
        public String mode;

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration extends TeaModel {
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration setAuthorizationEnabled(Boolean authorizationEnabled) {
            this.authorizationEnabled = authorizationEnabled;
            return this;
        }
        public Boolean getAuthorizationEnabled() {
            return this.authorizationEnabled;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration setCredentialProviderArn(String credentialProviderArn) {
            this.credentialProviderArn = credentialProviderArn;
            return this;
        }
        public String getCredentialProviderArn() {
            return this.credentialProviderArn;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration setCredentialProviderType(String credentialProviderType) {
            this.credentialProviderType = credentialProviderType;
            return this;
        }
        public String getCredentialProviderType() {
            return this.credentialProviderType;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration extends TeaModel {
        /**
         * <p>The temporary code package token returned by GetMcpCodePackageUploadUrl. Use this token to create or update a code deployment after completing the pre-signed upload.</p>
         * 
         * <strong>example:</strong>
         * <p>upload-token</p>
         */
        @NameInMap("codePackageToken")
        public String codePackageToken;

        /**
         * <p>The full startup command, with each argument passed in order by parameter boundary. For example, when using supergateway to start a stdio MCP, pass supergateway, --stdio, the full subcommand, and the remaining arguments.</p>
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration setCodePackageToken(String codePackageToken) {
            this.codePackageToken = codePackageToken;
            return this;
        }
        public String getCodePackageToken() {
            return this.codePackageToken;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration extends TeaModel {
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
         * <p>The MCP runtime mode for the custom container. The custom container must expose a standard MCP endpoint on its own. Set this parameter to SELF_HOSTED.</p>
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration setAcrInstanceId(String acrInstanceId) {
            this.acrInstanceId = acrInstanceId;
            return this;
        }
        public String getAcrInstanceId() {
            return this.acrInstanceId;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration setCommand(java.util.List<String> command) {
            this.command = command;
            return this;
        }
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration setEntrypoint(java.util.List<String> entrypoint) {
            this.entrypoint = entrypoint;
            return this;
        }
        public java.util.List<String> getEntrypoint() {
            return this.entrypoint;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration setImageRegistryType(String imageRegistryType) {
            this.imageRegistryType = imageRegistryType;
            return this;
        }
        public String getImageRegistryType() {
            return this.imageRegistryType;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration setMcpRuntimeMode(String mcpRuntimeMode) {
            this.mcpRuntimeMode = mcpRuntimeMode;
            return this;
        }
        public String getMcpRuntimeMode() {
            return this.mcpRuntimeMode;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks extends TeaModel {
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
         * <p>Log MCP tool calls</p>
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }
        public String getApiVersion() {
            return this.apiVersion;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks setEvent(String event) {
            this.event = event;
            return this;
        }
        public String getEvent() {
            return this.event;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks setHeaders(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }
        public java.util.Map<String, String> getHeaders() {
            return this.headers;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfiguration extends TeaModel {
        /**
         * <p>The hooks executed in array order: PRE_LIST_TOOLS, PRE_CALL_TOOL, POST_LIST_TOOLS, and POST_CALL_TOOL.</p>
         */
        @NameInMap("hooks")
        public java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks> hooks;

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfiguration setHooks(java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks> hooks) {
            this.hooks = hooks;
            return this;
        }
        public java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfigurationHooks> getHooks() {
            return this.hooks;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration extends TeaModel {
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration setEnableInstanceMetrics(Boolean enableInstanceMetrics) {
            this.enableInstanceMetrics = enableInstanceMetrics;
            return this;
        }
        public Boolean getEnableInstanceMetrics() {
            return this.enableInstanceMetrics;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration setEnableRequestMetrics(Boolean enableRequestMetrics) {
            this.enableRequestMetrics = enableRequestMetrics;
            return this;
        }
        public Boolean getEnableRequestMetrics() {
            return this.enableRequestMetrics;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration setLogBeginRule(String logBeginRule) {
            this.logBeginRule = logBeginRule;
            return this;
        }
        public String getLogBeginRule() {
            return this.logBeginRule;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration setLogstore(String logstore) {
            this.logstore = logstore;
            return this;
        }
        public String getLogstore() {
            return this.logstore;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration extends TeaModel {
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration setEndpointPath(String endpointPath) {
            this.endpointPath = endpointPath;
            return this;
        }
        public String getEndpointPath() {
            return this.endpointPath;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration setSessionConcurrencyPerInstance(Integer sessionConcurrencyPerInstance) {
            this.sessionConcurrencyPerInstance = sessionConcurrencyPerInstance;
            return this;
        }
        public Integer getSessionConcurrencyPerInstance() {
            return this.sessionConcurrencyPerInstance;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration setSessionIdleTimeoutSeconds(Integer sessionIdleTimeoutSeconds) {
            this.sessionIdleTimeoutSeconds = sessionIdleTimeoutSeconds;
            return this;
        }
        public Integer getSessionIdleTimeoutSeconds() {
            return this.sessionIdleTimeoutSeconds;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration setSessionMaxLifetimeSeconds(Integer sessionMaxLifetimeSeconds) {
            this.sessionMaxLifetimeSeconds = sessionMaxLifetimeSeconds;
            return this;
        }
        public Integer getSessionMaxLifetimeSeconds() {
            return this.sessionMaxLifetimeSeconds;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints extends TeaModel {
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints setEnableTls(Boolean enableTls) {
            this.enableTls = enableTls;
            return this;
        }
        public Boolean getEnableTls() {
            return this.enableTls;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration extends TeaModel {
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
        public java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints> mountPoints;

        /**
         * <p>The runtime user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("userId")
        public Integer userId;

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration setMountPoints(java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration setUserId(Integer userId) {
            this.userId = userId;
            return this;
        }
        public Integer getUserId() {
            return this.userId;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration extends TeaModel {
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration setNetworkMode(String networkMode) {
            this.networkMode = networkMode;
            return this;
        }
        public String getNetworkMode() {
            return this.networkMode;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration setVSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints extends TeaModel {
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setBucketPath(String bucketPath) {
            this.bucketPath = bucketPath;
            return this;
        }
        public String getBucketPath() {
            return this.bucketPath;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfiguration extends TeaModel {
        /**
         * <p>The list of OSS mount points.</p>
         */
        @NameInMap("mountPoints")
        public java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> mountPoints;

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfiguration setMountPoints(java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> mountPoints) {
            this.mountPoints = mountPoints;
            return this;
        }
        public java.util.List<UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfigurationMountPoints> getMountPoints() {
            return this.mountPoints;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration extends TeaModel {
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration setRuleSetId(String ruleSetId) {
            this.ruleSetId = ruleSetId;
            return this;
        }
        public String getRuleSetId() {
            return this.ruleSetId;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigProxyConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to enable the MCP proxy.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigProxyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigProxyConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigProxyConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigProxyConfiguration setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration extends TeaModel {
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

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }
        public Double getCpu() {
            return this.cpu;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration setEnvironmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public java.util.Map<String, String> getEnvironmentVariables() {
            return this.environmentVariables;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration setExecutionRoleArn(String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }
        public String getExecutionRoleArn() {
            return this.executionRoleArn;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration setMemory(Integer memory) {
            this.memory = memory;
            return this;
        }
        public Integer getMemory() {
            return this.memory;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration setTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public Integer getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig extends TeaModel {
        /**
         * <p>The MCP ingress access control settings.</p>
         */
        @NameInMap("accessControl")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl accessControl;

        /**
         * <p>The Agent Identity configuration.</p>
         */
        @NameInMap("agentIdentityConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration;

        /**
         * <p>The artifact type. Valid values:</p>
         * <ul>
         * <li>Code: ZIP code package.</li>
         * <li>Container: custom container.</li>
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
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration codeConfiguration;

        /**
         * <p>The custom container configuration.</p>
         */
        @NameInMap("containerConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration containerConfiguration;

        /**
         * <p>The hook configuration.</p>
         */
        @NameInMap("hookConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfiguration hookConfiguration;

        /**
         * <p>The log configuration.</p>
         */
        @NameInMap("logConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration logConfiguration;

        /**
         * <p>The MCP session configuration.</p>
         */
        @NameInMap("mcpConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration mcpConfiguration;

        /**
         * <p>The NAS storage configuration.</p>
         */
        @NameInMap("nasConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration nasConfiguration;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("networkConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration networkConfiguration;

        /**
         * <p>The OSS mount configuration.</p>
         */
        @NameInMap("ossMountConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfiguration ossMountConfiguration;

        /**
         * <p>The parameter transform and result enhancement configuration.</p>
         */
        @NameInMap("parameterTransformConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration;

        /**
         * <p>The MCP proxy configuration.</p>
         */
        @NameInMap("proxyConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigProxyConfiguration proxyConfiguration;

        /**
         * <p>The runtime and resource configuration.</p>
         */
        @NameInMap("runtimeConfiguration")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration runtimeConfiguration;

        public static UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig self = new UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setAccessControl(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl accessControl) {
            this.accessControl = accessControl;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAccessControl getAccessControl() {
            return this.accessControl;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setAgentIdentityConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration agentIdentityConfiguration) {
            this.agentIdentityConfiguration = agentIdentityConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigAgentIdentityConfiguration getAgentIdentityConfiguration() {
            return this.agentIdentityConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setCodeConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration codeConfiguration) {
            this.codeConfiguration = codeConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigCodeConfiguration getCodeConfiguration() {
            return this.codeConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setContainerConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration containerConfiguration) {
            this.containerConfiguration = containerConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigContainerConfiguration getContainerConfiguration() {
            return this.containerConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setHookConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfiguration hookConfiguration) {
            this.hookConfiguration = hookConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigHookConfiguration getHookConfiguration() {
            return this.hookConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setLogConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration logConfiguration) {
            this.logConfiguration = logConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigLogConfiguration getLogConfiguration() {
            return this.logConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setMcpConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration mcpConfiguration) {
            this.mcpConfiguration = mcpConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigMcpConfiguration getMcpConfiguration() {
            return this.mcpConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setNasConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration nasConfiguration) {
            this.nasConfiguration = nasConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNasConfiguration getNasConfiguration() {
            return this.nasConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setNetworkConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigNetworkConfiguration getNetworkConfiguration() {
            return this.networkConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setOssMountConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfiguration ossMountConfiguration) {
            this.ossMountConfiguration = ossMountConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigOssMountConfiguration getOssMountConfiguration() {
            return this.ossMountConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setParameterTransformConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration parameterTransformConfiguration) {
            this.parameterTransformConfiguration = parameterTransformConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigParameterTransformConfiguration getParameterTransformConfiguration() {
            return this.parameterTransformConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setProxyConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigProxyConfiguration proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigProxyConfiguration getProxyConfiguration() {
            return this.proxyConfiguration;
        }

        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig setRuntimeConfiguration(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration runtimeConfiguration) {
            this.runtimeConfiguration = runtimeConfiguration;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfigRuntimeConfiguration getRuntimeConfiguration() {
            return this.runtimeConfiguration;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataMarketSource extends TeaModel {
        /**
         * <p>The MCP marketplace template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>market-1</p>
         */
        @NameInMap("marketItemId")
        public String marketItemId;

        public static UpdateMcpTemplateConfigResponseBodyDataMarketSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataMarketSource self = new UpdateMcpTemplateConfigResponseBodyDataMarketSource();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataMarketSource setMarketItemId(String marketItemId) {
            this.marketItemId = marketItemId;
            return this;
        }
        public String getMarketItemId() {
            return this.marketItemId;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyDataTemplate extends TeaModel {
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
         * <p>Indicates whether a newer template version is available for update.</p>
         */
        @NameInMap("updateAvailable")
        public Boolean updateAvailable;

        public static UpdateMcpTemplateConfigResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyDataTemplate self = new UpdateMcpTemplateConfigResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyDataTemplate setAppliedTemplateVersion(String appliedTemplateVersion) {
            this.appliedTemplateVersion = appliedTemplateVersion;
            return this;
        }
        public String getAppliedTemplateVersion() {
            return this.appliedTemplateVersion;
        }

        public UpdateMcpTemplateConfigResponseBodyDataTemplate setLatestTemplateVersion(String latestTemplateVersion) {
            this.latestTemplateVersion = latestTemplateVersion;
            return this;
        }
        public String getLatestTemplateVersion() {
            return this.latestTemplateVersion;
        }

        public UpdateMcpTemplateConfigResponseBodyDataTemplate setSchemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        public UpdateMcpTemplateConfigResponseBodyDataTemplate setTemplateInputSchema(String templateInputSchema) {
            this.templateInputSchema = templateInputSchema;
            return this;
        }
        public String getTemplateInputSchema() {
            return this.templateInputSchema;
        }

        public UpdateMcpTemplateConfigResponseBodyDataTemplate setUpdateAvailable(Boolean updateAvailable) {
            this.updateAvailable = updateAvailable;
            return this;
        }
        public Boolean getUpdateAvailable() {
            return this.updateAvailable;
        }

    }

    public static class UpdateMcpTemplateConfigResponseBodyData extends TeaModel {
        /**
         * <p>The list of remote MCP service addresses.</p>
         */
        @NameInMap("addresses")
        public java.util.List<String> addresses;

        /**
         * <p>The custom tags. Multiple tags are supported.</p>
         */
        @NameInMap("customTags")
        public java.util.List<String> customTags;

        /**
         * <p>The deployment configuration for code-deployed MCP.</p>
         */
        @NameInMap("deploymentConfig")
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig deploymentConfig;

        /**
         * <p>The MCP service description.</p>
         * 
         * <strong>example:</strong>
         * <p>An MCP service for querying knowledge bases</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The MCP service access endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/mcp">https://example.com/mcp</a></p>
         */
        @NameInMap("endpoint")
        public String endpoint;

        /**
         * <p>The Function Compute function name corresponding to the code-deployed MCP.</p>
         * 
         * <strong>example:</strong>
         * <p>agentcore-mcp-example</p>
         */
        @NameInMap("functionName")
        public String functionName;

        /**
         * <p>The marketplace template from which the MCP originates.</p>
         */
        @NameInMap("marketSource")
        public UpdateMcpTemplateConfigResponseBodyDataMarketSource marketSource;

        /**
         * <p>The MCP server ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mcp-server-id</p>
         */
        @NameInMap("mcpServerId")
        public String mcpServerId;

        /**
         * <p>The MCP service name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-mcp-server</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The official usage tag, managed by the server.</p>
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
         * <p>StreamableHTTP</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>The MCP service status.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The reason why the MCP service is in the current status.</p>
         * 
         * <strong>example:</strong>
         * <p>Code package deployment failed</p>
         */
        @NameInMap("statusReason")
        public String statusReason;

        /**
         * <p>The template version and input schema bound to the MCP.</p>
         */
        @NameInMap("template")
        public UpdateMcpTemplateConfigResponseBodyDataTemplate template;

        /**
         * <p>The MCP type. Valid values:</p>
         * <ul>
         * <li>DIRECT_PROXY: direct proxy.</li>
         * <li>HTTP_TO_MCP: HTTP-to-MCP conversion.</li>
         * <li>CODE_PACKAGE: code deployment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CODE_PACKAGE</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Indicates whether the MCP is still subject to the usage constraints of the official template.</p>
         */
        @NameInMap("usageActive")
        public Boolean usageActive;

        public static UpdateMcpTemplateConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMcpTemplateConfigResponseBodyData self = new UpdateMcpTemplateConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMcpTemplateConfigResponseBodyData setAddresses(java.util.List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public java.util.List<String> getAddresses() {
            return this.addresses;
        }

        public UpdateMcpTemplateConfigResponseBodyData setCustomTags(java.util.List<String> customTags) {
            this.customTags = customTags;
            return this;
        }
        public java.util.List<String> getCustomTags() {
            return this.customTags;
        }

        public UpdateMcpTemplateConfigResponseBodyData setDeploymentConfig(UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataDeploymentConfig getDeploymentConfig() {
            return this.deploymentConfig;
        }

        public UpdateMcpTemplateConfigResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateMcpTemplateConfigResponseBodyData setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public UpdateMcpTemplateConfigResponseBodyData setFunctionName(String functionName) {
            this.functionName = functionName;
            return this;
        }
        public String getFunctionName() {
            return this.functionName;
        }

        public UpdateMcpTemplateConfigResponseBodyData setMarketSource(UpdateMcpTemplateConfigResponseBodyDataMarketSource marketSource) {
            this.marketSource = marketSource;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataMarketSource getMarketSource() {
            return this.marketSource;
        }

        public UpdateMcpTemplateConfigResponseBodyData setMcpServerId(String mcpServerId) {
            this.mcpServerId = mcpServerId;
            return this;
        }
        public String getMcpServerId() {
            return this.mcpServerId;
        }

        public UpdateMcpTemplateConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMcpTemplateConfigResponseBodyData setOfficialTag(String officialTag) {
            this.officialTag = officialTag;
            return this;
        }
        public String getOfficialTag() {
            return this.officialTag;
        }

        public UpdateMcpTemplateConfigResponseBodyData setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateMcpTemplateConfigResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateMcpTemplateConfigResponseBodyData setStatusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }
        public String getStatusReason() {
            return this.statusReason;
        }

        public UpdateMcpTemplateConfigResponseBodyData setTemplate(UpdateMcpTemplateConfigResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public UpdateMcpTemplateConfigResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public UpdateMcpTemplateConfigResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateMcpTemplateConfigResponseBodyData setUsageActive(Boolean usageActive) {
            this.usageActive = usageActive;
            return this;
        }
        public Boolean getUsageActive() {
            return this.usageActive;
        }

    }

}
