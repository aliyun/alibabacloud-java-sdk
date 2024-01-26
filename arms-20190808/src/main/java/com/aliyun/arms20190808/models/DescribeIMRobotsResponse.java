// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeIMRobotsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeIMRobotsResponseBody body;

    public static DescribeIMRobotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIMRobotsResponse self = new DescribeIMRobotsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIMRobotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIMRobotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeIMRobotsResponse setBody(DescribeIMRobotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIMRobotsResponseBody getBody() {
        return this.body;
    }

}
