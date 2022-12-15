// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyShrinkRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepeatWeekdays")
    public String repeatWeekdaysShrink;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    @NameInMap("TimePoints")
    public String timePointsShrink;

    public static CreateAutoSnapshotPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyShrinkRequest self = new CreateAutoSnapshotPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyShrinkRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateAutoSnapshotPolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoSnapshotPolicyShrinkRequest setRepeatWeekdaysShrink(String repeatWeekdaysShrink) {
        this.repeatWeekdaysShrink = repeatWeekdaysShrink;
        return this;
    }
    public String getRepeatWeekdaysShrink() {
        return this.repeatWeekdaysShrink;
    }

    public CreateAutoSnapshotPolicyShrinkRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateAutoSnapshotPolicyShrinkRequest setTimePointsShrink(String timePointsShrink) {
        this.timePointsShrink = timePointsShrink;
        return this;
    }
    public String getTimePointsShrink() {
        return this.timePointsShrink;
    }

}
