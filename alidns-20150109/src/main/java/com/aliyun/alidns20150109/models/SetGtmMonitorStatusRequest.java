// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmMonitorStatusRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    @NameInMap("Status")
    public String status;

    public static SetGtmMonitorStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGtmMonitorStatusRequest self = new SetGtmMonitorStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetGtmMonitorStatusRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public SetGtmMonitorStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetGtmMonitorStatusRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public SetGtmMonitorStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
