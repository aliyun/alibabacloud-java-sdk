// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class SaveReceiverDetailRequest extends TeaModel {
    @NameInMap("Detail")
    public String detail;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReceiverId")
    public String receiverId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static SaveReceiverDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveReceiverDetailRequest self = new SaveReceiverDetailRequest();
        return TeaModel.build(map, self);
    }

    public SaveReceiverDetailRequest setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public SaveReceiverDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SaveReceiverDetailRequest setReceiverId(String receiverId) {
        this.receiverId = receiverId;
        return this;
    }
    public String getReceiverId() {
        return this.receiverId;
    }

    public SaveReceiverDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SaveReceiverDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
