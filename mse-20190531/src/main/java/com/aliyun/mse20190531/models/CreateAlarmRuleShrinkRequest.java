// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateAlarmRuleShrinkRequest extends TeaModel {
    @NameInMap("Aggregates")
    public String aggregates;

    @NameInMap("AlarmAliasName")
    public String alarmAliasName;

    @NameInMap("AlarmItem")
    public String alarmItem;

    @NameInMap("AlertWay")
    public String alertWayShrink;

    @NameInMap("ContactGroupIds")
    public String contactGroupIdsShrink;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NValue")
    public Integer NValue;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Value")
    public Float value;

    public static CreateAlarmRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlarmRuleShrinkRequest self = new CreateAlarmRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlarmRuleShrinkRequest setAggregates(String aggregates) {
        this.aggregates = aggregates;
        return this;
    }
    public String getAggregates() {
        return this.aggregates;
    }

    public CreateAlarmRuleShrinkRequest setAlarmAliasName(String alarmAliasName) {
        this.alarmAliasName = alarmAliasName;
        return this;
    }
    public String getAlarmAliasName() {
        return this.alarmAliasName;
    }

    public CreateAlarmRuleShrinkRequest setAlarmItem(String alarmItem) {
        this.alarmItem = alarmItem;
        return this;
    }
    public String getAlarmItem() {
        return this.alarmItem;
    }

    public CreateAlarmRuleShrinkRequest setAlertWayShrink(String alertWayShrink) {
        this.alertWayShrink = alertWayShrink;
        return this;
    }
    public String getAlertWayShrink() {
        return this.alertWayShrink;
    }

    public CreateAlarmRuleShrinkRequest setContactGroupIdsShrink(String contactGroupIdsShrink) {
        this.contactGroupIdsShrink = contactGroupIdsShrink;
        return this;
    }
    public String getContactGroupIdsShrink() {
        return this.contactGroupIdsShrink;
    }

    public CreateAlarmRuleShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAlarmRuleShrinkRequest setNValue(Integer NValue) {
        this.NValue = NValue;
        return this;
    }
    public Integer getNValue() {
        return this.NValue;
    }

    public CreateAlarmRuleShrinkRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public CreateAlarmRuleShrinkRequest setValue(Float value) {
        this.value = value;
        return this;
    }
    public Float getValue() {
        return this.value;
    }

}
