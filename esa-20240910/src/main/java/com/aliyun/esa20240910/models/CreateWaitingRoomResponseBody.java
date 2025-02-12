// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateWaitingRoomResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>85H66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WaitingRoomId")
    public String waitingRoomId;

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

    public CreateWaitingRoomResponseBody setWaitingRoomId(String waitingRoomId) {
        this.waitingRoomId = waitingRoomId;
        return this;
    }
    public String getWaitingRoomId() {
        return this.waitingRoomId;
    }

}
