// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeInviterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInviterResponseBody body;

    public static DescribeInviterResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInviterResponse self = new DescribeInviterResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInviterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInviterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInviterResponse setBody(DescribeInviterResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInviterResponseBody getBody() {
        return this.body;
    }

}
