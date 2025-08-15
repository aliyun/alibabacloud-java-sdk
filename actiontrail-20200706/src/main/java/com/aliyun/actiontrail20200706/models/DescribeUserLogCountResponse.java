// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class DescribeUserLogCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserLogCountResponseBody body;

    public static DescribeUserLogCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogCountResponse self = new DescribeUserLogCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserLogCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserLogCountResponse setBody(DescribeUserLogCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserLogCountResponseBody getBody() {
        return this.body;
    }

}
