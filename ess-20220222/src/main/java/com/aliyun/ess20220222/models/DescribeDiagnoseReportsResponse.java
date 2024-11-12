// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnoseReportsResponseBody body;

    public static DescribeDiagnoseReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseReportsResponse self = new DescribeDiagnoseReportsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnoseReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnoseReportsResponse setBody(DescribeDiagnoseReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnoseReportsResponseBody getBody() {
        return this.body;
    }

}
