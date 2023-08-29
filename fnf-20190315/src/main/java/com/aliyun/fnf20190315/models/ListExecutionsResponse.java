// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ListExecutionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListExecutionsResponseBody body;

    public static ListExecutionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExecutionsResponse self = new ListExecutionsResponse();
        return TeaModel.build(map, self);
    }

    public ListExecutionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExecutionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExecutionsResponse setBody(ListExecutionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExecutionsResponseBody getBody() {
        return this.body;
    }

}
