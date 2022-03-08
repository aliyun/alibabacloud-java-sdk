// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class InspectionScript extends TeaModel {
    // 巡检告警规则
    @NameInMap("InspectionAlarmRules")
    public java.util.List<InspectionScriptInspectionAlarmRules> inspectionAlarmRules;

    // 巡检项定时表达式
    @NameInMap("InspectionCrontab")
    public String inspectionCrontab;

    // 巡检项描述
    @NameInMap("ItemDescription")
    public String itemDescription;

    // 巡检项ID
    @NameInMap("ItemId")
    public String itemId;

    // 巡检项名字
    @NameInMap("ItemName")
    public String itemName;

    // 型号
    @NameInMap("Model")
    public String model;

    // 角色
    @NameInMap("Role")
    public String role;

    // 模板执行内容
    @NameInMap("Script")
    public String script;

    // 巡检模板ID
    @NameInMap("ScriptId")
    public String scriptId;

    // 模板状态
    @NameInMap("ScriptStatus")
    public String scriptStatus;

    // 厂商
    @NameInMap("Vendor")
    public String vendor;

    public static InspectionScript build(java.util.Map<String, ?> map) throws Exception {
        InspectionScript self = new InspectionScript();
        return TeaModel.build(map, self);
    }

    public InspectionScript setInspectionAlarmRules(java.util.List<InspectionScriptInspectionAlarmRules> inspectionAlarmRules) {
        this.inspectionAlarmRules = inspectionAlarmRules;
        return this;
    }
    public java.util.List<InspectionScriptInspectionAlarmRules> getInspectionAlarmRules() {
        return this.inspectionAlarmRules;
    }

    public InspectionScript setInspectionCrontab(String inspectionCrontab) {
        this.inspectionCrontab = inspectionCrontab;
        return this;
    }
    public String getInspectionCrontab() {
        return this.inspectionCrontab;
    }

    public InspectionScript setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }
    public String getItemDescription() {
        return this.itemDescription;
    }

    public InspectionScript setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public InspectionScript setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }
    public String getItemName() {
        return this.itemName;
    }

    public InspectionScript setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InspectionScript setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public InspectionScript setScript(String script) {
        this.script = script;
        return this;
    }
    public String getScript() {
        return this.script;
    }

    public InspectionScript setScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }
    public String getScriptId() {
        return this.scriptId;
    }

    public InspectionScript setScriptStatus(String scriptStatus) {
        this.scriptStatus = scriptStatus;
        return this;
    }
    public String getScriptStatus() {
        return this.scriptStatus;
    }

    public InspectionScript setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

    public static class InspectionScriptInspectionAlarmRules extends TeaModel {
        // 告警表达式
        @NameInMap("AlarmExpression")
        public String alarmExpression;

        // 告警级别
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        // 告警符号
        @NameInMap("AlarmOperator")
        public String alarmOperator;

        // 告警值
        @NameInMap("AlarmValue")
        public String alarmValue;

        public static InspectionScriptInspectionAlarmRules build(java.util.Map<String, ?> map) throws Exception {
            InspectionScriptInspectionAlarmRules self = new InspectionScriptInspectionAlarmRules();
            return TeaModel.build(map, self);
        }

        public InspectionScriptInspectionAlarmRules setAlarmExpression(String alarmExpression) {
            this.alarmExpression = alarmExpression;
            return this;
        }
        public String getAlarmExpression() {
            return this.alarmExpression;
        }

        public InspectionScriptInspectionAlarmRules setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public InspectionScriptInspectionAlarmRules setAlarmOperator(String alarmOperator) {
            this.alarmOperator = alarmOperator;
            return this;
        }
        public String getAlarmOperator() {
            return this.alarmOperator;
        }

        public InspectionScriptInspectionAlarmRules setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
            return this;
        }
        public String getAlarmValue() {
            return this.alarmValue;
        }

    }

}
