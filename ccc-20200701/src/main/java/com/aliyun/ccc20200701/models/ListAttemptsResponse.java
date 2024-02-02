// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAttemptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAttemptsResponseBody body;

    public static ListAttemptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAttemptsResponse self = new ListAttemptsResponse();
        return TeaModel.build(map, self);
    }

    public ListAttemptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAttemptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAttemptsResponse setBody(ListAttemptsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAttemptsResponseBody getBody() {
        return this.body;
    }

}
