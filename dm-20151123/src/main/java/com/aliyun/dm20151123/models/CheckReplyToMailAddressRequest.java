// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckReplyToMailAddressRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MailAddressId")
    public Integer mailAddressId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CheckReplyToMailAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckReplyToMailAddressRequest self = new CheckReplyToMailAddressRequest();
        return TeaModel.build(map, self);
    }

    public CheckReplyToMailAddressRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CheckReplyToMailAddressRequest setMailAddressId(Integer mailAddressId) {
        this.mailAddressId = mailAddressId;
        return this;
    }
    public Integer getMailAddressId() {
        return this.mailAddressId;
    }

    public CheckReplyToMailAddressRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckReplyToMailAddressRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
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

}
