// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.globalsearch20210110.models;

import com.aliyun.tea.*;

public class CountProductResourcesRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Released")
    public String released;

    @NameInMap("Request")
    public java.util.List<CountProductResourcesRequestRequest> request;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CountProductResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        CountProductResourcesRequest self = new CountProductResourcesRequest();
        return TeaModel.build(map, self);
    }

    public CountProductResourcesRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public CountProductResourcesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CountProductResourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CountProductResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CountProductResourcesRequest setReleased(String released) {
        this.released = released;
        return this;
    }
    public String getReleased() {
        return this.released;
    }

    public CountProductResourcesRequest setRequest(java.util.List<CountProductResourcesRequestRequest> request) {
        this.request = request;
        return this;
    }
    public java.util.List<CountProductResourcesRequestRequest> getRequest() {
        return this.request;
    }

    public CountProductResourcesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CountProductResourcesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CountProductResourcesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class CountProductResourcesRequestRequestFilter extends TeaModel {
        @NameInMap("AttributeName")
        public String attributeName;

        @NameInMap("AttributeValue")
        public String attributeValue;

        @NameInMap("Operation")
        public String operation;

        public static CountProductResourcesRequestRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            CountProductResourcesRequestRequestFilter self = new CountProductResourcesRequestRequestFilter();
            return TeaModel.build(map, self);
        }

        public CountProductResourcesRequestRequestFilter setAttributeName(String attributeName) {
            this.attributeName = attributeName;
            return this;
        }
        public String getAttributeName() {
            return this.attributeName;
        }

        public CountProductResourcesRequestRequestFilter setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public CountProductResourcesRequestRequestFilter setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

    }

    public static class CountProductResourcesRequestRequest extends TeaModel {
        @NameInMap("Aggregators")
        public java.util.List<String> aggregators;

        @NameInMap("Filter")
        public java.util.List<CountProductResourcesRequestRequestFilter> filter;

        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("MaxItems")
        public String maxItems;

        @NameInMap("Product")
        public String product;

        @NameInMap("ResourceType")
        public String resourceType;

        public static CountProductResourcesRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            CountProductResourcesRequestRequest self = new CountProductResourcesRequestRequest();
            return TeaModel.build(map, self);
        }

        public CountProductResourcesRequestRequest setAggregators(java.util.List<String> aggregators) {
            this.aggregators = aggregators;
            return this;
        }
        public java.util.List<String> getAggregators() {
            return this.aggregators;
        }

        public CountProductResourcesRequestRequest setFilter(java.util.List<CountProductResourcesRequestRequestFilter> filter) {
            this.filter = filter;
            return this;
        }
        public java.util.List<CountProductResourcesRequestRequestFilter> getFilter() {
            return this.filter;
        }

        public CountProductResourcesRequestRequest setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public CountProductResourcesRequestRequest setMaxItems(String maxItems) {
            this.maxItems = maxItems;
            return this;
        }
        public String getMaxItems() {
            return this.maxItems;
        }

        public CountProductResourcesRequestRequest setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public CountProductResourcesRequestRequest setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

    }

}
