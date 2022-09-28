// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CarBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public CarBillSettlementQueryResponseBodyModule module;

    @NameInMap("result_code")
    public Integer resultCode;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static CarBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CarBillSettlementQueryResponseBody self = new CarBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public CarBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public CarBillSettlementQueryResponseBody setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public Integer getResultCode() {
        return this.resultCode;
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
        @NameInMap("alipay_trade_no")
        public String alipayTradeNo;

        @NameInMap("apply_id")
        public String applyId;

        @NameInMap("arr_city")
        public String arrCity;

        @NameInMap("arr_date")
        public String arrDate;

        @NameInMap("arr_location")
        public String arrLocation;

        @NameInMap("arr_time")
        public String arrTime;

        @NameInMap("bill_record_time")
        public String billRecordTime;

        @NameInMap("book_time")
        public String bookTime;

        @NameInMap("booker_id")
        public String bookerId;

        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        @NameInMap("business_category")
        public String businessCategory;

        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("car_level")
        public String carLevel;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("coupon")
        public Double coupon;

        @NameInMap("coupon_price")
        public Double couponPrice;

        @NameInMap("department")
        public String department;

        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("dept_city")
        public String deptCity;

        @NameInMap("dept_date")
        public String deptDate;

        @NameInMap("dept_location")
        public String deptLocation;

        @NameInMap("dept_time")
        public String deptTime;

        @NameInMap("estimate_drive_distance")
        public String estimateDriveDistance;

        @NameInMap("estimate_price")
        public Double estimatePrice;

        @NameInMap("fee_type")
        public String feeType;

        @NameInMap("index")
        public String index;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("memo")
        public String memo;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_price")
        public Double orderPrice;

        @NameInMap("over_apply_id")
        public String overApplyId;

        @NameInMap("person_settle_fee")
        public Double personSettleFee;

        @NameInMap("primary_id")
        public Long primaryId;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("provider_name")
        public String providerName;

        @NameInMap("real_drive_distance")
        public String realDriveDistance;

        @NameInMap("real_from_addr")
        public String realFromAddr;

        @NameInMap("real_to_addr")
        public String realToAddr;

        @NameInMap("remark")
        public String remark;

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

        @NameInMap("special_order")
        public String specialOrder;

        @NameInMap("special_reason")
        public String specialReason;

        @NameInMap("status")
        public Integer status;

        @NameInMap("sub_order_id")
        public String subOrderId;

        @NameInMap("traveler_id")
        public String travelerId;

        @NameInMap("traveler_job_no")
        public String travelerJobNo;

        @NameInMap("traveler_name")
        public String travelerName;

        @NameInMap("user_confirm_desc")
        public String userConfirmDesc;

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
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("data_list")
        public java.util.List<CarBillSettlementQueryResponseBodyModuleDataList> dataList;

        @NameInMap("period_end")
        public String periodEnd;

        @NameInMap("period_start")
        public String periodStart;

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
