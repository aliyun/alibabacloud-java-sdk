// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class CreateModelAsyncPredictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateModelAsyncPredictResponseBody body;

    public static CreateModelAsyncPredictResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateModelAsyncPredictResponse self = new CreateModelAsyncPredictResponse();
        return TeaModel.build(map, self);
    }

    public CreateModelAsyncPredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateModelAsyncPredictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateModelAsyncPredictResponse setBody(CreateModelAsyncPredictResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateModelAsyncPredictResponseBody getBody() {
        return this.body;
    }

}
