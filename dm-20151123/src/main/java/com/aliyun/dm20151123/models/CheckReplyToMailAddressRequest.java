// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckReplyToMailAddressRequest extends TeaModel {
    /**
     * <p>Language.</p>
     * <p>en is English, and any other value or an empty value defaults to Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Sender Address ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>126545</p>
     */
    @NameInMap("MailAddressId")
    public Integer mailAddressId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Region</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
