// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetPrivateAccessPolicyRequest extends TeaModel {
    /**
     * <p>Intranet access policy ID. The value can be obtained from:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessPolices~~">ListPrivateAccessPolices</a>: Query multiple intranet access policies in bulk.</li>
     * <li><a href="~~CreatePrivateAccessPolicy~~">CreatePrivateAccessPolicy</a>: Create an intranet access policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-policy-63b2f1844b86****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static GetPrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateAccessPolicyRequest self = new GetPrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPrivateAccessPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
