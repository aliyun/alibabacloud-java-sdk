// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryOrderResponseBody extends TeaModel {
    @NameInMap("DeliveryStatus")
    public String deliveryStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RefundStatus")
    public String refundStatus;

    @NameInMap("Data")
    public QueryOrderResponseBodyData data;

    public static QueryOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderResponseBody self = new QueryOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOrderResponseBody setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        return this;
    }
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public QueryOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderResponseBody setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public QueryOrderResponseBody setData(QueryOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOrderResponseBodyData getData() {
        return this.data;
    }

    public static class QueryOrderResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("AutoUnlockTime")
        public Long autoUnlockTime;

        @NameInMap("ApplyDeliveryTime")
        public Long applyDeliveryTime;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("OriginPrice")
        public Long originPrice;

        @NameInMap("BuyerAccountId")
        public String buyerAccountId;

        @NameInMap("Amount")
        public Long amount;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("SettlementPrice")
        public Long settlementPrice;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("AccountDomain")
        public String accountDomain;

        public static QueryOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseBodyData self = new QueryOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryOrderResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public QueryOrderResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryOrderResponseBodyData setAutoUnlockTime(Long autoUnlockTime) {
            this.autoUnlockTime = autoUnlockTime;
            return this;
        }
        public Long getAutoUnlockTime() {
            return this.autoUnlockTime;
        }

        public QueryOrderResponseBodyData setApplyDeliveryTime(Long applyDeliveryTime) {
            this.applyDeliveryTime = applyDeliveryTime;
            return this;
        }
        public Long getApplyDeliveryTime() {
            return this.applyDeliveryTime;
        }

        public QueryOrderResponseBodyData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryOrderResponseBodyData setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public QueryOrderResponseBodyData setBuyerAccountId(String buyerAccountId) {
            this.buyerAccountId = buyerAccountId;
            return this;
        }
        public String getBuyerAccountId() {
            return this.buyerAccountId;
        }

        public QueryOrderResponseBodyData setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QueryOrderResponseBodyData setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryOrderResponseBodyData setSettlementPrice(Long settlementPrice) {
            this.settlementPrice = settlementPrice;
            return this;
        }
        public Long getSettlementPrice() {
            return this.settlementPrice;
        }

        public QueryOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryOrderResponseBodyData setAccountDomain(String accountDomain) {
            this.accountDomain = accountDomain;
            return this;
        }
        public String getAccountDomain() {
            return this.accountDomain;
        }

    }

}
