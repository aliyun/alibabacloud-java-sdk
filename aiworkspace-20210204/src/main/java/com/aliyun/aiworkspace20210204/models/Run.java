// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Run extends TeaModel {
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    @NameInMap("Labels")
    public java.util.List<RunLabel> labels;

    @NameInMap("Metrics")
    public java.util.List<RunMetric> metrics;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("Params")
    public java.util.List<RunParam> params;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunId")
    public String runId;

    @NameInMap("SourceId")
    public String sourceId;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static Run build(java.util.Map<String, ?> map) throws Exception {
        Run self = new Run();
        return TeaModel.build(map, self);
    }

    public Run setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public Run setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public Run setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Run setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public Run setLabels(java.util.List<RunLabel> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<RunLabel> getLabels() {
        return this.labels;
    }

    public Run setMetrics(java.util.List<RunMetric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<RunMetric> getMetrics() {
        return this.metrics;
    }

    public Run setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Run setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Run setParams(java.util.List<RunParam> params) {
        this.params = params;
        return this;
    }
    public java.util.List<RunParam> getParams() {
        return this.params;
    }

    public Run setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Run setRunId(String runId) {
        this.runId = runId;
        return this;
    }
    public String getRunId() {
        return this.runId;
    }

    public Run setSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public String getSourceId() {
        return this.sourceId;
    }

    public Run setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public Run setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public Run setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
