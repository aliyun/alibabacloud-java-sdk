// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp_room20210515.models;

import com.aliyun.tea.*;

public class GetRoomDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRoomDetailResponseBody body;

    public static GetRoomDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoomDetailResponse self = new GetRoomDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetRoomDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoomDetailResponse setBody(GetRoomDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoomDetailResponseBody getBody() {
        return this.body;
    }

}
