// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeLifecycleHooksResponse setBody(DescribeLifecycleHooksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLifecycleHooksResponseBody getBody() {
        return this.body;
    }

}
