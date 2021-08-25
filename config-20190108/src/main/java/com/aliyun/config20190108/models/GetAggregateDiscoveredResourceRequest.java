// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class GetAggregateDiscoveredResourceRequest extends TeaModel {
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Region")
    public String region;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetAggregateDiscoveredResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateDiscoveredResourceRequest self = new GetAggregateDiscoveredResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateDiscoveredResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetAggregateDiscoveredResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetAggregateDiscoveredResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAggregateDiscoveredResourceRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateDiscoveredResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
