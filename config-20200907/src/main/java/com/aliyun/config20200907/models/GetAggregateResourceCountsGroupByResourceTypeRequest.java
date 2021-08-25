// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByResourceTypeRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateResourceCountsGroupByResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByResourceTypeRequest self = new GetAggregateResourceCountsGroupByResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByResourceTypeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAggregateResourceCountsGroupByResourceTypeRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
