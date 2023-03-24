// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListUserGroupsForPrivateAccessPolicyShrinkRequest extends TeaModel {
    @NameInMap("PolicyIds")
    public String policyIdsShrink;

    public static ListUserGroupsForPrivateAccessPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserGroupsForPrivateAccessPolicyShrinkRequest self = new ListUserGroupsForPrivateAccessPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListUserGroupsForPrivateAccessPolicyShrinkRequest setPolicyIdsShrink(String policyIdsShrink) {
        this.policyIdsShrink = policyIdsShrink;
        return this;
    }
    public String getPolicyIdsShrink() {
        return this.policyIdsShrink;
    }

}
