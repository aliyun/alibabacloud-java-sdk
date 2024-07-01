// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkAnalyzeLogTask extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>amv-adbxxxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Result")
    public LogAnalyzeResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RuleMatched")
    public Boolean ruleMatched;

    /**
     * <strong>example:</strong>
     * <p>1672123543000</p>
     */
    @NameInMap("StartedTimeInMillis")
    public Long startedTimeInMillis;

    /**
     * <strong>example:</strong>
     * <p>1672123543000</p>
     */
    @NameInMap("SubmittedTimeInMillis")
    public Long submittedTimeInMillis;

    /**
     * <strong>example:</strong>
     * <p>Driver log not found</p>
     */
    @NameInMap("TaskErrMsg")
    public String taskErrMsg;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    /**
     * <strong>example:</strong>
     * <p>WAITING</p>
     */
    @NameInMap("TaskState")
    public String taskState;

    /**
     * <strong>example:</strong>
     * <p>1672123543000</p>
     */
    @NameInMap("TerminatedTimeInMillis")
    public Long terminatedTimeInMillis;

    /**
     * <strong>example:</strong>
     * <p>13719918xxx</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static SparkAnalyzeLogTask build(java.util.Map<String, ?> map) throws Exception {
        SparkAnalyzeLogTask self = new SparkAnalyzeLogTask();
        return TeaModel.build(map, self);
    }

    public SparkAnalyzeLogTask setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SparkAnalyzeLogTask setResult(LogAnalyzeResult result) {
        this.result = result;
        return this;
    }
    public LogAnalyzeResult getResult() {
        return this.result;
    }

    public SparkAnalyzeLogTask setRuleMatched(Boolean ruleMatched) {
        this.ruleMatched = ruleMatched;
        return this;
    }
    public Boolean getRuleMatched() {
        return this.ruleMatched;
    }

    public SparkAnalyzeLogTask setStartedTimeInMillis(Long startedTimeInMillis) {
        this.startedTimeInMillis = startedTimeInMillis;
        return this;
    }
    public Long getStartedTimeInMillis() {
        return this.startedTimeInMillis;
    }

    public SparkAnalyzeLogTask setSubmittedTimeInMillis(Long submittedTimeInMillis) {
        this.submittedTimeInMillis = submittedTimeInMillis;
        return this;
    }
    public Long getSubmittedTimeInMillis() {
        return this.submittedTimeInMillis;
    }

    public SparkAnalyzeLogTask setTaskErrMsg(String taskErrMsg) {
        this.taskErrMsg = taskErrMsg;
        return this;
    }
    public String getTaskErrMsg() {
        return this.taskErrMsg;
    }

    public SparkAnalyzeLogTask setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public SparkAnalyzeLogTask setTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }
    public String getTaskState() {
        return this.taskState;
    }

    public SparkAnalyzeLogTask setTerminatedTimeInMillis(Long terminatedTimeInMillis) {
        this.terminatedTimeInMillis = terminatedTimeInMillis;
        return this;
    }
    public Long getTerminatedTimeInMillis() {
        return this.terminatedTimeInMillis;
    }

    public SparkAnalyzeLogTask setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
