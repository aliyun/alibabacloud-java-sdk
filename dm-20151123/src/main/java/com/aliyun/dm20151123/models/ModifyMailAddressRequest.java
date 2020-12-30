// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyMailAddressRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MailAddressId")
    public Integer mailAddressId;

    @NameInMap("ReplyAddress")
    public String replyAddress;

    @NameInMap("Password")
    public String password;

    public static ModifyMailAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMailAddressRequest self = new ModifyMailAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMailAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMailAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyMailAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyMailAddressRequest setMailAddressId(Integer mailAddressId) {
        this.mailAddressId = mailAddressId;
        return this;
    }
    public Integer getMailAddressId() {
        return this.mailAddressId;
    }

    public ModifyMailAddressRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public ModifyMailAddressRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
