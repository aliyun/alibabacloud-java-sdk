// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustMlPredictionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrustMlPredictionJobResponseBody body;

    public static CreateTrustMlPredictionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustMlPredictionJobResponse self = new CreateTrustMlPredictionJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrustMlPredictionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrustMlPredictionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrustMlPredictionJobResponse setBody(CreateTrustMlPredictionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrustMlPredictionJobResponseBody getBody() {
        return this.body;
    }

}
