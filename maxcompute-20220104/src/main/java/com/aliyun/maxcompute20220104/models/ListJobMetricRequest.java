// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListJobMetricRequest extends TeaModel {
    @NameInMap("group")
    public String group;

    @NameInMap("metric")
    public String metric;

    @NameInMap("period")
    public Long period;

    @NameInMap("project")
    public java.util.List<String> project;

    @NameInMap("quota")
    public java.util.List<String> quota;

    @NameInMap("type")
    public String type;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
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
