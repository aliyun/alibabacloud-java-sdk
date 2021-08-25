// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ActiveAggregateConfigRulesRequest extends TeaModel {
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static ActiveAggregateConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ActiveAggregateConfigRulesRequest self = new ActiveAggregateConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public ActiveAggregateConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public ActiveAggregateConfigRulesRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
