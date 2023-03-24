// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListPolicesForPrivateAccessApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListPolicesForPrivateAccessApplicationResponseBody body;

    public static ListPolicesForPrivateAccessApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPolicesForPrivateAccessApplicationResponse self = new ListPolicesForPrivateAccessApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ListPolicesForPrivateAccessApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPolicesForPrivateAccessApplicationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPolicesForPrivateAccessApplicationResponse setBody(ListPolicesForPrivateAccessApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPolicesForPrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

}
