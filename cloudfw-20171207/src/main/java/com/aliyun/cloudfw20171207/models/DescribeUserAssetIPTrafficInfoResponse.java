// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAssetIPTrafficInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserAssetIPTrafficInfoResponseBody body;

    public static DescribeUserAssetIPTrafficInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAssetIPTrafficInfoResponse self = new DescribeUserAssetIPTrafficInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserAssetIPTrafficInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserAssetIPTrafficInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserAssetIPTrafficInfoResponse setBody(DescribeUserAssetIPTrafficInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserAssetIPTrafficInfoResponseBody getBody() {
        return this.body;
    }

}
