// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListDIJobMetricsShrinkRequest extends TeaModel {
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricName")
    public String metricNameShrink;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    public static ListDIJobMetricsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDIJobMetricsShrinkRequest self = new ListDIJobMetricsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDIJobMetricsShrinkRequest setDIJobId(Long DIJobId) {
        this.DIJobId = DIJobId;
        return this;
    }
    public Long getDIJobId() {
        return this.DIJobId;
    }

    public ListDIJobMetricsShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDIJobMetricsShrinkRequest setMetricNameShrink(String metricNameShrink) {
        this.metricNameShrink = metricNameShrink;
        return this;
    }
    public String getMetricNameShrink() {
        return this.metricNameShrink;
    }

    public ListDIJobMetricsShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
