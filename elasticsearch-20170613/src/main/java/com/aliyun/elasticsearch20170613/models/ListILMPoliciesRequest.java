// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListILMPoliciesRequest extends TeaModel {
    @NameInMap("policyName")
    public String policyName;

    public static ListILMPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListILMPoliciesRequest self = new ListILMPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListILMPoliciesRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
