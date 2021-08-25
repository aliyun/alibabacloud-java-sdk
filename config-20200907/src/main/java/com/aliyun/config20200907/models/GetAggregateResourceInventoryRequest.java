// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceInventoryRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateResourceInventoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceInventoryRequest self = new GetAggregateResourceInventoryRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceInventoryRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
