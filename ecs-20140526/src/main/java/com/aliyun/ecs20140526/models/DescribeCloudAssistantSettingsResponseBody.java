// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantSettingsResponseBody extends TeaModel {
    /**
     * <p>云助手Agent升级配置。</p>
     */
    @NameInMap("AgentUpgradeConfig")
    public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig agentUpgradeConfig;

    /**
     * <p>The configurations for delivering items to Object Storage Service (OSS).</p>
     */
    @NameInMap("OssDeliveryConfigs")
    public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs ossDeliveryConfigs;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The configurations for delivering items to Simple Log Service.</p>
     */
    @NameInMap("SlsDeliveryConfigs")
    public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs slsDeliveryConfigs;

    public static DescribeCloudAssistantSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantSettingsResponseBody self = new DescribeCloudAssistantSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantSettingsResponseBody setAgentUpgradeConfig(DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig agentUpgradeConfig) {
        this.agentUpgradeConfig = agentUpgradeConfig;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig getAgentUpgradeConfig() {
        return this.agentUpgradeConfig;
    }

    public DescribeCloudAssistantSettingsResponseBody setOssDeliveryConfigs(DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs ossDeliveryConfigs) {
        this.ossDeliveryConfigs = ossDeliveryConfigs;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs getOssDeliveryConfigs() {
        return this.ossDeliveryConfigs;
    }

    public DescribeCloudAssistantSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudAssistantSettingsResponseBody setSlsDeliveryConfigs(DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs slsDeliveryConfigs) {
        this.slsDeliveryConfigs = slsDeliveryConfigs;
        return this;
    }
    public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs getSlsDeliveryConfigs() {
        return this.slsDeliveryConfigs;
    }

    public static class DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows extends TeaModel {
        @NameInMap("AllowedUpgradeWindow")
        public java.util.List<String> allowedUpgradeWindow;

        public static DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows self = new DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows setAllowedUpgradeWindow(java.util.List<String> allowedUpgradeWindow) {
            this.allowedUpgradeWindow = allowedUpgradeWindow;
            return this;
        }
        public java.util.List<String> getAllowedUpgradeWindow() {
            return this.allowedUpgradeWindow;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig extends TeaModel {
        /**
         * <p>允许升级的时间段列表。</p>
         */
        @NameInMap("AllowedUpgradeWindows")
        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows allowedUpgradeWindows;

        /**
         * <p>是否开启自定义Agent升级配置。如查询结果为false或空，默认保持每30分钟尝试升级一次。</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>允许升级时间段的时区。</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig self = new DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig setAllowedUpgradeWindows(DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows allowedUpgradeWindows) {
            this.allowedUpgradeWindows = allowedUpgradeWindows;
            return this;
        }
        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfigAllowedUpgradeWindows getAllowedUpgradeWindows() {
            return this.allowedUpgradeWindows;
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeCloudAssistantSettingsResponseBodyAgentUpgradeConfig setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The type of items to be delivered. Valid values:</p>
         * <br>
         * <p>*   SessionManager: session records</p>
         * <p>*   Invocation: task execution records</p>
         */
        @NameInMap("DeliveryType")
        public String deliveryType;

        /**
         * <p>Indicates whether to deliver the specified items to OSS.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>OSS encryption algorithm. Valid values:</p>
         * <br>
         * <p>*   AES256</p>
         * <p>*   SM4</p>
         */
        @NameInMap("EncryptionAlgorithm")
        public String encryptionAlgorithm;

        /**
         * <p>The ID of the customer master key (CMK) when the encryption method is KMS.</p>
         */
        @NameInMap("EncryptionKeyId")
        public String encryptionKeyId;

        /**
         * <p>OSS encryption method. Valid values:</p>
         * <br>
         * <p>*   Inherit: the encryption method used by the specified bucket.</p>
         * <p>*   OssManaged: server-side encryption by using OSS-managed keys (SSE-OSS).</p>
         * <p>*   KMS: server-side encryption with Key Management Service (SSE-KMS).</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The prefix of the OSS bucket directory.</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        public static DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig self = new DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public String getEncryptionAlgorithm() {
            return this.encryptionAlgorithm;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setEncryptionKeyId(String encryptionKeyId) {
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }
        public String getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs extends TeaModel {
        @NameInMap("OssDeliveryConfig")
        public java.util.List<DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig> ossDeliveryConfig;

        public static DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs self = new DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigs setOssDeliveryConfig(java.util.List<DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig> ossDeliveryConfig) {
            this.ossDeliveryConfig = ossDeliveryConfig;
            return this;
        }
        public java.util.List<DescribeCloudAssistantSettingsResponseBodyOssDeliveryConfigsOssDeliveryConfig> getOssDeliveryConfig() {
            return this.ossDeliveryConfig;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig extends TeaModel {
        /**
         * <p>The type of items to be delivered. Valid values:</p>
         * <br>
         * <p>*   SessionManager: session records</p>
         * <p>*   Invocation: task execution records</p>
         */
        @NameInMap("DeliveryType")
        public String deliveryType;

        /**
         * <p>Indicates whether to deliver the specified items to Simple Log Service.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The name of the Logstore.</p>
         */
        @NameInMap("LogstoreName")
        public String logstoreName;

        /**
         * <p>The name of the Simple Log Service project.</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig self = new DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig setDeliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }
        public String getDeliveryType() {
            return this.deliveryType;
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs extends TeaModel {
        @NameInMap("SlsDeliveryConfig")
        public java.util.List<DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig> slsDeliveryConfig;

        public static DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs self = new DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigs setSlsDeliveryConfig(java.util.List<DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig> slsDeliveryConfig) {
            this.slsDeliveryConfig = slsDeliveryConfig;
            return this;
        }
        public java.util.List<DescribeCloudAssistantSettingsResponseBodySlsDeliveryConfigsSlsDeliveryConfig> getSlsDeliveryConfig() {
            return this.slsDeliveryConfig;
        }

    }

}
