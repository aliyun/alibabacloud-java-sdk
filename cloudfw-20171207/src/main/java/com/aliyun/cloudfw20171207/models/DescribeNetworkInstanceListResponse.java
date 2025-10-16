// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNetworkInstanceListResponseBody body;

    public static DescribeNetworkInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInstanceListResponse self = new DescribeNetworkInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkInstanceListResponse setBody(DescribeNetworkInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkInstanceListResponseBody getBody() {
        return this.body;
    }

}
