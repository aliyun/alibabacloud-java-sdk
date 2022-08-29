// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListPrivateDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrivateDatasResponseBody body;

    public static ListPrivateDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateDatasResponse self = new ListPrivateDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateDatasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateDatasResponse setBody(ListPrivateDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateDatasResponseBody getBody() {
        return this.body;
    }

}
