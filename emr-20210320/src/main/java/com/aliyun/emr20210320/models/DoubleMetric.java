// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DoubleMetric extends TeaModel {
    @NameInMap("Unit")
    public String unit;

    @NameInMap("Value")
    public Double value;

    public static DoubleMetric build(java.util.Map<String, ?> map) throws Exception {
        DoubleMetric self = new DoubleMetric();
        return TeaModel.build(map, self);
    }

    public DoubleMetric setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public DoubleMetric setValue(Double value) {
        this.value = value;
        return this;
    }
    public Double getValue() {
        return this.value;
    }

}
