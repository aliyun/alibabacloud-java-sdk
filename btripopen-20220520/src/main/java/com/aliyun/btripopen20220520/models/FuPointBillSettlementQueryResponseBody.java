// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class FuPointBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("module")
    public FuPointBillSettlementQueryResponseBodyModule module;

    @NameInMap("more_page")
    public Boolean morePage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static FuPointBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FuPointBillSettlementQueryResponseBody self = new FuPointBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public FuPointBillSettlementQueryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public FuPointBillSettlementQueryResponseBody setModule(FuPointBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public FuPointBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public FuPointBillSettlementQueryResponseBody setMorePage(Boolean morePage) {
        this.morePage = morePage;
        return this;
    }
    public Boolean getMorePage() {
        return this.morePage;
    }

    public FuPointBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FuPointBillSettlementQueryResponseBody setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public FuPointBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public FuPointBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class FuPointBillSettlementQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("adjust_time")
        public String adjustTime;

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

        @NameInMap("approver_email")
        public String approverEmail;

        @NameInMap("approver_id")
        public String approverId;

        @NameInMap("approver_name")
        public String approverName;

        @NameInMap("award_num")
        public Double awardNum;

        @NameInMap("basis_amount")
        public String basisAmount;

        @NameInMap("bill_record_time")
        public String billRecordTime;

        @NameInMap("billing_entity")
        public String billingEntity;

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

        @NameInMap("capital_direction")
        public String capitalDirection;

        @NameInMap("cascade_department")
        public String cascadeDepartment;

        @NameInMap("category_desc")
        public String categoryDesc;

        @NameInMap("category_order_settle_price")
        public String categoryOrderSettlePrice;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("cost_department")
        public String costDepartment;

        @NameInMap("deductible_tax")
        public Double deductibleTax;

        @NameInMap("department")
        public String department;

        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("fee_type")
        public String feeType;

        @NameInMap("fee_type_desc")
        public String feeTypeDesc;

        @NameInMap("foreigners_tag")
        public String foreignersTag;

        @NameInMap("grant_num")
        public Double grantNum;

        @NameInMap("index")
        public String index;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("location")
        public String location;

        @NameInMap("make_invoice")
        public String makeInvoice;

        @NameInMap("mapping_company_code")
        public String mappingCompanyCode;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

        @NameInMap("origin_category")
        public String originCategory;

        @NameInMap("origin_order_id")
        public String originOrderId;

        @NameInMap("over_apply_id")
        public String overApplyId;

        @NameInMap("payment_department_id")
        public String paymentDepartmentId;

        @NameInMap("payment_department_name")
        public String paymentDepartmentName;

        @NameInMap("primary_id")
        public Long primaryId;

        @NameInMap("processor_oa_code")
        public String processorOaCode;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("purchase_order_id")
        public String purchaseOrderId;

        @NameInMap("remark")
        public String remark;

        @NameInMap("save_amount")
        public Double saveAmount;

        @NameInMap("scene_id")
        public String sceneId;

        @NameInMap("scene_name")
        public String sceneName;

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

        @NameInMap("show_sub_order_id")
        public String showSubOrderId;

        @NameInMap("sio")
        public String sio;

        @NameInMap("status")
        public Integer status;

        @NameInMap("status_desc")
        public String statusDesc;

        @NameInMap("sub_order_id")
        public String subOrderId;

        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("third_invoice_id")
        public String thirdInvoiceId;

        @NameInMap("third_itinerary_id")
        public String thirdItineraryId;

        @NameInMap("trade_action_desc")
        public String tradeActionDesc;

        @NameInMap("trade_reason")
        public String tradeReason;

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

        @NameInMap("voucher_type")
        public Integer voucherType;

        @NameInMap("voucher_type_desc")
        public String voucherTypeDesc;

        public static FuPointBillSettlementQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            FuPointBillSettlementQueryResponseBodyModuleItems self = new FuPointBillSettlementQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setAdjustTime(String adjustTime) {
            this.adjustTime = adjustTime;
            return this;
        }
        public String getAdjustTime() {
            return this.adjustTime;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setAlipayId(String alipayId) {
            this.alipayId = alipayId;
            return this;
        }
        public String getAlipayId() {
            return this.alipayId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApproverEmail(String approverEmail) {
            this.approverEmail = approverEmail;
            return this;
        }
        public String getApproverEmail() {
            return this.approverEmail;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApproverId(String approverId) {
            this.approverId = approverId;
            return this;
        }
        public String getApproverId() {
            return this.approverId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setAwardNum(Double awardNum) {
            this.awardNum = awardNum;
            return this;
        }
        public Double getAwardNum() {
            return this.awardNum;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setBasisAmount(String basisAmount) {
            this.basisAmount = basisAmount;
            return this;
        }
        public String getBasisAmount() {
            return this.basisAmount;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setBillingEntity(String billingEntity) {
            this.billingEntity = billingEntity;
            return this;
        }
        public String getBillingEntity() {
            return this.billingEntity;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setBookMode(String bookMode) {
            this.bookMode = bookMode;
            return this;
        }
        public String getBookMode() {
            return this.bookMode;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setCategoryDesc(String categoryDesc) {
            this.categoryDesc = categoryDesc;
            return this;
        }
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setCategoryOrderSettlePrice(String categoryOrderSettlePrice) {
            this.categoryOrderSettlePrice = categoryOrderSettlePrice;
            return this;
        }
        public String getCategoryOrderSettlePrice() {
            return this.categoryOrderSettlePrice;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setCostDepartment(String costDepartment) {
            this.costDepartment = costDepartment;
            return this;
        }
        public String getCostDepartment() {
            return this.costDepartment;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setDeductibleTax(Double deductibleTax) {
            this.deductibleTax = deductibleTax;
            return this;
        }
        public Double getDeductibleTax() {
            return this.deductibleTax;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setFeeTypeDesc(String feeTypeDesc) {
            this.feeTypeDesc = feeTypeDesc;
            return this;
        }
        public String getFeeTypeDesc() {
            return this.feeTypeDesc;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setForeignersTag(String foreignersTag) {
            this.foreignersTag = foreignersTag;
            return this;
        }
        public String getForeignersTag() {
            return this.foreignersTag;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setGrantNum(Double grantNum) {
            this.grantNum = grantNum;
            return this;
        }
        public Double getGrantNum() {
            return this.grantNum;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setMakeInvoice(String makeInvoice) {
            this.makeInvoice = makeInvoice;
            return this;
        }
        public String getMakeInvoice() {
            return this.makeInvoice;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setMappingCompanyCode(String mappingCompanyCode) {
            this.mappingCompanyCode = mappingCompanyCode;
            return this;
        }
        public String getMappingCompanyCode() {
            return this.mappingCompanyCode;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setOriginCategory(String originCategory) {
            this.originCategory = originCategory;
            return this;
        }
        public String getOriginCategory() {
            return this.originCategory;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setOriginOrderId(String originOrderId) {
            this.originOrderId = originOrderId;
            return this;
        }
        public String getOriginOrderId() {
            return this.originOrderId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setProcessorOaCode(String processorOaCode) {
            this.processorOaCode = processorOaCode;
            return this;
        }
        public String getProcessorOaCode() {
            return this.processorOaCode;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setPurchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }
        public String getPurchaseOrderId() {
            return this.purchaseOrderId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSaveAmount(Double saveAmount) {
            this.saveAmount = saveAmount;
            return this;
        }
        public Double getSaveAmount() {
            return this.saveAmount;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSettleTypeDesc(String settleTypeDesc) {
            this.settleTypeDesc = settleTypeDesc;
            return this;
        }
        public String getSettleTypeDesc() {
            return this.settleTypeDesc;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setShowSubOrderId(String showSubOrderId) {
            this.showSubOrderId = showSubOrderId;
            return this;
        }
        public String getShowSubOrderId() {
            return this.showSubOrderId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSio(String sio) {
            this.sio = sio;
            return this;
        }
        public String getSio() {
            return this.sio;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setThirdInvoiceId(String thirdInvoiceId) {
            this.thirdInvoiceId = thirdInvoiceId;
            return this;
        }
        public String getThirdInvoiceId() {
            return this.thirdInvoiceId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTradeActionDesc(String tradeActionDesc) {
            this.tradeActionDesc = tradeActionDesc;
            return this;
        }
        public String getTradeActionDesc() {
            return this.tradeActionDesc;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTradeReason(String tradeReason) {
            this.tradeReason = tradeReason;
            return this;
        }
        public String getTradeReason() {
            return this.tradeReason;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTravelerEmail(String travelerEmail) {
            this.travelerEmail = travelerEmail;
            return this;
        }
        public String getTravelerEmail() {
            return this.travelerEmail;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTravelerMemberType(String travelerMemberType) {
            this.travelerMemberType = travelerMemberType;
            return this;
        }
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public FuPointBillSettlementQueryResponseBodyModuleItems setVoucherTypeDesc(String voucherTypeDesc) {
            this.voucherTypeDesc = voucherTypeDesc;
            return this;
        }
        public String getVoucherTypeDesc() {
            return this.voucherTypeDesc;
        }

    }

    public static class FuPointBillSettlementQueryResponseBodyModule extends TeaModel {
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("items")
        public java.util.List<FuPointBillSettlementQueryResponseBodyModuleItems> items;

        @NameInMap("period_end")
        public String periodEnd;

        @NameInMap("period_start")
        public String periodStart;

        @NameInMap("scroll_id")
        public String scrollId;

        @NameInMap("total_size")
        public Long totalSize;

        public static FuPointBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            FuPointBillSettlementQueryResponseBodyModule self = new FuPointBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public FuPointBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public FuPointBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public FuPointBillSettlementQueryResponseBodyModule setItems(java.util.List<FuPointBillSettlementQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FuPointBillSettlementQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public FuPointBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public FuPointBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public FuPointBillSettlementQueryResponseBodyModule setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public FuPointBillSettlementQueryResponseBodyModule setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
