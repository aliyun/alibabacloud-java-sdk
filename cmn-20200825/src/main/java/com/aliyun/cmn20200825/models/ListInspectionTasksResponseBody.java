// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTasksResponseBody extends TeaModel {
    // 数组，返回示例目录。
    @NameInMap("InspectionTasks")
    public java.util.List<ListInspectionTasksResponseBodyInspectionTasks> inspectionTasks;

    // 当总结果个数大于MaxResults时，用于翻页的token。
    @NameInMap("NextToken")
    public Integer nextToken;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总记录数。
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
        // 告警实际值
        @NameInMap("ActualValue")
        public String actualValue;

        // 告警符号
        @NameInMap("AlarmExpression")
        public String alarmExpression;

        // 告警级别
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        // 告警变量
        @NameInMap("AlarmOperator")
        public String alarmOperator;

        // 告警值
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
        // 告警结果状态
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

        // 设备类型
        @NameInMap("DeviceType")
        public String deviceType;

        // 错误码
        @NameInMap("ErrorCode")
        public String errorCode;

        // 巡检开始时间
        @NameInMap("ExecutionBeginTime")
        public String executionBeginTime;

        // 巡检结束时间
        @NameInMap("ExecutionEndTime")
        public String executionEndTime;

        // 主机名
        @NameInMap("HostName")
        public String hostName;

        // IP地址
        @NameInMap("IP")
        public String IP;

        // 告警规则
        @NameInMap("InspectionAlarmRules")
        public java.util.List<ListInspectionTasksResponseBodyInspectionTasksInspectionAlarmRules> inspectionAlarmRules;

        // 巡检信息
        @NameInMap("InspectionMessage")
        public String inspectionMessage;

        // 巡检结果（可能截断）
        @NameInMap("InspectionResult")
        public String inspectionResult;

        // 巡检项ID
        @NameInMap("ItemId")
        public String itemId;

        // 巡检项名字
        @NameInMap("ItemName")
        public String itemName;

        // 型号
        @NameInMap("Model")
        public java.util.List<String> model;

        // 角色
        @NameInMap("Role")
        public String role;

        // 模板ID
        @NameInMap("ScriptId")
        public String scriptId;

        // 物理空间
        @NameInMap("Space")
        public String space;

        // 任务ID
        @NameInMap("TaskId")
        public String taskId;

        // 任务状态
        @NameInMap("TaskStatus")
        public String taskStatus;

        // 厂商
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
