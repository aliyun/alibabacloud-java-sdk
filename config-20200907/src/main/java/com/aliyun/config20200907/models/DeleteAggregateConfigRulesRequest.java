// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateConfigRulesRequest extends TeaModel {
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static DeleteAggregateConfigRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateConfigRulesRequest self = new DeleteAggregateConfigRulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateConfigRulesRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public DeleteAggregateConfigRulesRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
