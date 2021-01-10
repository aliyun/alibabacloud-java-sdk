// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeactivateMediaWorkflowRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MediaWorkflowId")
    public String mediaWorkflowId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static DeactivateMediaWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        DeactivateMediaWorkflowRequest self = new DeactivateMediaWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public DeactivateMediaWorkflowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeactivateMediaWorkflowRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeactivateMediaWorkflowRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeactivateMediaWorkflowRequest setMediaWorkflowId(String mediaWorkflowId) {
        this.mediaWorkflowId = mediaWorkflowId;
        return this;
    }
    public String getMediaWorkflowId() {
        return this.mediaWorkflowId;
    }

    public DeactivateMediaWorkflowRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
