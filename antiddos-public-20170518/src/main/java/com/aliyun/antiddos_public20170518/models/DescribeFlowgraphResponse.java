// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeFlowgraphResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeFlowgraphResponseBody body;

    public static DescribeFlowgraphResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowgraphResponse self = new DescribeFlowgraphResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFlowgraphResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFlowgraphResponse setBody(DescribeFlowgraphResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFlowgraphResponseBody getBody() {
        return this.body;
    }

}
