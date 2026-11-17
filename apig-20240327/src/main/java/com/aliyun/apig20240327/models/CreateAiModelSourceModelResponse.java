// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelSourceModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAiModelSourceModelResponseBody body;

    public static CreateAiModelSourceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelSourceModelResponse self = new CreateAiModelSourceModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiModelSourceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiModelSourceModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAiModelSourceModelResponse setBody(CreateAiModelSourceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiModelSourceModelResponseBody getBody() {
        return this.body;
    }

}
