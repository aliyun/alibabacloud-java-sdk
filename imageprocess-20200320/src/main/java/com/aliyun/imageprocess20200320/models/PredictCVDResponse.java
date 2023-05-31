// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class PredictCVDResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PredictCVDResponseBody body;

    public static PredictCVDResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictCVDResponse self = new PredictCVDResponse();
        return TeaModel.build(map, self);
    }

    public PredictCVDResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictCVDResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictCVDResponse setBody(PredictCVDResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictCVDResponseBody getBody() {
        return this.body;
    }

}
