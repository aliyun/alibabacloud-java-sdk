// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetInspectionTaskResponseBody extends TeaModel {
    // 周期巡检任务详情
    @NameInMap("InspectionTask")
    public GetInspectionTaskResponseBodyInspectionTask inspectionTask;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionTaskResponseBody self = new GetInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInspectionTaskResponseBody setInspectionTask(GetInspectionTaskResponseBodyInspectionTask inspectionTask) {
        this.inspectionTask = inspectionTask;
        return this;
    }
    public GetInspectionTaskResponseBodyInspectionTask getInspectionTask() {
        return this.inspectionTask;
    }

    public GetInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules extends TeaModel {
        // 告警实际值
        @NameInMap("ActualValue")
        public String actualValue;

        // 告警符号
        @NameInMap("Expression")
        public String expression;

        // 告警级别
        @NameInMap("Level")
        public String level;

        // 告警操作符
        @NameInMap("Operator")
        public String operator;

        // 告警值
        @NameInMap("Value")
        public String value;

        public static GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules self = new GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetInspectionTaskResponseBodyInspectionTask extends TeaModel {
        // 设备回显
        @NameInMap("DeviceDisplay")
        public String deviceDisplay;

        // 设备ID
        @NameInMap("DeviceId")
        public String deviceId;

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
        public java.util.List<GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules> inspectionAlarmRules;

        // 巡检结果
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

        public static GetInspectionTaskResponseBodyInspectionTask build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionTaskResponseBodyInspectionTask self = new GetInspectionTaskResponseBodyInspectionTask();
            return TeaModel.build(map, self);
        }

        public GetInspectionTaskResponseBodyInspectionTask setDeviceDisplay(String deviceDisplay) {
            this.deviceDisplay = deviceDisplay;
            return this;
        }
        public String getDeviceDisplay() {
            return this.deviceDisplay;
        }

        public GetInspectionTaskResponseBodyInspectionTask setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetInspectionTaskResponseBodyInspectionTask setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetInspectionTaskResponseBodyInspectionTask setExecutionBeginTime(String executionBeginTime) {
            this.executionBeginTime = executionBeginTime;
            return this;
        }
        public String getExecutionBeginTime() {
            return this.executionBeginTime;
        }

        public GetInspectionTaskResponseBodyInspectionTask setExecutionEndTime(String executionEndTime) {
            this.executionEndTime = executionEndTime;
            return this;
        }
        public String getExecutionEndTime() {
            return this.executionEndTime;
        }

        public GetInspectionTaskResponseBodyInspectionTask setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public GetInspectionTaskResponseBodyInspectionTask setIP(String IP) {
            this.IP = IP;
            return this;
        }
        public String getIP() {
            return this.IP;
        }

        public GetInspectionTaskResponseBodyInspectionTask setInspectionAlarmRules(java.util.List<GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules> inspectionAlarmRules) {
            this.inspectionAlarmRules = inspectionAlarmRules;
            return this;
        }
        public java.util.List<GetInspectionTaskResponseBodyInspectionTaskInspectionAlarmRules> getInspectionAlarmRules() {
            return this.inspectionAlarmRules;
        }

        public GetInspectionTaskResponseBodyInspectionTask setInspectionResult(String inspectionResult) {
            this.inspectionResult = inspectionResult;
            return this;
        }
        public String getInspectionResult() {
            return this.inspectionResult;
        }

        public GetInspectionTaskResponseBodyInspectionTask setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public GetInspectionTaskResponseBodyInspectionTask setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }
        public String getItemName() {
            return this.itemName;
        }

        public GetInspectionTaskResponseBodyInspectionTask setModel(java.util.List<String> model) {
            this.model = model;
            return this;
        }
        public java.util.List<String> getModel() {
            return this.model;
        }

        public GetInspectionTaskResponseBodyInspectionTask setScriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }
        public String getScriptId() {
            return this.scriptId;
        }

        public GetInspectionTaskResponseBodyInspectionTask setSpace(String space) {
            this.space = space;
            return this;
        }
        public String getSpace() {
            return this.space;
        }

        public GetInspectionTaskResponseBodyInspectionTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetInspectionTaskResponseBodyInspectionTask setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetInspectionTaskResponseBodyInspectionTask setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
