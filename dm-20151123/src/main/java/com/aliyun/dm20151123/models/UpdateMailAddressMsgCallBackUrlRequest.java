// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class UpdateMailAddressMsgCallBackUrlRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("MailFrom")
    public String mailFrom;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    public static UpdateMailAddressMsgCallBackUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMailAddressMsgCallBackUrlRequest self = new UpdateMailAddressMsgCallBackUrlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMailAddressMsgCallBackUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateMailAddressMsgCallBackUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateMailAddressMsgCallBackUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateMailAddressMsgCallBackUrlRequest setMailFrom(String mailFrom) {
        this.mailFrom = mailFrom;
        return this;
    }
    public String getMailFrom() {
        return this.mailFrom;
    }

    public UpdateMailAddressMsgCallBackUrlRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

}
