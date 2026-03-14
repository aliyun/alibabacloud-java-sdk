// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class PaymentInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("autoRenewDuration")
    public Long autoRenewDuration;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isAutoRenew")
    public Boolean isAutoRenew;

    /**
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("pricingCycle")
    public String pricingCycle;

    public static PaymentInfo build(java.util.Map<String, ?> map) throws Exception {
        PaymentInfo self = new PaymentInfo();
        return TeaModel.build(map, self);
    }

    public PaymentInfo setAutoRenewDuration(Long autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Long getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public PaymentInfo setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public PaymentInfo setIsAutoRenew(Boolean isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }
    public Boolean getIsAutoRenew() {
        return this.isAutoRenew;
    }

    public PaymentInfo setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

}
