// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeletePolicyGroupRequest extends TeaModel {
    /**
     * <p>A list of policy group IDs. If any specified policy group is associated with an existing instance group, the entire operation fails.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyGroupIds")
    public java.util.List<String> policyGroupIds;

    public static DeletePolicyGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePolicyGroupRequest self = new DeletePolicyGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeletePolicyGroupRequest setPolicyGroupIds(java.util.List<String> policyGroupIds) {
        this.policyGroupIds = policyGroupIds;
        return this;
    }
    public java.util.List<String> getPolicyGroupIds() {
        return this.policyGroupIds;
    }

}
