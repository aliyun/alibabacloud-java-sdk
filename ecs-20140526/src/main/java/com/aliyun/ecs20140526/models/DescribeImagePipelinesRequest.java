// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelinesRequest extends TeaModel {
    /**
     * <p>The IDs of the image pipelines. You can specify up to 20 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>ip-2ze5tsl5bp6nf2b3****</p>
     */
    @NameInMap("ImagePipelineId")
    public java.util.List<String> imagePipelineId;

    /**
     * <p>The number of entries to return per page. Valid values: 1 to 500.</p>
     * <p>Default value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The name of the image pipeline.</p>
     * 
     * <strong>example:</strong>
     * <p>testImagePipeline</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The pagination token. To retrieve the next page of results, set this parameter to the <code>NextToken</code> value from the previous response. Omit this parameter on your first request.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to view the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID. If you use this parameter for filtering, you can query a maximum of 1,000 resources.</p>
     * <blockquote>
     * <p>Filtering by the default resource group is not supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-bp67acfmxazb4p****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>A list of tags.</p>
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
         * <p>The key of a tag. Up to 20 tags are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of a tag. Up to 20 tags are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
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
