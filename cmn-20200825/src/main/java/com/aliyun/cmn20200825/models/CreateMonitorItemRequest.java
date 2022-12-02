// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateMonitorItemRequest extends TeaModel {
    @NameInMap("AlarmRuleList")
    public java.util.List<CreateMonitorItemRequestAlarmRuleList> alarmRuleList;

    @NameInMap("AnalysisCode")
    public String analysisCode;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CollectionType")
    public String collectionType;

    @NameInMap("Config")
    public String config;

    @NameInMap("DataItem")
    public String dataItem;

    @NameInMap("DeviceForm")
    public String deviceForm;

    @NameInMap("Effective")
    public Integer effective;

    @NameInMap("ExecInterval")
    public Integer execInterval;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MonitorItemDescription")
    public String monitorItemDescription;

    @NameInMap("MonitorItemName")
    public String monitorItemName;

    @NameInMap("SecurityDomain")
    public String securityDomain;

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
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Value")
        public String value;

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
