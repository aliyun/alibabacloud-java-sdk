// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class DescribeClusterAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeClusterAttributeResponseBody body;

    public static DescribeClusterAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterAttributeResponse self = new DescribeClusterAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterAttributeResponse setBody(DescribeClusterAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeClusterAttributeResponseBody getBody() {
        return this.body;
    }

}
