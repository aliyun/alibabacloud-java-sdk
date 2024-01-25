// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeServiceInstanceDiagnosisResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeServiceInstanceDiagnosisResponseBody body;

    public static DescribeServiceInstanceDiagnosisResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceInstanceDiagnosisResponse self = new DescribeServiceInstanceDiagnosisResponse();
        return TeaModel.build(map, self);
    }

    public DescribeServiceInstanceDiagnosisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeServiceInstanceDiagnosisResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeServiceInstanceDiagnosisResponse setBody(DescribeServiceInstanceDiagnosisResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeServiceInstanceDiagnosisResponseBody getBody() {
        return this.body;
    }

}
