// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCloudAssistantSettingsRequest extends TeaModel {
    /**
     * <p>云助手Agent升级配置。</p>
     */
    @NameInMap("AgentUpgradeConfig")
    public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig agentUpgradeConfig;

    /**
     * <p>The configurations for delivering records to Object Storage Service (OSS).</p>
     */
    @NameInMap("OssDeliveryConfig")
    public ModifyCloudAssistantSettingsRequestOssDeliveryConfig ossDeliveryConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The Cloud Assistant feature. Valid values:</p>
     * <br>
     * <p>*   SessionManagerDelivery: the Session Record Delivery feature</p>
     * <p>*   InvocationDelivery: the Operation Content and Result Delivery feature</p>
     */
    @NameInMap("SettingType")
    public String settingType;

    /**
     * <p>The configurations for delivering records to Simple Log Service.</p>
     */
    @NameInMap("SlsDeliveryConfig")
    public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig slsDeliveryConfig;

    public static ModifyCloudAssistantSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCloudAssistantSettingsRequest self = new ModifyCloudAssistantSettingsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCloudAssistantSettingsRequest setAgentUpgradeConfig(ModifyCloudAssistantSettingsRequestAgentUpgradeConfig agentUpgradeConfig) {
        this.agentUpgradeConfig = agentUpgradeConfig;
        return this;
    }
    public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig getAgentUpgradeConfig() {
        return this.agentUpgradeConfig;
    }

    public ModifyCloudAssistantSettingsRequest setOssDeliveryConfig(ModifyCloudAssistantSettingsRequestOssDeliveryConfig ossDeliveryConfig) {
        this.ossDeliveryConfig = ossDeliveryConfig;
        return this;
    }
    public ModifyCloudAssistantSettingsRequestOssDeliveryConfig getOssDeliveryConfig() {
        return this.ossDeliveryConfig;
    }

    public ModifyCloudAssistantSettingsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyCloudAssistantSettingsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCloudAssistantSettingsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCloudAssistantSettingsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyCloudAssistantSettingsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCloudAssistantSettingsRequest setSettingType(String settingType) {
        this.settingType = settingType;
        return this;
    }
    public String getSettingType() {
        return this.settingType;
    }

    public ModifyCloudAssistantSettingsRequest setSlsDeliveryConfig(ModifyCloudAssistantSettingsRequestSlsDeliveryConfig slsDeliveryConfig) {
        this.slsDeliveryConfig = slsDeliveryConfig;
        return this;
    }
    public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig getSlsDeliveryConfig() {
        return this.slsDeliveryConfig;
    }

    public static class ModifyCloudAssistantSettingsRequestAgentUpgradeConfig extends TeaModel {
        /**
         * <p>允许升级的时间段列表，可精确到分，默认为 UTC 时区。</p>
         * <br>
         * <p>各时间段的间隔不能小于1小时。</p>
         * <br>
         * <p>格式：开始时间(HH:mm)-结束时间(HH:mm)。</p>
         * <br>
         * <p>如[</p>
         * <p>"02:00-03:00",</p>
         * <p>"05:00-06:00"</p>
         * <p>]</p>
         * <p>代表在 UTC 时区的每天2点-3点、5点-6点允许升级。</p>
         */
        @NameInMap("AllowedUpgradeWindow")
        public java.util.List<String> allowedUpgradeWindow;

        /**
         * <p>是否开启自定义Agent升级配置。如设置为false，默认保持每30分钟尝试升级一次。</p>
         * <br>
         * <p>默认值：false。</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>允许升级时间段的时区。默认为 UTC 时区。</p>
         * <p>时区支持以下两种形式：</p>
         * <p>- 时区全称： 如Asia/Shanghai（中国/上海时间）、America/Los_Angeles（美国/洛杉矶时间）等。</p>
         * <p>- 时区相对于格林威治时间的偏移量： 如GMT+8:00（东八区）、GMT-7:00（西七区）等。小时位不支持添加前导零。</p>
         */
        @NameInMap("TimeZone")
        public String timeZone;

        public static ModifyCloudAssistantSettingsRequestAgentUpgradeConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudAssistantSettingsRequestAgentUpgradeConfig self = new ModifyCloudAssistantSettingsRequestAgentUpgradeConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig setAllowedUpgradeWindow(java.util.List<String> allowedUpgradeWindow) {
            this.allowedUpgradeWindow = allowedUpgradeWindow;
            return this;
        }
        public java.util.List<String> getAllowedUpgradeWindow() {
            return this.allowedUpgradeWindow;
        }

        public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyCloudAssistantSettingsRequestAgentUpgradeConfig setTimeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public String getTimeZone() {
            return this.timeZone;
        }

    }

    public static class ModifyCloudAssistantSettingsRequestOssDeliveryConfig extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>Specifies whether to deliver records to OSS. Default value: false.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The OSS encryption algorithm. Valid values:</p>
         * <br>
         * <p>*   AES256</p>
         * <p>*   SM4</p>
         */
        @NameInMap("EncryptionAlgorithm")
        public String encryptionAlgorithm;

        /**
         * <p>The ID of the customer master key (CMK) when EncryptionType is set to KMS.</p>
         */
        @NameInMap("EncryptionKeyId")
        public String encryptionKeyId;

        /**
         * <p>The OSS encryption method. Valid values:</p>
         * <br>
         * <p>*   Inherit: the encryption method used by the specified bucket.</p>
         * <p>*   OssManaged: server-side encryption by using OSS-managed keys (SSE-OSS).</p>
         * <p>*   KMS: server-side encryption by using Key Management Service managed keys (SSE-KMS).</p>
         */
        @NameInMap("EncryptionType")
        public String encryptionType;

        /**
         * <p>The prefix of the OSS bucket directory. The prefix must meet the following requirements:</p>
         * <br>
         * <p>*   The prefix can be up to 254 characters in length.</p>
         * <p>*   The prefix cannot start with a forward slash (/) or a backslash (\\).</p>
         * <br>
         * <p>Note: If you do not need a directory prefix, specify a pair of double quotation marks ("") for this parameter to clear the directory prefix that you specified.</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        public static ModifyCloudAssistantSettingsRequestOssDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudAssistantSettingsRequestOssDeliveryConfig self = new ModifyCloudAssistantSettingsRequestOssDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = encryptionAlgorithm;
            return this;
        }
        public String getEncryptionAlgorithm() {
            return this.encryptionAlgorithm;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setEncryptionKeyId(String encryptionKeyId) {
            this.encryptionKeyId = encryptionKeyId;
            return this;
        }
        public String getEncryptionKeyId() {
            return this.encryptionKeyId;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setEncryptionType(String encryptionType) {
            this.encryptionType = encryptionType;
            return this;
        }
        public String getEncryptionType() {
            return this.encryptionType;
        }

        public ModifyCloudAssistantSettingsRequestOssDeliveryConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

    }

    public static class ModifyCloudAssistantSettingsRequestSlsDeliveryConfig extends TeaModel {
        /**
         * <p>Specifies whether to deliver records to Simple Log Service. Default value: false.</p>
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

        public static ModifyCloudAssistantSettingsRequestSlsDeliveryConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyCloudAssistantSettingsRequestSlsDeliveryConfig self = new ModifyCloudAssistantSettingsRequestSlsDeliveryConfig();
            return TeaModel.build(map, self);
        }

        public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig setLogstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }
        public String getLogstoreName() {
            return this.logstoreName;
        }

        public ModifyCloudAssistantSettingsRequestSlsDeliveryConfig setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
