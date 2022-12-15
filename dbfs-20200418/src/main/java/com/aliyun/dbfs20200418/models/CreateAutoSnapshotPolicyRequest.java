// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RepeatWeekdays")
    public java.util.List<String> repeatWeekdays;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    @NameInMap("TimePoints")
    public java.util.List<String> timePoints;

    public static CreateAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAutoSnapshotPolicyRequest self = new CreateAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateAutoSnapshotPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public CreateAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAutoSnapshotPolicyRequest setRepeatWeekdays(java.util.List<String> repeatWeekdays) {
        this.repeatWeekdays = repeatWeekdays;
        return this;
    }
    public java.util.List<String> getRepeatWeekdays() {
        return this.repeatWeekdays;
    }

    public CreateAutoSnapshotPolicyRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

    public CreateAutoSnapshotPolicyRequest setTimePoints(java.util.List<String> timePoints) {
        this.timePoints = timePoints;
        return this;
    }
    public java.util.List<String> getTimePoints() {
        return this.timePoints;
    }

}
