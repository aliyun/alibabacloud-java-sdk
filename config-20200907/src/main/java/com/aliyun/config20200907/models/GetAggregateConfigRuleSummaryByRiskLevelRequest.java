// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleSummaryByRiskLevelRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateConfigRuleSummaryByRiskLevelRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleSummaryByRiskLevelRequest self = new GetAggregateConfigRuleSummaryByRiskLevelRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleSummaryByRiskLevelRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
