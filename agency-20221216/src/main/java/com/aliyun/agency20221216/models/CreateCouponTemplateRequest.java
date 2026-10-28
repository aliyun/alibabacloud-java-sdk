// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateRequest extends TeaModel {
    /**
     * <p>The accepted language.
     * Default value: None.
     * Valid values:</p>
     * <ul>
     * <li>zh-CN: Chinese.</li>
     * <li>en-US: English.</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The applicable products.</p>
     * <ul>
     * <li>All Products: All products.</li>
     * <li>Custom: Custom products.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All Products</p>
     */
    @NameInMap("ApplicableProducts")
    public String applicableProducts;

    /**
     * <p>The party that bears the coupon cost.</p>
     * <ul>
     * <li>Partner: Borne by the partner.</li>
     * <li>Alibaba Cloud: Borne by Alibaba Cloud.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Partner</p>
     */
    @NameInMap("CostBearer")
    public String costBearer;

    /**
     * <p>The remark for the coupon.
     * The field length is limited to 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Coupon remark</p>
     */
    @NameInMap("CouponDescription")
    public String couponDescription;

    /**
     * <p>The end time of the effective period.
     * Format: yyyy-MM-dd.
     * Example: 2024-08-26.<br>This parameter is required when the validity period is set to Custom Timeframe.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-26</p>
     */
    @NameInMap("Expireddate")
    public String expireddate;

    /**
     * <p>The maximum number of coupons that each person can claim.</p>
     * <ul>
     * <li>Limited to 1: Limited to one coupon.</li>
     * <li>Unlimited: Unlimited.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlimited</p>
     */
    @NameInMap("LimitPerPerson")
    public String limitPerPerson;

    /**
     * <p>The list of product codes.</p>
     */
    @NameInMap("ProductType")
    public java.util.List<String> productType;

    /**
     * <p>The order type.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("PurchaseType")
    public String purchaseType;

    /**
     * <p>The reason for the template application.
     * The field length is limited to 100 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Reason for template application</p>
     */
    @NameInMap("ReasonForApplication")
    public String reasonForApplication;

    /**
     * <p>The template name.
     * The field length is limited to 30 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Template name</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The start time of the effective period.
     * Format: yyyy-MM-dd.
     * Example: 2024-08-26.<br>This parameter is required when the validity period is set to Custom Timeframe.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-26</p>
     */
    @NameInMap("Vailddate")
    public String vailddate;

    /**
     * <p>The duration of the relative time in days.
     * The value must be a positive integer.
     * This parameter is required when the validity period is set to Validity Duration.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Vaildperioddays")
    public String vaildperioddays;

    /**
     * <p>The validity period of the coupon.</p>
     * <ul>
     * <li>Validity Duration: From the date of issuance.</li>
     * <li>Custom Timeframe: Custom time period.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Validity Duration</p>
     */
    @NameInMap("ValidUntil")
    public String validUntil;

    /**
     * <p>The denomination of the coupon.
     * The value must be an integer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateCouponTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponTemplateRequest self = new CreateCouponTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCouponTemplateRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCouponTemplateRequest setApplicableProducts(String applicableProducts) {
        this.applicableProducts = applicableProducts;
        return this;
    }
    public String getApplicableProducts() {
        return this.applicableProducts;
    }

    public CreateCouponTemplateRequest setCostBearer(String costBearer) {
        this.costBearer = costBearer;
        return this;
    }
    public String getCostBearer() {
        return this.costBearer;
    }

    public CreateCouponTemplateRequest setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
        return this;
    }
    public String getCouponDescription() {
        return this.couponDescription;
    }

    public CreateCouponTemplateRequest setExpireddate(String expireddate) {
        this.expireddate = expireddate;
        return this;
    }
    public String getExpireddate() {
        return this.expireddate;
    }

    public CreateCouponTemplateRequest setLimitPerPerson(String limitPerPerson) {
        this.limitPerPerson = limitPerPerson;
        return this;
    }
    public String getLimitPerPerson() {
        return this.limitPerPerson;
    }

    public CreateCouponTemplateRequest setProductType(java.util.List<String> productType) {
        this.productType = productType;
        return this;
    }
    public java.util.List<String> getProductType() {
        return this.productType;
    }

    public CreateCouponTemplateRequest setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
        return this;
    }
    public String getPurchaseType() {
        return this.purchaseType;
    }

    public CreateCouponTemplateRequest setReasonForApplication(String reasonForApplication) {
        this.reasonForApplication = reasonForApplication;
        return this;
    }
    public String getReasonForApplication() {
        return this.reasonForApplication;
    }

    public CreateCouponTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateCouponTemplateRequest setVailddate(String vailddate) {
        this.vailddate = vailddate;
        return this;
    }
    public String getVailddate() {
        return this.vailddate;
    }

    public CreateCouponTemplateRequest setVaildperioddays(String vaildperioddays) {
        this.vaildperioddays = vaildperioddays;
        return this;
    }
    public String getVaildperioddays() {
        return this.vaildperioddays;
    }

    public CreateCouponTemplateRequest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public CreateCouponTemplateRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
