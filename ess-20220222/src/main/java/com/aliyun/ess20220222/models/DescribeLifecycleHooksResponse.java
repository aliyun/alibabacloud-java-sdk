// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLifecycleHooksResponseBody body;

    public static DescribeLifecycleHooksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleHooksResponse self = new DescribeLifecycleHooksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleHooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLifecycleHooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLifecycleHooksResponse setBody(DescribeLifecycleHooksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLifecycleHooksResponseBody getBody() {
        return this.body;
    }

}
