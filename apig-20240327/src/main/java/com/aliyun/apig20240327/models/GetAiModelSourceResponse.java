// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetAiModelSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAiModelSourceResponseBody body;

    public static GetAiModelSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAiModelSourceResponse self = new GetAiModelSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetAiModelSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAiModelSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAiModelSourceResponse setBody(GetAiModelSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAiModelSourceResponseBody getBody() {
        return this.body;
    }

}
