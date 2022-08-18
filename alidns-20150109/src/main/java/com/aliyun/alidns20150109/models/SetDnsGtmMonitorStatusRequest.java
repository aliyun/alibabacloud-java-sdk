// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmMonitorStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    @NameInMap("Status")
    public String status;

    public static SetDnsGtmMonitorStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDnsGtmMonitorStatusRequest self = new SetDnsGtmMonitorStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetDnsGtmMonitorStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public SetDnsGtmMonitorStatusRequest setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public SetDnsGtmMonitorStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
