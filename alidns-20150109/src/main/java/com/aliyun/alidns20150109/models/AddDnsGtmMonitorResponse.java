// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDnsGtmMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    public static AddDnsGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDnsGtmMonitorResponse self = new AddDnsGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

    public AddDnsGtmMonitorResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDnsGtmMonitorResponse setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

}
