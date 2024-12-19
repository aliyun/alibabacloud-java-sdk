// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartImagePipelineExecutionRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among requests. <strong>The token can contain only ASCII characters and cannot exceed 64 characters in length.</strong> For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the image template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip-2ze5tsl5bp6nf2b3****</p>
     */
    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent list of regions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Tag")
    public java.util.List<StartImagePipelineExecutionRequestTag> tag;

    /**
     * <blockquote>
     * <p>This parameter is deprecated.</p>
     * </blockquote>
     */
    @NameInMap("TemplateTag")
    @Deprecated
    public java.util.List<StartImagePipelineExecutionRequestTemplateTag> templateTag;

    public static StartImagePipelineExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        StartImagePipelineExecutionRequest self = new StartImagePipelineExecutionRequest();
        return TeaModel.build(map, self);
    }

    public StartImagePipelineExecutionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public StartImagePipelineExecutionRequest setImagePipelineId(String imagePipelineId) {
        this.imagePipelineId = imagePipelineId;
        return this;
    }
    public String getImagePipelineId() {
        return this.imagePipelineId;
    }

    public StartImagePipelineExecutionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public StartImagePipelineExecutionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartImagePipelineExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public StartImagePipelineExecutionRequest setTag(java.util.List<StartImagePipelineExecutionRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<StartImagePipelineExecutionRequestTag> getTag() {
        return this.tag;
    }

    public StartImagePipelineExecutionRequest setTemplateTag(java.util.List<StartImagePipelineExecutionRequestTemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<StartImagePipelineExecutionRequestTemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public static class StartImagePipelineExecutionRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static StartImagePipelineExecutionRequestTag build(java.util.Map<String, ?> map) throws Exception {
            StartImagePipelineExecutionRequestTag self = new StartImagePipelineExecutionRequestTag();
            return TeaModel.build(map, self);
        }

        public StartImagePipelineExecutionRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public StartImagePipelineExecutionRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class StartImagePipelineExecutionRequestTemplateTag extends TeaModel {
        /**
         * <blockquote>
         * <p>This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <blockquote>
         * <p>This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
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
