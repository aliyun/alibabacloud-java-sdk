// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateComplianceSummaryRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-a91d626622af0035****</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
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
