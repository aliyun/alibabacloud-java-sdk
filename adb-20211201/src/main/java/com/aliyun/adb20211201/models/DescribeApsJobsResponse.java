// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeApsJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeApsJobsResponseBody body;

    public static DescribeApsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApsJobsResponse self = new DescribeApsJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApsJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApsJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeApsJobsResponse setBody(DescribeApsJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApsJobsResponseBody getBody() {
        return this.body;
    }

}
