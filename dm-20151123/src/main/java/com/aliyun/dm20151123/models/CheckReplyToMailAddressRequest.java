// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckReplyToMailAddressRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Region")
    public String region;

    @NameInMap("MailAddressId")
    public Integer mailAddressId;

    public static CheckReplyToMailAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckReplyToMailAddressRequest self = new CheckReplyToMailAddressRequest();
        return TeaModel.build(map, self);
    }

    public CheckReplyToMailAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckReplyToMailAddressRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckReplyToMailAddressRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckReplyToMailAddressRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckReplyToMailAddressRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CheckReplyToMailAddressRequest setMailAddressId(Integer mailAddressId) {
        this.mailAddressId = mailAddressId;
        return this;
    }
    public Integer getMailAddressId() {
        return this.mailAddressId;
    }

}
