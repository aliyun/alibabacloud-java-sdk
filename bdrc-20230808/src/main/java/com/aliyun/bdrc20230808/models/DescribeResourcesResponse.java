// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class DescribeResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResourcesResponseBody body;

    public static DescribeResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcesResponse self = new DescribeResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResourcesResponse setBody(DescribeResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResourcesResponseBody getBody() {
        return this.body;
    }

}
