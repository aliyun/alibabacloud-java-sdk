// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("BizUid")
    public String bizUid;

    @NameInMap("ExtJson")
    public String extJson;

    @NameInMap("ItemList")
    public java.util.List<RenderOrderRequestItemList> itemList;

    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    @NameInMap("UseAnonymousTbAccount")
    public Boolean useAnonymousTbAccount;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    @NameInMap("LmItemId")
    public String lmItemId;

    @NameInMap("AccountType")
    public String accountType;

    public static RenderOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderRequest self = new RenderOrderRequest();
        return TeaModel.build(map, self);
    }

    public RenderOrderRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RenderOrderRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public RenderOrderRequest setExtJson(String extJson) {
        this.extJson = extJson;
        return this;
    }
    public String getExtJson() {
        return this.extJson;
    }

    public RenderOrderRequest setItemList(java.util.List<RenderOrderRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<RenderOrderRequestItemList> getItemList() {
        return this.itemList;
    }

    public RenderOrderRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public RenderOrderRequest setUseAnonymousTbAccount(Boolean useAnonymousTbAccount) {
        this.useAnonymousTbAccount = useAnonymousTbAccount;
        return this;
    }
    public Boolean getUseAnonymousTbAccount() {
        return this.useAnonymousTbAccount;
    }

    public RenderOrderRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public RenderOrderRequest setLmItemId(String lmItemId) {
        this.lmItemId = lmItemId;
        return this;
    }
    public String getLmItemId() {
        return this.lmItemId;
    }

    public RenderOrderRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public static class RenderOrderRequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("LmItemId")
        public String lmItemId;

        public static RenderOrderRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderRequestItemList self = new RenderOrderRequestItemList();
            return TeaModel.build(map, self);
        }

        public RenderOrderRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderRequestItemList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public RenderOrderRequestItemList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderOrderRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

    }

}
