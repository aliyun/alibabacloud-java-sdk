// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribePriceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PriceInfo")
    @Validation(required = true)
    public DescribePriceResponsePriceInfo priceInfo;

    public static DescribePriceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponse self = new DescribePriceResponse();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponse setPriceInfo(DescribePriceResponsePriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public DescribePriceResponsePriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public static class DescribePriceResponsePriceInfoPrice extends TeaModel {
        @NameInMap("DiscountPrice")
        @Validation(required = true)
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        @Validation(required = true)
        public Float originalPrice;

        @NameInMap("TradePrice")
        @Validation(required = true)
        public Float tradePrice;

        @NameInMap("Currency")
        @Validation(required = true)
        public String currency;

        public static DescribePriceResponsePriceInfoPrice build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfoPrice self = new DescribePriceResponsePriceInfoPrice();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfoPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public DescribePriceResponsePriceInfoPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponsePriceInfoPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribePriceResponsePriceInfoPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

    public static class DescribePriceResponsePriceInfo extends TeaModel {
        @NameInMap("Price")
        @Validation(required = true)
        public DescribePriceResponsePriceInfoPrice price;

        public static DescribePriceResponsePriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponsePriceInfo self = new DescribePriceResponsePriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponsePriceInfo setPrice(DescribePriceResponsePriceInfoPrice price) {
            this.price = price;
            return this;
        }
        public DescribePriceResponsePriceInfoPrice getPrice() {
            return this.price;
        }

    }

}
