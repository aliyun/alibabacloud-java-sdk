// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateConfigRuleRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule.</p>
     * <br>
     * <p>You can call the [ListAggregateConfigRules](~~264148~~) operation to obtain the rule ID.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    public static GetAggregateConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateConfigRuleRequest self = new GetAggregateConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateConfigRuleRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateConfigRuleRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

}
