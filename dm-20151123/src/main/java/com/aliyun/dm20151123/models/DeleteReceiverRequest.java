// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteReceiverRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the recipient list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1453</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteReceiverRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReceiverRequest self = new DeleteReceiverRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReceiverRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteReceiverRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public DeleteReceiverRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteReceiverRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
