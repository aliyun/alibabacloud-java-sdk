// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTasksResponseBody extends TeaModel {
    @NameInMap("InspectionTasks")
    public java.util.List<ListInspectionTasksResponseBodyInspectionTasks> inspectionTasks;

    @NameInMap("NextToken")
    public Integer nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInspectionTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTasksResponseBody self = new ListInspectionTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectionTasksResponseBody setInspectionTasks(java.util.List<ListInspectionTasksResponseBodyInspectionTasks> inspectionTasks) {
        this.inspectionTasks = inspectionTasks;
        return this;
    }
    public java.util.List<ListInspectionTasksResponseBodyInspectionTasks> getInspectionTasks() {
        return this.inspectionTasks;
    }

    public ListInspectionTasksResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListInspectionTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInspectionTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules extends TeaModel {
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

        public static ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules self = new ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules setAlarmExpression(String alarmExpression) {
            this.alarmExpression = alarmExpression;
            return this;
        }
        public String getAlarmExpression() {
            return this.alarmExpression;
        }

        public ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules setAlarmOperator(String alarmOperator) {
            this.alarmOperator = alarmOperator;
            return this;
        }
        public String getAlarmOperator() {
            return this.alarmOperator;
        }

        public ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
            return this;
        }
        public String getAlarmValue() {
            return this.alarmValue;
        }

    }

    public static class ListInspectionTasksResponseBodyInspectionTasks extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ExecutionBeginTime")
        public String executionBeginTime;

        @NameInMap("ExecutionEndTime")
        public String executionEndTime;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("IP")
        public String IP;

        @NameInMap("InspectionAlarmRules")
        public java.util.List<ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules;

        @NameInMap("InspectionMessage")
        public String inspectionMessage;

        @NameInMap("InspectionResult")
        public String inspectionResult;

        @NameInMap("IsInspectionResultTruncation")
        public Boolean isInspectionResultTruncation;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("ItemName")
        public String itemName;

        @NameInMap("Model")
        public java.util.List<String> model;

        @NameInMap("Role")
        public String role;

        @NameInMap("ScriptId")
        public String scriptId;

        @NameInMap("Space")
        public String space;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("Vendor")
        public String vendor;

        public static ListInspectionTasksResponseBodyInspectionTasks build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTasksResponseBodyInspectionTasks self = new ListInspectionTasksResponseBodyInspectionTasks();
            return TeaModel.build(map, self);
        }

        public ListInspectionTasksResponseBodyInspectionTasks setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setExecutionBeginTime(String executionBeginTime) {
            this.executionBeginTime = executionBeginTime;
            return this;
        }
        public String getExecutionBeginTime() {
            return this.executionBeginTime;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setExecutionEndTime(String executionEndTime) {
            this.executionEndTime = executionEndTime;
            return this;
        }
        public String getExecutionEndTime() {
            return this.executionEndTime;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setInspectionAlarmRules(java.util.List<ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules) {
            this.inspectionAlarmRules = inspectionAlarmRules;
            return this;
        }
        public java.util.List<ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules> getInspectionAlarmRules() {
            return this.inspectionAlarmRules;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setInspectionMessage(String inspectionMessage) {
            this.inspectionMessage = inspectionMessage;
            return this;
        }
        public String getInspectionMessage() {
            return this.inspectionMessage;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setInspectionResult(String inspectionResult) {
            this.inspectionResult = inspectionResult;
            return this;
        }
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setIsInspectionResultTruncation(Boolean isInspectionResultTruncation) {
            this.isInspectionResultTruncation = isInspectionResultTruncation;
            return this;
        }
        public Boolean getIsInspectionResultTruncation() {
            return this.isInspectionResultTruncation;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setModel(java.util.List<String> model) {
            this.model = model;
            return this;
        }
        public java.util.List<String> getModel() {
            return this.model;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setSpace(String space) {
            this.space = space;
            return this;
        }
        public String getSpace() {
            return this.space;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
