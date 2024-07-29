// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class DescribeProjectNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeProjectNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeProjectNodesResponse setBody(DescribeProjectNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeProjectNodesResponseBody getBody() {
        return this.body;
    }

}
