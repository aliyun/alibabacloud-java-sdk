// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListILMPoliciesRequest extends TeaModel {
    @NameInMap("body")
    public String body;

    @NameInMap("policyName")
    public String policyName;

    public static ListILMPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListILMPoliciesRequest self = new ListILMPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListILMPoliciesRequest setBody(String body) {
        this.body = body;
        return this;
    }
    public String getBody() {
        return this.body;
    }

    public ListILMPoliciesRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
