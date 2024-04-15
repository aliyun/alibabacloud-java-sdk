// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The IDs of the automatic snapshot policies that you want to delete.</p>
     */
    @NameInMap("PolicyId")
    public java.util.List<String> policyId;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAutoSnapshotPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoSnapshotPolicyRequest self = new DeleteAutoSnapshotPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoSnapshotPolicyRequest setPolicyId(java.util.List<String> policyId) {
        this.policyId = policyId;
        return this;
    }
    public java.util.List<String> getPolicyId() {
        return this.policyId;
    }

    public DeleteAutoSnapshotPolicyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
