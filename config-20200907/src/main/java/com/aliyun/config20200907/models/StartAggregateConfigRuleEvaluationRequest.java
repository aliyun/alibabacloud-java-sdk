// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class StartAggregateConfigRuleEvaluationRequest extends TeaModel {
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static StartAggregateConfigRuleEvaluationRequest build(java.util.Map<String, ?> map) throws Exception {
        StartAggregateConfigRuleEvaluationRequest self = new StartAggregateConfigRuleEvaluationRequest();
        return TeaModel.build(map, self);
    }

    public StartAggregateConfigRuleEvaluationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public StartAggregateConfigRuleEvaluationRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
