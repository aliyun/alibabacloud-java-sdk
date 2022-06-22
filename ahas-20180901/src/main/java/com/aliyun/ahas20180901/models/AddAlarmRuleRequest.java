// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class AddAlarmRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AlarmOn")
    public Boolean alarmOn;

    @NameInMap("AlertGroup")
    public String alertGroup;

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

    @NameInMap("SilencePeriod")
    public String silencePeriod;

    public static AddAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAlarmRuleRequest self = new AddAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddAlarmRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public AddAlarmRuleRequest setAlarmOn(Boolean alarmOn) {
        this.alarmOn = alarmOn;
        return this;
    }
    public Boolean getAlarmOn() {
        return this.alarmOn;
    }

    public AddAlarmRuleRequest setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public String getAlertGroup() {
        return this.alertGroup;
    }

    public AddAlarmRuleRequest setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
        return this;
    }
    public String getAlertLevel() {
        return this.alertLevel;
    }

    public AddAlarmRuleRequest setAlertName(String alertName) {
        this.alertName = alertName;
        return this;
    }
    public String getAlertName() {
        return this.alertName;
    }

    public AddAlarmRuleRequest setAndOr(String andOr) {
        this.andOr = andOr;
        return this;
    }
    public String getAndOr() {
        return this.andOr;
    }

    public AddAlarmRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AddAlarmRuleRequest setConditions(String conditions) {
        this.conditions = conditions;
        return this;
    }
    public String getConditions() {
        return this.conditions;
    }

    public AddAlarmRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddAlarmRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public AddAlarmRuleRequest setRepeatInterval(String repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }
    public String getRepeatInterval() {
        return this.repeatInterval;
    }

    public AddAlarmRuleRequest setSilencePeriod(String silencePeriod) {
        this.silencePeriod = silencePeriod;
        return this;
    }
    public String getSilencePeriod() {
        return this.silencePeriod;
    }

}
