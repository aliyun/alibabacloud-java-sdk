// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ApplyArInvoiceWithSourceRequest extends TeaModel {
    @NameInMap("Address")
    public ApplyArInvoiceWithSourceRequestAddress address;

    @NameInMap("Amount")
    public Double amount;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Applier")
    public String applier;

    @NameInMap("ApplyDate")
    public String applyDate;

    @NameInMap("CurrencyCode")
    public String currencyCode;

    @NameInMap("Customer")
    public ApplyArInvoiceWithSourceRequestCustomer customer;

    @NameInMap("EncryptProps")
    public java.util.Map<String, String> encryptProps;

    @NameInMap("ExcludingTaxAmount")
    public Double excludingTaxAmount;

    @NameInMap("InputType")
    public String inputType;

    @NameInMap("InvoiceType")
    public String invoiceType;

    @NameInMap("IsMerged")
    public Boolean isMerged;

    @NameInMap("Language")
    public String language;

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

    @NameInMap("RequestNo")
    public String requestNo;

    @NameInMap("Sign")
    public String sign;

    @NameInMap("SiteId")
    public String siteId;

    @NameInMap("SourceList")
    public java.util.List<ApplyArInvoiceWithSourceRequestSourceList> sourceList;

    @NameInMap("TaxAmount")
    public Double taxAmount;

    @NameInMap("Uuid")
    public String uuid;

    public static ApplyArInvoiceWithSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyArInvoiceWithSourceRequest self = new ApplyArInvoiceWithSourceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyArInvoiceWithSourceRequest setAddress(ApplyArInvoiceWithSourceRequestAddress address) {
        this.address = address;
        return this;
    }
    public ApplyArInvoiceWithSourceRequestAddress getAddress() {
        return this.address;
    }

    public ApplyArInvoiceWithSourceRequest setAmount(Double amount) {
        this.amount = amount;
        return this;
    }
    public Double getAmount() {
        return this.amount;
    }

    public ApplyArInvoiceWithSourceRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ApplyArInvoiceWithSourceRequest setApplier(String applier) {
        this.applier = applier;
        return this;
    }
    public String getApplier() {
        return this.applier;
    }

    public ApplyArInvoiceWithSourceRequest setApplyDate(String applyDate) {
        this.applyDate = applyDate;
        return this;
    }
    public String getApplyDate() {
        return this.applyDate;
    }

    public ApplyArInvoiceWithSourceRequest setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }
    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public ApplyArInvoiceWithSourceRequest setCustomer(ApplyArInvoiceWithSourceRequestCustomer customer) {
        this.customer = customer;
        return this;
    }
    public ApplyArInvoiceWithSourceRequestCustomer getCustomer() {
        return this.customer;
    }

    public ApplyArInvoiceWithSourceRequest setEncryptProps(java.util.Map<String, String> encryptProps) {
        this.encryptProps = encryptProps;
        return this;
    }
    public java.util.Map<String, String> getEncryptProps() {
        return this.encryptProps;
    }

    public ApplyArInvoiceWithSourceRequest setExcludingTaxAmount(Double excludingTaxAmount) {
        this.excludingTaxAmount = excludingTaxAmount;
        return this;
    }
    public Double getExcludingTaxAmount() {
        return this.excludingTaxAmount;
    }

    public ApplyArInvoiceWithSourceRequest setInputType(String inputType) {
        this.inputType = inputType;
        return this;
    }
    public String getInputType() {
        return this.inputType;
    }

    public ApplyArInvoiceWithSourceRequest setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }
    public String getInvoiceType() {
        return this.invoiceType;
    }

    public ApplyArInvoiceWithSourceRequest setIsMerged(Boolean isMerged) {
        this.isMerged = isMerged;
        return this;
    }
    public Boolean getIsMerged() {
        return this.isMerged;
    }

    public ApplyArInvoiceWithSourceRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ApplyArInvoiceWithSourceRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public ApplyArInvoiceWithSourceRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ApplyArInvoiceWithSourceRequest setOuCode(String ouCode) {
        this.ouCode = ouCode;
        return this;
    }
    public String getOuCode() {
        return this.ouCode;
    }

    public ApplyArInvoiceWithSourceRequest setPurchaserBankInfo(String purchaserBankInfo) {
        this.purchaserBankInfo = purchaserBankInfo;
        return this;
    }
    public String getPurchaserBankInfo() {
        return this.purchaserBankInfo;
    }

    public ApplyArInvoiceWithSourceRequest setPurchaserContactInfo(String purchaserContactInfo) {
        this.purchaserContactInfo = purchaserContactInfo;
        return this;
    }
    public String getPurchaserContactInfo() {
        return this.purchaserContactInfo;
    }

    public ApplyArInvoiceWithSourceRequest setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
        return this;
    }
    public String getPurchaserName() {
        return this.purchaserName;
    }

    public ApplyArInvoiceWithSourceRequest setPurchaserTaxNo(String purchaserTaxNo) {
        this.purchaserTaxNo = purchaserTaxNo;
        return this;
    }
    public String getPurchaserTaxNo() {
        return this.purchaserTaxNo;
    }

    public ApplyArInvoiceWithSourceRequest setRequestNo(String requestNo) {
        this.requestNo = requestNo;
        return this;
    }
    public String getRequestNo() {
        return this.requestNo;
    }

    public ApplyArInvoiceWithSourceRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public ApplyArInvoiceWithSourceRequest setSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
    public String getSiteId() {
        return this.siteId;
    }

    public ApplyArInvoiceWithSourceRequest setSourceList(java.util.List<ApplyArInvoiceWithSourceRequestSourceList> sourceList) {
        this.sourceList = sourceList;
        return this;
    }
    public java.util.List<ApplyArInvoiceWithSourceRequestSourceList> getSourceList() {
        return this.sourceList;
    }

    public ApplyArInvoiceWithSourceRequest setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }
    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public ApplyArInvoiceWithSourceRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public static class ApplyArInvoiceWithSourceRequestAddressCustomer extends TeaModel {
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

        public static ApplyArInvoiceWithSourceRequestAddressCustomer build(java.util.Map<String, ?> map) throws Exception {
            ApplyArInvoiceWithSourceRequestAddressCustomer self = new ApplyArInvoiceWithSourceRequestAddressCustomer();
            return TeaModel.build(map, self);
        }

        public ApplyArInvoiceWithSourceRequestAddressCustomer setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ApplyArInvoiceWithSourceRequestAddressCustomer setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ApplyArInvoiceWithSourceRequestAddressCustomer setCustomerSite(String customerSite) {
            this.customerSite = customerSite;
            return this;
        }
        public String getCustomerSite() {
            return this.customerSite;
        }

        public ApplyArInvoiceWithSourceRequestAddressCustomer setCustomerSystem(String customerSystem) {
            this.customerSystem = customerSystem;
            return this;
        }
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        public ApplyArInvoiceWithSourceRequestAddressCustomer setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public ApplyArInvoiceWithSourceRequestAddressCustomer setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ApplyArInvoiceWithSourceRequestAddressCustomer setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ApplyArInvoiceWithSourceRequestAddressCustomer setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ApplyArInvoiceWithSourceRequestAddress extends TeaModel {
        @NameInMap("AddressId")
        public String addressId;

        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("City")
        public String city;

        @NameInMap("Country")
        public String country;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Customer")
        public ApplyArInvoiceWithSourceRequestAddressCustomer customer;

        @NameInMap("DetailedAddress")
        public String detailedAddress;

        @NameInMap("District")
        public String district;

        @NameInMap("EncryptProps")
        public java.util.Map<String, String> encryptProps;

        @NameInMap("FixedNumber")
        public String fixedNumber;

        @NameInMap("FullAddress")
        public String fullAddress;

        @NameInMap("IsDefault")
        public Boolean isDefault;

        @NameInMap("IsEffective")
        public Boolean isEffective;

        @NameInMap("Language")
        public String language;

        @NameInMap("MobileNumber")
        public String mobileNumber;

        @NameInMap("Province")
        public String province;

        @NameInMap("RecipientName")
        public String recipientName;

        @NameInMap("RelatedId")
        public String relatedId;

        @NameInMap("RelatedSystem")
        public String relatedSystem;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("Street")
        public String street;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("ZipCode")
        public String zipCode;

        public static ApplyArInvoiceWithSourceRequestAddress build(java.util.Map<String, ?> map) throws Exception {
            ApplyArInvoiceWithSourceRequestAddress self = new ApplyArInvoiceWithSourceRequestAddress();
            return TeaModel.build(map, self);
        }

        public ApplyArInvoiceWithSourceRequestAddress setAddressId(String addressId) {
            this.addressId = addressId;
            return this;
        }
        public String getAddressId() {
            return this.addressId;
        }

        public ApplyArInvoiceWithSourceRequestAddress setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ApplyArInvoiceWithSourceRequestAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ApplyArInvoiceWithSourceRequestAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public ApplyArInvoiceWithSourceRequestAddress setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ApplyArInvoiceWithSourceRequestAddress setCustomer(ApplyArInvoiceWithSourceRequestAddressCustomer customer) {
            this.customer = customer;
            return this;
        }
        public ApplyArInvoiceWithSourceRequestAddressCustomer getCustomer() {
            return this.customer;
        }

        public ApplyArInvoiceWithSourceRequestAddress setDetailedAddress(String detailedAddress) {
            this.detailedAddress = detailedAddress;
            return this;
        }
        public String getDetailedAddress() {
            return this.detailedAddress;
        }

        public ApplyArInvoiceWithSourceRequestAddress setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public ApplyArInvoiceWithSourceRequestAddress setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public ApplyArInvoiceWithSourceRequestAddress setFixedNumber(String fixedNumber) {
            this.fixedNumber = fixedNumber;
            return this;
        }
        public String getFixedNumber() {
            return this.fixedNumber;
        }

        public ApplyArInvoiceWithSourceRequestAddress setFullAddress(String fullAddress) {
            this.fullAddress = fullAddress;
            return this;
        }
        public String getFullAddress() {
            return this.fullAddress;
        }

        public ApplyArInvoiceWithSourceRequestAddress setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ApplyArInvoiceWithSourceRequestAddress setIsEffective(Boolean isEffective) {
            this.isEffective = isEffective;
            return this;
        }
        public Boolean getIsEffective() {
            return this.isEffective;
        }

        public ApplyArInvoiceWithSourceRequestAddress setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ApplyArInvoiceWithSourceRequestAddress setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }
        public String getMobileNumber() {
            return this.mobileNumber;
        }

        public ApplyArInvoiceWithSourceRequestAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ApplyArInvoiceWithSourceRequestAddress setRecipientName(String recipientName) {
            this.recipientName = recipientName;
            return this;
        }
        public String getRecipientName() {
            return this.recipientName;
        }

        public ApplyArInvoiceWithSourceRequestAddress setRelatedId(String relatedId) {
            this.relatedId = relatedId;
            return this;
        }
        public String getRelatedId() {
            return this.relatedId;
        }

        public ApplyArInvoiceWithSourceRequestAddress setRelatedSystem(String relatedSystem) {
            this.relatedSystem = relatedSystem;
            return this;
        }
        public String getRelatedSystem() {
            return this.relatedSystem;
        }

        public ApplyArInvoiceWithSourceRequestAddress setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ApplyArInvoiceWithSourceRequestAddress setStreet(String street) {
            this.street = street;
            return this;
        }
        public String getStreet() {
            return this.street;
        }

        public ApplyArInvoiceWithSourceRequestAddress setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ApplyArInvoiceWithSourceRequestAddress setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public String getZipCode() {
            return this.zipCode;
        }

    }

    public static class ApplyArInvoiceWithSourceRequestCustomer extends TeaModel {
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

        public static ApplyArInvoiceWithSourceRequestCustomer build(java.util.Map<String, ?> map) throws Exception {
            ApplyArInvoiceWithSourceRequestCustomer self = new ApplyArInvoiceWithSourceRequestCustomer();
            return TeaModel.build(map, self);
        }

        public ApplyArInvoiceWithSourceRequestCustomer setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ApplyArInvoiceWithSourceRequestCustomer setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ApplyArInvoiceWithSourceRequestCustomer setCustomerSite(String customerSite) {
            this.customerSite = customerSite;
            return this;
        }
        public String getCustomerSite() {
            return this.customerSite;
        }

        public ApplyArInvoiceWithSourceRequestCustomer setCustomerSystem(String customerSystem) {
            this.customerSystem = customerSystem;
            return this;
        }
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        public ApplyArInvoiceWithSourceRequestCustomer setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public ApplyArInvoiceWithSourceRequestCustomer setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ApplyArInvoiceWithSourceRequestCustomer setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ApplyArInvoiceWithSourceRequestCustomer setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ApplyArInvoiceWithSourceRequestSourceListCustomer extends TeaModel {
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

        public static ApplyArInvoiceWithSourceRequestSourceListCustomer build(java.util.Map<String, ?> map) throws Exception {
            ApplyArInvoiceWithSourceRequestSourceListCustomer self = new ApplyArInvoiceWithSourceRequestSourceListCustomer();
            return TeaModel.build(map, self);
        }

        public ApplyArInvoiceWithSourceRequestSourceListCustomer setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ApplyArInvoiceWithSourceRequestSourceListCustomer setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ApplyArInvoiceWithSourceRequestSourceListCustomer setCustomerSite(String customerSite) {
            this.customerSite = customerSite;
            return this;
        }
        public String getCustomerSite() {
            return this.customerSite;
        }

        public ApplyArInvoiceWithSourceRequestSourceListCustomer setCustomerSystem(String customerSystem) {
            this.customerSystem = customerSystem;
            return this;
        }
        public String getCustomerSystem() {
            return this.customerSystem;
        }

        public ApplyArInvoiceWithSourceRequestSourceListCustomer setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public ApplyArInvoiceWithSourceRequestSourceListCustomer setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ApplyArInvoiceWithSourceRequestSourceListCustomer setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ApplyArInvoiceWithSourceRequestSourceListCustomer setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ApplyArInvoiceWithSourceRequestSourceList extends TeaModel {
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
        public ApplyArInvoiceWithSourceRequestSourceListCustomer customer;

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

        public static ApplyArInvoiceWithSourceRequestSourceList build(java.util.Map<String, ?> map) throws Exception {
            ApplyArInvoiceWithSourceRequestSourceList self = new ApplyArInvoiceWithSourceRequestSourceList();
            return TeaModel.build(map, self);
        }

        public ApplyArInvoiceWithSourceRequestSourceList setAmount(Double amount) {
            this.amount = amount;
            return this;
        }
        public Double getAmount() {
            return this.amount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setBillAmount(Double billAmount) {
            this.billAmount = billAmount;
            return this;
        }
        public Double getBillAmount() {
            return this.billAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setBillDomain(String billDomain) {
            this.billDomain = billDomain;
            return this;
        }
        public String getBillDomain() {
            return this.billDomain;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setBillNo(String billNo) {
            this.billNo = billNo;
            return this;
        }
        public String getBillNo() {
            return this.billNo;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setBillType(String billType) {
            this.billType = billType;
            return this;
        }
        public String getBillType() {
            return this.billType;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setBlueSourceId(Long blueSourceId) {
            this.blueSourceId = blueSourceId;
            return this;
        }
        public Long getBlueSourceId() {
            return this.blueSourceId;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setCanMerge(Boolean canMerge) {
            this.canMerge = canMerge;
            return this;
        }
        public Boolean getCanMerge() {
            return this.canMerge;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setCargoName(String cargoName) {
            this.cargoName = cargoName;
            return this;
        }
        public String getCargoName() {
            return this.cargoName;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }
        public String getCurrencyCode() {
            return this.currencyCode;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setCustomer(ApplyArInvoiceWithSourceRequestSourceListCustomer customer) {
            this.customer = customer;
            return this;
        }
        public ApplyArInvoiceWithSourceRequestSourceListCustomer getCustomer() {
            return this.customer;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setDiscountAmount(Double discountAmount) {
            this.discountAmount = discountAmount;
            return this;
        }
        public Double getDiscountAmount() {
            return this.discountAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setDiscountTaxAmount(Double discountTaxAmount) {
            this.discountTaxAmount = discountTaxAmount;
            return this;
        }
        public Double getDiscountTaxAmount() {
            return this.discountTaxAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setEncryptProps(java.util.Map<String, String> encryptProps) {
            this.encryptProps = encryptProps;
            return this;
        }
        public java.util.Map<String, String> getEncryptProps() {
            return this.encryptProps;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setExcludingTaxAmount(Double excludingTaxAmount) {
            this.excludingTaxAmount = excludingTaxAmount;
            return this;
        }
        public Double getExcludingTaxAmount() {
            return this.excludingTaxAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setExcludingTaxDiscountAmount(Double excludingTaxDiscountAmount) {
            this.excludingTaxDiscountAmount = excludingTaxDiscountAmount;
            return this;
        }
        public Double getExcludingTaxDiscountAmount() {
            return this.excludingTaxDiscountAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setExcludingTaxRedAmount(Double excludingTaxRedAmount) {
            this.excludingTaxRedAmount = excludingTaxRedAmount;
            return this;
        }
        public Double getExcludingTaxRedAmount() {
            return this.excludingTaxRedAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setExcludingTaxRemainAmount(Double excludingTaxRemainAmount) {
            this.excludingTaxRemainAmount = excludingTaxRemainAmount;
            return this;
        }
        public Double getExcludingTaxRemainAmount() {
            return this.excludingTaxRemainAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setGmtBill(String gmtBill) {
            this.gmtBill = gmtBill;
            return this;
        }
        public String getGmtBill() {
            return this.gmtBill;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setGmtBillEnd(String gmtBillEnd) {
            this.gmtBillEnd = gmtBillEnd;
            return this;
        }
        public String getGmtBillEnd() {
            return this.gmtBillEnd;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setGmtBillStart(String gmtBillStart) {
            this.gmtBillStart = gmtBillStart;
            return this;
        }
        public String getGmtBillStart() {
            return this.gmtBillStart;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setGmtBuild(String gmtBuild) {
            this.gmtBuild = gmtBuild;
            return this;
        }
        public String getGmtBuild() {
            return this.gmtBuild;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setIsApply(String isApply) {
            this.isApply = isApply;
            return this;
        }
        public String getIsApply() {
            return this.isApply;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setMajorBillNo(String majorBillNo) {
            this.majorBillNo = majorBillNo;
            return this;
        }
        public String getMajorBillNo() {
            return this.majorBillNo;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setOuCode(String ouCode) {
            this.ouCode = ouCode;
            return this;
        }
        public String getOuCode() {
            return this.ouCode;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setParentCategory(String parentCategory) {
            this.parentCategory = parentCategory;
            return this;
        }
        public String getParentCategory() {
            return this.parentCategory;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setProductDomain(String productDomain) {
            this.productDomain = productDomain;
            return this;
        }
        public String getProductDomain() {
            return this.productDomain;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setQuantity(Double quantity) {
            this.quantity = quantity;
            return this;
        }
        public Double getQuantity() {
            return this.quantity;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setQuantityUnit(String quantityUnit) {
            this.quantityUnit = quantityUnit;
            return this;
        }
        public String getQuantityUnit() {
            return this.quantityUnit;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setRedAmount(Double redAmount) {
            this.redAmount = redAmount;
            return this;
        }
        public Double getRedAmount() {
            return this.redAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setRelatedId(String relatedId) {
            this.relatedId = relatedId;
            return this;
        }
        public String getRelatedId() {
            return this.relatedId;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setRemainAmount(Double remainAmount) {
            this.remainAmount = remainAmount;
            return this;
        }
        public Double getRemainAmount() {
            return this.remainAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setRevenueType(String revenueType) {
            this.revenueType = revenueType;
            return this;
        }
        public String getRevenueType() {
            return this.revenueType;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setSiteId(String siteId) {
            this.siteId = siteId;
            return this;
        }
        public String getSiteId() {
            return this.siteId;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setTaxAmount(Double taxAmount) {
            this.taxAmount = taxAmount;
            return this;
        }
        public Double getTaxAmount() {
            return this.taxAmount;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setTaxRate(Double taxRate) {
            this.taxRate = taxRate;
            return this;
        }
        public Double getTaxRate() {
            return this.taxRate;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Double getUnitPrice() {
            return this.unitPrice;
        }

        public ApplyArInvoiceWithSourceRequestSourceList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
