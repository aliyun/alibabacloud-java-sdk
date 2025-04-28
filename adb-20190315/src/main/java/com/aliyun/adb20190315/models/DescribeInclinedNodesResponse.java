// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeInclinedNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInclinedNodesResponseBody body;

    public static DescribeInclinedNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInclinedNodesResponse self = new DescribeInclinedNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInclinedNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInclinedNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInclinedNodesResponse setBody(DescribeInclinedNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInclinedNodesResponseBody getBody() {
        return this.body;
    }

}
