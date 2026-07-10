// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class IeFlightBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public IeFlightBillSettlementQueryResponseBodyModule module;

    @NameInMap("more_page")
    public Boolean morePage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static IeFlightBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IeFlightBillSettlementQueryResponseBody self = new IeFlightBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public IeFlightBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IeFlightBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IeFlightBillSettlementQueryResponseBody setModule(IeFlightBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public IeFlightBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public IeFlightBillSettlementQueryResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public IeFlightBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IeFlightBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public IeFlightBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class IeFlightBillSettlementQueryResponseBodyModuleDataList extends TeaModel {
        @NameInMap("adjust_time")
        public String adjustTime;

        @NameInMap("advance_day")
        public Integer advanceDay;

        @NameInMap("airline_corp_code")
        public String airlineCorpCode;

        @NameInMap("airline_corp_name")
        public String airlineCorpName;

        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

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

        @NameInMap("approver_email")
        public String approverEmail;

        @NameInMap("approver_id")
        public String approverId;

        @NameInMap("approver_name")
        public String approverName;

        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_country")
        public String arrCountry;

        @NameInMap("arr_country_code")
        public String arrCountryCode;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("arr_station")
        public String arrStation;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("base_location")
        public String baseLocation;

        @NameInMap("bill_record_time")
        public String billRecordTime;

        @NameInMap("book_mode")
        public String bookMode;

        @NameInMap("book_time")
        public String bookTime;

        @NameInMap("booker_id")
        public String bookerId;

        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        @NameInMap("btrip_coupon_fee")
        public Double btripCouponFee;

        @NameInMap("business_trip_result")
        public String businessTripResult;

        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        @NameInMap("category_desc")
        public String categoryDesc;

        @NameInMap("change_fee")
        public Double changeFee;

        @NameInMap("change_result")
        public String changeResult;

        @NameInMap("corp_pay_order_fee")
        public Double corpPayOrderFee;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("cost_department")
        public String costDepartment;

        @NameInMap("coupon")
        public Double coupon;

        @NameInMap("custom_content")
        public String customContent;

        @NameInMap("deductible_tax")
        public Double deductibleTax;

        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_country")
        public String depCountry;

        @NameInMap("dep_country_code")
        public String depCountryCode;

        @NameInMap("department")
        public String department;

        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("dept_city")
        public String deptCity;

        @NameInMap("dept_date")
        public String deptDate;

        @NameInMap("dept_station")
        public String deptStation;

        @NameInMap("dept_time")
        public String deptTime;

        @NameInMap("discount")
        public String discount;

        @NameInMap("exceed_reason")
        public String exceedReason;

        @NameInMap("fee_type")
        public String feeType;

        @NameInMap("fee_type_desc")
        public String feeTypeDesc;

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("foreigners_tag")
        public String foreignersTag;

        @NameInMap("index")
        public String index;

        @NameInMap("ins_order_id")
        public String insOrderId;

        @NameInMap("insurance_fee")
        public Double insuranceFee;

        @NameInMap("insurance_number")
        public String insuranceNumber;

        @NameInMap("insurance_product_name")
        public String insuranceProductName;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("location")
        public String location;

        @NameInMap("mapping_company_code")
        public String mappingCompanyCode;

        @NameInMap("most_difference_dept_time")
        public String mostDifferenceDeptTime;

        @NameInMap("most_difference_discount")
        public String mostDifferenceDiscount;

        @NameInMap("most_difference_flight_no")
        public String mostDifferenceFlightNo;

        @NameInMap("most_difference_price")
        public Double mostDifferencePrice;

        @NameInMap("most_difference_reason")
        public String mostDifferenceReason;

        @NameInMap("most_price")
        public Double mostPrice;

        @NameInMap("negotiation_coupon_fee")
        public Double negotiationCouponFee;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        @NameInMap("over_apply_id")
        public String overApplyId;

        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        @NameInMap("position")
        public String position;

        @NameInMap("position_level")
        public String positionLevel;

        @NameInMap("primary_id")
        public Long primaryId;

        @NameInMap("processor_oa_code")
        public String processorOaCode;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("refund_change_cost")
        public Double refundChangeCost;

        @NameInMap("refund_fee")
        public Double refundFee;

        @NameInMap("refund_result")
        public String refundResult;

        @NameInMap("remark")
        public String remark;

        @NameInMap("repeat_refund")
        public String repeatRefund;

        @NameInMap("seal_price")
        public Double sealPrice;

        @NameInMap("segment_list")
        public String segmentList;

        @NameInMap("segment_type")
        public String segmentType;

        @NameInMap("service_fee")
        public Double serviceFee;

        @NameInMap("settle_type_desc")
        public String settleTypeDesc;

        @NameInMap("settlement_fee")
        public Double settlementFee;

        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        @NameInMap("settlement_time")
        public String settlementTime;

        @NameInMap("settlement_type")
        public String settlementType;

        @NameInMap("sio")
        public String sio;

        @NameInMap("status")
        public Integer status;

        @NameInMap("status_desc")
        public String statusDesc;

        @NameInMap("sub_order_id")
        public String subOrderId;

        @NameInMap("tax_fee")
        public Double taxFee;

        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("third_itinerary_id")
        public String thirdItineraryId;

        @NameInMap("ticket_id")
        public String ticketId;

        @NameInMap("trade")
        public String trade;

        @NameInMap("trade_action_desc")
        public String tradeActionDesc;

        @NameInMap("traveler_email")
        public String travelerEmail;

        @NameInMap("traveler_id")
        public String travelerId;

        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        @NameInMap("traveler_member_type")
        public String travelerMemberType;

        @NameInMap("traveler_member_type_name")
        public String travelerMemberTypeName;

        @NameInMap("traveler_name")
        public String travelerName;

        @NameInMap("trip_type")
        public Integer tripType;

        @NameInMap("voucher_type")
        public Integer voucherType;

        @NameInMap("voucher_type_desc")
        public String voucherTypeDesc;

        @NameInMap("voyage_name")
        public String voyageName;

        public static IeFlightBillSettlementQueryResponseBodyModuleDataList build(java.util.Map<String, ?> map) throws Exception {
            IeFlightBillSettlementQueryResponseBodyModuleDataList self = new IeFlightBillSettlementQueryResponseBodyModuleDataList();
            return TeaModel.build(map, self);
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAdjustTime(String adjustTime) {
            this.adjustTime = adjustTime;
            return this;
        }
        public String getAdjustTime() {
            return this.adjustTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAdvanceDay(Integer advanceDay) {
            this.advanceDay = advanceDay;
            return this;
        }
        public Integer getAdvanceDay() {
            return this.advanceDay;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAirlineCorpCode(String airlineCorpCode) {
            this.airlineCorpCode = airlineCorpCode;
            return this;
        }
        public String getAirlineCorpCode() {
            return this.airlineCorpCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAirlineCorpName(String airlineCorpName) {
            this.airlineCorpName = airlineCorpName;
            return this;
        }
        public String getAirlineCorpName() {
            return this.airlineCorpName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApproverEmail(String approverEmail) {
            this.approverEmail = approverEmail;
            return this;
        }
        public String getApproverEmail() {
            return this.approverEmail;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrCountry(String arrCountry) {
            this.arrCountry = arrCountry;
            return this;
        }
        public String getArrCountry() {
            return this.arrCountry;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrCountryCode(String arrCountryCode) {
            this.arrCountryCode = arrCountryCode;
            return this;
        }
        public String getArrCountryCode() {
            return this.arrCountryCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBaseLocation(String baseLocation) {
            this.baseLocation = baseLocation;
            return this;
        }
        public String getBaseLocation() {
            return this.baseLocation;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookMode(String bookMode) {
            this.bookMode = bookMode;
            return this;
        }
        public String getBookMode() {
            return this.bookMode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBtripCouponFee(Double btripCouponFee) {
            this.btripCouponFee = btripCouponFee;
            return this;
        }
        public Double getBtripCouponFee() {
            return this.btripCouponFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setBusinessTripResult(String businessTripResult) {
            this.businessTripResult = businessTripResult;
            return this;
        }
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCategoryDesc(String categoryDesc) {
            this.categoryDesc = categoryDesc;
            return this;
        }
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setChangeResult(String changeResult) {
            this.changeResult = changeResult;
            return this;
        }
        public String getChangeResult() {
            return this.changeResult;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCorpPayOrderFee(Double corpPayOrderFee) {
            this.corpPayOrderFee = corpPayOrderFee;
            return this;
        }
        public Double getCorpPayOrderFee() {
            return this.corpPayOrderFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCostDepartment(String costDepartment) {
            this.costDepartment = costDepartment;
            return this;
        }
        public String getCostDepartment() {
            return this.costDepartment;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCoupon(Double coupon) {
            this.coupon = coupon;
            return this;
        }
        public Double getCoupon() {
            return this.coupon;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeductibleTax(Double deductibleTax) {
            this.deductibleTax = deductibleTax;
            return this;
        }
        public Double getDeductibleTax() {
            return this.deductibleTax;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepCountry(String depCountry) {
            this.depCountry = depCountry;
            return this;
        }
        public String getDepCountry() {
            return this.depCountry;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepCountryCode(String depCountryCode) {
            this.depCountryCode = depCountryCode;
            return this;
        }
        public String getDepCountryCode() {
            return this.depCountryCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeptCity(String deptCity) {
            this.deptCity = deptCity;
            return this;
        }
        public String getDeptCity() {
            return this.deptCity;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeptDate(String deptDate) {
            this.deptDate = deptDate;
            return this;
        }
        public String getDeptDate() {
            return this.deptDate;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeptStation(String deptStation) {
            this.deptStation = deptStation;
            return this;
        }
        public String getDeptStation() {
            return this.deptStation;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDeptTime(String deptTime) {
            this.deptTime = deptTime;
            return this;
        }
        public String getDeptTime() {
            return this.deptTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setFeeTypeDesc(String feeTypeDesc) {
            this.feeTypeDesc = feeTypeDesc;
            return this;
        }
        public String getFeeTypeDesc() {
            return this.feeTypeDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setForeignersTag(String foreignersTag) {
            this.foreignersTag = foreignersTag;
            return this;
        }
        public String getForeignersTag() {
            return this.foreignersTag;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInsuranceFee(Double insuranceFee) {
            this.insuranceFee = insuranceFee;
            return this;
        }
        public Double getInsuranceFee() {
            return this.insuranceFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
            return this;
        }
        public String getInsuranceNumber() {
            return this.insuranceNumber;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInsuranceProductName(String insuranceProductName) {
            this.insuranceProductName = insuranceProductName;
            return this;
        }
        public String getInsuranceProductName() {
            return this.insuranceProductName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMappingCompanyCode(String mappingCompanyCode) {
            this.mappingCompanyCode = mappingCompanyCode;
            return this;
        }
        public String getMappingCompanyCode() {
            return this.mappingCompanyCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceDeptTime(String mostDifferenceDeptTime) {
            this.mostDifferenceDeptTime = mostDifferenceDeptTime;
            return this;
        }
        public String getMostDifferenceDeptTime() {
            return this.mostDifferenceDeptTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceDiscount(String mostDifferenceDiscount) {
            this.mostDifferenceDiscount = mostDifferenceDiscount;
            return this;
        }
        public String getMostDifferenceDiscount() {
            return this.mostDifferenceDiscount;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceFlightNo(String mostDifferenceFlightNo) {
            this.mostDifferenceFlightNo = mostDifferenceFlightNo;
            return this;
        }
        public String getMostDifferenceFlightNo() {
            return this.mostDifferenceFlightNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferencePrice(Double mostDifferencePrice) {
            this.mostDifferencePrice = mostDifferencePrice;
            return this;
        }
        public Double getMostDifferencePrice() {
            return this.mostDifferencePrice;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceReason(String mostDifferenceReason) {
            this.mostDifferenceReason = mostDifferenceReason;
            return this;
        }
        public String getMostDifferenceReason() {
            return this.mostDifferenceReason;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setMostPrice(Double mostPrice) {
            this.mostPrice = mostPrice;
            return this;
        }
        public Double getMostPrice() {
            return this.mostPrice;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setNegotiationCouponFee(Double negotiationCouponFee) {
            this.negotiationCouponFee = negotiationCouponFee;
            return this;
        }
        public Double getNegotiationCouponFee() {
            return this.negotiationCouponFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPositionLevel(String positionLevel) {
            this.positionLevel = positionLevel;
            return this;
        }
        public String getPositionLevel() {
            return this.positionLevel;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setProcessorOaCode(String processorOaCode) {
            this.processorOaCode = processorOaCode;
            return this;
        }
        public String getProcessorOaCode() {
            return this.processorOaCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRefundChangeCost(Double refundChangeCost) {
            this.refundChangeCost = refundChangeCost;
            return this;
        }
        public Double getRefundChangeCost() {
            return this.refundChangeCost;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRefundResult(String refundResult) {
            this.refundResult = refundResult;
            return this;
        }
        public String getRefundResult() {
            return this.refundResult;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setRepeatRefund(String repeatRefund) {
            this.repeatRefund = repeatRefund;
            return this;
        }
        public String getRepeatRefund() {
            return this.repeatRefund;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSealPrice(Double sealPrice) {
            this.sealPrice = sealPrice;
            return this;
        }
        public Double getSealPrice() {
            return this.sealPrice;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSegmentList(String segmentList) {
            this.segmentList = segmentList;
            return this;
        }
        public String getSegmentList() {
            return this.segmentList;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSegmentType(String segmentType) {
            this.segmentType = segmentType;
            return this;
        }
        public String getSegmentType() {
            return this.segmentType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettleTypeDesc(String settleTypeDesc) {
            this.settleTypeDesc = settleTypeDesc;
            return this;
        }
        public String getSettleTypeDesc() {
            return this.settleTypeDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSio(String sio) {
            this.sio = sio;
            return this;
        }
        public String getSio() {
            return this.sio;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTaxFee(Double taxFee) {
            this.taxFee = taxFee;
            return this;
        }
        public Double getTaxFee() {
            return this.taxFee;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTrade(String trade) {
            this.trade = trade;
            return this;
        }
        public String getTrade() {
            return this.trade;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTradeActionDesc(String tradeActionDesc) {
            this.tradeActionDesc = tradeActionDesc;
            return this;
        }
        public String getTradeActionDesc() {
            return this.tradeActionDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerEmail(String travelerEmail) {
            this.travelerEmail = travelerEmail;
            return this;
        }
        public String getTravelerEmail() {
            return this.travelerEmail;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerMemberType(String travelerMemberType) {
            this.travelerMemberType = travelerMemberType;
            return this;
        }
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setTripType(Integer tripType) {
            this.tripType = tripType;
            return this;
        }
        public Integer getTripType() {
            return this.tripType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setVoucherTypeDesc(String voucherTypeDesc) {
            this.voucherTypeDesc = voucherTypeDesc;
            return this;
        }
        public String getVoucherTypeDesc() {
            return this.voucherTypeDesc;
        }

        public IeFlightBillSettlementQueryResponseBodyModuleDataList setVoyageName(String voyageName) {
            this.voyageName = voyageName;
            return this;
        }
        public String getVoyageName() {
            return this.voyageName;
        }

    }

    public static class IeFlightBillSettlementQueryResponseBodyModule extends TeaModel {
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<IeFlightBillSettlementQueryResponseBodyModuleDataList> dataList;

        @NameInMap("period_end")
        public String periodEnd;

        @NameInMap("period_start")
        public String periodStart;

        @NameInMap("scroll_id")
        public String scrollId;

        @NameInMap("total_num")
        public Long totalNum;

        public static IeFlightBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            IeFlightBillSettlementQueryResponseBodyModule self = new IeFlightBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public IeFlightBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setDataList(java.util.List<IeFlightBillSettlementQueryResponseBodyModuleDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<IeFlightBillSettlementQueryResponseBodyModuleDataList> getDataList() {
            return this.dataList;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public IeFlightBillSettlementQueryResponseBodyModule setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
