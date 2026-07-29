// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeNetworkLayerInterceptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkLayerInterceptsResponseBody body;

    public static DescribeNetworkLayerInterceptsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkLayerInterceptsResponse self = new DescribeNetworkLayerInterceptsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkLayerInterceptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkLayerInterceptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkLayerInterceptsResponse setBody(DescribeNetworkLayerInterceptsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkLayerInterceptsResponseBody getBody() {
        return this.body;
    }

}
