// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTasksResponseBody extends TeaModel {
    // 总记录数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 数组，返回示例目录。
    @NameInMap("InspectionTasks")
    public java.util.List<ListInspectionTasksResponseBodyInspectionTasks> inspectionTasks;

    public static ListInspectionTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTasksResponseBody self = new ListInspectionTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectionTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListInspectionTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInspectionTasksResponseBody setNextToken(Integer nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public Integer getNextToken() {
        return this.nextToken;
    }

    public ListInspectionTasksResponseBody setInspectionTasks(java.util.List<ListInspectionTasksResponseBodyInspectionTasks> inspectionTasks) {
        this.inspectionTasks = inspectionTasks;
        return this;
    }
    public java.util.List<ListInspectionTasksResponseBodyInspectionTasks> getInspectionTasks() {
        return this.inspectionTasks;
    }

    public static class ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules extends TeaModel {
        // 告警符号
        @NameInMap("AlarmExpression")
        public String alarmExpression;

        // 告警变量
        @NameInMap("AlarmOperator")
        public String alarmOperator;

        // 告警值
        @NameInMap("AlarmValue")
        public String alarmValue;

        // 告警实际值
        @NameInMap("ActualValue")
        public String actualValue;

        // 告警级别
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        public static ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules self = new ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules setAlarmExpression(String alarmExpression) {
            this.alarmExpression = alarmExpression;
            return this;
        }
        public String getAlarmExpression() {
            return this.alarmExpression;
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

        public ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

    }

    public static class ListInspectionTasksResponseBodyInspectionTasks extends TeaModel {
        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 巡检项ID
        @NameInMap("ItemId")
        public String itemId;

        // 巡检结束时间
        @NameInMap("ExecutionEndTime")
        public String executionEndTime;

        // 巡检开始时间
        @NameInMap("ExecutionBeginTime")
        public String executionBeginTime;

        // 巡检项名字
        @NameInMap("ItemName")
        public String itemName;

        // 模板ID
        @NameInMap("ScriptId")
        public String scriptId;

        // 物理空间
        @NameInMap("Space")
        public String space;

        // 巡检结果
        @NameInMap("InspectionResult")
        public String inspectionResult;

        // 告警规则
        @NameInMap("InspectionAlarmRules")
        public java.util.List<ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules;

        // IP地址
        @NameInMap("IP")
        public String IP;

        // 主机名
        @NameInMap("HostName")
        public String hostName;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 任务状态
        @NameInMap("TaskStatus")
        public String taskStatus;

        // 型号
        @NameInMap("Model")
        public java.util.List<String> model;

        // 错误码
        @NameInMap("ErrorCode")
        public String errorCode;

        // 巡检信息
        @NameInMap("InspectionMessage")
        public String inspectionMessage;

        // 任务ID
        @NameInMap("TaskId")
        public String taskId;

        public static ListInspectionTasksResponseBodyInspectionTasks build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionTasksResponseBodyInspectionTasks self = new ListInspectionTasksResponseBodyInspectionTasks();
            return TeaModel.build(map, self);
        }

        public ListInspectionTasksResponseBodyInspectionTasks setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setExecutionEndTime(String executionEndTime) {
            this.executionEndTime = executionEndTime;
            return this;
        }
        public String getExecutionEndTime() {
            return this.executionEndTime;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setExecutionBeginTime(String executionBeginTime) {
            this.executionBeginTime = executionBeginTime;
            return this;
        }
        public String getExecutionBeginTime() {
            return this.executionBeginTime;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
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

        public ListInspectionTasksResponseBodyInspectionTasks setInspectionResult(String inspectionResult) {
            this.inspectionResult = inspectionResult;
            return this;
        }
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setInspectionAlarmRules(java.util.List<ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules) {
            this.inspectionAlarmRules = inspectionAlarmRules;
            return this;
        }
        public java.util.List<ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules> getInspectionAlarmRules() {
            return this.inspectionAlarmRules;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setModel(java.util.List<String> model) {
            this.model = model;
            return this;
        }
        public java.util.List<String> getModel() {
            return this.model;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setInspectionMessage(String inspectionMessage) {
            this.inspectionMessage = inspectionMessage;
            return this;
        }
        public String getInspectionMessage() {
            return this.inspectionMessage;
        }

        public ListInspectionTasksResponseBodyInspectionTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
