// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListTagKeysRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TagOwnerUid")
    public String tagOwnerUid;

    @NameInMap("TagOwnerBid")
    public String tagOwnerBid;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ListTagKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTagKeysRequest self = new ListTagKeysRequest();
        return TeaModel.build(map, self);
    }

    public ListTagKeysRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ListTagKeysRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTagKeysRequest setTagOwnerUid(String tagOwnerUid) {
        this.tagOwnerUid = tagOwnerUid;
        return this;
    }
    public String getTagOwnerUid() {
        return this.tagOwnerUid;
    }

    public ListTagKeysRequest setTagOwnerBid(String tagOwnerBid) {
        this.tagOwnerBid = tagOwnerBid;
        return this;
    }
    public String getTagOwnerBid() {
        return this.tagOwnerBid;
    }

    public ListTagKeysRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListTagKeysRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public ListTagKeysRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTagKeysRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListTagKeysRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
