// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyExRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CopiedSnapshotsRetentionDays")
    public Integer copiedSnapshotsRetentionDays;

    /**
     * <p>The destination region to which to copy the snapshot. You can specify only a single destination region.</p>
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
     * <p>The retention period of the snapshot copy in the destination region. Unit: days. Valid values:</p>
     * <br>
     * <p>*   \-1: The snapshot is permanently retained.</p>
     * <p>*   1 to 65535: The automatic snapshot is retained for the specified number of days.</p>
     * <br>
     * <p>Default value: -1.</p>
     */
    @NameInMap("TargetCopyRegions")
    public String targetCopyRegions;

    /**
     * <p>The name of the automatic snapshot policy. If this parameter is not specified, the original name of the automatic snapshot policy is retained.</p>
     */
    @NameInMap("autoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The points in time of the day at which to create automatic snapshots. The time must be in UTC+8. Unit: hours. Valid values are 0 to 23, which correspond to the 24 points in time on the hour from 00:00:00 to 23:00:00. For example, a value of 1 indicates 01:00:00.</p>
     * <br>
     * <p>To schedule multiple automatic snapshots to be created in a day, you can specify multiple hours.</p>
     * <br>
     * <p>*   You can specify up to 24 points in time.</p>
     * <p>*   You must set this parameter to a JSON array such as `["0", "1", ... "23"]`. Separate the points in time with commas (,).</p>
     */
    @NameInMap("autoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    /**
     * <p>The ID of the automatic snapshot policy. You can call the [DescribeAutoSnapshotPolicyEx](~~25530~~) operation to query available automatic snapshot policies.</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>The retention period of the automatic snapshot. Unit: days. Valid values:</p>
     * <br>
     * <p>*   \-1: The automatic snapshot is permanently retained.</p>
     * <p>*   1 to 65536: The auto snapshot is retained for the specified number of days.</p>
     * <br>
     * <p>Default value: -1.</p>
     */
    @NameInMap("repeatWeekdays")
    public String repeatWeekdays;

    /**
     * <p>Specifies whether to enable cross-region replication for the automatic snapshot.</p>
     * <br>
     * <p>*   true: enables cross-region replication for the automatic snapshot.</p>
     * <p>*   false: disables cross-region replication for the automatic snapshot.</p>
     */
    @NameInMap("retentionDays")
    public Integer retentionDays;

    /**
     * <p>The days of the week on which to create automatic snapshots. Valid values are 1 to 7, which correspond to the days of the week. For example, a value of 1 indicates Monday.</p>
     * <br>
     * <p>To schedule multiple automatic snapshots to be created in a week, you can specify multiple days.</p>
     * <br>
     * <p>*   You can specify up to seven days over a one-week period.</p>
     * <p>*   You must set this parameter to a JSON array such as `["1", "2" ... "7"]`. Separate the values in the array with commas (,).</p>
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
