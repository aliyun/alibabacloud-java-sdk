// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetModelingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelingResponseBody body;

    public static GetModelingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelingResponse self = new GetModelingResponse();
        return TeaModel.build(map, self);
    }

    public GetModelingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelingResponse setBody(GetModelingResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelingResponseBody getBody() {
        return this.body;
    }

}
