// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DescribeInstanceConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceConfigsResponseBody body;

    public static DescribeInstanceConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceConfigsResponse self = new DescribeInstanceConfigsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceConfigsResponse setBody(DescribeInstanceConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceConfigsResponseBody getBody() {
        return this.body;
    }

}
