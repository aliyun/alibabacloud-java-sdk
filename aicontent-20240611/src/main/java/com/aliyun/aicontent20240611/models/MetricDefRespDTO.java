// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class MetricDefRespDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>total_calls</p>
     */
    @NameInMap("key")
    public String key;

    @NameInMap("label")
    public String label;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("sortable")
    public Boolean sortable;

    @NameInMap("unit")
    public String unit;

    public static MetricDefRespDTO build(java.util.Map<String, ?> map) throws Exception {
        MetricDefRespDTO self = new MetricDefRespDTO();
        return TeaModel.build(map, self);
    }

    public MetricDefRespDTO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public MetricDefRespDTO setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public MetricDefRespDTO setSortable(Boolean sortable) {
        this.sortable = sortable;
        return this;
    }
    public Boolean getSortable() {
        return this.sortable;
    }

    public MetricDefRespDTO setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
