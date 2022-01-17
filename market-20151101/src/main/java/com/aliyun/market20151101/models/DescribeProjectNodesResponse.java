// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeProjectNodesResponseBody body;

    public static DescribeProjectNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectNodesResponse self = new DescribeProjectNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeProjectNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeProjectNodesResponse setBody(DescribeProjectNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectNodesResponseBody getBody() {
        return this.body;
    }

}
