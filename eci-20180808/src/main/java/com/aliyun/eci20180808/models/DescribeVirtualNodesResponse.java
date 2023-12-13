// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class DescribeVirtualNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeVirtualNodesResponseBody body;

    public static DescribeVirtualNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualNodesResponse self = new DescribeVirtualNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVirtualNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVirtualNodesResponse setBody(DescribeVirtualNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVirtualNodesResponseBody getBody() {
        return this.body;
    }

}
