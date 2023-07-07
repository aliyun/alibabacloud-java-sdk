// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class PurchaseIntlDomainRequest extends TeaModel {
    @NameInMap("AuctionId")
    public String auctionId;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("Price")
    public Double price;

    public static PurchaseIntlDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseIntlDomainRequest self = new PurchaseIntlDomainRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseIntlDomainRequest setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public PurchaseIntlDomainRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public PurchaseIntlDomainRequest setPrice(Double price) {
        this.price = price;
        return this;
    }
    public Double getPrice() {
        return this.price;
    }

}
