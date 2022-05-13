// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeSecurityEventOperationsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeSecurityEventOperationsResponseBody body;

    public static DescribeSecurityEventOperationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSecurityEventOperationsResponse self = new DescribeSecurityEventOperationsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSecurityEventOperationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSecurityEventOperationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSecurityEventOperationsResponse setBody(DescribeSecurityEventOperationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSecurityEventOperationsResponseBody getBody() {
        return this.body;
    }

}
