// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByResourceTypeRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the folder in the resource directory.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a folder, see [View the basic information of a folder](~~111223~~).</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resources in the account group belong.</p>
     * <br>
     * <p>> You can specify either the ResourceAccountId or ResourceOwnerId parameter. We recommend that you specify the ResourceAccountId parameter.</p>
     */
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

    public GetAggregateResourceCountsGroupByResourceTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
