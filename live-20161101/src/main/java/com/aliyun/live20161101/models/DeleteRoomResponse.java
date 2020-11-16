// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteRoomResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoomResponse self = new DeleteRoomResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoomResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
