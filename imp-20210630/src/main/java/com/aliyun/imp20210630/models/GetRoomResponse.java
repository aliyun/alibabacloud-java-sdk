// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetRoomResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRoomResponseBody body;

    public static GetRoomResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoomResponse self = new GetRoomResponse();
        return TeaModel.build(map, self);
    }

    public GetRoomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoomResponse setBody(GetRoomResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoomResponseBody getBody() {
        return this.body;
    }

}
