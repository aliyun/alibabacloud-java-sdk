// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class MetricStat extends TeaModel {
    @NameInMap("Associated")
    public java.util.Map<String, String> associated;

    @NameInMap("Dimensions")
    public java.util.List<Dimension> dimensions;

    @NameInMap("LogTime")
    public Long logTime;

    @NameInMap("Measurements")
    public java.util.Map<String, ?> measurements;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("Timestamp")
    public Long timestamp;

    public static MetricStat build(java.util.Map<String, ?> map) throws Exception {
        MetricStat self = new MetricStat();
        return TeaModel.build(map, self);
    }

    public MetricStat setAssociated(java.util.Map<String, String> associated) {
        this.associated = associated;
        return this;
    }
    public java.util.Map<String, String> getAssociated() {
        return this.associated;
    }

    public MetricStat setDimensions(java.util.List<Dimension> dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public java.util.List<Dimension> getDimensions() {
        return this.dimensions;
    }

    public MetricStat setLogTime(Long logTime) {
        this.logTime = logTime;
        return this;
    }
    public Long getLogTime() {
        return this.logTime;
    }

    public MetricStat setMeasurements(java.util.Map<String, ?> measurements) {
        this.measurements = measurements;
        return this;
    }
    public java.util.Map<String, ?> getMeasurements() {
        return this.measurements;
    }

    public MetricStat setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public MetricStat setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public MetricStat setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public MetricStat setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
