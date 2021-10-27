// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLiveRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRoomResponseBody self = new UpdateLiveRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
