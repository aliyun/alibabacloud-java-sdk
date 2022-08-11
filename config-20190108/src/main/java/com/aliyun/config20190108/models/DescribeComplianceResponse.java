// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class DescribeComplianceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeComplianceResponseBody body;

    public static DescribeComplianceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComplianceResponse self = new DescribeComplianceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComplianceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComplianceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComplianceResponse setBody(DescribeComplianceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComplianceResponseBody getBody() {
        return this.body;
    }

}
