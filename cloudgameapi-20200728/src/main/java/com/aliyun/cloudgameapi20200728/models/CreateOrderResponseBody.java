// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    public CreateOrderResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setData(CreateOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrderResponseBodyData getData() {
        return this.data;
    }

    public CreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrderResponseBodyData extends TeaModel {
        @NameInMap("AccountDomain")
        public String accountDomain;

        @NameInMap("Amount")
        public Long amount;

        @NameInMap("ApplyDeliveryTime")
        public Long applyDeliveryTime;

        @NameInMap("AutoUnlockTime")
        public Long autoUnlockTime;

        @NameInMap("BuyerAccountId")
        public String buyerAccountId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("OrderId")
        public String orderId;

        @NameInMap("OriginPrice")
        public Long originPrice;

        @NameInMap("SettlementPrice")
        public Long settlementPrice;

        @NameInMap("SkuId")
        public String skuId;

        @NameInMap("Status")
        public String status;

        public static CreateOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyData self = new CreateOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyData setAccountDomain(String accountDomain) {
            this.accountDomain = accountDomain;
            return this;
        }
        public String getAccountDomain() {
            return this.accountDomain;
        }

        public CreateOrderResponseBodyData setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public CreateOrderResponseBodyData setApplyDeliveryTime(Long applyDeliveryTime) {
            this.applyDeliveryTime = applyDeliveryTime;
            return this;
        }
        public Long getApplyDeliveryTime() {
            return this.applyDeliveryTime;
        }

        public CreateOrderResponseBodyData setAutoUnlockTime(Long autoUnlockTime) {
            this.autoUnlockTime = autoUnlockTime;
            return this;
        }
        public Long getAutoUnlockTime() {
            return this.autoUnlockTime;
        }

        public CreateOrderResponseBodyData setBuyerAccountId(String buyerAccountId) {
            this.buyerAccountId = buyerAccountId;
            return this;
        }
        public String getBuyerAccountId() {
            return this.buyerAccountId;
        }

        public CreateOrderResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateOrderResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public CreateOrderResponseBodyData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public CreateOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CreateOrderResponseBodyData setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public CreateOrderResponseBodyData setSettlementPrice(Long settlementPrice) {
            this.settlementPrice = settlementPrice;
            return this;
        }
        public Long getSettlementPrice() {
            return this.settlementPrice;
        }

        public CreateOrderResponseBodyData setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public CreateOrderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
