// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class DescribeFilteringAlgorithmResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeFilteringAlgorithmResponseBody body;

    public static DescribeFilteringAlgorithmResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeFilteringAlgorithmResponse self = new DescribeFilteringAlgorithmResponse();
        return TeaModel.build(map, self);
    }

    public DescribeFilteringAlgorithmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeFilteringAlgorithmResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeFilteringAlgorithmResponse setBody(DescribeFilteringAlgorithmResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeFilteringAlgorithmResponseBody getBody() {
        return this.body;
    }

}
