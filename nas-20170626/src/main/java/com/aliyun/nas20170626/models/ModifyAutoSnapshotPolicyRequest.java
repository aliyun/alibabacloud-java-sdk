// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the automatic snapshot policy.</p>
     * <p>You can call DescribeAutoSnapshotPolicies to query available automatic snapshot policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-extreme-233e6****</p>
     */
    @NameInMap("AutoSnapshotPolicyId")
    public String autoSnapshotPolicyId;

    /**
     * <p>The name of the automatic snapshot policy. If this parameter is left empty, the policy name is not modified.</p>
     * <p>Limits:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name must start with a letter.</li>
     * <li>The name can contain digits, colons (:), underscores (_), and hyphens (-). The name cannot start with <code>http://</code> or <code>https://</code>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FinanceJoshua</p>
     */
    @NameInMap("AutoSnapshotPolicyName")
    public String autoSnapshotPolicyName;

    /**
     * <p>The days of the week on which automatic snapshots are created.</p>
     * <p>Cycle: week.</p>
     * <p>Valid values: 1 to 7. For example, 1 indicates Monday. To create multiple automatic snapshots within a week, specify multiple days and separate them with commas (,). You can specify up to 7 days.</p>
     * 
     * <strong>example:</strong>
     * <p>1,7</p>
     */
    @NameInMap("RepeatWeekdays")
    public String repeatWeekdays;

    /**
     * <p>The retention period of automatic snapshots.</p>
     * <p>Unit: days.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>-1 (default): Automatic snapshots are permanently retained.</li>
     * <li>1 to 65536: Automatic snapshots are retained for the specified number of days.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    /**
     * <p>The points in time at which automatic snapshots are created.</p>
     * <p>Unit: hours.</p>
     * <p>Valid values: 0 to 23, which correspond to the 24 points in time from 00:00 to 23:00. For example, 1 indicates 01:00. To create multiple automatic snapshots within a day, specify multiple points in time and separate them with commas (,). You can specify up to 24 points in time.</p>
     * 
     * <strong>example:</strong>
     * <p>0,1</p>
     */
    @NameInMap("TimePoints")
    public String timePoints;

    public static ModifyAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyRequest self = new ModifyAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyRequest setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
        this.autoSnapshotPolicyId = autoSnapshotPolicyId;
        return this;
    }
    public String getAutoSnapshotPolicyId() {
        return this.autoSnapshotPolicyId;
    }

    public ModifyAutoSnapshotPolicyRequest setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
        this.autoSnapshotPolicyName = autoSnapshotPolicyName;
        return this;
    }
    public String getAutoSnapshotPolicyName() {
        return this.autoSnapshotPolicyName;
    }

    public ModifyAutoSnapshotPolicyRequest setRepeatWeekdays(String repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }
    public String getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public ModifyAutoSnapshotPolicyRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public ModifyAutoSnapshotPolicyRequest setTimePoints(String timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public String getTimePoints() {
        return this.timePoints;
    }

}
