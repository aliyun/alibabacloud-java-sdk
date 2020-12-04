// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateOrderResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public CreateOrderResponseData data;

    public static CreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponse self = new CreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderResponse setData(CreateOrderResponseData data) {
        this.data = data;
        return this;
    }
    public CreateOrderResponseData getData() {
        return this.data;
    }

    public static class CreateOrderResponseData extends TeaModel {
        @NameInMap("OrderId")
        @Validation(required = true)
        public String orderId;

        @NameInMap("ItemId")
        @Validation(required = true)
        public String itemId;

        @NameInMap("SkuId")
        @Validation(required = true)
        public String skuId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ApplyDeliveryTime")
        @Validation(required = true)
        public Long applyDeliveryTime;

        @NameInMap("FinishTime")
        @Validation(required = true)
        public Long finishTime;

        @NameInMap("OriginPrice")
        @Validation(required = true)
        public Long originPrice;

        @NameInMap("SettlementPrice")
        @Validation(required = true)
        public Long settlementPrice;

        @NameInMap("Amount")
        @Validation(required = true)
        public Long amount;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("BuyerAccountId")
        @Validation(required = true)
        public String buyerAccountId;

        @NameInMap("AutoUnlockTime")
        @Validation(required = true)
        public Long autoUnlockTime;

        @NameInMap("AccountDomain")
        @Validation(required = true)
        public String accountDomain;

        public static CreateOrderResponseData build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseData self = new CreateOrderResponseData();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CreateOrderResponseData setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public CreateOrderResponseData setSkuId(String skuId) {
            this.skuId = skuId;
            return this;
        }
        public String getSkuId() {
            return this.skuId;
        }

        public CreateOrderResponseData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateOrderResponseData setApplyDeliveryTime(Long applyDeliveryTime) {
            this.applyDeliveryTime = applyDeliveryTime;
            return this;
        }
        public Long getApplyDeliveryTime() {
            return this.applyDeliveryTime;
        }

        public CreateOrderResponseData setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public CreateOrderResponseData setOriginPrice(Long originPrice) {
            this.originPrice = originPrice;
            return this;
        }
        public Long getOriginPrice() {
            return this.originPrice;
        }

        public CreateOrderResponseData setSettlementPrice(Long settlementPrice) {
            this.settlementPrice = settlementPrice;
            return this;
        }
        public Long getSettlementPrice() {
            return this.settlementPrice;
        }

        public CreateOrderResponseData setAmount(Long amount) {
            this.amount = amount;
            return this;
        }
        public Long getAmount() {
            return this.amount;
        }

        public CreateOrderResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateOrderResponseData setBuyerAccountId(String buyerAccountId) {
            this.buyerAccountId = buyerAccountId;
            return this;
        }
        public String getBuyerAccountId() {
            return this.buyerAccountId;
        }

        public CreateOrderResponseData setAutoUnlockTime(Long autoUnlockTime) {
            this.autoUnlockTime = autoUnlockTime;
            return this;
        }
        public Long getAutoUnlockTime() {
            return this.autoUnlockTime;
        }

        public CreateOrderResponseData setAccountDomain(String accountDomain) {
            this.accountDomain = accountDomain;
            return this;
        }
        public String getAccountDomain() {
            return this.accountDomain;
        }

    }

}
