// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListCalendarsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCalendarsResponseBody body;

    public static ListCalendarsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarsResponse self = new ListCalendarsResponse();
        return TeaModel.build(map, self);
    }

    public ListCalendarsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCalendarsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCalendarsResponse setBody(ListCalendarsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCalendarsResponseBody getBody() {
        return this.body;
    }

}
