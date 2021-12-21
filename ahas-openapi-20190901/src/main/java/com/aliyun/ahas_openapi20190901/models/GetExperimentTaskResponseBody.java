// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetExperimentTaskResponseBody extends TeaModel {
    @NameInMap("Activities")
    public java.util.List<GetExperimentTaskResponseBodyActivities> activities;

    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("ExperimentName")
    public String experimentName;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("State")
    public String state;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TaskId")
    public String taskId;

    public static GetExperimentTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentTaskResponseBody self = new GetExperimentTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExperimentTaskResponseBody setActivities(java.util.List<GetExperimentTaskResponseBodyActivities> activities) {
        this.activities = activities;
        return this;
    }
    public java.util.List<GetExperimentTaskResponseBodyActivities> getActivities() {
        return this.activities;
    }

    public GetExperimentTaskResponseBody setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetExperimentTaskResponseBody setExperimentName(String experimentName) {
        this.experimentName = experimentName;
        return this;
    }
    public String getExperimentName() {
        return this.experimentName;
    }

    public GetExperimentTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetExperimentTaskResponseBody setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetExperimentTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExperimentTaskResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetExperimentTaskResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetExperimentTaskResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetExperimentTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetExperimentTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class GetExperimentTaskResponseBodyActivities extends TeaModel {
        @NameInMap("ActivityId")
        public String activityId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("CheckState")
        public String checkState;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ExperimentTaskId")
        public String experimentTaskId;

        @NameInMap("Phase")
        public String phase;

        @NameInMap("RunResult")
        public String runResult;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("TaskId")
        public String taskId;

        public static GetExperimentTaskResponseBodyActivities build(java.util.Map<String, ?> map) throws Exception {
            GetExperimentTaskResponseBodyActivities self = new GetExperimentTaskResponseBodyActivities();
            return TeaModel.build(map, self);
        }

        public GetExperimentTaskResponseBodyActivities setActivityId(String activityId) {
            this.activityId = activityId;
            return this;
        }
        public String getActivityId() {
            return this.activityId;
        }

        public GetExperimentTaskResponseBodyActivities setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public GetExperimentTaskResponseBodyActivities setCheckState(String checkState) {
            this.checkState = checkState;
            return this;
        }
        public String getCheckState() {
            return this.checkState;
        }

        public GetExperimentTaskResponseBodyActivities setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetExperimentTaskResponseBodyActivities setExperimentTaskId(String experimentTaskId) {
            this.experimentTaskId = experimentTaskId;
            return this;
        }
        public String getExperimentTaskId() {
            return this.experimentTaskId;
        }

        public GetExperimentTaskResponseBodyActivities setPhase(String phase) {
            this.phase = phase;
            return this;
        }
        public String getPhase() {
            return this.phase;
        }

        public GetExperimentTaskResponseBodyActivities setRunResult(String runResult) {
            this.runResult = runResult;
            return this;
        }
        public String getRunResult() {
            return this.runResult;
        }

        public GetExperimentTaskResponseBodyActivities setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetExperimentTaskResponseBodyActivities setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetExperimentTaskResponseBodyActivities setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
