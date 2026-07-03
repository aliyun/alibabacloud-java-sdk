// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateAiModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAiModelProviderResponseBody body;

    public static CreateAiModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAiModelProviderResponse self = new CreateAiModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateAiModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAiModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAiModelProviderResponse setBody(CreateAiModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAiModelProviderResponseBody getBody() {
        return this.body;
    }

}
