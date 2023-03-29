// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetWaitingRoomConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetWaitingRoomConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetWaitingRoomConfigResponseBody self = new SetWaitingRoomConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SetWaitingRoomConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
