// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All Products</p>
     */
    @NameInMap("ApplicableProducts")
    public String applicableProducts;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Partner</p>
     */
    @NameInMap("CostBearer")
    public String costBearer;

    @NameInMap("CouponDescription")
    public String couponDescription;

    /**
     * <strong>example:</strong>
     * <p>2024-08-26</p>
     */
    @NameInMap("Expireddate")
    public String expireddate;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Unlimited</p>
     */
    @NameInMap("LimitPerPerson")
    public String limitPerPerson;

    @NameInMap("ProductType")
    public java.util.List<String> productType;

    /**
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("PurchaseType")
    public String purchaseType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReasonForApplication")
    public String reasonForApplication;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <strong>example:</strong>
     * <p>2024-08-26</p>
     */
    @NameInMap("Vailddate")
    public String vailddate;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Vaildperioddays")
    public String vaildperioddays;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Validity Duration</p>
     */
    @NameInMap("ValidUntil")
    public String validUntil;

    /**
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
