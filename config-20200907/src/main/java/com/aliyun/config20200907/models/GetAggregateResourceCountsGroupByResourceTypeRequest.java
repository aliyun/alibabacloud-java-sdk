// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByResourceTypeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    public static GetAggregateResourceCountsGroupByResourceTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAggregateResourceCountsGroupByResourceTypeRequest self = new GetAggregateResourceCountsGroupByResourceTypeRequest();
        return TeaModel.build(map, self);
    }

    public GetAggregateResourceCountsGroupByResourceTypeRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public GetAggregateResourceCountsGroupByResourceTypeRequest setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public GetAggregateResourceCountsGroupByResourceTypeRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetAggregateResourceCountsGroupByResourceTypeRequest setResourceAccountId(Long resourceAccountId) {
        this.resourceAccountId = resourceAccountId;
        return this;
    }
    public Long getResourceAccountId() {
        return this.resourceAccountId;
    }

    @Deprecated
    public GetAggregateResourceCountsGroupByResourceTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
