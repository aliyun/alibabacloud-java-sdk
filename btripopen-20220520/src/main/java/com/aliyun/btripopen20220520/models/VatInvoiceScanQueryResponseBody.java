// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class VatInvoiceScanQueryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("module")
    public VatInvoiceScanQueryResponseBodyModule module;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>C61ECFF6-606B-5F66-B81D-D77369043A5F</p>
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
     * <p>traceId</p>
     * 
     * <strong>example:</strong>
     * <p>210e842b16611337974412836dae27</p>
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
        /**
         * <strong>example:</strong>
         * <p>75.21</p>
         */
        @NameInMap("amount")
        public String amount;

        /**
         * <p>行号</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("index")
        public String index;

        @NameInMap("item_name")
        public String itemName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("quantity")
        public String quantity;

        /**
         * <strong>example:</strong>
         * <p>66PT11230069</p>
         */
        @NameInMap("specification")
        public String specification;

        /**
         * <strong>example:</strong>
         * <p>12.79</p>
         */
        @NameInMap("tax")
        public String tax;

        /**
         * <strong>example:</strong>
         * <p>17%</p>
         */
        @NameInMap("tax_rate")
        public String taxRate;

        @NameInMap("unit")
        public String unit;

        /**
         * <strong>example:</strong>
         * <p>75.21</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("amount_with_tax")
        public String amountWithTax;

        /**
         * <strong>example:</strong>
         * <p>18.87</p>
         */
        @NameInMap("amount_without_tax")
        public String amountWithoutTax;

        /**
         * <strong>example:</strong>
         * <p>2022-12-01</p>
         */
        @NameInMap("bill_date")
        public String billDate;

        /**
         * <strong>example:</strong>
         * <p>07122942791187744475</p>
         */
        @NameInMap("check_code")
        public String checkCode;

        @NameInMap("drawer")
        public String drawer;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>3300111303</p>
         */
        @NameInMap("invoice_code")
        public String invoiceCode;

        /**
         * <strong>example:</strong>
         * <p>2022-12-01</p>
         */
        @NameInMap("invoice_day")
        public String invoiceDay;

        @NameInMap("invoice_detail")
        public String invoiceDetail;

        @NameInMap("invoice_details")
        public java.util.List<VatInvoiceScanQueryResponseBodyModuleItemsInvoiceDetails> invoiceDetails;

        @NameInMap("invoice_location")
        public String invoiceLocation;

        /**
         * <strong>example:</strong>
         * <p>24021111</p>
         */
        @NameInMap("invoice_no")
        public String invoiceNo;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("invoice_sub_task_id")
        public Long invoiceSubTaskId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("invoice_type")
        public Integer invoiceType;

        @NameInMap("invoice_type_desc")
        public String invoiceTypeDesc;

        /**
         * <p>机器码</p>
         * 
         * <strong>example:</strong>
         * <p>661619906841</p>
         */
        @NameInMap("machine_code")
        public String machineCode;

        @NameInMap("ofd_oss_url")
        public String ofdOssUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.testurl.com">https://www.testurl.com</a></p>
         */
        @NameInMap("oss_url")
        public String ossUrl;

        /**
         * <strong>example:</strong>
         * <p>&lt;87*&gt;&gt;53&gt;5023&gt;-446&gt;/4+83/5* *&gt;5/81&lt;75/1931&gt;4&gt;&gt;</p>
         */
        @NameInMap("password_area")
        public String passwordArea;

        @NameInMap("pdf_oss_url")
        public String pdfOssUrl;

        @NameInMap("purchaser_bank_account_info")
        public String purchaserBankAccountInfo;

        @NameInMap("purchaser_contact_info")
        public String purchaserContactInfo;

        @NameInMap("purchaser_name")
        public String purchaserName;

        /**
         * <strong>example:</strong>
         * <p>91441111111111111S</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>91441111111111111N</p>
         */
        @NameInMap("seller_tax_no")
        public String sellerTaxNo;

        /**
         * <strong>example:</strong>
         * <p>4475</p>
         */
        @NameInMap("smart_check_code")
        public String smartCheckCode;

        /**
         * <strong>example:</strong>
         * <p>1.13</p>
         */
        @NameInMap("tax_amount")
        public String taxAmount;

        /**
         * <strong>example:</strong>
         * <p>6%</p>
         */
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

        public VatInvoiceScanQueryResponseBodyModuleItems setOfdOssUrl(String ofdOssUrl) {
            this.ofdOssUrl = ofdOssUrl;
            return this;
        }
        public String getOfdOssUrl() {
            return this.ofdOssUrl;
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

        public VatInvoiceScanQueryResponseBodyModuleItems setPdfOssUrl(String pdfOssUrl) {
            this.pdfOssUrl = pdfOssUrl;
            return this;
        }
        public String getPdfOssUrl() {
            return this.pdfOssUrl;
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

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page_no")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("page_size")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("total_page")
        public Integer totalPage;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
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
