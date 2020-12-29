// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MonitorConfigId")
    public String monitorConfigId;

    public static AddGtmMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddGtmMonitorResponseBody self = new AddGtmMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public AddGtmMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddGtmMonitorResponseBody setMonitorConfigId(String monitorConfigId) {
        this.monitorConfigId = monitorConfigId;
        return this;
    }
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

}
