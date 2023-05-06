// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class ListAppTagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAppTagesResponseBody body;

    public static ListAppTagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAppTagesResponse self = new ListAppTagesResponse();
        return TeaModel.build(map, self);
    }

    public ListAppTagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAppTagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAppTagesResponse setBody(ListAppTagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAppTagesResponseBody getBody() {
        return this.body;
    }

}
