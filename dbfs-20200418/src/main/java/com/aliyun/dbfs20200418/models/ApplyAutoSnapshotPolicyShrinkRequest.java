// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyShrinkRequest extends TeaModel {
    @NameInMap("DbfsIds")
    public String dbfsIdsShrink;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static ApplyAutoSnapshotPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyAutoSnapshotPolicyShrinkRequest self = new ApplyAutoSnapshotPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyAutoSnapshotPolicyShrinkRequest setDbfsIdsShrink(String dbfsIdsShrink) {
        this.dbfsIdsShrink = dbfsIdsShrink;
        return this;
    }
    public String getDbfsIdsShrink() {
        return this.dbfsIdsShrink;
    }

    public ApplyAutoSnapshotPolicyShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public ApplyAutoSnapshotPolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
