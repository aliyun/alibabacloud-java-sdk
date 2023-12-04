// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleItemListSubItemsShoppingItemMapValue extends TeaModel {
    @NameInMap("search_price")
    public ModuleItemListSubItemsShoppingItemMapValueSearchPrice searchPrice;

    /**
     * <p>id</p>
     */
    @NameInMap("id")
    public String id;

    @NameInMap("cabin_quantity")
    public java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue> cabinQuantity;

    @NameInMap("segment_price")
    public java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValueSegmentPriceValue> segmentPrice;

    public static ModuleItemListSubItemsShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleItemListSubItemsShoppingItemMapValue self = new ModuleItemListSubItemsShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleItemListSubItemsShoppingItemMapValue setSearchPrice(ModuleItemListSubItemsShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleItemListSubItemsShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public ModuleItemListSubItemsShoppingItemMapValue setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModuleItemListSubItemsShoppingItemMapValue setCabinQuantity(java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue> cabinQuantity) {
        this.cabinQuantity = cabinQuantity;
        return this;
    }
    public java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValueCabinQuantityValue> getCabinQuantity() {
        return this.cabinQuantity;
    }

    public ModuleItemListSubItemsShoppingItemMapValue setSegmentPrice(java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValueSegmentPriceValue> segmentPrice) {
        this.segmentPrice = segmentPrice;
        return this;
    }
    public java.util.Map<String, ModuleItemListSubItemsShoppingItemMapValueSegmentPriceValue> getSegmentPrice() {
        return this.segmentPrice;
    }

    public static class ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo extends TeaModel {
        @NameInMap("discount_info")
        public String discountInfo;

        @NameInMap("discount_num")
        public Double discountNum;

        @NameInMap("show_ticket_price")
        public Boolean showTicketPrice;

        public static ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo self = new ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo();
            return TeaModel.build(map, self);
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo setDiscountInfo(String discountInfo) {
            this.discountInfo = discountInfo;
            return this;
        }
        public String getDiscountInfo() {
            return this.discountInfo;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo setDiscountNum(Double discountNum) {
            this.discountNum = discountNum;
            return this;
        }
        public Double getDiscountNum() {
            return this.discountNum;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo setShowTicketPrice(Boolean showTicketPrice) {
            this.showTicketPrice = showTicketPrice;
            return this;
        }
        public Boolean getShowTicketPrice() {
            return this.showTicketPrice;
        }

    }

    public static class ModuleItemListSubItemsShoppingItemMapValueSearchPrice extends TeaModel {
        @NameInMap("floor_price")
        public Integer floorPrice;

        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("sell_price")
        public Integer sellPrice;

        @NameInMap("original_sell_price")
        public Integer originalSellPrice;

        @NameInMap("base_total_price")
        public Integer baseTotalPrice;

        @NameInMap("before_control_price")
        public Integer beforeControlPrice;

        @NameInMap("tax")
        public Integer tax;

        @NameInMap("supply_price")
        public Integer supplyPrice;

        @NameInMap("basic_cabin_price")
        public Integer basicCabinPrice;

        @NameInMap("build_price")
        public Integer buildPrice;

        @NameInMap("oil_price")
        public Integer oilPrice;

        @NameInMap("first_standard_price")
        public Integer firstStandardPrice;

        @NameInMap("business_standard_price")
        public Integer businessStandardPrice;

        @NameInMap("common_standard_price")
        public Integer commonStandardPrice;

        /**
         * <p>fdPrice</p>
         */
        @NameInMap("inter_ticket_price")
        public Integer interTicketPrice;

        @NameInMap("subtracted_price")
        public Integer subtractedPrice;

        @NameInMap("origin_common_price")
        public Integer originCommonPrice;

        @NameInMap("dynamic_promotion_price")
        public Integer dynamicPromotionPrice;

        @NameInMap("installment_num")
        public Integer installmentNum;

        @NameInMap("installment_price")
        public Double installmentPrice;

        @NameInMap("competition_dynamic_price")
        public Integer competitionDynamicPrice;

        @NameInMap("competition_promotion_price")
        public Integer competitionPromotionPrice;

        @NameInMap("min_before_control_price_of_normal")
        public Integer minBeforeControlPriceOfNormal;

        @NameInMap("price_show_info")
        public ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo priceShowInfo;

        public static ModuleItemListSubItemsShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleItemListSubItemsShoppingItemMapValueSearchPrice self = new ModuleItemListSubItemsShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setFloorPrice(Integer floorPrice) {
            this.floorPrice = floorPrice;
            return this;
        }
        public Integer getFloorPrice() {
            return this.floorPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setOriginalSellPrice(Integer originalSellPrice) {
            this.originalSellPrice = originalSellPrice;
            return this;
        }
        public Integer getOriginalSellPrice() {
            return this.originalSellPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setBaseTotalPrice(Integer baseTotalPrice) {
            this.baseTotalPrice = baseTotalPrice;
            return this;
        }
        public Integer getBaseTotalPrice() {
            return this.baseTotalPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setBeforeControlPrice(Integer beforeControlPrice) {
            this.beforeControlPrice = beforeControlPrice;
            return this;
        }
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setSupplyPrice(Integer supplyPrice) {
            this.supplyPrice = supplyPrice;
            return this;
        }
        public Integer getSupplyPrice() {
            return this.supplyPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setBasicCabinPrice(Integer basicCabinPrice) {
            this.basicCabinPrice = basicCabinPrice;
            return this;
        }
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setBuildPrice(Integer buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setOilPrice(Integer oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setFirstStandardPrice(Integer firstStandardPrice) {
            this.firstStandardPrice = firstStandardPrice;
            return this;
        }
        public Integer getFirstStandardPrice() {
            return this.firstStandardPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setBusinessStandardPrice(Integer businessStandardPrice) {
            this.businessStandardPrice = businessStandardPrice;
            return this;
        }
        public Integer getBusinessStandardPrice() {
            return this.businessStandardPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setCommonStandardPrice(Integer commonStandardPrice) {
            this.commonStandardPrice = commonStandardPrice;
            return this;
        }
        public Integer getCommonStandardPrice() {
            return this.commonStandardPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setInterTicketPrice(Integer interTicketPrice) {
            this.interTicketPrice = interTicketPrice;
            return this;
        }
        public Integer getInterTicketPrice() {
            return this.interTicketPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setSubtractedPrice(Integer subtractedPrice) {
            this.subtractedPrice = subtractedPrice;
            return this;
        }
        public Integer getSubtractedPrice() {
            return this.subtractedPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setOriginCommonPrice(Integer originCommonPrice) {
            this.originCommonPrice = originCommonPrice;
            return this;
        }
        public Integer getOriginCommonPrice() {
            return this.originCommonPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setDynamicPromotionPrice(Integer dynamicPromotionPrice) {
            this.dynamicPromotionPrice = dynamicPromotionPrice;
            return this;
        }
        public Integer getDynamicPromotionPrice() {
            return this.dynamicPromotionPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setInstallmentNum(Integer installmentNum) {
            this.installmentNum = installmentNum;
            return this;
        }
        public Integer getInstallmentNum() {
            return this.installmentNum;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setInstallmentPrice(Double installmentPrice) {
            this.installmentPrice = installmentPrice;
            return this;
        }
        public Double getInstallmentPrice() {
            return this.installmentPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setCompetitionDynamicPrice(Integer competitionDynamicPrice) {
            this.competitionDynamicPrice = competitionDynamicPrice;
            return this;
        }
        public Integer getCompetitionDynamicPrice() {
            return this.competitionDynamicPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setCompetitionPromotionPrice(Integer competitionPromotionPrice) {
            this.competitionPromotionPrice = competitionPromotionPrice;
            return this;
        }
        public Integer getCompetitionPromotionPrice() {
            return this.competitionPromotionPrice;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setMinBeforeControlPriceOfNormal(Integer minBeforeControlPriceOfNormal) {
            this.minBeforeControlPriceOfNormal = minBeforeControlPriceOfNormal;
            return this;
        }
        public Integer getMinBeforeControlPriceOfNormal() {
            return this.minBeforeControlPriceOfNormal;
        }

        public ModuleItemListSubItemsShoppingItemMapValueSearchPrice setPriceShowInfo(ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo priceShowInfo) {
            this.priceShowInfo = priceShowInfo;
            return this;
        }
        public ModuleItemListSubItemsShoppingItemMapValueSearchPricePriceShowInfo getPriceShowInfo() {
            return this.priceShowInfo;
        }

    }

}
