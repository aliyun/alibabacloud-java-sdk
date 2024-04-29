// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeTagResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeTagResourcesResponseBody body;

    public static DescribeTagResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagResourcesResponse self = new DescribeTagResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTagResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTagResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTagResourcesResponse setBody(DescribeTagResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTagResourcesResponseBody getBody() {
        return this.body;
    }

}
