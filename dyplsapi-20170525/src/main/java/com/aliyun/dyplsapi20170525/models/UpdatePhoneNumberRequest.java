// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdatePhoneNumberRequest extends TeaModel {
    @NameInMap("BindToken")
    public String bindToken;

    @NameInMap("NewPhoneNo")
    public String newPhoneNo;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecretNo")
    public String secretNo;

    @NameInMap("SubsId")
    public Long subsId;

    public static UpdatePhoneNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneNumberRequest self = new UpdatePhoneNumberRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneNumberRequest setBindToken(String bindToken) {
        this.bindToken = bindToken;
        return this;
    }
    public String getBindToken() {
        return this.bindToken;
    }

    public UpdatePhoneNumberRequest setNewPhoneNo(String newPhoneNo) {
        this.newPhoneNo = newPhoneNo;
        return this;
    }
    public String getNewPhoneNo() {
        return this.newPhoneNo;
    }

    public UpdatePhoneNumberRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdatePhoneNumberRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public UpdatePhoneNumberRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdatePhoneNumberRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdatePhoneNumberRequest setSecretNo(String secretNo) {
        this.secretNo = secretNo;
        return this;
    }
    public String getSecretNo() {
        return this.secretNo;
    }

    public UpdatePhoneNumberRequest setSubsId(Long subsId) {
        this.subsId = subsId;
        return this;
    }
    public Long getSubsId() {
        return this.subsId;
    }

}
