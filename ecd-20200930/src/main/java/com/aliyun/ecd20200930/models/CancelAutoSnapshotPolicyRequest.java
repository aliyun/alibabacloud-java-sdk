// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    @NameInMap("PolicyId")
    public String policyId;

    @NameInMap("RegionId")
    public String regionId;

    public static CancelAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAutoSnapshotPolicyRequest self = new CancelAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CancelAutoSnapshotPolicyRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public CancelAutoSnapshotPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public CancelAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
