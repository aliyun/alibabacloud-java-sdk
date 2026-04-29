// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class UpdateProxyPriceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>sc123456</p>
     */
    @NameInMap("AuctionId")
    public String auctionId;

    /**
     * <strong>example:</strong>
     * <p>RMB</p>
     */
    @NameInMap("Currency")
    public String currency;

    /**
     * <strong>example:</strong>
     * <p>100.00</p>
     */
    @NameInMap("Price")
    public Float price;

    public static UpdateProxyPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateProxyPriceRequest self = new UpdateProxyPriceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateProxyPriceRequest setAuctionId(String auctionId) {
        this.auctionId = auctionId;
        return this;
    }
    public String getAuctionId() {
        return this.auctionId;
    }

    public UpdateProxyPriceRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public UpdateProxyPriceRequest setPrice(Float price) {
        this.price = price;
        return this;
    }
    public Float getPrice() {
        return this.price;
    }

}
