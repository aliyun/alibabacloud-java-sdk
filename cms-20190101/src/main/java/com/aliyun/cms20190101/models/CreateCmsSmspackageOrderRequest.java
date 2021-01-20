// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateCmsSmspackageOrderRequest extends TeaModel {
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

    @NameInMap("SmsCount")
    public String smsCount;

    public static CreateCmsSmspackageOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCmsSmspackageOrderRequest self = new CreateCmsSmspackageOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCmsSmspackageOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCmsSmspackageOrderRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateCmsSmspackageOrderRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateCmsSmspackageOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateCmsSmspackageOrderRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateCmsSmspackageOrderRequest setSmsCount(String smsCount) {
        this.smsCount = smsCount;
        return this;
    }
    public String getSmsCount() {
        return this.smsCount;
    }

}
