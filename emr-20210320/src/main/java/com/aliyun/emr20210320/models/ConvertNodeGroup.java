// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ConvertNodeGroup extends TeaModel {
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    @NameInMap("PaymentDuration")
    public Integer paymentDuration;

    @NameInMap("PaymentDurationUnit")
    public String paymentDurationUnit;

    @NameInMap("PaymentType")
    public String paymentType;

    public static ConvertNodeGroup build(java.util.Map<String, ?> map) throws Exception {
        ConvertNodeGroup self = new ConvertNodeGroup();
        return TeaModel.build(map, self);
    }

    public ConvertNodeGroup setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public ConvertNodeGroup setPaymentDuration(Integer paymentDuration) {
        this.paymentDuration = paymentDuration;
        return this;
    }
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    public ConvertNodeGroup setPaymentDurationUnit(String paymentDurationUnit) {
        this.paymentDurationUnit = paymentDurationUnit;
        return this;
    }
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    public ConvertNodeGroup setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

}
