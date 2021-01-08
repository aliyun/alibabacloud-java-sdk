// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsRequest extends TeaModel {
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("TraceIds")
    public String traceIds;

    @NameInMap("SceneIds")
    public String sceneIds;

    @NameInMap("MetricType")
    public String metricType;

    public static ListDashboardDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsRequest self = new ListDashboardDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDashboardDetailsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDashboardDetailsRequest setTraceIds(String traceIds) {
        this.traceIds = traceIds;
        return this;
    }
    public String getTraceIds() {
        return this.traceIds;
    }

    public ListDashboardDetailsRequest setSceneIds(String sceneIds) {
        this.sceneIds = sceneIds;
        return this;
    }
    public String getSceneIds() {
        return this.sceneIds;
    }

    public ListDashboardDetailsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

}
