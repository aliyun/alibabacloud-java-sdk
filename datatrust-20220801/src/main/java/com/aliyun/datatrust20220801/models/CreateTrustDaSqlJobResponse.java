// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustDaSqlJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrustDaSqlJobResponseBody body;

    public static CreateTrustDaSqlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustDaSqlJobResponse self = new CreateTrustDaSqlJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrustDaSqlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrustDaSqlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrustDaSqlJobResponse setBody(CreateTrustDaSqlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrustDaSqlJobResponseBody getBody() {
        return this.body;
    }

}
