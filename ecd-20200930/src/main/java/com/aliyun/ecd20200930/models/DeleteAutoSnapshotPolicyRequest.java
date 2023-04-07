// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the policy template that you want to manage.</p>
     * <br>
     * <p>> You can call the [ListDefensePolicies](~~195814~~) operation to query the IDs of all policy templates.</p>
     */
    @NameInMap("PolicyId")
    public java.util.List<String> policyId;

    /**
     * <p>The ID of the region where the automatic snapshot policy is created.</p>
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
