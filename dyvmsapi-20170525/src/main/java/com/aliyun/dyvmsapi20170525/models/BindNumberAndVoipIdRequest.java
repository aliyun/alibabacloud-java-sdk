// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class BindNumberAndVoipIdRequest extends TeaModel {
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

    public static BindNumberAndVoipIdRequest build(java.util.Map<String, ?> map) throws Exception {
        BindNumberAndVoipIdRequest self = new BindNumberAndVoipIdRequest();
        return TeaModel.build(map, self);
    }

    public BindNumberAndVoipIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindNumberAndVoipIdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindNumberAndVoipIdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindNumberAndVoipIdRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public BindNumberAndVoipIdRequest setVoipId(String voipId) {
        this.voipId = voipId;
        return this;
    }
    public String getVoipId() {
        return this.voipId;
    }

}
