// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-z5siir3iq3m**********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <strong>example:</strong>
     * <p>policyTest</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepeatWeekdays")
    public String repeatWeekdaysShrink;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("RetentionDays")
    public Integer retentionDays;

    @NameInMap("TimePoints")
    public String timePointsShrink;

    public static ModifyAutoSnapshotPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyShrinkRequest self = new ModifyAutoSnapshotPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ModifyAutoSnapshotPolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ModifyAutoSnapshotPolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoSnapshotPolicyShrinkRequest setRepeatWeekdaysShrink(String repeatWeekdaysShrink) {
        this.repeatWeekdaysShrink = repeatWeekdaysShrink;
        return this;
    }
    public String getRepeatWeekdaysShrink() {
        return this.repeatWeekdaysShrink;
    }

    public ModifyAutoSnapshotPolicyShrinkRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public ModifyAutoSnapshotPolicyShrinkRequest setTimePointsShrink(String timePointsShrink) {
        this.timePointsShrink = timePointsShrink;
        return this;
    }
    public String getTimePointsShrink() {
        return this.timePointsShrink;
    }

}
