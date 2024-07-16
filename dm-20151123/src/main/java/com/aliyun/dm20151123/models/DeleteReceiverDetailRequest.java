// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteReceiverDetailRequest extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123534</p>
     */
    @NameInMap("ReceiverId")
    public String receiverId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteReceiverDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReceiverDetailRequest self = new DeleteReceiverDetailRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReceiverDetailRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public DeleteReceiverDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteReceiverDetailRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public DeleteReceiverDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteReceiverDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
