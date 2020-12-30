// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class TwiceTelVerifyRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Since")
    public String since;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    public static TwiceTelVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        TwiceTelVerifyRequest self = new TwiceTelVerifyRequest();
        return TeaModel.build(map, self);
    }

    public TwiceTelVerifyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TwiceTelVerifyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TwiceTelVerifyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TwiceTelVerifyRequest setSince(String since) {
        this.since = since;
        return this;
    }
    public String getSince() {
        return this.since;
    }

    public TwiceTelVerifyRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
