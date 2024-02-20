// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTagResponseBody body;

    public static CreateTagResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagResponse self = new CreateTagResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTagResponse setBody(CreateTagResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagResponseBody getBody() {
        return this.body;
    }

}
