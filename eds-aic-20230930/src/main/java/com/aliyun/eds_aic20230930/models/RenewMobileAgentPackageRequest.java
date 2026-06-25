// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewMobileAgentPackageRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables automatic payment. Make sure that your account balance is sufficient.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Generates an unpaid order.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If your account balance is insufficient, set this parameter to <code>false</code> to generate an unpaid order. You can then pay for the order in the Wuying Mobile Cloud Phone management console.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. The default value is <code>false</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>A list of mobile agent package IDs.</p>
     */
    @NameInMap("MobileAgentPackageIds")
    public java.util.List<String> mobileAgentPackageIds;

    /**
     * <p>The URL to which a user is redirected after a successful payment.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://aim.wuying.aliyun.com/nodes">https://aim.wuying.aliyun.com/nodes</a></p>
     */
    @NameInMap("PaidCallbackUrl")
    public String paidCallbackUrl;

    /**
     * <p>The renewal period. The <code>PeriodUnit</code> parameter specifies the time unit.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The unit of the renewal period.
     * Valid values:</p>
     * <ul>
     * <li><p><strong>Month</strong>: month.</p>
     * </li>
     * <li><p><strong>Year</strong>: year.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
     * <p>The promotion ID.</p>
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
