// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmMonitorResponseBody extends TeaModel {
    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

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
