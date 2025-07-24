// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class IntegerMetric extends TeaModel {
    @NameInMap("Unit")
    public String unit;

    @NameInMap("Value")
    public Integer value;

    public static IntegerMetric build(java.util.Map<String, ?> map) throws Exception {
        IntegerMetric self = new IntegerMetric();
        return TeaModel.build(map, self);
    }

    public IntegerMetric setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public IntegerMetric setValue(Integer value) {
        this.value = value;
        return this;
    }
    public Integer getValue() {
        return this.value;
    }

}
