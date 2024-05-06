// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterModelResponseBody body;

    public static DescribeClusterModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterModelResponse self = new DescribeClusterModelResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterModelResponse setBody(DescribeClusterModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterModelResponseBody getBody() {
        return this.body;
    }

}
