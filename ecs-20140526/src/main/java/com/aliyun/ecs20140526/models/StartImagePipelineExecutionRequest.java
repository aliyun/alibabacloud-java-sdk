// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartImagePipelineExecutionRequest extends TeaModel {
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
    public java.util.List<StartImagePipelineExecutionRequestTemplateTag> templateTag;

    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static StartImagePipelineExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartImagePipelineExecutionRequest self = new StartImagePipelineExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StartImagePipelineExecutionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartImagePipelineExecutionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartImagePipelineExecutionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StartImagePipelineExecutionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StartImagePipelineExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartImagePipelineExecutionRequest setTemplateTag(java.util.List<StartImagePipelineExecutionRequestTemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<StartImagePipelineExecutionRequestTemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public StartImagePipelineExecutionRequest setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

    public StartImagePipelineExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class StartImagePipelineExecutionRequestTemplateTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static StartImagePipelineExecutionRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            StartImagePipelineExecutionRequestTemplateTag self = new StartImagePipelineExecutionRequestTemplateTag();
            return TeaModel.build(map, self);
        }

        public StartImagePipelineExecutionRequestTemplateTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartImagePipelineExecutionRequestTemplateTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
