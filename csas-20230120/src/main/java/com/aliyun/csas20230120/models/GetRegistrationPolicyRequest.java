// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetRegistrationPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the device registration policy. Valid values are obtained from the following sources:</p>
     * <ul>
     * <li><a href="~~ListRegistrationPolicies~~">ListRegistrationPolicies</a>: Queries device registration policies in batches.</li>
     * <li><a href="~~GetRegistrationPolicy~~">GetRegistrationPolicy</a>: Queries the details of a device registration policy.</li>
     * <li><a href="~~CreateRegistrationPolicy~~">CreateRegistrationPolicy</a>: Creates a device registration policy.</li>
     * <li><a href="~~UpdateRegistrationPolicy~~">UpdateRegistrationPolicy</a>: Updates a device registration policy.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>reg-policy-dcbfd33cb004****</p>
     */
    @NameInMap("PolicyId")
    public String policyId;

    public static GetRegistrationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegistrationPolicyRequest self = new GetRegistrationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetRegistrationPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
