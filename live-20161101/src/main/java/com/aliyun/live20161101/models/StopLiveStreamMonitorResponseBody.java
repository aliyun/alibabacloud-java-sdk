// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveStreamMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopLiveStreamMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLiveStreamMonitorResponseBody self = new StopLiveStreamMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLiveStreamMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
