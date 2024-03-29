// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddShortUrlRequest extends TeaModel {
    @NameInMap("EffectiveDays")
    public String effectiveDays;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ShortUrlName")
    public String shortUrlName;

    @NameInMap("SourceUrl")
    public String sourceUrl;

    public static AddShortUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        AddShortUrlRequest self = new AddShortUrlRequest();
        return TeaModel.build(map, self);
    }

    public AddShortUrlRequest setEffectiveDays(String effectiveDays) {
        this.effectiveDays = effectiveDays;
        return this;
    }
    public String getEffectiveDays() {
        return this.effectiveDays;
    }

    public AddShortUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddShortUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddShortUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddShortUrlRequest setShortUrlName(String shortUrlName) {
        this.shortUrlName = shortUrlName;
        return this;
    }
    public String getShortUrlName() {
        return this.shortUrlName;
    }

    public AddShortUrlRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

}
