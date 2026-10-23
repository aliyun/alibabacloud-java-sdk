// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewMobileAgentPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Automatic payment is enabled. Make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong> (default): Only an order is generated and no payment is deducted.</li>
     * </ul>
     * <blockquote>
     * <p>If the balance of your payment method is insufficient, set this parameter to false to generate an unpaid order. You can log on to the Wuying Cloud Phone console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The idempotency key.</p>
     * 
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of resource plan IDs.</p>
     */
    @NameInMap("MobileAgentPackageIds")
    public java.util.List<String> mobileAgentPackageIds;

    /**
     * <p>The redirect URL for the payment success page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aim.wuying.aliyun.com/nodes">https://aim.wuying.aliyun.com/nodes</a></p>
     */
    @NameInMap("PaidCallbackUrl")
    public String paidCallbackUrl;

    /**
     * <p>The subscription duration of the resource. The unit is specified by PeriodUnit.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the subscription duration of the resource. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong>: Month.</li>
     * <li><strong>Year</strong>: Year.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The ID of the promotion.</p>
     * 
     * <strong>example:</strong>
     * <p>50003308011****</p>
     */
    @NameInMap("PromotionId")
    public String promotionId;

    public static RenewMobileAgentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewMobileAgentPackageRequest self = new RenewMobileAgentPackageRequest();
        return TeaModel.build(map, self);
    }

    public RenewMobileAgentPackageRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewMobileAgentPackageRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public RenewMobileAgentPackageRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RenewMobileAgentPackageRequest setMobileAgentPackageIds(java.util.List<String> mobileAgentPackageIds) {
        this.mobileAgentPackageIds = mobileAgentPackageIds;
        return this;
    }
    public java.util.List<String> getMobileAgentPackageIds() {
        return this.mobileAgentPackageIds;
    }

    public RenewMobileAgentPackageRequest setPaidCallbackUrl(String paidCallbackUrl) {
        this.paidCallbackUrl = paidCallbackUrl;
        return this;
    }
    public String getPaidCallbackUrl() {
        return this.paidCallbackUrl;
    }

    public RenewMobileAgentPackageRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public RenewMobileAgentPackageRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public RenewMobileAgentPackageRequest setPromotionId(String promotionId) {
        this.promotionId = promotionId;
        return this;
    }
    public String getPromotionId() {
        return this.promotionId;
    }

}
