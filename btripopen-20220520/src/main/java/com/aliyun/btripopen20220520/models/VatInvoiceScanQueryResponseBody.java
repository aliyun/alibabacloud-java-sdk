// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class VatInvoiceScanQueryResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public VatInvoiceScanQueryResponseBodyModule module;

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

    public static VatInvoiceScanQueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VatInvoiceScanQueryResponseBody self = new VatInvoiceScanQueryResponseBody();
        return TeaModel.build(map, self);
    }

    public VatInvoiceScanQueryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VatInvoiceScanQueryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VatInvoiceScanQueryResponseBody setModule(VatInvoiceScanQueryResponseBodyModule module) {
        this.module = module;
        return this;
    }
    public VatInvoiceScanQueryResponseBodyModule getModule() {
        return this.module;
    }

    public VatInvoiceScanQueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VatInvoiceScanQueryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public VatInvoiceScanQueryResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails extends TeaModel {
        @NameInMap("amount")
        public String amount;

        /**
         * <p>行号</p>
         */
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

        public static VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails build(java.util.Map<String, ?> map) throws Exception {
            VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails self = new VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails();
            return TeaModel.build(map, self);
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setAmount(String amount) {
            this.amount = amount;
            return this;
        }
        public String getAmount() {
            return this.amount;
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setQuantity(String quantity) {
            this.quantity = quantity;
            return this;
        }
        public String getQuantity() {
            return this.quantity;
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setSpecification(String specification) {
            this.specification = specification;
            return this;
        }
        public String getSpecification() {
            return this.specification;
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setTax(String tax) {
            this.tax = tax;
            return this;
        }
        public String getTax() {
            return this.tax;
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setUnit(String unit) {
            this.unit = unit;
            return this;
        }
        public String getUnit() {
            return this.unit;
        }

        public VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails setUnitPrice(String unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public String getUnitPrice() {
            return this.unitPrice;
        }

    }

    public static class VatInvoiceScanQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("amount_with_tax")
        public String amountWithTax;

        @NameInMap("amount_without_tax")
        public String amountWithoutTax;

        @NameInMap("bill_date")
        public String billDate;

        @NameInMap("check_code")
        public String checkCode;

        @NameInMap("drawer")
        public String drawer;

        @NameInMap("id")
        public String id;

        @NameInMap("invoice_code")
        public String invoiceCode;

        @NameInMap("invoice_day")
        public String invoiceDay;

        @NameInMap("invoice_detail")
        public String invoiceDetail;

        @NameInMap("invoice_details")
        public java.util.List<VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails> invoiceDetails;

        @NameInMap("invoice_location")
        public String invoiceLocation;

        @NameInMap("invoice_no")
        public String invoiceNo;

        @NameInMap("invoice_sub_task_id")
        public Long invoiceSubTaskId;

        @NameInMap("invoice_type")
        public Integer invoiceType;

        @NameInMap("invoice_type_desc")
        public String invoiceTypeDesc;

        /**
         * <p>机器码</p>
         */
        @NameInMap("machine_code")
        public String machineCode;

        @NameInMap("oss_url")
        public String ossUrl;

        @NameInMap("password_area")
        public String passwordArea;

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

        @NameInMap("xml_oss_url")
        public String xmlOssUrl;

        public static VatInvoiceScanQueryResponseBodyModuleItems build(java.util.Map<String, ?> map) throws Exception {
            VatInvoiceScanQueryResponseBodyModuleItems self = new VatInvoiceScanQueryResponseBodyModuleItems();
            return TeaModel.build(map, self);
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setAmountWithTax(String amountWithTax) {
            this.amountWithTax = amountWithTax;
            return this;
        }
        public String getAmountWithTax() {
            return this.amountWithTax;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setAmountWithoutTax(String amountWithoutTax) {
            this.amountWithoutTax = amountWithoutTax;
            return this;
        }
        public String getAmountWithoutTax() {
            return this.amountWithoutTax;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setBillDate(String billDate) {
            this.billDate = billDate;
            return this;
        }
        public String getBillDate() {
            return this.billDate;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setCheckCode(String checkCode) {
            this.checkCode = checkCode;
            return this;
        }
        public String getCheckCode() {
            return this.checkCode;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setDrawer(String drawer) {
            this.drawer = drawer;
            return this;
        }
        public String getDrawer() {
            return this.drawer;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceDay(String invoiceDay) {
            this.invoiceDay = invoiceDay;
            return this;
        }
        public String getInvoiceDay() {
            return this.invoiceDay;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceDetail(String invoiceDetail) {
            this.invoiceDetail = invoiceDetail;
            return this;
        }
        public String getInvoiceDetail() {
            return this.invoiceDetail;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceDetails(java.util.List<VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails> invoiceDetails) {
            this.invoiceDetails = invoiceDetails;
            return this;
        }
        public java.util.List<VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails> getInvoiceDetails() {
            return this.invoiceDetails;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceLocation(String invoiceLocation) {
            this.invoiceLocation = invoiceLocation;
            return this;
        }
        public String getInvoiceLocation() {
            return this.invoiceLocation;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceSubTaskId(Long invoiceSubTaskId) {
            this.invoiceSubTaskId = invoiceSubTaskId;
            return this;
        }
        public Long getInvoiceSubTaskId() {
            return this.invoiceSubTaskId;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceType(Integer invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public Integer getInvoiceType() {
            return this.invoiceType;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setInvoiceTypeDesc(String invoiceTypeDesc) {
            this.invoiceTypeDesc = invoiceTypeDesc;
            return this;
        }
        public String getInvoiceTypeDesc() {
            return this.invoiceTypeDesc;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setMachineCode(String machineCode) {
            this.machineCode = machineCode;
            return this;
        }
        public String getMachineCode() {
            return this.machineCode;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setPasswordArea(String passwordArea) {
            this.passwordArea = passwordArea;
            return this;
        }
        public String getPasswordArea() {
            return this.passwordArea;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setPurchaserBankAccountInfo(String purchaserBankAccountInfo) {
            this.purchaserBankAccountInfo = purchaserBankAccountInfo;
            return this;
        }
        public String getPurchaserBankAccountInfo() {
            return this.purchaserBankAccountInfo;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setPurchaserContactInfo(String purchaserContactInfo) {
            this.purchaserContactInfo = purchaserContactInfo;
            return this;
        }
        public String getPurchaserContactInfo() {
            return this.purchaserContactInfo;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setPurchaserName(String purchaserName) {
            this.purchaserName = purchaserName;
            return this;
        }
        public String getPurchaserName() {
            return this.purchaserName;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setPurchaserTaxNo(String purchaserTaxNo) {
            this.purchaserTaxNo = purchaserTaxNo;
            return this;
        }
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }
        public String getRecipient() {
            return this.recipient;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setRemarks(String remarks) {
            this.remarks = remarks;
            return this;
        }
        public String getRemarks() {
            return this.remarks;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setReviewer(String reviewer) {
            this.reviewer = reviewer;
            return this;
        }
        public String getReviewer() {
            return this.reviewer;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setSellerBankAccountInfo(String sellerBankAccountInfo) {
            this.sellerBankAccountInfo = sellerBankAccountInfo;
            return this;
        }
        public String getSellerBankAccountInfo() {
            return this.sellerBankAccountInfo;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setSellerContactInfo(String sellerContactInfo) {
            this.sellerContactInfo = sellerContactInfo;
            return this;
        }
        public String getSellerContactInfo() {
            return this.sellerContactInfo;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setSellerName(String sellerName) {
            this.sellerName = sellerName;
            return this;
        }
        public String getSellerName() {
            return this.sellerName;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setSellerTaxNo(String sellerTaxNo) {
            this.sellerTaxNo = sellerTaxNo;
            return this;
        }
        public String getSellerTaxNo() {
            return this.sellerTaxNo;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setSmartCheckCode(String smartCheckCode) {
            this.smartCheckCode = smartCheckCode;
            return this;
        }
        public String getSmartCheckCode() {
            return this.smartCheckCode;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setTaxAmount(String taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public String getTaxAmount() {
            return this.taxAmount;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setTaxRate(String taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public String getTaxRate() {
            return this.taxRate;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setTotalAmountInWords(String totalAmountInWords) {
            this.totalAmountInWords = totalAmountInWords;
            return this;
        }
        public String getTotalAmountInWords() {
            return this.totalAmountInWords;
        }

        public VatInvoiceScanQueryResponseBodyModuleItems setXmlOssUrl(String xmlOssUrl) {
            this.xmlOssUrl = xmlOssUrl;
            return this;
        }
        public String getXmlOssUrl() {
            return this.xmlOssUrl;
        }

    }

    public static class VatInvoiceScanQueryResponseBodyModule extends TeaModel {
        @NameInMap("items")
        public java.util.List<VatInvoiceScanQueryResponseBodyModuleItems> items;

        @NameInMap("page_no")
        public Integer pageNo;

        @NameInMap("page_size")
        public Integer pageSize;

        @NameInMap("total_page")
        public Integer totalPage;

        @NameInMap("total_size")
        public Integer totalSize;

        public static VatInvoiceScanQueryResponseBodyModule build(java.util.Map<String, ?> map) throws Exception {
            VatInvoiceScanQueryResponseBodyModule self = new VatInvoiceScanQueryResponseBodyModule();
            return TeaModel.build(map, self);
        }

        public VatInvoiceScanQueryResponseBodyModule setItems(java.util.List<VatInvoiceScanQueryResponseBodyModuleItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<VatInvoiceScanQueryResponseBodyModuleItems> getItems() {
            return this.items;
        }

        public VatInvoiceScanQueryResponseBodyModule setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public VatInvoiceScanQueryResponseBodyModule setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public VatInvoiceScanQueryResponseBodyModule setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public VatInvoiceScanQueryResponseBodyModule setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
