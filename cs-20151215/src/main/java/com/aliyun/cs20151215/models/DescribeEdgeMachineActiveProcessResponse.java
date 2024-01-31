// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineActiveProcessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeEdgeMachineActiveProcessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEdgeMachineActiveProcessResponse setBody(DescribeEdgeMachineActiveProcessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeMachineActiveProcessResponseBody getBody() {
        return this.body;
    }

}
