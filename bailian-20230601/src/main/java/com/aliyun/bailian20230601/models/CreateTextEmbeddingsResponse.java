// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateTextEmbeddingsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTextEmbeddingsResponseBody body;

    public static CreateTextEmbeddingsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTextEmbeddingsResponse self = new CreateTextEmbeddingsResponse();
        return TeaModel.build(map, self);
    }

    public CreateTextEmbeddingsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTextEmbeddingsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTextEmbeddingsResponse setBody(CreateTextEmbeddingsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTextEmbeddingsResponseBody getBody() {
        return this.body;
    }

}
