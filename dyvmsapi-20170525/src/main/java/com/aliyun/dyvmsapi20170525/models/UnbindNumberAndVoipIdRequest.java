// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindNumberAndVoipIdRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("VoipId")
    public String voipId;

    public static UnbindNumberAndVoipIdRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindNumberAndVoipIdRequest self = new UnbindNumberAndVoipIdRequest();
        return TeaModel.build(map, self);
    }

    public UnbindNumberAndVoipIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UnbindNumberAndVoipIdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UnbindNumberAndVoipIdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UnbindNumberAndVoipIdRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UnbindNumberAndVoipIdRequest setVoipId(String voipId) {
        this.voipId = voipId;
        return this;
    }
    public String getVoipId() {
        return this.voipId;
    }

}
