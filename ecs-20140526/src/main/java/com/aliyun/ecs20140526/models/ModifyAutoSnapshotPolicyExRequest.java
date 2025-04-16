// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyExRequest extends TeaModel {
    /**
     * <p>The retention period of the snapshot copy in the destination region. Unit: days. Valid values:</p>
     * <ul>
     * <li>-1: The snapshot copy is retained until it is deleted.</li>
     * <li>1 to 65535: The snapshot copy is retained for a specified number of days.</li>
     * </ul>
     * <p>Default value: -1.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("CopiedSnapshotsRetentionDays")
    public Integer copiedSnapshotsRetentionDays;

    /**
     * <p>The encryption configurations for cross-region snapshot replication.</p>
     */
    @NameInMap("CopyEncryptionConfiguration")
    public ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration copyEncryptionConfiguration;

    /**
     * <p>Specifies whether to enable cross-region replication for the automatic snapshot.</p>
     * <ul>
     * <li>true: enables cross-region replication for the automatic snapshot.</li>
     * <li>false: disables cross-region replication for the automatic snapshot.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableCrossRegionCopy")
    public Boolean enableCrossRegionCopy;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The destination region to which to copy the snapshot. You can specify only a single destination region.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;cn-hangzhou&quot;]</p>
     */
    @NameInMap("TargetCopyRegions")
    public String targetCopyRegions;

    /**
     * <p>The ID of the automatic snapshot policy. You can call the <a href="https://help.aliyun.com/document_detail/25530.html">DescribeAutoSnapshotPolicyEx</a> operation to query available automatic snapshot policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-bp12m37ccmxvbmi5****</p>
     */
    @NameInMap("autoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The name of the automatic snapshot policy. If this parameter is not specified, the original name of the automatic snapshot policy is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>SPTestName</p>
     */
    @NameInMap("autoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    /**
     * <p>The region ID of the automatic snapshot policy. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The days of the week on which to create automatic snapshots. Valid values are 1 to 7, which correspond to the days of the week. For example, a value of 1 indicates Monday.</p>
     * <p>To schedule multiple automatic snapshots to be created in a week, you can specify multiple days.</p>
     * <ul>
     * <li>You can specify up to seven days over a one-week period.</li>
     * <li>You must set this parameter to a JSON array such as <code>[&quot;1&quot;, &quot;2&quot; ... &quot;7&quot;]</code>. Separate the values in the array with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;, &quot;7&quot;]</p>
     */
    @NameInMap("repeatWeekdays")
    public String repeatWeekdays;

    /**
     * <p>The retention period of the automatic snapshot. Unit: days. Valid values:</p>
     * <ul>
     * <li>\-1: The automatic snapshot is permanently retained.</li>
     * <li>1 to 65536: The auto snapshot is retained for the specified number of days.</li>
     * </ul>
     * <p>Default value: -1.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("retentionDays")
    public Integer retentionDays;

    /**
     * <p>The points in time of the day at which to create automatic snapshots. The time must be in UTC+8. Unit: hours. Valid values are 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. For example, a value of 1 indicates 01:00:00.</p>
     * <p>To schedule multiple automatic snapshots to be created in a day, you can specify multiple hours.</p>
     * <ul>
     * <li>You can specify up to 24 points in time.</li>
     * <li>You must set this parameter to a JSON array such as <code>[&quot;0&quot;, &quot;1&quot;, ... &quot;23&quot;]</code>. Separate the points in time with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;0&quot;, &quot;1&quot;]</p>
     */
    @NameInMap("timePoints")
    public String timePoints;

    public static ModifyAutoSnapshotPolicyExRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyExRequest self = new ModifyAutoSnapshotPolicyExRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyExRequest setCopiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
        this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
        return this;
    }
    public Integer getCopiedSnapshotsRetentionDays() {
        return this.copiedSnapshotsRetentionDays;
    }

    public ModifyAutoSnapshotPolicyExRequest setCopyEncryptionConfiguration(ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration copyEncryptionConfiguration) {
        this.copyEncryptionConfiguration = copyEncryptionConfiguration;
        return this;
    }
    public ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration getCopyEncryptionConfiguration() {
        return this.copyEncryptionConfiguration;
    }

    public ModifyAutoSnapshotPolicyExRequest setEnableCrossRegionCopy(Boolean enableCrossRegionCopy) {
        this.enableCrossRegionCopy = enableCrossRegionCopy;
        return this;
    }
    public Boolean getEnableCrossRegionCopy() {
        return this.enableCrossRegionCopy;
    }

    public ModifyAutoSnapshotPolicyExRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyAutoSnapshotPolicyExRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyAutoSnapshotPolicyExRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyAutoSnapshotPolicyExRequest setTargetCopyRegions(String targetCopyRegions) {
        this.targetCopyRegions = targetCopyRegions;
        return this;
    }
    public String getTargetCopyRegions() {
        return this.targetCopyRegions;
    }

    public ModifyAutoSnapshotPolicyExRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public ModifyAutoSnapshotPolicyExRequest setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
        return this;
    }
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public ModifyAutoSnapshotPolicyExRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoSnapshotPolicyExRequest setRepeatWeekdays(String repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public ModifyAutoSnapshotPolicyExRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public ModifyAutoSnapshotPolicyExRequest setTimePoints(String timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public String getTimePoints() {
        return this.timePoints;
    }

    public static class ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn extends TeaModel {
        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("AssumeRoleFor")
        public Long assumeRoleFor;

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("RoleType")
        public String roleType;

        /**
         * <p>This parameter is not publicly available.</p>
         * 
         * <strong>example:</strong>
         * <p>hide</p>
         */
        @NameInMap("Rolearn")
        public String rolearn;

        public static ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn self = new ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn();
            return TeaModel.build(map, self);
        }

        public ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn setAssumeRoleFor(Long assumeRoleFor) {
            this.assumeRoleFor = assumeRoleFor;
            return this;
        }
        public Long getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        public ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn setRoleType(String roleType) {
            this.roleType = roleType;
            return this;
        }
        public String getRoleType() {
            return this.roleType;
        }

        public ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn setRolearn(String rolearn) {
            this.rolearn = rolearn;
            return this;
        }
        public String getRolearn() {
            return this.rolearn;
        }

    }

    public static class ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration extends TeaModel {
        /**
         * <p>This parameter is not publicly available.</p>
         */
        @NameInMap("Arn")
        public java.util.List<ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn> arn;

        /**
         * <p>Specifies whether to enable encryption for cross-region snapshot replication. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Encrypted")
        public Boolean encrypted;

        /**
         * <p>The ID of the KMS key used for encryption in cross-region snapshot replication.</p>
         * 
         * <strong>example:</strong>
         * <p>0e478b7a-4262-4802-b8cb-00d3fb40826X</p>
         */
        @NameInMap("KMSKeyId")
        public String KMSKeyId;

        public static ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration self = new ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration();
            return TeaModel.build(map, self);
        }

        public ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration setArn(java.util.List<ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn> arn) {
            this.arn = arn;
            return this;
        }
        public java.util.List<ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfigurationArn> getArn() {
            return this.arn;
        }

        public ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration setEncrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }
        public Boolean getEncrypted() {
            return this.encrypted;
        }

        public ModifyAutoSnapshotPolicyExRequestCopyEncryptionConfiguration setKMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }
        public String getKMSKeyId() {
            return this.KMSKeyId;
        }

    }

}
