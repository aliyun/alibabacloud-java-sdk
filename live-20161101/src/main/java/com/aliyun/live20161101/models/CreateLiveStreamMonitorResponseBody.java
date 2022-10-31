// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamMonitorResponseBody extends TeaModel {
    @NameInMap("MonitorId")
    public String monitorId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateLiveStreamMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveStreamMonitorResponseBody self = new CreateLiveStreamMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLiveStreamMonitorResponseBody setMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    public String getMonitorId() {
        return this.monitorId;
    }

    public CreateLiveStreamMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
