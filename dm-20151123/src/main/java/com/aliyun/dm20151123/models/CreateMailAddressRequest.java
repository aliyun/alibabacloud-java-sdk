// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateMailAddressRequest extends TeaModel {
    /**
     * <p>Sender\&quot;s email address</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test1@example.com">test1@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Reply-to address</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test2@example.com">test2@example.com</a></p>
     */
    @NameInMap("ReplyAddress")
    public String replyAddress;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Type of sending. Values:</p>
     * <ul>
     * <li><p>batch: Bulk emails</p>
     * </li>
     * <li><p>trigger: Triggered emails</p>
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
