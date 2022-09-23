// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class QueryInvoiceInfoByRequestNoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("ReturnValue")
    public QueryInvoiceInfoByRequestNoResponseBodyReturnValue returnValue;

    public static QueryInvoiceInfoByRequestNoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryInvoiceInfoByRequestNoResponseBody self = new QueryInvoiceInfoByRequestNoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryInvoiceInfoByRequestNoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryInvoiceInfoByRequestNoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryInvoiceInfoByRequestNoResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public QueryInvoiceInfoByRequestNoResponseBody setReturnValue(QueryInvoiceInfoByRequestNoResponseBodyReturnValue returnValue) {
        this.returnValue = returnValue;
        return this;
    }
    public QueryInvoiceInfoByRequestNoResponseBodyReturnValue getReturnValue() {
        return this.returnValue;
    }

    public static class QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("CustomerSite")
        public String customerSite;

        @NameInMap("CustomerSystem")
        public String customerSystem;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("Language")
        public String language;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Uuid")
        public String uuid;

        public static QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer self = new QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer();
            return TeaModel.build(map, self);
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer setCustomerSite(String customerSite) {
            this.customerSite = customerSite;
            return this;
        }
        public String getCustomerSite() {
            return this.customerSite;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer setCustomerSystem(String customerSystem) {
            this.customerSystem = customerSystem;
            return this;
        }
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("CustomerSite")
        public String customerSite;

        @NameInMap("CustomerSystem")
        public String customerSystem;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("Language")
        public String language;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Uuid")
        public String uuid;

        public static QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer self = new QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer();
            return TeaModel.build(map, self);
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer setCustomerSite(String customerSite) {
            this.customerSite = customerSite;
            return this;
        }
        public String getCustomerSite() {
            return this.customerSite;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer setCustomerSystem(String customerSystem) {
            this.customerSystem = customerSystem;
            return this;
        }
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList extends TeaModel {
        @NameInMap("Amount")
        public Double amount;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("BillAmount")
        public Double billAmount;

        @NameInMap("BillDomain")
        public String billDomain;

        @NameInMap("BillNo")
        public String billNo;

        @NameInMap("BillType")
        public String billType;

        @NameInMap("BlueSourceId")
        public Long blueSourceId;

        @NameInMap("CanMerge")
        public Boolean canMerge;

        @NameInMap("CargoName")
        public String cargoName;

        @NameInMap("Category")
        public String category;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("CurrencyCode")
        public String currencyCode;

        @NameInMap("Customer")
        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer customer;

        @NameInMap("DiscountAmount")
        public Double discountAmount;

        @NameInMap("DiscountTaxAmount")
        public Double discountTaxAmount;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("ExcludingTaxAmount")
        public Double excludingTaxAmount;

        @NameInMap("ExcludingTaxDiscountAmount")
        public Double excludingTaxDiscountAmount;

        @NameInMap("ExcludingTaxRedAmount")
        public Double excludingTaxRedAmount;

        @NameInMap("ExcludingTaxRemainAmount")
        public Double excludingTaxRemainAmount;

        @NameInMap("GmtBill")
        public String gmtBill;

        @NameInMap("GmtBillEnd")
        public String gmtBillEnd;

        @NameInMap("GmtBillStart")
        public String gmtBillStart;

        @NameInMap("GmtBuild")
        public String gmtBuild;

        @NameInMap("IsApply")
        public String isApply;

        @NameInMap("Language")
        public String language;

        @NameInMap("MajorBillNo")
        public String majorBillNo;

        @NameInMap("Model")
        public String model;

        @NameInMap("OuCode")
        public String ouCode;

        @NameInMap("ParentCategory")
        public String parentCategory;

        @NameInMap("ProductDomain")
        public String productDomain;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("ProductName")
        public String productName;

        @NameInMap("Quantity")
        public Double quantity;

        @NameInMap("QuantityUnit")
        public String quantityUnit;

        @NameInMap("RedAmount")
        public Double redAmount;

        @NameInMap("RelatedId")
        public String relatedId;

        @NameInMap("RemainAmount")
        public Double remainAmount;

        @NameInMap("RevenueType")
        public String revenueType;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("SiteId")
        public String siteId;

        @NameInMap("SourceId")
        public Long sourceId;

        @NameInMap("TaxAmount")
        public Double taxAmount;

        @NameInMap("TaxRate")
        public Double taxRate;

        @NameInMap("UnitPrice")
        public Double unitPrice;

        @NameInMap("Uuid")
        public String uuid;

        public static QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList self = new QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList();
            return TeaModel.build(map, self);
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setBillAmount(Double billAmount) {
            this.billAmount = billAmount;
            return this;
        }
        public Double getBillAmount() {
            return this.billAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setBillDomain(String billDomain) {
            this.billDomain = billDomain;
            return this;
        }
        public String getBillDomain() {
            return this.billDomain;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setBillNo(String billNo) {
            this.billNo = billNo;
            return this;
        }
        public String getBillNo() {
            return this.billNo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setBlueSourceId(Long blueSourceId) {
            this.blueSourceId = blueSourceId;
            return this;
        }
        public Long getBlueSourceId() {
            return this.blueSourceId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setCanMerge(Boolean canMerge) {
            this.canMerge = canMerge;
            return this;
        }
        public Boolean getCanMerge() {
            return this.canMerge;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setCargoName(String cargoName) {
            this.cargoName = cargoName;
            return this;
        }
        public String getCargoName() {
            return this.cargoName;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setCustomer(QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer customer) {
            this.customer = customer;
            return this;
        }
        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceListCustomer getCustomer() {
            return this.customer;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setDiscountAmount(Double discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setDiscountTaxAmount(Double discountTaxAmount) {
            this.discountTaxAmount = discountTaxAmount;
            return this;
        }
        public Double getDiscountTaxAmount() {
            return this.discountTaxAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setExcludingTaxAmount(Double excludingTaxAmount) {
            this.excludingTaxAmount = excludingTaxAmount;
            return this;
        }
        public Double getExcludingTaxAmount() {
            return this.excludingTaxAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setExcludingTaxDiscountAmount(Double excludingTaxDiscountAmount) {
            this.excludingTaxDiscountAmount = excludingTaxDiscountAmount;
            return this;
        }
        public Double getExcludingTaxDiscountAmount() {
            return this.excludingTaxDiscountAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setExcludingTaxRedAmount(Double excludingTaxRedAmount) {
            this.excludingTaxRedAmount = excludingTaxRedAmount;
            return this;
        }
        public Double getExcludingTaxRedAmount() {
            return this.excludingTaxRedAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setExcludingTaxRemainAmount(Double excludingTaxRemainAmount) {
            this.excludingTaxRemainAmount = excludingTaxRemainAmount;
            return this;
        }
        public Double getExcludingTaxRemainAmount() {
            return this.excludingTaxRemainAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setGmtBill(String gmtBill) {
            this.gmtBill = gmtBill;
            return this;
        }
        public String getGmtBill() {
            return this.gmtBill;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setGmtBillEnd(String gmtBillEnd) {
            this.gmtBillEnd = gmtBillEnd;
            return this;
        }
        public String getGmtBillEnd() {
            return this.gmtBillEnd;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setGmtBillStart(String gmtBillStart) {
            this.gmtBillStart = gmtBillStart;
            return this;
        }
        public String getGmtBillStart() {
            return this.gmtBillStart;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setGmtBuild(String gmtBuild) {
            this.gmtBuild = gmtBuild;
            return this;
        }
        public String getGmtBuild() {
            return this.gmtBuild;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setIsApply(String isApply) {
            this.isApply = isApply;
            return this;
        }
        public String getIsApply() {
            return this.isApply;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setMajorBillNo(String majorBillNo) {
            this.majorBillNo = majorBillNo;
            return this;
        }
        public String getMajorBillNo() {
            return this.majorBillNo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setOuCode(String ouCode) {
            this.ouCode = ouCode;
            return this;
        }
        public String getOuCode() {
            return this.ouCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setParentCategory(String parentCategory) {
            this.parentCategory = parentCategory;
            return this;
        }
        public String getParentCategory() {
            return this.parentCategory;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setProductDomain(String productDomain) {
            this.productDomain = productDomain;
            return this;
        }
        public String getProductDomain() {
            return this.productDomain;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setQuantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }
        public Double getQuantity() {
            return this.quantity;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setQuantityUnit(String quantityUnit) {
            this.quantityUnit = quantityUnit;
            return this;
        }
        public String getQuantityUnit() {
            return this.quantityUnit;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setRedAmount(Double redAmount) {
            this.redAmount = redAmount;
            return this;
        }
        public Double getRedAmount() {
            return this.redAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setRelatedId(String relatedId) {
            this.relatedId = relatedId;
            return this;
        }
        public String getRelatedId() {
            return this.relatedId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setRemainAmount(Double remainAmount) {
            this.remainAmount = remainAmount;
            return this;
        }
        public Double getRemainAmount() {
            return this.remainAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setRevenueType(String revenueType) {
            this.revenueType = revenueType;
            return this;
        }
        public String getRevenueType() {
            return this.revenueType;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setTaxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public Double getTaxAmount() {
            return this.taxAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setTaxRate(Double taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public Double getTaxRate() {
            return this.taxRate;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Double getUnitPrice() {
            return this.unitPrice;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList extends TeaModel {
        @NameInMap("Amount")
        public Double amount;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("CargoName")
        public String cargoName;

        @NameInMap("DiscountAmount")
        public Double discountAmount;

        @NameInMap("DiscountTaxAmount")
        public Double discountTaxAmount;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("ExcludingTaxAmount")
        public Double excludingTaxAmount;

        @NameInMap("ExcludingTaxDiscountAmount")
        public Double excludingTaxDiscountAmount;

        @NameInMap("ExcludingTaxRedAmount")
        public Double excludingTaxRedAmount;

        @NameInMap("ExcludingTaxRemainAmount")
        public Double excludingTaxRemainAmount;

        @NameInMap("ExcludingTaxUnitPrice")
        public Double excludingTaxUnitPrice;

        @NameInMap("InvoiceDetailId")
        public Long invoiceDetailId;

        @NameInMap("Language")
        public String language;

        @NameInMap("Model")
        public String model;

        @NameInMap("Quantity")
        public Double quantity;

        @NameInMap("QuantityUnit")
        public String quantityUnit;

        @NameInMap("RedAmount")
        public Double redAmount;

        @NameInMap("RelatedId")
        public String relatedId;

        @NameInMap("RemainAmount")
        public Double remainAmount;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("SourceList")
        public java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList> sourceList;

        @NameInMap("TaxAmount")
        public Double taxAmount;

        @NameInMap("TaxRate")
        public Double taxRate;

        @NameInMap("UnitPrice")
        public Double unitPrice;

        @NameInMap("Uuid")
        public String uuid;

        public static QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList self = new QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList();
            return TeaModel.build(map, self);
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setCargoName(String cargoName) {
            this.cargoName = cargoName;
            return this;
        }
        public String getCargoName() {
            return this.cargoName;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setDiscountAmount(Double discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setDiscountTaxAmount(Double discountTaxAmount) {
            this.discountTaxAmount = discountTaxAmount;
            return this;
        }
        public Double getDiscountTaxAmount() {
            return this.discountTaxAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setExcludingTaxAmount(Double excludingTaxAmount) {
            this.excludingTaxAmount = excludingTaxAmount;
            return this;
        }
        public Double getExcludingTaxAmount() {
            return this.excludingTaxAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setExcludingTaxDiscountAmount(Double excludingTaxDiscountAmount) {
            this.excludingTaxDiscountAmount = excludingTaxDiscountAmount;
            return this;
        }
        public Double getExcludingTaxDiscountAmount() {
            return this.excludingTaxDiscountAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setExcludingTaxRedAmount(Double excludingTaxRedAmount) {
            this.excludingTaxRedAmount = excludingTaxRedAmount;
            return this;
        }
        public Double getExcludingTaxRedAmount() {
            return this.excludingTaxRedAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setExcludingTaxRemainAmount(Double excludingTaxRemainAmount) {
            this.excludingTaxRemainAmount = excludingTaxRemainAmount;
            return this;
        }
        public Double getExcludingTaxRemainAmount() {
            return this.excludingTaxRemainAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setExcludingTaxUnitPrice(Double excludingTaxUnitPrice) {
            this.excludingTaxUnitPrice = excludingTaxUnitPrice;
            return this;
        }
        public Double getExcludingTaxUnitPrice() {
            return this.excludingTaxUnitPrice;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setInvoiceDetailId(Long invoiceDetailId) {
            this.invoiceDetailId = invoiceDetailId;
            return this;
        }
        public Long getInvoiceDetailId() {
            return this.invoiceDetailId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setQuantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }
        public Double getQuantity() {
            return this.quantity;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setQuantityUnit(String quantityUnit) {
            this.quantityUnit = quantityUnit;
            return this;
        }
        public String getQuantityUnit() {
            return this.quantityUnit;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setRedAmount(Double redAmount) {
            this.redAmount = redAmount;
            return this;
        }
        public Double getRedAmount() {
            return this.redAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setRelatedId(String relatedId) {
            this.relatedId = relatedId;
            return this;
        }
        public String getRelatedId() {
            return this.relatedId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setRemainAmount(Double remainAmount) {
            this.remainAmount = remainAmount;
            return this;
        }
        public Double getRemainAmount() {
            return this.remainAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setSourceList(java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList> sourceList) {
            this.sourceList = sourceList;
            return this;
        }
        public java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailListSourceList> getSourceList() {
            return this.sourceList;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setTaxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public Double getTaxAmount() {
            return this.taxAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setTaxRate(Double taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public Double getTaxRate() {
            return this.taxRate;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Double getUnitPrice() {
            return this.unitPrice;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("CustomerId")
        public String customerId;

        @NameInMap("CustomerSite")
        public String customerSite;

        @NameInMap("CustomerSystem")
        public String customerSystem;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("Language")
        public String language;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Uuid")
        public String uuid;

        public static QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer self = new QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer();
            return TeaModel.build(map, self);
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer setCustomerSite(String customerSite) {
            this.customerSite = customerSite;
            return this;
        }
        public String getCustomerSite() {
            return this.customerSite;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer setCustomerSystem(String customerSystem) {
            this.customerSystem = customerSystem;
            return this;
        }
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("Customer")
        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer customer;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("GmtSend")
        public String gmtSend;

        @NameInMap("InvoiceCode")
        public String invoiceCode;

        @NameInMap("InvoiceDate")
        public String invoiceDate;

        @NameInMap("InvoiceId")
        public Long invoiceId;

        @NameInMap("InvoiceNo")
        public String invoiceNo;

        @NameInMap("InvoiceNos")
        public String invoiceNos;

        @NameInMap("Language")
        public String language;

        @NameInMap("LogisticsCompanies")
        public String logisticsCompanies;

        @NameInMap("RelatedId")
        public String relatedId;

        @NameInMap("Sender")
        public String sender;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("TrackingNumber")
        public String trackingNumber;

        @NameInMap("Uuid")
        public String uuid;

        public static QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo self = new QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo();
            return TeaModel.build(map, self);
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setCustomer(QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer customer) {
            this.customer = customer;
            return this;
        }
        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfoCustomer getCustomer() {
            return this.customer;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setGmtSend(String gmtSend) {
            this.gmtSend = gmtSend;
            return this;
        }
        public String getGmtSend() {
            return this.gmtSend;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setInvoiceDate(String invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }
        public String getInvoiceDate() {
            return this.invoiceDate;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setInvoiceNos(String invoiceNos) {
            this.invoiceNos = invoiceNos;
            return this;
        }
        public String getInvoiceNos() {
            return this.invoiceNos;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setLogisticsCompanies(String logisticsCompanies) {
            this.logisticsCompanies = logisticsCompanies;
            return this;
        }
        public String getLogisticsCompanies() {
            return this.logisticsCompanies;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setRelatedId(String relatedId) {
            this.relatedId = relatedId;
            return this;
        }
        public String getRelatedId() {
            return this.relatedId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setSender(String sender) {
            this.sender = sender;
            return this;
        }
        public String getSender() {
            return this.sender;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setTrackingNumber(String trackingNumber) {
            this.trackingNumber = trackingNumber;
            return this;
        }
        public String getTrackingNumber() {
            return this.trackingNumber;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryInvoiceInfoByRequestNoResponseBodyReturnValueList extends TeaModel {
        @NameInMap("Amount")
        public Double amount;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("CurrencyCode")
        public String currencyCode;

        @NameInMap("Customer")
        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer customer;

        @NameInMap("DetailList")
        public java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList> detailList;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("ExcludingTaxAmount")
        public Double excludingTaxAmount;

        @NameInMap("ExcludingTaxRedAmount")
        public Double excludingTaxRedAmount;

        @NameInMap("ExcludingTaxRemainAmount")
        public Double excludingTaxRemainAmount;

        @NameInMap("InvoiceCode")
        public String invoiceCode;

        @NameInMap("InvoiceDate")
        public String invoiceDate;

        @NameInMap("InvoiceId")
        public Long invoiceId;

        @NameInMap("InvoiceNo")
        public String invoiceNo;

        @NameInMap("InvoiceStatus")
        public String invoiceStatus;

        @NameInMap("InvoiceType")
        public String invoiceType;

        @NameInMap("IsRed")
        public Boolean isRed;

        @NameInMap("IsReissue")
        public Boolean isReissue;

        @NameInMap("Language")
        public String language;

        @NameInMap("LinkInvoiceCode")
        public String linkInvoiceCode;

        @NameInMap("LinkInvoiceNo")
        public String linkInvoiceNo;

        @NameInMap("LogisticsInfo")
        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo logisticsInfo;

        @NameInMap("MaterialType")
        public String materialType;

        @NameInMap("Memo")
        public String memo;

        @NameInMap("OuCode")
        public String ouCode;

        @NameInMap("PurchaserBankInfo")
        public String purchaserBankInfo;

        @NameInMap("PurchaserContactInfo")
        public String purchaserContactInfo;

        @NameInMap("PurchaserName")
        public String purchaserName;

        @NameInMap("PurchaserTaxNo")
        public String purchaserTaxNo;

        @NameInMap("RedAmount")
        public Double redAmount;

        @NameInMap("RelatedId")
        public String relatedId;

        @NameInMap("RemainAmount")
        public Double remainAmount;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("SiteId")
        public String siteId;

        @NameInMap("TaxAmount")
        public Double taxAmount;

        @NameInMap("Uuid")
        public String uuid;

        public static QueryInvoiceInfoByRequestNoResponseBodyReturnValueList build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoiceInfoByRequestNoResponseBodyReturnValueList self = new QueryInvoiceInfoByRequestNoResponseBodyReturnValueList();
            return TeaModel.build(map, self);
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setCustomer(QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer customer) {
            this.customer = customer;
            return this;
        }
        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListCustomer getCustomer() {
            return this.customer;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setDetailList(java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList> detailList) {
            this.detailList = detailList;
            return this;
        }
        public java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueListDetailList> getDetailList() {
            return this.detailList;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setExcludingTaxAmount(Double excludingTaxAmount) {
            this.excludingTaxAmount = excludingTaxAmount;
            return this;
        }
        public Double getExcludingTaxAmount() {
            return this.excludingTaxAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setExcludingTaxRedAmount(Double excludingTaxRedAmount) {
            this.excludingTaxRedAmount = excludingTaxRedAmount;
            return this;
        }
        public Double getExcludingTaxRedAmount() {
            return this.excludingTaxRedAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setExcludingTaxRemainAmount(Double excludingTaxRemainAmount) {
            this.excludingTaxRemainAmount = excludingTaxRemainAmount;
            return this;
        }
        public Double getExcludingTaxRemainAmount() {
            return this.excludingTaxRemainAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setInvoiceCode(String invoiceCode) {
            this.invoiceCode = invoiceCode;
            return this;
        }
        public String getInvoiceCode() {
            return this.invoiceCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setInvoiceDate(String invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }
        public String getInvoiceDate() {
            return this.invoiceDate;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setInvoiceId(Long invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }
        public Long getInvoiceId() {
            return this.invoiceId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setInvoiceNo(String invoiceNo) {
            this.invoiceNo = invoiceNo;
            return this;
        }
        public String getInvoiceNo() {
            return this.invoiceNo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setInvoiceStatus(String invoiceStatus) {
            this.invoiceStatus = invoiceStatus;
            return this;
        }
        public String getInvoiceStatus() {
            return this.invoiceStatus;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setInvoiceType(String invoiceType) {
            this.invoiceType = invoiceType;
            return this;
        }
        public String getInvoiceType() {
            return this.invoiceType;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setIsRed(Boolean isRed) {
            this.isRed = isRed;
            return this;
        }
        public Boolean getIsRed() {
            return this.isRed;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setIsReissue(Boolean isReissue) {
            this.isReissue = isReissue;
            return this;
        }
        public Boolean getIsReissue() {
            return this.isReissue;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setLinkInvoiceCode(String linkInvoiceCode) {
            this.linkInvoiceCode = linkInvoiceCode;
            return this;
        }
        public String getLinkInvoiceCode() {
            return this.linkInvoiceCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setLinkInvoiceNo(String linkInvoiceNo) {
            this.linkInvoiceNo = linkInvoiceNo;
            return this;
        }
        public String getLinkInvoiceNo() {
            return this.linkInvoiceNo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setLogisticsInfo(QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo logisticsInfo) {
            this.logisticsInfo = logisticsInfo;
            return this;
        }
        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueListLogisticsInfo getLogisticsInfo() {
            return this.logisticsInfo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setMaterialType(String materialType) {
            this.materialType = materialType;
            return this;
        }
        public String getMaterialType() {
            return this.materialType;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setMemo(String memo) {
            this.memo = memo;
            return this;
        }
        public String getMemo() {
            return this.memo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setOuCode(String ouCode) {
            this.ouCode = ouCode;
            return this;
        }
        public String getOuCode() {
            return this.ouCode;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setPurchaserBankInfo(String purchaserBankInfo) {
            this.purchaserBankInfo = purchaserBankInfo;
            return this;
        }
        public String getPurchaserBankInfo() {
            return this.purchaserBankInfo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setPurchaserContactInfo(String purchaserContactInfo) {
            this.purchaserContactInfo = purchaserContactInfo;
            return this;
        }
        public String getPurchaserContactInfo() {
            return this.purchaserContactInfo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setPurchaserName(String purchaserName) {
            this.purchaserName = purchaserName;
            return this;
        }
        public String getPurchaserName() {
            return this.purchaserName;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setPurchaserTaxNo(String purchaserTaxNo) {
            this.purchaserTaxNo = purchaserTaxNo;
            return this;
        }
        public String getPurchaserTaxNo() {
            return this.purchaserTaxNo;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setRedAmount(Double redAmount) {
            this.redAmount = redAmount;
            return this;
        }
        public Double getRedAmount() {
            return this.redAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setRelatedId(String relatedId) {
            this.relatedId = relatedId;
            return this;
        }
        public String getRelatedId() {
            return this.relatedId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setRemainAmount(Double remainAmount) {
            this.remainAmount = remainAmount;
            return this;
        }
        public Double getRemainAmount() {
            return this.remainAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setTaxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public Double getTaxAmount() {
            return this.taxAmount;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValueList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class QueryInvoiceInfoByRequestNoResponseBodyReturnValue extends TeaModel {
        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("List")
        public java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueList> list;

        @NameInMap("Sign")
        public String sign;

        public static QueryInvoiceInfoByRequestNoResponseBodyReturnValue build(java.util.Map<String, ?> map) throws Exception {
            QueryInvoiceInfoByRequestNoResponseBodyReturnValue self = new QueryInvoiceInfoByRequestNoResponseBodyReturnValue();
            return TeaModel.build(map, self);
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValue setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValue setList(java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<QueryInvoiceInfoByRequestNoResponseBodyReturnValueList> getList() {
            return this.list;
        }

        public QueryInvoiceInfoByRequestNoResponseBodyReturnValue setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

    }

}
