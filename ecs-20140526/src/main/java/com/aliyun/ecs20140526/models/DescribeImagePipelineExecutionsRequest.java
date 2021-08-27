// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeImagePipelineExecutionsRequest extends TeaModel {
    @NameInMap("Tag")
    public java.util.List<DescribeImagePipelineExecutionsRequestTag> tag;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("Status")
    public String status;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static DescribeImagePipelineExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImagePipelineExecutionsRequest self = new DescribeImagePipelineExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImagePipelineExecutionsRequest setTag(java.util.List<DescribeImagePipelineExecutionsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeImagePipelineExecutionsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeImagePipelineExecutionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeImagePipelineExecutionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeImagePipelineExecutionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeImagePipelineExecutionsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeImagePipelineExecutionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeImagePipelineExecutionsRequest setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

    public DescribeImagePipelineExecutionsRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public DescribeImagePipelineExecutionsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeImagePipelineExecutionsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeImagePipelineExecutionsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public static class DescribeImagePipelineExecutionsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeImagePipelineExecutionsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeImagePipelineExecutionsRequestTag self = new DescribeImagePipelineExecutionsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeImagePipelineExecutionsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeImagePipelineExecutionsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
