// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListRoomsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListRoomsResponseBody body;

    public static ListRoomsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoomsResponse self = new ListRoomsResponse();
        return TeaModel.build(map, self);
    }

    public ListRoomsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRoomsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRoomsResponse setBody(ListRoomsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRoomsResponseBody getBody() {
        return this.body;
    }

}
