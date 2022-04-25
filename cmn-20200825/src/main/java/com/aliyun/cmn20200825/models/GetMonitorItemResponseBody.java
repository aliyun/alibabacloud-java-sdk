// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class GetMonitorItemResponseBody extends TeaModel {
    // 数据
    @NameInMap("MonitorItem")
    public GetMonitorItemResponseBodyMonitorItem monitorItem;

    // Id of the request
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
        // 告警规则
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
        // 告警规则
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        // 表达式
        @NameInMap("Expression")
        public String expression;

        // 个性化对象类型
        @NameInMap("FieldName")
        public String fieldName;

        // 个性化对象值
        @NameInMap("FieldValue")
        public String fieldValue;

        // 类型
        @NameInMap("Value")
        public String value;

        // 指标名
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
        // 通用告警规则列表
        @NameInMap("AlarmRuleList")
        public java.util.List<GetMonitorItemResponseBodyMonitorItemAlarmRuleList> alarmRuleList;

        // 解析代码
        @NameInMap("AnalysisCode")
        public String analysisCode;

        // 采集类型
        @NameInMap("CollectionType")
        public String collectionType;

        // 监控项参数配置
        @NameInMap("Config")
        public String config;

        // 创建时间
        @NameInMap("CreateTime")
        public String createTime;

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

        // 监控项描述
        @NameInMap("MonitorItemDescription")
        public String monitorItemDescription;

        // 监控项ID
        @NameInMap("MonitorItemId")
        public String monitorItemId;

        // 监控项名称
        @NameInMap("MonitorItemName")
        public String monitorItemName;

        // 个性化告警规则列表
        @NameInMap("PersonalizedAlarmRuleList")
        public java.util.List<GetMonitorItemResponseBodyMonitorItemPersonalizedAlarmRuleList> personalizedAlarmRuleList;

        // 安全域
        @NameInMap("SecurityDomain")
        public String securityDomain;

        // 类型
        @NameInMap("Type")
        public String type;

        // 修改时间
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
