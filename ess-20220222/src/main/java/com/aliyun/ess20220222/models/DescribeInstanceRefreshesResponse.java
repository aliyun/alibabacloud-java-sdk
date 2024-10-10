// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeInstanceRefreshesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceRefreshesResponseBody body;

    public static DescribeInstanceRefreshesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRefreshesResponse self = new DescribeInstanceRefreshesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRefreshesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceRefreshesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceRefreshesResponse setBody(DescribeInstanceRefreshesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceRefreshesResponseBody getBody() {
        return this.body;
    }

}
