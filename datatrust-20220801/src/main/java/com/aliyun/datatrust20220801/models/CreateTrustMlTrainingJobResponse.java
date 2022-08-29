// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustMlTrainingJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrustMlTrainingJobResponseBody body;

    public static CreateTrustMlTrainingJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustMlTrainingJobResponse self = new CreateTrustMlTrainingJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrustMlTrainingJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrustMlTrainingJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrustMlTrainingJobResponse setBody(CreateTrustMlTrainingJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrustMlTrainingJobResponseBody getBody() {
        return this.body;
    }

}
