// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class HotelOrderInfoQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public HotelOrderInfoQueryResponseBodyModule module;

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
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static HotelOrderInfoQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotelOrderInfoQueryResponseBody self = new HotelOrderInfoQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public HotelOrderInfoQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotelOrderInfoQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotelOrderInfoQueryResponseBody setModule(HotelOrderInfoQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public HotelOrderInfoQueryResponseBodyModule getModule() {
        return this.module;
    }

    public HotelOrderInfoQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotelOrderInfoQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public HotelOrderInfoQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("book_mode")
        public String bookMode;

        /**
         * <strong>example:</strong>
         * <p>1430378</p>
         */
        @NameInMap("booker_id")
        public String bookerId;

        @NameInMap("booker_name")
        public String bookerName;

        /**
         * <strong>example:</strong>
         * <p>btripkvxtn1321g49wtul</p>
         */
        @NameInMap("btrip_corp_id")
        public String btripCorpId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("category")
        public Integer category;

        /**
         * <strong>example:</strong>
         * <p>1721145600000</p>
         */
        @NameInMap("check_in_time")
        public Long checkInTime;

        /**
         * <strong>example:</strong>
         * <p>1721145600000</p>
         */
        @NameInMap("check_out_time")
        public Long checkOutTime;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("is_agreement_price")
        public Boolean isAgreementPrice;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("nights")
        public Integer nights;

        /**
         * <strong>example:</strong>
         * <p>1721145600000</p>
         */
        @NameInMap("order_create_time")
        public Long orderCreateTime;

        /**
         * <strong>example:</strong>
         * <p>1012053198307958626</p>
         */
        @NameInMap("order_id")
        public Long orderId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("order_status")
        public Integer orderStatus;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pay_status")
        public Integer payStatus;

        /**
         * <strong>example:</strong>
         * <p>1721145600000</p>
         */
        @NameInMap("pay_time")
        public Long payTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("room_num")
        public Integer roomNum;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("settle_type")
        public Integer settleType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("trip_mode")
        public Integer tripMode;

        public static HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo self = new HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setBookMode(String bookMode) {
            this.bookMode = bookMode;
            return this;
        }
        public String getBookMode() {
            return this.bookMode;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setBtripCorpId(String btripCorpId) {
            this.btripCorpId = btripCorpId;
            return this;
        }
        public String getBtripCorpId() {
            return this.btripCorpId;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setCheckInTime(Long checkInTime) {
            this.checkInTime = checkInTime;
            return this;
        }
        public Long getCheckInTime() {
            return this.checkInTime;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setCheckOutTime(Long checkOutTime) {
            this.checkOutTime = checkOutTime;
            return this;
        }
        public Long getCheckOutTime() {
            return this.checkOutTime;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setIsAgreementPrice(Boolean isAgreementPrice) {
            this.isAgreementPrice = isAgreementPrice;
            return this;
        }
        public Boolean getIsAgreementPrice() {
            return this.isAgreementPrice;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setNights(Integer nights) {
            this.nights = nights;
            return this;
        }
        public Integer getNights() {
            return this.nights;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setOrderCreateTime(Long orderCreateTime) {
            this.orderCreateTime = orderCreateTime;
            return this;
        }
        public Long getOrderCreateTime() {
            return this.orderCreateTime;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
        public Integer getOrderStatus() {
            return this.orderStatus;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setPayStatus(Integer payStatus) {
            this.payStatus = payStatus;
            return this;
        }
        public Integer getPayStatus() {
            return this.payStatus;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setPayTime(Long payTime) {
            this.payTime = payTime;
            return this;
        }
        public Long getPayTime() {
            return this.payTime;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setRoomNum(Integer roomNum) {
            this.roomNum = roomNum;
            return this;
        }
        public Integer getRoomNum() {
            return this.roomNum;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setSettleType(Integer settleType) {
            this.settleType = settleType;
            return this;
        }
        public Integer getSettleType() {
            return this.settleType;
        }

        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo setTripMode(Integer tripMode) {
            this.tripMode = tripMode;
            return this;
        }
        public Integer getTripMode() {
            return this.tripMode;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0rCUI20hjOsk0sTwlu</p>
         */
        @NameInMap("cascade_dept_mask")
        public String cascadeDeptMask;

        @NameInMap("cascade_dept_name")
        public String cascadeDeptName;

        /**
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <strong>example:</strong>
         * <p>330000001815</p>
         */
        @NameInMap("out_depart_id")
        public String outDepartId;

        public static HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment self = new HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment setCascadeDeptMask(String cascadeDeptMask) {
            this.cascadeDeptMask = cascadeDeptMask;
            return this;
        }
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment setCascadeDeptName(String cascadeDeptName) {
            this.cascadeDeptName = cascadeDeptName;
            return this;
        }
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment setOutDepartId(String outDepartId) {
            this.outDepartId = outDepartId;
            return this;
        }
        public String getOutDepartId() {
            return this.outDepartId;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleBookerInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>UN_APPLY</p>
         */
        @NameInMap("booker_role")
        public String bookerRole;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:13311112222@qq.com">13311112222@qq.com</a></p>
         */
        @NameInMap("contact_email")
        public String contactEmail;

        /**
         * <strong>example:</strong>
         * <p>13311112222</p>
         */
        @NameInMap("contact_phone")
        public String contactPhone;

        /**
         * <strong>example:</strong>
         * <p>open12gddn2kn1i47v10wRJNkMFx00</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("department")
        public HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment department;

        /**
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        @NameInMap("en_name")
        public String enName;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("job_no")
        public String jobNo;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("need_apply")
        public Boolean needApply;

        @NameInMap("real_name")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p>1430378</p>
         */
        @NameInMap("user_id")
        public String userId;

        public static HotelOrderInfoQueryResponseBodyModuleBookerInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleBookerInfo self = new HotelOrderInfoQueryResponseBodyModuleBookerInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setBookerRole(String bookerRole) {
            this.bookerRole = bookerRole;
            return this;
        }
        public String getBookerRole() {
            return this.bookerRole;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setContactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }
        public String getContactPhone() {
            return this.contactPhone;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setDepartment(HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment department) {
            this.department = department;
            return this;
        }
        public HotelOrderInfoQueryResponseBodyModuleBookerInfoDepartment getDepartment() {
            return this.department;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setEnName(String enName) {
            this.enName = enName;
            return this;
        }
        public String getEnName() {
            return this.enName;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setNeedApply(Boolean needApply) {
            this.needApply = needApply;
            return this;
        }
        public Boolean getNeedApply() {
            return this.needApply;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public HotelOrderInfoQueryResponseBodyModuleBookerInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleHotelInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_name")
        public String cityName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("country_code")
        public String countryCode;

        @NameInMap("country_name")
        public String countryName;

        /**
         * <strong>example:</strong>
         * <p>330183</p>
         */
        @NameInMap("district_code")
        public String districtCode;

        @NameInMap("district_name")
        public String districtName;

        @NameInMap("hotel_address")
        public String hotelAddress;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("hotel_brand_code")
        public String hotelBrandCode;

        @NameInMap("hotel_brand_name")
        public String hotelBrandName;

        /**
         * <strong>example:</strong>
         * <p>huazhu</p>
         */
        @NameInMap("hotel_group")
        public String hotelGroup;

        /**
         * <strong>example:</strong>
         * <p>55335212</p>
         */
        @NameInMap("hotel_id")
        public String hotelId;

        @NameInMap("hotel_name")
        public String hotelName;

        /**
         * <strong>example:</strong>
         * <p>Test Hotel Name</p>
         */
        @NameInMap("hotel_name_en")
        public String hotelNameEn;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("star")
        public String star;

        public static HotelOrderInfoQueryResponseBodyModuleHotelInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleHotelInfo self = new HotelOrderInfoQueryResponseBodyModuleHotelInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setCityName(String cityName) {
            this.cityName = cityName;
            return this;
        }
        public String getCityName() {
            return this.cityName;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }
        public String getCountryName() {
            return this.countryName;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setDistrictCode(String districtCode) {
            this.districtCode = districtCode;
            return this;
        }
        public String getDistrictCode() {
            return this.districtCode;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setDistrictName(String districtName) {
            this.districtName = districtName;
            return this;
        }
        public String getDistrictName() {
            return this.districtName;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setHotelAddress(String hotelAddress) {
            this.hotelAddress = hotelAddress;
            return this;
        }
        public String getHotelAddress() {
            return this.hotelAddress;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setHotelBrandCode(String hotelBrandCode) {
            this.hotelBrandCode = hotelBrandCode;
            return this;
        }
        public String getHotelBrandCode() {
            return this.hotelBrandCode;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setHotelBrandName(String hotelBrandName) {
            this.hotelBrandName = hotelBrandName;
            return this;
        }
        public String getHotelBrandName() {
            return this.hotelBrandName;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setHotelGroup(String hotelGroup) {
            this.hotelGroup = hotelGroup;
            return this;
        }
        public String getHotelGroup() {
            return this.hotelGroup;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setHotelId(String hotelId) {
            this.hotelId = hotelId;
            return this;
        }
        public String getHotelId() {
            return this.hotelId;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setHotelNameEn(String hotelNameEn) {
            this.hotelNameEn = hotelNameEn;
            return this;
        }
        public String getHotelNameEn() {
            return this.hotelNameEn;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelInfo setStar(String star) {
            this.star = star;
            return this;
        }
        public String getStar() {
            return this.star;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>35000</p>
         */
        @NameInMap("order_amount")
        public Long orderAmount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("other_fee")
        public Long otherFee;

        /**
         * <strong>example:</strong>
         * <p>35000</p>
         */
        @NameInMap("pay_amount")
        public Long payAmount;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("promotion_amount")
        public Long promotionAmount;

        /**
         * <strong>example:</strong>
         * <p>35000</p>
         */
        @NameInMap("total_room_amount")
        public Long totalRoomAmount;

        public static HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo self = new HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo setOrderAmount(Long orderAmount) {
            this.orderAmount = orderAmount;
            return this;
        }
        public Long getOrderAmount() {
            return this.orderAmount;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo setOtherFee(Long otherFee) {
            this.otherFee = otherFee;
            return this;
        }
        public Long getOtherFee() {
            return this.otherFee;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo setPayAmount(Long payAmount) {
            this.payAmount = payAmount;
            return this;
        }
        public Long getPayAmount() {
            return this.payAmount;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo setPromotionAmount(Long promotionAmount) {
            this.promotionAmount = promotionAmount;
            return this;
        }
        public Long getPromotionAmount() {
            return this.promotionAmount;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo setTotalRoomAmount(Long totalRoomAmount) {
            this.totalRoomAmount = totalRoomAmount;
            return this;
        }
        public Long getTotalRoomAmount() {
            return this.totalRoomAmount;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("cancel_fine")
        public Long cancelFine;

        /**
         * <strong>example:</strong>
         * <p>1000000002578096</p>
         */
        @NameInMap("refund_apply_id")
        public Long refundApplyId;

        /**
         * <strong>example:</strong>
         * <p>1721702353700</p>
         */
        @NameInMap("refund_end_time")
        public Long refundEndTime;

        /**
         * <strong>example:</strong>
         * <p>34000</p>
         */
        @NameInMap("refund_price")
        public Long refundPrice;

        @NameInMap("refund_reason")
        public String refundReason;

        /**
         * <strong>example:</strong>
         * <p>1721702353700</p>
         */
        @NameInMap("refund_start_time")
        public Long refundStartTime;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("refund_type")
        public Integer refundType;

        public static HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo self = new HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo setCancelFine(Long cancelFine) {
            this.cancelFine = cancelFine;
            return this;
        }
        public Long getCancelFine() {
            return this.cancelFine;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo setRefundApplyId(Long refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public Long getRefundApplyId() {
            return this.refundApplyId;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo setRefundEndTime(Long refundEndTime) {
            this.refundEndTime = refundEndTime;
            return this;
        }
        public Long getRefundEndTime() {
            return this.refundEndTime;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo setRefundPrice(Long refundPrice) {
            this.refundPrice = refundPrice;
            return this;
        }
        public Long getRefundPrice() {
            return this.refundPrice;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo setRefundReason(String refundReason) {
            this.refundReason = refundReason;
            return this;
        }
        public String getRefundReason() {
            return this.refundReason;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo setRefundStartTime(Long refundStartTime) {
            this.refundStartTime = refundStartTime;
            return this;
        }
        public Long getRefundStartTime() {
            return this.refundStartTime;
        }

        public HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo setRefundType(Integer refundType) {
            this.refundType = refundType;
            return this;
        }
        public Integer getRefundType() {
            return this.refundType;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply extends TeaModel {
        @NameInMap("exceed_reason")
        public String exceedReason;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("exceed_type")
        public Integer exceedType;

        /**
         * <strong>example:</strong>
         * <p>3321</p>
         */
        @NameInMap("flow_no")
        public Long flowNo;

        /**
         * <strong>example:</strong>
         * <p>60853</p>
         */
        @NameInMap("id")
        public Long id;

        public static HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply self = new HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply setExceedType(Integer exceedType) {
            this.exceedType = exceedType;
            return this;
        }
        public Integer getExceedType() {
            return this.exceedType;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply setFlowNo(Long flowNo) {
            this.flowNo = flowNo;
            return this;
        }
        public Long getFlowNo() {
            return this.flowNo;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("apply_business_id")
        public String applyBusinessId;

        @NameInMap("apply_business_name")
        public String applyBusinessName;

        /**
         * <strong>example:</strong>
         * <p>1424031910085891196</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("exceed_apply")
        public java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply> exceedApply;

        /**
         * <strong>example:</strong>
         * <p>ef5e74dc1f1640b08858fb043f64e477-8</p>
         */
        @NameInMap("itinerary_no")
        public String itineraryNo;

        public static HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo self = new HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo setApplyBusinessId(String applyBusinessId) {
            this.applyBusinessId = applyBusinessId;
            return this;
        }
        public String getApplyBusinessId() {
            return this.applyBusinessId;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo setApplyBusinessName(String applyBusinessName) {
            this.applyBusinessName = applyBusinessName;
            return this;
        }
        public String getApplyBusinessName() {
            return this.applyBusinessName;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo setExceedApply(java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply> exceedApply) {
            this.exceedApply = exceedApply;
            return this;
        }
        public java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfoExceedApply> getExceedApply() {
            return this.exceedApply;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo setItineraryNo(String itineraryNo) {
            this.itineraryNo = itineraryNo;
            return this;
        }
        public String getItineraryNo() {
            return this.itineraryNo;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0rCUI20hjOsk0sTwlu</p>
         */
        @NameInMap("cascade_dept_mask")
        public String cascadeDeptMask;

        @NameInMap("cascade_dept_name")
        public String cascadeDeptName;

        /**
         * <strong>example:</strong>
         * <p>35</p>
         */
        @NameInMap("depart_id")
        public String departId;

        @NameInMap("depart_name")
        public String departName;

        /**
         * <strong>example:</strong>
         * <p>330000001815</p>
         */
        @NameInMap("out_depart_id")
        public String outDepartId;

        public static HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment self = new HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment setCascadeDeptMask(String cascadeDeptMask) {
            this.cascadeDeptMask = cascadeDeptMask;
            return this;
        }
        public String getCascadeDeptMask() {
            return this.cascadeDeptMask;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment setCascadeDeptName(String cascadeDeptName) {
            this.cascadeDeptName = cascadeDeptName;
            return this;
        }
        public String getCascadeDeptName() {
            return this.cascadeDeptName;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment setDepartId(String departId) {
            this.departId = departId;
            return this;
        }
        public String getDepartId() {
            return this.departId;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment setDepartName(String departName) {
            this.departName = departName;
            return this;
        }
        public String getDepartName() {
            return this.departName;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment setOutDepartId(String outDepartId) {
            this.outDepartId = outDepartId;
            return this;
        }
        public String getOutDepartId() {
            return this.outDepartId;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>323431</p>
         */
        @NameInMap("cost_center_code")
        public String costCenterCode;

        /**
         * <strong>example:</strong>
         * <p>2312</p>
         */
        @NameInMap("cost_center_id")
        public String costCenterId;

        @NameInMap("cost_center_name")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;extraKey&quot;:&quot;extraVal&quot;}</p>
         */
        @NameInMap("external_ext_field")
        public String externalExtField;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("fee_type")
        public Integer feeType;

        /**
         * <strong>example:</strong>
         * <p>123332</p>
         */
        @NameInMap("invoice_id")
        public Long invoiceId;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>1002</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_title")
        public String projectTitle;

        public static HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter self = new HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setCostCenterCode(String costCenterCode) {
            this.costCenterCode = costCenterCode;
            return this;
        }
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setCostCenterId(String costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public String getCostCenterId() {
            return this.costCenterId;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setExternalExtField(String externalExtField) {
            this.externalExtField = externalExtField;
            return this;
        }
        public String getExternalExtField() {
            return this.externalExtField;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setFeeType(Integer feeType) {
            this.feeType = feeType;
            return this;
        }
        public Integer getFeeType() {
            return this.feeType;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter setProjectTitle(String projectTitle) {
            this.projectTitle = projectTitle;
            return this;
        }
        public String getProjectTitle() {
            return this.projectTitle;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos extends TeaModel {
        @NameInMap("apply_info")
        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo applyInfo;

        /**
         * <strong>example:</strong>
         * <p>342229200801010023</p>
         */
        @NameInMap("cert_no")
        public String certNo;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("cert_type")
        public Integer certType;

        @NameInMap("department")
        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment department;

        /**
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("job_no")
        public String jobNo;

        /**
         * <strong>example:</strong>
         * <p>13311112222</p>
         */
        @NameInMap("telephone")
        public String telephone;

        /**
         * <strong>example:</strong>
         * <p>1430378</p>
         */
        @NameInMap("traveler_id")
        public String travelerId;

        @NameInMap("traveler_name")
        public String travelerName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("traveler_type")
        public Integer travelerType;

        @NameInMap("trip_cost_center")
        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter tripCostCenter;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("user_type")
        public Integer userType;

        public static HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos self = new HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setApplyInfo(HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo applyInfo) {
            this.applyInfo = applyInfo;
            return this;
        }
        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosApplyInfo getApplyInfo() {
            return this.applyInfo;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setCertType(Integer certType) {
            this.certType = certType;
            return this;
        }
        public Integer getCertType() {
            return this.certType;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setDepartment(HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment department) {
            this.department = department;
            return this;
        }
        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosDepartment getDepartment() {
            return this.department;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setJobNo(String jobNo) {
            this.jobNo = jobNo;
            return this;
        }
        public String getJobNo() {
            return this.jobNo;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setTravelerType(Integer travelerType) {
            this.travelerType = travelerType;
            return this;
        }
        public Integer getTravelerType() {
            return this.travelerType;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setTripCostCenter(HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter tripCostCenter) {
            this.tripCostCenter = tripCostCenter;
            return this;
        }
        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfosTripCostCenter getTripCostCenter() {
            return this.tripCostCenter;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos setUserType(Integer userType) {
            this.userType = userType;
            return this;
        }
        public Integer getUserType() {
            return this.userType;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("live_room_no")
        public String liveRoomNo;

        @NameInMap("room_type_name")
        public String roomTypeName;

        @NameInMap("traver_infos")
        public java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos> traverInfos;

        public static HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo self = new HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo setLiveRoomNo(String liveRoomNo) {
            this.liveRoomNo = liveRoomNo;
            return this;
        }
        public String getLiveRoomNo() {
            return this.liveRoomNo;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo setRoomTypeName(String roomTypeName) {
            this.roomTypeName = roomTypeName;
            return this;
        }
        public String getRoomTypeName() {
            return this.roomTypeName;
        }

        public HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo setTraverInfos(java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos> traverInfos) {
            this.traverInfos = traverInfos;
            return this;
        }
        public java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfoTraverInfos> getTraverInfos() {
            return this.traverInfos;
        }

    }

    public static class HotelOrderInfoQueryResponseBodyModule extends TeaModel {
        @NameInMap("base_order_info")
        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo baseOrderInfo;

        @NameInMap("booker_info")
        public HotelOrderInfoQueryResponseBodyModuleBookerInfo bookerInfo;

        @NameInMap("hotel_info")
        public HotelOrderInfoQueryResponseBodyModuleHotelInfo hotelInfo;

        @NameInMap("hotel_order_fee_info")
        public HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo hotelOrderFeeInfo;

        @NameInMap("hotel_order_refund_info")
        public java.util.List<HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo> hotelOrderRefundInfo;

        @NameInMap("room_traver_info")
        public java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo> roomTraverInfo;

        public static HotelOrderInfoQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            HotelOrderInfoQueryResponseBodyModule self = new HotelOrderInfoQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public HotelOrderInfoQueryResponseBodyModule setBaseOrderInfo(HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo baseOrderInfo) {
            this.baseOrderInfo = baseOrderInfo;
            return this;
        }
        public HotelOrderInfoQueryResponseBodyModuleBaseOrderInfo getBaseOrderInfo() {
            return this.baseOrderInfo;
        }

        public HotelOrderInfoQueryResponseBodyModule setBookerInfo(HotelOrderInfoQueryResponseBodyModuleBookerInfo bookerInfo) {
            this.bookerInfo = bookerInfo;
            return this;
        }
        public HotelOrderInfoQueryResponseBodyModuleBookerInfo getBookerInfo() {
            return this.bookerInfo;
        }

        public HotelOrderInfoQueryResponseBodyModule setHotelInfo(HotelOrderInfoQueryResponseBodyModuleHotelInfo hotelInfo) {
            this.hotelInfo = hotelInfo;
            return this;
        }
        public HotelOrderInfoQueryResponseBodyModuleHotelInfo getHotelInfo() {
            return this.hotelInfo;
        }

        public HotelOrderInfoQueryResponseBodyModule setHotelOrderFeeInfo(HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo hotelOrderFeeInfo) {
            this.hotelOrderFeeInfo = hotelOrderFeeInfo;
            return this;
        }
        public HotelOrderInfoQueryResponseBodyModuleHotelOrderFeeInfo getHotelOrderFeeInfo() {
            return this.hotelOrderFeeInfo;
        }

        public HotelOrderInfoQueryResponseBodyModule setHotelOrderRefundInfo(java.util.List<HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo> hotelOrderRefundInfo) {
            this.hotelOrderRefundInfo = hotelOrderRefundInfo;
            return this;
        }
        public java.util.List<HotelOrderInfoQueryResponseBodyModuleHotelOrderRefundInfo> getHotelOrderRefundInfo() {
            return this.hotelOrderRefundInfo;
        }

        public HotelOrderInfoQueryResponseBodyModule setRoomTraverInfo(java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo> roomTraverInfo) {
            this.roomTraverInfo = roomTraverInfo;
            return this;
        }
        public java.util.List<HotelOrderInfoQueryResponseBodyModuleRoomTraverInfo> getRoomTraverInfo() {
            return this.roomTraverInfo;
        }

    }

}
