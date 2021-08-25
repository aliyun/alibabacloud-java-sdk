// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByRegionRequest extends TeaModel {
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static GetAggregateResourceCountsGroupByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByRegionRequest self = new GetAggregateResourceCountsGroupByRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByRegionRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetAggregateResourceCountsGroupByRegionRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
