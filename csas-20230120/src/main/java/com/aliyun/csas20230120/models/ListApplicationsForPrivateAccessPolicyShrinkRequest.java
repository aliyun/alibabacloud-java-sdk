// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApplicationsForPrivateAccessPolicyShrinkRequest extends TeaModel {
    @NameInMap("PolicyIds")
    public String policyIdsShrink;

    public static ListApplicationsForPrivateAccessPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForPrivateAccessPolicyShrinkRequest self = new ListApplicationsForPrivateAccessPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForPrivateAccessPolicyShrinkRequest setPolicyIdsShrink(String policyIdsShrink) {
        this.policyIdsShrink = policyIdsShrink;
        return this;
    }
    public String getPolicyIdsShrink() {
        return this.policyIdsShrink;
    }

}
