// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyRequest extends TeaModel {
    // The retention period of the snapshot copy in the destination region. Unit: days. Valid values:
    // 
    // *   \-1: The snapshot copy is permanently retained.
    // *   1 to 65535: The snapshot copy is retained for the specified number of days.
    // 
    // Default value: -1.
    @NameInMap("CopiedSnapshotsRetentionDays")
    public Integer copiedSnapshotsRetentionDays;

    // Specifies whether to enable cross-region replication for snapshots.
    // 
    // *   true: enables cross-region replication for snapshots.
    // *   false: disables cross-region replication for snapshots.
    @NameInMap("EnableCrossRegionCopy")
    public Boolean enableCrossRegionCopy;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The ID of the resource group to which the automatic snapshot policy belongs.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // > This parameter is in invitational preview and is unavailable.
    @NameInMap("StorageLocationArn")
    public String storageLocationArn;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<CreateAutoSnapshotPolicyRequestTag> tag;

    // The destination region to which to copy snapshots. You can set only a single destination region.
    @NameInMap("TargetCopyRegions")
    public String targetCopyRegions;

    // The name of the automatic snapshot policy. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
    // 
    // This parameter is empty by default.
    @NameInMap("autoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    // The ID of the region in which to create the automatic snapshot policy. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("regionId")
    public String regionId;

    // The days of the week on which to create automatic snapshots. Valid values: 1 to 7, which correspond to Monday to Sunday. 1 indicates Monday.
    // 
    // *   Set this parameter to a JSON-formatted array. For example, a value of \["1"] specifies automatic snapshots to be created every Monday.
    // *   To schedule multiple automatic snapshots to be created in a week, you can specify multiple values. Separate the values with commas (,). You can specify a maximum of seven days. For example, a value of \["1","3","5"] specifies automatic snapshots to be created every Monday, Wednesday, and Friday.
    @NameInMap("repeatWeekdays")
    public String repeatWeekdays;

    // The retention period of the automatic snapshot. Unit: days. Valid values:
    // 
    // *   \-1: The snapshot is permanently retained.
    // *   1 to 65535: The automatic snapshot is retained for the specified number of days.
    // 
    // Default value: -1.
    @NameInMap("retentionDays")
    public Integer retentionDays;

    // The points in time of the day at which to create automatic snapshots. The time must be in UTC+8. Unit: hours. Valid values are 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. 1 indicates 01:00:00.
    // 
    // *   You must set this parameter to a JSON-formatted array. For example, a value of \["1"] specifies automatic snapshots to be created at 01:00:00.
    // *   To schedule multiple automatic snapshots to be created in a day, you can specify multiple values. Separate the values with commas (,). You can specify a maximum of 24 points in time. For example, a value of \["1","3","5"] specifies automatic snapshots to be created at 01:00:00, 03:00:00, and 05:00:00.
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

    public static class CreateAutoSnapshotPolicyRequestTag extends TeaModel {
        // The key of tag N of the automatic snapshot policy. Valid values of N: 1 to 20. The tag key cannot be an empty string. It can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain http:// or https://.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the automatic snapshot policy. Valid values of N: 1 to 20. The tag value can be an empty string. It can be up to 128 characters in length. It cannot start with acs: or contain http:// or https://.
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
