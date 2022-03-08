// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateMonitorItemRequest extends TeaModel {
    // 告警规则列表
    @NameInMap("AlarmRuleList")
    public java.util.List<CreateMonitorItemRequestAlarmRuleList> alarmRuleList;

    // 解析代码
    @NameInMap("AnalysisCode")
    public String analysisCode;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 采集类型
    @NameInMap("CollectionType")
    public String collectionType;

    // 监控项参数配置
    @NameInMap("Config")
    public String config;

    // 数据项
    @NameInMap("DataItem")
    public String dataItem;

    // 设备形态
    @NameInMap("DeviceForm")
    public String deviceForm;

    // 是否启用
    @NameInMap("Effective")
    public Integer effective;

    // 执行间隔(s)
    @NameInMap("ExecInterval")
    public Integer execInterval;

    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 监控项描述
    @NameInMap("MonitorItemDescription")
    public String monitorItemDescription;

    // 监控项名称
    @NameInMap("MonitorItemName")
    public String monitorItemName;

    // 安全域
    @NameInMap("SecurityDomain")
    public String securityDomain;

    // 类型
    @NameInMap("Type")
    public String type;

    public static CreateMonitorItemRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorItemRequest self = new CreateMonitorItemRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorItemRequest setAlarmRuleList(java.util.List<CreateMonitorItemRequestAlarmRuleList> alarmRuleList) {
        this.alarmRuleList = alarmRuleList;
        return this;
    }
    public java.util.List<CreateMonitorItemRequestAlarmRuleList> getAlarmRuleList() {
        return this.alarmRuleList;
    }

    public CreateMonitorItemRequest setAnalysisCode(String analysisCode) {
        this.analysisCode = analysisCode;
        return this;
    }
    public String getAnalysisCode() {
        return this.analysisCode;
    }

    public CreateMonitorItemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMonitorItemRequest setCollectionType(String collectionType) {
        this.collectionType = collectionType;
        return this;
    }
    public String getCollectionType() {
        return this.collectionType;
    }

    public CreateMonitorItemRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateMonitorItemRequest setDataItem(String dataItem) {
        this.dataItem = dataItem;
        return this;
    }
    public String getDataItem() {
        return this.dataItem;
    }

    public CreateMonitorItemRequest setDeviceForm(String deviceForm) {
        this.deviceForm = deviceForm;
        return this;
    }
    public String getDeviceForm() {
        return this.deviceForm;
    }

    public CreateMonitorItemRequest setEffective(Integer effective) {
        this.effective = effective;
        return this;
    }
    public Integer getEffective() {
        return this.effective;
    }

    public CreateMonitorItemRequest setExecInterval(Integer execInterval) {
        this.execInterval = execInterval;
        return this;
    }
    public Integer getExecInterval() {
        return this.execInterval;
    }

    public CreateMonitorItemRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMonitorItemRequest setMonitorItemDescription(String monitorItemDescription) {
        this.monitorItemDescription = monitorItemDescription;
        return this;
    }
    public String getMonitorItemDescription() {
        return this.monitorItemDescription;
    }

    public CreateMonitorItemRequest setMonitorItemName(String monitorItemName) {
        this.monitorItemName = monitorItemName;
        return this;
    }
    public String getMonitorItemName() {
        return this.monitorItemName;
    }

    public CreateMonitorItemRequest setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public CreateMonitorItemRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CreateMonitorItemRequestAlarmRuleList extends TeaModel {
        // 告警状态
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        // 表达式
        @NameInMap("Expression")
        public String expression;

        // 比较值
        @NameInMap("Value")
        public String value;

        // 指标名
        @NameInMap("Variable")
        public String variable;

        public static CreateMonitorItemRequestAlarmRuleList build(java.util.Map<String, ?> map) throws Exception {
            CreateMonitorItemRequestAlarmRuleList self = new CreateMonitorItemRequestAlarmRuleList();
            return TeaModel.build(map, self);
        }

        public CreateMonitorItemRequestAlarmRuleList setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public CreateMonitorItemRequestAlarmRuleList setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public CreateMonitorItemRequestAlarmRuleList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public CreateMonitorItemRequestAlarmRuleList setVariable(String variable) {
            this.variable = variable;
            return this;
        }
        public String getVariable() {
            return this.variable;
        }

    }

}
