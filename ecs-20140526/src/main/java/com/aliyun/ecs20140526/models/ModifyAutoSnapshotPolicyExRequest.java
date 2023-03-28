// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyExRequest extends TeaModel {
    @NameInMap("CopiedSnapshotsRetentionDays")
    public Integer copiedSnapshotsRetentionDays;

    @NameInMap("EnableCrossRegionCopy")
    public Boolean enableCrossRegionCopy;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TargetCopyRegions")
    public String targetCopyRegions;

    @NameInMap("autoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    @NameInMap("autoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("repeatWeekdays")
    public String repeatWeekdays;

    @NameInMap("retentionDays")
    public Integer retentionDays;

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

}
