// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122.models;

import com.aliyun.tea.*;

public class GetClientRuleStrategyStatisticsRequest extends TeaModel {
    /**
     * <p>The policy type. Set this parameter to 2 to query the statistics of proactive defense policies.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PolicyType")
    public Integer policyType;

    public static GetClientRuleStrategyStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClientRuleStrategyStatisticsRequest self = new GetClientRuleStrategyStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetClientRuleStrategyStatisticsRequest setPolicyType(Integer policyType) {
        this.policyType = policyType;
        return this;
    }
    public Integer getPolicyType() {
        return this.policyType;
    }

}
