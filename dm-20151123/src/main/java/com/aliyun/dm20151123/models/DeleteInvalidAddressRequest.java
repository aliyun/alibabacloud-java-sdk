// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteInvalidAddressRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>test1***@example.net</p>
     */
    @NameInMap("ToAddress")
    public String toAddress;

    public static DeleteInvalidAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvalidAddressRequest self = new DeleteInvalidAddressRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInvalidAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteInvalidAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteInvalidAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteInvalidAddressRequest setToAddress(String toAddress) {
        this.toAddress = toAddress;
        return this;
    }
    public String getToAddress() {
        return this.toAddress;
    }

}
