// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateVideoProcessingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVideoProcessingResponseBody body;

    public static CreateVideoProcessingResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVideoProcessingResponse self = new CreateVideoProcessingResponse();
        return TeaModel.build(map, self);
    }

    public CreateVideoProcessingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVideoProcessingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVideoProcessingResponse setBody(CreateVideoProcessingResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVideoProcessingResponseBody getBody() {
        return this.body;
    }

}
