// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeResourceAggregationsRequest extends TeaModel {
    @NameInMap("Aggregators")
    public java.util.List<String> aggregators;

    @NameInMap("Filter")
    public java.util.List<Filter> filter;

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
    public java.util.List<TagFilter> tagFilter;

    public static DescribeResourceAggregationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceAggregationsRequest self = new DescribeResourceAggregationsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceAggregationsRequest setAggregators(java.util.List<String> aggregators) {
        this.aggregators = aggregators;
        return this;
    }
    public java.util.List<String> getAggregators() {
        return this.aggregators;
    }

    public DescribeResourceAggregationsRequest setFilter(java.util.List<Filter> filter) {
        this.filter = filter;
        return this;
    }
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    public DescribeResourceAggregationsRequest setGlobal(String global) {
        this.global = global;
        return this;
    }
    public String getGlobal() {
        return this.global;
    }

    public DescribeResourceAggregationsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeResourceAggregationsRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

    public DescribeResourceAggregationsRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public DescribeResourceAggregationsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeResourceAggregationsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeResourceAggregationsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeResourceAggregationsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceAggregationsRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeResourceAggregationsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeResourceAggregationsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeResourceAggregationsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeResourceAggregationsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceAggregationsRequest setTagFilter(java.util.List<TagFilter> tagFilter) {
        this.tagFilter = tagFilter;
        return this;
    }
    public java.util.List<TagFilter> getTagFilter() {
        return this.tagFilter;
    }

    public static class Filter extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValue")
        public String attributeValue;

        @NameInMap("Operation")
        public String operation;

        public static Filter build(java.util.Map<String, ?> map) throws Exception {
            Filter self = new Filter();
            return TeaModel.build(map, self);
        }

        public Filter setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public Filter setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public Filter setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

    public static class TagFilter extends TeaModel {
        @NameInMap("Operation")
        public String operation;

        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValues")
        public java.util.List<String> tagValues;

        public static TagFilter build(java.util.Map<String, ?> map) throws Exception {
            TagFilter self = new TagFilter();
            return TeaModel.build(map, self);
        }

        public TagFilter setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public TagFilter setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public TagFilter setTagValues(java.util.List<String> tagValues) {
            this.tagValues = tagValues;
            return this;
        }
        public java.util.List<String> getTagValues() {
            return this.tagValues;
        }

    }

}
