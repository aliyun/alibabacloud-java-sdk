// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteLiveRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveRoomResponseBody self = new DeleteLiveRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
