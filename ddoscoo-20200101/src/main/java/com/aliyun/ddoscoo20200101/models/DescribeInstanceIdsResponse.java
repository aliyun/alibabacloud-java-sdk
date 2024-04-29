// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeInstanceIdsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceIdsResponseBody body;

    public static DescribeInstanceIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceIdsResponse self = new DescribeInstanceIdsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceIdsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceIdsResponse setBody(DescribeInstanceIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceIdsResponseBody getBody() {
        return this.body;
    }

}
