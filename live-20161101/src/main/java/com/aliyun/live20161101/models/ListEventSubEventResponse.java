// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListEventSubEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventSubEventResponseBody body;

    public static ListEventSubEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventSubEventResponse self = new ListEventSubEventResponse();
        return TeaModel.build(map, self);
    }

    public ListEventSubEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventSubEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventSubEventResponse setBody(ListEventSubEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventSubEventResponseBody getBody() {
        return this.body;
    }

}
