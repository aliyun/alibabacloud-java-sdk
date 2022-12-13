// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ClonePolicyGroupRequest extends TeaModel {
    // The name of the policy.
    @NameInMap("Name")
    public String name;

    // The ID of the policy that you want to clone.
    @NameInMap("PolicyGroupId")
    public String policyGroupId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static ClonePolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ClonePolicyGroupRequest self = new ClonePolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public ClonePolicyGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClonePolicyGroupRequest setPolicyGroupId(String policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    public ClonePolicyGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
