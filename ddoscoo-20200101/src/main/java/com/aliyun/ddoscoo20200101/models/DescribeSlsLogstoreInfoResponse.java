// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeSlsLogstoreInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSlsLogstoreInfoResponseBody body;

    public static DescribeSlsLogstoreInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSlsLogstoreInfoResponse self = new DescribeSlsLogstoreInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSlsLogstoreInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSlsLogstoreInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSlsLogstoreInfoResponse setBody(DescribeSlsLogstoreInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSlsLogstoreInfoResponseBody getBody() {
        return this.body;
    }

}
