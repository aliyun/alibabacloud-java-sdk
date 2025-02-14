// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddAdInsertionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAdInsertionResponseBody body;

    public static AddAdInsertionResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAdInsertionResponse self = new AddAdInsertionResponse();
        return TeaModel.build(map, self);
    }

    public AddAdInsertionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAdInsertionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAdInsertionResponse setBody(AddAdInsertionResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAdInsertionResponseBody getBody() {
        return this.body;
    }

}
