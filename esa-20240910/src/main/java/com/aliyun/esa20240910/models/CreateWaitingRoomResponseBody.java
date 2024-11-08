// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateWaitingRoomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWaitingRoomResponseBody self = new CreateWaitingRoomResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWaitingRoomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
