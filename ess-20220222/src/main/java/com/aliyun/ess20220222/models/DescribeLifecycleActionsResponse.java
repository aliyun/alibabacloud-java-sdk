// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLifecycleActionsResponseBody body;

    public static DescribeLifecycleActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleActionsResponse self = new DescribeLifecycleActionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLifecycleActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLifecycleActionsResponse setBody(DescribeLifecycleActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLifecycleActionsResponseBody getBody() {
        return this.body;
    }

}
