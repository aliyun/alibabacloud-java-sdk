// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RenewMobileAgentPackageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("MobileAgentPackageIds")
    public java.util.List<String> mobileAgentPackageIds;

    /**
     * <strong>example:</strong>
     * <p><a href="https://aim.wuying.aliyun.com/nodes">https://aim.wuying.aliyun.com/nodes</a></p>
     */
    @NameInMap("PaidCallbackUrl")
    public String paidCallbackUrl;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PeriodUnit")
    public String periodUnit;

    /**
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
