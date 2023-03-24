// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPrivateAccessPolicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPrivateAccessPolicesResponseBody body;

    public static ListPrivateAccessPolicesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateAccessPolicesResponse self = new ListPrivateAccessPolicesResponse();
        return TeaModel.build(map, self);
    }

    public ListPrivateAccessPolicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPrivateAccessPolicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPrivateAccessPolicesResponse setBody(ListPrivateAccessPolicesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPrivateAccessPolicesResponseBody getBody() {
        return this.body;
    }

}
