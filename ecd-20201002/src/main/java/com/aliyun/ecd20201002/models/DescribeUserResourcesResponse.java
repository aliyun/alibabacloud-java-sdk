// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class DescribeUserResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserResourcesResponseBody body;

    public static DescribeUserResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserResourcesResponse self = new DescribeUserResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserResourcesResponse setBody(DescribeUserResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserResourcesResponseBody getBody() {
        return this.body;
    }

}
