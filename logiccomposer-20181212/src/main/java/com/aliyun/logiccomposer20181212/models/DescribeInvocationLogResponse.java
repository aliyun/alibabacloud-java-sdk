// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.logiccomposer20181212.models;

import com.aliyun.tea.*;

public class DescribeInvocationLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeInvocationLogResponseBody body;

    public static DescribeInvocationLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInvocationLogResponse self = new DescribeInvocationLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInvocationLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInvocationLogResponse setBody(DescribeInvocationLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInvocationLogResponseBody getBody() {
        return this.body;
    }

}
