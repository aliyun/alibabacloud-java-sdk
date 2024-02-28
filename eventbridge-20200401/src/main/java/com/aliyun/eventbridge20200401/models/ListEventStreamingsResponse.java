// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class ListEventStreamingsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventStreamingsResponseBody body;

    public static ListEventStreamingsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventStreamingsResponse self = new ListEventStreamingsResponse();
        return TeaModel.build(map, self);
    }

    public ListEventStreamingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventStreamingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventStreamingsResponse setBody(ListEventStreamingsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventStreamingsResponseBody getBody() {
        return this.body;
    }

}
