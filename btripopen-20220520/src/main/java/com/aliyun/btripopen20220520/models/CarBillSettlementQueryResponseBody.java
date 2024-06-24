// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarBillSettlementQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CarBillSettlementQueryResponseBodyModule module;

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

    public static CarBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CarBillSettlementQueryResponseBody self = new CarBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CarBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CarBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CarBillSettlementQueryResponseBody setModule(CarBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public CarBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public CarBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CarBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CarBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class CarBillSettlementQueryResponseBodyModuleDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>34534543545345</p>
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

        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_city_code")
        public String arrCityCode;

        /**
         * <strong>example:</strong>
         * <p>2022-07-02</p>
         */
        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("arr_location")
        public String arrLocation;

        /**
         * <strong>example:</strong>
         * <p>13:51:43</p>
         */
        @NameInMap("arr_time")
        public String arrTime;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15T22:27Z</p>
         */
        @NameInMap("bill_record_time")
        public String billRecordTime;

        @NameInMap("book_model")
        public String bookModel;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15 22:27:00</p>
         */
        @NameInMap("book_time")
        public String bookTime;

        @NameInMap("booker_id")
        public String bookerId;

        /**
         * <strong>example:</strong>
         * <p>70022164</p>
         */
        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        @NameInMap("business_category")
        public String businessCategory;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("car_level")
        public String carLevel;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        @NameInMap("cost_center")
        public String costCenter;

        /**
         * <strong>example:</strong>
         * <p>2391-CN90.150</p>
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
         * <p>12.7</p>
         */
        @NameInMap("coupon_price")
        public Double couponPrice;

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
         * <p>2021-10-13</p>
         */
        @NameInMap("dept_date")
        public String deptDate;

        @NameInMap("dept_location")
        public String deptLocation;

        /**
         * <strong>example:</strong>
         * <p>13:46:05</p>
         */
        @NameInMap("dept_time")
        public String deptTime;

        @NameInMap("driver_add_detail")
        public String driverAddDetail;

        @NameInMap("driver_add_fee")
        public Double driverAddFee;

        /**
         * <strong>example:</strong>
         * <p>29.07</p>
         */
        @NameInMap("estimate_drive_distance")
        public String estimateDriveDistance;

        /**
         * <strong>example:</strong>
         * <p>69</p>
         */
        @NameInMap("estimate_price")
        public Double estimatePrice;

        /**
         * <strong>example:</strong>
         * <p>40107</p>
         */
        @NameInMap("fee_type")
        public String feeType;

        /**
         * <strong>example:</strong>
         * <p>4988580</p>
         */
        @NameInMap("index")
        public String index;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("level_name")
        public String levelName;

        @NameInMap("memo")
        public String memo;

        /**
         * <strong>example:</strong>
         * <p>110285961234324</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>12.7</p>
         */
        @NameInMap("order_price")
        public Double orderPrice;

        /**
         * <strong>example:</strong>
         * <p>34535465346</p>
         */
        @NameInMap("over_apply_id")
        public String overApplyId;

        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("person_settle_fee")
        public Double personSettleFee;

        /**
         * <strong>example:</strong>
         * <p>4988580</p>
         */
        @NameInMap("primary_id")
        public Long primaryId;

        /**
         * <strong>example:</strong>
         * <p>23423432423</p>
         */
        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("provider_name")
        public String providerName;

        /**
         * <strong>example:</strong>
         * <p>0.00</p>
         */
        @NameInMap("real_drive_distance")
        public String realDriveDistance;

        @NameInMap("real_from_addr")
        public String realFromAddr;

        @NameInMap("real_to_addr")
        public String realToAddr;

        @NameInMap("remark")
        public String remark;

        /**
         * <strong>example:</strong>
         * <p>12.7</p>
         */
        @NameInMap("service_fee")
        public Double serviceFee;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("settlement_fee")
        public Double settlementFee;

        /**
         * <strong>example:</strong>
         * <p>6.11</p>
         */
        @NameInMap("settlement_grant_fee")
        public Double settlementGrantFee;

        /**
         * <strong>example:</strong>
         * <p>2022-05-15 22:27:00</p>
         */
        @NameInMap("settlement_time")
        public String settlementTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("settlement_type")
        public String settlementType;

        @NameInMap("special_order")
        public String specialOrder;

        @NameInMap("special_reason")
        public String specialReason;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>123123232</p>
         */
        @NameInMap("sub_order_id")
        public String subOrderId;

        @NameInMap("supplement_apply_id")
        public String supplementApplyId;

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

        @NameInMap("time_type")
        public String timeType;

        @NameInMap("traveler_id")
        public String travelerId;

        /**
         * <strong>example:</strong>
         * <p>70022164</p>
         */
        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        @NameInMap("traveler_member_type_name")
        public String travelerMemberTypeName;

        @NameInMap("traveler_name")
        public String travelerName;

        @NameInMap("user_confirm_desc")
        public String userConfirmDesc;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("voucher_type")
        public Integer voucherType;

        public static CarBillSettlementQueryResponseBodyModuleDataList build(java.util.Map<String, ?> map) throws Exception {
            CarBillSettlementQueryResponseBodyModuleDataList self = new CarBillSettlementQueryResponseBodyModuleDataList();
            return TeaModel.build(map, self);
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setArrCity(String arrCity) {
            this.arrCity = arrCity;
            return this;
        }
        public String getArrCity() {
            return this.arrCity;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setArrCityCode(String arrCityCode) {
            this.arrCityCode = arrCityCode;
            return this;
        }
        public String getArrCityCode() {
            return this.arrCityCode;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setArrDate(String arrDate) {
            this.arrDate = arrDate;
            return this;
        }
        public String getArrDate() {
            return this.arrDate;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setArrLocation(String arrLocation) {
            this.arrLocation = arrLocation;
            return this;
        }
        public String getArrLocation() {
            return this.arrLocation;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setArrTime(String arrTime) {
            this.arrTime = arrTime;
            return this;
        }
        public String getArrTime() {
            return this.arrTime;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setBookModel(String bookModel) {
            this.bookModel = bookModel;
            return this;
        }
        public String getBookModel() {
            return this.bookModel;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setBusinessCategory(String businessCategory) {
            this.businessCategory = businessCategory;
            return this;
        }
        public String getBusinessCategory() {
            return this.businessCategory;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setCarLevel(String carLevel) {
            this.carLevel = carLevel;
            return this;
        }
        public String getCarLevel() {
            return this.carLevel;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setCoupon(Double coupon) {
            this.coupon = coupon;
            return this;
        }
        public Double getCoupon() {
            return this.coupon;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setCouponPrice(Double couponPrice) {
            this.couponPrice = couponPrice;
            return this;
        }
        public Double getCouponPrice() {
            return this.couponPrice;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDepCityCode(String depCityCode) {
            this.depCityCode = depCityCode;
            return this;
        }
        public String getDepCityCode() {
            return this.depCityCode;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDeptCity(String deptCity) {
            this.deptCity = deptCity;
            return this;
        }
        public String getDeptCity() {
            return this.deptCity;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDeptDate(String deptDate) {
            this.deptDate = deptDate;
            return this;
        }
        public String getDeptDate() {
            return this.deptDate;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDeptLocation(String deptLocation) {
            this.deptLocation = deptLocation;
            return this;
        }
        public String getDeptLocation() {
            return this.deptLocation;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDeptTime(String deptTime) {
            this.deptTime = deptTime;
            return this;
        }
        public String getDeptTime() {
            return this.deptTime;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDriverAddDetail(String driverAddDetail) {
            this.driverAddDetail = driverAddDetail;
            return this;
        }
        public String getDriverAddDetail() {
            return this.driverAddDetail;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setDriverAddFee(Double driverAddFee) {
            this.driverAddFee = driverAddFee;
            return this;
        }
        public Double getDriverAddFee() {
            return this.driverAddFee;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setEstimateDriveDistance(String estimateDriveDistance) {
            this.estimateDriveDistance = estimateDriveDistance;
            return this;
        }
        public String getEstimateDriveDistance() {
            return this.estimateDriveDistance;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setEstimatePrice(Double estimatePrice) {
            this.estimatePrice = estimatePrice;
            return this;
        }
        public Double getEstimatePrice() {
            return this.estimatePrice;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setLevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }
        public String getLevelName() {
            return this.levelName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setOrderPrice(Double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setPersonSettleFee(Double personSettleFee) {
            this.personSettleFee = personSettleFee;
            return this;
        }
        public Double getPersonSettleFee() {
            return this.personSettleFee;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setProviderName(String providerName) {
            this.providerName = providerName;
            return this;
        }
        public String getProviderName() {
            return this.providerName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setRealDriveDistance(String realDriveDistance) {
            this.realDriveDistance = realDriveDistance;
            return this;
        }
        public String getRealDriveDistance() {
            return this.realDriveDistance;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setRealFromAddr(String realFromAddr) {
            this.realFromAddr = realFromAddr;
            return this;
        }
        public String getRealFromAddr() {
            return this.realFromAddr;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setRealToAddr(String realToAddr) {
            this.realToAddr = realToAddr;
            return this;
        }
        public String getRealToAddr() {
            return this.realToAddr;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setSpecialOrder(String specialOrder) {
            this.specialOrder = specialOrder;
            return this;
        }
        public String getSpecialOrder() {
            return this.specialOrder;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setSpecialReason(String specialReason) {
            this.specialReason = specialReason;
            return this;
        }
        public String getSpecialReason() {
            return this.specialReason;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setSupplementApplyId(String supplementApplyId) {
            this.supplementApplyId = supplementApplyId;
            return this;
        }
        public String getSupplementApplyId() {
            return this.supplementApplyId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setUserConfirmDesc(String userConfirmDesc) {
            this.userConfirmDesc = userConfirmDesc;
            return this;
        }
        public String getUserConfirmDesc() {
            return this.userConfirmDesc;
        }

        public CarBillSettlementQueryResponseBodyModuleDataList setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

    }

    public static class CarBillSettlementQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<CarBillSettlementQueryResponseBodyModuleDataList> dataList;

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
         * <p>2695</p>
         */
        @NameInMap("total_num")
        public Long totalNum;

        public static CarBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            CarBillSettlementQueryResponseBodyModule self = new CarBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public CarBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public CarBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public CarBillSettlementQueryResponseBodyModule setDataList(java.util.List<CarBillSettlementQueryResponseBodyModuleDataList> dataList) {
            this.dataList = dataList;
            return this;
        }
        public java.util.List<CarBillSettlementQueryResponseBodyModuleDataList> getDataList() {
            return this.dataList;
        }

        public CarBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public CarBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public CarBillSettlementQueryResponseBodyModule setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
