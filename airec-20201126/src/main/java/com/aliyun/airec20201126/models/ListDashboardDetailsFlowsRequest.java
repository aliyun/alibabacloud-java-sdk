// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsFlowsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1588521600</p>
     */
    @NameInMap("endTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>all</p>
     */
    @NameInMap("experimentIds")
    public String experimentIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USERACTIONUV_COUNT</p>
     */
    @NameInMap("metricType")
    public String metricType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("sceneIds")
    public String sceneIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1588521600</p>
     */
    @NameInMap("startTime")
    public Long startTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba</p>
     */
    @NameInMap("traceIds")
    public String traceIds;

    public static ListDashboardDetailsFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsFlowsRequest self = new ListDashboardDetailsFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsFlowsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDashboardDetailsFlowsRequest setExperimentIds(String experimentIds) {
        this.experimentIds = experimentIds;
        return this;
    }
    public String getExperimentIds() {
        return this.experimentIds;
    }

    public ListDashboardDetailsFlowsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ListDashboardDetailsFlowsRequest setSceneIds(String sceneIds) {
        this.sceneIds = sceneIds;
        return this;
    }
    public String getSceneIds() {
        return this.sceneIds;
    }

    public ListDashboardDetailsFlowsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDashboardDetailsFlowsRequest setTraceIds(String traceIds) {
        this.traceIds = traceIds;
        return this;
    }
    public String getTraceIds() {
        return this.traceIds;
    }

}
