// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteAutoSnapshotPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    public java.util.List<String> policyId;

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
