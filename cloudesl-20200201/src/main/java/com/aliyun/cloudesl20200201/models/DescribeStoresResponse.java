// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoresResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStoresResponseBody body;

    public static DescribeStoresResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoresResponse self = new DescribeStoresResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoresResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStoresResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStoresResponse setBody(DescribeStoresResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStoresResponseBody getBody() {
        return this.body;
    }

}
