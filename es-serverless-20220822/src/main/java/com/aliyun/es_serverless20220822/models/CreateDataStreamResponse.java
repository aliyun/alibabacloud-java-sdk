// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.es_serverless20220822.models;

import com.aliyun.tea.*;

public class CreateDataStreamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDataStreamResponseBody body;

    public static CreateDataStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDataStreamResponse self = new CreateDataStreamResponse();
        return TeaModel.build(map, self);
    }

    public CreateDataStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDataStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDataStreamResponse setBody(CreateDataStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDataStreamResponseBody getBody() {
        return this.body;
    }

}
