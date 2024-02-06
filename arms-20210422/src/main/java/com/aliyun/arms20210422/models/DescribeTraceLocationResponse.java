// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class DescribeTraceLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTraceLocationResponseBody body;

    public static DescribeTraceLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceLocationResponse self = new DescribeTraceLocationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTraceLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTraceLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTraceLocationResponse setBody(DescribeTraceLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTraceLocationResponseBody getBody() {
        return this.body;
    }

}
