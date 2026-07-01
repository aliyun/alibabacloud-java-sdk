// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteShortUrlRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The source URL. The URL must not exceed 1,000 characters.</p>
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

    public static DeleteShortUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteShortUrlRequest self = new DeleteShortUrlRequest();
        return TeaModel.build(map, self);
    }

    public DeleteShortUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteShortUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteShortUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DeleteShortUrlRequest setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }
    public String getSourceUrl() {
        return this.sourceUrl;
    }

}
