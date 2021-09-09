// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    @NameInMap("BuyerAccountId")
    @Validation(required = true)
    public String buyerAccountId;

    @NameInMap("ItemId")
    @Validation(required = true)
    public String itemId;

    @NameInMap("SkuId")
    @Validation(required = true)
    public String skuId;

    @NameInMap("OriginPrice")
    @Validation(required = true)
    public Long originPrice;

    @NameInMap("SettlementPrice")
    @Validation(required = true)
    public Long settlementPrice;

    @NameInMap("Amount")
    @Validation(required = true)
    public Long amount;

    @NameInMap("IdempotentCode")
    @Validation(required = true)
    public String idempotentCode;

    @NameInMap("AccountDomain")
    public String accountDomain;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setBuyerAccountId(String buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }
    public String getBuyerAccountId() {
        return this.buyerAccountId;
    }

    public CreateOrderRequest setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public CreateOrderRequest setSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }
    public String getSkuId() {
        return this.skuId;
    }

    public CreateOrderRequest setOriginPrice(Long originPrice) {
        this.originPrice = originPrice;
        return this;
    }
    public Long getOriginPrice() {
        return this.originPrice;
    }

    public CreateOrderRequest setSettlementPrice(Long settlementPrice) {
        this.settlementPrice = settlementPrice;
        return this;
    }
    public Long getSettlementPrice() {
        return this.settlementPrice;
    }

    public CreateOrderRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public CreateOrderRequest setIdempotentCode(String idempotentCode) {
        this.idempotentCode = idempotentCode;
        return this;
    }
    public String getIdempotentCode() {
        return this.idempotentCode;
    }

    public CreateOrderRequest setAccountDomain(String accountDomain) {
        this.accountDomain = accountDomain;
        return this;
    }
    public String getAccountDomain() {
        return this.accountDomain;
    }

}
