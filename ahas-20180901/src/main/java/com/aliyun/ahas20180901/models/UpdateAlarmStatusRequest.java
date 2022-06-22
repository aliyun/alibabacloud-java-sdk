// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateAlarmStatusRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("AlarmId")
    public Long alarmId;

    @NameInMap("AlarmOn")
    public Boolean alarmOn;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Namespace")
    public String namespace;

    public static UpdateAlarmStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlarmStatusRequest self = new UpdateAlarmStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlarmStatusRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public UpdateAlarmStatusRequest setAlarmId(Long alarmId) {
        this.alarmId = alarmId;
        return this;
    }
    public Long getAlarmId() {
        return this.alarmId;
    }

    public UpdateAlarmStatusRequest setAlarmOn(Boolean alarmOn) {
        this.alarmOn = alarmOn;
        return this;
    }
    public Boolean getAlarmOn() {
        return this.alarmOn;
    }

    public UpdateAlarmStatusRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateAlarmStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAlarmStatusRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
