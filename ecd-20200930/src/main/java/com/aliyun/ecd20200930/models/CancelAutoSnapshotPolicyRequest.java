// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CancelAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud desktops. Valid values of N: 1 to 50. You cannot leave this parameter empty. The value can be up to 64 characters in length and cannot start with acs: or aliyun. It cannot contain `http://` or `https://`.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The ID of the automatic snapshot policy.</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    /**
     * <p>The region ID of the automatic snapshot policy. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
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
