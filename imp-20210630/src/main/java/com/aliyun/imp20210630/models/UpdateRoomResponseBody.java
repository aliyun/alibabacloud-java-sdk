// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoomResponseBody self = new UpdateRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
