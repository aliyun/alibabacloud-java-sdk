// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class KickRoomUserResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static KickRoomUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KickRoomUserResponseBody self = new KickRoomUserResponseBody();
        return TeaModel.build(map, self);
    }

    public KickRoomUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
