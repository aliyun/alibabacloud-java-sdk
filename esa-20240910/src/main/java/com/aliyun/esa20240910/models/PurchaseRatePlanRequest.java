// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PurchaseRatePlanRequest extends TeaModel {
    /**
     * <p>The number of plans to purchase.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Amount")
    public Integer amount;

    /**
     * <p>Specifies whether to enable automatic payment. Set this parameter to true when you directly call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>true: Auto-renewal is enabled.</li>
     * <li>false: Auto-renewal is not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The channel field.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxWodkxxx</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PREPAY: subscription.</li>
     * <li>POSTPAY: pay-as-you-go.</li>
     * </ul>
     * <p>Set this parameter to PREPAY when you directly call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The acceleration region. Valid values:</p>
     * <ul>
     * <li>domestic: the Chinese mainland only.</li>
     * <li>global: global.</li>
     * <li>overseas: global (excluding the Chinese mainland).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domestic</p>
     */
    @NameInMap("Coverage")
    public String coverage;

    @NameInMap("OveragePolicy")
    public String overagePolicy;

    /**
     * <p>The purchase period, in months. This parameter is required when you directly call this operation.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The plan code.</p>
     * <p>Chinese site</p>
     * <ul>
     * <li>Free Edition: entranceplan</li>
     * <li>Basic: basicplan</li>
     * <li>Standard: standardplan</li>
     * <li>Advanced: advancedplan</li>
     * </ul>
     * <p>International site</p>
     * <ul>
     * <li>Entrance: entranceplan</li>
     * <li>Pro: standardplan</li>
     * <li>Premium: advancedpla</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basicplan</p>
     */
    @NameInMap("PlanCode")
    public String planCode;

    /**
     * <p>The plan name.</p>
     * <p>Chinese site</p>
     * <ul>
     * <li>Free Edition: entranceplan</li>
     * <li>Basic: basic</li>
     * <li>Standard: medium</li>
     * <li>Advanced: high</li>
     * </ul>
     * <p>International site</p>
     * <ul>
     * <li>Entrance: entranceplan_intl</li>
     * <li>Pro: basicplan_intl</li>
     * <li>Premium: vipplan_intl</li>
     * </ul>
     * <p>Note: For Enterprise Edition plans, the plan name is provided after backend configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("PlanName")
    public String planName;

    /**
     * <p>The site name.</p>
     * 
     * <strong>example:</strong>
     * <p>test.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>The site access type. Valid values:</p>
     * <ul>
     * <li>NS: NS access.</li>
     * <li>CNAME: CNAME access.</li>
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

    public PurchaseRatePlanRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
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

    public PurchaseRatePlanRequest setOveragePolicy(String overagePolicy) {
        this.overagePolicy = overagePolicy;
        return this;
    }
    public String getOveragePolicy() {
        return this.overagePolicy;
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
