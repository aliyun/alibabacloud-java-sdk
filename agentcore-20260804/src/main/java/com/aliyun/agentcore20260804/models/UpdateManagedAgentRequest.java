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
     * <p>The reserved idempotency token. The backend does not guarantee idempotency in the current release.</p>
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
         * <p>The subdirectory under /mnt/agenticfs/ in the container. Required for each mount entry as validated by the backend. Mount targets must not be duplicated or have parent-child overlaps.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The non-empty relative directory that exists under the AccessPoint. Required for each mount entry as validated by the backend. Root directory, absolute paths, and parent directory segments are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether to mount in read-only mode. Default value: false. This is not the RAM role read-only policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The AccessPoint domain name. Required for each mount entry as validated by the backend. Do not include the protocol, port, or path. Use the DomainName from the NAS ListAccessPoints response.</p>
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
         * <p>The runtime harness configuration.</p>
         */
        @NameInMap("configuration")
        public UpdateManagedAgentRequestBodyHarnessConfiguration configuration;

        /**
         * <p>The runtime harness type.</p>
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
         * <p>Specifies whether to allow public network access.</p>
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
         * <p>Specifies whether to allow VPC access.</p>
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
         * <p>The OSS bucket name. Required for each mount entry as validated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-001</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The absolute mount path in the container. Required for each mount entry as validated by the backend.</p>
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

    public static class UpdateManagedAgentRequestBodyRuntimeCompute extends TeaModel {
        /**
         * <p>The compute class.</p>
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
         * <p>The maximum number of sandboxes. Required when HPA is enabled and must be no less than the minimum value.</p>
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
         * <p>The time in seconds before an inactive session is reclaimed. Required when hpa is present, as validated by the backend.</p>
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
         * <p>The HTTP header name used for session affinity. Takes effect when sessionPolicy.type is set to ISOLATED_HEADER_FIELD.</p>
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
         * <p>The sandbox auto scaling and session configuration.</p>
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
         * <p>The version selector type. Valid values:</p>
         * <ul>
         * <li>LABEL: selects by label.</li>
         * <li>VERSION: selects by specific version.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LABEL</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The selector value. If the type is LABEL, specify a label name such as latest. If the type is VERSION, specify a specific version number.</p>
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
         * <li>REFERENCE: references AI Registry.</li>
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
         * <p>The referenced version selector. Defaults to LABEL/latest if omitted. Currently supports LABEL/latest.</p>
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

    public static class UpdateManagedAgentRequestBodySubAgents extends TeaModel {
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

    }

    public static class UpdateManagedAgentRequestBodyTemplateAiRegistry extends TeaModel {
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
         * <p>The AgenticFS mount list. Omit to retain existing values, pass [] to clear, or pass a non-empty array for full replacement. null is rejected. Combined with OSS mounts, a maximum of 10 entries are allowed.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<UpdateManagedAgentRequestBodyAgenticFsMounts> agenticFsMounts;

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
        public UpdateManagedAgentRequestBodyEnvironment environment;

        /**
         * <p>The agent runtime harness.</p>
         */
        @NameInMap("harness")
        public UpdateManagedAgentRequestBodyHarness harness;

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
         */
        @NameInMap("model")
        public UpdateManagedAgentRequestBodyModel model;

        /**
         * <p>The name of the managed agent.</p>
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
        public UpdateManagedAgentRequestBodyNetwork network;

        /**
         * <p>The OSS mount list. A maximum of 10 entries are allowed. Pass an empty array to clear existing mounts.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<UpdateManagedAgentRequestBodyOssMounts> ossMounts;

        /**
         * <p>The runtime configuration.</p>
         */
        @NameInMap("runtime")
        public UpdateManagedAgentRequestBodyRuntime runtime;

        /**
         * <p>The skill configuration list.</p>
         */
        @NameInMap("skills")
        public java.util.List<UpdateManagedAgentRequestBodySkills> skills;

        /**
         * <p>The sub-agent configuration list.</p>
         */
        @NameInMap("subAgents")
        public java.util.List<UpdateManagedAgentRequestBodySubAgents> subAgents;

        /**
         * <p>The agent template configuration.</p>
         */
        @NameInMap("template")
        public UpdateManagedAgentRequestBodyTemplate template;

        /**
         * <p>The tool configuration list.</p>
         */
        @NameInMap("tools")
        public java.util.List<UpdateManagedAgentRequestBodyTools> tools;

        public static UpdateManagedAgentRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentRequestBody self = new UpdateManagedAgentRequestBody();
            return TeaModel.build(map, self);
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
