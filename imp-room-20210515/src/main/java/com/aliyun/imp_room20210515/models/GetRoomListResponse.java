// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class GetRoomListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRoomListResponseBody body;

    public static GetRoomListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoomListResponse self = new GetRoomListResponse();
        return TeaModel.build(map, self);
    }

    public GetRoomListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoomListResponse setBody(GetRoomListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoomListResponseBody getBody() {
        return this.body;
    }

}
