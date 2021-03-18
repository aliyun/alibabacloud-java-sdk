// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImageComponentRequest extends TeaModel {
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

    @NameInMap("TemplateTag")
    public java.util.List<DeleteImageComponentRequestTemplateTag> templateTag;

    @NameInMap("ImageComponentId")
    public String imageComponentId;

    public static DeleteImageComponentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImageComponentRequest self = new DeleteImageComponentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImageComponentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteImageComponentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteImageComponentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteImageComponentRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteImageComponentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteImageComponentRequest setTemplateTag(java.util.List<DeleteImageComponentRequestTemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<DeleteImageComponentRequestTemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public DeleteImageComponentRequest setImageComponentId(String imageComponentId) {
        this.imageComponentId = imageComponentId;
        return this;
    }
    public String getImageComponentId() {
        return this.imageComponentId;
    }

    public static class DeleteImageComponentRequestTemplateTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DeleteImageComponentRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            DeleteImageComponentRequestTemplateTag self = new DeleteImageComponentRequestTemplateTag();
            return TeaModel.build(map, self);
        }

        public DeleteImageComponentRequestTemplateTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteImageComponentRequestTemplateTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
