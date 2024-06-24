// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleFlightItemListItemListShoppingItemMapValue extends TeaModel {
    /**
     * <p>id</p>
     * 
     * <strong>example:</strong>
     * <p>ADT07df0bd9-f803-4a50-8449-f4bd675d9939</p>
     */
    @NameInMap("id")
    public String id;

    @NameInMap("cabin_quantity")
    public java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValueCabinQuantityValue> cabinQuantity;

    @NameInMap("search_price")
    public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice searchPrice;

    @NameInMap("segment_price")
    public java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValueSegmentPriceValue> segmentPrice;

    public static ModuleFlightItemListItemListShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleFlightItemListItemListShoppingItemMapValue self = new ModuleFlightItemListItemListShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleFlightItemListItemListShoppingItemMapValue setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModuleFlightItemListItemListShoppingItemMapValue setCabinQuantity(java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValueCabinQuantityValue> cabinQuantity) {
        this.cabinQuantity = cabinQuantity;
        return this;
    }
    public java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValueCabinQuantityValue> getCabinQuantity() {
        return this.cabinQuantity;
    }

    public ModuleFlightItemListItemListShoppingItemMapValue setSearchPrice(ModuleFlightItemListItemListShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public ModuleFlightItemListItemListShoppingItemMapValue setSegmentPrice(java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValueSegmentPriceValue> segmentPrice) {
        this.segmentPrice = segmentPrice;
        return this;
    }
    public java.util.Map<String, ModuleFlightItemListItemListShoppingItemMapValueSegmentPriceValue> getSegmentPrice() {
        return this.segmentPrice;
    }

    public static class ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo extends TeaModel {
        @NameInMap("discount_info")
        public String discountInfo;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("discount_num")
        public Double discountNum;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("show_ticket_price")
        public Boolean showTicketPrice;

        public static ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo self = new ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo setDiscountInfo(String discountInfo) {
            this.discountInfo = discountInfo;
            return this;
        }
        public String getDiscountInfo() {
            return this.discountInfo;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo setDiscountNum(Double discountNum) {
            this.discountNum = discountNum;
            return this;
        }
        public Double getDiscountNum() {
            return this.discountNum;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo setShowTicketPrice(Boolean showTicketPrice) {
            this.showTicketPrice = showTicketPrice;
            return this;
        }
        public Boolean getShowTicketPrice() {
            return this.showTicketPrice;
        }

    }

    public static class ModuleFlightItemListItemListShoppingItemMapValueSearchPrice extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>17400</p>
         */
        @NameInMap("floor_price")
        public Integer floorPrice;

        /**
         * <strong>example:</strong>
         * <p>121000</p>
         */
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>17400</p>
         */
        @NameInMap("sell_price")
        public Integer sellPrice;

        /**
         * <strong>example:</strong>
         * <p>17400</p>
         */
        @NameInMap("original_sell_price")
        public Integer originalSellPrice;

        @NameInMap("base_total_price")
        public Integer baseTotalPrice;

        /**
         * <strong>example:</strong>
         * <p>17400</p>
         */
        @NameInMap("before_control_price")
        public Integer beforeControlPrice;

        /**
         * <strong>example:</strong>
         * <p>11000</p>
         */
        @NameInMap("tax")
        public Integer tax;

        @NameInMap("supply_price")
        public Integer supplyPrice;

        /**
         * <strong>example:</strong>
         * <p>242000</p>
         */
        @NameInMap("basic_cabin_price")
        public Integer basicCabinPrice;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("build_price")
        public Integer buildPrice;

        /**
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("oil_price")
        public Integer oilPrice;

        @NameInMap("first_standard_price")
        public Integer firstStandardPrice;

        @NameInMap("business_standard_price")
        public Integer businessStandardPrice;

        /**
         * <strong>example:</strong>
         * <p>242000</p>
         */
        @NameInMap("common_standard_price")
        public Integer commonStandardPrice;

        /**
         * <p>fdPrice</p>
         * 
         * <strong>example:</strong>
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

        /**
         * <strong>example:</strong>
         * <p>17400</p>
         */
        @NameInMap("min_before_control_price_of_normal")
        public Integer minBeforeControlPriceOfNormal;

        @NameInMap("price_show_info")
        public ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo priceShowInfo;

        public static ModuleFlightItemListItemListShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListItemListShoppingItemMapValueSearchPrice self = new ModuleFlightItemListItemListShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setFloorPrice(Integer floorPrice) {
            this.floorPrice = floorPrice;
            return this;
        }
        public Integer getFloorPrice() {
            return this.floorPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setOriginalSellPrice(Integer originalSellPrice) {
            this.originalSellPrice = originalSellPrice;
            return this;
        }
        public Integer getOriginalSellPrice() {
            return this.originalSellPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setBaseTotalPrice(Integer baseTotalPrice) {
            this.baseTotalPrice = baseTotalPrice;
            return this;
        }
        public Integer getBaseTotalPrice() {
            return this.baseTotalPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setBeforeControlPrice(Integer beforeControlPrice) {
            this.beforeControlPrice = beforeControlPrice;
            return this;
        }
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setSupplyPrice(Integer supplyPrice) {
            this.supplyPrice = supplyPrice;
            return this;
        }
        public Integer getSupplyPrice() {
            return this.supplyPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setBasicCabinPrice(Integer basicCabinPrice) {
            this.basicCabinPrice = basicCabinPrice;
            return this;
        }
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setBuildPrice(Integer buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setOilPrice(Integer oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setFirstStandardPrice(Integer firstStandardPrice) {
            this.firstStandardPrice = firstStandardPrice;
            return this;
        }
        public Integer getFirstStandardPrice() {
            return this.firstStandardPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setBusinessStandardPrice(Integer businessStandardPrice) {
            this.businessStandardPrice = businessStandardPrice;
            return this;
        }
        public Integer getBusinessStandardPrice() {
            return this.businessStandardPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setCommonStandardPrice(Integer commonStandardPrice) {
            this.commonStandardPrice = commonStandardPrice;
            return this;
        }
        public Integer getCommonStandardPrice() {
            return this.commonStandardPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setInterTicketPrice(Integer interTicketPrice) {
            this.interTicketPrice = interTicketPrice;
            return this;
        }
        public Integer getInterTicketPrice() {
            return this.interTicketPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setSubtractedPrice(Integer subtractedPrice) {
            this.subtractedPrice = subtractedPrice;
            return this;
        }
        public Integer getSubtractedPrice() {
            return this.subtractedPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setOriginCommonPrice(Integer originCommonPrice) {
            this.originCommonPrice = originCommonPrice;
            return this;
        }
        public Integer getOriginCommonPrice() {
            return this.originCommonPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setDynamicPromotionPrice(Integer dynamicPromotionPrice) {
            this.dynamicPromotionPrice = dynamicPromotionPrice;
            return this;
        }
        public Integer getDynamicPromotionPrice() {
            return this.dynamicPromotionPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setInstallmentNum(Integer installmentNum) {
            this.installmentNum = installmentNum;
            return this;
        }
        public Integer getInstallmentNum() {
            return this.installmentNum;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setInstallmentPrice(Double installmentPrice) {
            this.installmentPrice = installmentPrice;
            return this;
        }
        public Double getInstallmentPrice() {
            return this.installmentPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setCompetitionDynamicPrice(Integer competitionDynamicPrice) {
            this.competitionDynamicPrice = competitionDynamicPrice;
            return this;
        }
        public Integer getCompetitionDynamicPrice() {
            return this.competitionDynamicPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setCompetitionPromotionPrice(Integer competitionPromotionPrice) {
            this.competitionPromotionPrice = competitionPromotionPrice;
            return this;
        }
        public Integer getCompetitionPromotionPrice() {
            return this.competitionPromotionPrice;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setMinBeforeControlPriceOfNormal(Integer minBeforeControlPriceOfNormal) {
            this.minBeforeControlPriceOfNormal = minBeforeControlPriceOfNormal;
            return this;
        }
        public Integer getMinBeforeControlPriceOfNormal() {
            return this.minBeforeControlPriceOfNormal;
        }

        public ModuleFlightItemListItemListShoppingItemMapValueSearchPrice setPriceShowInfo(ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo priceShowInfo) {
            this.priceShowInfo = priceShowInfo;
            return this;
        }
        public ModuleFlightItemListItemListShoppingItemMapValueSearchPricePriceShowInfo getPriceShowInfo() {
            return this.priceShowInfo;
        }

    }

}
