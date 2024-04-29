// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeWebAccessLogStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeWebAccessLogStatusResponseBody body;

    public static DescribeWebAccessLogStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWebAccessLogStatusResponse self = new DescribeWebAccessLogStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWebAccessLogStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWebAccessLogStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeWebAccessLogStatusResponse setBody(DescribeWebAccessLogStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWebAccessLogStatusResponseBody getBody() {
        return this.body;
    }

}
