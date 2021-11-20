// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByRegionRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    // 资源夹Id
    @NameInMap("FolderId")
    public String folderId;

    // 资源owner
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
