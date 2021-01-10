// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteRoomResponseBody extends TeaModel {
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
