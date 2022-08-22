// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopLiveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopLiveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLiveResponseBody self = new StopLiveResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLiveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
