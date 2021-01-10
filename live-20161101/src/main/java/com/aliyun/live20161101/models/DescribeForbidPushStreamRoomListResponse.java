// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeForbidPushStreamRoomListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeForbidPushStreamRoomListResponseBody body;

    public static DescribeForbidPushStreamRoomListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeForbidPushStreamRoomListResponse self = new DescribeForbidPushStreamRoomListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeForbidPushStreamRoomListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeForbidPushStreamRoomListResponse setBody(DescribeForbidPushStreamRoomListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeForbidPushStreamRoomListResponseBody getBody() {
        return this.body;
    }

}
