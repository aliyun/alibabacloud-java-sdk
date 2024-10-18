// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobMetricsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>11265</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1712205941</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricName")
    public java.util.List<String> metricName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586509407</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListDIJobMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobMetricsRequest self = new ListDIJobMetricsRequest();
        return TeaModel.build(map, self);
    }

    public ListDIJobMetricsRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public ListDIJobMetricsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDIJobMetricsRequest setMetricName(java.util.List<String> metricName) {
        this.metricName = metricName;
        return this;
    }
    public java.util.List<String> getMetricName() {
        return this.metricName;
    }

    public ListDIJobMetricsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
