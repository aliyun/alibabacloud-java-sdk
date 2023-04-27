// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class InsInvoiceScanQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public InsInvoiceScanQueryResponseBodyModule module;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    /**
     * <p>traceId</p>
     */
    @NameInMap("traceId")
    public String traceId;

    public static InsInvoiceScanQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsInvoiceScanQueryResponseBody self = new InsInvoiceScanQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public InsInvoiceScanQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsInvoiceScanQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsInvoiceScanQueryResponseBody setModule(InsInvoiceScanQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public InsInvoiceScanQueryResponseBodyModule getModule() {
        return this.module;
    }

    public InsInvoiceScanQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsInvoiceScanQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public InsInvoiceScanQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails extends TeaModel {
        @NameInMap("amount")
        public String amount;

        @NameInMap("index")
        public String index;

        @NameInMap("item_name")
        public String itemName;

        @NameInMap("quantity")
        public String quantity;

        @NameInMap("specification")
        public String specification;

        @NameInMap("tax")
        public String tax;

        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("unit")
        public String unit;

        @NameInMap("unit_price")
        public String unitPrice;

        public static InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails build(java.util.Map<String, ?> map) throws Exception {
            InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails self = new InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails();
            return TeaModel.build(map, self);
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setUnitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public String getUnitPrice() {
            return this.unitPrice;
        }

    }

    public static class InsInvoiceScanQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("amount_with_tax")
        public String amountWithTax;

        @NameInMap("amount_without_tax")
        public String amountWithoutTax;

        @NameInMap("bill_date")
        public String billDate;

        @NameInMap("check_code")
        public String checkCode;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("department")
        public String department;

        @NameInMap("drawer")
        public String drawer;

        @NameInMap("id")
        public String id;

        @NameInMap("insurance_company")
        public String insuranceCompany;

        @NameInMap("insurance_order_id")
        public String insuranceOrderId;

        @NameInMap("insurance_type")
        public String insuranceType;

        @NameInMap("invoice_code")
        public String invoiceCode;

        @NameInMap("invoice_day")
        public String invoiceDay;

        @NameInMap("invoice_details")
        public java.util.List<InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails> invoiceDetails;

        @NameInMap("invoice_location")
        public String invoiceLocation;

        @NameInMap("invoice_no")
        public String invoiceNo;

        @NameInMap("invoice_title")
        public String invoiceTitle;

        @NameInMap("machine_code")
        public String machineCode;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("oss_url")
        public String ossUrl;

        @NameInMap("passenger")
        public String passenger;

        @NameInMap("password_area")
        public String passwordArea;

        @NameInMap("project")
        public String project;

        @NameInMap("purchaser_bank_account_info")
        public String purchaserBankAccountInfo;

        @NameInMap("purchaser_contact_info")
        public String purchaserContactInfo;

        @NameInMap("purchaser_name")
        public String purchaserName;

        @NameInMap("purchaser_tax_no")
        public String purchaserTaxNo;

        @NameInMap("recipient")
        public String recipient;

        @NameInMap("remarks")
        public String remarks;

        @NameInMap("reviewer")
        public String reviewer;

        @NameInMap("seller_bank_account_info")
        public String sellerBankAccountInfo;

        @NameInMap("seller_contact_info")
        public String sellerContactInfo;

        @NameInMap("seller_name")
        public String sellerName;

        @NameInMap("seller_tax_no")
        public String sellerTaxNo;

        @NameInMap("smart_check_code")
        public String smartCheckCode;

        @NameInMap("tax_amount")
        public String taxAmount;

        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("total_amount_in_words")
        public String totalAmountInWords;

        public static InsInvoiceScanQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            InsInvoiceScanQueryResponseBodyModuleItems self = new InsInvoiceScanQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setAmountWithTax(String amountWithTax) {
            this.amountWithTax = amountWithTax;
            return this;
        }
        public String getAmountWithTax() {
            return this.amountWithTax;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setAmountWithoutTax(String amountWithoutTax) {
            this.amountWithoutTax = amountWithoutTax;
            return this;
        }
        public String getAmountWithoutTax() {
            return this.amountWithoutTax;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setBillDate(String billDate) {
            this.billDate = billDate;
            return this;
        }
        public String getBillDate() {
            return this.billDate;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setCheckCode(String checkCode) {
            this.checkCode = checkCode;
            return this;
        }
        public String getCheckCode() {
            return this.checkCode;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setCostCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }
        public String getCostCenter() {
            return this.costCenter;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setDepartment(String department) {
            this.department = department;
            return this;
        }
        public String getDepartment() {
            return this.department;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setDrawer(String drawer) {
            this.drawer = drawer;
            return this;
        }
        public String getDrawer() {
            return this.drawer;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInsuranceCompany(String insuranceCompany) {
            this.insuranceCompany = insuranceCompany;
            return this;
        }
        public String getInsuranceCompany() {
            return this.insuranceCompany;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInsuranceOrderId(String insuranceOrderId) {
            this.insuranceOrderId = insuranceOrderId;
            return this;
        }
        public String getInsuranceOrderId() {
            return this.insuranceOrderId;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInsuranceType(String insuranceType) {
            this.insuranceType = insuranceType;
            return this;
        }
        public String getInsuranceType() {
            return this.insuranceType;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInvoiceDay(String invoiceDay) {
            this.invoiceDay = invoiceDay;
            return this;
        }
        public String getInvoiceDay() {
            return this.invoiceDay;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInvoiceDetails(java.util.List<InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails> invoiceDetails) {
            this.invoiceDetails = invoiceDetails;
            return this;
        }
        public java.util.List<InsInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails> getInvoiceDetails() {
            return this.invoiceDetails;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInvoiceLocation(String invoiceLocation) {
            this.invoiceLocation = invoiceLocation;
            return this;
        }
        public String getInvoiceLocation() {
            return this.invoiceLocation;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setInvoiceTitle(String invoiceTitle) {
            this.invoiceTitle = invoiceTitle;
            return this;
        }
        public String getInvoiceTitle() {
            return this.invoiceTitle;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setMachineCode(String machineCode) {
            this.machineCode = machineCode;
            return this;
        }
        public String getMachineCode() {
            return this.machineCode;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setPassenger(String passenger) {
            this.passenger = passenger;
            return this;
        }
        public String getPassenger() {
            return this.passenger;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setPasswordArea(String passwordArea) {
            this.passwordArea = passwordArea;
            return this;
        }
        public String getPasswordArea() {
            return this.passwordArea;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setPurchaserBankAccountInfo(String purchaserBankAccountInfo) {
            this.purchaserBankAccountInfo = purchaserBankAccountInfo;
            return this;
        }
        public String getPurchaserBankAccountInfo() {
            return this.purchaserBankAccountInfo;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setPurchaserContactInfo(String purchaserContactInfo) {
            this.purchaserContactInfo = purchaserContactInfo;
            return this;
        }
        public String getPurchaserContactInfo() {
            return this.purchaserContactInfo;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setPurchaserName(String purchaserName) {
            this.purchaserName = purchaserName;
            return this;
        }
        public String getPurchaserName() {
            return this.purchaserName;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setPurchaserTaxNo(String purchaserTaxNo) {
            this.purchaserTaxNo = purchaserTaxNo;
            return this;
        }
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }
        public String getRecipient() {
            return this.recipient;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setReviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }
        public String getReviewer() {
            return this.reviewer;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setSellerBankAccountInfo(String sellerBankAccountInfo) {
            this.sellerBankAccountInfo = sellerBankAccountInfo;
            return this;
        }
        public String getSellerBankAccountInfo() {
            return this.sellerBankAccountInfo;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setSellerContactInfo(String sellerContactInfo) {
            this.sellerContactInfo = sellerContactInfo;
            return this;
        }
        public String getSellerContactInfo() {
            return this.sellerContactInfo;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setSellerName(String sellerName) {
            this.sellerName = sellerName;
            return this;
        }
        public String getSellerName() {
            return this.sellerName;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setSellerTaxNo(String sellerTaxNo) {
            this.sellerTaxNo = sellerTaxNo;
            return this;
        }
        public String getSellerTaxNo() {
            return this.sellerTaxNo;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setSmartCheckCode(String smartCheckCode) {
            this.smartCheckCode = smartCheckCode;
            return this;
        }
        public String getSmartCheckCode() {
            return this.smartCheckCode;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public InsInvoiceScanQueryResponseBodyModuleItems setTotalAmountInWords(String totalAmountInWords) {
            this.totalAmountInWords = totalAmountInWords;
            return this;
        }
        public String getTotalAmountInWords() {
            return this.totalAmountInWords;
        }

    }

    public static class InsInvoiceScanQueryResponseBodyModule extends TeaModel {
        @NameInMap("items")
        public java.util.List<InsInvoiceScanQueryResponseBodyModuleItems> items;

        @NameInMap("page_no")
        public Integer pageNo;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_page")
        public Integer totalPage;

        @NameInMap("total_size")
        public Integer totalSize;

        public static InsInvoiceScanQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            InsInvoiceScanQueryResponseBodyModule self = new InsInvoiceScanQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public InsInvoiceScanQueryResponseBodyModule setItems(java.util.List<InsInvoiceScanQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<InsInvoiceScanQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public InsInvoiceScanQueryResponseBodyModule setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public InsInvoiceScanQueryResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public InsInvoiceScanQueryResponseBodyModule setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public InsInvoiceScanQueryResponseBodyModule setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
