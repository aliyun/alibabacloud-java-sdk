// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Queries extends TeaModel {
    @NameInMap("end")
    public Long end;

    @NameInMap("expr")
    public String expr;

    @NameInMap("labelFilters")
    public java.util.List<LabelFilters> labelFilters;

    @NameInMap("metric")
    public String metric;

    @NameInMap("metricSet")
    public String metricSet;

    @NameInMap("name")
    public String name;

    @NameInMap("start")
    public Long start;

    @NameInMap("timeUnit")
    public String timeUnit;

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
