// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class StopLiveRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopLiveRoomResponseBody body;

    public static StopLiveRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveRoomResponse self = new StopLiveRoomResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLiveRoomResponse setBody(StopLiveRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLiveRoomResponseBody getBody() {
        return this.body;
    }

}
