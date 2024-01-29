// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateUploadStreamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUploadStreamResponseBody body;

    public static CreateUploadStreamResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUploadStreamResponse self = new CreateUploadStreamResponse();
        return TeaModel.build(map, self);
    }

    public CreateUploadStreamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUploadStreamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUploadStreamResponse setBody(CreateUploadStreamResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUploadStreamResponseBody getBody() {
        return this.body;
    }

}
