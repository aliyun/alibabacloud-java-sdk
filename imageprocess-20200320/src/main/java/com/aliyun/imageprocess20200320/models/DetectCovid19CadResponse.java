// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectCovid19CadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DetectCovid19CadResponseBody body;

    public static DetectCovid19CadResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectCovid19CadResponse self = new DetectCovid19CadResponse();
        return TeaModel.build(map, self);
    }

    public DetectCovid19CadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetectCovid19CadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetectCovid19CadResponse setBody(DetectCovid19CadResponseBody body) {
        this.body = body;
        return this;
    }
    public DetectCovid19CadResponseBody getBody() {
        return this.body;
    }

}
