// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateAlarmRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AlarmId")
    public Long alarmId;

    @NameInMap("AlarmOn")
    public Boolean alarmOn;

    @NameInMap("AlertLevel")
    public String alertLevel;

    @NameInMap("AlertName")
    public String alertName;

    @NameInMap("AndOr")
    public String andOr;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Conditions")
    public String conditions;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("RepeatInterval")
    public String repeatInterval;

    public static UpdateAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmRuleRequest self = new UpdateAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateAlarmRuleRequest setAlarmId(Long alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public Long getAlarmId() {
        return this.alarmId;
    }

    public UpdateAlarmRuleRequest setAlarmOn(Boolean alarmOn) {
        this.alarmOn = alarmOn;
        return this;
    }
    public Boolean getAlarmOn() {
        return this.alarmOn;
    }

    public UpdateAlarmRuleRequest setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public String getAlertLevel() {
        return this.alertLevel;
    }

    public UpdateAlarmRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public UpdateAlarmRuleRequest setAndOr(String andOr) {
        this.andOr = andOr;
        return this;
    }
    public String getAndOr() {
        return this.andOr;
    }

    public UpdateAlarmRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateAlarmRuleRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public UpdateAlarmRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAlarmRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateAlarmRuleRequest setRepeatInterval(String repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public String getRepeatInterval() {
        return this.repeatInterval;
    }

}
