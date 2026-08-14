// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateMailAddressRequest extends TeaModel {
    /**
     * <p>The sender address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Account+@+domain</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The type of the address to create. Valid values:
     * EXTERNAL: The domain name of the address to create has not been created in this system.
     * INTERNAL: The domain name of the address to create has already been created in this system.</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The reply-to address.</p>
     * 
     * <strong>example:</strong>
     * <p>test1***@example.net</p>
     */
    @NameInMap("ReplyAddress")
    public String replyAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The type of email. Valid values:</p>
     * <ul>
     * <li><p>batch: batch email</p>
     * </li>
     * <li><p>trigger: triggered email</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>batch</p>
     */
    @NameInMap("Sendtype")
    public String sendtype;

    public static CreateMailAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMailAddressRequest self = new CreateMailAddressRequest();
        return TeaModel.build(map, self);
    }

    public CreateMailAddressRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateMailAddressRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateMailAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateMailAddressRequest setReplyAddress(String replyAddress) {
        this.replyAddress = replyAddress;
        return this;
    }
    public String getReplyAddress() {
        return this.replyAddress;
    }

    public CreateMailAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateMailAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateMailAddressRequest setSendtype(String sendtype) {
        this.sendtype = sendtype;
        return this;
    }
    public String getSendtype() {
        return this.sendtype;
    }

}
