// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeRouteTablesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRouteTablesResponseBody body;

    public static DescribeRouteTablesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteTablesResponse self = new DescribeRouteTablesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteTablesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouteTablesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRouteTablesResponse setBody(DescribeRouteTablesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouteTablesResponseBody getBody() {
        return this.body;
    }

}
