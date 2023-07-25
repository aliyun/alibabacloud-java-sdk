// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateComplianceSummaryRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateComplianceSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateComplianceSummaryRequest self = new GetAggregateComplianceSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateComplianceSummaryRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
