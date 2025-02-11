// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkSQLDiagnosisListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSparkSQLDiagnosisListResponseBody body;

    public static DescribeSparkSQLDiagnosisListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkSQLDiagnosisListResponse self = new DescribeSparkSQLDiagnosisListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSparkSQLDiagnosisListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSparkSQLDiagnosisListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSparkSQLDiagnosisListResponse setBody(DescribeSparkSQLDiagnosisListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSparkSQLDiagnosisListResponseBody getBody() {
        return this.body;
    }

}
