// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetAiModelCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiModelCardResponseBody body;

    public static GetAiModelCardResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiModelCardResponse self = new GetAiModelCardResponse();
        return TeaModel.build(map, self);
    }

    public GetAiModelCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiModelCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiModelCardResponse setBody(GetAiModelCardResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiModelCardResponseBody getBody() {
        return this.body;
    }

}
