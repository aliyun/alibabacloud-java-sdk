// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeUserLogserviceStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUserLogserviceStatusResponseBody body;

    public static DescribeUserLogserviceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserLogserviceStatusResponse self = new DescribeUserLogserviceStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUserLogserviceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUserLogserviceStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUserLogserviceStatusResponse setBody(DescribeUserLogserviceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUserLogserviceStatusResponseBody getBody() {
        return this.body;
    }

}
