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

    public static class InsInvoiceScanQueryResponseBodyModuleItems extends TeaModel {
        @NameInMap("amount_with_tax")
        public String amountWithTax;

        @NameInMap("amount_without_tax")
        public String amountWithoutTax;

        @NameInMap("bill_date")
        public String billDate;

        @NameInMap("cost_center")
        public String costCenter;

        @NameInMap("department")
        public String department;

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

        @NameInMap("invoice_no")
        public String invoiceNo;

        @NameInMap("order_id")
        public Long orderId;

        @NameInMap("oss_url")
        public String ossUrl;

        @NameInMap("passenger")
        public String passenger;

        @NameInMap("project")
        public String project;

        @NameInMap("purchaser_name")
        public String purchaserName;

        @NameInMap("purchaser_tax_no")
        public String purchaserTaxNo;

        @NameInMap("real_invoice_title")
        public String realInvoiceTitle;

        @NameInMap("seller_name")
        public String sellerName;

        @NameInMap("seller_tax_no")
        public String sellerTaxNo;

        @NameInMap("tax_amount")
        public String taxAmount;

        @NameInMap("tax_rate")
        public String taxRate;

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

        public InsInvoiceScanQueryResponseBodyModuleItems setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
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

        public InsInvoiceScanQueryResponseBodyModuleItems setProject(String project) {
            this.project = project;
            return this;
        }
        public String getProject() {
            return this.project;
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

        public InsInvoiceScanQueryResponseBodyModuleItems setRealInvoiceTitle(String realInvoiceTitle) {
            this.realInvoiceTitle = realInvoiceTitle;
            return this;
        }
        public String getRealInvoiceTitle() {
            return this.realInvoiceTitle;
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
