// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class DescribeDiagnosticResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnosticResultResponseBody body;

    public static DescribeDiagnosticResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosticResultResponse self = new DescribeDiagnosticResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosticResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnosticResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnosticResultResponse setBody(DescribeDiagnosticResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnosticResultResponseBody getBody() {
        return this.body;
    }

}
