// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CreateCouponTemplateShrinkRequest extends TeaModel {
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
    public String productTypeShrink;

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

    public static CreateCouponTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCouponTemplateShrinkRequest self = new CreateCouponTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCouponTemplateShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateCouponTemplateShrinkRequest setApplicableProducts(String applicableProducts) {
        this.applicableProducts = applicableProducts;
        return this;
    }
    public String getApplicableProducts() {
        return this.applicableProducts;
    }

    public CreateCouponTemplateShrinkRequest setCostBearer(String costBearer) {
        this.costBearer = costBearer;
        return this;
    }
    public String getCostBearer() {
        return this.costBearer;
    }

    public CreateCouponTemplateShrinkRequest setCouponDescription(String couponDescription) {
        this.couponDescription = couponDescription;
        return this;
    }
    public String getCouponDescription() {
        return this.couponDescription;
    }

    public CreateCouponTemplateShrinkRequest setExpireddate(String expireddate) {
        this.expireddate = expireddate;
        return this;
    }
    public String getExpireddate() {
        return this.expireddate;
    }

    public CreateCouponTemplateShrinkRequest setLimitPerPerson(String limitPerPerson) {
        this.limitPerPerson = limitPerPerson;
        return this;
    }
    public String getLimitPerPerson() {
        return this.limitPerPerson;
    }

    public CreateCouponTemplateShrinkRequest setProductTypeShrink(String productTypeShrink) {
        this.productTypeShrink = productTypeShrink;
        return this;
    }
    public String getProductTypeShrink() {
        return this.productTypeShrink;
    }

    public CreateCouponTemplateShrinkRequest setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
        return this;
    }
    public String getPurchaseType() {
        return this.purchaseType;
    }

    public CreateCouponTemplateShrinkRequest setReasonForApplication(String reasonForApplication) {
        this.reasonForApplication = reasonForApplication;
        return this;
    }
    public String getReasonForApplication() {
        return this.reasonForApplication;
    }

    public CreateCouponTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateCouponTemplateShrinkRequest setVailddate(String vailddate) {
        this.vailddate = vailddate;
        return this;
    }
    public String getVailddate() {
        return this.vailddate;
    }

    public CreateCouponTemplateShrinkRequest setVaildperioddays(String vaildperioddays) {
        this.vaildperioddays = vaildperioddays;
        return this;
    }
    public String getVaildperioddays() {
        return this.vaildperioddays;
    }

    public CreateCouponTemplateShrinkRequest setValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }
    public String getValidUntil() {
        return this.validUntil;
    }

    public CreateCouponTemplateShrinkRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
