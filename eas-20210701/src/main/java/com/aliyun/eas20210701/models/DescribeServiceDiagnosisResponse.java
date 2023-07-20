// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeServiceDiagnosisResponseBody body;

    public static DescribeServiceDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceDiagnosisResponse self = new DescribeServiceDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceDiagnosisResponse setBody(DescribeServiceDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceDiagnosisResponseBody getBody() {
        return this.body;
    }

}
