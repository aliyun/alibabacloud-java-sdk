// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the health check configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>1234abc</p>
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

    public static AddGtmMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGtmMonitorResponseBody self = new AddGtmMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGtmMonitorResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    public AddGtmMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
