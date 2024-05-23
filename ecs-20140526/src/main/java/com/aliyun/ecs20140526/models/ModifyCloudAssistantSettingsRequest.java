// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyCloudAssistantSettingsRequest extends TeaModel {
    /**
     * <p>The configurations for upgrading Cloud Assistant Agent.</p>
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
         * <p>The time windows during which Cloud Assistant Agent can be upgraded. The time windows can be accurate to minutes. The Coordinated Universal Time (UTC) time zone is used by default.</p>
         * <br>
         * <p>Make sure that the upgrade windows specified by this parameter are not shorter than 1 hour.</p>
         * <br>
         * <p>Specify each upgrade window in the following format: \<Start time in the HH:mm format>-\<End time in the HH:mm format>.</p>
         * <br>
         * <p>For example, \[ "02:00-03:00", "05:00-06:00" ] specifies that Cloud Assistant Agent can be upgraded from 2:00:00 to 3:00:00 and from 5:00:00 to 6:00:00 every day in the UTC time zone.</p>
         */
        @NameInMap("AllowedUpgradeWindow")
        public java.util.List<String> allowedUpgradeWindow;

        /**
         * <p>Specifies whether to enable custom upgrade for Cloud Assistant Agent. If you set this parameter to false, an upgrade attempt is performed for Cloud Assistant Agent every 30 minutes.</p>
         * <br>
         * <p>Default value: false.</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The time zone of the time windows. Default value: UTC. You can specify a time zone in the following forms:</p>
         * <br>
         * <p>*   The time zone name. Examples: Asia/Shanghai and America/Los_Angeles.</p>
         * <p>*   The time offset from GMT. Examples: GMT+8:00 (UTC+8) and GMT-7:00 (UTC-7). You cannot add leading zeros to the hour value.</p>
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
