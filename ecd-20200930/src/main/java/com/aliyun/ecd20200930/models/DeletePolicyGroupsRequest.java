// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeletePolicyGroupsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("PolicyGroupId")
    @Validation(required = true)
    public java.util.List<String> policyGroupId;

    public static DeletePolicyGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyGroupsRequest self = new DeletePolicyGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeletePolicyGroupsRequest setPolicyGroupId(java.util.List<String> policyGroupId) {
        this.policyGroupId = policyGroupId;
        return this;
    }
    public java.util.List<String> getPolicyGroupId() {
        return this.policyGroupId;
    }

}
