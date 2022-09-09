// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListAuthorizationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListAuthorizationsResponseBody body;

    public static ListAuthorizationsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizationsResponse self = new ListAuthorizationsResponse();
        return TeaModel.build(map, self);
    }

    public ListAuthorizationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAuthorizationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAuthorizationsResponse setBody(ListAuthorizationsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAuthorizationsResponseBody getBody() {
        return this.body;
    }

}
