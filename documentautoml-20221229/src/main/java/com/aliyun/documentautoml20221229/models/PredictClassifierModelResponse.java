// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentautoml20221229.models;

import com.aliyun.tea.*;

public class PredictClassifierModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PredictClassifierModelResponseBody body;

    public static PredictClassifierModelResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictClassifierModelResponse self = new PredictClassifierModelResponse();
        return TeaModel.build(map, self);
    }

    public PredictClassifierModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictClassifierModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictClassifierModelResponse setBody(PredictClassifierModelResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictClassifierModelResponseBody getBody() {
        return this.body;
    }

}
