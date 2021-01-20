// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsCallNumOrderRequest extends TeaModel {
    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("PhoneCount")
    public String phoneCount;

    public static CreateCmsCallNumOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsCallNumOrderRequest self = new CreateCmsCallNumOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCmsCallNumOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCmsCallNumOrderRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCmsCallNumOrderRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateCmsCallNumOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCmsCallNumOrderRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateCmsCallNumOrderRequest setPhoneCount(String phoneCount) {
        this.phoneCount = phoneCount;
        return this;
    }
    public String getPhoneCount() {
        return this.phoneCount;
    }

}
