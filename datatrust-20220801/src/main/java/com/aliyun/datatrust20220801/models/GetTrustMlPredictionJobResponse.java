// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustMlPredictionJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrustMlPredictionJobResponseBody body;

    public static GetTrustMlPredictionJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrustMlPredictionJobResponse self = new GetTrustMlPredictionJobResponse();
        return TeaModel.build(map, self);
    }

    public GetTrustMlPredictionJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrustMlPredictionJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrustMlPredictionJobResponse setBody(GetTrustMlPredictionJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrustMlPredictionJobResponseBody getBody() {
        return this.body;
    }

}
