// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkAnalyzeLogTask extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Result")
    public LogAnalyzeResult result;

    @NameInMap("RuleMatched")
    public Boolean ruleMatched;

    @NameInMap("StartedTimeInMillis")
    public Long startedTimeInMillis;

    @NameInMap("SubmittedTimeInMillis")
    public Long submittedTimeInMillis;

    @NameInMap("TaskErrMsg")
    public String taskErrMsg;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("TaskState")
    public String taskState;

    @NameInMap("TerminatedTimeInMillis")
    public Long terminatedTimeInMillis;

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
