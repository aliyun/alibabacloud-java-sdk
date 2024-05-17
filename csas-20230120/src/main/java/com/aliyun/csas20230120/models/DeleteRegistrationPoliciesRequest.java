// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteRegistrationPoliciesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static DeleteRegistrationPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRegistrationPoliciesRequest self = new DeleteRegistrationPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRegistrationPoliciesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
