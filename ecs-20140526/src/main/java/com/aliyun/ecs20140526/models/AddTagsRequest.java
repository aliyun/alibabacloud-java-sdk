// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AddTagsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the resource. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource. When the resources are instances, this parameter can be interpreted as InstanceId.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp1gtjxuuvwj17zr****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>instance: ECS instance</li>
     * <li>disk: disk</li>
     * <li>snapshot: snapshot</li>
     * <li>image: image</li>
     * <li>securitygroup: security group</li>
     * <li>volume: storage volume</li>
     * <li>eni: elastic network interface (ENI)</li>
     * <li>ddh: dedicated host</li>
     * <li>keypair: SSH key pair</li>
     * <li>launchtemplate: launch template</li>
     * <li>reservedinstance: reserved instance</li>
     * <li>snapshotpolicy: automatic snapshot policy</li>
     * </ul>
     * <p>All values must be lowercase.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tags.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddTagsRequestTag> tag;

    public static AddTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTagsRequest self = new AddTagsRequest();
        return TeaModel.build(map, self);
    }

    public AddTagsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddTagsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddTagsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AddTagsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddTagsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddTagsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AddTagsRequest setTag(java.util.List<AddTagsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddTagsRequestTag> getTag() {
        return this.tag;
    }

    public static class AddTagsRequestTag extends TeaModel {
        /**
         * <p>The key of tag N of the resource. Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain <a href="http://https://">http:// or https://</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the resource. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot start with acs: or aliyun. It cannot contain <a href="http://https://">http:// or https://</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddTagsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddTagsRequestTag self = new AddTagsRequestTag();
            return TeaModel.build(map, self);
        }

        public AddTagsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddTagsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
