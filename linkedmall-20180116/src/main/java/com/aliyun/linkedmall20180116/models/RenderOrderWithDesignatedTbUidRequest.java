// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RenderOrderWithDesignatedTbUidRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("DeliveryAddress")
    public String deliveryAddress;

    @NameInMap("ItemList")
    public java.util.List<RenderOrderWithDesignatedTbUidRequestItemList> itemList;

    @NameInMap("TbAccountType")
    public String tbAccountType;

    @NameInMap("TbUserId")
    public Long tbUserId;

    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static RenderOrderWithDesignatedTbUidRequest build(java.util.Map<String, ?> map) throws Exception {
        RenderOrderWithDesignatedTbUidRequest self = new RenderOrderWithDesignatedTbUidRequest();
        return TeaModel.build(map, self);
    }

    public RenderOrderWithDesignatedTbUidRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public RenderOrderWithDesignatedTbUidRequest setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
        return this;
    }
    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public RenderOrderWithDesignatedTbUidRequest setItemList(java.util.List<RenderOrderWithDesignatedTbUidRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<RenderOrderWithDesignatedTbUidRequestItemList> getItemList() {
        return this.itemList;
    }

    public RenderOrderWithDesignatedTbUidRequest setTbAccountType(String tbAccountType) {
        this.tbAccountType = tbAccountType;
        return this;
    }
    public String getTbAccountType() {
        return this.tbAccountType;
    }

    public RenderOrderWithDesignatedTbUidRequest setTbUserId(Long tbUserId) {
        this.tbUserId = tbUserId;
        return this;
    }
    public Long getTbUserId() {
        return this.tbUserId;
    }

    public RenderOrderWithDesignatedTbUidRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

    public static class RenderOrderWithDesignatedTbUidRequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuId")
        public Long skuId;

        public static RenderOrderWithDesignatedTbUidRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            RenderOrderWithDesignatedTbUidRequestItemList self = new RenderOrderWithDesignatedTbUidRequestItemList();
            return TeaModel.build(map, self);
        }

        public RenderOrderWithDesignatedTbUidRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public RenderOrderWithDesignatedTbUidRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public RenderOrderWithDesignatedTbUidRequestItemList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public RenderOrderWithDesignatedTbUidRequestItemList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

    }

}
