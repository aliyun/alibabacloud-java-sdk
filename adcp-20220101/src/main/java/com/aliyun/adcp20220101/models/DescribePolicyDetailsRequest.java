// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribePolicyDetailsRequest extends TeaModel {
    /**
     * <p>The policy name.</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static DescribePolicyDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyDetailsRequest self = new DescribePolicyDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePolicyDetailsRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
