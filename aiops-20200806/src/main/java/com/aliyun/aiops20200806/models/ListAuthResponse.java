// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAuthResponseBody body;

    public static ListAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthResponse self = new ListAuthResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthResponse setBody(ListAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthResponseBody getBody() {
        return this.body;
    }

}
