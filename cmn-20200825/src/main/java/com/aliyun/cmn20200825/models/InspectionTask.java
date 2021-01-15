// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class InspectionTask extends TeaModel {
    // 巡检模板ID
    @NameInMap("TemplateId")
    public String templateId;

    // 巡检项名字
    @NameInMap("ItemName")
    public String itemName;

    // 巡检项ID
    @NameInMap("ItemId")
    public String itemId;

    // 物理空间
    @NameInMap("Space")
    public String space;

    // 主机名
    @NameInMap("Hostname")
    public String hostname;

    // 设备IP
    @NameInMap("IP")
    public String IP;

    // 厂商
    @NameInMap("Vendor")
    public String vendor;

    // 型号
    @NameInMap("Model")
    public String model;

    // 角色
    @NameInMap("Role")
    public String role;

    // 任务状态
    @NameInMap("TaskStatus")
    public String taskStatus;

    // 设备ID
    @NameInMap("DeviceId")
    public String deviceId;

    // 错误码
    @NameInMap("ErrorCode")
    public String errorCode;

    // 执行结果
    @NameInMap("InspectionResult")
    public String inspectionResult;

    // 执行开始时间
    @NameInMap("ExecutionBeginTime")
    public String executionBeginTime;

    // 执行结束时间
    @NameInMap("ExecutionEndTime")
    public String executionEndTime;

    // 告警规则
    @NameInMap("InspectionAlarmRules")
    public java.util.List<InspectionTaskInspectionAlarmRules> inspectionAlarmRules;

    public static InspectionTask build(java.util.Map<String, ?> map) throws Exception {
        InspectionTask self = new InspectionTask();
        return TeaModel.build(map, self);
    }

    public InspectionTask setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public InspectionTask setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public InspectionTask setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public InspectionTask setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public InspectionTask setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public InspectionTask setIP(String IP) {
        this.IP = IP;
        return this;
    }
    public String getIP() {
        return this.IP;
    }

    public InspectionTask setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public InspectionTask setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InspectionTask setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public InspectionTask setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public InspectionTask setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public InspectionTask setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public InspectionTask setInspectionResult(String inspectionResult) {
        this.inspectionResult = inspectionResult;
        return this;
    }
    public String getInspectionResult() {
        return this.inspectionResult;
    }

    public InspectionTask setExecutionBeginTime(String executionBeginTime) {
        this.executionBeginTime = executionBeginTime;
        return this;
    }
    public String getExecutionBeginTime() {
        return this.executionBeginTime;
    }

    public InspectionTask setExecutionEndTime(String executionEndTime) {
        this.executionEndTime = executionEndTime;
        return this;
    }
    public String getExecutionEndTime() {
        return this.executionEndTime;
    }

    public InspectionTask setInspectionAlarmRules(java.util.List<InspectionTaskInspectionAlarmRules> inspectionAlarmRules) {
        this.inspectionAlarmRules = inspectionAlarmRules;
        return this;
    }
    public java.util.List<InspectionTaskInspectionAlarmRules> getInspectionAlarmRules() {
        return this.inspectionAlarmRules;
    }

    public static class InspectionTaskInspectionAlarmRules extends TeaModel {
        // 告警表达式
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

        public static InspectionTaskInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            InspectionTaskInspectionAlarmRules self = new InspectionTaskInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public InspectionTaskInspectionAlarmRules setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public InspectionTaskInspectionAlarmRules setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public InspectionTaskInspectionAlarmRules setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public InspectionTaskInspectionAlarmRules setActualValue(String actualValue) {
            this.actualValue = actualValue;
            return this;
        }
        public String getActualValue() {
            return this.actualValue;
        }

        public InspectionTaskInspectionAlarmRules setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
