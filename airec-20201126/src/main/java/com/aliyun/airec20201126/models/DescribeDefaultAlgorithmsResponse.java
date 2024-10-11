// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeDefaultAlgorithmsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDefaultAlgorithmsResponseBody body;

    public static DescribeDefaultAlgorithmsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDefaultAlgorithmsResponse self = new DescribeDefaultAlgorithmsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDefaultAlgorithmsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDefaultAlgorithmsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDefaultAlgorithmsResponse setBody(DescribeDefaultAlgorithmsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDefaultAlgorithmsResponseBody getBody() {
        return this.body;
    }

}
