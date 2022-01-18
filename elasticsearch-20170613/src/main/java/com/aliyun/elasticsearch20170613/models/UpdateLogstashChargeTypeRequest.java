// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class UpdateLogstashChargeTypeRequest extends TeaModel {
    @NameInMap("paymentInfo")
    public UpdateLogstashChargeTypeRequestPaymentInfo paymentInfo;

    @NameInMap("paymentType")
    public String paymentType;

    @NameInMap("clientToken")
    public String clientToken;

    public static UpdateLogstashChargeTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLogstashChargeTypeRequest self = new UpdateLogstashChargeTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLogstashChargeTypeRequest setPaymentInfo(UpdateLogstashChargeTypeRequestPaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }
    public UpdateLogstashChargeTypeRequestPaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public UpdateLogstashChargeTypeRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public UpdateLogstashChargeTypeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class UpdateLogstashChargeTypeRequestPaymentInfo extends TeaModel {
        @NameInMap("duration")
        public Long duration;

        @NameInMap("pricingCycle")
        public String pricingCycle;

        public static UpdateLogstashChargeTypeRequestPaymentInfo build(java.util.Map<String, ?> map) throws Exception {
            UpdateLogstashChargeTypeRequestPaymentInfo self = new UpdateLogstashChargeTypeRequestPaymentInfo();
            return TeaModel.build(map, self);
        }

        public UpdateLogstashChargeTypeRequestPaymentInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public UpdateLogstashChargeTypeRequestPaymentInfo setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

    }

}
