// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainBillSettlementQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public TrainBillSettlementQueryResponseBodyModule module;

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

    public static TrainBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TrainBillSettlementQueryResponseBody self = new TrainBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public TrainBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TrainBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TrainBillSettlementQueryResponseBody setModule(TrainBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public TrainBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public TrainBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TrainBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public TrainBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class TrainBillSettlementQueryResponseBodyModuleDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2021123432260</p>
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
         * <p>103189557</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        @NameInMap("arr_city_name")
        public String arrCityName;

        /**
         * <strong>example:</strong>
         * <p>2021-10-13</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("arr_station")
        public String arrStation;

        /**
         * <strong>example:</strong>
         * <p>12:30</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("bill_record_time")
        public String billRecordTime;

        /**
         * <strong>example:</strong>
         * <p>2021-10-08 23:38:55</p>
         */
        @NameInMap("book_time")
        public String bookTime;

        /**
         * <strong>example:</strong>
         * <p>al_xinuan.zsy</p>
         */
        @NameInMap("booker_id")
        public String bookerId;

        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        @NameInMap("business_trip_result")
        public String businessTripResult;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        @NameInMap("change_affiliate_no")
        public String changeAffiliateNo;

        @NameInMap("change_apply_id")
        public String changeApplyId;

        /**
         * <strong>example:</strong>
         * <p>23.0</p>
         */
        @NameInMap("change_fee")
        public Double changeFee;

        @NameInMap("change_result")
        public String changeResult;

        @NameInMap("coach_no")
        public String coachNo;

        @NameInMap("cost_center")
        public String costCenter;

        /**
         * <strong>example:</strong>
         * <p>T85</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("coupon")
        public Double coupon;

        @NameInMap("dep_city_code")
        public String depCityCode;

        @NameInMap("dep_city_name")
        public String depCityName;

        @NameInMap("department")
        public String department;

        @NameInMap("department_id")
        public String departmentId;

        /**
         * <strong>example:</strong>
         * <p>2021-10-14</p>
         */
        @NameInMap("dept_date")
        public String deptDate;

        @NameInMap("dept_station")
        public String deptStation;

        /**
         * <strong>example:</strong>
         * <p>09:44</p>
         */
        @NameInMap("dept_time")
        public String deptTime;

        @NameInMap("exceed_reason")
        public String exceedReason;

        /**
         * <strong>example:</strong>
         * <p>6001</p>
         */
        @NameInMap("fee_type")
        public String feeType;

        /**
         * <strong>example:</strong>
         * <p>4740293</p>
         */
        @NameInMap("index")
        public String index;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("is_transfer_order")
        public String isTransferOrder;

        /**
         * <strong>example:</strong>
         * <p>23432692343243432</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>350</p>
         */
        @NameInMap("order_price")
        public Double orderPrice;

        /**
         * <strong>example:</strong>
         * <p>534545345</p>
         */
        @NameInMap("over_apply_id")
        public String overApplyId;

        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        /**
         * <strong>example:</strong>
         * <p>4740293</p>
         */
        @NameInMap("primary_id")
        public Long primaryId;

        @NameInMap("print_ticket_price")
        public Double printTicketPrice;

        /**
         * <strong>example:</strong>
         * <p>2345235435</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("refund_affiliate_no")
        public String refundAffiliateNo;

        @NameInMap("refund_apply_id")
        public String refundApplyId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("refund_fee")
        public Double refundFee;

        @NameInMap("refund_reason")
        public String refundReason;

        @NameInMap("remark")
        public String remark;

        @NameInMap("reserve_mode")
        public String reserveMode;

        @NameInMap("run_time")
        public String runTime;

        /**
         * <strong>example:</strong>
         * <p>004F</p>
         */
        @NameInMap("seat_no")
        public String seatNo;

        @NameInMap("seat_type")
        public String seatType;

        /**
         * <strong>example:</strong>
         * <p>23.0</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        /**
         * <strong>example:</strong>
         * <p>350</p>
         */
        @NameInMap("settlement_fee")
        public Double settlementFee;

        /**
         * <strong>example:</strong>
         * <p>4.56</p>
         */
        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        /**
         * <strong>example:</strong>
         * <p>2021-10-08 23:39:01</p>
         */
        @NameInMap("settlement_time")
        public String settlementTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("settlement_type")
        public String settlementType;

        @NameInMap("short_ticket_no")
        public String shortTicketNo;

        @NameInMap("speed_package_fee")
        public Double speedPackageFee;

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

        @NameInMap("ticket_corp_pay_price")
        public String ticketCorpPayPrice;

        /**
         * <strong>example:</strong>
         * <p>2115242342342424067354</p>
         */
        @NameInMap("ticket_no")
        public String ticketNo;

        @NameInMap("ticket_person_pay_price")
        public String ticketPersonPayPrice;

        /**
         * <strong>example:</strong>
         * <p>350</p>
         */
        @NameInMap("ticket_price")
        public Double ticketPrice;

        /**
         * <strong>example:</strong>
         * <p>G906</p>
         */
        @NameInMap("train_no")
        public String trainNo;

        @NameInMap("train_type")
        public String trainType;

        @NameInMap("traveler_id")
        public String travelerId;

        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        @NameInMap("traveler_member_type_name")
        public String travelerMemberTypeName;

        @NameInMap("traveler_name")
        public String travelerName;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("voucher_type")
        public Integer voucherType;

        public static TrainBillSettlementQueryResponseBodyModuleDataList build(java.util.Map<String, ?> map) throws Exception {
            TrainBillSettlementQueryResponseBodyModuleDataList self = new TrainBillSettlementQueryResponseBodyModuleDataList();
            return TeaModel.build(map, self);
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setArrCityName(String arrCityName) {
            this.arrCityName = arrCityName;
            return this;
        }
        public String getArrCityName() {
            return this.arrCityName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setArrStation(String arrStation) {
            this.arrStation = arrStation;
            return this;
        }
        public String getArrStation() {
            return this.arrStation;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setBusinessTripResult(String businessTripResult) {
            this.businessTripResult = businessTripResult;
            return this;
        }
        public String getBusinessTripResult() {
            return this.businessTripResult;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setChangeAffiliateNo(String changeAffiliateNo) {
            this.changeAffiliateNo = changeAffiliateNo;
            return this;
        }
        public String getChangeAffiliateNo() {
            return this.changeAffiliateNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setChangeApplyId(String changeApplyId) {
            this.changeApplyId = changeApplyId;
            return this;
        }
        public String getChangeApplyId() {
            return this.changeApplyId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setChangeFee(Double changeFee) {
            this.changeFee = changeFee;
            return this;
        }
        public Double getChangeFee() {
            return this.changeFee;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setChangeResult(String changeResult) {
            this.changeResult = changeResult;
            return this;
        }
        public String getChangeResult() {
            return this.changeResult;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setCoachNo(String coachNo) {
            this.coachNo = coachNo;
            return this;
        }
        public String getCoachNo() {
            return this.coachNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setCoupon(Double coupon) {
            this.coupon = coupon;
            return this;
        }
        public Double getCoupon() {
            return this.coupon;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setDepCityName(String depCityName) {
            this.depCityName = depCityName;
            return this;
        }
        public String getDepCityName() {
            return this.depCityName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setDeptDate(String deptDate) {
            this.deptDate = deptDate;
            return this;
        }
        public String getDeptDate() {
            return this.deptDate;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setDeptStation(String deptStation) {
            this.deptStation = deptStation;
            return this;
        }
        public String getDeptStation() {
            return this.deptStation;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setDeptTime(String deptTime) {
            this.deptTime = deptTime;
            return this;
        }
        public String getDeptTime() {
            return this.deptTime;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setExceedReason(String exceedReason) {
            this.exceedReason = exceedReason;
            return this;
        }
        public String getExceedReason() {
            return this.exceedReason;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setIsTransferOrder(String isTransferOrder) {
            this.isTransferOrder = isTransferOrder;
            return this;
        }
        public String getIsTransferOrder() {
            return this.isTransferOrder;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setOrderPrice(Double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setPrintTicketPrice(Double printTicketPrice) {
            this.printTicketPrice = printTicketPrice;
            return this;
        }
        public Double getPrintTicketPrice() {
            return this.printTicketPrice;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setRefundAffiliateNo(String refundAffiliateNo) {
            this.refundAffiliateNo = refundAffiliateNo;
            return this;
        }
        public String getRefundAffiliateNo() {
            return this.refundAffiliateNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setRefundApplyId(String refundApplyId) {
            this.refundApplyId = refundApplyId;
            return this;
        }
        public String getRefundApplyId() {
            return this.refundApplyId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setRefundFee(Double refundFee) {
            this.refundFee = refundFee;
            return this;
        }
        public Double getRefundFee() {
            return this.refundFee;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setRefundReason(String refundReason) {
            this.refundReason = refundReason;
            return this;
        }
        public String getRefundReason() {
            return this.refundReason;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setReserveMode(String reserveMode) {
            this.reserveMode = reserveMode;
            return this;
        }
        public String getReserveMode() {
            return this.reserveMode;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setRunTime(String runTime) {
            this.runTime = runTime;
            return this;
        }
        public String getRunTime() {
            return this.runTime;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setSeatNo(String seatNo) {
            this.seatNo = seatNo;
            return this;
        }
        public String getSeatNo() {
            return this.seatNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setSeatType(String seatType) {
            this.seatType = seatType;
            return this;
        }
        public String getSeatType() {
            return this.seatType;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setShortTicketNo(String shortTicketNo) {
            this.shortTicketNo = shortTicketNo;
            return this;
        }
        public String getShortTicketNo() {
            return this.shortTicketNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setSpeedPackageFee(Double speedPackageFee) {
            this.speedPackageFee = speedPackageFee;
            return this;
        }
        public Double getSpeedPackageFee() {
            return this.speedPackageFee;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTicketCorpPayPrice(String ticketCorpPayPrice) {
            this.ticketCorpPayPrice = ticketCorpPayPrice;
            return this;
        }
        public String getTicketCorpPayPrice() {
            return this.ticketCorpPayPrice;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTicketNo(String ticketNo) {
            this.ticketNo = ticketNo;
            return this;
        }
        public String getTicketNo() {
            return this.ticketNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTicketPersonPayPrice(String ticketPersonPayPrice) {
            this.ticketPersonPayPrice = ticketPersonPayPrice;
            return this;
        }
        public String getTicketPersonPayPrice() {
            return this.ticketPersonPayPrice;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTicketPrice(Double ticketPrice) {
            this.ticketPrice = ticketPrice;
            return this;
        }
        public Double getTicketPrice() {
            return this.ticketPrice;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTrainNo(String trainNo) {
            this.trainNo = trainNo;
            return this;
        }
        public String getTrainNo() {
            return this.trainNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTrainType(String trainType) {
            this.trainType = trainType;
            return this;
        }
        public String getTrainType() {
            return this.trainType;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public TrainBillSettlementQueryResponseBodyModuleDataList setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

    }

    public static class TrainBillSettlementQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<TrainBillSettlementQueryResponseBodyModuleDataList> dataList;

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
         * <p>2694</p>
         */
        @NameInMap("total_num")
        public Long totalNum;

        public static TrainBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            TrainBillSettlementQueryResponseBodyModule self = new TrainBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public TrainBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public TrainBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public TrainBillSettlementQueryResponseBodyModule setDataList(java.util.List<TrainBillSettlementQueryResponseBodyModuleDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<TrainBillSettlementQueryResponseBodyModuleDataList> getDataList() {
            return this.dataList;
        }

        public TrainBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public TrainBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public TrainBillSettlementQueryResponseBodyModule setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
