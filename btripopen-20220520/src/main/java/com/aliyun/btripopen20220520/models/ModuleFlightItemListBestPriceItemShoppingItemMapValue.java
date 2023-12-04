// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleFlightItemListBestPriceItemShoppingItemMapValue extends TeaModel {
    @NameInMap("cabin_quantity_list")
    public java.util.List<ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList> cabinQuantityList;

    @NameInMap("search_price")
    public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice searchPrice;

    @NameInMap("segment_price_list")
    public java.util.List<ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList> segmentPriceList;

    /**
     * <p>id</p>
     */
    @NameInMap("id")
    public String id;

    @NameInMap("cabin_quantity")
    public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue> cabinQuantity;

    @NameInMap("segment_price")
    public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceValue> segmentPrice;

    public static ModuleFlightItemListBestPriceItemShoppingItemMapValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleFlightItemListBestPriceItemShoppingItemMapValue self = new ModuleFlightItemListBestPriceItemShoppingItemMapValue();
        return TeaModel.build(map, self);
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValue setCabinQuantityList(java.util.List<ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList> cabinQuantityList) {
        this.cabinQuantityList = cabinQuantityList;
        return this;
    }
    public java.util.List<ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList> getCabinQuantityList() {
        return this.cabinQuantityList;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValue setSearchPrice(ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice searchPrice) {
        this.searchPrice = searchPrice;
        return this;
    }
    public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice getSearchPrice() {
        return this.searchPrice;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValue setSegmentPriceList(java.util.List<ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList> segmentPriceList) {
        this.segmentPriceList = segmentPriceList;
        return this;
    }
    public java.util.List<ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList> getSegmentPriceList() {
        return this.segmentPriceList;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValue setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValue setCabinQuantity(java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue> cabinQuantity) {
        this.cabinQuantity = cabinQuantity;
        return this;
    }
    public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityValue> getCabinQuantity() {
        return this.cabinQuantity;
    }

    public ModuleFlightItemListBestPriceItemShoppingItemMapValue setSegmentPrice(java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceValue> segmentPrice) {
        this.segmentPrice = segmentPrice;
        return this;
    }
    public java.util.Map<String, ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceValue> getSegmentPrice() {
        return this.segmentPrice;
    }

    public static class ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition extends TeaModel {
        @NameInMap("segment_index")
        public Integer segmentIndex;

        @NameInMap("journey_index")
        public Integer journeyIndex;

        public static ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

    }

    public static class ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin extends TeaModel {
        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("cabin_class_name")
        public String cabinClassName;

        @NameInMap("quantity")
        public String quantity;

        public static ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin setCabinClassName(String cabinClassName) {
            this.cabinClassName = cabinClassName;
            return this;
        }
        public String getCabinClassName() {
            return this.cabinClassName;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

    }

    public static class ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList extends TeaModel {
        @NameInMap("segment_position")
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition;

        @NameInMap("cabin")
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin cabin;

        public static ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList setSegmentPosition(ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityList setCabin(ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin cabin) {
            this.cabin = cabin;
            return this;
        }
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueCabinQuantityListCabin getCabin() {
            return this.cabin;
        }

    }

    public static class ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo extends TeaModel {
        @NameInMap("discount_info")
        public String discountInfo;

        @NameInMap("discount_num")
        public Double discountNum;

        @NameInMap("show_ticket_price")
        public Boolean showTicketPrice;

        public static ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo setDiscountInfo(String discountInfo) {
            this.discountInfo = discountInfo;
            return this;
        }
        public String getDiscountInfo() {
            return this.discountInfo;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo setDiscountNum(Double discountNum) {
            this.discountNum = discountNum;
            return this;
        }
        public Double getDiscountNum() {
            return this.discountNum;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo setShowTicketPrice(Boolean showTicketPrice) {
            this.showTicketPrice = showTicketPrice;
            return this;
        }
        public Boolean getShowTicketPrice() {
            return this.showTicketPrice;
        }

    }

    public static class ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice extends TeaModel {
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
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo priceShowInfo;

        public static ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setFloorPrice(Integer floorPrice) {
            this.floorPrice = floorPrice;
            return this;
        }
        public Integer getFloorPrice() {
            return this.floorPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setOriginalSellPrice(Integer originalSellPrice) {
            this.originalSellPrice = originalSellPrice;
            return this;
        }
        public Integer getOriginalSellPrice() {
            return this.originalSellPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setBaseTotalPrice(Integer baseTotalPrice) {
            this.baseTotalPrice = baseTotalPrice;
            return this;
        }
        public Integer getBaseTotalPrice() {
            return this.baseTotalPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setBeforeControlPrice(Integer beforeControlPrice) {
            this.beforeControlPrice = beforeControlPrice;
            return this;
        }
        public Integer getBeforeControlPrice() {
            return this.beforeControlPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setSupplyPrice(Integer supplyPrice) {
            this.supplyPrice = supplyPrice;
            return this;
        }
        public Integer getSupplyPrice() {
            return this.supplyPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setBasicCabinPrice(Integer basicCabinPrice) {
            this.basicCabinPrice = basicCabinPrice;
            return this;
        }
        public Integer getBasicCabinPrice() {
            return this.basicCabinPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setBuildPrice(Integer buildPrice) {
            this.buildPrice = buildPrice;
            return this;
        }
        public Integer getBuildPrice() {
            return this.buildPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setOilPrice(Integer oilPrice) {
            this.oilPrice = oilPrice;
            return this;
        }
        public Integer getOilPrice() {
            return this.oilPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setFirstStandardPrice(Integer firstStandardPrice) {
            this.firstStandardPrice = firstStandardPrice;
            return this;
        }
        public Integer getFirstStandardPrice() {
            return this.firstStandardPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setBusinessStandardPrice(Integer businessStandardPrice) {
            this.businessStandardPrice = businessStandardPrice;
            return this;
        }
        public Integer getBusinessStandardPrice() {
            return this.businessStandardPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setCommonStandardPrice(Integer commonStandardPrice) {
            this.commonStandardPrice = commonStandardPrice;
            return this;
        }
        public Integer getCommonStandardPrice() {
            return this.commonStandardPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setInterTicketPrice(Integer interTicketPrice) {
            this.interTicketPrice = interTicketPrice;
            return this;
        }
        public Integer getInterTicketPrice() {
            return this.interTicketPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setSubtractedPrice(Integer subtractedPrice) {
            this.subtractedPrice = subtractedPrice;
            return this;
        }
        public Integer getSubtractedPrice() {
            return this.subtractedPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setOriginCommonPrice(Integer originCommonPrice) {
            this.originCommonPrice = originCommonPrice;
            return this;
        }
        public Integer getOriginCommonPrice() {
            return this.originCommonPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setDynamicPromotionPrice(Integer dynamicPromotionPrice) {
            this.dynamicPromotionPrice = dynamicPromotionPrice;
            return this;
        }
        public Integer getDynamicPromotionPrice() {
            return this.dynamicPromotionPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setInstallmentNum(Integer installmentNum) {
            this.installmentNum = installmentNum;
            return this;
        }
        public Integer getInstallmentNum() {
            return this.installmentNum;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setInstallmentPrice(Double installmentPrice) {
            this.installmentPrice = installmentPrice;
            return this;
        }
        public Double getInstallmentPrice() {
            return this.installmentPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setCompetitionDynamicPrice(Integer competitionDynamicPrice) {
            this.competitionDynamicPrice = competitionDynamicPrice;
            return this;
        }
        public Integer getCompetitionDynamicPrice() {
            return this.competitionDynamicPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setCompetitionPromotionPrice(Integer competitionPromotionPrice) {
            this.competitionPromotionPrice = competitionPromotionPrice;
            return this;
        }
        public Integer getCompetitionPromotionPrice() {
            return this.competitionPromotionPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setMinBeforeControlPriceOfNormal(Integer minBeforeControlPriceOfNormal) {
            this.minBeforeControlPriceOfNormal = minBeforeControlPriceOfNormal;
            return this;
        }
        public Integer getMinBeforeControlPriceOfNormal() {
            return this.minBeforeControlPriceOfNormal;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPrice setPriceShowInfo(ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo priceShowInfo) {
            this.priceShowInfo = priceShowInfo;
            return this;
        }
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSearchPricePriceShowInfo getPriceShowInfo() {
            return this.priceShowInfo;
        }

    }

    public static class ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition extends TeaModel {
        @NameInMap("journey_index")
        public Integer journeyIndex;

        @NameInMap("segment_index")
        public Integer segmentIndex;

        public static ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition setJourneyIndex(Integer journeyIndex) {
            this.journeyIndex = journeyIndex;
            return this;
        }
        public Integer getJourneyIndex() {
            return this.journeyIndex;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition setSegmentIndex(Integer segmentIndex) {
            this.segmentIndex = segmentIndex;
            return this;
        }
        public Integer getSegmentIndex() {
            return this.segmentIndex;
        }

    }

    public static class ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice extends TeaModel {
        @NameInMap("ticket_price")
        public Integer ticketPrice;

        @NameInMap("sell_price")
        public Integer sellPrice;

        @NameInMap("tax")
        public Integer tax;

        public static ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Integer getTicketPrice() {
            return this.ticketPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setSellPrice(Integer sellPrice) {
            this.sellPrice = sellPrice;
            return this;
        }
        public Integer getSellPrice() {
            return this.sellPrice;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice setTax(Integer tax) {
            this.tax = tax;
            return this;
        }
        public Integer getTax() {
            return this.tax;
        }

    }

    public static class ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList extends TeaModel {
        @NameInMap("segment_position")
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition;

        @NameInMap("search_price")
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice searchPrice;

        public static ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList build(java.util.Map<String, ?> map) throws Exception {
            ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList self = new ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList();
            return TeaModel.build(map, self);
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList setSegmentPosition(ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition segmentPosition) {
            this.segmentPosition = segmentPosition;
            return this;
        }
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSegmentPosition getSegmentPosition() {
            return this.segmentPosition;
        }

        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceList setSearchPrice(ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice searchPrice) {
            this.searchPrice = searchPrice;
            return this;
        }
        public ModuleFlightItemListBestPriceItemShoppingItemMapValueSegmentPriceListSearchPrice getSearchPrice() {
            return this.searchPrice;
        }

    }

}
