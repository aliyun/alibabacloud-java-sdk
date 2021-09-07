// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetStandardRoomJumpUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetStandardRoomJumpUrlResponseBody body;

    public static GetStandardRoomJumpUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStandardRoomJumpUrlResponse self = new GetStandardRoomJumpUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetStandardRoomJumpUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStandardRoomJumpUrlResponse setBody(GetStandardRoomJumpUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStandardRoomJumpUrlResponseBody getBody() {
        return this.body;
    }

}
