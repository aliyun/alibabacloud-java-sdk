// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListVariableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListVariableResponseBody body;

    public static ListVariableResponse build(java.util.Map<String, ?> map) throws Exception {
        ListVariableResponse self = new ListVariableResponse();
        return TeaModel.build(map, self);
    }

    public ListVariableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListVariableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListVariableResponse setBody(ListVariableResponseBody body) {
        this.body = body;
        return this;
    }
    public ListVariableResponseBody getBody() {
        return this.body;
    }

}
