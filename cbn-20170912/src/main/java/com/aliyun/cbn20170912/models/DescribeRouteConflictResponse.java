// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteConflictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRouteConflictResponseBody body;

    public static DescribeRouteConflictResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRouteConflictResponse self = new DescribeRouteConflictResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRouteConflictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRouteConflictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRouteConflictResponse setBody(DescribeRouteConflictResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouteConflictResponseBody getBody() {
        return this.body;
    }

}
