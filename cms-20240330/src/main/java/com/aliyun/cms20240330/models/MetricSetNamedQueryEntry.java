// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetNamedQueryEntry extends TeaModel {
    @NameInMap("labelFilters")
    public java.util.List<UmodelLabelFilter> labelFilters;

    @NameInMap("metric")
    public String metric;

    @NameInMap("metricSet")
    public String metricSet;

    @NameInMap("name")
    public String name;

    public static MetricSetNamedQueryEntry build(java.util.Map<String, ?> map) throws Exception {
        MetricSetNamedQueryEntry self = new MetricSetNamedQueryEntry();
        return TeaModel.build(map, self);
    }

    public MetricSetNamedQueryEntry setLabelFilters(java.util.List<UmodelLabelFilter> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.List<UmodelLabelFilter> getLabelFilters() {
        return this.labelFilters;
    }

    public MetricSetNamedQueryEntry setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public MetricSetNamedQueryEntry setMetricSet(String metricSet) {
        this.metricSet = metricSet;
        return this;
    }
    public String getMetricSet() {
        return this.metricSet;
    }

    public MetricSetNamedQueryEntry setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
