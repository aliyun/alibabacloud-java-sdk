// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListWaitingRoomsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWaitingRoomsResponseBody body;

    public static ListWaitingRoomsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingRoomsResponse self = new ListWaitingRoomsResponse();
        return TeaModel.build(map, self);
    }

    public ListWaitingRoomsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWaitingRoomsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWaitingRoomsResponse setBody(ListWaitingRoomsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWaitingRoomsResponseBody getBody() {
        return this.body;
    }

}
