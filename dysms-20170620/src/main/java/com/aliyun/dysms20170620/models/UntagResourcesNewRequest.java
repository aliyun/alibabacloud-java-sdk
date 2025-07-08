// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class UntagResourcesNewRequest extends TeaModel {
    @NameInMap("All")
    public Boolean all;

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

    @NameInMap("TagListString")
    public String tagListString;

    @NameInMap("Tags")
    public java.util.List<UntagResourcesNewRequestTags> tags;

    public static UntagResourcesNewRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesNewRequest self = new UntagResourcesNewRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesNewRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UntagResourcesNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public UntagResourcesNewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesNewRequest setResourceId(java.util.List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.List<String> getResourceId() {
        return this.resourceId;
    }

    public UntagResourcesNewRequest setResourceIdListString(String resourceIdListString) {
        this.resourceIdListString = resourceIdListString;
        return this;
    }
    public String getResourceIdListString() {
        return this.resourceIdListString;
    }

    public UntagResourcesNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UntagResourcesNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UntagResourcesNewRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesNewRequest setTagListString(String tagListString) {
        this.tagListString = tagListString;
        return this;
    }
    public String getTagListString() {
        return this.tagListString;
    }

    public UntagResourcesNewRequest setTags(java.util.List<UntagResourcesNewRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UntagResourcesNewRequestTags> getTags() {
        return this.tags;
    }

    public static class UntagResourcesNewRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static UntagResourcesNewRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UntagResourcesNewRequestTags self = new UntagResourcesNewRequestTags();
            return TeaModel.build(map, self);
        }

        public UntagResourcesNewRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UntagResourcesNewRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
