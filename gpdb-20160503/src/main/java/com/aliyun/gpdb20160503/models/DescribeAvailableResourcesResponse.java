// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAvailableResourcesResponseBody body;

    public static DescribeAvailableResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourcesResponse self = new DescribeAvailableResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAvailableResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAvailableResourcesResponse setBody(DescribeAvailableResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAvailableResourcesResponseBody getBody() {
        return this.body;
    }

}
