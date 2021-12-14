// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class SetPasswordRequest extends TeaModel {
    @NameInMap("NewPassword")
    public String newPassword;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResetRequired")
    public Boolean resetRequired;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("UserName")
    public String userName;

    public static SetPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        SetPasswordRequest self = new SetPasswordRequest();
        return TeaModel.build(map, self);
    }

    public SetPasswordRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public SetPasswordRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetPasswordRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public SetPasswordRequest setResetRequired(Boolean resetRequired) {
        this.resetRequired = resetRequired;
        return this;
    }
    public Boolean getResetRequired() {
        return this.resetRequired;
    }

    public SetPasswordRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SetPasswordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SetPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
