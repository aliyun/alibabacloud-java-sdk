// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedPoliciesRequest extends TeaModel {
    /**
     * <p>The IDs of the software prohibition policies to delete. Duplicate IDs are not allowed. You can specify up to 100 IDs.</p>
     */
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static DeleteProhibitedPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedPoliciesRequest self = new DeleteProhibitedPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedPoliciesRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
