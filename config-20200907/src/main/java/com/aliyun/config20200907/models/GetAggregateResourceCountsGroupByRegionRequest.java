// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class GetAggregateResourceCountsGroupByRegionRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of an account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-a260626622af0005****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the folder in the resource directory. For more information about how to obtain the ID of a folder, see <a href="https://help.aliyun.com/document_detail/111223.html">View the basic information of a folder</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>r-BU****</p>
     */
    @NameInMap("FolderId")
    public String folderId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the resources in the account group belong.</p>
     * <blockquote>
     * <p>You can use either the ResourceAccountId or ResourceOwnerId parameter. We recommend that you use the ResourceAccountId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100931896542****</p>
     */
    @NameInMap("ResourceAccountId")
    public Long resourceAccountId;

    @NameInMap("ResourceOwnerId")
    @Deprecated
    public Long resourceOwnerId;

    /**
     * <p>The resource type.</p>
     * <p>For more information about how to obtain the type of a resource, see <a href="https://help.aliyun.com/document_detail/265983.html">ListAggregateDiscoveredResources</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
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

    @Deprecated
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
