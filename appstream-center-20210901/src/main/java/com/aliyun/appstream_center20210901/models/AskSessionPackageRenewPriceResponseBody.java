// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AskSessionPackageRenewPriceResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<AskSessionPackageRenewPriceResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static AskSessionPackageRenewPriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AskSessionPackageRenewPriceResponseBody self = new AskSessionPackageRenewPriceResponseBody();
        return TeaModel.build(map, self);
    }

    public AskSessionPackageRenewPriceResponseBody setData(java.util.List<AskSessionPackageRenewPriceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AskSessionPackageRenewPriceResponseBodyData> getData() {
        return this.data;
    }

    public AskSessionPackageRenewPriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AskSessionPackageRenewPriceResponseBodyDataPrice extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("DiscountPrice")
        public Float discountPrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static AskSessionPackageRenewPriceResponseBodyDataPrice build(java.util.Map<String, ?> map) throws Exception {
            AskSessionPackageRenewPriceResponseBodyDataPrice self = new AskSessionPackageRenewPriceResponseBodyDataPrice();
            return TeaModel.build(map, self);
        }

        public AskSessionPackageRenewPriceResponseBodyDataPrice setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public AskSessionPackageRenewPriceResponseBodyDataPrice setDiscountPrice(Float discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Float getDiscountPrice() {
            return this.discountPrice;
        }

        public AskSessionPackageRenewPriceResponseBodyDataPrice setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public AskSessionPackageRenewPriceResponseBodyDataPrice setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class AskSessionPackageRenewPriceResponseBodyData extends TeaModel {
        @NameInMap("Price")
        public AskSessionPackageRenewPriceResponseBodyDataPrice price;

        public static AskSessionPackageRenewPriceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AskSessionPackageRenewPriceResponseBodyData self = new AskSessionPackageRenewPriceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AskSessionPackageRenewPriceResponseBodyData setPrice(AskSessionPackageRenewPriceResponseBodyDataPrice price) {
            this.price = price;
            return this;
        }
        public AskSessionPackageRenewPriceResponseBodyDataPrice getPrice() {
            return this.price;
        }

    }

}
