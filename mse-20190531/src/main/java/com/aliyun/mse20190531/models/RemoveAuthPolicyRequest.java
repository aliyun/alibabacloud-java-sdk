// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RemoveAuthPolicyRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("PolicyId")
    public String policyId;

    public static RemoveAuthPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAuthPolicyRequest self = new RemoveAuthPolicyRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAuthPolicyRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public RemoveAuthPolicyRequest setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

}
