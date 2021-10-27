// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateLiveRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLiveRoomResponseBody body;

    public static UpdateLiveRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveRoomResponse self = new UpdateLiveRoomResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveRoomResponse setBody(UpdateLiveRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveRoomResponseBody getBody() {
        return this.body;
    }

}
