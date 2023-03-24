// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessPolicyRequest extends TeaModel {
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static ListApplicationsForPrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForPrivateAccessPolicyRequest self = new ListApplicationsForPrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForPrivateAccessPolicyRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
