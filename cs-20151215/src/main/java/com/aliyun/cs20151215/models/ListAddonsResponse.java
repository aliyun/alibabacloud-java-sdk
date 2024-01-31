// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ListAddonsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAddonsResponseBody body;

    public static ListAddonsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAddonsResponse self = new ListAddonsResponse();
        return TeaModel.build(map, self);
    }

    public ListAddonsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAddonsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAddonsResponse setBody(ListAddonsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAddonsResponseBody getBody() {
        return this.body;
    }

}
