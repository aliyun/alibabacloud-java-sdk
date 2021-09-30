// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveRoomsByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveRoomsByIdResponseBody body;

    public static ListLiveRoomsByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRoomsByIdResponse self = new ListLiveRoomsByIdResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRoomsByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRoomsByIdResponse setBody(ListLiveRoomsByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRoomsByIdResponseBody getBody() {
        return this.body;
    }

}
