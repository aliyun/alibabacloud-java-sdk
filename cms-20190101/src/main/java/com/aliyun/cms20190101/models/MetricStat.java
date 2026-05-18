// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class MetricStat extends TeaModel {
    /**
     * <p>The additional information about the monitored object (instance).</p>
     */
    @NameInMap("Associated")
    public java.util.Map<String, String> associated;

    /**
     * <p>The dimension information that is used to identify the monitored object (instance).</p>
     */
    @NameInMap("Dimensions")
    public java.util.List<Dimension> dimensions;

    /**
     * <p>The recorded time of the monitoring data. Unit: milliseconds. For non-raw data (aggregated data), the value of LogTime is NULL.</p>
     * 
     * <strong>example:</strong>
     * <p>1683686550073</p>
     */
    @NameInMap("LogTime")
    public Long logTime;

    /**
     * <p>The measured value of the metric. The parameter contains multiple values by default.</p>
     */
    @NameInMap("Measurements")
    public java.util.Map<String, ?> measurements;

    /**
     * <p>The metric that is used to monitor the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>cpu_idle</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The namespace of the cloud service.</p>
     * 
     * <strong>example:</strong>
     * <p>acs_ecs_dashboard</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The time interval based on which the metric value is measured.</p>
     * <p>Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The timestamp of the monitoring data. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1641454680000</p>
     */
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
