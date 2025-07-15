// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveStreamMonitorResponseBody extends TeaModel {
    /**
     * <p>The ID of the monitoring session.</p>
     * 
     * <strong>example:</strong>
     * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
     */
    @NameInMap("MonitorId")
    public String monitorId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b9676b3</p>
     */
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
