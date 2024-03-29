// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetActivityTaskResponseBody extends TeaModel {
    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("ActivityName")
    public String activityName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ExperimentTaskId")
    public String experimentTaskId;

    @NameInMap("Hosts")
    public java.util.List<GetActivityTaskResponseBodyHosts> hosts;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Phase")
    public String phase;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RunResult")
    public String runResult;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("State")
    public String state;

    @NameInMap("Success")
    public Boolean success;

    public static GetActivityTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetActivityTaskResponseBody self = new GetActivityTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetActivityTaskResponseBody setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public GetActivityTaskResponseBody setActivityName(String activityName) {
        this.activityName = activityName;
        return this;
    }
    public String getActivityName() {
        return this.activityName;
    }

    public GetActivityTaskResponseBody setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetActivityTaskResponseBody setExperimentTaskId(String experimentTaskId) {
        this.experimentTaskId = experimentTaskId;
        return this;
    }
    public String getExperimentTaskId() {
        return this.experimentTaskId;
    }

    public GetActivityTaskResponseBody setHosts(java.util.List<GetActivityTaskResponseBodyHosts> hosts) {
        this.hosts = hosts;
        return this;
    }
    public java.util.List<GetActivityTaskResponseBodyHosts> getHosts() {
        return this.hosts;
    }

    public GetActivityTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetActivityTaskResponseBody setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public GetActivityTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetActivityTaskResponseBody setRunResult(String runResult) {
        this.runResult = runResult;
        return this;
    }
    public String getRunResult() {
        return this.runResult;
    }

    public GetActivityTaskResponseBody setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetActivityTaskResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public GetActivityTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetActivityTaskResponseBodyHosts extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ExpId")
        public String expId;

        @NameInMap("HostIp")
        public String hostIp;

        @NameInMap("Result")
        public String result;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("State")
        public String state;

        @NameInMap("TaskId")
        public String taskId;

        public static GetActivityTaskResponseBodyHosts build(java.util.Map<String, ?> map) throws Exception {
            GetActivityTaskResponseBodyHosts self = new GetActivityTaskResponseBodyHosts();
            return TeaModel.build(map, self);
        }

        public GetActivityTaskResponseBodyHosts setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public GetActivityTaskResponseBodyHosts setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetActivityTaskResponseBodyHosts setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetActivityTaskResponseBodyHosts setExpId(String expId) {
            this.expId = expId;
            return this;
        }
        public String getExpId() {
            return this.expId;
        }

        public GetActivityTaskResponseBodyHosts setHostIp(String hostIp) {
            this.hostIp = hostIp;
            return this;
        }
        public String getHostIp() {
            return this.hostIp;
        }

        public GetActivityTaskResponseBodyHosts setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetActivityTaskResponseBodyHosts setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetActivityTaskResponseBodyHosts setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetActivityTaskResponseBodyHosts setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
