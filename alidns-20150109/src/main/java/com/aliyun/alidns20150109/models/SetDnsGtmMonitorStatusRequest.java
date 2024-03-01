// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmMonitorStatusRequest extends TeaModel {
    /**
     * <p>The language of the values for specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the health check task.</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>Specifies whether to enable the health check feature. Valid values:</p>
     * <br>
     * <p>*   OPEN: enables the health check feature.</p>
     * <p>*   CLOSE: disables the health check feature.</p>
     */
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
