// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ModifyBasicAndBizItemsRequest extends TeaModel {
    @NameInMap("BizId")
    public String bizId;

    @NameInMap("SubBizId")
    public String subBizId;

    @NameInMap("ItemList")
    public java.util.List<ModifyBasicAndBizItemsRequestItemList> itemList;

    public static ModifyBasicAndBizItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBasicAndBizItemsRequest self = new ModifyBasicAndBizItemsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBasicAndBizItemsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ModifyBasicAndBizItemsRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public ModifyBasicAndBizItemsRequest setItemList(java.util.List<ModifyBasicAndBizItemsRequestItemList> itemList) {
        this.itemList = itemList;
        return this;
    }
    public java.util.List<ModifyBasicAndBizItemsRequestItemList> getItemList() {
        return this.itemList;
    }

    public static class ModifyBasicAndBizItemsRequestItemListSkuList extends TeaModel {
        @NameInMap("StatusAction")
        public Long statusAction;

        @NameInMap("PriceCent")
        public Long priceCent;

        @NameInMap("SupplierPrice")
        public Long supplierPrice;

        @NameInMap("SkuId")
        public Long skuId;

        @NameInMap("Points")
        public Long points;

        @NameInMap("PointsAmount")
        public Long pointsAmount;

        @NameInMap("BenefitId")
        public String benefitId;

        @NameInMap("Quantity")
        public Integer quantity;

        public static ModifyBasicAndBizItemsRequestItemListSkuList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsRequestItemListSkuList self = new ModifyBasicAndBizItemsRequestItemListSkuList();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setStatusAction(Long statusAction) {
            this.statusAction = statusAction;
            return this;
        }
        public Long getStatusAction() {
            return this.statusAction;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setPriceCent(Long priceCent) {
            this.priceCent = priceCent;
            return this;
        }
        public Long getPriceCent() {
            return this.priceCent;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setSupplierPrice(Long supplierPrice) {
            this.supplierPrice = supplierPrice;
            return this;
        }
        public Long getSupplierPrice() {
            return this.supplierPrice;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setSkuId(Long skuId) {
            this.skuId = skuId;
            return this;
        }
        public Long getSkuId() {
            return this.skuId;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setPoints(Long points) {
            this.points = points;
            return this;
        }
        public Long getPoints() {
            return this.points;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setPointsAmount(Long pointsAmount) {
            this.pointsAmount = pointsAmount;
            return this;
        }
        public Long getPointsAmount() {
            return this.pointsAmount;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setBenefitId(String benefitId) {
            this.benefitId = benefitId;
            return this;
        }
        public String getBenefitId() {
            return this.benefitId;
        }

        public ModifyBasicAndBizItemsRequestItemListSkuList setQuantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }
        public Integer getQuantity() {
            return this.quantity;
        }

    }

    public static class ModifyBasicAndBizItemsRequestItemList extends TeaModel {
        @NameInMap("LmItemId")
        public String lmItemId;

        @NameInMap("ItemId")
        public Long itemId;

        @NameInMap("SkuList")
        public java.util.List<ModifyBasicAndBizItemsRequestItemListSkuList> skuList;

        public static ModifyBasicAndBizItemsRequestItemList build(java.util.Map<String, ?> map) throws Exception {
            ModifyBasicAndBizItemsRequestItemList self = new ModifyBasicAndBizItemsRequestItemList();
            return TeaModel.build(map, self);
        }

        public ModifyBasicAndBizItemsRequestItemList setLmItemId(String lmItemId) {
            this.lmItemId = lmItemId;
            return this;
        }
        public String getLmItemId() {
            return this.lmItemId;
        }

        public ModifyBasicAndBizItemsRequestItemList setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public ModifyBasicAndBizItemsRequestItemList setSkuList(java.util.List<ModifyBasicAndBizItemsRequestItemListSkuList> skuList) {
            this.skuList = skuList;
            return this;
        }
        public java.util.List<ModifyBasicAndBizItemsRequestItemListSkuList> getSkuList() {
            return this.skuList;
        }

    }

}
