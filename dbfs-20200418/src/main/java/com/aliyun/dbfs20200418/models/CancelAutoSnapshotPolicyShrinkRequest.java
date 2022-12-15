// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyShrinkRequest extends TeaModel {
    @NameInMap("DbfsIds")
    public String dbfsIdsShrink;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static CancelAutoSnapshotPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyShrinkRequest self = new CancelAutoSnapshotPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyShrinkRequest setDbfsIdsShrink(String dbfsIdsShrink) {
        this.dbfsIdsShrink = dbfsIdsShrink;
        return this;
    }
    public String getDbfsIdsShrink() {
        return this.dbfsIdsShrink;
    }

    public CancelAutoSnapshotPolicyShrinkRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CancelAutoSnapshotPolicyShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
