// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEdgeMachineModelsResponseBody body;

    public static DescribeEdgeMachineModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMachineModelsResponse self = new DescribeEdgeMachineModelsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMachineModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEdgeMachineModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEdgeMachineModelsResponse setBody(DescribeEdgeMachineModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeMachineModelsResponseBody getBody() {
        return this.body;
    }

}
