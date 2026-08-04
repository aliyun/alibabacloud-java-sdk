// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeletePrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the private network access policy. Obtain this ID from:</p>
     * <ul>
     * <li><p><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: Batch query private network access policies.</p>
     * </li>
     * <li><p><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create a private network access policy.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-policy-867ef4007c8a****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static DeletePrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateAccessPolicyRequest self = new DeletePrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrivateAccessPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
