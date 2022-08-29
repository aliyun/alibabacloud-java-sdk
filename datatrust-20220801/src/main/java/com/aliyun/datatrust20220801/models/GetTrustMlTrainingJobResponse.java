// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustMlTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetTrustMlTrainingJobResponseBody body;

    public static GetTrustMlTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTrustMlTrainingJobResponse self = new GetTrustMlTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public GetTrustMlTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTrustMlTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTrustMlTrainingJobResponse setBody(GetTrustMlTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTrustMlTrainingJobResponseBody getBody() {
        return this.body;
    }

}
