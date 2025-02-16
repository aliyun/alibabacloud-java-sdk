// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseRatePlanRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <strong>example:</strong>
     * <p>entranceplan</p>
     */
    @NameInMap("PlanCode")
    public String planCode;

    /**
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <strong>example:</strong>
     * <p>CNAME</p>
     */
    @NameInMap("Type")
    public String type;

    public static PurchaseRatePlanRequest build(java.util.Map<String, ?> map) throws Exception {
        PurchaseRatePlanRequest self = new PurchaseRatePlanRequest();
        return TeaModel.build(map, self);
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
