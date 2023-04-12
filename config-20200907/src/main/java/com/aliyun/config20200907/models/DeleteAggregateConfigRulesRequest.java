// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateConfigRulesRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule. Separate multiple rule IDs with commas (,).</p>
     * <br>
     * <p>You can call the [ListAggregateConfigRules](~~264148~~) operation to obtain the rule ID.</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static DeleteAggregateConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateConfigRulesRequest self = new DeleteAggregateConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateConfigRulesRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public DeleteAggregateConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
