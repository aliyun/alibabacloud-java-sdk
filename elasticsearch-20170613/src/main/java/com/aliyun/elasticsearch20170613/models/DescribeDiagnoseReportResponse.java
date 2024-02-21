// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDiagnoseReportResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDiagnoseReportResponseBody body;

    public static DescribeDiagnoseReportResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnoseReportResponse self = new DescribeDiagnoseReportResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnoseReportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDiagnoseReportResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDiagnoseReportResponse setBody(DescribeDiagnoseReportResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDiagnoseReportResponseBody getBody() {
        return this.body;
    }

}
