// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopLiveRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static StopLiveRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopLiveRoomResponseBody self = new StopLiveRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public StopLiveRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
