// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class CreateManagedAgentResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS when the operation succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The information about the managed agent after creation.</p>
     */
    @NameInMap("data")
    public CreateManagedAgentResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned for the request.</p>
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

    public static CreateManagedAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateManagedAgentResponseBody self = new CreateManagedAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateManagedAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateManagedAgentResponseBody setData(CreateManagedAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateManagedAgentResponseBodyData getData() {
        return this.data;
    }

    public CreateManagedAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateManagedAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateManagedAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateManagedAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateManagedAgentResponseBodyDataAgenticFsMounts extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataAgenticFsMounts self = new CreateManagedAgentResponseBodyDataAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateManagedAgentResponseBodyDataAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateManagedAgentResponseBodyDataAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public CreateManagedAgentResponseBodyDataAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector self = new CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateManagedAgentResponseBodyDataConfiguredSkills extends TeaModel {
        /**
         * <p>The skill name in the Workspace AI Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>web-search</p>
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
         * <p>A legacy compatibility field. Use sourceType and versionSelector for new requests.</p>
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
        public CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector versionSelector;

        public static CreateManagedAgentResponseBodyDataConfiguredSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataConfiguredSkills self = new CreateManagedAgentResponseBodyDataConfiguredSkills();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataConfiguredSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentResponseBodyDataConfiguredSkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public CreateManagedAgentResponseBodyDataConfiguredSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateManagedAgentResponseBodyDataConfiguredSkills setVersionSelector(CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public CreateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class CreateManagedAgentResponseBodyDataEnvironmentCredentialReferences extends TeaModel {
        /**
         * <p>The credential ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-1</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        public static CreateManagedAgentResponseBodyDataEnvironmentCredentialReferences build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataEnvironmentCredentialReferences self = new CreateManagedAgentResponseBodyDataEnvironmentCredentialReferences();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataEnvironmentCredentialReferences setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

    }

    public static class CreateManagedAgentResponseBodyDataEnvironmentVariables extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataEnvironmentVariables self = new CreateManagedAgentResponseBodyDataEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentResponseBodyDataEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateManagedAgentResponseBodyDataEnvironment extends TeaModel {
        /**
         * <p>The list of credential references.</p>
         */
        @NameInMap("credentialReferences")
        public java.util.List<CreateManagedAgentResponseBodyDataEnvironmentCredentialReferences> credentialReferences;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<CreateManagedAgentResponseBodyDataEnvironmentVariables> variables;

        public static CreateManagedAgentResponseBodyDataEnvironment build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataEnvironment self = new CreateManagedAgentResponseBodyDataEnvironment();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataEnvironment setCredentialReferences(java.util.List<CreateManagedAgentResponseBodyDataEnvironmentCredentialReferences> credentialReferences) {
            this.credentialReferences = credentialReferences;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataEnvironmentCredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        public CreateManagedAgentResponseBodyDataEnvironment setVariables(java.util.List<CreateManagedAgentResponseBodyDataEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class CreateManagedAgentResponseBodyDataHarnessConfiguration extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataHarnessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataHarnessConfiguration self = new CreateManagedAgentResponseBodyDataHarnessConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataHarnessConfiguration setConnectorServiceAccountKey(String connectorServiceAccountKey) {
            this.connectorServiceAccountKey = connectorServiceAccountKey;
            return this;
        }
        public String getConnectorServiceAccountKey() {
            return this.connectorServiceAccountKey;
        }

        public CreateManagedAgentResponseBodyDataHarnessConfiguration setConnectorServiceAccountName(String connectorServiceAccountName) {
            this.connectorServiceAccountName = connectorServiceAccountName;
            return this;
        }
        public String getConnectorServiceAccountName() {
            return this.connectorServiceAccountName;
        }

    }

    public static class CreateManagedAgentResponseBodyDataHarness extends TeaModel {
        /**
         * <p>The runtime harness configuration.</p>
         */
        @NameInMap("configuration")
        public CreateManagedAgentResponseBodyDataHarnessConfiguration configuration;

        /**
         * <p>The runtime harness type.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        @NameInMap("type")
        public String type;

        public static CreateManagedAgentResponseBodyDataHarness build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataHarness self = new CreateManagedAgentResponseBodyDataHarness();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataHarness setConfiguration(CreateManagedAgentResponseBodyDataHarnessConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public CreateManagedAgentResponseBodyDataHarnessConfiguration getConfiguration() {
            return this.configuration;
        }

        public CreateManagedAgentResponseBodyDataHarness setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateManagedAgentResponseBodyDataModelQuota extends TeaModel {
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
         * <p>Indicates whether the quota has been exceeded in the current period. This field is read-only and returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overLimit")
        public Boolean overLimit;

        /**
         * <p>The statistical period of the quota. A value of day indicates daily, and a value of month indicates monthly.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The gateway quota rule status. This field is read-only and returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>The maximum number of tokens that can be consumed in a single period.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        /**
         * <p>The number of tokens consumed in the current period. This field is read-only and returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("usedAmount")
        public Long usedAmount;

        public static CreateManagedAgentResponseBodyDataModelQuota build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataModelQuota self = new CreateManagedAgentResponseBodyDataModelQuota();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateManagedAgentResponseBodyDataModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public CreateManagedAgentResponseBodyDataModelQuota setOverLimit(Boolean overLimit) {
            this.overLimit = overLimit;
            return this;
        }
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        public CreateManagedAgentResponseBodyDataModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public CreateManagedAgentResponseBodyDataModelQuota setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public CreateManagedAgentResponseBodyDataModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public CreateManagedAgentResponseBodyDataModelQuota setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Long getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class CreateManagedAgentResponseBodyDataModel extends TeaModel {
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
         * <p>The model token quota configuration and the quota usage status in the current period. This field is empty if no quota is configured.</p>
         */
        @NameInMap("quota")
        public CreateManagedAgentResponseBodyDataModelQuota quota;

        public static CreateManagedAgentResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataModel self = new CreateManagedAgentResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public CreateManagedAgentResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public CreateManagedAgentResponseBodyDataModel setQuota(CreateManagedAgentResponseBodyDataModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public CreateManagedAgentResponseBodyDataModelQuota getQuota() {
            return this.quota;
        }

    }

    public static class CreateManagedAgentResponseBodyDataNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow public network access.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateManagedAgentResponseBodyDataNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataNetworkAccessInternet self = new CreateManagedAgentResponseBodyDataNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateManagedAgentResponseBodyDataNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether to allow VPC access.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static CreateManagedAgentResponseBodyDataNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataNetworkAccessVpc self = new CreateManagedAgentResponseBodyDataNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class CreateManagedAgentResponseBodyDataNetwork extends TeaModel {
        /**
         * <p>The public network access configuration.</p>
         */
        @NameInMap("accessInternet")
        public CreateManagedAgentResponseBodyDataNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configuration.</p>
         */
        @NameInMap("accessVpc")
        public CreateManagedAgentResponseBodyDataNetworkAccessVpc accessVpc;

        public static CreateManagedAgentResponseBodyDataNetwork build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataNetwork self = new CreateManagedAgentResponseBodyDataNetwork();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataNetwork setAccessInternet(CreateManagedAgentResponseBodyDataNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public CreateManagedAgentResponseBodyDataNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public CreateManagedAgentResponseBodyDataNetwork setAccessVpc(CreateManagedAgentResponseBodyDataNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public CreateManagedAgentResponseBodyDataNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class CreateManagedAgentResponseBodyDataOssMounts extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataOssMounts build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataOssMounts self = new CreateManagedAgentResponseBodyDataOssMounts();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public CreateManagedAgentResponseBodyDataOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public CreateManagedAgentResponseBodyDataOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateManagedAgentResponseBodyDataOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class CreateManagedAgentResponseBodyDataRuntimeCompute extends TeaModel {
        /**
         * <p>The compute class.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static CreateManagedAgentResponseBodyDataRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataRuntimeCompute self = new CreateManagedAgentResponseBodyDataRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class CreateManagedAgentResponseBodyDataRuntimeHpa extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataRuntimeHpa self = new CreateManagedAgentResponseBodyDataRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateManagedAgentResponseBodyDataRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public CreateManagedAgentResponseBodyDataRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public CreateManagedAgentResponseBodyDataRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public CreateManagedAgentResponseBodyDataRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class CreateManagedAgentResponseBodyDataRuntimeSessionPolicy extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataRuntimeSessionPolicy self = new CreateManagedAgentResponseBodyDataRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public CreateManagedAgentResponseBodyDataRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateManagedAgentResponseBodyDataRuntime extends TeaModel {
        /**
         * <p>The compute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public CreateManagedAgentResponseBodyDataRuntimeCompute compute;

        /**
         * <p>The sandbox auto scaling and session configuration.</p>
         */
        @NameInMap("hpa")
        public CreateManagedAgentResponseBodyDataRuntimeHpa hpa;

        /**
         * <p>The session policy configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public CreateManagedAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy;

        public static CreateManagedAgentResponseBodyDataRuntime build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataRuntime self = new CreateManagedAgentResponseBodyDataRuntime();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataRuntime setCompute(CreateManagedAgentResponseBodyDataRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public CreateManagedAgentResponseBodyDataRuntimeCompute getCompute() {
            return this.compute;
        }

        public CreateManagedAgentResponseBodyDataRuntime setHpa(CreateManagedAgentResponseBodyDataRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public CreateManagedAgentResponseBodyDataRuntimeHpa getHpa() {
            return this.hpa;
        }

        public CreateManagedAgentResponseBodyDataRuntime setSessionPolicy(CreateManagedAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public CreateManagedAgentResponseBodyDataRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class CreateManagedAgentResponseBodyDataSkillsVersionSelector extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataSkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataSkillsVersionSelector self = new CreateManagedAgentResponseBodyDataSkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataSkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateManagedAgentResponseBodyDataSkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateManagedAgentResponseBodyDataSkills extends TeaModel {
        /**
         * <p>The version that has taken effect at runtime. This field is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("appliedVersion")
        public String appliedVersion;

        /**
         * <p>Indicates whether the skill originates from a fixed template. This field is read-only. Template items cannot be removed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("fromTemplate")
        public Boolean fromTemplate;

        /**
         * <p>The skill name.</p>
         * 
         * <strong>example:</strong>
         * <p>code-analysis</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The current target version. This field is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("resolvedVersion")
        public String resolvedVersion;

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
         * <p>The referenced version selector. Defaults to LABEL/latest if omitted.</p>
         */
        @NameInMap("versionSelector")
        public CreateManagedAgentResponseBodyDataSkillsVersionSelector versionSelector;

        public static CreateManagedAgentResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataSkills self = new CreateManagedAgentResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataSkills setAppliedVersion(String appliedVersion) {
            this.appliedVersion = appliedVersion;
            return this;
        }
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        public CreateManagedAgentResponseBodyDataSkills setFromTemplate(Boolean fromTemplate) {
            this.fromTemplate = fromTemplate;
            return this;
        }
        public Boolean getFromTemplate() {
            return this.fromTemplate;
        }

        public CreateManagedAgentResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentResponseBodyDataSkills setResolvedVersion(String resolvedVersion) {
            this.resolvedVersion = resolvedVersion;
            return this;
        }
        public String getResolvedVersion() {
            return this.resolvedVersion;
        }

        public CreateManagedAgentResponseBodyDataSkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public CreateManagedAgentResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public CreateManagedAgentResponseBodyDataSkills setVersionSelector(CreateManagedAgentResponseBodyDataSkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public CreateManagedAgentResponseBodyDataSkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class CreateManagedAgentResponseBodyDataSubAgentsSkills extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataSubAgentsSkills build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataSubAgentsSkills self = new CreateManagedAgentResponseBodyDataSubAgentsSkills();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataSubAgentsSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentResponseBodyDataSubAgentsSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateManagedAgentResponseBodyDataSubAgents extends TeaModel {
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
         * <p>The skills used by the child agent and their actual versions. The version field is not returned if the template package does not contain version information.</p>
         */
        @NameInMap("skills")
        public java.util.List<CreateManagedAgentResponseBodyDataSubAgentsSkills> skills;

        public static CreateManagedAgentResponseBodyDataSubAgents build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataSubAgents self = new CreateManagedAgentResponseBodyDataSubAgents();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataSubAgents setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateManagedAgentResponseBodyDataSubAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentResponseBodyDataSubAgents setSkills(java.util.List<CreateManagedAgentResponseBodyDataSubAgentsSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataSubAgentsSkills> getSkills() {
            return this.skills;
        }

    }

    public static class CreateManagedAgentResponseBodyDataTemplateAiRegistry extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataTemplateAiRegistry self = new CreateManagedAgentResponseBodyDataTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentResponseBodyDataTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class CreateManagedAgentResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The AI Registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public CreateManagedAgentResponseBodyDataTemplateAiRegistry aiRegistry;

        public static CreateManagedAgentResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataTemplate self = new CreateManagedAgentResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataTemplate setAiRegistry(CreateManagedAgentResponseBodyDataTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public CreateManagedAgentResponseBodyDataTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class CreateManagedAgentResponseBodyDataTools extends TeaModel {
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

        public static CreateManagedAgentResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyDataTools self = new CreateManagedAgentResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentResponseBodyDataTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateManagedAgentResponseBodyData extends TeaModel {
        /**
         * <p>The managed agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The AgenticFS additional mount list. The total number of items in this list and ossMounts cannot exceed 10.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<CreateManagedAgentResponseBodyDataAgenticFsMounts> agenticFsMounts;

        /**
         * <p>Contains only the skills that are added or overridden by the user, excluding skills inherited from the template. The resource model reads this field to preserve update semantics. The skills field in the request is still used for creation and update operations.</p>
         */
        @NameInMap("configuredSkills")
        public java.util.List<CreateManagedAgentResponseBodyDataConfiguredSkills> configuredSkills;

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
         * <p>The environment configuration.</p>
         */
        @NameInMap("environment")
        public CreateManagedAgentResponseBodyDataEnvironment environment;

        /**
         * <p>The agent runtime harness.</p>
         */
        @NameInMap("harness")
        public CreateManagedAgentResponseBodyDataHarness harness;

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
         * <p>The model configuration.</p>
         */
        @NameInMap("model")
        public CreateManagedAgentResponseBodyDataModel model;

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
        public CreateManagedAgentResponseBodyDataNetwork network;

        /**
         * <p>The OSS mount list. A maximum of 10 items are allowed.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<CreateManagedAgentResponseBodyDataOssMounts> ossMounts;

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
        public CreateManagedAgentResponseBodyDataRuntime runtime;

        /**
         * <p>The instance counts of the managed agent grouped by sandbox phase. Current keys: PENDING (being created or initialized), RUNNING (running), HIBERNATING (entering hibernation), HIBERNATED (hibernated), RESUMING (resuming), TERMINATING (being terminated), and FAILED (runtime failure). Only phases that actually occur are returned. Missing keys are treated as 0. This field is a dynamic map and new keys may be added in the future. The frontend can use FAILED &gt; 0 to determine whether abnormal instances exist.</p>
         */
        @NameInMap("sandboxPhaseCounts")
        public java.util.Map<String, Long> sandboxPhaseCounts;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<CreateManagedAgentResponseBodyDataSkills> skills;

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
        public java.util.List<CreateManagedAgentResponseBodyDataSubAgents> subAgents;

        /**
         * <p>The template configuration information.</p>
         */
        @NameInMap("template")
        public CreateManagedAgentResponseBodyDataTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<CreateManagedAgentResponseBodyDataTools> tools;

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

        public static CreateManagedAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateManagedAgentResponseBodyData self = new CreateManagedAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateManagedAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CreateManagedAgentResponseBodyData setAgenticFsMounts(java.util.List<CreateManagedAgentResponseBodyDataAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public CreateManagedAgentResponseBodyData setConfiguredSkills(java.util.List<CreateManagedAgentResponseBodyDataConfiguredSkills> configuredSkills) {
            this.configuredSkills = configuredSkills;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataConfiguredSkills> getConfiguredSkills() {
            return this.configuredSkills;
        }

        public CreateManagedAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public CreateManagedAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public CreateManagedAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public CreateManagedAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateManagedAgentResponseBodyData setEnvironment(CreateManagedAgentResponseBodyDataEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public CreateManagedAgentResponseBodyDataEnvironment getEnvironment() {
            return this.environment;
        }

        public CreateManagedAgentResponseBodyData setHarness(CreateManagedAgentResponseBodyDataHarness harness) {
            this.harness = harness;
            return this;
        }
        public CreateManagedAgentResponseBodyDataHarness getHarness() {
            return this.harness;
        }

        public CreateManagedAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public CreateManagedAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public CreateManagedAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public CreateManagedAgentResponseBodyData setModel(CreateManagedAgentResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public CreateManagedAgentResponseBodyDataModel getModel() {
            return this.model;
        }

        public CreateManagedAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateManagedAgentResponseBodyData setNetwork(CreateManagedAgentResponseBodyDataNetwork network) {
            this.network = network;
            return this;
        }
        public CreateManagedAgentResponseBodyDataNetwork getNetwork() {
            return this.network;
        }

        public CreateManagedAgentResponseBodyData setOssMounts(java.util.List<CreateManagedAgentResponseBodyDataOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public CreateManagedAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateManagedAgentResponseBodyData setRuntime(CreateManagedAgentResponseBodyDataRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public CreateManagedAgentResponseBodyDataRuntime getRuntime() {
            return this.runtime;
        }

        public CreateManagedAgentResponseBodyData setSandboxPhaseCounts(java.util.Map<String, Long> sandboxPhaseCounts) {
            this.sandboxPhaseCounts = sandboxPhaseCounts;
            return this;
        }
        public java.util.Map<String, Long> getSandboxPhaseCounts() {
            return this.sandboxPhaseCounts;
        }

        public CreateManagedAgentResponseBodyData setSkills(java.util.List<CreateManagedAgentResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public CreateManagedAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateManagedAgentResponseBodyData setSubAgents(java.util.List<CreateManagedAgentResponseBodyDataSubAgents> subAgents) {
            this.subAgents = subAgents;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataSubAgents> getSubAgents() {
            return this.subAgents;
        }

        public CreateManagedAgentResponseBodyData setTemplate(CreateManagedAgentResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public CreateManagedAgentResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public CreateManagedAgentResponseBodyData setTools(java.util.List<CreateManagedAgentResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<CreateManagedAgentResponseBodyDataTools> getTools() {
            return this.tools;
        }

        public CreateManagedAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public CreateManagedAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
