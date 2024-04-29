// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeLogStoreExistStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogStoreExistStatusResponseBody body;

    public static DescribeLogStoreExistStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreExistStatusResponse self = new DescribeLogStoreExistStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreExistStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogStoreExistStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogStoreExistStatusResponse setBody(DescribeLogStoreExistStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogStoreExistStatusResponseBody getBody() {
        return this.body;
    }

}
