// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class TagResourcesNewRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceId")
    public java.util.List<String> resourceId;

    @NameInMap("ResourceIdListString")
    public String resourceIdListString;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Tag")
    public java.util.List<TagResourcesNewRequestTag> tag;

    @NameInMap("TagListString")
    public String tagListString;

    public static TagResourcesNewRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesNewRequest self = new TagResourcesNewRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TagResourcesNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public TagResourcesNewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesNewRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public TagResourcesNewRequest setResourceIdListString(String resourceIdListString) {
        this.resourceIdListString = resourceIdListString;
        return this;
    }
    public String getResourceIdListString() {
        return this.resourceIdListString;
    }

    public TagResourcesNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TagResourcesNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TagResourcesNewRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesNewRequest setTag(java.util.List<TagResourcesNewRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<TagResourcesNewRequestTag> getTag() {
        return this.tag;
    }

    public TagResourcesNewRequest setTagListString(String tagListString) {
        this.tagListString = tagListString;
        return this;
    }
    public String getTagListString() {
        return this.tagListString;
    }

    public static class TagResourcesNewRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static TagResourcesNewRequestTag build(java.util.Map<String, ?> map) throws Exception {
            TagResourcesNewRequestTag self = new TagResourcesNewRequestTag();
            return TeaModel.build(map, self);
        }

        public TagResourcesNewRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public TagResourcesNewRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
