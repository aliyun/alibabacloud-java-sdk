// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeLogStoreInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogStoreInfoResponseBody body;

    public static DescribeLogStoreInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreInfoResponse self = new DescribeLogStoreInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogStoreInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogStoreInfoResponse setBody(DescribeLogStoreInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogStoreInfoResponseBody getBody() {
        return this.body;
    }

}
