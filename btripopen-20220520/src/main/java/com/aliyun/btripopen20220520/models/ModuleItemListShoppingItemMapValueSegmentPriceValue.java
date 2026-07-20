// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ModuleItemListShoppingItemMapValueSegmentPriceValue extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>管控总价格（单位：分）</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>采购产品，服务商的销售价</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>头等舱基准价格</p>
     */
    @NameInMap("first_standard_price")
    public Integer firstStandardPrice;

    /**
     * <strong>example:</strong>
     * <p>商务舱基准价格</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>直减往返，航段上减去的钱</p>
     */
    @NameInMap("subtracted_price")
    public Integer subtractedPrice;

    /**
     * <strong>example:</strong>
     * <p>优惠前价格（一舱多价）[动态优惠专用]</p>
     */
    @NameInMap("origin_common_price")
    public Integer originCommonPrice;

    /**
     * <strong>example:</strong>
     * <p>动态优惠后的价格 [动态优惠专用]</p>
     */
    @NameInMap("dynamic_promotion_price")
    public Integer dynamicPromotionPrice;

    /**
     * <strong>example:</strong>
     * <p>分期数</p>
     */
    @NameInMap("installment_num")
    public Integer installmentNum;

    /**
     * <strong>example:</strong>
     * <p>分期每期价格</p>
     */
    @NameInMap("installment_price")
    public Double installmentPrice;

    /**
     * <strong>example:</strong>
     * <p>竞品动态补贴后的目标价格</p>
     */
    @NameInMap("competition_dynamic_price")
    public Integer competitionDynamicPrice;

    /**
     * <strong>example:</strong>
     * <p>竞品动态补贴，可减的优惠</p>
     */
    @NameInMap("competition_promotion_price")
    public Integer competitionPromotionPrice;

    /**
     * <strong>example:</strong>
     * <p>当前航班组合普通报价限价前最低价格</p>
     */
    @NameInMap("min_before_control_price_of_normal")
    public Integer minBeforeControlPriceOfNormal;

    @NameInMap("price_show_info")
    public ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo priceShowInfo;

    public static ModuleItemListShoppingItemMapValueSegmentPriceValue build(java.util.Map<String, ?> map) throws Exception {
        ModuleItemListShoppingItemMapValueSegmentPriceValue self = new ModuleItemListShoppingItemMapValueSegmentPriceValue();
        return TeaModel.build(map, self);
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setFloorPrice(Integer floorPrice) {
        this.floorPrice = floorPrice;
        return this;
    }
    public Integer getFloorPrice() {
        return this.floorPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setTicketPrice(Integer ticketPrice) {
        this.ticketPrice = ticketPrice;
        return this;
    }
    public Integer getTicketPrice() {
        return this.ticketPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }
    public Integer getSellPrice() {
        return this.sellPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setOriginalSellPrice(Integer originalSellPrice) {
        this.originalSellPrice = originalSellPrice;
        return this;
    }
    public Integer getOriginalSellPrice() {
        return this.originalSellPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setBaseTotalPrice(Integer baseTotalPrice) {
        this.baseTotalPrice = baseTotalPrice;
        return this;
    }
    public Integer getBaseTotalPrice() {
        return this.baseTotalPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setBeforeControlPrice(Integer beforeControlPrice) {
        this.beforeControlPrice = beforeControlPrice;
        return this;
    }
    public Integer getBeforeControlPrice() {
        return this.beforeControlPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setTax(Integer tax) {
        this.tax = tax;
        return this;
    }
    public Integer getTax() {
        return this.tax;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setSupplyPrice(Integer supplyPrice) {
        this.supplyPrice = supplyPrice;
        return this;
    }
    public Integer getSupplyPrice() {
        return this.supplyPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setBasicCabinPrice(Integer basicCabinPrice) {
        this.basicCabinPrice = basicCabinPrice;
        return this;
    }
    public Integer getBasicCabinPrice() {
        return this.basicCabinPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setBuildPrice(Integer buildPrice) {
        this.buildPrice = buildPrice;
        return this;
    }
    public Integer getBuildPrice() {
        return this.buildPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setOilPrice(Integer oilPrice) {
        this.oilPrice = oilPrice;
        return this;
    }
    public Integer getOilPrice() {
        return this.oilPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setFirstStandardPrice(Integer firstStandardPrice) {
        this.firstStandardPrice = firstStandardPrice;
        return this;
    }
    public Integer getFirstStandardPrice() {
        return this.firstStandardPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setBusinessStandardPrice(Integer businessStandardPrice) {
        this.businessStandardPrice = businessStandardPrice;
        return this;
    }
    public Integer getBusinessStandardPrice() {
        return this.businessStandardPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setCommonStandardPrice(Integer commonStandardPrice) {
        this.commonStandardPrice = commonStandardPrice;
        return this;
    }
    public Integer getCommonStandardPrice() {
        return this.commonStandardPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setInterTicketPrice(Integer interTicketPrice) {
        this.interTicketPrice = interTicketPrice;
        return this;
    }
    public Integer getInterTicketPrice() {
        return this.interTicketPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setSubtractedPrice(Integer subtractedPrice) {
        this.subtractedPrice = subtractedPrice;
        return this;
    }
    public Integer getSubtractedPrice() {
        return this.subtractedPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setOriginCommonPrice(Integer originCommonPrice) {
        this.originCommonPrice = originCommonPrice;
        return this;
    }
    public Integer getOriginCommonPrice() {
        return this.originCommonPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setDynamicPromotionPrice(Integer dynamicPromotionPrice) {
        this.dynamicPromotionPrice = dynamicPromotionPrice;
        return this;
    }
    public Integer getDynamicPromotionPrice() {
        return this.dynamicPromotionPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setInstallmentNum(Integer installmentNum) {
        this.installmentNum = installmentNum;
        return this;
    }
    public Integer getInstallmentNum() {
        return this.installmentNum;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setInstallmentPrice(Double installmentPrice) {
        this.installmentPrice = installmentPrice;
        return this;
    }
    public Double getInstallmentPrice() {
        return this.installmentPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setCompetitionDynamicPrice(Integer competitionDynamicPrice) {
        this.competitionDynamicPrice = competitionDynamicPrice;
        return this;
    }
    public Integer getCompetitionDynamicPrice() {
        return this.competitionDynamicPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setCompetitionPromotionPrice(Integer competitionPromotionPrice) {
        this.competitionPromotionPrice = competitionPromotionPrice;
        return this;
    }
    public Integer getCompetitionPromotionPrice() {
        return this.competitionPromotionPrice;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setMinBeforeControlPriceOfNormal(Integer minBeforeControlPriceOfNormal) {
        this.minBeforeControlPriceOfNormal = minBeforeControlPriceOfNormal;
        return this;
    }
    public Integer getMinBeforeControlPriceOfNormal() {
        return this.minBeforeControlPriceOfNormal;
    }

    public ModuleItemListShoppingItemMapValueSegmentPriceValue setPriceShowInfo(ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo priceShowInfo) {
        this.priceShowInfo = priceShowInfo;
        return this;
    }
    public ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo getPriceShowInfo() {
        return this.priceShowInfo;
    }

    public static class ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.8折</p>
         */
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

        public static ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo build(java.util.Map<String, ?> map) throws Exception {
            ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo self = new ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo();
            return TeaModel.build(map, self);
        }

        public ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo setDiscountInfo(String discountInfo) {
            this.discountInfo = discountInfo;
            return this;
        }
        public String getDiscountInfo() {
            return this.discountInfo;
        }

        public ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo setDiscountNum(Double discountNum) {
            this.discountNum = discountNum;
            return this;
        }
        public Double getDiscountNum() {
            return this.discountNum;
        }

        public ModuleItemListShoppingItemMapValueSegmentPriceValuePriceShowInfo setShowTicketPrice(Boolean showTicketPrice) {
            this.showTicketPrice = showTicketPrice;
            return this;
        }
        public Boolean getShowTicketPrice() {
            return this.showTicketPrice;
        }

    }

}
