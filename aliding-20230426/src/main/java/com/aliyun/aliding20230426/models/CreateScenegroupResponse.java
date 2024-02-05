// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateScenegroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScenegroupResponseBody body;

    public static CreateScenegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScenegroupResponse self = new CreateScenegroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateScenegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScenegroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScenegroupResponse setBody(CreateScenegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScenegroupResponseBody getBody() {
        return this.body;
    }

}
