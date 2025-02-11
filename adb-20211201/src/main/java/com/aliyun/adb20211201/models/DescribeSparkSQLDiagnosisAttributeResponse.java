// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkSQLDiagnosisAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSparkSQLDiagnosisAttributeResponseBody body;

    public static DescribeSparkSQLDiagnosisAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkSQLDiagnosisAttributeResponse self = new DescribeSparkSQLDiagnosisAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSparkSQLDiagnosisAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSparkSQLDiagnosisAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSparkSQLDiagnosisAttributeResponse setBody(DescribeSparkSQLDiagnosisAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSparkSQLDiagnosisAttributeResponseBody getBody() {
        return this.body;
    }

}
