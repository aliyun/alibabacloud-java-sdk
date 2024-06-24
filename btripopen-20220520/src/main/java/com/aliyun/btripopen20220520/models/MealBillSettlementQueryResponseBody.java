// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class MealBillSettlementQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public Integer code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public MealBillSettlementQueryResponseBodyModule module;

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
     * <p>210f079e16603757182131635d866a</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static MealBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MealBillSettlementQueryResponseBody self = new MealBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public MealBillSettlementQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public MealBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MealBillSettlementQueryResponseBody setModule(MealBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public MealBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public MealBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MealBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MealBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class MealBillSettlementQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("apply_extend_field")
        public String applyExtendField;

        /**
         * <strong>example:</strong>
         * <p>1004430880</p>
         */
        @NameInMap("apply_id")
        public String applyId;

        /**
         * <strong>example:</strong>
         * <p>2023-01-01 00:00:00</p>
         */
        @NameInMap("bill_record_time")
        public String billRecordTime;

        /**
         * <strong>example:</strong>
         * <p>2023-01-01 00:00:00</p>
         */
        @NameInMap("book_time")
        public String bookTime;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("booker_id")
        public String bookerId;

        /**
         * <strong>example:</strong>
         * <p>A1234</p>
         */
        @NameInMap("booker_job_no")
        public String bookerJobNo;

        @NameInMap("booker_name")
        public String bookerName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        @NameInMap("consume_report_address")
        public String consumeReportAddress;

        @NameInMap("consume_report_city")
        public String consumeReportCity;

        @NameInMap("consume_report_city_code")
        public String consumeReportCityCode;

        @NameInMap("consumer_scene")
        public String consumerScene;

        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("corp_settle_fee")
        public Double corpSettleFee;

        @NameInMap("cost_center")
        public String costCenter;

        /**
         * <strong>example:</strong>
         * <p>cs1</p>
         */
        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("department")
        public String department;

        /**
         * <strong>example:</strong>
         * <p>1112</p>
         */
        @NameInMap("department_id")
        public String departmentId;

        /**
         * <strong>example:</strong>
         * <p>70101</p>
         */
        @NameInMap("fee_type")
        public String feeType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("index")
        public String index;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("main_apply_id")
        public String mainApplyId;

        /**
         * <strong>example:</strong>
         * <p>XXXX</p>
         */
        @NameInMap("meal_address")
        public String mealAddress;

        @NameInMap("meal_city")
        public String mealCity;

        /**
         * <strong>example:</strong>
         * <p>XXX</p>
         */
        @NameInMap("meal_city_code")
        public String mealCityCode;

        @NameInMap("meal_rule")
        public String mealRule;

        @NameInMap("meal_scene")
        public String mealScene;

        /**
         * <strong>example:</strong>
         * <p>MEAL</p>
         */
        @NameInMap("merchant_category")
        public String merchantCategory;

        /**
         * <strong>example:</strong>
         * <p>XXXX</p>
         */
        @NameInMap("merchant_name")
        public String merchantName;

        /**
         * <strong>example:</strong>
         * <p>1002039196909288346</p>
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

        /**
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("person_settle_price")
        public Double personSettlePrice;

        /**
         * <strong>example:</strong>
         * <p>60698599</p>
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

        @NameInMap("remark")
        public String remark;

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
         * <p>2023-01-01 00:00:00</p>
         */
        @NameInMap("settlement_time")
        public String settlementTime;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("settlement_type")
        public String settlementType;

        @NameInMap("share_dinner")
        public String shareDinner;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>XXXX</p>
         */
        @NameInMap("store_address")
        public String storeAddress;

        /**
         * <strong>example:</strong>
         * <p>6%</p>
         */
        @NameInMap("tax_rate")
        public String taxRate;

        /**
         * <strong>example:</strong>
         * <p>cs2</p>
         */
        @NameInMap("third_invoice_id")
        public String thirdInvoiceId;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("third_part_business_id")
        public String thirdPartBusinessId;

        /**
         * <strong>example:</strong>
         * <p>7244-1968</p>
         */
        @NameInMap("thirdpart_apply_id")
        public String thirdpartApplyId;

        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("traveler_id")
        public String travelerId;

        /**
         * <strong>example:</strong>
         * <p>A1234</p>
         */
        @NameInMap("traveler_job_no")
        public String travelerJobNo;

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

        public static MealBillSettlementQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            MealBillSettlementQueryResponseBodyModuleItems self = new MealBillSettlementQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public MealBillSettlementQueryResponseBodyModuleItems setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setConsumeReportAddress(String consumeReportAddress) {
            this.consumeReportAddress = consumeReportAddress;
            return this;
        }
        public String getConsumeReportAddress() {
            return this.consumeReportAddress;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setConsumeReportCity(String consumeReportCity) {
            this.consumeReportCity = consumeReportCity;
            return this;
        }
        public String getConsumeReportCity() {
            return this.consumeReportCity;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setConsumeReportCityCode(String consumeReportCityCode) {
            this.consumeReportCityCode = consumeReportCityCode;
            return this;
        }
        public String getConsumeReportCityCode() {
            return this.consumeReportCityCode;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setConsumerScene(String consumerScene) {
            this.consumerScene = consumerScene;
            return this;
        }
        public String getConsumerScene() {
            return this.consumerScene;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setCorpSettleFee(Double corpSettleFee) {
            this.corpSettleFee = corpSettleFee;
            return this;
        }
        public Double getCorpSettleFee() {
            return this.corpSettleFee;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setMainApplyId(String mainApplyId) {
            this.mainApplyId = mainApplyId;
            return this;
        }
        public String getMainApplyId() {
            return this.mainApplyId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setMealAddress(String mealAddress) {
            this.mealAddress = mealAddress;
            return this;
        }
        public String getMealAddress() {
            return this.mealAddress;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setMealCity(String mealCity) {
            this.mealCity = mealCity;
            return this;
        }
        public String getMealCity() {
            return this.mealCity;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setMealCityCode(String mealCityCode) {
            this.mealCityCode = mealCityCode;
            return this;
        }
        public String getMealCityCode() {
            return this.mealCityCode;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setMealRule(String mealRule) {
            this.mealRule = mealRule;
            return this;
        }
        public String getMealRule() {
            return this.mealRule;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setMealScene(String mealScene) {
            this.mealScene = mealScene;
            return this;
        }
        public String getMealScene() {
            return this.mealScene;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setMerchantCategory(String merchantCategory) {
            this.merchantCategory = merchantCategory;
            return this;
        }
        public String getMerchantCategory() {
            return this.merchantCategory;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setMerchantName(String merchantName) {
            this.merchantName = merchantName;
            return this;
        }
        public String getMerchantName() {
            return this.merchantName;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setOrderPrice(Double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setPersonSettlePrice(Double personSettlePrice) {
            this.personSettlePrice = personSettlePrice;
            return this;
        }
        public Double getPersonSettlePrice() {
            return this.personSettlePrice;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setServiceFee(Double serviceFee) {
            this.serviceFee = serviceFee;
            return this;
        }
        public Double getServiceFee() {
            return this.serviceFee;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setShareDinner(String shareDinner) {
            this.shareDinner = shareDinner;
            return this;
        }
        public String getShareDinner() {
            return this.shareDinner;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setStoreAddress(String storeAddress) {
            this.storeAddress = storeAddress;
            return this;
        }
        public String getStoreAddress() {
            return this.storeAddress;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setThirdInvoiceId(String thirdInvoiceId) {
            this.thirdInvoiceId = thirdInvoiceId;
            return this;
        }
        public String getThirdInvoiceId() {
            return this.thirdInvoiceId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setThirdPartBusinessId(String thirdPartBusinessId) {
            this.thirdPartBusinessId = thirdPartBusinessId;
            return this;
        }
        public String getThirdPartBusinessId() {
            return this.thirdPartBusinessId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setThirdpartApplyId(String thirdpartApplyId) {
            this.thirdpartApplyId = thirdpartApplyId;
            return this;
        }
        public String getThirdpartApplyId() {
            return this.thirdpartApplyId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public MealBillSettlementQueryResponseBodyModuleItems setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

    }

    public static class MealBillSettlementQueryResponseBodyModule extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("items")
        public java.util.List<MealBillSettlementQueryResponseBodyModuleItems> items;

        /**
         * <strong>example:</strong>
         * <p>1002039195025156700</p>
         */
        @NameInMap("order_id")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>2022-07-02</p>
         */
        @NameInMap("period_end")
        public String periodEnd;

        /**
         * <strong>example:</strong>
         * <p>2022-07-01</p>
         */
        @NameInMap("period_start")
        public String periodStart;

        /**
         * <strong>example:</strong>
         * <p>2695</p>
         */
        @NameInMap("total_num")
        public Long totalNum;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("total_size")
        public Long totalSize;

        public static MealBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            MealBillSettlementQueryResponseBodyModule self = new MealBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public MealBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public MealBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public MealBillSettlementQueryResponseBodyModule setItems(java.util.List<MealBillSettlementQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<MealBillSettlementQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public MealBillSettlementQueryResponseBodyModule setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public MealBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public MealBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public MealBillSettlementQueryResponseBodyModule setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

        public MealBillSettlementQueryResponseBodyModule setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
