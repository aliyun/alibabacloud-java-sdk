// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByResourceTypeRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    // 资源文件夹Id
    @NameInMap("FolderId")
    public String folderId;

    @NameInMap("Region")
    public String region;

    // 资源Owner
    @NameInMap("ResourceOwnerId")
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

    public GetAggregateResourceCountsGroupByResourceTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
