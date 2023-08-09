// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationStatisticsRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static ListAggregateConfigRuleEvaluationStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAggregateConfigRuleEvaluationStatisticsRequest self = new ListAggregateConfigRuleEvaluationStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public ListAggregateConfigRuleEvaluationStatisticsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
