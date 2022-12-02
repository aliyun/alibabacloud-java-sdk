// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateMonitorItemShrinkRequest extends TeaModel {
    @NameInMap("AlarmRuleList")
    public String alarmRuleListShrink;

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

    public static CreateMonitorItemShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorItemShrinkRequest self = new CreateMonitorItemShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateMonitorItemShrinkRequest setAlarmRuleListShrink(String alarmRuleListShrink) {
        this.alarmRuleListShrink = alarmRuleListShrink;
        return this;
    }
    public String getAlarmRuleListShrink() {
        return this.alarmRuleListShrink;
    }

    public CreateMonitorItemShrinkRequest setAnalysisCode(String analysisCode) {
        this.analysisCode = analysisCode;
        return this;
    }
    public String getAnalysisCode() {
        return this.analysisCode;
    }

    public CreateMonitorItemShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateMonitorItemShrinkRequest setCollectionType(String collectionType) {
        this.collectionType = collectionType;
        return this;
    }
    public String getCollectionType() {
        return this.collectionType;
    }

    public CreateMonitorItemShrinkRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public CreateMonitorItemShrinkRequest setDataItem(String dataItem) {
        this.dataItem = dataItem;
        return this;
    }
    public String getDataItem() {
        return this.dataItem;
    }

    public CreateMonitorItemShrinkRequest setDeviceForm(String deviceForm) {
        this.deviceForm = deviceForm;
        return this;
    }
    public String getDeviceForm() {
        return this.deviceForm;
    }

    public CreateMonitorItemShrinkRequest setEffective(Integer effective) {
        this.effective = effective;
        return this;
    }
    public Integer getEffective() {
        return this.effective;
    }

    public CreateMonitorItemShrinkRequest setExecInterval(Integer execInterval) {
        this.execInterval = execInterval;
        return this;
    }
    public Integer getExecInterval() {
        return this.execInterval;
    }

    public CreateMonitorItemShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateMonitorItemShrinkRequest setMonitorItemDescription(String monitorItemDescription) {
        this.monitorItemDescription = monitorItemDescription;
        return this;
    }
    public String getMonitorItemDescription() {
        return this.monitorItemDescription;
    }

    public CreateMonitorItemShrinkRequest setMonitorItemName(String monitorItemName) {
        this.monitorItemName = monitorItemName;
        return this;
    }
    public String getMonitorItemName() {
        return this.monitorItemName;
    }

    public CreateMonitorItemShrinkRequest setSecurityDomain(String securityDomain) {
        this.securityDomain = securityDomain;
        return this;
    }
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    public CreateMonitorItemShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
