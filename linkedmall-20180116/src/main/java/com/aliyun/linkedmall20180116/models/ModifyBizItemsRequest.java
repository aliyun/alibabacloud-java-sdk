// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBizItemsRequest extends TeaModel {
    @NameInMap("BizId")
    @Validation(required = true)
    public String bizId;

    @NameInMap("ItemList")
    @Validation(required = true)
    public java.util.List<ModifyBizItemsRequestItemList> itemList;

    @NameInMap("SubBizId")
    public String subBizId;

    public static ModifyBizItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBizItemsRequest self = new ModifyBizItemsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBizItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyBizItemsRequest setItemList(java.util.List<ModifyBizItemsRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<ModifyBizItemsRequestItemList> getItemList() {
        return this.itemList;
    }

    public ModifyBizItemsRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public static class ModifyBizItemsRequestItemListSkuList extends TeaModel {
        @NameInMap("BenefitId")
        public String benefitId;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("Quantity")
        public Integer quantity;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("StatusAction")
        public Long statusAction;

        public static ModifyBizItemsRequestItemListSkuList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBizItemsRequestItemListSkuList self = new ModifyBizItemsRequestItemListSkuList();
            return TeaModel.build(map, self);
        }

        public ModifyBizItemsRequestItemListSkuList setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public ModifyBizItemsRequestItemListSkuList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public ModifyBizItemsRequestItemListSkuList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public ModifyBizItemsRequestItemListSkuList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public ModifyBizItemsRequestItemListSkuList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

        public ModifyBizItemsRequestItemListSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public ModifyBizItemsRequestItemListSkuList setStatusAction(Long statusAction) {
            this.statusAction = statusAction;
            return this;
        }
        public Long getStatusAction() {
            return this.statusAction;
        }

    }

    public static class ModifyBizItemsRequestItemList extends TeaModel {
        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("SkuList")
        public java.util.List<ModifyBizItemsRequestItemListSkuList> skuList;

        public static ModifyBizItemsRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBizItemsRequestItemList self = new ModifyBizItemsRequestItemList();
            return TeaModel.build(map, self);
        }

        public ModifyBizItemsRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyBizItemsRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyBizItemsRequestItemList setSkuList(java.util.List<ModifyBizItemsRequestItemListSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<ModifyBizItemsRequestItemListSkuList> getSkuList() {
            return this.skuList;
        }

    }

}
