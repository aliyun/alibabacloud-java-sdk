// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeBlockedRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBlockedRegionsResponseBody body;

    public static DescribeBlockedRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockedRegionsResponse self = new DescribeBlockedRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBlockedRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBlockedRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBlockedRegionsResponse setBody(DescribeBlockedRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBlockedRegionsResponseBody getBody() {
        return this.body;
    }

}
