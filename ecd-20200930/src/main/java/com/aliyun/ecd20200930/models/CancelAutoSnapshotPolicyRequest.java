// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computers. You can specify 1 to 50 IDs. The IDs cannot be an empty string. The IDs can be up to 64 characters in length and cannot contain `http://` or `https://`. The IDs cannot start with `acs:` or `aliyun`.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the automatic snapshot policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
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
