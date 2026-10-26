// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class MetricSetNamedQueryEntry extends TeaModel {
    /**
     * <p>The optional label filter conditions, which are independent for each query.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;env&quot;,&quot;operator&quot;:&quot;=&quot;,&quot;value&quot;:&quot;prod&quot;}]</p>
     */
    @NameInMap("labelFilters")
    public java.util.List<LabelFilters> labelFilters;

    /**
     * <p>The metric name.</p>
     * 
     * <strong>example:</strong>
     * <p>cpuUsage</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>The metric set name.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs_metrics</p>
     */
    @NameInMap("metricSet")
    public String metricSet;

    /**
     * <p>The query name, such as $A or $B, referenced by the condition trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>cpuQuery</p>
     */
    @NameInMap("name")
    public String name;

    public static MetricSetNamedQueryEntry build(java.util.Map<String, ?> map) throws Exception {
        MetricSetNamedQueryEntry self = new MetricSetNamedQueryEntry();
        return TeaModel.build(map, self);
    }

    public MetricSetNamedQueryEntry setLabelFilters(java.util.List<LabelFilters> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.List<LabelFilters> getLabelFilters() {
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
