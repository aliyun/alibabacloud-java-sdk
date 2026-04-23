// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class MetricValueDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>total_calls</p>
     */
    @NameInMap("key")
    public String key;

    @NameInMap("label")
    public String label;

    @NameInMap("unit")
    public String unit;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("value")
    public Float value;

    public static MetricValueDTO build(java.util.Map<String, ?> map) throws Exception {
        MetricValueDTO self = new MetricValueDTO();
        return TeaModel.build(map, self);
    }

    public MetricValueDTO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MetricValueDTO setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public MetricValueDTO setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

    public MetricValueDTO setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
