// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class CreateOrderV2Request extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizUid")
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
    public java.util.List<CreateOrderV2RequestItemList> itemList;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("OrderExpireTime")
    public Long orderExpireTime;

    @NameInMap("OutTradeId")
    public String outTradeId;

    @NameInMap("Quantity")
    public Long quantity;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("TotalAmount")
    public Long totalAmount;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    public static CreateOrderV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderV2Request self = new CreateOrderV2Request();
        return TeaModel.build(map, self);
    }

    public CreateOrderV2Request setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateOrderV2Request setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CreateOrderV2Request setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateOrderV2Request setBuyerMessageMap(String buyerMessageMap) {
        this.buyerMessageMap = buyerMessageMap;
        return this;
    }
    public String getBuyerMessageMap() {
        return this.buyerMessageMap;
    }

    public CreateOrderV2Request setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public CreateOrderV2Request setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public CreateOrderV2Request setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

    public CreateOrderV2Request setItemList(java.util.List<CreateOrderV2RequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<CreateOrderV2RequestItemList> getItemList() {
        return this.itemList;
    }

    public CreateOrderV2Request setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public CreateOrderV2Request setOrderExpireTime(Long orderExpireTime) {
        this.orderExpireTime = orderExpireTime;
        return this;
    }
    public Long getOrderExpireTime() {
        return this.orderExpireTime;
    }

    public CreateOrderV2Request setOutTradeId(String outTradeId) {
        this.outTradeId = outTradeId;
        return this;
    }
    public String getOutTradeId() {
        return this.outTradeId;
    }

    public CreateOrderV2Request setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public CreateOrderV2Request setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public CreateOrderV2Request setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public CreateOrderV2Request setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public static class CreateOrderV2RequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuId")
        public Long skuId;

        public static CreateOrderV2RequestItemList build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderV2RequestItemList self = new CreateOrderV2RequestItemList();
            return TeaModel.build(map, self);
        }

        public CreateOrderV2RequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public CreateOrderV2RequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public CreateOrderV2RequestItemList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public CreateOrderV2RequestItemList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

}
