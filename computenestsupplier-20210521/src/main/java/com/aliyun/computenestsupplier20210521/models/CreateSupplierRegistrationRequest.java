// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class CreateSupplierRegistrationRequest extends TeaModel {
    /**
     * <p>Contact email</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:xxxx@xxx.com">xxxx@xxx.com</a></p>
     */
    @NameInMap("ContactEmail")
    public String contactEmail;

    /**
     * <p>Contact number</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>186xxxxxxxxx</p>
     */
    @NameInMap("ContactNumber")
    public String contactNumber;

    /**
     * <p>Contact person</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mike</p>
     */
    @NameInMap("ContactPerson")
    public String contactPerson;

    /**
     * <p>Contact person tiltle</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CTO</p>
     */
    @NameInMap("ContactPersonTitle")
    public String contactPersonTitle;

    /**
     * <p>Whether to enable the resell mode</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableResellerMode")
    public Boolean enableResellerMode;

    /**
     * <p>Annual product revenue</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("ProductAnnualRevenue")
    public String productAnnualRevenue;

    /**
     * <p>The business of product</p>
     * 
     * <strong>example:</strong>
     * <p>AI</p>
     */
    @NameInMap("ProductBusiness")
    public String productBusiness;

    /**
     * <p>Product delivery type</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductDeliveryTypes")
    public java.util.List<String> productDeliveryTypes;

    /**
     * <p>The publish time of product</p>
     * 
     * <strong>example:</strong>
     * <p>2020.10.10</p>
     */
    @NameInMap("ProductPublishTime")
    public String productPublishTime;

    /**
     * <p>Product sell type</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProductSellTypes")
    public java.util.List<String> productSellTypes;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of resell business.</p>
     * 
     * <strong>example:</strong>
     * <p>empty</p>
     */
    @NameInMap("ResellBusinessDesc")
    public String resellBusinessDesc;

    /**
     * <p>The demands of service providers.</p>
     * 
     * <strong>example:</strong>
     * <p>empty</p>
     */
    @NameInMap("Suggestion")
    public String suggestion;

    /**
     * <p>The description of service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test supplier</p>
     */
    @NameInMap("SupplierDesc")
    public String supplierDesc;

    /**
     * <p>The Logo of service provider.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/cover/34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/34DB-4F4C-9373-003AA060****.png</a></p>
     */
    @NameInMap("SupplierLogo")
    public String supplierLogo;

    /**
     * <p>The name of the service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud</p>
     */
    @NameInMap("SupplierName")
    public String supplierName;

    /**
     * <p>The english name of the service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud</p>
     */
    @NameInMap("SupplierNameEn")
    public String supplierNameEn;

    /**
     * <p>The URL of the service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.xxx.xxx.cn">http://www.xxx.xxx.cn</a></p>
     */
    @NameInMap("SupplierUrl")
    public String supplierUrl;

    public static CreateSupplierRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSupplierRegistrationRequest self = new CreateSupplierRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateSupplierRegistrationRequest setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }
    public String getContactEmail() {
        return this.contactEmail;
    }

    public CreateSupplierRegistrationRequest setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return this;
    }
    public String getContactNumber() {
        return this.contactNumber;
    }

    public CreateSupplierRegistrationRequest setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
        return this;
    }
    public String getContactPerson() {
        return this.contactPerson;
    }

    public CreateSupplierRegistrationRequest setContactPersonTitle(String contactPersonTitle) {
        this.contactPersonTitle = contactPersonTitle;
        return this;
    }
    public String getContactPersonTitle() {
        return this.contactPersonTitle;
    }

    public CreateSupplierRegistrationRequest setEnableResellerMode(Boolean enableResellerMode) {
        this.enableResellerMode = enableResellerMode;
        return this;
    }
    public Boolean getEnableResellerMode() {
        return this.enableResellerMode;
    }

    public CreateSupplierRegistrationRequest setProductAnnualRevenue(String productAnnualRevenue) {
        this.productAnnualRevenue = productAnnualRevenue;
        return this;
    }
    public String getProductAnnualRevenue() {
        return this.productAnnualRevenue;
    }

    public CreateSupplierRegistrationRequest setProductBusiness(String productBusiness) {
        this.productBusiness = productBusiness;
        return this;
    }
    public String getProductBusiness() {
        return this.productBusiness;
    }

    public CreateSupplierRegistrationRequest setProductDeliveryTypes(java.util.List<String> productDeliveryTypes) {
        this.productDeliveryTypes = productDeliveryTypes;
        return this;
    }
    public java.util.List<String> getProductDeliveryTypes() {
        return this.productDeliveryTypes;
    }

    public CreateSupplierRegistrationRequest setProductPublishTime(String productPublishTime) {
        this.productPublishTime = productPublishTime;
        return this;
    }
    public String getProductPublishTime() {
        return this.productPublishTime;
    }

    public CreateSupplierRegistrationRequest setProductSellTypes(java.util.List<String> productSellTypes) {
        this.productSellTypes = productSellTypes;
        return this;
    }
    public java.util.List<String> getProductSellTypes() {
        return this.productSellTypes;
    }

    public CreateSupplierRegistrationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSupplierRegistrationRequest setResellBusinessDesc(String resellBusinessDesc) {
        this.resellBusinessDesc = resellBusinessDesc;
        return this;
    }
    public String getResellBusinessDesc() {
        return this.resellBusinessDesc;
    }

    public CreateSupplierRegistrationRequest setSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }
    public String getSuggestion() {
        return this.suggestion;
    }

    public CreateSupplierRegistrationRequest setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc;
        return this;
    }
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    public CreateSupplierRegistrationRequest setSupplierLogo(String supplierLogo) {
        this.supplierLogo = supplierLogo;
        return this;
    }
    public String getSupplierLogo() {
        return this.supplierLogo;
    }

    public CreateSupplierRegistrationRequest setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public CreateSupplierRegistrationRequest setSupplierNameEn(String supplierNameEn) {
        this.supplierNameEn = supplierNameEn;
        return this;
    }
    public String getSupplierNameEn() {
        return this.supplierNameEn;
    }

    public CreateSupplierRegistrationRequest setSupplierUrl(String supplierUrl) {
        this.supplierUrl = supplierUrl;
        return this;
    }
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

}
