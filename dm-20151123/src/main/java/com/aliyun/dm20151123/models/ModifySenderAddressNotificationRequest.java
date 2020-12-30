// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifySenderAddressNotificationRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SenderAddressId")
    public String senderAddressId;

    @NameInMap("SenderAddress")
    public String senderAddress;

    @NameInMap("Region")
    public String region;

    @NameInMap("Status")
    public String status;

    public static ModifySenderAddressNotificationRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySenderAddressNotificationRequest self = new ModifySenderAddressNotificationRequest();
        return TeaModel.build(map, self);
    }

    public ModifySenderAddressNotificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifySenderAddressNotificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifySenderAddressNotificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifySenderAddressNotificationRequest setSenderAddressId(String senderAddressId) {
        this.senderAddressId = senderAddressId;
        return this;
    }
    public String getSenderAddressId() {
        return this.senderAddressId;
    }

    public ModifySenderAddressNotificationRequest setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
        return this;
    }
    public String getSenderAddress() {
        return this.senderAddress;
    }

    public ModifySenderAddressNotificationRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public ModifySenderAddressNotificationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
