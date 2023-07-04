// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateSmartShortUrlRequest extends TeaModel {
    @NameInMap("Expiration")
    public Long expiration;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PhoneNumbers")
    public String phoneNumbers;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SourceName")
    public String sourceName;

    @NameInMap("SourceUrl")
    public String sourceUrl;

    public static CreateSmartShortUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartShortUrlRequest self = new CreateSmartShortUrlRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmartShortUrlRequest setExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }
    public Long getExpiration() {
        return this.expiration;
    }

    public CreateSmartShortUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmartShortUrlRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public CreateSmartShortUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmartShortUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmartShortUrlRequest setSourceName(String sourceName) {
        this.sourceName = sourceName;
        return this;
    }
    public String getSourceName() {
        return this.sourceName;
    }

    public CreateSmartShortUrlRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

}
