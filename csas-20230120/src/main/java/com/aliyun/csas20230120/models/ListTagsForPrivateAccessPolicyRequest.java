// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListTagsForPrivateAccessPolicyRequest extends TeaModel {
    @NameInMap("PolicyIds")
    public java.util.List<String> policyIds;

    public static ListTagsForPrivateAccessPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagsForPrivateAccessPolicyRequest self = new ListTagsForPrivateAccessPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ListTagsForPrivateAccessPolicyRequest setPolicyIds(java.util.List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }
    public java.util.List<String> getPolicyIds() {
        return this.policyIds;
    }

}
