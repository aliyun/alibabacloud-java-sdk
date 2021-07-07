// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSipAccountRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PartnerId")
    public Long partnerId;

    @NameInMap("BusinessKey")
    public String businessKey;

    public static CreateSipAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSipAccountRequest self = new CreateSipAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateSipAccountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSipAccountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSipAccountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSipAccountRequest setPartnerId(Long partnerId) {
        this.partnerId = partnerId;
        return this;
    }
    public Long getPartnerId() {
        return this.partnerId;
    }

    public CreateSipAccountRequest setBusinessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }
    public String getBusinessKey() {
        return this.businessKey;
    }

}
