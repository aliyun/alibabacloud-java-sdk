// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("Prices")
    public DescribePriceResponseBodyPrices prices;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalTradePrice")
    public Float totalTradePrice;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setPrices(DescribePriceResponseBodyPrices prices) {
        this.prices = prices;
        return this;
    }
    public DescribePriceResponseBodyPrices getPrices() {
        return this.prices;
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePriceResponseBody setTotalTradePrice(Float totalTradePrice) {
        this.totalTradePrice = totalTradePrice;
        return this;
    }
    public Float getTotalTradePrice() {
        return this.totalTradePrice;
    }

    public static class DescribePriceResponseBodyPricesPriceInfo extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static DescribePriceResponseBodyPricesPriceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPricesPriceInfo self = new DescribePriceResponseBodyPricesPriceInfo();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPricesPriceInfo setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public DescribePriceResponseBodyPricesPriceInfo setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribePriceResponseBodyPricesPriceInfo setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPricesPriceInfo setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class DescribePriceResponseBodyPrices extends TeaModel {
        @NameInMap("PriceInfo")
        public java.util.List<DescribePriceResponseBodyPricesPriceInfo> priceInfo;

        public static DescribePriceResponseBodyPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPrices self = new DescribePriceResponseBodyPrices();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPrices setPriceInfo(java.util.List<DescribePriceResponseBodyPricesPriceInfo> priceInfo) {
            this.priceInfo = priceInfo;
            return this;
        }
        public java.util.List<DescribePriceResponseBodyPricesPriceInfo> getPriceInfo() {
            return this.priceInfo;
        }

    }

}
