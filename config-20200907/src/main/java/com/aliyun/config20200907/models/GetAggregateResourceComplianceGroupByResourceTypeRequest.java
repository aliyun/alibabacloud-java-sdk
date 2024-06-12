// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceComplianceGroupByResourceTypeRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule. Separate multiple rule IDs with commas (,).</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static GetAggregateResourceComplianceGroupByResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceComplianceGroupByResourceTypeRequest self = new GetAggregateResourceComplianceGroupByResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceComplianceGroupByResourceTypeRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateResourceComplianceGroupByResourceTypeRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
