// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class GetModelAsyncPredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetModelAsyncPredictResponseBody body;

    public static GetModelAsyncPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        GetModelAsyncPredictResponse self = new GetModelAsyncPredictResponse();
        return TeaModel.build(map, self);
    }

    public GetModelAsyncPredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetModelAsyncPredictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetModelAsyncPredictResponse setBody(GetModelAsyncPredictResponseBody body) {
        this.body = body;
        return this;
    }
    public GetModelAsyncPredictResponseBody getBody() {
        return this.body;
    }

}
