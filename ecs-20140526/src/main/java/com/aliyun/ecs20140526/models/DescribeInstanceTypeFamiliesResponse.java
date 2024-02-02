// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTypeFamiliesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceTypeFamiliesResponseBody body;

    public static DescribeInstanceTypeFamiliesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTypeFamiliesResponse self = new DescribeInstanceTypeFamiliesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTypeFamiliesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceTypeFamiliesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceTypeFamiliesResponse setBody(DescribeInstanceTypeFamiliesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceTypeFamiliesResponseBody getBody() {
        return this.body;
    }

}
