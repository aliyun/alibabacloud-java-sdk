// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ApplyAutoSnapshotPolicyShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DbfsIds")
    public String dbfsIdsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-z5siir3iq3m**********</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
