// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetAiModelProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiModelProviderResponseBody body;

    public static GetAiModelProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiModelProviderResponse self = new GetAiModelProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetAiModelProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiModelProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiModelProviderResponse setBody(GetAiModelProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiModelProviderResponseBody getBody() {
        return this.body;
    }

}
