// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListLiveRoomsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLiveRoomsResponseBody body;

    public static ListLiveRoomsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRoomsResponse self = new ListLiveRoomsResponse();
        return TeaModel.build(map, self);
    }

    public ListLiveRoomsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLiveRoomsResponse setBody(ListLiveRoomsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLiveRoomsResponseBody getBody() {
        return this.body;
    }

}
