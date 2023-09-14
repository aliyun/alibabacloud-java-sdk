// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class SubscriptionConfig extends TeaModel {
    /**
     * <p>自动续费。取值范围：</p>
     * <p>- true：开启启动续费。</p>
     * <p>- false：不开启自动续费。</p>
     * <p>默认值：false。</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>自动续费时长。当AutoRenew取值为true时生效。当AutoRenewDurationUnit取值为Month时，取值：1、2、3、4、5、6、7、8、9、12、24、36、48、60。</p>
     */
    @NameInMap("AutoRenewDuration")
    public Integer autoRenewDuration;

    /**
     * <p>- Month：月。</p>
     */
    @NameInMap("AutoRenewDurationUnit")
    public String autoRenewDurationUnit;

    /**
     * <p>付费时长。PaymentDurationUnit取值为Month时，取值：1、2、3、4、5、6、7、8、9、12、24、36、48、60。</p>
     */
    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    /**
     * <p>付费时长单位。取值范围：</p>
     * <p>- Month：月。</p>
     */
    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    public static SubscriptionConfig build(java.util.Map<String, ?> map) throws Exception {
        SubscriptionConfig self = new SubscriptionConfig();
        return TeaModel.build(map, self);
    }

    public SubscriptionConfig setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public SubscriptionConfig setAutoRenewDuration(Integer autoRenewDuration) {
        this.autoRenewDuration = autoRenewDuration;
        return this;
    }
    public Integer getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    public SubscriptionConfig setAutoRenewDurationUnit(String autoRenewDurationUnit) {
        this.autoRenewDurationUnit = autoRenewDurationUnit;
        return this;
    }
    public String getAutoRenewDurationUnit() {
        return this.autoRenewDurationUnit;
    }

    public SubscriptionConfig setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public SubscriptionConfig setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

}
