// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAttackSuiteTaskListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<QueryAttackSuiteTaskListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAttackSuiteTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackSuiteTaskListResponseBody self = new QueryAttackSuiteTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAttackSuiteTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAttackSuiteTaskListResponseBody setData(java.util.List<QueryAttackSuiteTaskListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAttackSuiteTaskListResponseBodyData> getData() {
        return this.data;
    }

    public QueryAttackSuiteTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAttackSuiteTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAttackSuiteTaskListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAttackSuiteTaskListResponseBodyData extends TeaModel {
        @NameInMap("attackInstanceId")
        public String attackInstanceId;

        @NameInMap("deviceConfigurationId")
        public String deviceConfigurationId;

        @NameInMap("deviceIp")
        public String deviceIp;

        @NameInMap("devicePort")
        public String devicePort;

        @NameInMap("deviceType")
        public Integer deviceType;

        @NameInMap("scenarioId")
        public String scenarioId;

        @NameInMap("scenarioName")
        public String scenarioName;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("taskResult")
        public String taskResult;

        @NameInMap("taskStatus")
        public String taskStatus;

        public static QueryAttackSuiteTaskListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAttackSuiteTaskListResponseBodyData self = new QueryAttackSuiteTaskListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAttackSuiteTaskListResponseBodyData setAttackInstanceId(String attackInstanceId) {
            this.attackInstanceId = attackInstanceId;
            return this;
        }
        public String getAttackInstanceId() {
            return this.attackInstanceId;
        }

        public QueryAttackSuiteTaskListResponseBodyData setDeviceConfigurationId(String deviceConfigurationId) {
            this.deviceConfigurationId = deviceConfigurationId;
            return this;
        }
        public String getDeviceConfigurationId() {
            return this.deviceConfigurationId;
        }

        public QueryAttackSuiteTaskListResponseBodyData setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public QueryAttackSuiteTaskListResponseBodyData setDevicePort(String devicePort) {
            this.devicePort = devicePort;
            return this;
        }
        public String getDevicePort() {
            return this.devicePort;
        }

        public QueryAttackSuiteTaskListResponseBodyData setDeviceType(Integer deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public Integer getDeviceType() {
            return this.deviceType;
        }

        public QueryAttackSuiteTaskListResponseBodyData setScenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }
        public String getScenarioId() {
            return this.scenarioId;
        }

        public QueryAttackSuiteTaskListResponseBodyData setScenarioName(String scenarioName) {
            this.scenarioName = scenarioName;
            return this;
        }
        public String getScenarioName() {
            return this.scenarioName;
        }

        public QueryAttackSuiteTaskListResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryAttackSuiteTaskListResponseBodyData setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public QueryAttackSuiteTaskListResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
