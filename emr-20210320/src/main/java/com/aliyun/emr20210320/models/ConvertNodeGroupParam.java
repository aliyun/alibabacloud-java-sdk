// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ConvertNodeGroupParam extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PaymentDuration")
    public Long paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    public static ConvertNodeGroupParam build(java.util.Map<String, ?> map) throws Exception {
        ConvertNodeGroupParam self = new ConvertNodeGroupParam();
        return TeaModel.build(map, self);
    }

    public ConvertNodeGroupParam setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ConvertNodeGroupParam setPaymentDuration(Long paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Long getPaymentDuration() {
        return this.paymentDuration;
    }

    public ConvertNodeGroupParam setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public ConvertNodeGroupParam setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

}
