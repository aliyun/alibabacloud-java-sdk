// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListEventsViewResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListEventsViewResponseBody body;

    public static ListEventsViewResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventsViewResponse self = new ListEventsViewResponse();
        return TeaModel.build(map, self);
    }

    public ListEventsViewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventsViewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventsViewResponse setBody(ListEventsViewResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventsViewResponseBody getBody() {
        return this.body;
    }

}
