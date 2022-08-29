// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class CreateTrustDaPsiJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTrustDaPsiJobResponseBody body;

    public static CreateTrustDaPsiJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTrustDaPsiJobResponse self = new CreateTrustDaPsiJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateTrustDaPsiJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTrustDaPsiJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTrustDaPsiJobResponse setBody(CreateTrustDaPsiJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTrustDaPsiJobResponseBody getBody() {
        return this.body;
    }

}
