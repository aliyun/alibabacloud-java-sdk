// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetWaitingRoomConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetWaitingRoomConfigResponseBody body;

    public static SetWaitingRoomConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetWaitingRoomConfigResponse self = new SetWaitingRoomConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetWaitingRoomConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetWaitingRoomConfigResponse setBody(SetWaitingRoomConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetWaitingRoomConfigResponseBody getBody() {
        return this.body;
    }

}
