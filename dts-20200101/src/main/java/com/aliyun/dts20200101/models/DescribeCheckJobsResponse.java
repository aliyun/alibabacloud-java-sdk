// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeCheckJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCheckJobsResponseBody body;

    public static DescribeCheckJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckJobsResponse self = new DescribeCheckJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCheckJobsResponse setBody(DescribeCheckJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckJobsResponseBody getBody() {
        return this.body;
    }

}
