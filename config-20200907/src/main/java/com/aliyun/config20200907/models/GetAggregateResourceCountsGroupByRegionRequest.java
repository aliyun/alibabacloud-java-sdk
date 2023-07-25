// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByRegionRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the folder in the resource directory. For more information about how to obtain the ID of a folder, see [View the basic information of a folder](~~111223~~).</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource.</p>
     * <br>
     * <p>For more information about how to obtain the type of a resource, see [ListAggregateDiscoveredResources](~~265983~~).</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static GetAggregateResourceCountsGroupByRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByRegionRequest self = new GetAggregateResourceCountsGroupByRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByRegionRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateResourceCountsGroupByRegionRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public GetAggregateResourceCountsGroupByRegionRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    public GetAggregateResourceCountsGroupByRegionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetAggregateResourceCountsGroupByRegionRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
