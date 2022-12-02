// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListTasksHistoriesResponseBody extends TeaModel {
    @NameInMap("InspectionTasks")
    public java.util.List<ListTasksHistoriesResponseBodyInspectionTasks> inspectionTasks;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListTasksHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTasksHistoriesResponseBody self = new ListTasksHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTasksHistoriesResponseBody setInspectionTasks(java.util.List<ListTasksHistoriesResponseBodyInspectionTasks> inspectionTasks) {
        this.inspectionTasks = inspectionTasks;
        return this;
    }
    public java.util.List<ListTasksHistoriesResponseBodyInspectionTasks> getInspectionTasks() {
        return this.inspectionTasks;
    }

    public ListTasksHistoriesResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListTasksHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTasksHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules extends TeaModel {
        @NameInMap("ActualValue")
        public String actualValue;

        @NameInMap("AlarmExpression")
        public String alarmExpression;

        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("AlarmOperator")
        public String alarmOperator;

        @NameInMap("AlarmValue")
        public String alarmValue;

        public static ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules self = new ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setAlarmExpression(String alarmExpression) {
            this.alarmExpression = alarmExpression;
            return this;
        }
        public String getAlarmExpression() {
            return this.alarmExpression;
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setAlarmOperator(String alarmOperator) {
            this.alarmOperator = alarmOperator;
            return this;
        }
        public String getAlarmOperator() {
            return this.alarmOperator;
        }

        public ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
            return this;
        }
        public String getAlarmValue() {
            return this.alarmValue;
        }

    }

    public static class ListTasksHistoriesResponseBodyInspectionTasks extends TeaModel {
        @NameInMap("DeviceDisplay")
        public String deviceDisplay;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ExecutionBeginTime")
        public String executionBeginTime;

        @NameInMap("ExecutionEndTime")
        public String executionEndTime;

        @NameInMap("InspectionAlarmRules")
        public java.util.List<ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules;

        @NameInMap("InspectionResult")
        public String inspectionResult;

        @NameInMap("TaskId")
        public String taskId;

        public static ListTasksHistoriesResponseBodyInspectionTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTasksHistoriesResponseBodyInspectionTasks self = new ListTasksHistoriesResponseBodyInspectionTasks();
            return TeaModel.build(map, self);
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setDeviceDisplay(String deviceDisplay) {
            this.deviceDisplay = deviceDisplay;
            return this;
        }
        public String getDeviceDisplay() {
            return this.deviceDisplay;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setExecutionBeginTime(String executionBeginTime) {
            this.executionBeginTime = executionBeginTime;
            return this;
        }
        public String getExecutionBeginTime() {
            return this.executionBeginTime;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setExecutionEndTime(String executionEndTime) {
            this.executionEndTime = executionEndTime;
            return this;
        }
        public String getExecutionEndTime() {
            return this.executionEndTime;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setInspectionAlarmRules(java.util.List<ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules) {
            this.inspectionAlarmRules = inspectionAlarmRules;
            return this;
        }
        public java.util.List<ListTasksHistoriesResponseBodyInspectionTasksInspectionAlarmRules> getInspectionAlarmRules() {
            return this.inspectionAlarmRules;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setInspectionResult(String inspectionResult) {
            this.inspectionResult = inspectionResult;
            return this;
        }
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        public ListTasksHistoriesResponseBodyInspectionTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
