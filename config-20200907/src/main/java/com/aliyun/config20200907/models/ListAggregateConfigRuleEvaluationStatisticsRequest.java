// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class ListAggregateConfigRuleEvaluationStatisticsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-edd3626622af00b3****</p>
     */
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
