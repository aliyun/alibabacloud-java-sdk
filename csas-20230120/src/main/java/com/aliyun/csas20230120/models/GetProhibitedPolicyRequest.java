// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetProhibitedPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the prohibited software policy. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListProhibitedPolicies~~">ListProhibitedPolicies</a>: Lists prohibited software policies.</li>
     * <li><a href="~~CreateProhibitedPolicy~~">CreateProhibitedPolicy</a>: Creates a prohibited software policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pid-7da5ea4192c1****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static GetProhibitedPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProhibitedPolicyRequest self = new GetProhibitedPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetProhibitedPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
