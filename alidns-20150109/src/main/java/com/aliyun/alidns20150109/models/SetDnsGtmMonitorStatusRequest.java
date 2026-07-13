// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDnsGtmMonitorStatusRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values: en, zh, and ja. The default value is en.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the health check configuration. You can call the <a href="https://www.alibabacloud.com/help/en/dns/api-alidns-2015-01-09-describednsgtminstanceaddresspool">DescribeDnsGtmInstanceAddressPool</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Monito*****</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The status to set for the health check. Valid values:</p>
     * <ul>
     * <li><p>OPEN: Enables the health check.</p>
     * </li>
     * <li><p>CLOSE: Disables the health check.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OPEN</p>
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
