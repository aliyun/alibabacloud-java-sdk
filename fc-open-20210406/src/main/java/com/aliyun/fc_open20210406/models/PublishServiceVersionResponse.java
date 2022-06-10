// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PublishServiceVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PublishServiceVersionResponseBody body;

    public static PublishServiceVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishServiceVersionResponse self = new PublishServiceVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishServiceVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishServiceVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishServiceVersionResponse setBody(PublishServiceVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PublishServiceVersionResponseBody getBody() {
        return this.body;
    }

}
