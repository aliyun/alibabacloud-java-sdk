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

    public static class VatInvoiceScanQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("amount_with_tax")
        public String amountWithTax;

        @NameInMap("amount_without_tax")
        public String amountWithoutTax;

        @NameInMap("bill_date")
        public String billDate;

        @NameInMap("invoice_code")
        public String invoiceCode;

        @NameInMap("invoice_day")
        public String invoiceDay;

        @NameInMap("invoice_detail")
        public String invoiceDetail;

        @NameInMap("invoice_no")
        public String invoiceNo;

        @NameInMap("invoice_sub_task_id")
        public Long invoiceSubTaskId;

        @NameInMap("invoice_type")
        public Integer invoiceType;

        @NameInMap("invoice_type_desc")
        public String invoiceTypeDesc;

        @NameInMap("oss_url")
        public String ossUrl;

        @NameInMap("purchaser_name")
        public String purchaserName;

        @NameInMap("purchaser_tax_no")
        public String purchaserTaxNo;

        @NameInMap("seller_name")
        public String sellerName;

        @NameInMap("seller_tax_no")
        public String sellerTaxNo;

        @NameInMap("tax_amount")
        public String taxAmount;

        @NameInMap("tax_rate")
        public String taxRate;

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

        public VatInvoiceScanQueryResponseBodyModuleItems setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
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
