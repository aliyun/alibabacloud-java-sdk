// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveStreamMonitorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveStreamMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveStreamMonitorResponseBody self = new UpdateLiveStreamMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveStreamMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
