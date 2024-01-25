// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListEventResponseBody body;

    public static ListEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEventResponse self = new ListEventResponse();
        return TeaModel.build(map, self);
    }

    public ListEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListEventResponse setBody(ListEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEventResponseBody getBody() {
        return this.body;
    }

}
