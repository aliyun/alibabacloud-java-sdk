// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DescribeRouteConflictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeRouteConflictResponse setBody(DescribeRouteConflictResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRouteConflictResponseBody getBody() {
        return this.body;
    }

}
