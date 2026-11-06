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
     * <p>A reserved query parameter. The backend currently does not provide idempotency guarantees for deduplication or recovering original acceptance results based on this token.</p>
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

    public static class CreateManagedAgentRequestBodyAgenticFsMounts extends TeaModel {
        /**
         * <p>The absolute mount path in the container, such as /data/train. Mount targets cannot be duplicated or form parent-child directory overwrites, and must avoid platform-reserved directories.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The existing non-empty relative directory under the access point. This parameter is required for each mount item and validated by the backend. Root directories, absolute paths, and parent directory segments are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether to mount the directory in read-only mode. If omitted, the default value is false. This parameter does not represent a RAM role read-only policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The access point domain name. This parameter is required for each mount item and validated by the backend. The domain name cannot contain a protocol, port, or path. Use the DomainName value from the NAS ListAccessPoints response.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("server")
        public String server;

        public static CreateManagedAgentRequestBodyAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyAgenticFsMounts self = new CreateManagedAgentRequestBodyAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateManagedAgentRequestBodyAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateManagedAgentRequestBodyAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateManagedAgentRequestBodyAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

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
         * <p>The name of the environment variable.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The value of the environment variable.</p>
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

    public static class CreateManagedAgentRequestBodyHarnessConfiguration extends TeaModel {
        /**
         * <p>The account key record ID in the qodercli connector. You can query this ID by using ListConnectors. This is not the original key. You can omit this parameter if only one record exists. If multiple records exist, you must specify this parameter. Do not specify this parameter for qwenpaw.</p>
         * 
         * <strong>example:</strong>
         * <p>key-example</p>
         */
        @NameInMap("connectorServiceAccountKey")
        public String connectorServiceAccountKey;

        /**
         * <p>The connector account name bound to qodercli. Do not specify this parameter for qwenpaw.</p>
         * 
         * <strong>example:</strong>
         * <p>my-connector-key</p>
         */
        @NameInMap("connectorServiceAccountName")
        public String connectorServiceAccountName;

        public static CreateManagedAgentRequestBodyHarnessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyHarnessConfiguration self = new CreateManagedAgentRequestBodyHarnessConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyHarnessConfiguration setConnectorServiceAccountKey(String connectorServiceAccountKey) {
            this.connectorServiceAccountKey = connectorServiceAccountKey;
            return this;
        }
        public String getConnectorServiceAccountKey() {
            return this.connectorServiceAccountKey;
        }

        public CreateManagedAgentRequestBodyHarnessConfiguration setConnectorServiceAccountName(String connectorServiceAccountName) {
            this.connectorServiceAccountName = connectorServiceAccountName;
            return this;
        }
        public String getConnectorServiceAccountName() {
            return this.connectorServiceAccountName;
        }

    }

    public static class CreateManagedAgentRequestBodyHarness extends TeaModel {
        /**
         * <p>The runtime framework configurations.</p>
         */
        @NameInMap("configuration")
        public CreateManagedAgentRequestBodyHarnessConfiguration configuration;

        /**
         * <p>The runtime framework type. This parameter is required when you provide the harness parameter. Valid values: qwenpaw and qodercli.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateManagedAgentRequestBodyHarness build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyHarness self = new CreateManagedAgentRequestBodyHarness();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyHarness setConfiguration(CreateManagedAgentRequestBodyHarnessConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public CreateManagedAgentRequestBodyHarnessConfiguration getConfiguration() {
            return this.configuration;
        }

        public CreateManagedAgentRequestBodyHarness setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateManagedAgentRequestBodyModelQuota extends TeaModel {
        /**
         * <p>Specifies whether to enable the token quota. If not specified, the default value is true. If you set this parameter to false, the quota is disabled and existing quota rules are deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The quota limit type. This parameter is required and validated by the backend when the quota is enabled. Fixed value: token.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>The quota statistical period. This parameter is required and validated by the backend when the quota is enabled. Valid values: day (daily) and month (monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The maximum number of tokens that can be consumed in a single period. This parameter is required and validated by the backend when the quota is enabled. The value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        public static CreateManagedAgentRequestBodyModelQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyModelQuota self = new CreateManagedAgentRequestBodyModelQuota();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateManagedAgentRequestBodyModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public CreateManagedAgentRequestBodyModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public CreateManagedAgentRequestBodyModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

    }

    public static class CreateManagedAgentRequestBodyModel extends TeaModel {
        /**
         * <p>For qwenpaw, use the workspace model connection ID. For qodercli, use the available model identifier returned by ListConnectorModels.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("modelConnectionId")
        public String modelConnectionId;

        /**
         * <p>For qwenpaw, use the name of the upstream model created under the model connection. This parameter is required. For qodercli, you can omit this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model token quota configurations. If you do not pass this parameter, no quota is configured.</p>
         */
        @NameInMap("quota")
        public CreateManagedAgentRequestBodyModelQuota quota;

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

        public CreateManagedAgentRequestBodyModel setQuota(CreateManagedAgentRequestBodyModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public CreateManagedAgentRequestBodyModelQuota getQuota() {
            return this.quota;
        }

    }

    public static class CreateManagedAgentRequestBodyNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow access to the Internet.</p>
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
         * <p>The public network access configurations.</p>
         */
        @NameInMap("accessInternet")
        public CreateManagedAgentRequestBodyNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configurations.</p>
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

    public static class CreateManagedAgentRequestBodyOssMounts extends TeaModel {
        /**
         * <p>The name of the OSS bucket. This parameter is required for each mount item and validated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-001</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The absolute mount path in the container, such as /data/train. Mount targets cannot be duplicated or form parent-child directory overwrites, and must avoid platform-reserved directories.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/oss/datasets</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The non-empty relative object directory prefix in the bucket. This parameter is required for each mount item.</p>
         * 
         * <strong>example:</strong>
         * <p>datasets</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether to mount the directory in read-only mode. If not specified, the default value is false.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static CreateManagedAgentRequestBodyOssMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyOssMounts self = new CreateManagedAgentRequestBodyOssMounts();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateManagedAgentRequestBodyOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateManagedAgentRequestBodyOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateManagedAgentRequestBodyOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class CreateManagedAgentRequestBodyPromptVariables extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The variable description.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>brand</p>
         */
        @NameInMap("name")
        public String name;

        public static CreateManagedAgentRequestBodyPromptVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyPromptVariables self = new CreateManagedAgentRequestBodyPromptVariables();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyPromptVariables setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public CreateManagedAgentRequestBodyPromptVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateManagedAgentRequestBodyPromptVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreateManagedAgentRequestBodyRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specifications.</p>
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

    public static class CreateManagedAgentRequestBodyRuntimeHpa extends TeaModel {
        /**
         * <p>Specifies whether to enable elastic scaling. Default value: false.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of concurrent sessions allowed per instance. Valid values: 1 to 20. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The maximum number of instances. Valid values: 0 to 100. Default value: 10. The value cannot be less than minSandboxCount.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of instances. Valid values: 0 to 100. Default value: 1. The value cannot be greater than maxSandboxCount.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The maximum idle time for a session, in seconds. Valid values: 60 to 86400. Default value: 600.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("sessionTtlSeconds")
        public Integer sessionTtlSeconds;

        public static CreateManagedAgentRequestBodyRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodyRuntimeHpa self = new CreateManagedAgentRequestBodyRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodyRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateManagedAgentRequestBodyRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public CreateManagedAgentRequestBodyRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public CreateManagedAgentRequestBodyRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public CreateManagedAgentRequestBodyRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class CreateManagedAgentRequestBodyRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The name of the request header used for session identification. This parameter is required when type is set to ISOLATED_HEADER_FIELD and must be a valid HTTP request header name. Do not specify this parameter for other policy types.</p>
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
         * <p>The elastic scaling and session configuration. Omitted fields use default values. To retain the original policy during an update, submit the complete hpa or omit the entire runtime.</p>
         */
        @NameInMap("hpa")
        public CreateManagedAgentRequestBodyRuntimeHpa hpa;

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

        public CreateManagedAgentRequestBodyRuntime setHpa(CreateManagedAgentRequestBodyRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public CreateManagedAgentRequestBodyRuntimeHpa getHpa() {
            return this.hpa;
        }

        public CreateManagedAgentRequestBodyRuntime setSessionPolicy(CreateManagedAgentRequestBodyRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public CreateManagedAgentRequestBodyRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class CreateManagedAgentRequestBodySkillsVersionSelector extends TeaModel {
        /**
         * <p>The version selector type.</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The selector value. When the type is LABEL, this is the tag name, such as latest. When the type is VERSION, this is the specific version number.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateManagedAgentRequestBodySkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodySkillsVersionSelector self = new CreateManagedAgentRequestBodySkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodySkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateManagedAgentRequestBodySkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
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
         * <p>The skill source type.</p>
         * 
         * <strong>example:</strong>
         * <p>REFERENCE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The skill version field for backward compatibility with legacy requests. For new requests, use sourceType and versionSelector. Do not submit this parameter together with sourceType.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The version selector for the skill reference. Supports LABEL for tags and VERSION for specific versions. If omitted, LABEL/latest is used. Selectors are not provided for STATIC sources.</p>
         */
        @NameInMap("versionSelector")
        public CreateManagedAgentRequestBodySkillsVersionSelector versionSelector;

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

        public CreateManagedAgentRequestBodySkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public CreateManagedAgentRequestBodySkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateManagedAgentRequestBodySkills setVersionSelector(CreateManagedAgentRequestBodySkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public CreateManagedAgentRequestBodySkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class CreateManagedAgentRequestBodySubAgentsSkills extends TeaModel {
        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>web-search</p>
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

        public static CreateManagedAgentRequestBodySubAgentsSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentRequestBodySubAgentsSkills self = new CreateManagedAgentRequestBodySubAgentsSkills();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentRequestBodySubAgentsSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentRequestBodySubAgentsSkills setVersion(String version) {
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
         * <p>Review the code</p>
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

        /**
         * <p>The list of sub-agent skills.</p>
         */
        @NameInMap("skills")
        public java.util.List<CreateManagedAgentRequestBodySubAgentsSkills> skills;

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

        public CreateManagedAgentRequestBodySubAgents setSkills(java.util.List<CreateManagedAgentRequestBodySubAgentsSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodySubAgentsSkills> getSkills() {
            return this.skills;
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
         * <p>The inbound access mode.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("accessMode")
        public String accessMode;

        /**
         * <p>The user access scope.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("accessScope")
        public String accessScope;

        /**
         * <p>The NAS storage mount configurations. Currently, only the AgenticFS type is supported, which is used to mount file directories in access points to agent runtime instances. This is the list of AgenticFS directory mounts. The total number of AgenticFS mounts and OSS mounts cannot exceed 10. If you omit this parameter or set it to [] during creation, no mounts are configured. If you omit this parameter during an update, the existing mounts are retained. If you set it to [], the mounts are cleared. Null values are not accepted.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<CreateManagedAgentRequestBodyAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The description of the managed Harness agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent for code review</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment configurations.</p>
         */
        @NameInMap("environment")
        public CreateManagedAgentRequestBodyEnvironment environment;

        /**
         * <p>The runtime framework object. If omitted, the default value is qwenpaw. Supported values are qwenpaw and qodercli. The type cannot be changed after creation.</p>
         */
        @NameInMap("harness")
        public CreateManagedAgentRequestBodyHarness harness;

        /**
         * <p>The agent instructions, which are used to guide the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The model configurations.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("model")
        public CreateManagedAgentRequestBodyModel model;

        /**
         * <p>The name of the managed Harness agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The runtime network configurations. If you provide this parameter, you must specify both accessInternet.enabled and accessVpc.enabled. Actual access is restricted by the workspace network.</p>
         */
        @NameInMap("network")
        public CreateManagedAgentRequestBodyNetwork network;

        /**
         * <p>The list of OSS directory mounts. The total number of OSS mounts and AgenticFS mounts cannot exceed 10. During an update, this list is replaced entirely. Pass [] to clear the list.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<CreateManagedAgentRequestBodyOssMounts> ossMounts;

        /**
         * <p>The prompt variable declarations.</p>
         */
        @NameInMap("promptVariables")
        public java.util.List<CreateManagedAgentRequestBodyPromptVariables> promptVariables;

        /**
         * <p>The runtime configuration. You must provide both compute and sessionPolicy. Omitted fields in hpa use default values.</p>
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

        public CreateManagedAgentRequestBody setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public CreateManagedAgentRequestBody setAccessScope(String accessScope) {
            this.accessScope = accessScope;
            return this;
        }
        public String getAccessScope() {
            return this.accessScope;
        }

        public CreateManagedAgentRequestBody setAgenticFsMounts(java.util.List<CreateManagedAgentRequestBodyAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodyAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
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

        public CreateManagedAgentRequestBody setHarness(CreateManagedAgentRequestBodyHarness harness) {
            this.harness = harness;
            return this;
        }
        public CreateManagedAgentRequestBodyHarness getHarness() {
            return this.harness;
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

        public CreateManagedAgentRequestBody setOssMounts(java.util.List<CreateManagedAgentRequestBodyOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodyOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public CreateManagedAgentRequestBody setPromptVariables(java.util.List<CreateManagedAgentRequestBodyPromptVariables> promptVariables) {
            this.promptVariables = promptVariables;
            return this;
        }
        public java.util.List<CreateManagedAgentRequestBodyPromptVariables> getPromptVariables() {
            return this.promptVariables;
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
