// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class CreateAvdsPublicOrderRequest extends TeaModel {
    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    @NameInMap("NameTime")
    public String nameTime;

    public static CreateAvdsPublicOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAvdsPublicOrderRequest self = new CreateAvdsPublicOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateAvdsPublicOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateAvdsPublicOrderRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateAvdsPublicOrderRequest setNameTime(String nameTime) {
        this.nameTime = nameTime;
        return this;
    }
    public String getNameTime() {
        return this.nameTime;
    }

}
