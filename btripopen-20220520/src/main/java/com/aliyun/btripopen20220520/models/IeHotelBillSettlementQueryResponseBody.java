// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IeHotelBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    /**
     * <p>module</p>
     */
    @NameInMap("module")
    public IeHotelBillSettlementQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static IeHotelBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IeHotelBillSettlementQueryResponseBody self = new IeHotelBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public IeHotelBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IeHotelBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IeHotelBillSettlementQueryResponseBody setModule(IeHotelBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IeHotelBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public IeHotelBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IeHotelBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IeHotelBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IeHotelBillSettlementQueryResponseBodyModuleDataList extends TeaModel {
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        @NameInMap("amount_currency")
        public String amountCurrency;

        @NameInMap("apply_arr_city_code")
        public String applyArrCityCode;

        @NameInMap("apply_arr_city_name")
        public String applyArrCityName;

        @NameInMap("apply_dep_city_code")
        public String applyDepCityCode;

        @NameInMap("apply_dep_city_name")
        public String applyDepCityName;

        @NameInMap("apply_extend_field")
        public String applyExtendField;

        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("average_nights")
        public Double averageNights;

        @NameInMap("bill_record_time")
        public String billRecordTime;

        @NameInMap("book_reason")
        public String bookReason;

        @NameInMap("book_time")
        public String bookTime;

        @NameInMap("booker_id")
        public String bookerId;

        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        @NameInMap("brand_group")
        public String brandGroup;

        @NameInMap("brand_name")
        public String brandName;

        @NameInMap("business_expense")
        public Long businessExpense;

        @NameInMap("business_trip_result")
        public String businessTripResult;

        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        @NameInMap("check_in_date")
        public String checkInDate;

        @NameInMap("checkout_date")
        public String checkoutDate;

        @NameInMap("city")
        public String city;

        @NameInMap("city_code")
        public String cityCode;

        @NameInMap("corp_refund_fee")
        public Double corpRefundFee;

        @NameInMap("corp_total_fee")
        public Double corpTotalFee;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("country")
        public String country;

        @NameInMap("country_code")
        public String countryCode;

        @NameInMap("department")
        public String department;

        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("exceed_reason")
        public String exceedReason;

        @NameInMap("fee_type")
        public String feeType;

        @NameInMap("fines")
        public Double fines;

        @NameInMap("foreign_business_expense")
        public Long foreignBusinessExpense;

        @NameInMap("hotel_name")
        public String hotelName;

        @NameInMap("hotel_star")
        public String hotelStar;

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

        @NameInMap("main_apply_id")
        public String mainApplyId;

        @NameInMap("nights")
        public Integer nights;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_price")
        public Double orderPrice;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        @NameInMap("order_type")
        public String orderType;

        @NameInMap("over_apply_id")
        public String overApplyId;

        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        @NameInMap("person_refund_fee")
        public Double personRefundFee;

        @NameInMap("person_settle_price")
        public Double personSettlePrice;

        @NameInMap("primary_id")
        public Long primaryId;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("promotion_fee")
        public Double promotionFee;

        @NameInMap("rate")
        public String rate;

        @NameInMap("remark")
        public String remark;

        @NameInMap("reserve_rule")
        public Integer reserveRule;

        @NameInMap("room_no")
        public String roomNo;

        @NameInMap("room_number")
        public Integer roomNumber;

        @NameInMap("room_price")
        public Double roomPrice;

        @NameInMap("room_type")
        public String roomType;

        @NameInMap("service_fee")
        public Double serviceFee;

        @NameInMap("settlement_fee")
        public Double settlementFee;

        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        @NameInMap("settlement_time")
        public String settlementTime;

        @NameInMap("settlement_type")
        public String settlementType;

        @NameInMap("status")
        public Integer status;

        @NameInMap("sub_order_id")
        public String subOrderId;

        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("third_invoice_id")
        public String thirdInvoiceId;

        @NameInMap("third_itinerary_id")
        public String thirdItineraryId;

        @NameInMap("third_part_business_id")
        public String thirdPartBusinessId;

        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        @NameInMap("total_nights")
        public Integer totalNights;

        @NameInMap("traveler_id")
        public String travelerId;

        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        @NameInMap("traveler_member_type")
        public String travelerMemberType;

        @NameInMap("traveler_name")
        public String travelerName;

        @NameInMap("voucher_type")
        public Integer voucherType;

        public static IeHotelBillSettlementQueryResponseBodyModuleDataList build(java.util.Map<String, ?> map) throws Exception {
            IeHotelBillSettlementQueryResponseBodyModuleDataList self = new IeHotelBillSettlementQueryResponseBodyModuleDataList();
            return TeaModel.build(map, self);
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setAmountCurrency(String amountCurrency) {
            this.amountCurrency = amountCurrency;
            return this;
        }
        public String getAmountCurrency() {
            return this.amountCurrency;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setAverageNights(Double averageNights) {
            this.averageNights = averageNights;
            return this;
        }
        public Double getAverageNights() {
            return this.averageNights;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBookReason(String bookReason) {
            this.bookReason = bookReason;
            return this;
        }
        public String getBookReason() {
            return this.bookReason;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBrandGroup(String brandGroup) {
            this.brandGroup = brandGroup;
            return this;
        }
        public String getBrandGroup() {
            return this.brandGroup;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBrandName(String brandName) {
            this.brandName = brandName;
            return this;
        }
        public String getBrandName() {
            return this.brandName;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBusinessExpense(Long businessExpense) {
            this.businessExpense = businessExpense;
            return this;
        }
        public Long getBusinessExpense() {
            return this.businessExpense;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setBusinessTripResult(String businessTripResult) {
            this.businessTripResult = businessTripResult;
            return this;
        }
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCheckInDate(String checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }
        public String getCheckInDate() {
            return this.checkInDate;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCheckoutDate(String checkoutDate) {
            this.checkoutDate = checkoutDate;
            return this;
        }
        public String getCheckoutDate() {
            return this.checkoutDate;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCorpRefundFee(Double corpRefundFee) {
            this.corpRefundFee = corpRefundFee;
            return this;
        }
        public Double getCorpRefundFee() {
            return this.corpRefundFee;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCorpTotalFee(Double corpTotalFee) {
            this.corpTotalFee = corpTotalFee;
            return this;
        }
        public Double getCorpTotalFee() {
            return this.corpTotalFee;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setFines(Double fines) {
            this.fines = fines;
            return this;
        }
        public Double getFines() {
            return this.fines;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setForeignBusinessExpense(Long foreignBusinessExpense) {
            this.foreignBusinessExpense = foreignBusinessExpense;
            return this;
        }
        public Long getForeignBusinessExpense() {
            return this.foreignBusinessExpense;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setHotelName(String hotelName) {
            this.hotelName = hotelName;
            return this;
        }
        public String getHotelName() {
            return this.hotelName;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setHotelStar(String hotelStar) {
            this.hotelStar = hotelStar;
            return this;
        }
        public String getHotelStar() {
            return this.hotelStar;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setIsEarlyDeparture(String isEarlyDeparture) {
            this.isEarlyDeparture = isEarlyDeparture;
            return this;
        }
        public String getIsEarlyDeparture() {
            return this.isEarlyDeparture;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setIsNegotiation(String isNegotiation) {
            this.isNegotiation = isNegotiation;
            return this;
        }
        public String getIsNegotiation() {
            return this.isNegotiation;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setIsShareStr(String isShareStr) {
            this.isShareStr = isShareStr;
            return this;
        }
        public String getIsShareStr() {
            return this.isShareStr;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setMainApplyId(String mainApplyId) {
            this.mainApplyId = mainApplyId;
            return this;
        }
        public String getMainApplyId() {
            return this.mainApplyId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setNights(Integer nights) {
            this.nights = nights;
            return this;
        }
        public Integer getNights() {
            return this.nights;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setOrderPrice(Double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setOrderType(String orderType) {
            this.orderType = orderType;
            return this;
        }
        public String getOrderType() {
            return this.orderType;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setPersonRefundFee(Double personRefundFee) {
            this.personRefundFee = personRefundFee;
            return this;
        }
        public Double getPersonRefundFee() {
            return this.personRefundFee;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setPersonSettlePrice(Double personSettlePrice) {
            this.personSettlePrice = personSettlePrice;
            return this;
        }
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setPromotionFee(Double promotionFee) {
            this.promotionFee = promotionFee;
            return this;
        }
        public Double getPromotionFee() {
            return this.promotionFee;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setReserveRule(Integer reserveRule) {
            this.reserveRule = reserveRule;
            return this;
        }
        public Integer getReserveRule() {
            return this.reserveRule;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setRoomNo(String roomNo) {
            this.roomNo = roomNo;
            return this;
        }
        public String getRoomNo() {
            return this.roomNo;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setRoomNumber(Integer roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }
        public Integer getRoomNumber() {
            return this.roomNumber;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setRoomPrice(Double roomPrice) {
            this.roomPrice = roomPrice;
            return this;
        }
        public Double getRoomPrice() {
            return this.roomPrice;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setRoomType(String roomType) {
            this.roomType = roomType;
            return this;
        }
        public String getRoomType() {
            return this.roomType;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setThirdInvoiceId(String thirdInvoiceId) {
            this.thirdInvoiceId = thirdInvoiceId;
            return this;
        }
        public String getThirdInvoiceId() {
            return this.thirdInvoiceId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setThirdPartBusinessId(String thirdPartBusinessId) {
            this.thirdPartBusinessId = thirdPartBusinessId;
            return this;
        }
        public String getThirdPartBusinessId() {
            return this.thirdPartBusinessId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setTotalNights(Integer totalNights) {
            this.totalNights = totalNights;
            return this;
        }
        public Integer getTotalNights() {
            return this.totalNights;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setTravelerMemberType(String travelerMemberType) {
            this.travelerMemberType = travelerMemberType;
            return this;
        }
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public IeHotelBillSettlementQueryResponseBodyModuleDataList setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

    }

    public static class IeHotelBillSettlementQueryResponseBodyModule extends TeaModel {
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<IeHotelBillSettlementQueryResponseBodyModuleDataList> dataList;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("period_end")
        public String periodEnd;

        @NameInMap("period_start")
        public String periodStart;

        @NameInMap("total_size")
        public Long totalSize;

        public static IeHotelBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IeHotelBillSettlementQueryResponseBodyModule self = new IeHotelBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IeHotelBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public IeHotelBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public IeHotelBillSettlementQueryResponseBodyModule setDataList(java.util.List<IeHotelBillSettlementQueryResponseBodyModuleDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<IeHotelBillSettlementQueryResponseBodyModuleDataList> getDataList() {
            return this.dataList;
        }

        public IeHotelBillSettlementQueryResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public IeHotelBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public IeHotelBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public IeHotelBillSettlementQueryResponseBodyModule setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
