// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListEventsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventsResponseBody body;

    public static ListEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventsResponse self = new ListEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventsResponse setBody(ListEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventsResponseBody getBody() {
        return this.body;
    }

}
