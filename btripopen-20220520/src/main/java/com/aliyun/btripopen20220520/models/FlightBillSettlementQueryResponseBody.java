// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FlightBillSettlementQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public FlightBillSettlementQueryResponseBodyModule module;

    /**
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
     * <strong>example:</strong>
     * <p>21041ce316577904808056433edbb2</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static FlightBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FlightBillSettlementQueryResponseBody self = new FlightBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public FlightBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FlightBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FlightBillSettlementQueryResponseBody setModule(FlightBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FlightBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public FlightBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FlightBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FlightBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FlightBillSettlementQueryResponseBodyModuleDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("advance_day")
        public Integer advanceDay;

        /**
         * <strong>example:</strong>
         * <p>MU</p>
         */
        @NameInMap("airline_corp_code")
        public String airlineCorpCode;

        @NameInMap("airline_corp_name")
        public String airlineCorpName;

        @NameInMap("alipay_id")
        public String alipayId;

        /**
         * <strong>example:</strong>
         * <p>2021100122001138061456080520</p>
         */
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

        /**
         * <p>审批扩展自定义字段</p>
         */
        @NameInMap("apply_extend_field")
        public String applyExtendField;

        /**
         * <strong>example:</strong>
         * <p>103177854</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        /**
         * <strong>example:</strong>
         * <p>CAN</p>
         */
        @NameInMap("arr_airport_code")
        public String arrAirportCode;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>2021-10-02</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("arr_station")
        public String arrStation;

        /**
         * <strong>example:</strong>
         * <p>13:30:00</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T20:18Z</p>
         */
        @NameInMap("bill_record_time")
        public String billRecordTime;

        /**
         * <strong>example:</strong>
         * <p>2021-10-01 00:17:05</p>
         */
        @NameInMap("book_time")
        public String bookTime;

        @NameInMap("booker_id")
        public String bookerId;

        /**
         * <strong>example:</strong>
         * <p>2342432</p>
         */
        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("btrip_coupon_fee")
        public Double btripCouponFee;

        /**
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("build_fee")
        public Double buildFee;

        @NameInMap("business_trip_result")
        public String businessTripResult;

        /**
         * <strong>example:</strong>
         * <p>R</p>
         */
        @NameInMap("cabin")
        public String cabin;

        @NameInMap("cabin_class")
        public String cabinClass;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("change_fee")
        public Double changeFee;

        @NameInMap("change_result")
        public String changeResult;

        /**
         * <strong>example:</strong>
         * <p>460</p>
         */
        @NameInMap("corp_pay_order_fee")
        public Double corpPayOrderFee;

        @NameInMap("corp_settle_price")
        public Double corpSettlePrice;

        @NameInMap("cost_center")
        public String costCenter;

        /**
         * <strong>example:</strong>
         * <p>48b7f3cd-8a4f-4df9-ae2c-883e008cf097</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("coupon")
        public Double coupon;

        /**
         * <strong>example:</strong>
         * <p>KHN</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>2021-10-02</p>
         */
        @NameInMap("dept_date")
        public String deptDate;

        @NameInMap("dept_station")
        public String deptStation;

        /**
         * <strong>example:</strong>
         * <p>12:00:00</p>
         */
        @NameInMap("dept_time")
        public String deptTime;

        /**
         * <strong>example:</strong>
         * <p>51%</p>
         */
        @NameInMap("discount")
        public String discount;

        @NameInMap("exceed_reason")
        public String exceedReason;

        /**
         * <strong>example:</strong>
         * <p>10101</p>
         */
        @NameInMap("fee_type")
        public String feeType;

        /**
         * <strong>example:</strong>
         * <p>MU9684</p>
         */
        @NameInMap("flight_no")
        public String flightNo;

        /**
         * <strong>example:</strong>
         * <p>4564547</p>
         */
        @NameInMap("index")
        public String index;

        @NameInMap("ins_order_id")
        public String insOrderId;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("insurance_fee")
        public Double insuranceFee;

        @NameInMap("insurance_number")
        public String insuranceNumber;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("item_type")
        public String itemType;

        /**
         * <strong>example:</strong>
         * <p>5334916421</p>
         */
        @NameInMap("itinerary_num")
        public String itineraryNum;

        /**
         * <strong>example:</strong>
         * <p>460</p>
         */
        @NameInMap("itinerary_price")
        public Double itineraryPrice;

        @NameInMap("mileage")
        public String mileage;

        /**
         * <strong>example:</strong>
         * <p>2021-10-01 00:17:13</p>
         */
        @NameInMap("most_difference_dept_time")
        public String mostDifferenceDeptTime;

        /**
         * <strong>example:</strong>
         * <p>23%</p>
         */
        @NameInMap("most_difference_discount")
        public String mostDifferenceDiscount;

        /**
         * <strong>example:</strong>
         * <p>MU9684</p>
         */
        @NameInMap("most_difference_flight_no")
        public String mostDifferenceFlightNo;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("most_difference_price")
        public Double mostDifferencePrice;

        @NameInMap("most_difference_reason")
        public String mostDifferenceReason;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("most_price")
        public Double mostPrice;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("negotiation_coupon_fee")
        public Double negotiationCouponFee;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("oil_fee")
        public Double oilFee;

        /**
         * <strong>example:</strong>
         * <p>234223423423</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>234324324423</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>4564547</p>
         */
        @NameInMap("primary_id")
        public Long primaryId;

        /**
         * <strong>example:</strong>
         * <p>45623234</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("refund_fee")
        public Double refundFee;

        @NameInMap("refund_result")
        public String refundResult;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("refund_upgrade_cost")
        public Double refundUpgradeCost;

        @NameInMap("remark")
        public String remark;

        @NameInMap("repeat_refund")
        public String repeatRefund;

        /**
         * <strong>example:</strong>
         * <p>410</p>
         */
        @NameInMap("seal_price")
        public Double sealPrice;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        /**
         * <strong>example:</strong>
         * <p>460</p>
         */
        @NameInMap("settlement_fee")
        public Double settlementFee;

        /**
         * <strong>example:</strong>
         * <p>5.67</p>
         */
        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        /**
         * <strong>example:</strong>
         * <p>2021-10-01 00:17:13</p>
         */
        @NameInMap("settlement_time")
        public String settlementTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("settlement_type")
        public String settlementType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <p>税率</p>
         * 
         * <strong>example:</strong>
         * <p>6%</p>
         */
        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("third_itinerary_id")
        public String thirdItineraryId;

        /**
         * <strong>example:</strong>
         * <p>781-6586234234324</p>
         */
        @NameInMap("ticket_id")
        public String ticketId;

        @NameInMap("trade")
        public String trade;

        @NameInMap("traveler_id")
        public String travelerId;

        /**
         * <strong>example:</strong>
         * <p>345345</p>
         */
        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        @NameInMap("traveler_member_type_name")
        public String travelerMemberTypeName;

        @NameInMap("traveler_name")
        public String travelerName;

        /**
         * <strong>example:</strong>
         * <p>23.9</p>
         */
        @NameInMap("upgrade_cost")
        public Double upgradeCost;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("voucher_type")
        public Integer voucherType;

        @NameInMap("voyage_name")
        public String voyageName;

        public static FlightBillSettlementQueryResponseBodyModuleDataList build(java.util.Map<String, ?> map) throws Exception {
            FlightBillSettlementQueryResponseBodyModuleDataList self = new FlightBillSettlementQueryResponseBodyModuleDataList();
            return TeaModel.build(map, self);
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAdvanceDay(Integer advanceDay) {
            this.advanceDay = advanceDay;
            return this;
        }
        public Integer getAdvanceDay() {
            return this.advanceDay;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAirlineCorpCode(String airlineCorpCode) {
            this.airlineCorpCode = airlineCorpCode;
            return this;
        }
        public String getAirlineCorpCode() {
            return this.airlineCorpCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAirlineCorpName(String airlineCorpName) {
            this.airlineCorpName = airlineCorpName;
            return this;
        }
        public String getAirlineCorpName() {
            return this.airlineCorpName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAlipayId(String alipayId) {
            this.alipayId = alipayId;
            return this;
        }
        public String getAlipayId() {
            return this.alipayId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrAirportCode(String arrAirportCode) {
            this.arrAirportCode = arrAirportCode;
            return this;
        }
        public String getArrAirportCode() {
            return this.arrAirportCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBtripCouponFee(Double btripCouponFee) {
            this.btripCouponFee = btripCouponFee;
            return this;
        }
        public Double getBtripCouponFee() {
            return this.btripCouponFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBuildFee(Double buildFee) {
            this.buildFee = buildFee;
            return this;
        }
        public Double getBuildFee() {
            return this.buildFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setBusinessTripResult(String businessTripResult) {
            this.businessTripResult = businessTripResult;
            return this;
        }
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCabin(String cabin) {
            this.cabin = cabin;
            return this;
        }
        public String getCabin() {
            return this.cabin;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCabinClass(String cabinClass) {
            this.cabinClass = cabinClass;
            return this;
        }
        public String getCabinClass() {
            return this.cabinClass;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setChangeResult(String changeResult) {
            this.changeResult = changeResult;
            return this;
        }
        public String getChangeResult() {
            return this.changeResult;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCorpPayOrderFee(Double corpPayOrderFee) {
            this.corpPayOrderFee = corpPayOrderFee;
            return this;
        }
        public Double getCorpPayOrderFee() {
            return this.corpPayOrderFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCorpSettlePrice(Double corpSettlePrice) {
            this.corpSettlePrice = corpSettlePrice;
            return this;
        }
        public Double getCorpSettlePrice() {
            return this.corpSettlePrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setCoupon(Double coupon) {
            this.coupon = coupon;
            return this;
        }
        public Double getCoupon() {
            return this.coupon;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDepAirportCode(String depAirportCode) {
            this.depAirportCode = depAirportCode;
            return this;
        }
        public String getDepAirportCode() {
            return this.depAirportCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeptCity(String deptCity) {
            this.deptCity = deptCity;
            return this;
        }
        public String getDeptCity() {
            return this.deptCity;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeptDate(String deptDate) {
            this.deptDate = deptDate;
            return this;
        }
        public String getDeptDate() {
            return this.deptDate;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeptStation(String deptStation) {
            this.deptStation = deptStation;
            return this;
        }
        public String getDeptStation() {
            return this.deptStation;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDeptTime(String deptTime) {
            this.deptTime = deptTime;
            return this;
        }
        public String getDeptTime() {
            return this.deptTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setDiscount(String discount) {
            this.discount = discount;
            return this;
        }
        public String getDiscount() {
            return this.discount;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setFlightNo(String flightNo) {
            this.flightNo = flightNo;
            return this;
        }
        public String getFlightNo() {
            return this.flightNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setInsOrderId(String insOrderId) {
            this.insOrderId = insOrderId;
            return this;
        }
        public String getInsOrderId() {
            return this.insOrderId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setInsuranceFee(Double insuranceFee) {
            this.insuranceFee = insuranceFee;
            return this;
        }
        public Double getInsuranceFee() {
            return this.insuranceFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
            return this;
        }
        public String getInsuranceNumber() {
            return this.insuranceNumber;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setItineraryNum(String itineraryNum) {
            this.itineraryNum = itineraryNum;
            return this;
        }
        public String getItineraryNum() {
            return this.itineraryNum;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setItineraryPrice(Double itineraryPrice) {
            this.itineraryPrice = itineraryPrice;
            return this;
        }
        public Double getItineraryPrice() {
            return this.itineraryPrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMileage(String mileage) {
            this.mileage = mileage;
            return this;
        }
        public String getMileage() {
            return this.mileage;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceDeptTime(String mostDifferenceDeptTime) {
            this.mostDifferenceDeptTime = mostDifferenceDeptTime;
            return this;
        }
        public String getMostDifferenceDeptTime() {
            return this.mostDifferenceDeptTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceDiscount(String mostDifferenceDiscount) {
            this.mostDifferenceDiscount = mostDifferenceDiscount;
            return this;
        }
        public String getMostDifferenceDiscount() {
            return this.mostDifferenceDiscount;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceFlightNo(String mostDifferenceFlightNo) {
            this.mostDifferenceFlightNo = mostDifferenceFlightNo;
            return this;
        }
        public String getMostDifferenceFlightNo() {
            return this.mostDifferenceFlightNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferencePrice(Double mostDifferencePrice) {
            this.mostDifferencePrice = mostDifferencePrice;
            return this;
        }
        public Double getMostDifferencePrice() {
            return this.mostDifferencePrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostDifferenceReason(String mostDifferenceReason) {
            this.mostDifferenceReason = mostDifferenceReason;
            return this;
        }
        public String getMostDifferenceReason() {
            return this.mostDifferenceReason;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setMostPrice(Double mostPrice) {
            this.mostPrice = mostPrice;
            return this;
        }
        public Double getMostPrice() {
            return this.mostPrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setNegotiationCouponFee(Double negotiationCouponFee) {
            this.negotiationCouponFee = negotiationCouponFee;
            return this;
        }
        public Double getNegotiationCouponFee() {
            return this.negotiationCouponFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setOilFee(Double oilFee) {
            this.oilFee = oilFee;
            return this;
        }
        public Double getOilFee() {
            return this.oilFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPersonSettlePrice(Double personSettlePrice) {
            this.personSettlePrice = personSettlePrice;
            return this;
        }
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPreBookTip(String preBookTip) {
            this.preBookTip = preBookTip;
            return this;
        }
        public String getPreBookTip() {
            return this.preBookTip;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundResult(String refundResult) {
            this.refundResult = refundResult;
            return this;
        }
        public String getRefundResult() {
            return this.refundResult;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRefundUpgradeCost(Double refundUpgradeCost) {
            this.refundUpgradeCost = refundUpgradeCost;
            return this;
        }
        public Double getRefundUpgradeCost() {
            return this.refundUpgradeCost;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setRepeatRefund(String repeatRefund) {
            this.repeatRefund = repeatRefund;
            return this;
        }
        public String getRepeatRefund() {
            return this.repeatRefund;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSealPrice(Double sealPrice) {
            this.sealPrice = sealPrice;
            return this;
        }
        public Double getSealPrice() {
            return this.sealPrice;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTrade(String trade) {
            this.trade = trade;
            return this;
        }
        public String getTrade() {
            return this.trade;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setUpgradeCost(Double upgradeCost) {
            this.upgradeCost = upgradeCost;
            return this;
        }
        public Double getUpgradeCost() {
            return this.upgradeCost;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public FlightBillSettlementQueryResponseBodyModuleDataList setVoyageName(String voyageName) {
            this.voyageName = voyageName;
            return this;
        }
        public String getVoyageName() {
            return this.voyageName;
        }

    }

    public static class FlightBillSettlementQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<FlightBillSettlementQueryResponseBodyModuleDataList> dataList;

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
         * <p>5180</p>
         */
        @NameInMap("total_num")
        public Long totalNum;

        public static FlightBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FlightBillSettlementQueryResponseBodyModule self = new FlightBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FlightBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public FlightBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FlightBillSettlementQueryResponseBodyModule setDataList(java.util.List<FlightBillSettlementQueryResponseBodyModuleDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<FlightBillSettlementQueryResponseBodyModuleDataList> getDataList() {
            return this.dataList;
        }

        public FlightBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public FlightBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public FlightBillSettlementQueryResponseBodyModule setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
