// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregatorRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-88ea626622af0055****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregatorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregatorRequest self = new GetAggregatorRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregatorRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
