// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachinesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEdgeMachinesResponseBody body;

    public static DescribeEdgeMachinesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachinesResponse self = new DescribeEdgeMachinesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachinesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdgeMachinesResponse setBody(DescribeEdgeMachinesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeMachinesResponseBody getBody() {
        return this.body;
    }

}
