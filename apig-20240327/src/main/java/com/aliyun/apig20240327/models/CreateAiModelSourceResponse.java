// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAiModelSourceResponseBody body;

    public static CreateAiModelSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelSourceResponse self = new CreateAiModelSourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiModelSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiModelSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAiModelSourceResponse setBody(CreateAiModelSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiModelSourceResponseBody getBody() {
        return this.body;
    }

}
