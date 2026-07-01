// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryShortUrlRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The short link to query. Obtain this URL by calling the <a href="https://help.aliyun.com/document_detail/186774.html">AddShortUrl</a> API.</p>
     * <blockquote>
     * <p>Notice: </p>
     * </blockquote>
     * <p>This API is not currently supported by Short Message Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>http://****.cn/6y8uy7</p>
     */
    @NameInMap("ShortUrl")
    public String shortUrl;

    public static QueryShortUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShortUrlRequest self = new QueryShortUrlRequest();
        return TeaModel.build(map, self);
    }

    public QueryShortUrlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryShortUrlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryShortUrlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryShortUrlRequest setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
        return this;
    }
    public String getShortUrl() {
        return this.shortUrl;
    }

}
