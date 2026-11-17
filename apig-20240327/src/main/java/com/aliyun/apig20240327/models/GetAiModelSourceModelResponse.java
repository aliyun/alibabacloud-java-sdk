// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetAiModelSourceModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiModelSourceModelResponseBody body;

    public static GetAiModelSourceModelResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiModelSourceModelResponse self = new GetAiModelSourceModelResponse();
        return TeaModel.build(map, self);
    }

    public GetAiModelSourceModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiModelSourceModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiModelSourceModelResponse setBody(GetAiModelSourceModelResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiModelSourceModelResponseBody getBody() {
        return this.body;
    }

}
