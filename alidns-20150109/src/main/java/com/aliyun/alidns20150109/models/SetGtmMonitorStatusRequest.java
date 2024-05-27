// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmMonitorStatusRequest extends TeaModel {
    /**
     * <p>The language used by the user.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The health check ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>Specifies whether health check is enabled for the address pool. Valid values:</p>
     * <br>
     * <p>*   **OPEN**: Enabled</p>
     * <p>*   **CLOSE**: Disabled</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public String status;

    public static SetGtmMonitorStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGtmMonitorStatusRequest self = new SetGtmMonitorStatusRequest();
        return TeaModel.build(map, self);
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
