// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public CreateOrderResponseBodyData data;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderResponseBody setData(CreateOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOrderResponseBodyData getData() {
        return this.data;
    }

    public static class CreateOrderResponseBodyData extends TeaModel {
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

        public static CreateOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyData self = new CreateOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateOrderResponseBodyData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public CreateOrderResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateOrderResponseBodyData setAutoUnlockTime(Long autoUnlockTime) {
            this.autoUnlockTime = autoUnlockTime;
            return this;
        }
        public Long getAutoUnlockTime() {
            return this.autoUnlockTime;
        }

        public CreateOrderResponseBodyData setApplyDeliveryTime(Long applyDeliveryTime) {
            this.applyDeliveryTime = applyDeliveryTime;
            return this;
        }
        public Long getApplyDeliveryTime() {
            return this.applyDeliveryTime;
        }

        public CreateOrderResponseBodyData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public CreateOrderResponseBodyData setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public CreateOrderResponseBodyData setBuyerAccountId(String buyerAccountId) {
            this.buyerAccountId = buyerAccountId;
            return this;
        }
        public String getBuyerAccountId() {
            return this.buyerAccountId;
        }

        public CreateOrderResponseBodyData setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public CreateOrderResponseBodyData setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public CreateOrderResponseBodyData setSettlementPrice(Long settlementPrice) {
            this.settlementPrice = settlementPrice;
            return this;
        }
        public Long getSettlementPrice() {
            return this.settlementPrice;
        }

        public CreateOrderResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CreateOrderResponseBodyData setAccountDomain(String accountDomain) {
            this.accountDomain = accountDomain;
            return this;
        }
        public String getAccountDomain() {
            return this.accountDomain;
        }

    }

}
