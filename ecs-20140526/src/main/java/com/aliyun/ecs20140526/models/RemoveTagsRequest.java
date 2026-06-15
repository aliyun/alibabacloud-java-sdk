// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RemoveTagsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the resource is located. Call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to get the latest list of Alibaba Cloud regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource from which to remove tags. For example, if ResourceType is set to instance, this parameter is the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>s-946ntx4****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li><p>instance: an ECS instance.</p>
     * </li>
     * <li><p>disk: a disk.</p>
     * </li>
     * <li><p>snapshot: a snapshot.</p>
     * </li>
     * <li><p>image: an image.</p>
     * </li>
     * <li><p>securitygroup: a security group.</p>
     * </li>
     * <li><p>volume: a volume.</p>
     * </li>
     * <li><p>eni: an elastic network interface.</p>
     * </li>
     * <li><p>ddh: a dedicated host.</p>
     * </li>
     * <li><p>keypair: an SSH key pair.</p>
     * </li>
     * <li><p>launchtemplate: a launch template.</p>
     * </li>
     * <li><p>reservedinstance: a reserved instance.</p>
     * </li>
     * <li><p>snapshotpolicy: an automatic snapshot policy.</p>
     * </li>
     * </ul>
     * <p>All values must be in lowercase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>snapshot</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>A list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<RemoveTagsRequestTag> tag;

    public static RemoveTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagsRequest self = new RemoveTagsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RemoveTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveTagsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public RemoveTagsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RemoveTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RemoveTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public RemoveTagsRequest setTag(java.util.List<RemoveTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<RemoveTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class RemoveTagsRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * <blockquote>
         * <p>For compatibility, we recommend that you use the Tag.N.Key parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The value can be an empty string and up to 128 characters long. It cannot start with aliyun or acs:, and cannot contain http\:// or https\://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static RemoveTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            RemoveTagsRequestTag self = new RemoveTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public RemoveTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public RemoveTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
