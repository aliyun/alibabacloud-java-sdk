// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeEdgeMachineModelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeEdgeMachineModelsResponse setBody(DescribeEdgeMachineModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEdgeMachineModelsResponseBody getBody() {
        return this.body;
    }

}
