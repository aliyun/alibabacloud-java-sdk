// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeRestoreOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRestoreOrderResponseBody body;

    public static DescribeRestoreOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreOrderResponse self = new DescribeRestoreOrderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRestoreOrderResponse setBody(DescribeRestoreOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreOrderResponseBody getBody() {
        return this.body;
    }

}
