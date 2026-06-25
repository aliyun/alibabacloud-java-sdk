// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class Run extends TeaModel {
    /**
     * <p>The visibility of the run.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    /**
     * <p>The ID of the experiment associated with the run.</p>
     * 
     * <strong>example:</strong>
     * <p>exp-1zpfthdx******</p>
     */
    @NameInMap("ExperimentId")
    public String experimentId;

    /**
     * <p>The time when the run was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the run was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The list of labels for the run.</p>
     */
    @NameInMap("Labels")
    public java.util.List<RunLabel> labels;

    /**
     * <p>The list of metrics for the run.</p>
     */
    @NameInMap("Metrics")
    public java.util.List<RunMetric> metrics;

    /**
     * <p>Name</p>
     * 
     * <strong>example:</strong>
     * <p>testrun</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the owner\&quot;s root account.</p>
     * 
     * <strong>example:</strong>
     * <p>163104*****3440</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The list of hyperparameters for the run.</p>
     */
    @NameInMap("Params")
    public java.util.List<RunParam> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The unique ID of the run.</p>
     * 
     * <strong>example:</strong>
     * <p>run-1qJhzJ2YXgX****</p>
     */
    @NameInMap("RunId")
    public String runId;

    /**
     * <p>The ID of the source PAI workload.</p>
     * 
     * <strong>example:</strong>
     * <p>train9s0afvjkf</p>
     */
    @NameInMap("SourceId")
    public String sourceId;

    /**
     * <p>The type of the source PAI workload.</p>
     * 
     * <strong>example:</strong>
     * <p>TrainingService</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    /**
     * <p>The ID of the owner.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the workspace to which the run belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>145883</p>
     */
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
