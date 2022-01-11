// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class BidDomainRequest extends TeaModel {
    @NameInMap("AuctionId")
    public String auctionId;

    @NameInMap("Currency")
    public String currency;

    @NameInMap("MaxBid")
    public Float maxBid;

    public static BidDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        BidDomainRequest self = new BidDomainRequest();
        return TeaModel.build(map, self);
    }

    public BidDomainRequest setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public BidDomainRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public BidDomainRequest setMaxBid(Float maxBid) {
        this.maxBid = maxBid;
        return this;
    }
    public Float getMaxBid() {
        return this.maxBid;
    }

}
