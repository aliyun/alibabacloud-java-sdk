// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderPreValidateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelOrderPreValidateResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>B72B39C8-32DE-558D-AD1C-D53F11F6ADFE</p>
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
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderPreValidateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderPreValidateResponseBody self = new HotelOrderPreValidateResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderPreValidateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderPreValidateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderPreValidateResponseBody setModule(HotelOrderPreValidateResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelOrderPreValidateResponseBodyModule getModule() {
        return this.module;
    }

    public HotelOrderPreValidateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderPreValidateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderPreValidateResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderPreValidateResponseBodyModuleItemInvoice extends TeaModel {
        @NameInMap("support_special")
        public Boolean supportSpecial;

        public static HotelOrderPreValidateResponseBodyModuleItemInvoice build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateResponseBodyModuleItemInvoice self = new HotelOrderPreValidateResponseBodyModuleItemInvoice();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateResponseBodyModuleItemInvoice setSupportSpecial(Boolean supportSpecial) {
            this.supportSpecial = supportSpecial;
            return this;
        }
        public Boolean getSupportSpecial() {
            return this.supportSpecial;
        }

    }

    public static class HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("check_status")
        public Boolean checkStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("need_check")
        public Boolean needCheck;

        @NameInMap("promotion_code")
        public String promotionCode;

        /**
         * <strong>example:</strong>
         * <p>12893</p>
         */
        @NameInMap("promotion_id")
        public String promotionId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("promotion_name")
        public String promotionName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("promotion_price")
        public Long promotionPrice;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("promotion_type")
        public String promotionType;

        public static HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList self = new HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList setCheckStatus(Boolean checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Boolean getCheckStatus() {
            return this.checkStatus;
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList setNeedCheck(Boolean needCheck) {
            this.needCheck = needCheck;
            return this;
        }
        public Boolean getNeedCheck() {
            return this.needCheck;
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList setPromotionCode(String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public String getPromotionCode() {
            return this.promotionCode;
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList setPromotionId(String promotionId) {
            this.promotionId = promotionId;
            return this;
        }
        public String getPromotionId() {
            return this.promotionId;
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList setPromotionName(String promotionName) {
            this.promotionName = promotionName;
            return this;
        }
        public String getPromotionName() {
            return this.promotionName;
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList setPromotionPrice(Long promotionPrice) {
            this.promotionPrice = promotionPrice;
            return this;
        }
        public Long getPromotionPrice() {
            return this.promotionPrice;
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList setPromotionType(String promotionType) {
            this.promotionType = promotionType;
            return this;
        }
        public String getPromotionType() {
            return this.promotionType;
        }

    }

    public static class HotelOrderPreValidateResponseBodyModulePromotionInfo extends TeaModel {
        @NameInMap("ext_attr_map")
        public java.util.Map<String, String> extAttrMap;

        @NameInMap("promotion_detail_info_list")
        public java.util.List<HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList> promotionDetailInfoList;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("promotion_total_price")
        public Long promotionTotalPrice;

        public static HotelOrderPreValidateResponseBodyModulePromotionInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateResponseBodyModulePromotionInfo self = new HotelOrderPreValidateResponseBodyModulePromotionInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfo setExtAttrMap(java.util.Map<String, String> extAttrMap) {
            this.extAttrMap = extAttrMap;
            return this;
        }
        public java.util.Map<String, String> getExtAttrMap() {
            return this.extAttrMap;
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfo setPromotionDetailInfoList(java.util.List<HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList> promotionDetailInfoList) {
            this.promotionDetailInfoList = promotionDetailInfoList;
            return this;
        }
        public java.util.List<HotelOrderPreValidateResponseBodyModulePromotionInfoPromotionDetailInfoList> getPromotionDetailInfoList() {
            return this.promotionDetailInfoList;
        }

        public HotelOrderPreValidateResponseBodyModulePromotionInfo setPromotionTotalPrice(Long promotionTotalPrice) {
            this.promotionTotalPrice = promotionTotalPrice;
            return this;
        }
        public Long getPromotionTotalPrice() {
            return this.promotionTotalPrice;
        }

    }

    public static class HotelOrderPreValidateResponseBodyModuleRatePlanDaily extends TeaModel {
        @NameInMap("board")
        public String board;

        @NameInMap("discount_price")
        public String discountPrice;

        @NameInMap("max_booking_num")
        public Integer maxBookingNum;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("price")
        public Long price;

        /**
         * <strong>example:</strong>
         * <p>2023-01-19</p>
         */
        @NameInMap("rate_start_time")
        public String rateStartTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("room_count")
        public Integer roomCount;

        @NameInMap("rounding_discount_price")
        public String roundingDiscountPrice;

        @NameInMap("rounding_price")
        public String roundingPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("service_fee")
        public Long serviceFee;

        public static HotelOrderPreValidateResponseBodyModuleRatePlanDaily build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateResponseBodyModuleRatePlanDaily self = new HotelOrderPreValidateResponseBodyModuleRatePlanDaily();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setBoard(String board) {
            this.board = board;
            return this;
        }
        public String getBoard() {
            return this.board;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setDiscountPrice(String discountPrice) {
            this.discountPrice = discountPrice;
            return this;
        }
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setMaxBookingNum(Integer maxBookingNum) {
            this.maxBookingNum = maxBookingNum;
            return this;
        }
        public Integer getMaxBookingNum() {
            return this.maxBookingNum;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setPrice(Long price) {
            this.price = price;
            return this;
        }
        public Long getPrice() {
            return this.price;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setRateStartTime(String rateStartTime) {
            this.rateStartTime = rateStartTime;
            return this;
        }
        public String getRateStartTime() {
            return this.rateStartTime;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setRoomCount(Integer roomCount) {
            this.roomCount = roomCount;
            return this;
        }
        public Integer getRoomCount() {
            return this.roomCount;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setRoundingDiscountPrice(String roundingDiscountPrice) {
            this.roundingDiscountPrice = roundingDiscountPrice;
            return this;
        }
        public String getRoundingDiscountPrice() {
            return this.roundingDiscountPrice;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setRoundingPrice(String roundingPrice) {
            this.roundingPrice = roundingPrice;
            return this;
        }
        public String getRoundingPrice() {
            return this.roundingPrice;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanDaily setServiceFee(Long serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Long getServiceFee() {
            return this.serviceFee;
        }

    }

    public static class HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("hour")
        public Long hour;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("value")
        public Long value;

        public static HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList self = new HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList setHour(Long hour) {
            this.hour = hour;
            return this;
        }
        public Long getHour() {
            return this.hour;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList setValue(Long value) {
            this.value = value;
            return this;
        }
        public Long getValue() {
            return this.value;
        }

    }

    public static class HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO extends TeaModel {
        @NameInMap("btrip_hotel_cancel_policy_info_d_t_o_list")
        public java.util.List<HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList;

        @NameInMap("cancel_policy_type")
        public Integer cancelPolicyType;

        @NameInMap("content")
        public String content;

        @NameInMap("short_desc")
        public String shortDesc;

        public static HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO self = new HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO setBtripHotelCancelPolicyInfoDTOList(java.util.List<HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> btripHotelCancelPolicyInfoDTOList) {
            this.btripHotelCancelPolicyInfoDTOList = btripHotelCancelPolicyInfoDTOList;
            return this;
        }
        public java.util.List<HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTOBtripHotelCancelPolicyInfoDTOList> getBtripHotelCancelPolicyInfoDTOList() {
            return this.btripHotelCancelPolicyInfoDTOList;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO setCancelPolicyType(Integer cancelPolicyType) {
            this.cancelPolicyType = cancelPolicyType;
            return this;
        }
        public Integer getCancelPolicyType() {
            return this.cancelPolicyType;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO setShortDesc(String shortDesc) {
            this.shortDesc = shortDesc;
            return this;
        }
        public String getShortDesc() {
            return this.shortDesc;
        }

    }

    public static class HotelOrderPreValidateResponseBodyModuleRatePlanInfo extends TeaModel {
        @NameInMap("bed_desc")
        public String bedDesc;

        @NameInMap("btrip_hotel_cancel_policy_d_t_o")
        public HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO;

        /**
         * <strong>example:</strong>
         * <p>12:00</p>
         */
        @NameInMap("earliest_check_in_time")
        public String earliestCheckInTime;

        /**
         * <strong>example:</strong>
         * <p>17:00</p>
         */
        @NameInMap("latest_check_out_time")
        public String latestCheckOutTime;

        @NameInMap("max_booking_num")
        public Integer maxBookingNum;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("max_occupancy_num")
        public Integer maxOccupancyNum;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("need_certificate")
        public Boolean needCertificate;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("need_email")
        public Boolean needEmail;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("need_english_name")
        public Boolean needEnglishName;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_order_price")
        public Long totalOrderPrice;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total_room_price")
        public Long totalRoomPrice;

        public static HotelOrderPreValidateResponseBodyModuleRatePlanInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateResponseBodyModuleRatePlanInfo self = new HotelOrderPreValidateResponseBodyModuleRatePlanInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setBedDesc(String bedDesc) {
            this.bedDesc = bedDesc;
            return this;
        }
        public String getBedDesc() {
            return this.bedDesc;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setBtripHotelCancelPolicyDTO(HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO btripHotelCancelPolicyDTO) {
            this.btripHotelCancelPolicyDTO = btripHotelCancelPolicyDTO;
            return this;
        }
        public HotelOrderPreValidateResponseBodyModuleRatePlanInfoBtripHotelCancelPolicyDTO getBtripHotelCancelPolicyDTO() {
            return this.btripHotelCancelPolicyDTO;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setEarliestCheckInTime(String earliestCheckInTime) {
            this.earliestCheckInTime = earliestCheckInTime;
            return this;
        }
        public String getEarliestCheckInTime() {
            return this.earliestCheckInTime;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setLatestCheckOutTime(String latestCheckOutTime) {
            this.latestCheckOutTime = latestCheckOutTime;
            return this;
        }
        public String getLatestCheckOutTime() {
            return this.latestCheckOutTime;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setMaxBookingNum(Integer maxBookingNum) {
            this.maxBookingNum = maxBookingNum;
            return this;
        }
        public Integer getMaxBookingNum() {
            return this.maxBookingNum;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setMaxOccupancyNum(Integer maxOccupancyNum) {
            this.maxOccupancyNum = maxOccupancyNum;
            return this;
        }
        public Integer getMaxOccupancyNum() {
            return this.maxOccupancyNum;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setNeedCertificate(Boolean needCertificate) {
            this.needCertificate = needCertificate;
            return this;
        }
        public Boolean getNeedCertificate() {
            return this.needCertificate;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setNeedEmail(Boolean needEmail) {
            this.needEmail = needEmail;
            return this;
        }
        public Boolean getNeedEmail() {
            return this.needEmail;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setNeedEnglishName(Boolean needEnglishName) {
            this.needEnglishName = needEnglishName;
            return this;
        }
        public Boolean getNeedEnglishName() {
            return this.needEnglishName;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setTotalOrderPrice(Long totalOrderPrice) {
            this.totalOrderPrice = totalOrderPrice;
            return this;
        }
        public Long getTotalOrderPrice() {
            return this.totalOrderPrice;
        }

        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo setTotalRoomPrice(Long totalRoomPrice) {
            this.totalRoomPrice = totalRoomPrice;
            return this;
        }
        public Long getTotalRoomPrice() {
            return this.totalRoomPrice;
        }

    }

    public static class HotelOrderPreValidateResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("extend_info")
        public String extendInfo;

        @NameInMap("item_invoice")
        public HotelOrderPreValidateResponseBodyModuleItemInvoice itemInvoice;

        /**
         * <strong>example:</strong>
         * <p>fb5e1abf33924b6c912bd6d80deec0eb-4</p>
         */
        @NameInMap("itinerary_no")
        public String itineraryNo;

        @NameInMap("promotion_info")
        public HotelOrderPreValidateResponseBodyModulePromotionInfo promotionInfo;

        @NameInMap("rate_plan_daily")
        public java.util.List<HotelOrderPreValidateResponseBodyModuleRatePlanDaily> ratePlanDaily;

        /**
         * <strong>example:</strong>
         * <p>5314280514218</p>
         */
        @NameInMap("rate_plan_id")
        public Long ratePlanId;

        @NameInMap("rate_plan_info")
        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo ratePlanInfo;

        /**
         * <strong>example:</strong>
         * <p>nonUltron_1673575241156_d91ea8ad16735752359161037bf6cf_c54d3768312a4b249b719f126377bf82</p>
         */
        @NameInMap("validate_res_key")
        public String validateResKey;

        public static HotelOrderPreValidateResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderPreValidateResponseBodyModule self = new HotelOrderPreValidateResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderPreValidateResponseBodyModule setExtendInfo(String extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public String getExtendInfo() {
            return this.extendInfo;
        }

        public HotelOrderPreValidateResponseBodyModule setItemInvoice(HotelOrderPreValidateResponseBodyModuleItemInvoice itemInvoice) {
            this.itemInvoice = itemInvoice;
            return this;
        }
        public HotelOrderPreValidateResponseBodyModuleItemInvoice getItemInvoice() {
            return this.itemInvoice;
        }

        public HotelOrderPreValidateResponseBodyModule setItineraryNo(String itineraryNo) {
            this.itineraryNo = itineraryNo;
            return this;
        }
        public String getItineraryNo() {
            return this.itineraryNo;
        }

        public HotelOrderPreValidateResponseBodyModule setPromotionInfo(HotelOrderPreValidateResponseBodyModulePromotionInfo promotionInfo) {
            this.promotionInfo = promotionInfo;
            return this;
        }
        public HotelOrderPreValidateResponseBodyModulePromotionInfo getPromotionInfo() {
            return this.promotionInfo;
        }

        public HotelOrderPreValidateResponseBodyModule setRatePlanDaily(java.util.List<HotelOrderPreValidateResponseBodyModuleRatePlanDaily> ratePlanDaily) {
            this.ratePlanDaily = ratePlanDaily;
            return this;
        }
        public java.util.List<HotelOrderPreValidateResponseBodyModuleRatePlanDaily> getRatePlanDaily() {
            return this.ratePlanDaily;
        }

        public HotelOrderPreValidateResponseBodyModule setRatePlanId(Long ratePlanId) {
            this.ratePlanId = ratePlanId;
            return this;
        }
        public Long getRatePlanId() {
            return this.ratePlanId;
        }

        public HotelOrderPreValidateResponseBodyModule setRatePlanInfo(HotelOrderPreValidateResponseBodyModuleRatePlanInfo ratePlanInfo) {
            this.ratePlanInfo = ratePlanInfo;
            return this;
        }
        public HotelOrderPreValidateResponseBodyModuleRatePlanInfo getRatePlanInfo() {
            return this.ratePlanInfo;
        }

        public HotelOrderPreValidateResponseBodyModule setValidateResKey(String validateResKey) {
            this.validateResKey = validateResKey;
            return this;
        }
        public String getValidateResKey() {
            return this.validateResKey;
        }

    }

}
