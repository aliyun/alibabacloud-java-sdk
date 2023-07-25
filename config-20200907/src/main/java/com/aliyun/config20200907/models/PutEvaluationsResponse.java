// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class PutEvaluationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PutEvaluationsResponseBody body;

    public static PutEvaluationsResponse build(java.util.Map<String, ?> map) throws Exception {
        PutEvaluationsResponse self = new PutEvaluationsResponse();
        return TeaModel.build(map, self);
    }

    public PutEvaluationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutEvaluationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutEvaluationsResponse setBody(PutEvaluationsResponseBody body) {
        this.body = body;
        return this;
    }
    public PutEvaluationsResponseBody getBody() {
        return this.body;
    }

}
