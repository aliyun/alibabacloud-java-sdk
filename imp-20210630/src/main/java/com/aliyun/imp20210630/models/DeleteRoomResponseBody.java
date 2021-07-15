// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteRoomResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoomResponseBody self = new DeleteRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
