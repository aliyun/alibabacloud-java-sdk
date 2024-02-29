// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class AddCartoonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCartoonResponseBody body;

    public static AddCartoonResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCartoonResponse self = new AddCartoonResponse();
        return TeaModel.build(map, self);
    }

    public AddCartoonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCartoonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCartoonResponse setBody(AddCartoonResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCartoonResponseBody getBody() {
        return this.body;
    }

}
