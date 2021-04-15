// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateAlarmRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("AlarmAliasName")
    public String alarmAliasName;

    @NameInMap("AlertWay")
    public java.util.Map<String, ?> alertWay;

    @NameInMap("ContactGroupIds")
    public java.util.Map<String, ?> contactGroupIds;

    @NameInMap("AlarmItem")
    public String alarmItem;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Aggregates")
    public String aggregates;

    @NameInMap("NValue")
    public Integer NValue;

    @NameInMap("Value")
    public Float value;

    public static CreateAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmRuleRequest self = new CreateAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlarmRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAlarmRuleRequest setAlarmAliasName(String alarmAliasName) {
        this.alarmAliasName = alarmAliasName;
        return this;
    }
    public String getAlarmAliasName() {
        return this.alarmAliasName;
    }

    public CreateAlarmRuleRequest setAlertWay(java.util.Map<String, ?> alertWay) {
        this.alertWay = alertWay;
        return this;
    }
    public java.util.Map<String, ?> getAlertWay() {
        return this.alertWay;
    }

    public CreateAlarmRuleRequest setContactGroupIds(java.util.Map<String, ?> contactGroupIds) {
        this.contactGroupIds = contactGroupIds;
        return this;
    }
    public java.util.Map<String, ?> getContactGroupIds() {
        return this.contactGroupIds;
    }

    public CreateAlarmRuleRequest setAlarmItem(String alarmItem) {
        this.alarmItem = alarmItem;
        return this;
    }
    public String getAlarmItem() {
        return this.alarmItem;
    }

    public CreateAlarmRuleRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateAlarmRuleRequest setAggregates(String aggregates) {
        this.aggregates = aggregates;
        return this;
    }
    public String getAggregates() {
        return this.aggregates;
    }

    public CreateAlarmRuleRequest setNValue(Integer NValue) {
        this.NValue = NValue;
        return this;
    }
    public Integer getNValue() {
        return this.NValue;
    }

    public CreateAlarmRuleRequest setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
