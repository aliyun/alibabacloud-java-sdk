// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateCustomCallTaggingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomCallTaggingResponseBody body;

    public static CreateCustomCallTaggingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomCallTaggingResponse self = new CreateCustomCallTaggingResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomCallTaggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomCallTaggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomCallTaggingResponse setBody(CreateCustomCallTaggingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

}
