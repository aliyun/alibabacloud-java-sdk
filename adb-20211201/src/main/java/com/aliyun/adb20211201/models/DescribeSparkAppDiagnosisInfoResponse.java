// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkAppDiagnosisInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSparkAppDiagnosisInfoResponseBody body;

    public static DescribeSparkAppDiagnosisInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkAppDiagnosisInfoResponse self = new DescribeSparkAppDiagnosisInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSparkAppDiagnosisInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSparkAppDiagnosisInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSparkAppDiagnosisInfoResponse setBody(DescribeSparkAppDiagnosisInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSparkAppDiagnosisInfoResponseBody getBody() {
        return this.body;
    }

}
