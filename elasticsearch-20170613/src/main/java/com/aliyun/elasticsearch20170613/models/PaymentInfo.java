// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class PaymentInfo extends TeaModel {
    /**
     * <p>The auto-renewal cycle. Unit: month. This parameter is required when <strong>isAutoRenew</strong> is set to <strong>true</strong>. The valid values are the same as those on the buy page.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("autoRenewDuration")
    public Long autoRenewDuration;

    /**
     * <p>The subscription duration. This parameter is required. You can specify the duration in months or years.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("duration")
    public Long duration;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false (default): disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("isAutoRenew")
    public Boolean isAutoRenew;

    /**
     * <p>The unit of the subscription duration. This parameter is required. Valid values:</p>
     * <ul>
     * <li>Year: year</li>
     * <li>Month: month.</li>
     * </ul>
     * 
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
