// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class DescribeResourceRecommendFiltersRequest extends TeaModel {
    @NameInMap("AttributeName")
    public String attributeName;

    @NameInMap("AttributeValue")
    public String attributeValue;

    @NameInMap("Global")
    public String global;

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

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeResourceRecommendFiltersRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceRecommendFiltersRequest self = new DescribeResourceRecommendFiltersRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceRecommendFiltersRequest setAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    public String getAttributeName() {
        return this.attributeName;
    }

    public DescribeResourceRecommendFiltersRequest setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
        return this;
    }
    public String getAttributeValue() {
        return this.attributeValue;
    }

    public DescribeResourceRecommendFiltersRequest setGlobal(String global) {
        this.global = global;
        return this;
    }
    public String getGlobal() {
        return this.global;
    }

    public DescribeResourceRecommendFiltersRequest setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public DescribeResourceRecommendFiltersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeResourceRecommendFiltersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeResourceRecommendFiltersRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public DescribeResourceRecommendFiltersRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceRecommendFiltersRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeResourceRecommendFiltersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeResourceRecommendFiltersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeResourceRecommendFiltersRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
