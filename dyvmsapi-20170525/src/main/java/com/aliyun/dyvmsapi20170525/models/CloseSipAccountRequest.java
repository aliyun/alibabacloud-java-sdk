// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloseSipAccountRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PartnerId")
    public Long partnerId;

    @NameInMap("SipAccountID")
    public String sipAccountID;

    public static CloseSipAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseSipAccountRequest self = new CloseSipAccountRequest();
        return TeaModel.build(map, self);
    }

    public CloseSipAccountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloseSipAccountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloseSipAccountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloseSipAccountRequest setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    public Long getPartnerId() {
        return this.partnerId;
    }

    public CloseSipAccountRequest setSipAccountID(String sipAccountID) {
        this.sipAccountID = sipAccountID;
        return this;
    }
    public String getSipAccountID() {
        return this.sipAccountID;
    }

}
