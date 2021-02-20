// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateAvdsBagOrderRequest extends TeaModel {
    @NameInMap("Period")
    public Integer period;

    @NameInMap("PeriodUnit")
    public String periodUnit;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("FlowoutSpec")
    public String flowoutSpec;

    @NameInMap("Pack")
    public String pack;

    public static CreateAvdsBagOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAvdsBagOrderRequest self = new CreateAvdsBagOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateAvdsBagOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateAvdsBagOrderRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateAvdsBagOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAvdsBagOrderRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateAvdsBagOrderRequest setFlowoutSpec(String flowoutSpec) {
        this.flowoutSpec = flowoutSpec;
        return this;
    }
    public String getFlowoutSpec() {
        return this.flowoutSpec;
    }

    public CreateAvdsBagOrderRequest setPack(String pack) {
        this.pack = pack;
        return this;
    }
    public String getPack() {
        return this.pack;
    }

}
