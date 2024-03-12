// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListIntervenesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIntervenesResponseBody body;

    public static ListIntervenesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIntervenesResponse self = new ListIntervenesResponse();
        return TeaModel.build(map, self);
    }

    public ListIntervenesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIntervenesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIntervenesResponse setBody(ListIntervenesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIntervenesResponseBody getBody() {
        return this.body;
    }

}
