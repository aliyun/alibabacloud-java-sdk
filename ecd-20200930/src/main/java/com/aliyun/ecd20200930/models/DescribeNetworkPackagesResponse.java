// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeNetworkPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNetworkPackagesResponseBody body;

    public static DescribeNetworkPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkPackagesResponse self = new DescribeNetworkPackagesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNetworkPackagesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNetworkPackagesResponse setBody(DescribeNetworkPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNetworkPackagesResponseBody getBody() {
        return this.body;
    }

}
