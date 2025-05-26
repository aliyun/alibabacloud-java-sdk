// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyMailAddressRequest extends TeaModel {
    /**
     * <p>Sending address ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1344565</p>
     */
    @NameInMap("MailAddressId")
    public Integer mailAddressId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <ul>
     * <li><p>Length should be 10 to 20 characters, and must include numbers, uppercase letters, and lowercase letters.</p>
     * </li>
     * <li><p>Must contain at least 2 digits, 2 uppercase letters, and 2 lowercase letters, and neither the digits nor the letters can consist of a single character repeated.</p>
     * </li>
     * <li><p>Cannot be the same as the last set password.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DM1mail1234</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>Reply address</p>
     * 
     * <strong>example:</strong>
     * <p>a***@example.net</p>
     */
    @NameInMap("ReplyAddress")
    public String replyAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyMailAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMailAddressRequest self = new ModifyMailAddressRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMailAddressRequest setMailAddressId(Integer mailAddressId) {
        this.mailAddressId = mailAddressId;
        return this;
    }
    public Integer getMailAddressId() {
        return this.mailAddressId;
    }

    public ModifyMailAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyMailAddressRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyMailAddressRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
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

}
