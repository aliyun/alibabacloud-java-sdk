// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class MetricUnitValue extends TeaModel {
    /**
     * <p>指标名称。</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>指标单位。</p>
     */
    @NameInMap("MetricUnit")
    public String metricUnit;

    public static MetricUnitValue build(java.util.Map<String, ?> map) throws Exception {
        MetricUnitValue self = new MetricUnitValue();
        return TeaModel.build(map, self);
    }

    public MetricUnitValue setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public MetricUnitValue setMetricUnit(String metricUnit) {
        this.metricUnit = metricUnit;
        return this;
    }
    public String getMetricUnit() {
        return this.metricUnit;
    }

}
