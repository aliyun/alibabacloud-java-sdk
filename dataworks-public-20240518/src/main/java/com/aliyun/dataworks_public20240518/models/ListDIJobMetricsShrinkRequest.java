// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDIJobMetricsShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>11265</p>
     */
    @NameInMap("DIJobId")
    public Long DIJobId;

    /**
     * <p>The end of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1712205941</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The metrics that you want to query.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MetricName")
    public String metricNameShrink;

    /**
     * <p>The beginning of the time range to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1586509407</p>
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
