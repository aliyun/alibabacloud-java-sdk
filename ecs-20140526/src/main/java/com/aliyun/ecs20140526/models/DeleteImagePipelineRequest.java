// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImagePipelineRequest extends TeaModel {
    /**
     * <p>The ID of the image template.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImagePipelineId")
    public String imagePipelineId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the image template. You can call the [DescribeRegions](https://help.aliyun.com/document_detail/25609.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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

}
