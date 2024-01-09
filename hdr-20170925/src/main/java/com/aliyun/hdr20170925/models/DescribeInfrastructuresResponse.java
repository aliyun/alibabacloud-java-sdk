// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeInfrastructuresResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInfrastructuresResponseBody body;

    public static DescribeInfrastructuresResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInfrastructuresResponse self = new DescribeInfrastructuresResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInfrastructuresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInfrastructuresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInfrastructuresResponse setBody(DescribeInfrastructuresResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInfrastructuresResponseBody getBody() {
        return this.body;
    }

}
