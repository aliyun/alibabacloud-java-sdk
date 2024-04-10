// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTerminalSessionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTerminalSessionsResponseBody body;

    public static DescribeTerminalSessionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTerminalSessionsResponse self = new DescribeTerminalSessionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTerminalSessionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTerminalSessionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTerminalSessionsResponse setBody(DescribeTerminalSessionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTerminalSessionsResponseBody getBody() {
        return this.body;
    }

}
