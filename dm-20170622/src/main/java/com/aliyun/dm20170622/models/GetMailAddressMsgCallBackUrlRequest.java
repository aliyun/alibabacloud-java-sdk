// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class GetMailAddressMsgCallBackUrlRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MailFrom")
    public String mailFrom;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GetMailAddressMsgCallBackUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMailAddressMsgCallBackUrlRequest self = new GetMailAddressMsgCallBackUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetMailAddressMsgCallBackUrlRequest setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
        return this;
    }
    public String getMailFrom() {
        return this.mailFrom;
    }

    public GetMailAddressMsgCallBackUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetMailAddressMsgCallBackUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetMailAddressMsgCallBackUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
