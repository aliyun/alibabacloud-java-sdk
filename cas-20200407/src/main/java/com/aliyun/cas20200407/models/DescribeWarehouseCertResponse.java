// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeWarehouseCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWarehouseCertResponseBody body;

    public static DescribeWarehouseCertResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWarehouseCertResponse self = new DescribeWarehouseCertResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWarehouseCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWarehouseCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWarehouseCertResponse setBody(DescribeWarehouseCertResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWarehouseCertResponseBody getBody() {
        return this.body;
    }

}
