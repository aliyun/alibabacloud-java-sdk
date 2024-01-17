// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetGeneratedContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGeneratedContentResponseBody body;

    public static GetGeneratedContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGeneratedContentResponse self = new GetGeneratedContentResponse();
        return TeaModel.build(map, self);
    }

    public GetGeneratedContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGeneratedContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGeneratedContentResponse setBody(GetGeneratedContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGeneratedContentResponseBody getBody() {
        return this.body;
    }

}
