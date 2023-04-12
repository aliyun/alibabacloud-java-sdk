// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateDiscoveredResourceRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to query the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the region in which the resource resides.</p>
     * <br>
     * <p>For more information about how to query the region ID of a resource, see [ListAggregateDiscoveredResources](~~411691~~).</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    /**
     * <p>The ID of the resource.</p>
     * <br>
     * <p>For more information about how to query the ID of a resource, see [ListAggregateDiscoveredResources](~~411691~~).</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>For more information about how to query the type of a resource, see [ListAggregateDiscoveredResources](~~411691~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetAggregateDiscoveredResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateDiscoveredResourceRequest self = new GetAggregateDiscoveredResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateDiscoveredResourceRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateDiscoveredResourceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAggregateDiscoveredResourceRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public GetAggregateDiscoveredResourceRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public GetAggregateDiscoveredResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetAggregateDiscoveredResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
