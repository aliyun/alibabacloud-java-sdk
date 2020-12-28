// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    @NameInMap("Prices")
    public java.util.List<DescribePriceResponseBodyPrices> prices;

    @NameInMap("TotalTradePrice")
    public Float totalTradePrice;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceResponseBody self = new DescribePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePriceResponseBody setPrices(java.util.List<DescribePriceResponseBodyPrices> prices) {
        this.prices = prices;
        return this;
    }
    public java.util.List<DescribePriceResponseBodyPrices> getPrices() {
        return this.prices;
    }

    public DescribePriceResponseBody setTotalTradePrice(Float totalTradePrice) {
        this.totalTradePrice = totalTradePrice;
        return this;
    }
    public Float getTotalTradePrice() {
        return this.totalTradePrice;
    }

    public DescribePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePriceResponseBodyPrices extends TeaModel {
        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("TradePrice")
        public Float tradePrice;

        @NameInMap("OriginalPrice")
        public Float originalPrice;

        @NameInMap("Currency")
        public String currency;

        public static DescribePriceResponseBodyPrices build(java.util.Map<String, ?> map) throws Exception {
            DescribePriceResponseBodyPrices self = new DescribePriceResponseBodyPrices();
            return TeaModel.build(map, self);
        }

        public DescribePriceResponseBodyPrices setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribePriceResponseBodyPrices setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

        public DescribePriceResponseBodyPrices setOriginalPrice(Float originalPrice) {
            this.originalPrice = originalPrice;
            return this;
        }
        public Float getOriginalPrice() {
            return this.originalPrice;
        }

        public DescribePriceResponseBodyPrices setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

    }

}
