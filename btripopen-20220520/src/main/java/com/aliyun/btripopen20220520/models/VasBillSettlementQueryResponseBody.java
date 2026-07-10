// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class VasBillSettlementQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public VasBillSettlementQueryResponseBodyModule module;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("traceId")
    public String traceId;

    public static VasBillSettlementQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VasBillSettlementQueryResponseBody self = new VasBillSettlementQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public VasBillSettlementQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VasBillSettlementQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VasBillSettlementQueryResponseBody setModule(VasBillSettlementQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public VasBillSettlementQueryResponseBodyModule getModule() {
        return this.module;
    }

    public VasBillSettlementQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VasBillSettlementQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VasBillSettlementQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class VasBillSettlementQueryResponseBodyModuleItems extends TeaModel {
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

        @NameInMap("belong_business")
        public String belongBusiness;

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

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("cost_center_number")
        public String costCenterNumber;

        @NameInMap("cost_department")
        public String costDepartment;

        @NameInMap("department")
        public String department;

        @NameInMap("department_id")
        public String departmentId;

        @NameInMap("fee_type")
        public String feeType;

        @NameInMap("fee_type_desc")
        public String feeTypeDesc;

        @NameInMap("index")
        public String index;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("mapping_company_code")
        public String mappingCompanyCode;

        @NameInMap("order_id")
        public String orderId;

        @NameInMap("order_price")
        public Double orderPrice;

        @NameInMap("order_status_desc")
        public String orderStatusDesc;

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

        @NameInMap("product_count")
        public Integer productCount;

        @NameInMap("product_id")
        public String productId;

        @NameInMap("product_name")
        public String productName;

        @NameInMap("project_code")
        public String projectCode;

        @NameInMap("project_name")
        public String projectName;

        @NameInMap("promotion_fee")
        public Double promotionFee;

        @NameInMap("purchase_order_id")
        public String purchaseOrderId;

        @NameInMap("remark")
        public String remark;

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

        @NameInMap("specification")
        public String specification;

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

        @NameInMap("trade_remark")
        public String tradeRemark;

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

        public static VasBillSettlementQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            VasBillSettlementQueryResponseBodyModuleItems self = new VasBillSettlementQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public VasBillSettlementQueryResponseBodyModuleItems setAdjustTime(String adjustTime) {
            this.adjustTime = adjustTime;
            return this;
        }
        public String getAdjustTime() {
            return this.adjustTime;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setAlipayId(String alipayId) {
            this.alipayId = alipayId;
            return this;
        }
        public String getAlipayId() {
            return this.alipayId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setAlipayTradeNo(String alipayTradeNo) {
            this.alipayTradeNo = alipayTradeNo;
            return this;
        }
        public String getAlipayTradeNo() {
            return this.alipayTradeNo;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setApplyArrCityCode(String applyArrCityCode) {
            this.applyArrCityCode = applyArrCityCode;
            return this;
        }
        public String getApplyArrCityCode() {
            return this.applyArrCityCode;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setApplyArrCityName(String applyArrCityName) {
            this.applyArrCityName = applyArrCityName;
            return this;
        }
        public String getApplyArrCityName() {
            return this.applyArrCityName;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setApplyDepCityCode(String applyDepCityCode) {
            this.applyDepCityCode = applyDepCityCode;
            return this;
        }
        public String getApplyDepCityCode() {
            return this.applyDepCityCode;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setApplyDepCityName(String applyDepCityName) {
            this.applyDepCityName = applyDepCityName;
            return this;
        }
        public String getApplyDepCityName() {
            return this.applyDepCityName;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setApplyExtendField(String applyExtendField) {
            this.applyExtendField = applyExtendField;
            return this;
        }
        public String getApplyExtendField() {
            return this.applyExtendField;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setApplyId(String applyId) {
            this.applyId = applyId;
            return this;
        }
        public String getApplyId() {
            return this.applyId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setBelongBusiness(String belongBusiness) {
            this.belongBusiness = belongBusiness;
            return this;
        }
        public String getBelongBusiness() {
            return this.belongBusiness;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setBillRecordTime(String billRecordTime) {
            this.billRecordTime = billRecordTime;
            return this;
        }
        public String getBillRecordTime() {
            return this.billRecordTime;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setBillingEntity(String billingEntity) {
            this.billingEntity = billingEntity;
            return this;
        }
        public String getBillingEntity() {
            return this.billingEntity;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setBookMode(String bookMode) {
            this.bookMode = bookMode;
            return this;
        }
        public String getBookMode() {
            return this.bookMode;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setBookTime(String bookTime) {
            this.bookTime = bookTime;
            return this;
        }
        public String getBookTime() {
            return this.bookTime;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setBookerId(String bookerId) {
            this.bookerId = bookerId;
            return this;
        }
        public String getBookerId() {
            return this.bookerId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setBookerJobNo(String bookerJobNo) {
            this.bookerJobNo = bookerJobNo;
            return this;
        }
        public String getBookerJobNo() {
            return this.bookerJobNo;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setBookerName(String bookerName) {
            this.bookerName = bookerName;
            return this;
        }
        public String getBookerName() {
            return this.bookerName;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setCapitalDirection(String capitalDirection) {
            this.capitalDirection = capitalDirection;
            return this;
        }
        public String getCapitalDirection() {
            return this.capitalDirection;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setCascadeDepartment(String cascadeDepartment) {
            this.cascadeDepartment = cascadeDepartment;
            return this;
        }
        public String getCascadeDepartment() {
            return this.cascadeDepartment;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setCategoryDesc(String categoryDesc) {
            this.categoryDesc = categoryDesc;
            return this;
        }
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setCostCenterNumber(String costCenterNumber) {
            this.costCenterNumber = costCenterNumber;
            return this;
        }
        public String getCostCenterNumber() {
            return this.costCenterNumber;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setCostDepartment(String costDepartment) {
            this.costDepartment = costDepartment;
            return this;
        }
        public String getCostDepartment() {
            return this.costDepartment;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setFeeType(String feeType) {
            this.feeType = feeType;
            return this;
        }
        public String getFeeType() {
            return this.feeType;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setFeeTypeDesc(String feeTypeDesc) {
            this.feeTypeDesc = feeTypeDesc;
            return this;
        }
        public String getFeeTypeDesc() {
            return this.feeTypeDesc;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setMappingCompanyCode(String mappingCompanyCode) {
            this.mappingCompanyCode = mappingCompanyCode;
            return this;
        }
        public String getMappingCompanyCode() {
            return this.mappingCompanyCode;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setOrderPrice(Double orderPrice) {
            this.orderPrice = orderPrice;
            return this;
        }
        public Double getOrderPrice() {
            return this.orderPrice;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setOrderStatusDesc(String orderStatusDesc) {
            this.orderStatusDesc = orderStatusDesc;
            return this;
        }
        public String getOrderStatusDesc() {
            return this.orderStatusDesc;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setOverApplyId(String overApplyId) {
            this.overApplyId = overApplyId;
            return this;
        }
        public String getOverApplyId() {
            return this.overApplyId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setPaymentDepartmentId(String paymentDepartmentId) {
            this.paymentDepartmentId = paymentDepartmentId;
            return this;
        }
        public String getPaymentDepartmentId() {
            return this.paymentDepartmentId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setPaymentDepartmentName(String paymentDepartmentName) {
            this.paymentDepartmentName = paymentDepartmentName;
            return this;
        }
        public String getPaymentDepartmentName() {
            return this.paymentDepartmentName;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setProcessorOaCode(String processorOaCode) {
            this.processorOaCode = processorOaCode;
            return this;
        }
        public String getProcessorOaCode() {
            return this.processorOaCode;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setProductCount(Integer productCount) {
            this.productCount = productCount;
            return this;
        }
        public Integer getProductCount() {
            return this.productCount;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setProjectCode(String projectCode) {
            this.projectCode = projectCode;
            return this;
        }
        public String getProjectCode() {
            return this.projectCode;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setPromotionFee(Double promotionFee) {
            this.promotionFee = promotionFee;
            return this;
        }
        public Double getPromotionFee() {
            return this.promotionFee;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setPurchaseOrderId(String purchaseOrderId) {
            this.purchaseOrderId = purchaseOrderId;
            return this;
        }
        public String getPurchaseOrderId() {
            return this.purchaseOrderId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setSettleTypeDesc(String settleTypeDesc) {
            this.settleTypeDesc = settleTypeDesc;
            return this;
        }
        public String getSettleTypeDesc() {
            return this.settleTypeDesc;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setSettlementGrantFee(Double settlementGrantFee) {
            this.settlementGrantFee = settlementGrantFee;
            return this;
        }
        public Double getSettlementGrantFee() {
            return this.settlementGrantFee;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setSettlementTime(String settlementTime) {
            this.settlementTime = settlementTime;
            return this;
        }
        public String getSettlementTime() {
            return this.settlementTime;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setSettlementType(String settlementType) {
            this.settlementType = settlementType;
            return this;
        }
        public String getSettlementType() {
            return this.settlementType;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setSubOrderId(String subOrderId) {
            this.subOrderId = subOrderId;
            return this;
        }
        public String getSubOrderId() {
            return this.subOrderId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setThirdInvoiceId(String thirdInvoiceId) {
            this.thirdInvoiceId = thirdInvoiceId;
            return this;
        }
        public String getThirdInvoiceId() {
            return this.thirdInvoiceId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setThirdItineraryId(String thirdItineraryId) {
            this.thirdItineraryId = thirdItineraryId;
            return this;
        }
        public String getThirdItineraryId() {
            return this.thirdItineraryId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setTradeActionDesc(String tradeActionDesc) {
            this.tradeActionDesc = tradeActionDesc;
            return this;
        }
        public String getTradeActionDesc() {
            return this.tradeActionDesc;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setTradeRemark(String tradeRemark) {
            this.tradeRemark = tradeRemark;
            return this;
        }
        public String getTradeRemark() {
            return this.tradeRemark;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setTravelerId(String travelerId) {
            this.travelerId = travelerId;
            return this;
        }
        public String getTravelerId() {
            return this.travelerId;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setTravelerJobNo(String travelerJobNo) {
            this.travelerJobNo = travelerJobNo;
            return this;
        }
        public String getTravelerJobNo() {
            return this.travelerJobNo;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setTravelerMemberType(String travelerMemberType) {
            this.travelerMemberType = travelerMemberType;
            return this;
        }
        public String getTravelerMemberType() {
            return this.travelerMemberType;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setTravelerMemberTypeName(String travelerMemberTypeName) {
            this.travelerMemberTypeName = travelerMemberTypeName;
            return this;
        }
        public String getTravelerMemberTypeName() {
            return this.travelerMemberTypeName;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setTravelerName(String travelerName) {
            this.travelerName = travelerName;
            return this;
        }
        public String getTravelerName() {
            return this.travelerName;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setVoucherType(Integer voucherType) {
            this.voucherType = voucherType;
            return this;
        }
        public Integer getVoucherType() {
            return this.voucherType;
        }

        public VasBillSettlementQueryResponseBodyModuleItems setVoucherTypeDesc(String voucherTypeDesc) {
            this.voucherTypeDesc = voucherTypeDesc;
            return this;
        }
        public String getVoucherTypeDesc() {
            return this.voucherTypeDesc;
        }

    }

    public static class VasBillSettlementQueryResponseBodyModule extends TeaModel {
        @NameInMap("category")
        public Integer category;

        @NameInMap("corp_id")
        public String corpId;

        @NameInMap("items")
        public java.util.List<VasBillSettlementQueryResponseBodyModuleItems> items;

        @NameInMap("period_end")
        public String periodEnd;

        @NameInMap("period_start")
        public String periodStart;

        @NameInMap("scroll_id")
        public String scrollId;

        @NameInMap("total_size")
        public Long totalSize;

        public static VasBillSettlementQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            VasBillSettlementQueryResponseBodyModule self = new VasBillSettlementQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public VasBillSettlementQueryResponseBodyModule setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public VasBillSettlementQueryResponseBodyModule setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public VasBillSettlementQueryResponseBodyModule setItems(java.util.List<VasBillSettlementQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<VasBillSettlementQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public VasBillSettlementQueryResponseBodyModule setPeriodEnd(String periodEnd) {
            this.periodEnd = periodEnd;
            return this;
        }
        public String getPeriodEnd() {
            return this.periodEnd;
        }

        public VasBillSettlementQueryResponseBodyModule setPeriodStart(String periodStart) {
            this.periodStart = periodStart;
            return this;
        }
        public String getPeriodStart() {
            return this.periodStart;
        }

        public VasBillSettlementQueryResponseBodyModule setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }
        public String getScrollId() {
            return this.scrollId;
        }

        public VasBillSettlementQueryResponseBodyModule setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
