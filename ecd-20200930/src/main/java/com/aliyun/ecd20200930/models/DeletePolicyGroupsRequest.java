// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeletePolicyGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the policy. You can specify 1 to 100 policy IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pg-gx2x1dhsmthe9****</p>
     */
    @NameInMap("PolicyGroupId")
    public java.util.List<String> policyGroupId;

    /**
     * <p>The ID of the region.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeletePolicyGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyGroupsRequest self = new DeletePolicyGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyGroupsRequest setPolicyGroupId(java.util.List<String> policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public java.util.List<String> getPolicyGroupId() {
        return this.policyGroupId;
    }

    public DeletePolicyGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
