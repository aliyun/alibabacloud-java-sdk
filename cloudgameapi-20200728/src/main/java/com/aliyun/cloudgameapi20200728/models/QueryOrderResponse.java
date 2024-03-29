// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class QueryOrderResponse extends TeaModel {
    @NameInMap("DeliveryStatus")
    @Validation(required = true)
    public String deliveryStatus;

    @NameInMap("RefundStatus")
    @Validation(required = true)
    public String refundStatus;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryOrderResponseData data;

    public static QueryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrderResponse self = new QueryOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrderResponse setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        return this;
    }
    public String getDeliveryStatus() {
        return this.deliveryStatus;
    }

    public QueryOrderResponse setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public String getRefundStatus() {
        return this.refundStatus;
    }

    public QueryOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOrderResponse setData(QueryOrderResponseData data) {
        this.data = data;
        return this;
    }
    public QueryOrderResponseData getData() {
        return this.data;
    }

    public static class QueryOrderResponseData extends TeaModel {
        @NameInMap("AccountDomain")
        @Validation(required = true)
        public String accountDomain;

        @NameInMap("Amount")
        @Validation(required = true)
        public Long amount;

        @NameInMap("ApplyDeliveryTime")
        @Validation(required = true)
        public Long applyDeliveryTime;

        @NameInMap("AutoUnlockTime")
        @Validation(required = true)
        public Long autoUnlockTime;

        @NameInMap("BuyerAccountId")
        @Validation(required = true)
        public String buyerAccountId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("ItemId")
        @Validation(required = true)
        public String itemId;

        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Long originPrice;

        @NameInMap("SettlementPrice")
        @Validation(required = true)
        public Long settlementPrice;

        @NameInMap("SkuId")
        @Validation(required = true)
        public String skuId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static QueryOrderResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryOrderResponseData self = new QueryOrderResponseData();
            return TeaModel.build(map, self);
        }

        public QueryOrderResponseData setAccountDomain(String accountDomain) {
            this.accountDomain = accountDomain;
            return this;
        }
        public String getAccountDomain() {
            return this.accountDomain;
        }

        public QueryOrderResponseData setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public QueryOrderResponseData setApplyDeliveryTime(Long applyDeliveryTime) {
            this.applyDeliveryTime = applyDeliveryTime;
            return this;
        }
        public Long getApplyDeliveryTime() {
            return this.applyDeliveryTime;
        }

        public QueryOrderResponseData setAutoUnlockTime(Long autoUnlockTime) {
            this.autoUnlockTime = autoUnlockTime;
            return this;
        }
        public Long getAutoUnlockTime() {
            return this.autoUnlockTime;
        }

        public QueryOrderResponseData setBuyerAccountId(String buyerAccountId) {
            this.buyerAccountId = buyerAccountId;
            return this;
        }
        public String getBuyerAccountId() {
            return this.buyerAccountId;
        }

        public QueryOrderResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryOrderResponseData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public QueryOrderResponseData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryOrderResponseData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryOrderResponseData setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public QueryOrderResponseData setSettlementPrice(Long settlementPrice) {
            this.settlementPrice = settlementPrice;
            return this;
        }
        public Long getSettlementPrice() {
            return this.settlementPrice;
        }

        public QueryOrderResponseData setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public QueryOrderResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
