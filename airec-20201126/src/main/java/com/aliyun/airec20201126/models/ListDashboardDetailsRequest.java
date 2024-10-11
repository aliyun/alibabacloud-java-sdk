// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListDashboardDetailsRequest extends TeaModel {
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
     * <strong>example:</strong>
     * <p>hot,emb,u2x2i,hilp,new,</p>
     */
    @NameInMap("matchTypes")
    public String matchTypes;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
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

    public static ListDashboardDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDashboardDetailsRequest self = new ListDashboardDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListDashboardDetailsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListDashboardDetailsRequest setExperimentIds(String experimentIds) {
        this.experimentIds = experimentIds;
        return this;
    }
    public String getExperimentIds() {
        return this.experimentIds;
    }

    public ListDashboardDetailsRequest setMatchTypes(String matchTypes) {
        this.matchTypes = matchTypes;
        return this;
    }
    public String getMatchTypes() {
        return this.matchTypes;
    }

    public ListDashboardDetailsRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public ListDashboardDetailsRequest setSceneIds(String sceneIds) {
        this.sceneIds = sceneIds;
        return this;
    }
    public String getSceneIds() {
        return this.sceneIds;
    }

    public ListDashboardDetailsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListDashboardDetailsRequest setTraceIds(String traceIds) {
        this.traceIds = traceIds;
        return this;
    }
    public String getTraceIds() {
        return this.traceIds;
    }

}
