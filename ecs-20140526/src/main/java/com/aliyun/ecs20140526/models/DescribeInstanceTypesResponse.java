// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceTypesResponseBody body;

    public static DescribeInstanceTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypesResponse self = new DescribeInstanceTypesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTypesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceTypesResponse setBody(DescribeInstanceTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTypesResponseBody getBody() {
        return this.body;
    }

}
