// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineActiveProcessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeEdgeMachineActiveProcessResponseBody body;

    public static DescribeEdgeMachineActiveProcessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachineActiveProcessResponse self = new DescribeEdgeMachineActiveProcessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachineActiveProcessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdgeMachineActiveProcessResponse setBody(DescribeEdgeMachineActiveProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeMachineActiveProcessResponseBody getBody() {
        return this.body;
    }

}
