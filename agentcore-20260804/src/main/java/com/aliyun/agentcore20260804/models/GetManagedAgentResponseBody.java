// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetManagedAgentResponseBody extends TeaModel {
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
    public GetManagedAgentResponseBodyData data;

    /**
     * <p>The HTTP status code. A value of 200 indicates success.</p>
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

    public static GetManagedAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetManagedAgentResponseBody self = new GetManagedAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetManagedAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetManagedAgentResponseBody setData(GetManagedAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetManagedAgentResponseBodyData getData() {
        return this.data;
    }

    public GetManagedAgentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetManagedAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetManagedAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetManagedAgentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetManagedAgentResponseBodyDataAgenticFsMounts extends TeaModel {
        /**
         * <p>The subdirectory under /mnt/agenticfs/ in the container. This field is required for each mount item as validated by the backend. Mount targets must not be duplicated or have parent-child overlaps.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The non-empty relative directory that exists under the AccessPoint. This field is required for each mount item as validated by the backend. Root directories, absolute paths, and parent directory segments are not allowed.</p>
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
         * <p>The AccessPoint domain name. This field is required for each mount item as validated by the backend. The value does not include protocol, port, or path. Use the DomainName from the NAS ListAccessPoints response.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("server")
        public String server;

        public static GetManagedAgentResponseBodyDataAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataAgenticFsMounts self = new GetManagedAgentResponseBodyDataAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetManagedAgentResponseBodyDataAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetManagedAgentResponseBodyDataAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public GetManagedAgentResponseBodyDataAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector extends TeaModel {
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
         * <p>The selector value. When the type is LABEL, this is the label name (such as latest). When the type is VERSION, this is the specific version number.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("value")
        public String value;

        public static GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector self = new GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetManagedAgentResponseBodyDataConfiguredSkills extends TeaModel {
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
         * <li>REFERENCE: references the AI Registry.</li>
         * <li>STATIC: statically provided with the package.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>REFERENCE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p><strong>[Deprecated]</strong> Legacy compatibility field. Use sourceType and versionSelector for new requests.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        /**
         * <p>The version selector for the referenced skill. If omitted, the default value is LABEL/latest. Currently, only LABEL/latest is supported.</p>
         */
        @NameInMap("versionSelector")
        public GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector versionSelector;

        public static GetManagedAgentResponseBodyDataConfiguredSkills build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataConfiguredSkills self = new GetManagedAgentResponseBodyDataConfiguredSkills();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataConfiguredSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataConfiguredSkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetManagedAgentResponseBodyDataConfiguredSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetManagedAgentResponseBodyDataConfiguredSkills setVersionSelector(GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public GetManagedAgentResponseBodyDataConfiguredSkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class GetManagedAgentResponseBodyDataEnvironmentCredentialReferences extends TeaModel {
        /**
         * <p>The credential ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cred-1</p>
         */
        @NameInMap("credentialId")
        public String credentialId;

        public static GetManagedAgentResponseBodyDataEnvironmentCredentialReferences build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataEnvironmentCredentialReferences self = new GetManagedAgentResponseBodyDataEnvironmentCredentialReferences();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataEnvironmentCredentialReferences setCredentialId(String credentialId) {
            this.credentialId = credentialId;
            return this;
        }
        public String getCredentialId() {
            return this.credentialId;
        }

    }

    public static class GetManagedAgentResponseBodyDataEnvironmentVariables extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataEnvironmentVariables build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataEnvironmentVariables self = new GetManagedAgentResponseBodyDataEnvironmentVariables();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataEnvironmentVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataEnvironmentVariables setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetManagedAgentResponseBodyDataEnvironment extends TeaModel {
        /**
         * <p>The list of credential references.</p>
         */
        @NameInMap("credentialReferences")
        public java.util.List<GetManagedAgentResponseBodyDataEnvironmentCredentialReferences> credentialReferences;

        /**
         * <p>The list of environment variables.</p>
         */
        @NameInMap("variables")
        public java.util.List<GetManagedAgentResponseBodyDataEnvironmentVariables> variables;

        public static GetManagedAgentResponseBodyDataEnvironment build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataEnvironment self = new GetManagedAgentResponseBodyDataEnvironment();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataEnvironment setCredentialReferences(java.util.List<GetManagedAgentResponseBodyDataEnvironmentCredentialReferences> credentialReferences) {
            this.credentialReferences = credentialReferences;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataEnvironmentCredentialReferences> getCredentialReferences() {
            return this.credentialReferences;
        }

        public GetManagedAgentResponseBodyDataEnvironment setVariables(java.util.List<GetManagedAgentResponseBodyDataEnvironmentVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataEnvironmentVariables> getVariables() {
            return this.variables;
        }

    }

    public static class GetManagedAgentResponseBodyDataHarnessConfiguration extends TeaModel {
        /**
         * <p>The Connector Service Account Key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-xxxx</p>
         */
        @NameInMap("connectorServiceAccountKey")
        public String connectorServiceAccountKey;

        /**
         * <p>The Connector Service Account Name.</p>
         * 
         * <strong>example:</strong>
         * <p>my-connector-key</p>
         */
        @NameInMap("connectorServiceAccountName")
        public String connectorServiceAccountName;

        public static GetManagedAgentResponseBodyDataHarnessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataHarnessConfiguration self = new GetManagedAgentResponseBodyDataHarnessConfiguration();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataHarnessConfiguration setConnectorServiceAccountKey(String connectorServiceAccountKey) {
            this.connectorServiceAccountKey = connectorServiceAccountKey;
            return this;
        }
        public String getConnectorServiceAccountKey() {
            return this.connectorServiceAccountKey;
        }

        public GetManagedAgentResponseBodyDataHarnessConfiguration setConnectorServiceAccountName(String connectorServiceAccountName) {
            this.connectorServiceAccountName = connectorServiceAccountName;
            return this;
        }
        public String getConnectorServiceAccountName() {
            return this.connectorServiceAccountName;
        }

    }

    public static class GetManagedAgentResponseBodyDataHarness extends TeaModel {
        /**
         * <p>The runtime harness configuration.</p>
         */
        @NameInMap("configuration")
        public GetManagedAgentResponseBodyDataHarnessConfiguration configuration;

        /**
         * <p>The runtime harness type.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        @NameInMap("type")
        public String type;

        public static GetManagedAgentResponseBodyDataHarness build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataHarness self = new GetManagedAgentResponseBodyDataHarness();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataHarness setConfiguration(GetManagedAgentResponseBodyDataHarnessConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }
        public GetManagedAgentResponseBodyDataHarnessConfiguration getConfiguration() {
            return this.configuration;
        }

        public GetManagedAgentResponseBodyDataHarness setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetManagedAgentResponseBodyDataModelQuota extends TeaModel {
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
         * <p>The quota statistical period. Valid values:</p>
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

        public static GetManagedAgentResponseBodyDataModelQuota build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataModelQuota self = new GetManagedAgentResponseBodyDataModelQuota();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataModelQuota setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetManagedAgentResponseBodyDataModelQuota setLimitType(String limitType) {
            this.limitType = limitType;
            return this;
        }
        public String getLimitType() {
            return this.limitType;
        }

        public GetManagedAgentResponseBodyDataModelQuota setOverLimit(Boolean overLimit) {
            this.overLimit = overLimit;
            return this;
        }
        public Boolean getOverLimit() {
            return this.overLimit;
        }

        public GetManagedAgentResponseBodyDataModelQuota setPeriodType(String periodType) {
            this.periodType = periodType;
            return this;
        }
        public String getPeriodType() {
            return this.periodType;
        }

        public GetManagedAgentResponseBodyDataModelQuota setRuleStatus(String ruleStatus) {
            this.ruleStatus = ruleStatus;
            return this;
        }
        public String getRuleStatus() {
            return this.ruleStatus;
        }

        public GetManagedAgentResponseBodyDataModelQuota setUsageLimit(Long usageLimit) {
            this.usageLimit = usageLimit;
            return this;
        }
        public Long getUsageLimit() {
            return this.usageLimit;
        }

        public GetManagedAgentResponseBodyDataModelQuota setUsedAmount(Long usedAmount) {
            this.usedAmount = usedAmount;
            return this;
        }
        public Long getUsedAmount() {
            return this.usedAmount;
        }

    }

    public static class GetManagedAgentResponseBodyDataModel extends TeaModel {
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
        public GetManagedAgentResponseBodyDataModelQuota quota;

        public static GetManagedAgentResponseBodyDataModel build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataModel self = new GetManagedAgentResponseBodyDataModel();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataModel setModelConnectionId(String modelConnectionId) {
            this.modelConnectionId = modelConnectionId;
            return this;
        }
        public String getModelConnectionId() {
            return this.modelConnectionId;
        }

        public GetManagedAgentResponseBodyDataModel setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetManagedAgentResponseBodyDataModel setQuota(GetManagedAgentResponseBodyDataModelQuota quota) {
            this.quota = quota;
            return this;
        }
        public GetManagedAgentResponseBodyDataModelQuota getQuota() {
            return this.quota;
        }

    }

    public static class GetManagedAgentResponseBodyDataNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether public network access is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetManagedAgentResponseBodyDataNetworkAccessInternet build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataNetworkAccessInternet self = new GetManagedAgentResponseBodyDataNetworkAccessInternet();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataNetworkAccessInternet setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetManagedAgentResponseBodyDataNetworkAccessVpc extends TeaModel {
        /**
         * <p>Specifies whether VPC access is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        public static GetManagedAgentResponseBodyDataNetworkAccessVpc build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataNetworkAccessVpc self = new GetManagedAgentResponseBodyDataNetworkAccessVpc();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataNetworkAccessVpc setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

    }

    public static class GetManagedAgentResponseBodyDataNetwork extends TeaModel {
        /**
         * <p>The public network access configuration.</p>
         */
        @NameInMap("accessInternet")
        public GetManagedAgentResponseBodyDataNetworkAccessInternet accessInternet;

        /**
         * <p>The VPC access configuration.</p>
         */
        @NameInMap("accessVpc")
        public GetManagedAgentResponseBodyDataNetworkAccessVpc accessVpc;

        public static GetManagedAgentResponseBodyDataNetwork build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataNetwork self = new GetManagedAgentResponseBodyDataNetwork();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataNetwork setAccessInternet(GetManagedAgentResponseBodyDataNetworkAccessInternet accessInternet) {
            this.accessInternet = accessInternet;
            return this;
        }
        public GetManagedAgentResponseBodyDataNetworkAccessInternet getAccessInternet() {
            return this.accessInternet;
        }

        public GetManagedAgentResponseBodyDataNetwork setAccessVpc(GetManagedAgentResponseBodyDataNetworkAccessVpc accessVpc) {
            this.accessVpc = accessVpc;
            return this;
        }
        public GetManagedAgentResponseBodyDataNetworkAccessVpc getAccessVpc() {
            return this.accessVpc;
        }

    }

    public static class GetManagedAgentResponseBodyDataOssMounts extends TeaModel {
        /**
         * <p>The OSS bucket name. This field is required for each mount item as validated by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-001</p>
         */
        @NameInMap("bucketName")
        public String bucketName;

        /**
         * <p>The absolute mount path inside the container. This field is validated as required by the backend for each mount entry.</p>
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
         * <p>Specifies whether to mount as read-only. Default value: false.</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        public static GetManagedAgentResponseBodyDataOssMounts build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataOssMounts self = new GetManagedAgentResponseBodyDataOssMounts();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataOssMounts setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public GetManagedAgentResponseBodyDataOssMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public GetManagedAgentResponseBodyDataOssMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public GetManagedAgentResponseBodyDataOssMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

    public static class GetManagedAgentResponseBodyDataRuntimeCompute extends TeaModel {
        /**
         * <p>The compute specification.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        @NameInMap("computeClass")
        public String computeClass;

        public static GetManagedAgentResponseBodyDataRuntimeCompute build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataRuntimeCompute self = new GetManagedAgentResponseBodyDataRuntimeCompute();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataRuntimeCompute setComputeClass(String computeClass) {
            this.computeClass = computeClass;
            return this;
        }
        public String getComputeClass() {
            return this.computeClass;
        }

    }

    public static class GetManagedAgentResponseBodyDataRuntimeHpa extends TeaModel {
        /**
         * <p>Specifies whether to enable auto scaling. This field is validated as required by the backend when hpa is present.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of active sessions per sandbox. This field is validated as required by the backend when hpa is present.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The maximum number of sandboxes. This field is required when HPA is enabled and must be no less than the minimum value.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of sandboxes. This field is required when HPA is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The time-to-live in seconds for a session after inactivity. This field is validated as required by the backend when hpa is present.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("sessionTtlSeconds")
        public Integer sessionTtlSeconds;

        public static GetManagedAgentResponseBodyDataRuntimeHpa build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataRuntimeHpa self = new GetManagedAgentResponseBodyDataRuntimeHpa();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataRuntimeHpa setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public GetManagedAgentResponseBodyDataRuntimeHpa setMaxConcurrentSessionsPerSandbox(Integer maxConcurrentSessionsPerSandbox) {
            this.maxConcurrentSessionsPerSandbox = maxConcurrentSessionsPerSandbox;
            return this;
        }
        public Integer getMaxConcurrentSessionsPerSandbox() {
            return this.maxConcurrentSessionsPerSandbox;
        }

        public GetManagedAgentResponseBodyDataRuntimeHpa setMaxSandboxCount(Integer maxSandboxCount) {
            this.maxSandboxCount = maxSandboxCount;
            return this;
        }
        public Integer getMaxSandboxCount() {
            return this.maxSandboxCount;
        }

        public GetManagedAgentResponseBodyDataRuntimeHpa setMinSandboxCount(Integer minSandboxCount) {
            this.minSandboxCount = minSandboxCount;
            return this;
        }
        public Integer getMinSandboxCount() {
            return this.minSandboxCount;
        }

        public GetManagedAgentResponseBodyDataRuntimeHpa setSessionTtlSeconds(Integer sessionTtlSeconds) {
            this.sessionTtlSeconds = sessionTtlSeconds;
            return this;
        }
        public Integer getSessionTtlSeconds() {
            return this.sessionTtlSeconds;
        }

    }

    public static class GetManagedAgentResponseBodyDataRuntimeSessionPolicy extends TeaModel {
        /**
         * <p>The HTTP header name used for session affinity. This field takes effect when sessionPolicy.type is set to ISOLATED_HEADER_FIELD.</p>
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

        public static GetManagedAgentResponseBodyDataRuntimeSessionPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataRuntimeSessionPolicy self = new GetManagedAgentResponseBodyDataRuntimeSessionPolicy();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataRuntimeSessionPolicy setHeaderName(String headerName) {
            this.headerName = headerName;
            return this;
        }
        public String getHeaderName() {
            return this.headerName;
        }

        public GetManagedAgentResponseBodyDataRuntimeSessionPolicy setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetManagedAgentResponseBodyDataRuntime extends TeaModel {
        /**
         * <p>The compute configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("compute")
        public GetManagedAgentResponseBodyDataRuntimeCompute compute;

        /**
         * <p>The sandbox auto scaling and session configuration.</p>
         */
        @NameInMap("hpa")
        public GetManagedAgentResponseBodyDataRuntimeHpa hpa;

        /**
         * <p>The session policy configuration.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("sessionPolicy")
        public GetManagedAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy;

        public static GetManagedAgentResponseBodyDataRuntime build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataRuntime self = new GetManagedAgentResponseBodyDataRuntime();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataRuntime setCompute(GetManagedAgentResponseBodyDataRuntimeCompute compute) {
            this.compute = compute;
            return this;
        }
        public GetManagedAgentResponseBodyDataRuntimeCompute getCompute() {
            return this.compute;
        }

        public GetManagedAgentResponseBodyDataRuntime setHpa(GetManagedAgentResponseBodyDataRuntimeHpa hpa) {
            this.hpa = hpa;
            return this;
        }
        public GetManagedAgentResponseBodyDataRuntimeHpa getHpa() {
            return this.hpa;
        }

        public GetManagedAgentResponseBodyDataRuntime setSessionPolicy(GetManagedAgentResponseBodyDataRuntimeSessionPolicy sessionPolicy) {
            this.sessionPolicy = sessionPolicy;
            return this;
        }
        public GetManagedAgentResponseBodyDataRuntimeSessionPolicy getSessionPolicy() {
            return this.sessionPolicy;
        }

    }

    public static class GetManagedAgentResponseBodyDataSkillsVersionSelector extends TeaModel {
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
         * <p>The selector value. When the type is LABEL, this is the label name (such as latest). When the type is VERSION, this is the specific version number.</p>
         * 
         * <strong>example:</strong>
         * <p>latest</p>
         */
        @NameInMap("value")
        public String value;

        public static GetManagedAgentResponseBodyDataSkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataSkillsVersionSelector self = new GetManagedAgentResponseBodyDataSkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataSkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetManagedAgentResponseBodyDataSkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetManagedAgentResponseBodyDataSkills extends TeaModel {
        /**
         * <p>The version currently in effect at runtime. This field is read-only.</p>
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
         * <li>REFERENCE: references the AI Registry.</li>
         * <li>STATIC: statically provided with the package.</li>
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
        public GetManagedAgentResponseBodyDataSkillsVersionSelector versionSelector;

        public static GetManagedAgentResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataSkills self = new GetManagedAgentResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataSkills setAppliedVersion(String appliedVersion) {
            this.appliedVersion = appliedVersion;
            return this;
        }
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        public GetManagedAgentResponseBodyDataSkills setFromTemplate(Boolean fromTemplate) {
            this.fromTemplate = fromTemplate;
            return this;
        }
        public Boolean getFromTemplate() {
            return this.fromTemplate;
        }

        public GetManagedAgentResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataSkills setResolvedVersion(String resolvedVersion) {
            this.resolvedVersion = resolvedVersion;
            return this;
        }
        public String getResolvedVersion() {
            return this.resolvedVersion;
        }

        public GetManagedAgentResponseBodyDataSkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetManagedAgentResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public GetManagedAgentResponseBodyDataSkills setVersionSelector(GetManagedAgentResponseBodyDataSkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public GetManagedAgentResponseBodyDataSkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class GetManagedAgentResponseBodyDataSubAgentsSkills extends TeaModel {
        /**
         * <p>The skill name used by the child agent. Declared as optional for compatibility, but validated as required by the backend for each entry.</p>
         * 
         * <strong>example:</strong>
         * <p>web-search</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The optional version number. If omitted, null, or blank, the latest version is resolved.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static GetManagedAgentResponseBodyDataSubAgentsSkills build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataSubAgentsSkills self = new GetManagedAgentResponseBodyDataSubAgentsSkills();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataSubAgentsSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataSubAgentsSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetManagedAgentResponseBodyDataSubAgents extends TeaModel {
        /**
         * <p>The child agent instruction.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Review the code</p>
         */
        @NameInMap("instruction")
        public String instruction;

        /**
         * <p>The child agent name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reviewer-agent</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The skills and actual versions used by the child agent. The version field is not returned when the template package does not contain version information.</p>
         */
        @NameInMap("skills")
        public java.util.List<GetManagedAgentResponseBodyDataSubAgentsSkills> skills;

        public static GetManagedAgentResponseBodyDataSubAgents build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataSubAgents self = new GetManagedAgentResponseBodyDataSubAgents();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataSubAgents setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public GetManagedAgentResponseBodyDataSubAgents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataSubAgents setSkills(java.util.List<GetManagedAgentResponseBodyDataSubAgentsSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataSubAgentsSkills> getSkills() {
            return this.skills;
        }

    }

    public static class GetManagedAgentResponseBodyDataTemplateAiRegistry extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataTemplateAiRegistry build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataTemplateAiRegistry self = new GetManagedAgentResponseBodyDataTemplateAiRegistry();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataTemplateAiRegistry setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataTemplateAiRegistry setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetManagedAgentResponseBodyDataTemplate extends TeaModel {
        /**
         * <p>The AI registry template configuration.</p>
         */
        @NameInMap("aiRegistry")
        public GetManagedAgentResponseBodyDataTemplateAiRegistry aiRegistry;

        public static GetManagedAgentResponseBodyDataTemplate build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataTemplate self = new GetManagedAgentResponseBodyDataTemplate();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataTemplate setAiRegistry(GetManagedAgentResponseBodyDataTemplateAiRegistry aiRegistry) {
            this.aiRegistry = aiRegistry;
            return this;
        }
        public GetManagedAgentResponseBodyDataTemplateAiRegistry getAiRegistry() {
            return this.aiRegistry;
        }

    }

    public static class GetManagedAgentResponseBodyDataTools extends TeaModel {
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

        public static GetManagedAgentResponseBodyDataTools build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyDataTools self = new GetManagedAgentResponseBodyDataTools();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyDataTools setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyDataTools setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetManagedAgentResponseBodyData extends TeaModel {
        /**
         * <p>The managed agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The list of additional AgenticFS mounts. The total number of AgenticFS mounts and OSS mounts cannot exceed 10.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<GetManagedAgentResponseBodyDataAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The skills that are explicitly added or overridden by the user. This field does not include skills inherited from the template. The resource model reads this field to preserve update semantics. The skills field in the request is still used for create and update operations.</p>
         */
        @NameInMap("configuredSkills")
        public java.util.List<GetManagedAgentResponseBodyDataConfiguredSkills> configuredSkills;

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
        public GetManagedAgentResponseBodyDataEnvironment environment;

        /**
         * <p>The agent runtime harness.</p>
         */
        @NameInMap("harness")
        public GetManagedAgentResponseBodyDataHarness harness;

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
         * <p>The status of the latest version.</p>
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
        public GetManagedAgentResponseBodyDataModel model;

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
        public GetManagedAgentResponseBodyDataNetwork network;

        /**
         * <p>The list of OSS mounts. A maximum of 10 items are allowed.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<GetManagedAgentResponseBodyDataOssMounts> ossMounts;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("regionId")
        public String regionId;

        /**
         * <p>The runtime configuration.</p>
         */
        @NameInMap("runtime")
        public GetManagedAgentResponseBodyDataRuntime runtime;

        /**
         * <p>The instance counts of the managed agent grouped by sandbox phase. Current keys: PENDING (creating or initializing), RUNNING (running), HIBERNATING (hibernating), HIBERNATED (hibernated), RESUMING (resuming), TERMINATING (terminating), FAILED (runtime failure). Only phases that actually occur are returned. Missing keys should be treated as 0. This field is a dynamic map and new keys may be added in the future. Use FAILED &gt; 0 to determine whether abnormal instances exist.</p>
         */
        @NameInMap("sandboxPhaseCounts")
        public java.util.Map<String, Long> sandboxPhaseCounts;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<GetManagedAgentResponseBodyDataSkills> skills;

        /**
         * <p>The status of the managed agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The list of child agent configurations.</p>
         */
        @NameInMap("subAgents")
        public java.util.List<GetManagedAgentResponseBodyDataSubAgents> subAgents;

        /**
         * <p>The template configuration.</p>
         */
        @NameInMap("template")
        public GetManagedAgentResponseBodyDataTemplate template;

        /**
         * <p>The list of tool configurations.</p>
         */
        @NameInMap("tools")
        public java.util.List<GetManagedAgentResponseBodyDataTools> tools;

        /**
         * <p>The time when the resource was last updated, in RFC 3339 format.</p>
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

        public static GetManagedAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetManagedAgentResponseBodyData self = new GetManagedAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetManagedAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetManagedAgentResponseBodyData setAgenticFsMounts(java.util.List<GetManagedAgentResponseBodyDataAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public GetManagedAgentResponseBodyData setConfiguredSkills(java.util.List<GetManagedAgentResponseBodyDataConfiguredSkills> configuredSkills) {
            this.configuredSkills = configuredSkills;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataConfiguredSkills> getConfiguredSkills() {
            return this.configuredSkills;
        }

        public GetManagedAgentResponseBodyData setCreateMode(String createMode) {
            this.createMode = createMode;
            return this;
        }
        public String getCreateMode() {
            return this.createMode;
        }

        public GetManagedAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetManagedAgentResponseBodyData setDeployType(String deployType) {
            this.deployType = deployType;
            return this;
        }
        public String getDeployType() {
            return this.deployType;
        }

        public GetManagedAgentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetManagedAgentResponseBodyData setEnvironment(GetManagedAgentResponseBodyDataEnvironment environment) {
            this.environment = environment;
            return this;
        }
        public GetManagedAgentResponseBodyDataEnvironment getEnvironment() {
            return this.environment;
        }

        public GetManagedAgentResponseBodyData setHarness(GetManagedAgentResponseBodyDataHarness harness) {
            this.harness = harness;
            return this;
        }
        public GetManagedAgentResponseBodyDataHarness getHarness() {
            return this.harness;
        }

        public GetManagedAgentResponseBodyData setInstruction(String instruction) {
            this.instruction = instruction;
            return this;
        }
        public String getInstruction() {
            return this.instruction;
        }

        public GetManagedAgentResponseBodyData setLatestSpecVersion(Long latestSpecVersion) {
            this.latestSpecVersion = latestSpecVersion;
            return this;
        }
        public Long getLatestSpecVersion() {
            return this.latestSpecVersion;
        }

        public GetManagedAgentResponseBodyData setLatestVersionStatus(String latestVersionStatus) {
            this.latestVersionStatus = latestVersionStatus;
            return this;
        }
        public String getLatestVersionStatus() {
            return this.latestVersionStatus;
        }

        public GetManagedAgentResponseBodyData setModel(GetManagedAgentResponseBodyDataModel model) {
            this.model = model;
            return this;
        }
        public GetManagedAgentResponseBodyDataModel getModel() {
            return this.model;
        }

        public GetManagedAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetManagedAgentResponseBodyData setNetwork(GetManagedAgentResponseBodyDataNetwork network) {
            this.network = network;
            return this;
        }
        public GetManagedAgentResponseBodyDataNetwork getNetwork() {
            return this.network;
        }

        public GetManagedAgentResponseBodyData setOssMounts(java.util.List<GetManagedAgentResponseBodyDataOssMounts> ossMounts) {
            this.ossMounts = ossMounts;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataOssMounts> getOssMounts() {
            return this.ossMounts;
        }

        public GetManagedAgentResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetManagedAgentResponseBodyData setRuntime(GetManagedAgentResponseBodyDataRuntime runtime) {
            this.runtime = runtime;
            return this;
        }
        public GetManagedAgentResponseBodyDataRuntime getRuntime() {
            return this.runtime;
        }

        public GetManagedAgentResponseBodyData setSandboxPhaseCounts(java.util.Map<String, Long> sandboxPhaseCounts) {
            this.sandboxPhaseCounts = sandboxPhaseCounts;
            return this;
        }
        public java.util.Map<String, Long> getSandboxPhaseCounts() {
            return this.sandboxPhaseCounts;
        }

        public GetManagedAgentResponseBodyData setSkills(java.util.List<GetManagedAgentResponseBodyDataSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataSkills> getSkills() {
            return this.skills;
        }

        public GetManagedAgentResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetManagedAgentResponseBodyData setSubAgents(java.util.List<GetManagedAgentResponseBodyDataSubAgents> subAgents) {
            this.subAgents = subAgents;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataSubAgents> getSubAgents() {
            return this.subAgents;
        }

        public GetManagedAgentResponseBodyData setTemplate(GetManagedAgentResponseBodyDataTemplate template) {
            this.template = template;
            return this;
        }
        public GetManagedAgentResponseBodyDataTemplate getTemplate() {
            return this.template;
        }

        public GetManagedAgentResponseBodyData setTools(java.util.List<GetManagedAgentResponseBodyDataTools> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<GetManagedAgentResponseBodyDataTools> getTools() {
            return this.tools;
        }

        public GetManagedAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        public GetManagedAgentResponseBodyData setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
