// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyPhoneWithTokenRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The token for phone number verification that is obtained by the JavaScript SDK.</p>
     */
    @NameInMap("SpToken")
    public String spToken;

    public static VerifyPhoneWithTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyPhoneWithTokenRequest self = new VerifyPhoneWithTokenRequest();
        return TeaModel.build(map, self);
    }

    public VerifyPhoneWithTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyPhoneWithTokenRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public VerifyPhoneWithTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public VerifyPhoneWithTokenRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public VerifyPhoneWithTokenRequest setSpToken(String spToken) {
        this.spToken = spToken;
        return this;
    }
    public String getSpToken() {
        return this.spToken;
    }

}
