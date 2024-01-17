// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AskSessionPackagePriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<AskSessionPackagePriceResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static AskSessionPackagePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AskSessionPackagePriceResponseBody self = new AskSessionPackagePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public AskSessionPackagePriceResponseBody setData(java.util.List<AskSessionPackagePriceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AskSessionPackagePriceResponseBodyData> getData() {
        return this.data;
    }

    public AskSessionPackagePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AskSessionPackagePriceResponseBodyDataPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static AskSessionPackagePriceResponseBodyDataPrice build(java.util.Map<String, ?> map) throws Exception {
            AskSessionPackagePriceResponseBodyDataPrice self = new AskSessionPackagePriceResponseBodyDataPrice();
            return TeaModel.build(map, self);
        }

        public AskSessionPackagePriceResponseBodyDataPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public AskSessionPackagePriceResponseBodyDataPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public AskSessionPackagePriceResponseBodyDataPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public AskSessionPackagePriceResponseBodyDataPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class AskSessionPackagePriceResponseBodyData extends TeaModel {
        @NameInMap("Price")
        public AskSessionPackagePriceResponseBodyDataPrice price;

        public static AskSessionPackagePriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AskSessionPackagePriceResponseBodyData self = new AskSessionPackagePriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AskSessionPackagePriceResponseBodyData setPrice(AskSessionPackagePriceResponseBodyDataPrice price) {
            this.price = price;
            return this;
        }
        public AskSessionPackagePriceResponseBodyDataPrice getPrice() {
            return this.price;
        }

    }

}
