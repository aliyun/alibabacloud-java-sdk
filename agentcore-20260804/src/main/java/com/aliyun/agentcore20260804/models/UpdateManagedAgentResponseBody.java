// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class UpdateManagedAgentResponseBody extends TeaModel {
    /**
     * <p>The business status code. The value is SUCCESS if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The details of the managed Harness agent.</p>
     */
    @NameInMap("data")
    public UpdateManagedAgentResponseBodyData data;

    /**
     * <p>The HTTP status code. The value is 200 if the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request processing result message.</p>
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
     * <p>Indicates whether the request is successful.</p>
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

    public static class UpdateManagedAgentResponseBodyDataAgenticFsMounts extends TeaModel {
        /**
         * <p>The absolute mount path in the container, such as /data/train. Mount targets cannot be duplicated or form parent-child overwrites, and must avoid platform reserved directories.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/agenticfs/data</p>
         */
        @NameInMap("mountPath")
        public String mountPath;

        /**
         * <p>The existing non-empty relative directory under the AccessPoint. This field is required and validated by the backend for each mount item. Root directories, absolute paths, and parent directory segments are not allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace/data</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether the mount is read-only. If omitted, the default value is false. This is not a RAM role read-only policy.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("readOnly")
        public Boolean readOnly;

        /**
         * <p>The AccessPoint domain name. This field is required and validated by the backend for each mount item. It does not include a protocol, port, or path. Use the DomainName from the NAS ListAccessPoints response.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        @NameInMap("server")
        public String server;

        public static UpdateManagedAgentResponseBodyDataAgenticFsMounts build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataAgenticFsMounts self = new UpdateManagedAgentResponseBodyDataAgenticFsMounts();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataAgenticFsMounts setMountPath(String mountPath) {
            this.mountPath = mountPath;
            return this;
        }
        public String getMountPath() {
            return this.mountPath;
        }

        public UpdateManagedAgentResponseBodyDataAgenticFsMounts setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public UpdateManagedAgentResponseBodyDataAgenticFsMounts setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

        public UpdateManagedAgentResponseBodyDataAgenticFsMounts setServer(String server) {
            this.server = server;
            return this;
        }
        public String getServer() {
            return this.server;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector extends TeaModel {
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

        public static UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector self = new UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataConfiguredSkills extends TeaModel {
        /**
         * <p>The name of the skill in the Workspace AI Registry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>web-search</p>
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
         * <p>The legacy compatibility field. Use sourceType and versionSelector for new requests.</p>
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
        public UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector versionSelector;

        public static UpdateManagedAgentResponseBodyDataConfiguredSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataConfiguredSkills self = new UpdateManagedAgentResponseBodyDataConfiguredSkills();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataConfiguredSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentResponseBodyDataConfiguredSkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateManagedAgentResponseBodyDataConfiguredSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateManagedAgentResponseBodyDataConfiguredSkills setVersionSelector(UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataConfiguredSkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

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
         * <p>The environment variable name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>API_KEY</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The environment variable value.</p>
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
         * <p>The ID of the connector account key record bound to qodercli. This is not the original service account key.</p>
         * 
         * <strong>example:</strong>
         * <p>key-xxxx</p>
         */
        @NameInMap("connectorServiceAccountKey")
        public String connectorServiceAccountKey;

        /**
         * <p>The name of the connector account bound to qodercli.</p>
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
         * <p>The runtime framework configuration.</p>
         */
        @NameInMap("configuration")
        public UpdateManagedAgentResponseBodyDataHarnessConfiguration configuration;

        /**
         * <p>Returned only in query responses. The server calculates this based on the complete instance distribution, which is not affected by pagination and filtering of the instance list. The value is empty if the image tag is missing, pagination is incomplete, or it cannot be confirmed. An empty value does not equal 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("outdatedInstanceCount")
        public Long outdatedInstanceCount;

        /**
         * <p>The type of the runtime framework.</p>
         * 
         * <strong>example:</strong>
         * <p>qodercli</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>Returned only in query responses. Currently returns the tag of the pool target image. The value is empty if it cannot be parsed. Do not use the agent configuration version as a substitute.</p>
         * 
         * <strong>example:</strong>
         * <p>202611031754</p>
         */
        @NameInMap("version")
        public String version;

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

        public UpdateManagedAgentResponseBodyDataHarness setOutdatedInstanceCount(Long outdatedInstanceCount) {
            this.outdatedInstanceCount = outdatedInstanceCount;
            return this;
        }
        public Long getOutdatedInstanceCount() {
            return this.outdatedInstanceCount;
        }

        public UpdateManagedAgentResponseBodyDataHarness setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateManagedAgentResponseBodyDataHarness setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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
         * <p>Indicates whether the quota is exceeded in the current cycle. This field is read-only and returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("overLimit")
        public Boolean overLimit;

        /**
         * <p>The quota statistical period. A value of day indicates daily, and a value of month indicates monthly.</p>
         * 
         * <strong>example:</strong>
         * <p>day</p>
         */
        @NameInMap("periodType")
        public String periodType;

        /**
         * <p>The status of the gateway quota rule. This field is read-only and returned by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("ruleStatus")
        public String ruleStatus;

        /**
         * <p>The maximum number of tokens allowed to be consumed in a single cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000</p>
         */
        @NameInMap("usageLimit")
        public Long usageLimit;

        /**
         * <p>The number of tokens consumed in the current cycle. This field is read-only and returned by the backend.</p>
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
         * <p>The name of the upstream model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        @NameInMap("modelName")
        public String modelName;

        /**
         * <p>The model token quota configuration and quota usage status for the current cycle. The value is empty if no quota is configured.</p>
         */
        @NameInMap("quota")
        public UpdateManagedAgentResponseBodyDataModelQuota quota;

        /**
         * <p>The thinking level. If not configured, the value defaults to default. Empty strings, null values, or omitted fields are processed according to the default behavior of the model and Harness. Valid values: off, low, medium, high, xhigh, and max. If this parameter is not passed or is null during creation, default is used. When updating the model configuration, if the thinking level is not passed or is null, it reverts to default. Except for off, which is converted to none, the value is passed to the runtime framework as-is without validating model support or automatically downgrading. If the model does not support the specified level, adjust the level accordingly.</p>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("thinkingLevel")
        public String thinkingLevel;

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

        public UpdateManagedAgentResponseBodyDataModel setThinkingLevel(String thinkingLevel) {
            this.thinkingLevel = thinkingLevel;
            return this;
        }
        public String getThinkingLevel() {
            return this.thinkingLevel;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataNetworkAccessInternet extends TeaModel {
        /**
         * <p>Specifies whether to allow Internet access.</p>
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
         * <p>The OSS bucket name. This parameter is required and validated by the backend for each mount item.</p>
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
         * <p>The non-empty relative directory prefix within the configured bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>datasets</p>
         */
        @NameInMap("path")
        public String path;

        /**
         * <p>Specifies whether to mount the directory in read-only mode. Default value: false.</p>
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

    public static class UpdateManagedAgentResponseBodyDataPromptVariables extends TeaModel {
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

        public static UpdateManagedAgentResponseBodyDataPromptVariables build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataPromptVariables self = new UpdateManagedAgentResponseBodyDataPromptVariables();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataPromptVariables setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public UpdateManagedAgentResponseBodyDataPromptVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateManagedAgentResponseBodyDataPromptVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
         * <p>Indicates whether elastic scaling is enabled in the current configuration.</p>
         */
        @NameInMap("enabled")
        public Boolean enabled;

        /**
         * <p>The maximum number of concurrent sessions per instance in the current configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("maxConcurrentSessionsPerSandbox")
        public Integer maxConcurrentSessionsPerSandbox;

        /**
         * <p>The maximum number of instances in the current configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("maxSandboxCount")
        public Integer maxSandboxCount;

        /**
         * <p>The minimum number of instances in the current configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("minSandboxCount")
        public Integer minSandboxCount;

        /**
         * <p>The maximum idle time for a session in the current configuration, in seconds.</p>
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
         * <p>The automatic scaling and session configurations for the sandbox.</p>
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

    public static class UpdateManagedAgentResponseBodyDataSkillsVersionSelector extends TeaModel {
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

        public static UpdateManagedAgentResponseBodyDataSkillsVersionSelector build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataSkillsVersionSelector self = new UpdateManagedAgentResponseBodyDataSkillsVersionSelector();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataSkillsVersionSelector setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public UpdateManagedAgentResponseBodyDataSkillsVersionSelector setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataSkills extends TeaModel {
        /**
         * <p>The effective version at runtime. This field is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("appliedVersion")
        public String appliedVersion;

        /**
         * <p>Indicates whether the skill is from a fixed template. This field is read-only. Template items cannot be removed.</p>
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
         * <p>The skill source type.</p>
         * 
         * <strong>example:</strong>
         * <p>REFERENCE</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The current target version for compatibility with legacy clients. New clients use resolvedVersion and determine the effective runtime version based on appliedVersion.</p>
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
        public UpdateManagedAgentResponseBodyDataSkillsVersionSelector versionSelector;

        public static UpdateManagedAgentResponseBodyDataSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataSkills self = new UpdateManagedAgentResponseBodyDataSkills();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataSkills setAppliedVersion(String appliedVersion) {
            this.appliedVersion = appliedVersion;
            return this;
        }
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        public UpdateManagedAgentResponseBodyDataSkills setFromTemplate(Boolean fromTemplate) {
            this.fromTemplate = fromTemplate;
            return this;
        }
        public Boolean getFromTemplate() {
            return this.fromTemplate;
        }

        public UpdateManagedAgentResponseBodyDataSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentResponseBodyDataSkills setResolvedVersion(String resolvedVersion) {
            this.resolvedVersion = resolvedVersion;
            return this;
        }
        public String getResolvedVersion() {
            return this.resolvedVersion;
        }

        public UpdateManagedAgentResponseBodyDataSkills setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public UpdateManagedAgentResponseBodyDataSkills setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public UpdateManagedAgentResponseBodyDataSkills setVersionSelector(UpdateManagedAgentResponseBodyDataSkillsVersionSelector versionSelector) {
            this.versionSelector = versionSelector;
            return this;
        }
        public UpdateManagedAgentResponseBodyDataSkillsVersionSelector getVersionSelector() {
            return this.versionSelector;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataSubAgentsSkills extends TeaModel {
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

        public static UpdateManagedAgentResponseBodyDataSubAgentsSkills build(java.util.Map<String, ?> map) throws Exception {
            UpdateManagedAgentResponseBodyDataSubAgentsSkills self = new UpdateManagedAgentResponseBodyDataSubAgentsSkills();
            return TeaModel.build(map, self);
        }

        public UpdateManagedAgentResponseBodyDataSubAgentsSkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateManagedAgentResponseBodyDataSubAgentsSkills setVersion(String version) {
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

        /**
         * <p>The list of sub-agent skills.</p>
         */
        @NameInMap("skills")
        public java.util.List<UpdateManagedAgentResponseBodyDataSubAgentsSkills> skills;

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

        public UpdateManagedAgentResponseBodyDataSubAgents setSkills(java.util.List<UpdateManagedAgentResponseBodyDataSubAgentsSkills> skills) {
            this.skills = skills;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataSubAgentsSkills> getSkills() {
            return this.skills;
        }

    }

    public static class UpdateManagedAgentResponseBodyDataTemplateAiRegistry extends TeaModel {
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
         * <p>The AI Registry template configuration.</p>
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
         * <p>The ID of the managed Harness agent.</p>
         * 
         * <strong>example:</strong>
         * <p>agent-1</p>
         */
        @NameInMap("agentId")
        public String agentId;

        /**
         * <p>The NAS storage mount configuration. Currently, only the AgenticFS type is supported, which is used to mount file directories in the access point to the agent runtime instance. The total number of NAS mounts and ossMounts cannot exceed 10.</p>
         */
        @NameInMap("agenticFsMounts")
        public java.util.List<UpdateManagedAgentResponseBodyDataAgenticFsMounts> agenticFsMounts;

        /**
         * <p>The explicitly configured skills.</p>
         */
        @NameInMap("configuredSkills")
        public java.util.List<UpdateManagedAgentResponseBodyDataConfiguredSkills> configuredSkills;

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
         * <p>The description of the managed Harness agent.</p>
         * 
         * <strong>example:</strong>
         * <p>Agent for code review</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The environment configuration information.</p>
         */
        @NameInMap("environment")
        public UpdateManagedAgentResponseBodyDataEnvironment environment;

        /**
         * <p>The agent runtime framework.</p>
         */
        @NameInMap("harness")
        public UpdateManagedAgentResponseBodyDataHarness harness;

        /**
         * <p>The agent instructions used to guide the behavior of the agent.</p>
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
         * <p>The model configuration information.</p>
         */
        @NameInMap("model")
        public UpdateManagedAgentResponseBodyDataModel model;

        /**
         * <p>The name of the managed Harness agent.</p>
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
         * <p>The list of OSS mounts. A maximum of 10 items are allowed.</p>
         */
        @NameInMap("ossMounts")
        public java.util.List<UpdateManagedAgentResponseBodyDataOssMounts> ossMounts;

        /**
         * <p>The prompt variable declarations.</p>
         */
        @NameInMap("promptVariables")
        public java.util.List<UpdateManagedAgentResponseBodyDataPromptVariables> promptVariables;

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
         * <p>The number of managed Harness agent instances by sandbox phase. Current keys: PENDING (creating or initializing), RUNNING (running), HIBERNATING (hibernating), HIBERNATED (hibernated), RESUMING (resuming), TERMINATING (terminating), and FAILED (failed at runtime). Only phases that actually occur are returned. Missing keys are treated as 0. This field is a dynamic map and new keys may be added in the future. The frontend can use FAILED &gt; 0 to determine whether abnormal instances exist.</p>
         */
        @NameInMap("sandboxPhaseCounts")
        public java.util.Map<String, Long> sandboxPhaseCounts;

        /**
         * <p>The list of skill configurations.</p>
         */
        @NameInMap("skills")
        public java.util.List<UpdateManagedAgentResponseBodyDataSkills> skills;

        /**
         * <p>The status of the managed Harness agent.</p>
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
         * <p>The template configuration information.</p>
         */
        @NameInMap("template")
        public UpdateManagedAgentResponseBodyDataTemplate template;

        /**
         * <p>The tool configuration list.</p>
         */
        @NameInMap("tools")
        public java.util.List<UpdateManagedAgentResponseBodyDataTools> tools;

        /**
         * <p>The update time in RFC 3339 format.</p>
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

        public UpdateManagedAgentResponseBodyData setAccessMode(String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public String getAccessMode() {
            return this.accessMode;
        }

        public UpdateManagedAgentResponseBodyData setAccessScope(String accessScope) {
            this.accessScope = accessScope;
            return this;
        }
        public String getAccessScope() {
            return this.accessScope;
        }

        public UpdateManagedAgentResponseBodyData setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public UpdateManagedAgentResponseBodyData setAgenticFsMounts(java.util.List<UpdateManagedAgentResponseBodyDataAgenticFsMounts> agenticFsMounts) {
            this.agenticFsMounts = agenticFsMounts;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataAgenticFsMounts> getAgenticFsMounts() {
            return this.agenticFsMounts;
        }

        public UpdateManagedAgentResponseBodyData setConfiguredSkills(java.util.List<UpdateManagedAgentResponseBodyDataConfiguredSkills> configuredSkills) {
            this.configuredSkills = configuredSkills;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataConfiguredSkills> getConfiguredSkills() {
            return this.configuredSkills;
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

        public UpdateManagedAgentResponseBodyData setPromptVariables(java.util.List<UpdateManagedAgentResponseBodyDataPromptVariables> promptVariables) {
            this.promptVariables = promptVariables;
            return this;
        }
        public java.util.List<UpdateManagedAgentResponseBodyDataPromptVariables> getPromptVariables() {
            return this.promptVariables;
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
