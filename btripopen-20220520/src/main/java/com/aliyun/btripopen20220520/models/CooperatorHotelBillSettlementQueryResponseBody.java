// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorHotelBillSettlementQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CooperatorHotelBillSettlementQueryResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>407543AF-2BD9-5890-BD92-9D1AB7218B27</p>
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CooperatorHotelBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CooperatorHotelBillSettlementQueryResponseBody self = new CooperatorHotelBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CooperatorHotelBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CooperatorHotelBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CooperatorHotelBillSettlementQueryResponseBody setModule(CooperatorHotelBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CooperatorHotelBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public CooperatorHotelBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CooperatorHotelBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CooperatorHotelBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CooperatorHotelBillSettlementQueryResponseBodyModuleItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>124</p>
         */
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("apply_arr_city_code")
        public String applyArrCityCode;

        @NameInMap("apply_arr_city_name")
        public String applyArrCityName;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("apply_dep_city_code")
        public String applyDepCityCode;

        @NameInMap("apply_dep_city_name")
        public String applyDepCityName;

        @NameInMap("apply_extend_field")
        public String applyExtendField;

        /**
         * <strong>example:</strong>
         * <p>sdasdas123324</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("average_nights")
        public Double averageNights;

        /**
         * <strong>example:</strong>
         * <p>2023-01-01 00:00:00</p>
         */
        @NameInMap("bill_record_time")
        public String billRecordTime;

        @NameInMap("book_mode")
        public String bookMode;

        @NameInMap("book_reason")
        public String bookReason;

        /**
         * <strong>example:</strong>
         * <p>2023-01-01 00:00:00</p>
         */
        @NameInMap("book_time")
        public String bookTime;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("booker_id")
        public String bookerId;

        /**
         * <strong>example:</strong>
         * <p>zs123</p>
         */
        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        @NameInMap("brand_group")
        public String brandGroup;

        @NameInMap("brand_name")
        public String brandName;

        @NameInMap("business_trip_result")
        public String businessTripResult;

        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        /**
         * <strong>example:</strong>
         * <p>2024-02-13</p>
         */
        @NameInMap("check_in_date")
        public String checkInDate;

        /**
         * <strong>example:</strong>
         * <p>2024-02-15</p>
         */
        @NameInMap("checkout_date")
        public String checkoutDate;

        @NameInMap("city")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("city_county")
        public String cityCounty;

        /**
         * <strong>example:</strong>
         * <p>330100</p>
         */
        @NameInMap("city_county_code")
        public Integer cityCountyCode;

        /**
         * <strong>example:</strong>
         * <p>IN240102113438277278</p>
         */
        @NameInMap("cooperator_bill_code")
        public String cooperatorBillCode;

        @NameInMap("cooperator_name")
        public String cooperatorName;

        /**
         * <strong>example:</strong>
         * <p>HO20240125162800280928</p>
         */
        @NameInMap("cooperator_order_id")
        public String cooperatorOrderId;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("corp_refund_fee")
        public Double corpRefundFee;

        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("corp_total_fee")
        public Double corpTotalFee;

        @NameInMap("cost_center")
        public String costCenter;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("department")
        public String department;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("exceed_reason")
        public String exceedReason;

        @NameInMap("fee_type")
        public String feeType;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("fees")
        public Double fees;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("fines")
        public Double fines;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("fu_point_fee")
        public Double fuPointFee;

        @NameInMap("hotel_name")
        public String hotelName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public String index;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("is_early_departure")
        public String isEarlyDeparture;

        @NameInMap("is_negotiation")
        public String isNegotiation;

        @NameInMap("is_share_str")
        public String isShareStr;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("nights")
        public Integer nights;

        /**
         * <strong>example:</strong>
         * <p>3137168772101111000</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("order_price")
        public Double orderPrice;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        @NameInMap("order_type")
        public String orderType;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("over_apply_id")
        public String overApplyId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("person_refund_fee")
        public Double personRefundFee;

        /**
         * <strong>example:</strong>
         * <p>10.0</p>
         */
        @NameInMap("person_settle_price")
        public Double personSettlePrice;

        /**
         * <strong>example:</strong>
         * <p>72328485</p>
         */
        @NameInMap("primary_id")
        public Long primaryId;

        /**
         * <strong>example:</strong>
         * <p>acs</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("promotion_fee")
        public Double promotionFee;

        @NameInMap("remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("reserve_rule")
        public Integer reserveRule;

        @NameInMap("room_no")
        public String roomNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("room_number")
        public Integer roomNumber;

        /**
         * <strong>example:</strong>
         * <p>105.0</p>
         */
        @NameInMap("room_price")
        public Double roomPrice;

        @NameInMap("room_type")
        public String roomType;

        /**
         * <strong>example:</strong>
         * <p>5.0</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        /**
         * <strong>example:</strong>
         * <p>110.0</p>
         */
        @NameInMap("settlement_fee")
        public Double settlementFee;

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        /**
         * <strong>example:</strong>
         * <p>2023-01-01 00:00:00</p>
         */
        @NameInMap("settlement_time")
        public String settlementTime;

        @NameInMap("settlement_type")
        public String settlementType;

        @NameInMap("star")
        public String star;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>166564408</p>
         */
        @NameInMap("sub_order_id")
        public String subOrderId;

        /**
         * <strong>example:</strong>
         * <p>9%</p>
         */
        @NameInMap("tax_rate")
        public String taxRate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("third_invoice_id")
        public String thirdInvoiceId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("third_itinerary_id")
        public String thirdItineraryId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("total_nights")
        public Integer totalNights;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("traveler_id")
        public String travelerId;

        /**
         * <strong>example:</strong>
         * <p>zs123</p>
         */
        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        @NameInMap("traveler_member_type")
        public String travelerMemberType;

        @NameInMap("traveler_member_type_name")
        public String travelerMemberTypeName;

        @NameInMap("traveler_name")
        public String travelerName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("voucher_type")
        public Integer voucherType;

        public static CooperatorHotelBillSettlementQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            CooperatorHotelBillSettlementQueryResponseBodyModuleItems self = new CooperatorHotelBillSettlementQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setAverageNights(Double averageNights) {
            this.averageNights = averageNights;
            return this;
        }
        public Double getAverageNights() {
            return this.averageNights;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBookMode(String bookMode) {
            this.bookMode = bookMode;
            return this;
        }
        public String getBookMode() {
            return this.bookMode;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBookReason(String bookReason) {
            this.bookReason = bookReason;
            return this;
        }
        public String getBookReason() {
            return this.bookReason;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBrandGroup(String brandGroup) {
            this.brandGroup = brandGroup;
            return this;
        }
        public String getBrandGroup() {
            return this.brandGroup;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setBusinessTripResult(String businessTripResult) {
            this.businessTripResult = businessTripResult;
            return this;
        }
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCheckInDate(String checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }
        public String getCheckInDate() {
            return this.checkInDate;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCheckoutDate(String checkoutDate) {
            this.checkoutDate = checkoutDate;
            return this;
        }
        public String getCheckoutDate() {
            return this.checkoutDate;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCityCounty(String cityCounty) {
            this.cityCounty = cityCounty;
            return this;
        }
        public String getCityCounty() {
            return this.cityCounty;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCityCountyCode(Integer cityCountyCode) {
            this.cityCountyCode = cityCountyCode;
            return this;
        }
        public Integer getCityCountyCode() {
            return this.cityCountyCode;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCooperatorBillCode(String cooperatorBillCode) {
            this.cooperatorBillCode = cooperatorBillCode;
            return this;
        }
        public String getCooperatorBillCode() {
            return this.cooperatorBillCode;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCooperatorName(String cooperatorName) {
            this.cooperatorName = cooperatorName;
            return this;
        }
        public String getCooperatorName() {
            return this.cooperatorName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCooperatorOrderId(String cooperatorOrderId) {
            this.cooperatorOrderId = cooperatorOrderId;
            return this;
        }
        public String getCooperatorOrderId() {
            return this.cooperatorOrderId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCorpRefundFee(Double corpRefundFee) {
            this.corpRefundFee = corpRefundFee;
            return this;
        }
        public Double getCorpRefundFee() {
            return this.corpRefundFee;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCorpTotalFee(Double corpTotalFee) {
            this.corpTotalFee = corpTotalFee;
            return this;
        }
        public Double getCorpTotalFee() {
            return this.corpTotalFee;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setFees(Double fees) {
            this.fees = fees;
            return this;
        }
        public Double getFees() {
            return this.fees;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setFines(Double fines) {
            this.fines = fines;
            return this;
        }
        public Double getFines() {
            return this.fines;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setFuPointFee(Double fuPointFee) {
            this.fuPointFee = fuPointFee;
            return this;
        }
        public Double getFuPointFee() {
            return this.fuPointFee;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setIsEarlyDeparture(String isEarlyDeparture) {
            this.isEarlyDeparture = isEarlyDeparture;
            return this;
        }
        public String getIsEarlyDeparture() {
            return this.isEarlyDeparture;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setIsNegotiation(String isNegotiation) {
            this.isNegotiation = isNegotiation;
            return this;
        }
        public String getIsNegotiation() {
            return this.isNegotiation;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setIsShareStr(String isShareStr) {
            this.isShareStr = isShareStr;
            return this;
        }
        public String getIsShareStr() {
            return this.isShareStr;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setNights(Integer nights) {
            this.nights = nights;
            return this;
        }
        public Integer getNights() {
            return this.nights;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setOrderPrice(Double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setPersonRefundFee(Double personRefundFee) {
            this.personRefundFee = personRefundFee;
            return this;
        }
        public Double getPersonRefundFee() {
            return this.personRefundFee;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setPersonSettlePrice(Double personSettlePrice) {
            this.personSettlePrice = personSettlePrice;
            return this;
        }
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setPromotionFee(Double promotionFee) {
            this.promotionFee = promotionFee;
            return this;
        }
        public Double getPromotionFee() {
            return this.promotionFee;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setReserveRule(Integer reserveRule) {
            this.reserveRule = reserveRule;
            return this;
        }
        public Integer getReserveRule() {
            return this.reserveRule;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setRoomNumber(Integer roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }
        public Integer getRoomNumber() {
            return this.roomNumber;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setRoomPrice(Double roomPrice) {
            this.roomPrice = roomPrice;
            return this;
        }
        public Double getRoomPrice() {
            return this.roomPrice;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }
        public String getRoomType() {
            return this.roomType;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setStar(String star) {
            this.star = star;
            return this;
        }
        public String getStar() {
            return this.star;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setThirdInvoiceId(String thirdInvoiceId) {
            this.thirdInvoiceId = thirdInvoiceId;
            return this;
        }
        public String getThirdInvoiceId() {
            return this.thirdInvoiceId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setTotalNights(Integer totalNights) {
            this.totalNights = totalNights;
            return this;
        }
        public Integer getTotalNights() {
            return this.totalNights;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setTravelerMemberType(String travelerMemberType) {
            this.travelerMemberType = travelerMemberType;
            return this;
        }
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModuleItems setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

    }

    public static class CooperatorHotelBillSettlementQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("category")
        public Integer category;

        /**
         * <strong>example:</strong>
         * <p>open12ilgngll7us7v10Bm5UlMg700</p>
         */
        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("items")
        public java.util.List<CooperatorHotelBillSettlementQueryResponseBodyModuleItems> items;

        /**
         * <strong>example:</strong>
         * <p>2021-10-14</p>
         */
        @NameInMap("period_end")
        public String periodEnd;

        /**
         * <strong>example:</strong>
         * <p>2021-10-13</p>
         */
        @NameInMap("period_start")
        public String periodStart;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("total_size")
        public Long totalSize;

        public static CooperatorHotelBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CooperatorHotelBillSettlementQueryResponseBodyModule self = new CooperatorHotelBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModule setItems(java.util.List<CooperatorHotelBillSettlementQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<CooperatorHotelBillSettlementQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public CooperatorHotelBillSettlementQueryResponseBodyModule setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
