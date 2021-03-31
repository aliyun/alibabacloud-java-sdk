// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Tag")
    public java.util.List<DescribeImageComponentsRequestTag> tag;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ImageComponentId")
    public java.util.List<String> imageComponentId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static DescribeImageComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageComponentsRequest self = new DescribeImageComponentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageComponentsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImageComponentsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImageComponentsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeImageComponentsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImageComponentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageComponentsRequest setTag(java.util.List<DescribeImageComponentsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImageComponentsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeImageComponentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeImageComponentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeImageComponentsRequest setImageComponentId(java.util.List<String> imageComponentId) {
        this.imageComponentId = imageComponentId;
        return this;
    }
    public java.util.List<String> getImageComponentId() {
        return this.imageComponentId;
    }

    public DescribeImageComponentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageComponentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class DescribeImageComponentsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeImageComponentsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageComponentsRequestTag self = new DescribeImageComponentsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeImageComponentsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImageComponentsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
