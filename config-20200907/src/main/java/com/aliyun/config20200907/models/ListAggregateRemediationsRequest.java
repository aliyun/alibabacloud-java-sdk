// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>You can call the [ListAggregators](~~255797~~) operation to obtain the account group ID.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the rule. If you want to specify multiple IDs, separate them with commas (,).</p>
     * <br>
     * <p>You can call the [ListAggregateConfigRules](~~264148~~) operation to obtain the rule ID.</p>
     */
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    public static ListAggregateRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationsRequest self = new ListAggregateRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public ListAggregateRemediationsRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

}
