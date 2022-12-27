// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeResourceByTagsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    // The number of the page to return. Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Valid values: 1 to 100.
    // 
    // Default value: 50.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The region ID of the resource. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    // The type of the resource. Valid values:
    // 
    // *   instance: ECS instance
    // *   disk: disk
    // *   snapshot: snapshot
    // *   image: image
    // *   securitygroup: security group
    // *   volume: storage volume
    // *   eni: elastic network interface (ENI)
    // *   ddh: dedicated host
    // *   keypair: SSH key pair
    // *   launchtemplate: launch template
    // 
    // All the preceding values must be lowercase.
    @NameInMap("ResourceType")
    public String resourceType;

    // The tags.
    @NameInMap("Tag")
    public java.util.List<DescribeResourceByTagsRequestTag> tag;

    public static DescribeResourceByTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceByTagsRequest self = new DescribeResourceByTagsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeResourceByTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeResourceByTagsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeResourceByTagsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeResourceByTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeResourceByTagsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeResourceByTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeResourceByTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeResourceByTagsRequest setTag(java.util.List<DescribeResourceByTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeResourceByTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeResourceByTagsRequestTag extends TeaModel {
        // The key of tag N of the resource. Valid values of N: 1 to 20 The tag key cannot be an empty string. It can be up to 128 characters in length.
        @NameInMap("Key")
        public String key;

        // The value of tag N of the resource. Valid values of N: 1 to 20 The tag value can be an empty string. It can be up to 128 characters in length.
        @NameInMap("Value")
        public String value;

        public static DescribeResourceByTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceByTagsRequestTag self = new DescribeResourceByTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeResourceByTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeResourceByTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
