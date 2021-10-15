// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("BizUid")
    @Validation(required = true)
    public String bizUid;

    @NameInMap("BuyerMessageMap")
    public String buyerMessageMap;

    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("ItemId")
    public Long itemId;

    @NameInMap("ItemList")
    public java.util.List<CreateOrderRequestItemList> itemList;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("OrderExpireTime")
    public Long orderExpireTime;

    @NameInMap("OutTradeId")
    @Validation(required = true)
    public String outTradeId;

    @NameInMap("Quantity")
    public Long quantity;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("TotalAmount")
    public Long totalAmount;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateOrderRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateOrderRequest setBuyerMessageMap(String buyerMessageMap) {
        this.buyerMessageMap = buyerMessageMap;
        return this;
    }
    public String getBuyerMessageMap() {
        return this.buyerMessageMap;
    }

    public CreateOrderRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public CreateOrderRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public CreateOrderRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public CreateOrderRequest setItemList(java.util.List<CreateOrderRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<CreateOrderRequestItemList> getItemList() {
        return this.itemList;
    }

    public CreateOrderRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public CreateOrderRequest setOrderExpireTime(Long orderExpireTime) {
        this.orderExpireTime = orderExpireTime;
        return this;
    }
    public Long getOrderExpireTime() {
        return this.orderExpireTime;
    }

    public CreateOrderRequest setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
        return this;
    }
    public String getOutTradeId() {
        return this.outTradeId;
    }

    public CreateOrderRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public CreateOrderRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public CreateOrderRequest setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public CreateOrderRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static class CreateOrderRequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuId")
        public Long skuId;

        public static CreateOrderRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderRequestItemList self = new CreateOrderRequestItemList();
            return TeaModel.build(map, self);
        }

        public CreateOrderRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public CreateOrderRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public CreateOrderRequestItemList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public CreateOrderRequestItemList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

}
