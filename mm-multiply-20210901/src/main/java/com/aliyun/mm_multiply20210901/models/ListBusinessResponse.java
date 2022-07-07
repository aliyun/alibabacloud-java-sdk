// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ListBusinessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListBusinessResponseBody body;

    public static ListBusinessResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessResponse self = new ListBusinessResponse();
        return TeaModel.build(map, self);
    }

    public ListBusinessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBusinessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBusinessResponse setBody(ListBusinessResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBusinessResponseBody getBody() {
        return this.body;
    }

}
