// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteAlarmRuleRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AlarmIds")
    public String alarmIds;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static DeleteAlarmRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlarmRuleRequest self = new DeleteAlarmRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlarmRuleRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public DeleteAlarmRuleRequest setAlarmIds(String alarmIds) {
        this.alarmIds = alarmIds;
        return this;
    }
    public String getAlarmIds() {
        return this.alarmIds;
    }

    public DeleteAlarmRuleRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteAlarmRuleRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteAlarmRuleRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
