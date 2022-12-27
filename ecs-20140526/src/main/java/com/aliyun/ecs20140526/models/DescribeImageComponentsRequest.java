// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImageComponentsRequest extends TeaModel {
    // The IDs of the image components. You can specify up to 20 image components.
    @NameInMap("ImageComponentId")
    public java.util.List<String> imageComponentId;

    // The maximum number of entries to return on each page. Valid values: 1 to 500.
    // 
    // Default value: 50.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The name of the image component. You must specify an exact name to search for the image component.
    @NameInMap("Name")
    public String name;

    // The query token. Set the value to the `NextToken` value returned in the last call to the DescribeImageComponents operation. Leave this parameter empty the first time you call this operation.
    @NameInMap("NextToken")
    public String nextToken;

    // The type of the image component. Valid values:
    // 
    // *   SELF: the custom component that you created.
    // *   ALIYUN: the system component provided by Alibaba Cloud.
    @NameInMap("Owner")
    public String owner;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the image component. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    // The ID of the resource group. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.
    // 
    // >  Resources in the default resource group are displayed in the response regardless of how this parameter is set.
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The tags
    @NameInMap("Tag")
    public java.util.List<DescribeImageComponentsRequestTag> tag;

    public static DescribeImageComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageComponentsRequest self = new DescribeImageComponentsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageComponentsRequest setImageComponentId(java.util.List<String> imageComponentId) {
        this.imageComponentId = imageComponentId;
        return this;
    }
    public java.util.List<String> getImageComponentId() {
        return this.imageComponentId;
    }

    public DescribeImageComponentsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImageComponentsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeImageComponentsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImageComponentsRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DescribeImageComponentsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImageComponentsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImageComponentsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImageComponentsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public DescribeImageComponentsRequest setTag(java.util.List<DescribeImageComponentsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImageComponentsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeImageComponentsRequestTag extends TeaModel {
        // The key of tag N of the image component. Valid values of N: 1 to 20.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the image component. Valid values of N: 1 to 20.
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
