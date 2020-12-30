// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dycdpapi20180610.models;

import com.aliyun.tea.*;

public class QueryCdpOfferByIdRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OfferId")
    public Long offerId;

    public static QueryCdpOfferByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCdpOfferByIdRequest self = new QueryCdpOfferByIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryCdpOfferByIdRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryCdpOfferByIdRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryCdpOfferByIdRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryCdpOfferByIdRequest setOfferId(Long offerId) {
        this.offerId = offerId;
        return this;
    }
    public Long getOfferId() {
        return this.offerId;
    }

}
