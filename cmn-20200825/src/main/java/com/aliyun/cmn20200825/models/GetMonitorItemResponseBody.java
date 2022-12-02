// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetMonitorItemResponseBody extends TeaModel {
    @NameInMap("MonitorItem")
    public GetMonitorItemResponseBodyMonitorItem monitorItem;

    @NameInMap("RequestId")
    public String requestId;

    public static GetMonitorItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMonitorItemResponseBody self = new GetMonitorItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMonitorItemResponseBody setMonitorItem(GetMonitorItemResponseBodyMonitorItem monitorItem) {
        this.monitorItem = monitorItem;
        return this;
    }
    public GetMonitorItemResponseBodyMonitorItem getMonitorItem() {
        return this.monitorItem;
    }

    public GetMonitorItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMonitorItemResponseBodyMonitorItemAlarmRuleList extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("Value")
        public String value;

        @NameInMap("Variable")
        public String variable;

        public static GetMonitorItemResponseBodyMonitorItemAlarmRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorItemResponseBodyMonitorItemAlarmRuleList self = new GetMonitorItemResponseBodyMonitorItemAlarmRuleList();
            return TeaModel.build(map, self);
        }

        public GetMonitorItemResponseBodyMonitorItemAlarmRuleList setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public GetMonitorItemResponseBodyMonitorItemAlarmRuleList setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetMonitorItemResponseBodyMonitorItemAlarmRuleList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetMonitorItemResponseBodyMonitorItemAlarmRuleList setVariable(String variable) {
            this.variable = variable;
            return this;
        }
        public String getVariable() {
            return this.variable;
        }

    }

    public static class GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("Expression")
        public String expression;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("FieldValue")
        public String fieldValue;

        @NameInMap("Value")
        public String value;

        @NameInMap("Variable")
        public String variable;

        public static GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList self = new GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList();
            return TeaModel.build(map, self);
        }

        public GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList setVariable(String variable) {
            this.variable = variable;
            return this;
        }
        public String getVariable() {
            return this.variable;
        }

    }

    public static class GetMonitorItemResponseBodyMonitorItem extends TeaModel {
        @NameInMap("AlarmRuleList")
        public java.util.List<GetMonitorItemResponseBodyMonitorItemAlarmRuleList> alarmRuleList;

        @NameInMap("AnalysisCode")
        public String analysisCode;

        @NameInMap("CollectionType")
        public String collectionType;

        @NameInMap("Config")
        public String config;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataItem")
        public String dataItem;

        @NameInMap("DeviceForm")
        public String deviceForm;

        @NameInMap("Effective")
        public Integer effective;

        @NameInMap("ExecInterval")
        public Integer execInterval;

        @NameInMap("MonitorItemDescription")
        public String monitorItemDescription;

        @NameInMap("MonitorItemId")
        public String monitorItemId;

        @NameInMap("MonitorItemName")
        public String monitorItemName;

        @NameInMap("PersonalizedAlarmRuleList")
        public java.util.List<GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList> personalizedAlarmRuleList;

        @NameInMap("SecurityDomain")
        public String securityDomain;

        @NameInMap("Type")
        public String type;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetMonitorItemResponseBodyMonitorItem build(java.util.Map<String, ?> map) throws Exception {
            GetMonitorItemResponseBodyMonitorItem self = new GetMonitorItemResponseBodyMonitorItem();
            return TeaModel.build(map, self);
        }

        public GetMonitorItemResponseBodyMonitorItem setAlarmRuleList(java.util.List<GetMonitorItemResponseBodyMonitorItemAlarmRuleList> alarmRuleList) {
            this.alarmRuleList = alarmRuleList;
            return this;
        }
        public java.util.List<GetMonitorItemResponseBodyMonitorItemAlarmRuleList> getAlarmRuleList() {
            return this.alarmRuleList;
        }

        public GetMonitorItemResponseBodyMonitorItem setAnalysisCode(String analysisCode) {
            this.analysisCode = analysisCode;
            return this;
        }
        public String getAnalysisCode() {
            return this.analysisCode;
        }

        public GetMonitorItemResponseBodyMonitorItem setCollectionType(String collectionType) {
            this.collectionType = collectionType;
            return this;
        }
        public String getCollectionType() {
            return this.collectionType;
        }

        public GetMonitorItemResponseBodyMonitorItem setConfig(String config) {
            this.config = config;
            return this;
        }
        public String getConfig() {
            return this.config;
        }

        public GetMonitorItemResponseBodyMonitorItem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMonitorItemResponseBodyMonitorItem setDataItem(String dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public String getDataItem() {
            return this.dataItem;
        }

        public GetMonitorItemResponseBodyMonitorItem setDeviceForm(String deviceForm) {
            this.deviceForm = deviceForm;
            return this;
        }
        public String getDeviceForm() {
            return this.deviceForm;
        }

        public GetMonitorItemResponseBodyMonitorItem setEffective(Integer effective) {
            this.effective = effective;
            return this;
        }
        public Integer getEffective() {
            return this.effective;
        }

        public GetMonitorItemResponseBodyMonitorItem setExecInterval(Integer execInterval) {
            this.execInterval = execInterval;
            return this;
        }
        public Integer getExecInterval() {
            return this.execInterval;
        }

        public GetMonitorItemResponseBodyMonitorItem setMonitorItemDescription(String monitorItemDescription) {
            this.monitorItemDescription = monitorItemDescription;
            return this;
        }
        public String getMonitorItemDescription() {
            return this.monitorItemDescription;
        }

        public GetMonitorItemResponseBodyMonitorItem setMonitorItemId(String monitorItemId) {
            this.monitorItemId = monitorItemId;
            return this;
        }
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        public GetMonitorItemResponseBodyMonitorItem setMonitorItemName(String monitorItemName) {
            this.monitorItemName = monitorItemName;
            return this;
        }
        public String getMonitorItemName() {
            return this.monitorItemName;
        }

        public GetMonitorItemResponseBodyMonitorItem setPersonalizedAlarmRuleList(java.util.List<GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList> personalizedAlarmRuleList) {
            this.personalizedAlarmRuleList = personalizedAlarmRuleList;
            return this;
        }
        public java.util.List<GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList> getPersonalizedAlarmRuleList() {
            return this.personalizedAlarmRuleList;
        }

        public GetMonitorItemResponseBodyMonitorItem setSecurityDomain(String securityDomain) {
            this.securityDomain = securityDomain;
            return this;
        }
        public String getSecurityDomain() {
            return this.securityDomain;
        }

        public GetMonitorItemResponseBodyMonitorItem setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetMonitorItemResponseBodyMonitorItem setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
