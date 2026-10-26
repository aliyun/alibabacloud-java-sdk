// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Queries extends TeaModel {
    /**
     * <p>The end offset of the time range for SLS_MULTI_QUERY (mutually exclusive with window).</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("end")
    public Long end;

    /**
     * <p>The query expression (PromQL for PROMETHEUS_MULTI_QUERY and SPL for SLS_MULTI_QUERY).</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("expr")
    public String expr;

    /**
     * <p>The label filter conditions for UMODEL_METRICSET_MULTI_QUERY (optional and independent per query).</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;name&quot;:&quot;env&quot;,&quot;operator&quot;:&quot;=&quot;,&quot;value&quot;:&quot;prod&quot;}]</p>
     */
    @NameInMap("labelFilters")
    public java.util.List<LabelFilters> labelFilters;

    /**
     * <p>The metric name for UMODEL_METRICSET_MULTI_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>The metric set name for UMODEL_METRICSET_MULTI_QUERY.</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称</p>
     */
    @NameInMap("metricSet")
    public String metricSet;

    /**
     * <p>The query name for PROMETHEUS_MULTI_QUERY or UMODEL_METRICSET_MULTI_QUERY (such as $A or $B, referenced by condition triggers).</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The start offset of the time range for SLS_MULTI_QUERY (mutually exclusive with window).</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("start")
    public Long start;

    /**
     * <p>The time unit for SLS_MULTI_QUERY (day, hour, minute, or second).</p>
     * 
     * <strong>example:</strong>
     * <p>second</p>
     */
    @NameInMap("timeUnit")
    public String timeUnit;

    /**
     * <p>The alignment window size for SLS_MULTI_QUERY (mutually exclusive with start and end).</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("window")
    public Long window;

    public static Queries build(java.util.Map<String, ?> map) throws Exception {
        Queries self = new Queries();
        return TeaModel.build(map, self);
    }

    public Queries setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public Queries setExpr(String expr) {
        this.expr = expr;
        return this;
    }
    public String getExpr() {
        return this.expr;
    }

    public Queries setLabelFilters(java.util.List<LabelFilters> labelFilters) {
        this.labelFilters = labelFilters;
        return this;
    }
    public java.util.List<LabelFilters> getLabelFilters() {
        return this.labelFilters;
    }

    public Queries setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public Queries setMetricSet(String metricSet) {
        this.metricSet = metricSet;
        return this;
    }
    public String getMetricSet() {
        return this.metricSet;
    }

    public Queries setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Queries setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

    public Queries setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

    public Queries setWindow(Long window) {
        this.window = window;
        return this;
    }
    public Long getWindow() {
        return this.window;
    }

}
