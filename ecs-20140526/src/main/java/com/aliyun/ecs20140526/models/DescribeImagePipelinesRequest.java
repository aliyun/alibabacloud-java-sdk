// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesRequest extends TeaModel {
    /**
     * <p>The IDs of image templates. Valid values of N: 1 to 20.</p>
     */
    @NameInMap("ImagePipelineId")
    public java.util.List<String> imagePipelineId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 500.</p>
     * <br>
     * <p>Default value: 50.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the image template.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of `NextToken`.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the image template. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group. If this parameter is specified to query resources, up to 1,000 resources that belong to the specified resource group can be displayed in the response.</p>
     * <br>
     * <p>>  Resources in the default resource group are displayed in the response regardless of how this parameter is set.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tags of the image template.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeImagePipelinesRequestTag> tag;

    public static DescribeImagePipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelinesRequest self = new DescribeImagePipelinesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelinesRequest setImagePipelineId(java.util.List<String> imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public java.util.List<String> getImagePipelineId() {
        return this.imagePipelineId;
    }

    public DescribeImagePipelinesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeImagePipelinesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeImagePipelinesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelinesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImagePipelinesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImagePipelinesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImagePipelinesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeImagePipelinesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImagePipelinesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeImagePipelinesRequest setTag(java.util.List<DescribeImagePipelinesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImagePipelinesRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeImagePipelinesRequestTag extends TeaModel {
        /**
         * <p>The key of tag N. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N. Valid values of N: 1 to 20.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeImagePipelinesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelinesRequestTag self = new DescribeImagePipelinesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelinesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImagePipelinesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
