// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryShortUrlDetailNewRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProdCode")
    public String prodCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ShortUrlId")
    public String shortUrlId;

    public static QueryShortUrlDetailNewRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryShortUrlDetailNewRequest self = new QueryShortUrlDetailNewRequest();
        return TeaModel.build(map, self);
    }

    public QueryShortUrlDetailNewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryShortUrlDetailNewRequest setProdCode(String prodCode) {
        this.prodCode = prodCode;
        return this;
    }
    public String getProdCode() {
        return this.prodCode;
    }

    public QueryShortUrlDetailNewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryShortUrlDetailNewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryShortUrlDetailNewRequest setShortUrlId(String shortUrlId) {
        this.shortUrlId = shortUrlId;
        return this;
    }
    public String getShortUrlId() {
        return this.shortUrlId;
    }

}
