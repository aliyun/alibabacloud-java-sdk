// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the health check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>MonitorConfigId1</p>
     */
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDnsGtmMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmMonitorResponseBody self = new AddDnsGtmMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmMonitorResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public AddDnsGtmMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
