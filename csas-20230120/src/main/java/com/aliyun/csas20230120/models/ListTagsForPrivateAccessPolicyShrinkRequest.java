// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListTagsForPrivateAccessPolicyShrinkRequest extends TeaModel {
    @NameInMap("PolicyIds")
    public String policyIdsShrink;

    public static ListTagsForPrivateAccessPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsForPrivateAccessPolicyShrinkRequest self = new ListTagsForPrivateAccessPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsForPrivateAccessPolicyShrinkRequest setPolicyIdsShrink(String policyIdsShrink) {
        this.policyIdsShrink = policyIdsShrink;
        return this;
    }
    public String getPolicyIdsShrink() {
        return this.policyIdsShrink;
    }

}
