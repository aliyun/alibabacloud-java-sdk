// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeNamespacesWithCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNamespacesWithCreateResponseBody body;

    public static DescribeNamespacesWithCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNamespacesWithCreateResponse self = new DescribeNamespacesWithCreateResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNamespacesWithCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNamespacesWithCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNamespacesWithCreateResponse setBody(DescribeNamespacesWithCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNamespacesWithCreateResponseBody getBody() {
        return this.body;
    }

}
