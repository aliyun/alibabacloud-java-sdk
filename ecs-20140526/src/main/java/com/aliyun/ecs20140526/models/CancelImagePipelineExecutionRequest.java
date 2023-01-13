// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelImagePipelineExecutionRequest extends TeaModel {
    /**
     * <p>The ID of the image build task.</p>
     */
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the image build task. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>> This parameter is deprecated.</p>
     */
    @NameInMap("TemplateTag")
    public java.util.List<CancelImagePipelineExecutionRequestTemplateTag> templateTag;

    public static CancelImagePipelineExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelImagePipelineExecutionRequest self = new CancelImagePipelineExecutionRequest();
        return TeaModel.build(map, self);
    }

    public CancelImagePipelineExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public CancelImagePipelineExecutionRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CancelImagePipelineExecutionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CancelImagePipelineExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CancelImagePipelineExecutionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CancelImagePipelineExecutionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CancelImagePipelineExecutionRequest setTemplateTag(java.util.List<CancelImagePipelineExecutionRequestTemplateTag> templateTag) {
        this.templateTag = templateTag;
        return this;
    }
    public java.util.List<CancelImagePipelineExecutionRequestTemplateTag> getTemplateTag() {
        return this.templateTag;
    }

    public static class CancelImagePipelineExecutionRequestTemplateTag extends TeaModel {
        /**
         * <p>>  This parameter is deprecated.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>>  This parameter is deprecated.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CancelImagePipelineExecutionRequestTemplateTag build(java.util.Map<String, ?> map) throws Exception {
            CancelImagePipelineExecutionRequestTemplateTag self = new CancelImagePipelineExecutionRequestTemplateTag();
            return TeaModel.build(map, self);
        }

        public CancelImagePipelineExecutionRequestTemplateTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CancelImagePipelineExecutionRequestTemplateTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
