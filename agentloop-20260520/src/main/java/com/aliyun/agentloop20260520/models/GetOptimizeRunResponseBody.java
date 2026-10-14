// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetOptimizeRunResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("attemptCount")
    public Integer attemptCount;

    /**
     * <strong>example:</strong>
     * <p>2026-08-12T10:00:00Z</p>
     */
    @NameInMap("createTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>attribution</p>
     */
    @NameInMap("currentStage")
    public String currentStage;

    /**
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>The optimize run failed.</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("extra")
    public java.util.Map<String, ?> extra;

    /**
     * <strong>example:</strong>
     * <p>2026-08-12T10:01:00Z</p>
     */
    @NameInMap("finishTime")
    public String finishTime;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("maxAttempts")
    public Integer maxAttempts;

    /**
     * <strong>example:</strong>
     * <p>or-20260812-0001</p>
     */
    @NameInMap("optimizeRunId")
    public String optimizeRunId;

    /**
     * <strong>example:</strong>
     * <p>efficiency-analysis</p>
     */
    @NameInMap("optimizeTaskName")
    public String optimizeTaskName;

    @NameInMap("progress")
    public java.util.Map<String, ?> progress;

    /**
     * <strong>example:</strong>
     * <p>9ACFB10A-1B2C-3D4E-5F6G-7H8I9J0K1L2M</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2026-08-12T10:00:01Z</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("trajectoryCount")
    public Long trajectoryCount;

    /**
     * <strong>example:</strong>
     * <p>Scheduled</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    /**
     * <strong>example:</strong>
     * <p>EfficiencyAnalysis</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>1786432690000</p>
     */
    @NameInMap("windowEndTime")
    public Long windowEndTime;

    /**
     * <strong>example:</strong>
     * <p>1786432688000</p>
     */
    @NameInMap("windowStartTime")
    public Long windowStartTime;

    public static GetOptimizeRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetOptimizeRunResponseBody self = new GetOptimizeRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetOptimizeRunResponseBody setAttemptCount(Integer attemptCount) {
        this.attemptCount = attemptCount;
        return this;
    }
    public Integer getAttemptCount() {
        return this.attemptCount;
    }

    public GetOptimizeRunResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetOptimizeRunResponseBody setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }
    public String getCurrentStage() {
        return this.currentStage;
    }

    public GetOptimizeRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetOptimizeRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetOptimizeRunResponseBody setExtra(java.util.Map<String, ?> extra) {
        this.extra = extra;
        return this;
    }
    public java.util.Map<String, ?> getExtra() {
        return this.extra;
    }

    public GetOptimizeRunResponseBody setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public GetOptimizeRunResponseBody setMaxAttempts(Integer maxAttempts) {
        this.maxAttempts = maxAttempts;
        return this;
    }
    public Integer getMaxAttempts() {
        return this.maxAttempts;
    }

    public GetOptimizeRunResponseBody setOptimizeRunId(String optimizeRunId) {
        this.optimizeRunId = optimizeRunId;
        return this;
    }
    public String getOptimizeRunId() {
        return this.optimizeRunId;
    }

    public GetOptimizeRunResponseBody setOptimizeTaskName(String optimizeTaskName) {
        this.optimizeTaskName = optimizeTaskName;
        return this;
    }
    public String getOptimizeTaskName() {
        return this.optimizeTaskName;
    }

    public GetOptimizeRunResponseBody setProgress(java.util.Map<String, ?> progress) {
        this.progress = progress;
        return this;
    }
    public java.util.Map<String, ?> getProgress() {
        return this.progress;
    }

    public GetOptimizeRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetOptimizeRunResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetOptimizeRunResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetOptimizeRunResponseBody setTrajectoryCount(Long trajectoryCount) {
        this.trajectoryCount = trajectoryCount;
        return this;
    }
    public Long getTrajectoryCount() {
        return this.trajectoryCount;
    }

    public GetOptimizeRunResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public GetOptimizeRunResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GetOptimizeRunResponseBody setWindowEndTime(Long windowEndTime) {
        this.windowEndTime = windowEndTime;
        return this;
    }
    public Long getWindowEndTime() {
        return this.windowEndTime;
    }

    public GetOptimizeRunResponseBody setWindowStartTime(Long windowStartTime) {
        this.windowStartTime = windowStartTime;
        return this;
    }
    public Long getWindowStartTime() {
        return this.windowStartTime;
    }

}
