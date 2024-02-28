// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The retention period of the snapshot copy in the destination region. Unit: days. Valid values:</p>
     * <br>
     * <p>*   \-1: The snapshot copy is permanently retained.</p>
     * <p>*   A value in the range of 1 to 65535: The snapshot copy is retained for the specified number of days.</p>
     * <br>
     * <p>Default value: -1.</p>
     */
    @NameInMap("CopiedSnapshotsRetentionDays")
    public Integer copiedSnapshotsRetentionDays;

    @NameInMap("CopyEncryptionConfiguration")
    public CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration copyEncryptionConfiguration;

    /**
     * <p>Specifies whether to enable cross-region replication for snapshots.</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("EnableCrossRegionCopy")
    public Boolean enableCrossRegionCopy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>> This parameter is not publicly available.</p>
     */
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    /**
     * <p>The tags to add to the snapshot.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateAutoSnapshotPolicyRequestTag> tag;

    /**
     * <p>The destination region to which to copy the snapshot. You can specify only a single destination region.</p>
     */
    @NameInMap("TargetCopyRegions")
    public String targetCopyRegions;

    /**
     * <p>The name of the automatic snapshot policy. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with [http:// or https://. It can contain letters, digits, colons (.), underscores (\_), and hyphens (-).](http://https://。、（:）、（\_）（-）。)</p>
     * <br>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("autoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    /**
     * <p>The ID of the region in which to create the automatic snapshot policy. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The days of the week on which to create automatic snapshots. Valid values: 1 to 7, which correspond to Monday to Sunday. 1 indicates Monday. Format description:</p>
     * <br>
     * <p>*   Set this parameter to a JSON-formatted array. For example, a value of \["1"] specifies automatic snapshots to be created every Monday.</p>
     * <p>*   To schedule multiple automatic snapshots to be created in a week, you can specify multiple values. Separate the values with commas (,). You can specify a maximum of seven days. For example, a value of \["1","3","5"] specifies automatic snapshots to be created every Monday, Wednesday, and Friday.</p>
     */
    @NameInMap("repeatWeekdays")
    public String repeatWeekdays;

    /**
     * <p>The retention period of the automatic snapshot. Unit: days. Valid values:</p>
     * <br>
     * <p>*   \-1: The snapshot is permanently retained.</p>
     * <p>*   A value in the range of 1 to 65535: The snapshot is retained for the specified number of days.</p>
     * <br>
     * <p>Default value: -1.</p>
     */
    @NameInMap("retentionDays")
    public Integer retentionDays;

    /**
     * <p>The points in time of the day at which to create automatic snapshots. The time must be in UTC+8. Unit: hours. Valid values: 0 to 23, which correspond to the 24 on-the-hour points in time from 00:00:00 to 23:00:00. 1 indicates 01:00:00. Format description:</p>
     * <br>
     * <p>*   Set this parameter to a JSON-formatted array. For example, a value of \["1"] specifies automatic snapshots to be created at 01:00:00.</p>
     * <p>*   To schedule multiple automatic snapshots to be created in a day, you can specify multiple values. Separate the values with commas (,). You can specify a maximum of 24 points in time. For example, a value of \["1","3","5"] specifies automatic snapshots to be created at 01:00:00, 03:00:00, and 05:00:00.</p>
     */
    @NameInMap("timePoints")
    public String timePoints;

    public static CreateAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyRequest self = new CreateAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyRequest setCopiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
        this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
        return this;
    }
    public Integer getCopiedSnapshotsRetentionDays() {
        return this.copiedSnapshotsRetentionDays;
    }

    public CreateAutoSnapshotPolicyRequest setCopyEncryptionConfiguration(CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration copyEncryptionConfiguration) {
        this.copyEncryptionConfiguration = copyEncryptionConfiguration;
        return this;
    }
    public CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration getCopyEncryptionConfiguration() {
        return this.copyEncryptionConfiguration;
    }

    public CreateAutoSnapshotPolicyRequest setEnableCrossRegionCopy(Boolean enableCrossRegionCopy) {
        this.enableCrossRegionCopy = enableCrossRegionCopy;
        return this;
    }
    public Boolean getEnableCrossRegionCopy() {
        return this.enableCrossRegionCopy;
    }

    public CreateAutoSnapshotPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAutoSnapshotPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateAutoSnapshotPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAutoSnapshotPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateAutoSnapshotPolicyRequest setStorageLocationArn(String storageLocationArn) {
        this.storageLocationArn = storageLocationArn;
        return this;
    }
    public String getStorageLocationArn() {
        return this.storageLocationArn;
    }

    public CreateAutoSnapshotPolicyRequest setTag(java.util.List<CreateAutoSnapshotPolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateAutoSnapshotPolicyRequestTag> getTag() {
        return this.tag;
    }

    public CreateAutoSnapshotPolicyRequest setTargetCopyRegions(String targetCopyRegions) {
        this.targetCopyRegions = targetCopyRegions;
        return this;
    }
    public String getTargetCopyRegions() {
        return this.targetCopyRegions;
    }

    public CreateAutoSnapshotPolicyRequest setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
        return this;
    }
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public CreateAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoSnapshotPolicyRequest setRepeatWeekdays(String repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public CreateAutoSnapshotPolicyRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateAutoSnapshotPolicyRequest setTimePoints(String timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public String getTimePoints() {
        return this.timePoints;
    }

    public static class CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn extends TeaModel {
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        @NameInMap("RoleType")
        public String roleType;

        @NameInMap("Rolearn")
        public String rolearn;

        public static CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn self = new CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn();
            return TeaModel.build(map, self);
        }

        public CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration extends TeaModel {
        @NameInMap("Arn")
        public java.util.List<CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn> arn;

        @NameInMap("Encrypted")
        public Boolean encrypted;

        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        public static CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration self = new CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration();
            return TeaModel.build(map, self);
        }

        public CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration setArn(java.util.List<CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn> arn) {
            this.arn = arn;
            return this;
        }
        public java.util.List<CreateAutoSnapshotPolicyRequestCopyEncryptionConfigurationArn> getArn() {
            return this.arn;
        }

        public CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public CreateAutoSnapshotPolicyRequestCopyEncryptionConfiguration setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

    }

    public static class CreateAutoSnapshotPolicyRequestTag extends TeaModel {
        /**
         * <p>The key of tag N to add to the snapshot. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length. The tag key cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N to add to the snapshot. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length. The tag value cannot start with acs: or aliyun or contain [http:// or https://.](http://https://。)</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateAutoSnapshotPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateAutoSnapshotPolicyRequestTag self = new CreateAutoSnapshotPolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateAutoSnapshotPolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateAutoSnapshotPolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
