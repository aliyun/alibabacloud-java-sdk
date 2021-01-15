// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetInspectionTaskResponseBody extends TeaModel {
    // 物理空间
    @NameInMap("Space")
    public String space;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 巡检结果
    @NameInMap("InspectionResult")
    public String inspectionResult;

    // 告警规则
    @NameInMap("InspectionAlarmRules")
    public java.util.List<GetInspectionTaskResponseBodyInspectionAlarmRules> inspectionAlarmRules;

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

    // 巡检项ID
    @NameInMap("ItemId")
    public String itemId;

    // 巡检结束时间
    @NameInMap("ExecutionEndTime")
    public String executionEndTime;

    // 巡检开始时间
    @NameInMap("ExecutionBeginTime")
    public String executionBeginTime;

    // 型号
    @NameInMap("Model")
    public java.util.List<String> model;

    // 巡检项名字
    @NameInMap("ItemName")
    public String itemName;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 模板ID
    @NameInMap("ScriptId")
    public String scriptId;

    // 任务ID
    @NameInMap("TaskId")
    public String taskId;

    public static GetInspectionTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInspectionTaskResponseBody self = new GetInspectionTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInspectionTaskResponseBody setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public GetInspectionTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInspectionTaskResponseBody setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetInspectionTaskResponseBody setInspectionResult(String inspectionResult) {
        this.inspectionResult = inspectionResult;
        return this;
    }
    public String getInspectionResult() {
        return this.inspectionResult;
    }

    public GetInspectionTaskResponseBody setInspectionAlarmRules(java.util.List<GetInspectionTaskResponseBodyInspectionAlarmRules> inspectionAlarmRules) {
        this.inspectionAlarmRules = inspectionAlarmRules;
        return this;
    }
    public java.util.List<GetInspectionTaskResponseBodyInspectionAlarmRules> getInspectionAlarmRules() {
        return this.inspectionAlarmRules;
    }

    public GetInspectionTaskResponseBody setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public GetInspectionTaskResponseBody setHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }
    public String getHostName() {
        return this.hostName;
    }

    public GetInspectionTaskResponseBody setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public GetInspectionTaskResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetInspectionTaskResponseBody setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public GetInspectionTaskResponseBody setExecutionEndTime(String executionEndTime) {
        this.executionEndTime = executionEndTime;
        return this;
    }
    public String getExecutionEndTime() {
        return this.executionEndTime;
    }

    public GetInspectionTaskResponseBody setExecutionBeginTime(String executionBeginTime) {
        this.executionBeginTime = executionBeginTime;
        return this;
    }
    public String getExecutionBeginTime() {
        return this.executionBeginTime;
    }

    public GetInspectionTaskResponseBody setModel(java.util.List<String> model) {
        this.model = model;
        return this;
    }
    public java.util.List<String> getModel() {
        return this.model;
    }

    public GetInspectionTaskResponseBody setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public GetInspectionTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetInspectionTaskResponseBody setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public GetInspectionTaskResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class GetInspectionTaskResponseBodyInspectionAlarmRules extends TeaModel {
        // 告警符号
        @NameInMap("Expression")
        public String expression;

        // 告警操作符
        @NameInMap("Operator")
        public String operator;

        // 告警值
        @NameInMap("Value")
        public String value;

        // 告警实际值
        @NameInMap("ActualValue")
        public String actualValue;

        // 告警级别
        @NameInMap("Level")
        public String level;

        public static GetInspectionTaskResponseBodyInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            GetInspectionTaskResponseBodyInspectionAlarmRules self = new GetInspectionTaskResponseBodyInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public GetInspectionTaskResponseBodyInspectionAlarmRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetInspectionTaskResponseBodyInspectionAlarmRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetInspectionTaskResponseBodyInspectionAlarmRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetInspectionTaskResponseBodyInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public GetInspectionTaskResponseBodyInspectionAlarmRules setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
