// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelGoodsQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelGoodsQueryResponseBodyModule module;

    /**
     * <strong>example:</strong>
     * <p>A5009956-1077-52FB-B520-EA8C7E91D722</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>210e847f16611516748613869de4f6</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelGoodsQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelGoodsQueryResponseBody self = new HotelGoodsQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelGoodsQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelGoodsQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelGoodsQueryResponseBody setModule(HotelGoodsQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelGoodsQueryResponseBodyModule getModule() {
        return this.module;
    }

    public HotelGoodsQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelGoodsQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelGoodsQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("hour")
        public Long hour;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("value")
        public Long value;

        public static HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList self = new HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList setHour(Long hour) {
            this.hour = hour;
            return this;
        }
        public Long getHour() {
            return this.hour;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO extends TeaModel {
        @NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cancel_policy_type")
        public Integer cancelPolicyType;

        public static HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO self = new HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO setBtripHotelCancelPolicyInfoDTOList(java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList) {
            this.btripHotelCancelPolicyInfoDTOList = btripHotelCancelPolicyInfoDTOList;
            return this;
        }
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> getBtripHotelCancelPolicyInfoDTOList() {
            return this.btripHotelCancelPolicyInfoDTOList;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO setCancelPolicyType(Integer cancelPolicyType) {
            this.cancelPolicyType = cancelPolicyType;
            return this;
        }
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule extends TeaModel {
        @NameInMap("btrip_hotel_cancel_policy_d_t_o")
        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO;

        @NameInMap("cancel_policy_title")
        public String cancelPolicyTitle;

        /**
         * <strong>example:</strong>
         * <p>2023-02-27</p>
         */
        @NameInMap("check_in")
        public String checkIn;

        public static HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule self = new HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule setBtripHotelCancelPolicyDTO(HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO) {
            this.btripHotelCancelPolicyDTO = btripHotelCancelPolicyDTO;
            return this;
        }
        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRuleBtripHotelCancelPolicyDTO getBtripHotelCancelPolicyDTO() {
            return this.btripHotelCancelPolicyDTO;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule setCancelPolicyTitle(String cancelPolicyTitle) {
            this.cancelPolicyTitle = cancelPolicyTitle;
            return this;
        }
        public String getCancelPolicyTitle() {
            return this.cancelPolicyTitle;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("title")
        public String title;

        public static HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc self = new HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail extends TeaModel {
        @NameInMap("label_name")
        public java.util.List<String> labelName;

        @NameInMap("money_desc")
        public String moneyDesc;

        public static HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail self = new HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail setLabelName(java.util.List<String> labelName) {
            this.labelName = labelName;
            return this;
        }
        public java.util.List<String> getLabelName() {
            return this.labelName;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail setMoneyDesc(String moneyDesc) {
            this.moneyDesc = moneyDesc;
            return this;
        }
        public String getMoneyDesc() {
            return this.moneyDesc;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc extends TeaModel {
        @NameInMap("cash_reduce_total")
        public String cashReduceTotal;

        @NameInMap("dinamic_label")
        public String dinamicLabel;

        @NameInMap("discount_detail")
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail> discountDetail;

        @NameInMap("sub_title")
        public String subTitle;

        @NameInMap("title")
        public String title;

        public static HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc self = new HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc setCashReduceTotal(String cashReduceTotal) {
            this.cashReduceTotal = cashReduceTotal;
            return this;
        }
        public String getCashReduceTotal() {
            return this.cashReduceTotal;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc setDinamicLabel(String dinamicLabel) {
            this.dinamicLabel = dinamicLabel;
            return this;
        }
        public String getDinamicLabel() {
            return this.dinamicLabel;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc setDiscountDetail(java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail> discountDetail) {
            this.discountDetail = discountDetail;
            return this;
        }
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDescDiscountDetail> getDiscountDetail() {
            return this.discountDetail;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc setSubTitle(String subTitle) {
            this.subTitle = subTitle;
            return this;
        }
        public String getSubTitle() {
            return this.subTitle;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("before_discount_price")
        public Long beforeDiscountPrice;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("breakfast")
        public String breakfast;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("discount_price")
        public Long discountPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("last_discounts_price")
        public Long lastDiscountsPrice;

        @NameInMap("last_discounts_rounding_price")
        public Long lastDiscountsRoundingPrice;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("last_num")
        public Integer lastNum;

        /**
         * <strong>example:</strong>
         * <p>2023-03-25</p>
         */
        @NameInMap("rate_start_time")
        public String rateStartTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        public static HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO self = new HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO setBeforeDiscountPrice(Long beforeDiscountPrice) {
            this.beforeDiscountPrice = beforeDiscountPrice;
            return this;
        }
        public Long getBeforeDiscountPrice() {
            return this.beforeDiscountPrice;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO setBreakfast(String breakfast) {
            this.breakfast = breakfast;
            return this;
        }
        public String getBreakfast() {
            return this.breakfast;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO setDiscountPrice(Long discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public Long getDiscountPrice() {
            return this.discountPrice;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO setLastDiscountsPrice(Long lastDiscountsPrice) {
            this.lastDiscountsPrice = lastDiscountsPrice;
            return this;
        }
        public Long getLastDiscountsPrice() {
            return this.lastDiscountsPrice;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO setLastDiscountsRoundingPrice(Long lastDiscountsRoundingPrice) {
            this.lastDiscountsRoundingPrice = lastDiscountsRoundingPrice;
            return this;
        }
        public Long getLastDiscountsRoundingPrice() {
            return this.lastDiscountsRoundingPrice;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO setLastNum(Integer lastNum) {
            this.lastNum = lastNum;
            return this;
        }
        public Integer getLastNum() {
            return this.lastNum;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO setRateStartTime(String rateStartTime) {
            this.rateStartTime = rateStartTime;
            return this;
        }
        public String getRateStartTime() {
            return this.rateStartTime;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRates extends TeaModel {
        @NameInMap("bed_desc")
        public String bedDesc;

        @NameInMap("bed_type")
        public String bedType;

        @NameInMap("breakfast")
        public String breakfast;

        @NameInMap("btrip_cancel_rule")
        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule btripCancelRule;

        @NameInMap("btrip_hotel_cancel_desc")
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc> btripHotelCancelDesc;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_smoking")
        public Boolean canSmoking;

        @NameInMap("cancel_policy_desc")
        public String cancelPolicyDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("cancel_policy_type")
        public Integer cancelPolicyType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("company_aassist")
        public String companyAassist;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("confirm_type")
        public Integer confirmType;

        /**
         * <strong>example:</strong>
         * <p>cny</p>
         */
        @NameInMap("currency_code")
        public String currencyCode;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("daily_price_format_yuan")
        public String dailyPriceFormatYuan;

        /**
         * <strong>example:</strong>
         * <p>400</p>
         */
        @NameInMap("daily_price_view")
        public String dailyPriceView;

        @NameInMap("discount_desc")
        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc discountDesc;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("end_time_daily")
        public String endTimeDaily;

        @NameInMap("hotel_detail_rate_price_d_t_o")
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO> hotelDetailRatePriceDTO;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("instant_confirm")
        public Boolean instantConfirm;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("inventory_price")
        public String inventoryPrice;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_business_pay4_goods")
        public Boolean isBusinessPay4Goods;

        @NameInMap("is_guarantee")
        public Integer isGuarantee;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_need_email")
        public Boolean isNeedEmail;

        /**
         * <strong>example:</strong>
         * <p>612673015638</p>
         */
        @NameInMap("item_id")
        public Long itemId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("last_cancel_time")
        public String lastCancelTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("max_occupancy")
        public Integer maxOccupancy;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("min_adv_hours")
        public Integer minAdvHours;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("min_days")
        public Integer minDays;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("nod")
        public Integer nod;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nop")
        public Integer nop;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("order_ship_time")
        public Integer orderShipTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("payment_type")
        public Integer paymentType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("price_type")
        public Integer priceType;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("promotion_info")
        public String promotionInfo;

        /**
         * <strong>example:</strong>
         * <p>4509447432148</p>
         */
        @NameInMap("rate_id")
        public Long rateId;

        @NameInMap("rate_plan_name")
        public String ratePlanName;

        /**
         * <strong>example:</strong>
         * <p>4509447432148</p>
         */
        @NameInMap("rp_id")
        public Long rpId;

        /**
         * <strong>example:</strong>
         * <p>4011822148</p>
         */
        @NameInMap("seller_id")
        public Long sellerId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("start_time_daily")
        public String startTimeDaily;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>2321</p>
         */
        @NameInMap("supplier_code")
        public String supplierCode;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("supplier_name")
        public String supplierName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("support_special_invoice")
        public Boolean supportSpecialInvoice;

        /**
         * <strong>example:</strong>
         * <p>40000</p>
         */
        @NameInMap("unrounding_daily_price_format_yuan")
        public String unroundingDailyPriceFormatYuan;

        public static HotelGoodsQueryResponseBodyModuleRoomsRates build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRates self = new HotelGoodsQueryResponseBodyModuleRoomsRates();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setBedDesc(String bedDesc) {
            this.bedDesc = bedDesc;
            return this;
        }
        public String getBedDesc() {
            return this.bedDesc;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setBedType(String bedType) {
            this.bedType = bedType;
            return this;
        }
        public String getBedType() {
            return this.bedType;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setBreakfast(String breakfast) {
            this.breakfast = breakfast;
            return this;
        }
        public String getBreakfast() {
            return this.breakfast;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setBtripCancelRule(HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule btripCancelRule) {
            this.btripCancelRule = btripCancelRule;
            return this;
        }
        public HotelGoodsQueryResponseBodyModuleRoomsRatesBtripCancelRule getBtripCancelRule() {
            return this.btripCancelRule;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setBtripHotelCancelDesc(java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc> btripHotelCancelDesc) {
            this.btripHotelCancelDesc = btripHotelCancelDesc;
            return this;
        }
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesBtripHotelCancelDesc> getBtripHotelCancelDesc() {
            return this.btripHotelCancelDesc;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setCanSmoking(Boolean canSmoking) {
            this.canSmoking = canSmoking;
            return this;
        }
        public Boolean getCanSmoking() {
            return this.canSmoking;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setCancelPolicyDesc(String cancelPolicyDesc) {
            this.cancelPolicyDesc = cancelPolicyDesc;
            return this;
        }
        public String getCancelPolicyDesc() {
            return this.cancelPolicyDesc;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setCancelPolicyType(Integer cancelPolicyType) {
            this.cancelPolicyType = cancelPolicyType;
            return this;
        }
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setCompanyAassist(String companyAassist) {
            this.companyAassist = companyAassist;
            return this;
        }
        public String getCompanyAassist() {
            return this.companyAassist;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setConfirmType(Integer confirmType) {
            this.confirmType = confirmType;
            return this;
        }
        public Integer getConfirmType() {
            return this.confirmType;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setDailyPriceFormatYuan(String dailyPriceFormatYuan) {
            this.dailyPriceFormatYuan = dailyPriceFormatYuan;
            return this;
        }
        public String getDailyPriceFormatYuan() {
            return this.dailyPriceFormatYuan;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setDailyPriceView(String dailyPriceView) {
            this.dailyPriceView = dailyPriceView;
            return this;
        }
        public String getDailyPriceView() {
            return this.dailyPriceView;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setDiscountDesc(HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc discountDesc) {
            this.discountDesc = discountDesc;
            return this;
        }
        public HotelGoodsQueryResponseBodyModuleRoomsRatesDiscountDesc getDiscountDesc() {
            return this.discountDesc;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setEndTimeDaily(String endTimeDaily) {
            this.endTimeDaily = endTimeDaily;
            return this;
        }
        public String getEndTimeDaily() {
            return this.endTimeDaily;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setHotelDetailRatePriceDTO(java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO> hotelDetailRatePriceDTO) {
            this.hotelDetailRatePriceDTO = hotelDetailRatePriceDTO;
            return this;
        }
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRatesHotelDetailRatePriceDTO> getHotelDetailRatePriceDTO() {
            return this.hotelDetailRatePriceDTO;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setInstantConfirm(Boolean instantConfirm) {
            this.instantConfirm = instantConfirm;
            return this;
        }
        public Boolean getInstantConfirm() {
            return this.instantConfirm;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setInventoryPrice(String inventoryPrice) {
            this.inventoryPrice = inventoryPrice;
            return this;
        }
        public String getInventoryPrice() {
            return this.inventoryPrice;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setIsBusinessPay4Goods(Boolean isBusinessPay4Goods) {
            this.isBusinessPay4Goods = isBusinessPay4Goods;
            return this;
        }
        public Boolean getIsBusinessPay4Goods() {
            return this.isBusinessPay4Goods;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setIsGuarantee(Integer isGuarantee) {
            this.isGuarantee = isGuarantee;
            return this;
        }
        public Integer getIsGuarantee() {
            return this.isGuarantee;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setIsNeedEmail(Boolean isNeedEmail) {
            this.isNeedEmail = isNeedEmail;
            return this;
        }
        public Boolean getIsNeedEmail() {
            return this.isNeedEmail;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setItemId(Long itemId) {
            this.itemId = itemId;
            return this;
        }
        public Long getItemId() {
            return this.itemId;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setLastCancelTime(String lastCancelTime) {
            this.lastCancelTime = lastCancelTime;
            return this;
        }
        public String getLastCancelTime() {
            return this.lastCancelTime;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setMaxOccupancy(Integer maxOccupancy) {
            this.maxOccupancy = maxOccupancy;
            return this;
        }
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setMinAdvHours(Integer minAdvHours) {
            this.minAdvHours = minAdvHours;
            return this;
        }
        public Integer getMinAdvHours() {
            return this.minAdvHours;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setMinDays(Integer minDays) {
            this.minDays = minDays;
            return this;
        }
        public Integer getMinDays() {
            return this.minDays;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setNod(Integer nod) {
            this.nod = nod;
            return this;
        }
        public Integer getNod() {
            return this.nod;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setNop(Integer nop) {
            this.nop = nop;
            return this;
        }
        public Integer getNop() {
            return this.nop;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setOrderShipTime(Integer orderShipTime) {
            this.orderShipTime = orderShipTime;
            return this;
        }
        public Integer getOrderShipTime() {
            return this.orderShipTime;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setPaymentType(Integer paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public Integer getPaymentType() {
            return this.paymentType;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setPriceType(Integer priceType) {
            this.priceType = priceType;
            return this;
        }
        public Integer getPriceType() {
            return this.priceType;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setPromotionInfo(String promotionInfo) {
            this.promotionInfo = promotionInfo;
            return this;
        }
        public String getPromotionInfo() {
            return this.promotionInfo;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setRateId(Long rateId) {
            this.rateId = rateId;
            return this;
        }
        public Long getRateId() {
            return this.rateId;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setRatePlanName(String ratePlanName) {
            this.ratePlanName = ratePlanName;
            return this;
        }
        public String getRatePlanName() {
            return this.ratePlanName;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setRpId(Long rpId) {
            this.rpId = rpId;
            return this;
        }
        public Long getRpId() {
            return this.rpId;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setSellerId(Long sellerId) {
            this.sellerId = sellerId;
            return this;
        }
        public Long getSellerId() {
            return this.sellerId;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setStartTimeDaily(String startTimeDaily) {
            this.startTimeDaily = startTimeDaily;
            return this;
        }
        public String getStartTimeDaily() {
            return this.startTimeDaily;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setSupplierCode(String supplierCode) {
            this.supplierCode = supplierCode;
            return this;
        }
        public String getSupplierCode() {
            return this.supplierCode;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setSupplierName(String supplierName) {
            this.supplierName = supplierName;
            return this;
        }
        public String getSupplierName() {
            return this.supplierName;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setSupportSpecialInvoice(Boolean supportSpecialInvoice) {
            this.supportSpecialInvoice = supportSpecialInvoice;
            return this;
        }
        public Boolean getSupportSpecialInvoice() {
            return this.supportSpecialInvoice;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRates setUnroundingDailyPriceFormatYuan(String unroundingDailyPriceFormatYuan) {
            this.unroundingDailyPriceFormatYuan = unroundingDailyPriceFormatYuan;
            return this;
        }
        public String getUnroundingDailyPriceFormatYuan() {
            return this.unroundingDailyPriceFormatYuan;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRoomsRoomService extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>#000000</p>
         */
        @NameInMap("color")
        public String color;

        @NameInMap("desc")
        public String desc;

        /**
         * <strong>example:</strong>
         * <p>#4AA900</p>
         */
        @NameInMap("highlight_color_color")
        public String highlightColorColor;

        @NameInMap("title")
        public String title;

        public static HotelGoodsQueryResponseBodyModuleRoomsRoomService build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRoomsRoomService self = new HotelGoodsQueryResponseBodyModuleRoomsRoomService();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRoomService setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRoomService setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRoomService setHighlightColorColor(String highlightColorColor) {
            this.highlightColorColor = highlightColorColor;
            return this;
        }
        public String getHighlightColorColor() {
            return this.highlightColorColor;
        }

        public HotelGoodsQueryResponseBodyModuleRoomsRoomService setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class HotelGoodsQueryResponseBodyModuleRooms extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("area")
        public String area;

        @NameInMap("bed_type_string")
        public String bedTypeString;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("extra_bed")
        public Boolean extraBed;

        @NameInMap("facility")
        public String facility;

        /**
         * <strong>example:</strong>
         * <p>1,2,3,4,5,6</p>
         */
        @NameInMap("floor")
        public String floor;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_occupancy")
        public Integer maxOccupancy;

        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("network_service")
        public String networkService;

        @NameInMap("pics")
        public String pics;

        @NameInMap("rates")
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRates> rates;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("room_dasc")
        public String roomDasc;

        @NameInMap("room_facility")
        public java.util.List<String> roomFacility;

        @NameInMap("room_service")
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRoomService> roomService;

        /**
         * <strong>example:</strong>
         * <p>100929</p>
         */
        @NameInMap("srid")
        public Long srid;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        @NameInMap("window_type")
        public String windowType;

        public static HotelGoodsQueryResponseBodyModuleRooms build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModuleRooms self = new HotelGoodsQueryResponseBodyModuleRooms();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModuleRooms setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setBedTypeString(String bedTypeString) {
            this.bedTypeString = bedTypeString;
            return this;
        }
        public String getBedTypeString() {
            return this.bedTypeString;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setExtraBed(Boolean extraBed) {
            this.extraBed = extraBed;
            return this;
        }
        public Boolean getExtraBed() {
            return this.extraBed;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setFacility(String facility) {
            this.facility = facility;
            return this;
        }
        public String getFacility() {
            return this.facility;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setFloor(String floor) {
            this.floor = floor;
            return this;
        }
        public String getFloor() {
            return this.floor;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setMaxOccupancy(Integer maxOccupancy) {
            this.maxOccupancy = maxOccupancy;
            return this;
        }
        public Integer getMaxOccupancy() {
            return this.maxOccupancy;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setNetworkService(String networkService) {
            this.networkService = networkService;
            return this;
        }
        public String getNetworkService() {
            return this.networkService;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setPics(String pics) {
            this.pics = pics;
            return this;
        }
        public String getPics() {
            return this.pics;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setRates(java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRates> rates) {
            this.rates = rates;
            return this;
        }
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRates> getRates() {
            return this.rates;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setRoomDasc(String roomDasc) {
            this.roomDasc = roomDasc;
            return this;
        }
        public String getRoomDasc() {
            return this.roomDasc;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setRoomFacility(java.util.List<String> roomFacility) {
            this.roomFacility = roomFacility;
            return this;
        }
        public java.util.List<String> getRoomFacility() {
            return this.roomFacility;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setRoomService(java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRoomService> roomService) {
            this.roomService = roomService;
            return this;
        }
        public java.util.List<HotelGoodsQueryResponseBodyModuleRoomsRoomService> getRoomService() {
            return this.roomService;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setSrid(Long srid) {
            this.srid = srid;
            return this;
        }
        public Long getSrid() {
            return this.srid;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public HotelGoodsQueryResponseBodyModuleRooms setWindowType(String windowType) {
            this.windowType = windowType;
            return this;
        }
        public String getWindowType() {
            return this.windowType;
        }

    }

    public static class HotelGoodsQueryResponseBodyModule extends TeaModel {
        @NameInMap("address")
        public String address;

        @NameInMap("booking_instructions")
        public java.util.Map<String, String> bookingInstructions;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("can_foreigner")
        public Boolean canForeigner;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15</p>
         */
        @NameInMap("check_in")
        public String checkIn;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15</p>
         */
        @NameInMap("check_out")
        public String checkOut;

        @NameInMap("descriptions")
        public java.util.List<String> descriptions;

        @NameInMap("dinamic_banner_pic_urls")
        public java.util.List<String> dinamicBannerPicUrls;

        /**
         * <strong>example:</strong>
         * <p>17:00</p>
         */
        @NameInMap("early_arrival_time")
        public String earlyArrivalTime;

        /**
         * <strong>example:</strong>
         * <p>29382</p>
         */
        @NameInMap("hotel_id")
        public Long hotelId;

        @NameInMap("hotel_name")
        public String hotelName;

        /**
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("late_arrival_time")
        public String lateArrivalTime;

        @NameInMap("rooms")
        public java.util.List<HotelGoodsQueryResponseBodyModuleRooms> rooms;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("search_id")
        public String searchId;

        public static HotelGoodsQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelGoodsQueryResponseBodyModule self = new HotelGoodsQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelGoodsQueryResponseBodyModule setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public HotelGoodsQueryResponseBodyModule setBookingInstructions(java.util.Map<String, String> bookingInstructions) {
            this.bookingInstructions = bookingInstructions;
            return this;
        }
        public java.util.Map<String, String> getBookingInstructions() {
            return this.bookingInstructions;
        }

        public HotelGoodsQueryResponseBodyModule setCanForeigner(Boolean canForeigner) {
            this.canForeigner = canForeigner;
            return this;
        }
        public Boolean getCanForeigner() {
            return this.canForeigner;
        }

        public HotelGoodsQueryResponseBodyModule setCheckIn(String checkIn) {
            this.checkIn = checkIn;
            return this;
        }
        public String getCheckIn() {
            return this.checkIn;
        }

        public HotelGoodsQueryResponseBodyModule setCheckOut(String checkOut) {
            this.checkOut = checkOut;
            return this;
        }
        public String getCheckOut() {
            return this.checkOut;
        }

        public HotelGoodsQueryResponseBodyModule setDescriptions(java.util.List<String> descriptions) {
            this.descriptions = descriptions;
            return this;
        }
        public java.util.List<String> getDescriptions() {
            return this.descriptions;
        }

        public HotelGoodsQueryResponseBodyModule setDinamicBannerPicUrls(java.util.List<String> dinamicBannerPicUrls) {
            this.dinamicBannerPicUrls = dinamicBannerPicUrls;
            return this;
        }
        public java.util.List<String> getDinamicBannerPicUrls() {
            return this.dinamicBannerPicUrls;
        }

        public HotelGoodsQueryResponseBodyModule setEarlyArrivalTime(String earlyArrivalTime) {
            this.earlyArrivalTime = earlyArrivalTime;
            return this;
        }
        public String getEarlyArrivalTime() {
            return this.earlyArrivalTime;
        }

        public HotelGoodsQueryResponseBodyModule setHotelId(Long hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public Long getHotelId() {
            return this.hotelId;
        }

        public HotelGoodsQueryResponseBodyModule setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelGoodsQueryResponseBodyModule setLateArrivalTime(String lateArrivalTime) {
            this.lateArrivalTime = lateArrivalTime;
            return this;
        }
        public String getLateArrivalTime() {
            return this.lateArrivalTime;
        }

        public HotelGoodsQueryResponseBodyModule setRooms(java.util.List<HotelGoodsQueryResponseBodyModuleRooms> rooms) {
            this.rooms = rooms;
            return this;
        }
        public java.util.List<HotelGoodsQueryResponseBodyModuleRooms> getRooms() {
            return this.rooms;
        }

        public HotelGoodsQueryResponseBodyModule setSearchId(String searchId) {
            this.searchId = searchId;
            return this;
        }
        public String getSearchId() {
            return this.searchId;
        }

    }

}
