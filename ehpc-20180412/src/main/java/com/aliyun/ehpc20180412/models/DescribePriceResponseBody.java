// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribePriceResponseBody extends TeaModel {
    /**
     * <p>The array of cluster prices. If you query the prices of multiple nodes in the cluster, the sequence of the prices in the returned value of PriceInfo is the same as that of the nodes in the request parameters. For example, the first price in the value of PriceInfo is the price of the first node specified in the request parameters.</p>
     */
    @NameInMap("Prices")
    public DescribePriceResponseBodyPrices prices;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total price.</p>
     * <br>
     * <p>Unit: USD.</p>
     */
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
        /**
         * <p>The currency that is used to measure the price. Valid values:</p>
         * <br>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The type of the node. Valid values:</p>
         * <br>
         * <p>*   Manager: management node</p>
         * <p>*   Login: logon node</p>
         * <p>*   Compute: compute node</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <p>The original price of the image.</p>
         * <br>
         * <p>Unit: USD.</p>
         */
        @NameInMap("OriginalPrice")
        public Float originalPrice;

        /**
         * <p>The final price.</p>
         * <br>
         * <p>Unit: USD.</p>
         */
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
