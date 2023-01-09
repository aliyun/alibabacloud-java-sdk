// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeReleasedResourcesRequest extends TeaModel {
    @NameInMap("Filter")
    public java.util.List<DescribeReleasedResourcesRequestFilter> filter;

    @NameInMap("Global")
    public String global;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Marker")
    public String marker;

    @NameInMap("MaxItems")
    public Integer maxItems;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Product")
    public String product;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("TagFilter")
    public java.util.List<DescribeReleasedResourcesRequestTagFilter> tagFilter;

    public static DescribeReleasedResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReleasedResourcesRequest self = new DescribeReleasedResourcesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReleasedResourcesRequest setFilter(java.util.List<DescribeReleasedResourcesRequestFilter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<DescribeReleasedResourcesRequestFilter> getFilter() {
        return this.filter;
    }

    public DescribeReleasedResourcesRequest setGlobal(String global) {
        this.global = global;
        return this;
    }
    public String getGlobal() {
        return this.global;
    }

    public DescribeReleasedResourcesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeReleasedResourcesRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public DescribeReleasedResourcesRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public DescribeReleasedResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeReleasedResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeReleasedResourcesRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeReleasedResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeReleasedResourcesRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeReleasedResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeReleasedResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeReleasedResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeReleasedResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeReleasedResourcesRequest setTagFilter(java.util.List<DescribeReleasedResourcesRequestTagFilter> tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public java.util.List<DescribeReleasedResourcesRequestTagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static class DescribeReleasedResourcesRequestFilter extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValue")
        public String attributeValue;

        @NameInMap("Operation")
        public String operation;

        public static DescribeReleasedResourcesRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeReleasedResourcesRequestFilter self = new DescribeReleasedResourcesRequestFilter();
            return TeaModel.build(map, self);
        }

        public DescribeReleasedResourcesRequestFilter setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public DescribeReleasedResourcesRequestFilter setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public DescribeReleasedResourcesRequestFilter setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

    public static class DescribeReleasedResourcesRequestTagFilter extends TeaModel {
        @NameInMap("Operation")
        public String operation;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValues")
        public java.util.List<String> tagValues;

        public static DescribeReleasedResourcesRequestTagFilter build(java.util.Map<String, ?> map) throws Exception {
            DescribeReleasedResourcesRequestTagFilter self = new DescribeReleasedResourcesRequestTagFilter();
            return TeaModel.build(map, self);
        }

        public DescribeReleasedResourcesRequestTagFilter setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public DescribeReleasedResourcesRequestTagFilter setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeReleasedResourcesRequestTagFilter setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

}
