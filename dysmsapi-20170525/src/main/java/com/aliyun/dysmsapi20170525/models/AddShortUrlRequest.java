// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddShortUrlRequest extends TeaModel {
    /**
     * <p>The validity period of the short URL. Unit: days. The maximum validity period is 90 days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("EffectiveDays")
    public String effectiveDays;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The service name of the short URL. The name cannot exceed 13 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>The Alibaba Cloud Short Link service.</p>
     */
    @NameInMap("ShortUrlName")
    public String shortUrlName;

    /**
     * <p>The source URL. The URL cannot exceed 1,000 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.****.com/product/sms">https://www.****.com/product/sms</a></p>
     */
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
