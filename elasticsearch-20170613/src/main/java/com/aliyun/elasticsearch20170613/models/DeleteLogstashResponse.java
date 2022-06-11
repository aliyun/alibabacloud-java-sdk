// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteLogstashResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLogstashResponseBody body;

    public static DeleteLogstashResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogstashResponse self = new DeleteLogstashResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLogstashResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLogstashResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLogstashResponse setBody(DeleteLogstashResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLogstashResponseBody getBody() {
        return this.body;
    }

}
