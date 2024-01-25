// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstancePacketsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstancePacketsResponseBody body;

    public static DescribeInstancePacketsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePacketsResponse self = new DescribeInstancePacketsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePacketsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstancePacketsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstancePacketsResponse setBody(DescribeInstancePacketsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstancePacketsResponseBody getBody() {
        return this.body;
    }

}
