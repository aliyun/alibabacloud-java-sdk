// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeReservedInstancePriceResponseBody extends TeaModel {
    @NameInMap("PriceInfo")
    public PriceInfo priceInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeReservedInstancePriceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeReservedInstancePriceResponseBody self = new DescribeReservedInstancePriceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeReservedInstancePriceResponseBody setPriceInfo(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
        return this;
    }
    public PriceInfo getPriceInfo() {
        return this.priceInfo;
    }

    public DescribeReservedInstancePriceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class Order extends TeaModel {
        @NameInMap("Currency")
        public String currency;

        @NameInMap("ReservedInstanceHourPrice")
        public Float reservedInstanceHourPrice;

        @NameInMap("TradePrice")
        public Float tradePrice;

        public static Order build(java.util.Map<String, ?> map) throws Exception {
            Order self = new Order();
            return TeaModel.build(map, self);
        }

        public Order setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public Order setReservedInstanceHourPrice(Float reservedInstanceHourPrice) {
            this.reservedInstanceHourPrice = reservedInstanceHourPrice;
            return this;
        }
        public Float getReservedInstanceHourPrice() {
            return this.reservedInstanceHourPrice;
        }

        public Order setTradePrice(Float tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }
        public Float getTradePrice() {
            return this.tradePrice;
        }

    }

    public static class PriceInfo extends TeaModel {
        @NameInMap("Order")
        public Order order;

        public static PriceInfo build(java.util.Map<String, ?> map) throws Exception {
            PriceInfo self = new PriceInfo();
            return TeaModel.build(map, self);
        }

        public PriceInfo setOrder(Order order) {
            this.order = order;
            return this;
        }
        public Order getOrder() {
            return this.order;
        }

    }

}
