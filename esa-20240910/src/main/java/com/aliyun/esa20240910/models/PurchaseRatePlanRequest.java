// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseRatePlanRequest extends TeaModel {
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable auto payment.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Auto-renewal:</p>
     * <ul>
     * <li>true: Enable auto-renewal.</li>
     * <li>false: Disable auto-renewal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PREPAY: subscription.</li>
     * <li>POSTPAY: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The service location. Valid values:</p>
     * <ul>
     * <li>domestic: the Chinese mainland.</li>
     * <li>global: global.</li>
     * <li>overseas: outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <p>Subscription period (in months).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>Package code.</p>
     * 
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("PlanCode")
    public String planCode;

    /**
     * <p>Package name.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>Site name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>The DNS setup option for the website. Valid values:</p>
     * <ul>
     * <li>NS</li>
     * <li>CNAME</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CNAME</p>
     */
    @NameInMap("Type")
    public String type;

    public static PurchaseRatePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseRatePlanRequest self = new PurchaseRatePlanRequest();
        return TeaModel.build(map, self);
    }

    public PurchaseRatePlanRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public PurchaseRatePlanRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public PurchaseRatePlanRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public PurchaseRatePlanRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public PurchaseRatePlanRequest setCoverage(String coverage) {
        this.coverage = coverage;
        return this;
    }
    public String getCoverage() {
        return this.coverage;
    }

    public PurchaseRatePlanRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public PurchaseRatePlanRequest setPlanCode(String planCode) {
        this.planCode = planCode;
        return this;
    }
    public String getPlanCode() {
        return this.planCode;
    }

    public PurchaseRatePlanRequest setPlanName(String planName) {
        this.planName = planName;
        return this;
    }
    public String getPlanName() {
        return this.planName;
    }

    public PurchaseRatePlanRequest setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public PurchaseRatePlanRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
