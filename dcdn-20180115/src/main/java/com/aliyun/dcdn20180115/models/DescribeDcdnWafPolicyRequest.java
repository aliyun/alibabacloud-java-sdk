// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafPolicyRequest extends TeaModel {
    @NameInMap("PolicyId")
    public Long policyId;

    public static DescribeDcdnWafPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafPolicyRequest self = new DescribeDcdnWafPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafPolicyRequest setPolicyId(Long policyId) {
        this.policyId = policyId;
        return this;
    }
    public Long getPolicyId() {
        return this.policyId;
    }

}
