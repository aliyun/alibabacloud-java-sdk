// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeViewJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeViewJobsResponseBody body;

    public static DescribeViewJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeViewJobsResponse self = new DescribeViewJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeViewJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeViewJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeViewJobsResponse setBody(DescribeViewJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeViewJobsResponseBody getBody() {
        return this.body;
    }

}
