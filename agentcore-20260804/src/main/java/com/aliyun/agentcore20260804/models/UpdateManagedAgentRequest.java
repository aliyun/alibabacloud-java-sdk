// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateManagedAgentRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public UpdateManagedAgentRequestBody body;

    /**
     * <p>The reserved query parameter. The backend currently does not provide idempotency guarantees, such as deduplication or returning the original processing result, based on this token.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-1</p>
     */
    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateManagedAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateManagedAgentRequest self = new UpdateManagedAgentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateManagedAgentRequest setBody(UpdateManagedAgentRequestBody body) {
        this.body = body;
        return this;
    }
    public UpdateManagedAgentRequestBody getBody() {
        return this.body;
    }

    public UpdateManagedAgentRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateManagedAgentRequestBodyAgenticFsMounts extends TeaModel {
        /**
         * <p>The absolute mount path in the container, such as /data/train. Mount targets cannot be duplicated or form parent-child overwrites, and must avoid platform reserved directories.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The existing non-empty relative directory under the AccessPoint. This field is required and validated by the backend for each mount item. The root directory, absolute paths, or parent directory segments are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether to mount as read-only. The default value is false if omitted. This is not a RAM role read-only policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The AccessPoint domain name. This field is required and validated by the backend for each mount item. It does not contain a protocol, port, or path, and takes the DomainName from the NAS ListAccessPoints response.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("server")
        public String server;

        public static UpdateManagedAgentRequestBodyAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyAgenticFsMounts self = new UpdateManagedAgentRequestBodyAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateManagedAgentRequestBodyAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateManagedAgentRequestBodyAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateManagedAgentRequestBodyAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class UpdateManagedAgentRequestBodyEnvironmentCredentialReferences extends TeaModel {
        /**
         * <p>The credential ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-1</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        public static UpdateManagedAgentRequestBodyEnvironmentCredentialReferences build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyEnvironmentCredentialReferences self = new UpdateManagedAgentRequestBodyEnvironmentCredentialReferences();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyEnvironmentCredentialReferences setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

    }

    public static class UpdateManagedAgentRequestBodyEnvironmentVariables extends TeaModel {
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

        public static UpdateManagedAgentRequestBodyEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyEnvironmentVariables self = new UpdateManagedAgentRequestBodyEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodyEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateManagedAgentRequestBodyEnvironment extends TeaModel {
        /**
         * <p>The list of credential references.</p>
         */
        @NameInMap("credentialReferences")
        public java.util.List<UpdateManagedAgentRequestBodyEnvironmentCredentialReferences> credentialReferences;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<UpdateManagedAgentRequestBodyEnvironmentVariables> variables;

        public static UpdateManagedAgentRequestBodyEnvironment build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyEnvironment self = new UpdateManagedAgentRequestBodyEnvironment();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyEnvironment setCredentialReferences(java.util.List<UpdateManagedAgentRequestBodyEnvironmentCredentialReferences> credentialReferences) {
            this.credentialReferences = credentialReferences;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyEnvironmentCredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        public UpdateManagedAgentRequestBodyEnvironment setVariables(java.util.List<UpdateManagedAgentRequestBodyEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateManagedAgentRequestBodyHarnessConfiguration extends TeaModel {
        /**
         * <p>The account key record ID in the qodercli Connector. You can query it through ListConnectors. It is not the original key. This field can be omitted if there is only one record, but must be specified if there are multiple records. Do not specify this field for qwenpaw.</p>
         * 
         * <strong>example:</strong>
         * <p>key-example</p>
         */
        @NameInMap("connectorServiceAccountKey")
        public String connectorServiceAccountKey;

        /**
         * <p>The connector account name bound to qodercli. Do not specify this field for qwenpaw.</p>
         * 
         * <strong>example:</strong>
         * <p>my-connector-key</p>
         */
        @NameInMap("connectorServiceAccountName")
        public String connectorServiceAccountName;

        public static UpdateManagedAgentRequestBodyHarnessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyHarnessConfiguration self = new UpdateManagedAgentRequestBodyHarnessConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyHarnessConfiguration setConnectorServiceAccountKey(String connectorServiceAccountKey) {
            this.connectorServiceAccountKey = connectorServiceAccountKey;
            return this;
        }
        public String getConnectorServiceAccountKey() {
            return this.connectorServiceAccountKey;
        }

        public UpdateManagedAgentRequestBodyHarnessConfiguration setConnectorServiceAccountName(String connectorServiceAccountName) {
            this.connectorServiceAccountName = connectorServiceAccountName;
            return this;
        }
        public String getConnectorServiceAccountName() {
            return this.connectorServiceAccountName;
        }

    }

    public static class UpdateManagedAgentRequestBodyHarness extends TeaModel {
        /**
         * <p>The runtime framework configuration.</p>
         */
        @NameInMap("configuration")
        public UpdateManagedAgentRequestBodyHarnessConfiguration configuration;

        /**
         * <p>The runtime framework type. This field is required when harness is provided, and must be consistent with that specified during creation.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateManagedAgentRequestBodyHarness build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyHarness self = new UpdateManagedAgentRequestBodyHarness();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyHarness setConfiguration(UpdateManagedAgentRequestBodyHarnessConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public UpdateManagedAgentRequestBodyHarnessConfiguration getConfiguration() {
            return this.configuration;
        }

        public UpdateManagedAgentRequestBodyHarness setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateManagedAgentRequestBodyModelQuota extends TeaModel {
        /**
         * <p>Specifies whether to enable the token quota. The default value is true if not specified. Passing false disables the quota and deletes existing quota rules.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The quota limit type. This field is required and validated by the backend when the quota is enabled. Fixed value: token.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>The quota statistical period. This field is required and validated by the backend when the quota is enabled. Valid values: day (daily) and month (monthly).</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The maximum number of tokens allowed to be consumed in a single period. This field is required and validated by the backend when the quota is enabled, and must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        public static UpdateManagedAgentRequestBodyModelQuota build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyModelQuota self = new UpdateManagedAgentRequestBodyModelQuota();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateManagedAgentRequestBodyModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateManagedAgentRequestBodyModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public UpdateManagedAgentRequestBodyModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

    }

    public static class UpdateManagedAgentRequestBodyModel extends TeaModel {
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
         * <p>For qwenpaw, use the name of the upstream model created under the model connection. This field is required. For qodercli, this field can be omitted.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model token quota configuration. If this field is not passed, no quota is configured.</p>
         */
        @NameInMap("quota")
        public UpdateManagedAgentRequestBodyModelQuota quota;

        public static UpdateManagedAgentRequestBodyModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyModel self = new UpdateManagedAgentRequestBodyModel();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public UpdateManagedAgentRequestBodyModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateManagedAgentRequestBodyModel setQuota(UpdateManagedAgentRequestBodyModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public UpdateManagedAgentRequestBodyModelQuota getQuota() {
            return this.quota;
        }

    }

    public static class UpdateManagedAgentRequestBodyNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow access to the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateManagedAgentRequestBodyNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyNetworkAccessInternet self = new UpdateManagedAgentRequestBodyNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateManagedAgentRequestBodyNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether to allow access to the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateManagedAgentRequestBodyNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyNetworkAccessVpc self = new UpdateManagedAgentRequestBodyNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateManagedAgentRequestBodyNetwork extends TeaModel {
        /**
         * <p>The public network access configuration.</p>
         */
        @NameInMap("accessInternet")
        public UpdateManagedAgentRequestBodyNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configuration.</p>
         */
        @NameInMap("accessVpc")
        public UpdateManagedAgentRequestBodyNetworkAccessVpc accessVpc;

        public static UpdateManagedAgentRequestBodyNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyNetwork self = new UpdateManagedAgentRequestBodyNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyNetwork setAccessInternet(UpdateManagedAgentRequestBodyNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public UpdateManagedAgentRequestBodyNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public UpdateManagedAgentRequestBodyNetwork setAccessVpc(UpdateManagedAgentRequestBodyNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public UpdateManagedAgentRequestBodyNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class UpdateManagedAgentRequestBodyOssMounts extends TeaModel {
        /**
         * <p>The name of the OSS bucket. This parameter is required and validated by the backend for each mount item.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-001</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The absolute mount path in the container, such as /data/train. Mount targets cannot be duplicated or form parent-child overwrites, and must avoid platform reserved directories.</p>
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
         * <p>Specifies whether the mount is read-only. Default value: false.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static UpdateManagedAgentRequestBodyOssMounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyOssMounts self = new UpdateManagedAgentRequestBodyOssMounts();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateManagedAgentRequestBodyOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateManagedAgentRequestBodyOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateManagedAgentRequestBodyOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class UpdateManagedAgentRequestBodyPromptVariables extends TeaModel {
        /**
         * <p>The default value.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("defaultValue")
        public String defaultValue;

        /**
         * <p>The description of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the variable.</p>
         * 
         * <strong>example:</strong>
         * <p>brand</p>
         */
        @NameInMap("name")
        public String name;

        public static UpdateManagedAgentRequestBodyPromptVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyPromptVariables self = new UpdateManagedAgentRequestBodyPromptVariables();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyPromptVariables setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateManagedAgentRequestBodyPromptVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateManagedAgentRequestBodyPromptVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateManagedAgentRequestBodyRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specifications.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static UpdateManagedAgentRequestBodyRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyRuntimeCompute self = new UpdateManagedAgentRequestBodyRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class UpdateManagedAgentRequestBodyRuntimeHpa extends TeaModel {
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
         * <p>The maximum number of instances. Valid values: 0 to 100. Default value: 10. This value cannot be less than minSandboxCount.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of instances. Valid values: 0 to 100. Default value: 1. This value cannot be greater than maxSandboxCount.</p>
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

        public static UpdateManagedAgentRequestBodyRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyRuntimeHpa self = new UpdateManagedAgentRequestBodyRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateManagedAgentRequestBodyRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public UpdateManagedAgentRequestBodyRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public UpdateManagedAgentRequestBodyRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public UpdateManagedAgentRequestBodyRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class UpdateManagedAgentRequestBodyRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The name of the request header used to identify the session. This parameter is required when type is set to ISOLATED_HEADER_FIELD and must be a valid HTTP request header name. Do not specify this parameter for other policy types.</p>
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

        public static UpdateManagedAgentRequestBodyRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyRuntimeSessionPolicy self = new UpdateManagedAgentRequestBodyRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public UpdateManagedAgentRequestBodyRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateManagedAgentRequestBodyRuntime extends TeaModel {
        /**
         * <p>The compute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public UpdateManagedAgentRequestBodyRuntimeCompute compute;

        /**
         * <p>The elastic scaling and session configuration. Omitted fields use default values. To retain the original policy during an update, submit the complete hpa object or omit the entire runtime object.</p>
         */
        @NameInMap("hpa")
        public UpdateManagedAgentRequestBodyRuntimeHpa hpa;

        /**
         * <p>The session policy configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public UpdateManagedAgentRequestBodyRuntimeSessionPolicy sessionPolicy;

        public static UpdateManagedAgentRequestBodyRuntime build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyRuntime self = new UpdateManagedAgentRequestBodyRuntime();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyRuntime setCompute(UpdateManagedAgentRequestBodyRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public UpdateManagedAgentRequestBodyRuntimeCompute getCompute() {
            return this.compute;
        }

        public UpdateManagedAgentRequestBodyRuntime setHpa(UpdateManagedAgentRequestBodyRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public UpdateManagedAgentRequestBodyRuntimeHpa getHpa() {
            return this.hpa;
        }

        public UpdateManagedAgentRequestBodyRuntime setSessionPolicy(UpdateManagedAgentRequestBodyRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public UpdateManagedAgentRequestBodyRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class UpdateManagedAgentRequestBodySkillsVersionSelector extends TeaModel {
        /**
         * <p>The type of the version selector. Valid values: LABEL (selects by tag) and VERSION (selects by specific version).</p>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The value of the selector. If the type is LABEL, specify a tag name such as latest. If the type is VERSION, specify a specific version number.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateManagedAgentRequestBodySkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodySkillsVersionSelector self = new UpdateManagedAgentRequestBodySkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodySkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateManagedAgentRequestBodySkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateManagedAgentRequestBodySkills extends TeaModel {
        /**
         * <p>The name of the skill.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-analysis</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The source type of the skill. REFERENCE indicates that the skill references an AI Registry asset. STATIC indicates that the skill is statically provided with the deployment package.</p>
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
         * <p>The version selector for the skill reference. Supports LABEL for tag-based selection and VERSION for specific version selection. If omitted, LABEL/latest is used. Do not specify a selector for STATIC sources.</p>
         */
        @NameInMap("versionSelector")
        public UpdateManagedAgentRequestBodySkillsVersionSelector versionSelector;

        public static UpdateManagedAgentRequestBodySkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodySkills self = new UpdateManagedAgentRequestBodySkills();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodySkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateManagedAgentRequestBodySkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateManagedAgentRequestBodySkills setVersionSelector(UpdateManagedAgentRequestBodySkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public UpdateManagedAgentRequestBodySkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class UpdateManagedAgentRequestBodySubAgentsSkills extends TeaModel {
        /**
         * <p>The name of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>web-search</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the skill.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static UpdateManagedAgentRequestBodySubAgentsSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodySubAgentsSkills self = new UpdateManagedAgentRequestBodySubAgentsSkills();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodySubAgentsSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodySubAgentsSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateManagedAgentRequestBodySubAgents extends TeaModel {
        /**
         * <p>The instruction for the sub-agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Please review the code</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The name of the sub-agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reviewer-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The list of skills for the sub-agent.</p>
         */
        @NameInMap("skills")
        public java.util.List<UpdateManagedAgentRequestBodySubAgentsSkills> skills;

        public static UpdateManagedAgentRequestBodySubAgents build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodySubAgents self = new UpdateManagedAgentRequestBodySubAgents();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodySubAgents setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateManagedAgentRequestBodySubAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodySubAgents setSkills(java.util.List<UpdateManagedAgentRequestBodySubAgentsSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodySubAgentsSkills> getSkills() {
            return this.skills;
        }

    }

    public static class UpdateManagedAgentRequestBodyTemplateAiRegistry extends TeaModel {
        /**
         * <p>The name of the template in the AI Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-template</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the template in the AI Registry.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static UpdateManagedAgentRequestBodyTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyTemplateAiRegistry self = new UpdateManagedAgentRequestBodyTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodyTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateManagedAgentRequestBodyTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public UpdateManagedAgentRequestBodyTemplateAiRegistry aiRegistry;

        public static UpdateManagedAgentRequestBodyTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyTemplate self = new UpdateManagedAgentRequestBodyTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyTemplate setAiRegistry(UpdateManagedAgentRequestBodyTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public UpdateManagedAgentRequestBodyTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class UpdateManagedAgentRequestBodyTools extends TeaModel {
        /**
         * <p>The name of the tool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-reviewer</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The type of the tool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MCP</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateManagedAgentRequestBodyTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBodyTools self = new UpdateManagedAgentRequestBodyTools();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBodyTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBodyTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateManagedAgentRequestBody extends TeaModel {
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
         * <p>The NAS storage mount configuration. Currently, the AgenticFS type is supported to mount file directories in access points to agent runtime instances. The AgenticFS directory mount list can contain up to 10 items in total with ossMounts. Omitting this field or passing [] during creation indicates no mounts. During an update, omitting this field retains the original configuration, passing [] clears the list, and null is not accepted.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<UpdateManagedAgentRequestBodyAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The description of the managed Harness agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent for code review</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment configuration.</p>
         */
        @NameInMap("environment")
        public UpdateManagedAgentRequestBodyEnvironment environment;

        /**
         * <p>The runtime framework object. If omitted, the original framework is retained. If provided, the type must be the same as that specified during creation. You can update the account binding for a framework of the same type.</p>
         */
        @NameInMap("harness")
        public UpdateManagedAgentRequestBodyHarness harness;

        /**
         * <p>The agent instructions used to guide the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The model configuration.</p>
         */
        @NameInMap("model")
        public UpdateManagedAgentRequestBodyModel model;

        /**
         * <p>The name of the managed Harness agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The runtime network configuration. If provided, it must include both accessInternet.enabled and accessVpc.enabled. Actual access is restricted by the workspace network.</p>
         */
        @NameInMap("network")
        public UpdateManagedAgentRequestBodyNetwork network;

        /**
         * <p>The list of OSS directory mounts. The total number of OSS mounts and agenticFsMounts cannot exceed 10. When you update this list, the entire list is replaced. Pass an empty array [] to clear existing mounts.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<UpdateManagedAgentRequestBodyOssMounts> ossMounts;

        /**
         * <p>The prompt variable declarations.</p>
         */
        @NameInMap("promptVariables")
        public java.util.List<UpdateManagedAgentRequestBodyPromptVariables> promptVariables;

        /**
         * <p>The runtime configuration. If you omit the entire object, the original configuration is retained. If you provide this object, you must specify both compute and sessionPolicy. Omitted fields in hpa use default values.</p>
         */
        @NameInMap("runtime")
        public UpdateManagedAgentRequestBodyRuntime runtime;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<UpdateManagedAgentRequestBodySkills> skills;

        /**
         * <p>The list of sub-agent configurations.</p>
         */
        @NameInMap("subAgents")
        public java.util.List<UpdateManagedAgentRequestBodySubAgents> subAgents;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public UpdateManagedAgentRequestBodyTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<UpdateManagedAgentRequestBodyTools> tools;

        public static UpdateManagedAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBody self = new UpdateManagedAgentRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentRequestBody setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public UpdateManagedAgentRequestBody setAccessScope(String accessScope) {
            this.accessScope = accessScope;
            return this;
        }
        public String getAccessScope() {
            return this.accessScope;
        }

        public UpdateManagedAgentRequestBody setAgenticFsMounts(java.util.List<UpdateManagedAgentRequestBodyAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public UpdateManagedAgentRequestBody setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateManagedAgentRequestBody setEnvironment(UpdateManagedAgentRequestBodyEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public UpdateManagedAgentRequestBodyEnvironment getEnvironment() {
            return this.environment;
        }

        public UpdateManagedAgentRequestBody setHarness(UpdateManagedAgentRequestBodyHarness harness) {
            this.harness = harness;
            return this;
        }
        public UpdateManagedAgentRequestBodyHarness getHarness() {
            return this.harness;
        }

        public UpdateManagedAgentRequestBody setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateManagedAgentRequestBody setModel(UpdateManagedAgentRequestBodyModel model) {
            this.model = model;
            return this;
        }
        public UpdateManagedAgentRequestBodyModel getModel() {
            return this.model;
        }

        public UpdateManagedAgentRequestBody setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentRequestBody setNetwork(UpdateManagedAgentRequestBodyNetwork network) {
            this.network = network;
            return this;
        }
        public UpdateManagedAgentRequestBodyNetwork getNetwork() {
            return this.network;
        }

        public UpdateManagedAgentRequestBody setOssMounts(java.util.List<UpdateManagedAgentRequestBodyOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public UpdateManagedAgentRequestBody setPromptVariables(java.util.List<UpdateManagedAgentRequestBodyPromptVariables> promptVariables) {
            this.promptVariables = promptVariables;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyPromptVariables> getPromptVariables() {
            return this.promptVariables;
        }

        public UpdateManagedAgentRequestBody setRuntime(UpdateManagedAgentRequestBodyRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public UpdateManagedAgentRequestBodyRuntime getRuntime() {
            return this.runtime;
        }

        public UpdateManagedAgentRequestBody setSkills(java.util.List<UpdateManagedAgentRequestBodySkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodySkills> getSkills() {
            return this.skills;
        }

        public UpdateManagedAgentRequestBody setSubAgents(java.util.List<UpdateManagedAgentRequestBodySubAgents> subAgents) {
            this.subAgents = subAgents;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodySubAgents> getSubAgents() {
            return this.subAgents;
        }

        public UpdateManagedAgentRequestBody setTemplate(UpdateManagedAgentRequestBodyTemplate template) {
            this.template = template;
            return this;
        }
        public UpdateManagedAgentRequestBodyTemplate getTemplate() {
            return this.template;
        }

        public UpdateManagedAgentRequestBody setTools(java.util.List<UpdateManagedAgentRequestBodyTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateManagedAgentRequestBodyTools> getTools() {
            return this.tools;
        }

    }

}
