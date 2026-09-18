// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateManagedAgentResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS when the operation succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the managed agent.</p>
     */
    @NameInMap("data")
    public UpdateManagedAgentResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The result message of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1a2b3c4d-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateManagedAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateManagedAgentResponseBody self = new UpdateManagedAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateManagedAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateManagedAgentResponseBody setData(UpdateManagedAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateManagedAgentResponseBodyData getData() {
        return this.data;
    }

    public UpdateManagedAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateManagedAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateManagedAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateManagedAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateManagedAgentResponseBodyDataEnvironmentCredentialReferences extends TeaModel {
        /**
         * <p>The credential ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-1</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        public static UpdateManagedAgentResponseBodyDataEnvironmentCredentialReferences build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataEnvironmentCredentialReferences self = new UpdateManagedAgentResponseBodyDataEnvironmentCredentialReferences();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataEnvironmentCredentialReferences setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataEnvironmentVariables extends TeaModel {
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

        public static UpdateManagedAgentResponseBodyDataEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataEnvironmentVariables self = new UpdateManagedAgentResponseBodyDataEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentResponseBodyDataEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataEnvironment extends TeaModel {
        /**
         * <p>The list of credential references.</p>
         */
        @NameInMap("credentialReferences")
        public java.util.List<UpdateManagedAgentResponseBodyDataEnvironmentCredentialReferences> credentialReferences;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<UpdateManagedAgentResponseBodyDataEnvironmentVariables> variables;

        public static UpdateManagedAgentResponseBodyDataEnvironment build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataEnvironment self = new UpdateManagedAgentResponseBodyDataEnvironment();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataEnvironment setCredentialReferences(java.util.List<UpdateManagedAgentResponseBodyDataEnvironmentCredentialReferences> credentialReferences) {
            this.credentialReferences = credentialReferences;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataEnvironmentCredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        public UpdateManagedAgentResponseBodyDataEnvironment setVariables(java.util.List<UpdateManagedAgentResponseBodyDataEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataHarnessConfiguration extends TeaModel {
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

        public static UpdateManagedAgentResponseBodyDataHarnessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataHarnessConfiguration self = new UpdateManagedAgentResponseBodyDataHarnessConfiguration();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataHarnessConfiguration setConnectorServiceAccountKey(String connectorServiceAccountKey) {
            this.connectorServiceAccountKey = connectorServiceAccountKey;
            return this;
        }
        public String getConnectorServiceAccountKey() {
            return this.connectorServiceAccountKey;
        }

        public UpdateManagedAgentResponseBodyDataHarnessConfiguration setConnectorServiceAccountName(String connectorServiceAccountName) {
            this.connectorServiceAccountName = connectorServiceAccountName;
            return this;
        }
        public String getConnectorServiceAccountName() {
            return this.connectorServiceAccountName;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataHarness extends TeaModel {
        /**
         * <p>The harness configuration.</p>
         */
        @NameInMap("configuration")
        public UpdateManagedAgentResponseBodyDataHarnessConfiguration configuration;

        /**
         * <p>The harness type.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        @NameInMap("type")
        public String type;

        public static UpdateManagedAgentResponseBodyDataHarness build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataHarness self = new UpdateManagedAgentResponseBodyDataHarness();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataHarness setConfiguration(UpdateManagedAgentResponseBodyDataHarnessConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataHarnessConfiguration getConfiguration() {
            return this.configuration;
        }

        public UpdateManagedAgentResponseBodyDataHarness setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataModelQuota extends TeaModel {
        /**
         * <p>Indicates whether the quota is enabled. This field is not returned if no quota is configured.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The quota limit type. Currently, only token is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>token</p>
         */
        @NameInMap("limitType")
        public String limitType;

        /**
         * <p>Indicates whether the quota has been exceeded in the current period. This is a read-only field returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overLimit")
        public Boolean overLimit;

        /**
         * <p>The quota statistical period. The value day indicates a daily period, and the value month indicates a monthly period.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The gateway quota rule status. This is a read-only field returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>The maximum number of tokens that can be consumed within a single period.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        /**
         * <p>The number of tokens consumed in the current period. This is a read-only field returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("usedAmount")
        public Long usedAmount;

        public static UpdateManagedAgentResponseBodyDataModelQuota build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataModelQuota self = new UpdateManagedAgentResponseBodyDataModelQuota();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateManagedAgentResponseBodyDataModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public UpdateManagedAgentResponseBodyDataModelQuota setOverLimit(Boolean overLimit) {
            this.overLimit = overLimit;
            return this;
        }
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        public UpdateManagedAgentResponseBodyDataModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public UpdateManagedAgentResponseBodyDataModelQuota setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public UpdateManagedAgentResponseBodyDataModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public UpdateManagedAgentResponseBodyDataModelQuota setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Long getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataModel extends TeaModel {
        /**
         * <p>The model connection ID.</p>
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
         * <p>The model token quota configuration and the quota usage status for the current period. This field is empty if no quota is configured.</p>
         */
        @NameInMap("quota")
        public UpdateManagedAgentResponseBodyDataModelQuota quota;

        public static UpdateManagedAgentResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataModel self = new UpdateManagedAgentResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public UpdateManagedAgentResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public UpdateManagedAgentResponseBodyDataModel setQuota(UpdateManagedAgentResponseBodyDataModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataModelQuota getQuota() {
            return this.quota;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow public network access.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateManagedAgentResponseBodyDataNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataNetworkAccessInternet self = new UpdateManagedAgentResponseBodyDataNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether to allow VPC access.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static UpdateManagedAgentResponseBodyDataNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataNetworkAccessVpc self = new UpdateManagedAgentResponseBodyDataNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataNetwork extends TeaModel {
        /**
         * <p>The public network access configuration.</p>
         */
        @NameInMap("accessInternet")
        public UpdateManagedAgentResponseBodyDataNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configuration.</p>
         */
        @NameInMap("accessVpc")
        public UpdateManagedAgentResponseBodyDataNetworkAccessVpc accessVpc;

        public static UpdateManagedAgentResponseBodyDataNetwork build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataNetwork self = new UpdateManagedAgentResponseBodyDataNetwork();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataNetwork setAccessInternet(UpdateManagedAgentResponseBodyDataNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public UpdateManagedAgentResponseBodyDataNetwork setAccessVpc(UpdateManagedAgentResponseBodyDataNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataOssMounts extends TeaModel {
        /**
         * <p>The OSS bucket name. This parameter is required by backend validation for each mount entry.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-001</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The absolute mount path in the container. This parameter is required by backend validation for each mount entry.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/oss/datasets</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The relative object prefix within the bucket. If this parameter is not specified, the entire bucket is mounted.</p>
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

        public static UpdateManagedAgentResponseBodyDataOssMounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataOssMounts self = new UpdateManagedAgentResponseBodyDataOssMounts();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public UpdateManagedAgentResponseBodyDataOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateManagedAgentResponseBodyDataOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateManagedAgentResponseBodyDataOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static UpdateManagedAgentResponseBodyDataRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataRuntimeCompute self = new UpdateManagedAgentResponseBodyDataRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataRuntimeHpa extends TeaModel {
        /**
         * <p>Specifies whether to enable auto scaling. This parameter is required by backend validation when hpa is specified.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of active sessions per sandbox. This parameter is required by backend validation when hpa is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The maximum number of sandboxes. This parameter is required when HPA is enabled and the value must be no less than the minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of sandboxes. This parameter is required when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The session reclamation time after inactivity, in seconds. This parameter is required by backend validation when hpa is specified.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("sessionTtlSeconds")
        public Integer sessionTtlSeconds;

        public static UpdateManagedAgentResponseBodyDataRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataRuntimeHpa self = new UpdateManagedAgentResponseBodyDataRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateManagedAgentResponseBodyDataRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public UpdateManagedAgentResponseBodyDataRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public UpdateManagedAgentResponseBodyDataRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public UpdateManagedAgentResponseBodyDataRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The name of the HTTP header used for session affinity. This parameter takes effect when sessionPolicy.type is set to ISOLATED_HEADER_FIELD.</p>
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

        public static UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy self = new UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataRuntime extends TeaModel {
        /**
         * <p>The compute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public UpdateManagedAgentResponseBodyDataRuntimeCompute compute;

        /**
         * <p>The sandbox auto scaling and session configuration.</p>
         */
        @NameInMap("hpa")
        public UpdateManagedAgentResponseBodyDataRuntimeHpa hpa;

        /**
         * <p>The session policy configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy;

        public static UpdateManagedAgentResponseBodyDataRuntime build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataRuntime self = new UpdateManagedAgentResponseBodyDataRuntime();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataRuntime setCompute(UpdateManagedAgentResponseBodyDataRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataRuntimeCompute getCompute() {
            return this.compute;
        }

        public UpdateManagedAgentResponseBodyDataRuntime setHpa(UpdateManagedAgentResponseBodyDataRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataRuntimeHpa getHpa() {
            return this.hpa;
        }

        public UpdateManagedAgentResponseBodyDataRuntime setSessionPolicy(UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataSkills extends TeaModel {
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
         * <p>The skill version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static UpdateManagedAgentResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataSkills self = new UpdateManagedAgentResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataSubAgents extends TeaModel {
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

        public static UpdateManagedAgentResponseBodyDataSubAgents build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataSubAgents self = new UpdateManagedAgentResponseBodyDataSubAgents();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataSubAgents setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateManagedAgentResponseBodyDataSubAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataTemplateAiRegistry extends TeaModel {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static UpdateManagedAgentResponseBodyDataTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataTemplateAiRegistry self = new UpdateManagedAgentResponseBodyDataTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentResponseBodyDataTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The AI registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public UpdateManagedAgentResponseBodyDataTemplateAiRegistry aiRegistry;

        public static UpdateManagedAgentResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataTemplate self = new UpdateManagedAgentResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataTemplate setAiRegistry(UpdateManagedAgentResponseBodyDataTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataTools extends TeaModel {
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

        public static UpdateManagedAgentResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataTools self = new UpdateManagedAgentResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentResponseBodyDataTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateManagedAgentResponseBodyData extends TeaModel {
        /**
         * <p>The managed agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The creation mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("createMode")
        public String createMode;

        /**
         * <p>The creation time in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The deployment type.</p>
         * 
         * <strong>example:</strong>
         * <p>Managed</p>
         */
        @NameInMap("deployType")
        public String deployType;

        /**
         * <p>The description of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>An agent for code review</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment configuration information.</p>
         */
        @NameInMap("environment")
        public UpdateManagedAgentResponseBodyDataEnvironment environment;

        /**
         * <p>The agent harness configuration.</p>
         */
        @NameInMap("harness")
        public UpdateManagedAgentResponseBodyDataHarness harness;

        /**
         * <p>The agent instruction that guides the behavior of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a code review assistant</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The latest specification version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("latestSpecVersion")
        public Long latestSpecVersion;

        /**
         * <p>The latest version status.</p>
         * 
         * <strong>example:</strong>
         * <p>succeeded</p>
         */
        @NameInMap("latestVersionStatus")
        public String latestVersionStatus;

        /**
         * <p>The model configuration information.</p>
         */
        @NameInMap("model")
        public UpdateManagedAgentResponseBodyDataModel model;

        /**
         * <p>The name of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>my-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The network configuration information.</p>
         */
        @NameInMap("network")
        public UpdateManagedAgentResponseBodyDataNetwork network;

        /**
         * <p>The list of OSS mounts. A maximum of 10 entries are supported.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<UpdateManagedAgentResponseBodyDataOssMounts> ossMounts;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The runtime configuration information.</p>
         */
        @NameInMap("runtime")
        public UpdateManagedAgentResponseBodyDataRuntime runtime;

        /**
         * <p>The number of managed agent instances grouped by sandbox phase. Current keys: PENDING (being created or initialized), RUNNING (running), HIBERNATING (entering hibernation), HIBERNATED (hibernated), RESUMING (resuming), TERMINATING (being terminated), FAILED (runtime failure). Only phases that actually occur are returned. Missing keys should be treated as 0. This field is a dynamic mapping, and new keys may be added in the future. You can use FAILED &gt; 0 to determine whether any abnormal instances exist.</p>
         */
        @NameInMap("sandboxPhaseCounts")
        public java.util.Map<String, Long> sandboxPhaseCounts;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<UpdateManagedAgentResponseBodyDataSkills> skills;

        /**
         * <p>The status of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of sub-agent configurations.</p>
         */
        @NameInMap("subAgents")
        public java.util.List<UpdateManagedAgentResponseBodyDataSubAgents> subAgents;

        /**
         * <p>The template configuration.</p>
         */
        @NameInMap("template")
        public UpdateManagedAgentResponseBodyDataTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<UpdateManagedAgentResponseBodyDataTools> tools;

        /**
         * <p>The time when the managed agent was last updated, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-1</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static UpdateManagedAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyData self = new UpdateManagedAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateManagedAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public UpdateManagedAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateManagedAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public UpdateManagedAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateManagedAgentResponseBodyData setEnvironment(UpdateManagedAgentResponseBodyDataEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataEnvironment getEnvironment() {
            return this.environment;
        }

        public UpdateManagedAgentResponseBodyData setHarness(UpdateManagedAgentResponseBodyDataHarness harness) {
            this.harness = harness;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataHarness getHarness() {
            return this.harness;
        }

        public UpdateManagedAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public UpdateManagedAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public UpdateManagedAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public UpdateManagedAgentResponseBodyData setModel(UpdateManagedAgentResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataModel getModel() {
            return this.model;
        }

        public UpdateManagedAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentResponseBodyData setNetwork(UpdateManagedAgentResponseBodyDataNetwork network) {
            this.network = network;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataNetwork getNetwork() {
            return this.network;
        }

        public UpdateManagedAgentResponseBodyData setOssMounts(java.util.List<UpdateManagedAgentResponseBodyDataOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public UpdateManagedAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateManagedAgentResponseBodyData setRuntime(UpdateManagedAgentResponseBodyDataRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataRuntime getRuntime() {
            return this.runtime;
        }

        public UpdateManagedAgentResponseBodyData setSandboxPhaseCounts(java.util.Map<String, Long> sandboxPhaseCounts) {
            this.sandboxPhaseCounts = sandboxPhaseCounts;
            return this;
        }
        public java.util.Map<String, Long> getSandboxPhaseCounts() {
            return this.sandboxPhaseCounts;
        }

        public UpdateManagedAgentResponseBodyData setSkills(java.util.List<UpdateManagedAgentResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public UpdateManagedAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateManagedAgentResponseBodyData setSubAgents(java.util.List<UpdateManagedAgentResponseBodyDataSubAgents> subAgents) {
            this.subAgents = subAgents;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataSubAgents> getSubAgents() {
            return this.subAgents;
        }

        public UpdateManagedAgentResponseBodyData setTemplate(UpdateManagedAgentResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public UpdateManagedAgentResponseBodyData setTools(java.util.List<UpdateManagedAgentResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataTools> getTools() {
            return this.tools;
        }

        public UpdateManagedAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public UpdateManagedAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
