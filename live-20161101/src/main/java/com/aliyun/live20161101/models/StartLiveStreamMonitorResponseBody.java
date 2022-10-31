// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveStreamMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StartLiveStreamMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartLiveStreamMonitorResponseBody self = new StartLiveStreamMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public StartLiveStreamMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
