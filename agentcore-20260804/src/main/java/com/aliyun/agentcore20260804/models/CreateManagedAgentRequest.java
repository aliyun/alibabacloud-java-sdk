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
     * <p>The reserved idempotency token. The backend does not provide idempotency guarantees in the current release.</p>
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
         * <p>The subdirectory under /mnt/agenticfs/ in the container. Required for each mount item as validated by the backend. Mount targets must not be duplicated or have parent-child overlaps.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The non-empty relative directory that exists under the AccessPoint. Required for each mount item as validated by the backend. Root directories, absolute paths, and parent directory segments are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether to mount in read-only mode. Default value: false. This is not a RAM role read-only policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The AccessPoint domain name. Required for each mount item as validated by the backend. Do not include the protocol, port, or path. Use the DomainName from the NAS ListAccessPoints response.</p>
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
         * <p>The connector service account key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-xxxx</p>
         */
        @NameInMap("connectorServiceAccountKey")
        public String connectorServiceAccountKey;

        /**
         * <p>The connector service account name.</p>
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
         * <p>The runtime harness configuration.</p>
         */
        @NameInMap("configuration")
        public CreateManagedAgentRequestBodyHarnessConfiguration configuration;

        /**
         * <p>The runtime harness type.</p>
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
         * <p>Specifies whether to enable token quota. Default value: true. Set to false to disable and delete existing quota rules.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The quota limit type. Required when quota is enabled, as validated by the backend. Fixed value: token.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>The quota statistical period. Required when quota is enabled, as validated by the backend. Valid values:</p>
         * <ul>
         * <li>day: daily.</li>
         * <li>month: monthly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The maximum number of tokens allowed within a single period. Required when quota is enabled, as validated by the backend. The value must be greater than 0.</p>
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
         * <p>The model connection ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mc-1</p>
         */
        @NameInMap("modelConnectionId")
        public String modelConnectionId;

        /**
         * <p>The upstream model name.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model token quota configuration. If not specified, no quota is configured.</p>
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
         * <p>Specifies whether to allow public network access.</p>
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
         * <p>Specifies whether to allow VPC access.</p>
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
         * <p>The public network access configuration.</p>
         */
        @NameInMap("accessInternet")
        public CreateManagedAgentRequestBodyNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configuration.</p>
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
         * <p>The OSS bucket name. Required for each mount item as validated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-001</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The absolute mount path in the container. Required for each mount item as validated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/oss/datasets</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The relative object prefix within the bucket. If not specified, the entire bucket is mounted.</p>
         * 
         * <strong>example:</strong>
         * <p>datasets</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether to mount in read-only mode. Default value: false.</p>
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

    public static class CreateManagedAgentRequestBodyRuntimeCompute extends TeaModel {
        /**
         * <p>The compute class.</p>
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
         * <p>Specifies whether to enable auto scaling. Required when hpa is present, as validated by the backend.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of active sessions per sandbox. Required when hpa is present, as validated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The maximum number of sandboxes. Required when HPA is enabled and must be greater than or equal to the minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of sandboxes. Required when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The time-to-live for an inactive session, in seconds. Required when hpa is present, as validated by the backend.</p>
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
         * <p>The name of the HTTP header used for session affinity. This parameter takes effect only when sessionPolicy.type is set to ISOLATED_HEADER_FIELD.</p>
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
         * <p>The sandbox auto scaling and session configuration.</p>
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
         * <p>The version selector type. Valid values:</p>
         * <ul>
         * <li>LABEL: select by label.</li>
         * <li>VERSION: select by specific version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The selector value. When the type is LABEL, specify a label name such as latest. When the type is VERSION, specify a specific version number.</p>
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
         * <p>The skill source type. Valid values:</p>
         * <ul>
         * <li>REFERENCE: referenced from AI Registry.</li>
         * <li>STATIC: statically bundled with the package.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REFERENCE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The version selector for the reference. Defaults to LABEL/latest if omitted. Currently supports LABEL/latest.</p>
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
         * <p>The skill name used by the sub-agent. Declared as optional for compatibility, but the backend validates that each entry is required.</p>
         * 
         * <strong>example:</strong>
         * <p>web-search</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The optional version number. If omitted, set to null, or left blank, the latest version is resolved.</p>
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
         * <p>Please review the code</p>
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
         * <p>The skills exclusively used by this sub-agent. Skill names must be unique within the same sub-agent. If not specified or an empty array is passed, no skills are configured.</p>
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
         * <p>The name of the template in AI Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>code-review-template</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The version of the template in AI Registry.</p>
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
         * <p>The AI Registry template configuration.</p>
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
         * <p>The AgenticFS mount list. Omit or set to [] to indicate no AFS mounts. Set to null to reject. The total number of AFS and OSS mounts cannot exceed 10.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<CreateManagedAgentRequestBodyAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The description of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>An agent for code review</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment configuration.</p>
         */
        @NameInMap("environment")
        public CreateManagedAgentRequestBodyEnvironment environment;

        /**
         * <p>The agent runtime harness.</p>
         */
        @NameInMap("harness")
        public CreateManagedAgentRequestBodyHarness harness;

        /**
         * <p>The agent instruction that guides the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The model configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("model")
        public CreateManagedAgentRequestBodyModel model;

        /**
         * <p>The name of the managed agent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network configuration.</p>
         */
        @NameInMap("network")
        public CreateManagedAgentRequestBodyNetwork network;

        /**
         * <p>The OSS mount list. A maximum of 10 items are allowed.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<CreateManagedAgentRequestBodyOssMounts> ossMounts;

        /**
         * <p>The runtime configuration.</p>
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
