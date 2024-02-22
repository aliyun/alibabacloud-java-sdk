// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CooperatorFlightBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CooperatorFlightBillSettlementQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>trace_id</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static CooperatorFlightBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CooperatorFlightBillSettlementQueryResponseBody self = new CooperatorFlightBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CooperatorFlightBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CooperatorFlightBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CooperatorFlightBillSettlementQueryResponseBody setModule(CooperatorFlightBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CooperatorFlightBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public CooperatorFlightBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CooperatorFlightBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CooperatorFlightBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CooperatorFlightBillSettlementQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("advance_day")
        public Integer advanceDay;

        @NameInMap("airline_corp_code")
        public String airlineCorpCode;

        @NameInMap("airline_corp_name")
        public String airlineCorpName;

        @NameInMap("alipay_id")
        public String alipayId;

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

        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("arr_station")
        public String arrStation;

        @NameInMap("arr_time")
        public String arrTime;

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

        @NameInMap("build_fee")
        public Double buildFee;

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

        @NameInMap("change_fee")
        public Double changeFee;

        @NameInMap("change_result")
        public String changeResult;

        @NameInMap("cooperator_bill_code")
        public String cooperatorBillCode;

        @NameInMap("cooperator_name")
        public String cooperatorName;

        @NameInMap("cooperator_order_id")
        public String cooperatorOrderId;

        @NameInMap("corp_pay_order_fee")
        public Double corpPayOrderFee;

        @NameInMap("corp_settle_price")
        public Double corpSettlePrice;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("coupon")
        public Double coupon;

        @NameInMap("dep_airport_code")
        public String depAirportCode;

        @NameInMap("dep_city_code")
        public String depCityCode;

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

        @NameInMap("flight_no")
        public String flightNo;

        @NameInMap("index")
        public String index;

        @NameInMap("ins_order_id")
        public String insOrderId;

        @NameInMap("insurance_fee")
        public Double insuranceFee;

        @NameInMap("insurance_number")
        public String insuranceNumber;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("item_type")
        public String itemType;

        @NameInMap("itinerary_num")
        public String itineraryNum;

        @NameInMap("itinerary_price")
        public Double itineraryPrice;

        @NameInMap("mileage")
        public Integer mileage;

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

        @NameInMap("oil_fee")
        public Double oilFee;

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

        @NameInMap("person_settle_price")
        public Double personSettlePrice;

        @NameInMap("pre_book_tip")
        public String preBookTip;

        @NameInMap("primary_id")
        public Long primaryId;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("refund_fee")
        public Double refundFee;

        @NameInMap("refund_result")
        public String refundResult;

        @NameInMap("refund_upgrade_cost")
        public Double refundUpgradeCost;

        @NameInMap("remark")
        public String remark;

        @NameInMap("repeat_refund")
        public String repeatRefund;

        @NameInMap("seal_price")
        public Double sealPrice;

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

        @NameInMap("ticket_id")
        public String ticketId;

        @NameInMap("trade")
        public String trade;

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

        @NameInMap("upgrade_cost")
        public Double upgradeCost;

        @NameInMap("voucher_type")
        public Integer voucherType;

        @NameInMap("voyage_name")
        public String voyageName;

        public static CooperatorFlightBillSettlementQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            CooperatorFlightBillSettlementQueryResponseBodyModuleItems self = new CooperatorFlightBillSettlementQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setAdvanceDay(Integer advanceDay) {
            this.advanceDay = advanceDay;
            return this;
        }
        public Integer getAdvanceDay() {
            return this.advanceDay;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setAirlineCorpCode(String airlineCorpCode) {
            this.airlineCorpCode = airlineCorpCode;
            return this;
        }
        public String getAirlineCorpCode() {
            return this.airlineCorpCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setAirlineCorpName(String airlineCorpName) {
            this.airlineCorpName = airlineCorpName;
            return this;
        }
        public String getAirlineCorpName() {
            return this.airlineCorpName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setAlipayId(String alipayId) {
            this.alipayId = alipayId;
            return this;
        }
        public String getAlipayId() {
            return this.alipayId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBookMode(String bookMode) {
            this.bookMode = bookMode;
            return this;
        }
        public String getBookMode() {
            return this.bookMode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBtripCouponFee(Double btripCouponFee) {
            this.btripCouponFee = btripCouponFee;
            return this;
        }
        public Double getBtripCouponFee() {
            return this.btripCouponFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBuildFee(Double buildFee) {
            this.buildFee = buildFee;
            return this;
        }
        public Double getBuildFee() {
            return this.buildFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setBusinessTripResult(String businessTripResult) {
            this.businessTripResult = businessTripResult;
            return this;
        }
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setChangeResult(String changeResult) {
            this.changeResult = changeResult;
            return this;
        }
        public String getChangeResult() {
            return this.changeResult;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCooperatorBillCode(String cooperatorBillCode) {
            this.cooperatorBillCode = cooperatorBillCode;
            return this;
        }
        public String getCooperatorBillCode() {
            return this.cooperatorBillCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCooperatorName(String cooperatorName) {
            this.cooperatorName = cooperatorName;
            return this;
        }
        public String getCooperatorName() {
            return this.cooperatorName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCooperatorOrderId(String cooperatorOrderId) {
            this.cooperatorOrderId = cooperatorOrderId;
            return this;
        }
        public String getCooperatorOrderId() {
            return this.cooperatorOrderId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCorpPayOrderFee(Double corpPayOrderFee) {
            this.corpPayOrderFee = corpPayOrderFee;
            return this;
        }
        public Double getCorpPayOrderFee() {
            return this.corpPayOrderFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCorpSettlePrice(Double corpSettlePrice) {
            this.corpSettlePrice = corpSettlePrice;
            return this;
        }
        public Double getCorpSettlePrice() {
            return this.corpSettlePrice;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setCoupon(Double coupon) {
            this.coupon = coupon;
            return this;
        }
        public Double getCoupon() {
            return this.coupon;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDeptCity(String deptCity) {
            this.deptCity = deptCity;
            return this;
        }
        public String getDeptCity() {
            return this.deptCity;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDeptDate(String deptDate) {
            this.deptDate = deptDate;
            return this;
        }
        public String getDeptDate() {
            return this.deptDate;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDeptStation(String deptStation) {
            this.deptStation = deptStation;
            return this;
        }
        public String getDeptStation() {
            return this.deptStation;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDeptTime(String deptTime) {
            this.deptTime = deptTime;
            return this;
        }
        public String getDeptTime() {
            return this.deptTime;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setInsuranceFee(Double insuranceFee) {
            this.insuranceFee = insuranceFee;
            return this;
        }
        public Double getInsuranceFee() {
            return this.insuranceFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
            return this;
        }
        public String getInsuranceNumber() {
            return this.insuranceNumber;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setItineraryNum(String itineraryNum) {
            this.itineraryNum = itineraryNum;
            return this;
        }
        public String getItineraryNum() {
            return this.itineraryNum;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setItineraryPrice(Double itineraryPrice) {
            this.itineraryPrice = itineraryPrice;
            return this;
        }
        public Double getItineraryPrice() {
            return this.itineraryPrice;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setMileage(Integer mileage) {
            this.mileage = mileage;
            return this;
        }
        public Integer getMileage() {
            return this.mileage;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setMostDifferenceDeptTime(String mostDifferenceDeptTime) {
            this.mostDifferenceDeptTime = mostDifferenceDeptTime;
            return this;
        }
        public String getMostDifferenceDeptTime() {
            return this.mostDifferenceDeptTime;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setMostDifferenceDiscount(String mostDifferenceDiscount) {
            this.mostDifferenceDiscount = mostDifferenceDiscount;
            return this;
        }
        public String getMostDifferenceDiscount() {
            return this.mostDifferenceDiscount;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setMostDifferenceFlightNo(String mostDifferenceFlightNo) {
            this.mostDifferenceFlightNo = mostDifferenceFlightNo;
            return this;
        }
        public String getMostDifferenceFlightNo() {
            return this.mostDifferenceFlightNo;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setMostDifferencePrice(Double mostDifferencePrice) {
            this.mostDifferencePrice = mostDifferencePrice;
            return this;
        }
        public Double getMostDifferencePrice() {
            return this.mostDifferencePrice;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setMostDifferenceReason(String mostDifferenceReason) {
            this.mostDifferenceReason = mostDifferenceReason;
            return this;
        }
        public String getMostDifferenceReason() {
            return this.mostDifferenceReason;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setMostPrice(Double mostPrice) {
            this.mostPrice = mostPrice;
            return this;
        }
        public Double getMostPrice() {
            return this.mostPrice;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setNegotiationCouponFee(Double negotiationCouponFee) {
            this.negotiationCouponFee = negotiationCouponFee;
            return this;
        }
        public Double getNegotiationCouponFee() {
            return this.negotiationCouponFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setOilFee(Double oilFee) {
            this.oilFee = oilFee;
            return this;
        }
        public Double getOilFee() {
            return this.oilFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setPersonSettlePrice(Double personSettlePrice) {
            this.personSettlePrice = personSettlePrice;
            return this;
        }
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setPreBookTip(String preBookTip) {
            this.preBookTip = preBookTip;
            return this;
        }
        public String getPreBookTip() {
            return this.preBookTip;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setRefundResult(String refundResult) {
            this.refundResult = refundResult;
            return this;
        }
        public String getRefundResult() {
            return this.refundResult;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setRefundUpgradeCost(Double refundUpgradeCost) {
            this.refundUpgradeCost = refundUpgradeCost;
            return this;
        }
        public Double getRefundUpgradeCost() {
            return this.refundUpgradeCost;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setRepeatRefund(String repeatRefund) {
            this.repeatRefund = repeatRefund;
            return this;
        }
        public String getRepeatRefund() {
            return this.repeatRefund;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setSealPrice(Double sealPrice) {
            this.sealPrice = sealPrice;
            return this;
        }
        public Double getSealPrice() {
            return this.sealPrice;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setThirdInvoiceId(String thirdInvoiceId) {
            this.thirdInvoiceId = thirdInvoiceId;
            return this;
        }
        public String getThirdInvoiceId() {
            return this.thirdInvoiceId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setTrade(String trade) {
            this.trade = trade;
            return this;
        }
        public String getTrade() {
            return this.trade;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setTravelerMemberType(String travelerMemberType) {
            this.travelerMemberType = travelerMemberType;
            return this;
        }
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setUpgradeCost(Double upgradeCost) {
            this.upgradeCost = upgradeCost;
            return this;
        }
        public Double getUpgradeCost() {
            return this.upgradeCost;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModuleItems setVoyageName(String voyageName) {
            this.voyageName = voyageName;
            return this;
        }
        public String getVoyageName() {
            return this.voyageName;
        }

    }

    public static class CooperatorFlightBillSettlementQueryResponseBodyModule extends TeaModel {
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("items")
        public java.util.List<CooperatorFlightBillSettlementQueryResponseBodyModuleItems> items;

        @NameInMap("period_end")
        public String periodEnd;

        @NameInMap("period_start")
        public String periodStart;

        @NameInMap("total_size")
        public Long totalSize;

        public static CooperatorFlightBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CooperatorFlightBillSettlementQueryResponseBodyModule self = new CooperatorFlightBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModule setItems(java.util.List<CooperatorFlightBillSettlementQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<CooperatorFlightBillSettlementQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public CooperatorFlightBillSettlementQueryResponseBodyModule setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
