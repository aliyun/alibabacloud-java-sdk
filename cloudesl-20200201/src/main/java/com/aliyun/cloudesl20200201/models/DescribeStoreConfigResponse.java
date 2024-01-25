// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class DescribeStoreConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeStoreConfigResponseBody body;

    public static DescribeStoreConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeStoreConfigResponse self = new DescribeStoreConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeStoreConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeStoreConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeStoreConfigResponse setBody(DescribeStoreConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeStoreConfigResponseBody getBody() {
        return this.body;
    }

}
