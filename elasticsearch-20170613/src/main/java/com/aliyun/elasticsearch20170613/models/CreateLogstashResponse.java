// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateLogstashResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLogstashResponseBody body;

    public static CreateLogstashResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLogstashResponse self = new CreateLogstashResponse();
        return TeaModel.build(map, self);
    }

    public CreateLogstashResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLogstashResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLogstashResponse setBody(CreateLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLogstashResponseBody getBody() {
        return this.body;
    }

}
