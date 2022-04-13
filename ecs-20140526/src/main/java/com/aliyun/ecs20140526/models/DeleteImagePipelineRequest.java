// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImagePipelineRequest extends TeaModel {
    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateTag")
    public java.util.List<DeleteImagePipelineRequestTemplateTag> templateTag;

    public static DeleteImagePipelineRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagePipelineRequest self = new DeleteImagePipelineRequest();
        return TeaModel.build(map, self);
    }

    public DeleteImagePipelineRequest setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

    public DeleteImagePipelineRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DeleteImagePipelineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteImagePipelineRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteImagePipelineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteImagePipelineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteImagePipelineRequest setTemplateTag(java.util.List<DeleteImagePipelineRequestTemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<DeleteImagePipelineRequestTemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public static class DeleteImagePipelineRequestTemplateTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DeleteImagePipelineRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            DeleteImagePipelineRequestTemplateTag self = new DeleteImagePipelineRequestTemplateTag();
            return TeaModel.build(map, self);
        }

        public DeleteImagePipelineRequestTemplateTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DeleteImagePipelineRequestTemplateTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
