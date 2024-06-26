// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeExplorerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExplorerResponseBody body;

    public static DescribeExplorerResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExplorerResponse self = new DescribeExplorerResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExplorerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExplorerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExplorerResponse setBody(DescribeExplorerResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExplorerResponseBody getBody() {
        return this.body;
    }

}
