// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobMetricRequest extends TeaModel {
    /**
     * <p>The grouping basis.</p>
     * <blockquote>
     * <p>Valid values:</p>
     * <ul>
     * <li>project: grouping and aggregation by project</li>
     * <li>quota: grouping and aggregation by quota</li>
     * <li>type: grouping and aggregation by job type</li>
     * <li>status: grouping and aggregation by job status</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>project</p>
     */
    @NameInMap("group")
    public String group;

    /**
     * <p>The metric information.</p>
     * 
     * <strong>example:</strong>
     * <p>num</p>
     */
    @NameInMap("metric")
    public String metric;

    /**
     * <p>The monitoring statistical period.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("period")
    public Long period;

    /**
     * <p>The list of MaxCompute project names used for filtering.</p>
     */
    @NameInMap("project")
    public java.util.List<String> project;

    /**
     * <p>The list of compute quota nicknames used for filtering.</p>
     */
    @NameInMap("quota")
    public java.util.List<String> quota;

    /**
     * <p>The metric type.</p>
     * 
     * <strong>example:</strong>
     * <p>total</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The end time of the query time range. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735536322</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>The start time of the query time range. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1735534322</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    public static ListJobMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobMetricRequest self = new ListJobMetricRequest();
        return TeaModel.build(map, self);
    }

    public ListJobMetricRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public ListJobMetricRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public ListJobMetricRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public ListJobMetricRequest setProject(java.util.List<String> project) {
        this.project = project;
        return this;
    }
    public java.util.List<String> getProject() {
        return this.project;
    }

    public ListJobMetricRequest setQuota(java.util.List<String> quota) {
        this.quota = quota;
        return this;
    }
    public java.util.List<String> getQuota() {
        return this.quota;
    }

    public ListJobMetricRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListJobMetricRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListJobMetricRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
