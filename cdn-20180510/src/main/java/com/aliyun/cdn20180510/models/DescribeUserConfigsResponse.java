// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserConfigsResponseBody body;

    public static DescribeUserConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConfigsResponse self = new DescribeUserConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserConfigsResponse setBody(DescribeUserConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserConfigsResponseBody getBody() {
        return this.body;
    }

}
