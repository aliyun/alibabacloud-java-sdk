// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("CronExpression")
    public String cronExpression;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("PolicyName")
    public String policyName;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RetentionDays")
    public Integer retentionDays;

    public static ModifyAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAutoSnapshotPolicyRequest self = new ModifyAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAutoSnapshotPolicyRequest setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }
    public String getCronExpression() {
        return this.cronExpression;
    }

    public ModifyAutoSnapshotPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ModifyAutoSnapshotPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public ModifyAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAutoSnapshotPolicyRequest setRetentionDays(Integer retentionDays) {
        this.retentionDays = retentionDays;
        return this;
    }
    public Integer getRetentionDays() {
        return this.retentionDays;
    }

}
