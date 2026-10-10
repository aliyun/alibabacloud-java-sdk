// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListFunctionMetasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFunctionMetasResponseBody body;

    public static ListFunctionMetasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFunctionMetasResponse self = new ListFunctionMetasResponse();
        return TeaModel.build(map, self);
    }

    public ListFunctionMetasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFunctionMetasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFunctionMetasResponse setBody(ListFunctionMetasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFunctionMetasResponseBody getBody() {
        return this.body;
    }

}
