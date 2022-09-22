// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeTransitionVpcsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTransitionVpcsResponseBody body;

    public static DescribeTransitionVpcsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransitionVpcsResponse self = new DescribeTransitionVpcsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransitionVpcsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransitionVpcsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransitionVpcsResponse setBody(DescribeTransitionVpcsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransitionVpcsResponseBody getBody() {
        return this.body;
    }

}
