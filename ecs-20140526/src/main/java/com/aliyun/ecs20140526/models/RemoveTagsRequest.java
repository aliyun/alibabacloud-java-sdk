// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RemoveTagsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The key of tag N of the resource. Valid values of N: 1 to 20. It cannot be an empty string. The tag key can be up to 64 characters in length and cannot contain http:// or https://. It cannot start with acs: or aliyun.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The key of tag N of the resource.</p>
     * <br>
     * <p>>  We recommend that you use the Tag.N.Key parameter to ensure future compatibility.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The value of tag N of the resource. Valid values of N: 1 to 20. It can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://. It cannot start with acs: or aliyun.</p>
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
         * <p>The value of tag N of the resource.</p>
         * <br>
         * <p>>  We recommend that you use the Tag.N.Value parameter to ensure future compatibility.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the resource. Valid values of N: 1 to 20. It can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://. It cannot start with acs: or aliyun.</p>
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
