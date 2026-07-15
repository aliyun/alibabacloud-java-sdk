// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAiModelCardResponseBody body;

    public static CreateAiModelCardResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelCardResponse self = new CreateAiModelCardResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiModelCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiModelCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAiModelCardResponse setBody(CreateAiModelCardResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiModelCardResponseBody getBody() {
        return this.body;
    }

}
