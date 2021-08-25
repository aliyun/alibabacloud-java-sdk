// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateRemediationsRequest extends TeaModel {
    @NameInMap("ConfigRuleIds")
    public String configRuleIds;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static ListAggregateRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateRemediationsRequest self = new ListAggregateRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateRemediationsRequest setConfigRuleIds(String configRuleIds) {
        this.configRuleIds = configRuleIds;
        return this;
    }
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public ListAggregateRemediationsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
