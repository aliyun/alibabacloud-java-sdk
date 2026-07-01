// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class AddShortUrlRequest extends TeaModel {
    /**
     * <p>The validity period of the short URL, in days. The maximum value is 90.</p>
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
     * <p>The name of the short URL. Maximum length: 13 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里短链测试</p>
     */
    @NameInMap("ShortUrlName")
    public String shortUrlName;

    /**
     * <p>The URL that you want to shorten. Maximum length: 1,000 characters.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>Short Message Service does not currently support this API operation.</p>
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
